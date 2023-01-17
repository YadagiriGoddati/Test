$( document ).ready(function() {
$("#feedback")
							.click(
									function() {

																				var data1 = {}
										data1["ratingNumber"] =  document.querySelector('input[name="rating1"]:checked').value;
										data1["userName"] = $(
												"#userName")
												.val();
												
												data1["dummyLabel"] = $(
												"#dummyLabel")
												.text();
												
										$
												.ajax({
													type : "POST",
													contentType : "application/json",
													url : "./postRating",
													data : JSON
															.stringify(data1),
													dataType : "JSON",

													success : function(
															data) {
														
														$("#dummyLabel").text(data.dataValue);
														
														$("#average").text(data.responseCount);

														
													}
												});
										return false;
									});
									
									});