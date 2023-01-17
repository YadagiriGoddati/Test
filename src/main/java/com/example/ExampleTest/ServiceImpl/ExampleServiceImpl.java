/**
 * 
 */
package com.example.ExampleTest.ServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.ExampleTest.Request.RequestRating;
import com.example.ExampleTest.Response.ResponseVO;
import com.example.ExampleTest.Service.ExampleService;
import com.google.gson.Gson;

/**
 * @author Lenovo
 *
 */
@Service
public class ExampleServiceImpl implements ExampleService{

	Gson gson = new Gson();
	
	@Override
	public ResponseVO postRating(RequestRating requestRating) {
		ResponseVO response = new ResponseVO();
		String str = requestRating.getDummyLabel();
		 //str = str.replace("\\\"", "\"");
		List<RequestRating> list = Arrays.asList(gson.fromJson(str, RequestRating.class));
		
		
		list = list.stream()
        .filter(x -> x != null)        
        .collect(Collectors.toList());
		
		list.add(requestRating);
		
		Map<String, Double> averages = 
				list.stream()
			          .collect(Collectors.groupingBy(RequestRating::getUserName,
			                                         Collectors.averagingDouble(RequestRating::getRatingNumber)));
		response.setDataValue(gson.toJson(requestRating));
		
		response.setResponseCount(gson.toJson(averages));
		
		return  response;
	}

}
