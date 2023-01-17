/**
 * 
 */
package com.example.ExampleTest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExampleTest.Request.RequestRating;
import com.example.ExampleTest.Response.ResponseVO;
import com.example.ExampleTest.Service.ExampleService;


/**
 * @author Lenovo
 *
 */
@RestController
public class ExampleController {
	
	
	@Autowired
	ExampleService exampleService;
	
	@RequestMapping(value = "/postRating", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public 
	ResponseVO postRating(@RequestBody RequestRating requestRating)
			throws ClassNotFoundException {

		ResponseVO resting = exampleService.postRating(requestRating);
		
		return resting;
	}

}
