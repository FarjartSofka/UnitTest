package co.com.sofka.app.calculator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long sub(Long number1, Long number2) {
        logger.info( "Substracting {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long mul(Long number1, Long number2) {
        logger.info( "Multipling {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Long div(Long number1, Long number2) {

        if(number2 == 0){
            throw new ArithmeticException("Number 2 cannot be 0");
        }
        logger.info( "Dividing {} / {}", number1, number2 );
        return number1 / number2;
    }

}
