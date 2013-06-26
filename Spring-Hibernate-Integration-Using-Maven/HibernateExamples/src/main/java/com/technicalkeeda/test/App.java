package com.technicalkeeda.test;

import com.technicalkeeda.entity.TrnMovies;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technicalkeeda.dao.MovieDao;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"config/spring-configuration.xml");

		TrnMovies lifeOfPi = new TrnMovies();
		lifeOfPi.setReleaseYear(new Long(2012));
		lifeOfPi.setDirector("Ang Lee");
		lifeOfPi.setTitle("Life of Pi");

		TrnMovies dabangg2 = new TrnMovies();
		dabangg2.setReleaseYear(new Long(2012));
		dabangg2.setDirector("Arbaaz Khan");
		dabangg2.setTitle("Dabangg 2");

        TrnMovies dabangg3 = new TrnMovies();
		dabangg3.setReleaseYear(new Long(2012));
		dabangg3.setDirector("Arbaaz cut");
		dabangg3.setTitle("Dabangg 3");

		MovieDao movieDao = (MovieDao) appContext.getBean("movieDao");
		movieDao.createMovie(lifeOfPi);
		movieDao.createMovie(dabangg2);
		movieDao.createMovie(dabangg3);

	}
}
