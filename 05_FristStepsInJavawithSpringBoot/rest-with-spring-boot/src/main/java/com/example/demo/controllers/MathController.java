package com.example.demo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.conversor.ConversorNumero;
import com.example.demo.math.Matematica;

@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();
	
	private Matematica math = new Matematica();
	
	@RequestMapping(value = "/sum/{num1}/{num2}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "num1")String num1, @PathVariable(value = "num2")String num2) throws Exception{
		
		if(!ConversorNumero.isNumeric(num1) || !ConversorNumero.isNumeric(num2)) {
			throw new Exception();
		}
		return math.sum(ConversorNumero.convertToDouble(num1), ConversorNumero.convertToDouble(num2));
	}
	
	@RequestMapping(value = "sub/{num1}/{num2}", method = RequestMethod.GET)
	public Double sub(@PathVariable(value = "num1" )String num1, @PathVariable(value = "num2") String num2) throws Exception {
		if(!ConversorNumero.isNumeric(num1) || !ConversorNumero.isNumeric(num2)) {
			throw new Exception();
		}
		return math.sub(ConversorNumero.convertToDouble(num1), ConversorNumero.convertToDouble(num2));
	}
	
	@RequestMapping(value = "div/{num1}/{num2}")
	public Double div(@PathVariable(value = "num1") String num1, @PathVariable(value = "num2") String num2) throws Exception {
		if(!ConversorNumero.isNumeric(num1) || !ConversorNumero.isNumeric(num2)) {
			throw new Exception();
		}
		return math.div(ConversorNumero.convertToDouble(num1), ConversorNumero.convertToDouble(num2));
	}
	
	@RequestMapping(value = "multi/{num1}/{num2}")
	public Double multi(@PathVariable(value = "num1") String num1, @PathVariable(value = "num2") String num2) throws Exception {
		if(!ConversorNumero.isNumeric(num1) || !ConversorNumero.isNumeric(num2)) {
			throw new Exception();
		}
		return math.multi(ConversorNumero.convertToDouble(num1), ConversorNumero.convertToDouble(num2));
	}
	
	@RequestMapping(value = "media/{num1}/{num2}")
	public Double media(@PathVariable(value = "num1") String num1, @PathVariable(value = "num2") String num2) throws Exception{
		if(!ConversorNumero.isNumeric(num1) || !ConversorNumero.isNumeric(num2)) {
			throw new Exception();
		}
		
		return math.media(ConversorNumero.convertToDouble(num1), ConversorNumero.convertToDouble(num2));
	}
	
	@RequestMapping(value = "raiz2/{num1}")
	public Double raiz2(@PathVariable(value = "num1") String num1) throws Exception{
		if(!ConversorNumero.isNumeric(num1)) {
			throw new Exception();
		}
		
		return math.raiz2(ConversorNumero.convertToDouble(num1));
	}

	

	
	
	
}
