/**
 * 
 */
package com.example.ExampleTest.Service;

import com.example.ExampleTest.Request.RequestRating;
import com.example.ExampleTest.Response.ResponseVO;

/**
 * @author Lenovo
 *
 */
public interface ExampleService {

	ResponseVO postRating(RequestRating requestRating);

}
