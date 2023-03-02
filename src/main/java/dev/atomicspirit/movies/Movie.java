package dev.atomicspirit.movies;

import lombok.AllArgsConstructor;
import lombok.Data; // takes care of all the getters setters and toString methods
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;


@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {


        @Id
        private ObjectId id;

        private String imdbId;

        private String title;

        private String releaseDate;

        private String trailerLink;

        private String poster;

        private List<String> genres;

        private List<String> backdrops;

        @DocumentReference //Embedded relationship All the reviews related to the movie will be added one to many
        private List<Review> reviewIds;


    }
