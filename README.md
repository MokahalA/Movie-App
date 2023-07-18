# Movie App

Backend to create the REST API endpoints for a movie review app built using Java, Spring Boot, MongoDB.

 - Querying all TMDB movies. 
	 - Endpoint: `/api/v1/movies` 
 - Querying a single TMDB movie using its `imdbId`. 
	 - Endpoint: `/api/v1/movies/{imdbId}`
 - Creating a review for  a TMDB movie. 
	 -	Endpoint: `/api/v1/reviews`

## Instructions to run

Requirements: 

- Java 17
- Maven
- IntelliJ (recommended)

Easiest way is using IntelliJ IDEA to run the `BackendApplication.java` file which will build the project and host the backend locally to `localhost:8080` by default.