package com.stackroute;

import com.stackroute.config.AppConfiguration;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfiguration.class);
        ctx.refresh();

        Movie bean = (Movie) ctx.getBean("Movie.class");
//        System.out.println("movie id: "+bean.getId());
//        System.out.println("movie name: " +bean.getMovieName());
//        System.out.println("actor's name: "+ bean.getActor().getName());
//        System.out.println("actor's age: "+bean.getActor().getAge());
//        System.out.println("actor's gender: "+bean.getActor().getGender());
        System.out.println(bean.toString());



        Movie bean1=(Movie) ctx.getBean("Movie1.class");
        System.out.println(bean.toString());

        Movie movie1=(Movie) ctx.getBean("Movie.class");
        Movie movie2=(Movie) ctx.getBean("Movie1.class");
        System.out.println(movie1==movie2);

    }

}
