package com.davidcortijo.cliente;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.davidcortijo.configuracion.SpringConfigurationAuto;
import com.davidcortijo.configuracion.SpringConfigurationInyec;
import com.davidcortijo.modelo.Libro;

public class AppMain {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("application-context-constructor-ambiguedades.xml");
		//ConfigurableApplicationContext  para poder usar los metodos preDestroy, etc.
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigurationInyec.class);
		Libro libro = (Libro) context.getBean("libro");
		System.out.println(libro.toString());
		context.close();
	}

}
