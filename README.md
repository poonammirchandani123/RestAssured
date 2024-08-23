Base URI:
RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
This sets the base URI for the REST service you're going to test.

Sending the Request:
The given() method defines the request specification (headers, query parameters, etc.).
The when() method specifies the HTTP method to be used (get, post, etc.).
The then() method is used to assert the response.

Assertions:

statusCode(200): Asserts that the response status code is 200.
body("userId", equalTo(1)): Asserts that the userId in the response body is 1.
body("id", equalTo(1)): Asserts that the id in the response body is 1.
body("title", notNullValue()): Asserts that the title field is not null.
Printing the Response:
The response body is printed out using response.getBody().asString().
