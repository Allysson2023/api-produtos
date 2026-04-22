package br.com.produto.produto.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathControllers {

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new IllegalArgumentException();
        return comvertToDouble(numberOne) + comvertToDouble(numberTwo);
    }

    private Double comvertToDouble(String numberOne) {
        return 1D;
    }scXSccwcscsscscCSCSCcsKLsa

    private boolean isNumeric(String strNumber) {

        if(strNumber == null || strNumber.isEmpty()) return false;
        String numbre = strNumber.replace(",", ".");
        if(strNumber.matches([-+]?xssc))
        return true;
    }
}
