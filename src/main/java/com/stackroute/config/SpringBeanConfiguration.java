package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class SpringBeanConfiguration {
    @Bean(name="Movie.class")
    @Scope("prototype")
    public Movie getMovie(){
//        Actor actor=new Actor();
//        actor.setName("Shahid Kapoor");
//        actor.setGender("Male");
//        actor.setAge(38);
//        Movie movie=new Movie();
//        movie.setId(15);
//        movie.setMovieName("Kabir Singh");
//        movie.setActor(actor);
        Actor actor = new Actor("Katrina", "Female", 33);
        Movie movie = new Movie(20, "Bharat", actor);
        return movie;
    }

}
