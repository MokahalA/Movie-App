package io.github.mokahala.backend;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Acts on the database to obtain the list of movies
@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        //Convert the imdbId to an objectId to search for it in the database
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
