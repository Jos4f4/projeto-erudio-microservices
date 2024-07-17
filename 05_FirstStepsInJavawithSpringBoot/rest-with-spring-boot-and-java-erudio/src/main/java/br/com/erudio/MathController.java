package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.convertes.NumberConverter;
import br.com.erudio.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {
		
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
									method=RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
						@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo);
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return NumberConverter.convertToDouble(numberOne) - NumberConverter.convertToDouble(numberTwo);
	}
	
	@RequestMapping(value = "mult/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double multiplication(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return NumberConverter.convertToDouble(numberOne) * NumberConverter.convertToDouble(numberTwo);
	}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double division(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return NumberConverter.convertToDouble(numberOne) / NumberConverter.convertToDouble(numberTwo);
	}
	
	@RequestMapping(value = "/med/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double media(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return (NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo))/2;
	}
	
	
}
