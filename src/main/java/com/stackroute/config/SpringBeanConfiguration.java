package com.stackroute.config;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class SpringBeanConfiguration {
        @Bean(name="Movie.class")
        public Movie getMovie(){
//            Actor actor=new Actor();
//            actor.setName("Shahid Kapoor");
//            actor.setGender("Male");
//            actor.setAge(38);
//            Movie movie=new Movie();
//            movie.setId(15);
//            movie.setMovieName("Kabir Singh");
          //  movie.setActor(actor);


//            Actor actor = new Actor("salman", "Male", 33);
            Movie movie = new Movie(20, "Bharat");
            return movie;
        }

        @Bean(name = "Actor.class")
        public Actor getActor(){
            Actor actor=new Actor("salman","Male",49);
            return actor;
        }

        @Bean
        public BeanLifecycleDemoBean getMessage()
        {
            BeanLifecycleDemoBean beanLifecycleDemoBean=new BeanLifecycleDemoBean();
            return beanLifecycleDemoBean;
        }
}
