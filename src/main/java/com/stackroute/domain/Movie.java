package com.stackroute.domain;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private int id;
    private String movieName;
//    @Autowired
    private Actor actor;

//    public Movie() {
//    }
//    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Movie(int id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }


//    public Movie(int id, String movieName, Actor actor) {
//        this.id = id;
//        this.movieName = movieName;
//        this.actor = actor;
//    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", actor=" + actor +
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("hey "+beanFactory);

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("bean name is: "+s );

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            System.out.println(applicationContext);
            System.out.println(applicationContext.getBean("Actor.class"));

    }
}

