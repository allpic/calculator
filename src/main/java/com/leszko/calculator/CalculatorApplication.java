package com.leszko.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
package com.leszko.calculator;
import org.springframework.stereotype.Service;
@Service
public class Calculator {
public int sum(int a, int b) {
return a + b;
}
}
