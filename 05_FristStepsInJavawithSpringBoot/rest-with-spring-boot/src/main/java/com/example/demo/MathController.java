package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/sum/{num1}/{num2}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "num1")String num1, @PathVariable(value = "num2")String num2) throws Exception{
		
		if(!isNumeric(num1) || !isNumeric(num2)) {
			throw new Exception();
		}
		return convertToDouble(num1)+ convertToDouble(num2);
	}
	
	@RequestMapping(value = "sub/{num1}/{num2}", method = RequestMethod.GET)
	public Double sub(@PathVariable(value = "num1" )String num1, @PathVariable(value = "num2") String num2) throws Exception {
		if(!isNumeric(num1) || !isNumeric(num2)) {
			throw new Exception();
		}
		return convertToDouble(num1) - convertToDouble(num2);
	}
	
	@RequestMapping(value = "div/{num1}/{num2}")
	public Double div(@PathVariable(value = "num1") String num1, @PathVariable(value = "num2") String num2) throws Exception {
		if(!isNumeric(num1) || !isNumeric(num2)) {
			throw new Exception();
		}
		return convertToDouble(num1) / convertToDouble(num2);
	}
	
	@RequestMapping(value = "media/{num1}/{num2}")
	public Double media(@PathVariable(value = "num1") String num1, @PathVariable(value = "num2") String num2) throws Exception{
		if(!isNumeric(num1) || !isNumeric(num2)) {
			throw new Exception();
		}
		
		Double media = ((convertToDouble(num1) + convertToDouble(num2))/2);
		
		return media;
	}
	
	@RequestMapping(value = "raiz2/{num1}")
	public Double raiz2(@PathVariable(value = "num1") String num1) throws Exception{
		if(!isNumeric(num1)) {
			throw new Exception();
		}
		
		return Math.sqrt(convertToDouble(num1));
	}

	private Double convertToDouble(String strNumber) {
		if(strNumber == null) return 0D;
		String number = strNumber.replaceAll(",", ".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}

	private boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
	
}
