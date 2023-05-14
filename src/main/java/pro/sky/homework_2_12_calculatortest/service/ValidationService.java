package pro.sky.homework_2_12_calculatortest.service;

import org.springframework.stereotype.Service;
import pro.sky.homework_2_12_calculatortest.exception.NoArgumentException;

@Service
public class ValidationService {
    public int checkZero(Integer num) {
        if (num == 0) {
            throw new IllegalArgumentException();
        }
        return num;
    }
    public int checkNull(Integer num) {
        if (num == null) {
            throw new NoArgumentException();
        }
        return num;
    }
}
