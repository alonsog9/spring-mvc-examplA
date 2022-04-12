package com.formacion.nttdata.hello.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.formacion.nttdata.hello.model.User;




@Controller

public class HomeController {

	/**
	 * 
	 * Simply selects the home view to render by returning its name.
	 * 
	 */

	@RequestMapping(value = "/", method = RequestMethod.GET)

	public String home(Locale locale, Model model) {

		System.out.println("Home Page Requested, locale = " + locale);

		Date date = new Date();
		
		/** no es lo que se pide
		Date date = new Date(today.getTime() + (1000 * 60 * 60 * 120)); //Agrega los milisegundos de un dia, en este caso de 5, 24*5 = 120 horas 
		 */
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";

	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)

	public String user(@Validated User user, Model model, Locale locale) {  

		System.out.println("User Page Requested");

		model.addAttribute("userName", user.getUserName());
		
		//----------------------------------------
		
		Date date = new Date();
		
		Date nextDate = new Date(date.getTime() + (1000 * 60 * 60 * (user.getUserTag()*24))); //Agrega los milisegundos de un dia, 
																									//p.ejem de 5, 24*5 = 120 horas 
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);
		String nextformattedDate = dateFormat.format(nextDate); //damos formato a la nueva fecha
		
		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("newserverTime", nextformattedDate); //añadimos nuevo atributo para llamarlo desde user
		model.addAttribute("userTag", user.getUserTag());
		
		
		return "user";

	}

}