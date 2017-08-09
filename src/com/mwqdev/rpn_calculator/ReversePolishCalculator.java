package com.mwqdev.rpn_calculator;

/**
 * Created by micha on 8/8/2017.
 */

import java.util.*;

class ReversePolishCalculator {

    double calculate(String input) {

        Stack rpnStack = new Stack();

        double valueOne;
        double valueTwo;
        double result;

        String[] tokens = input.split(",");

        for (String token : tokens) {

            if (isOperator(token)) {

                System.out.println(token);

                valueOne = Double.parseDouble(rpnStack.pop().toString());
                valueTwo = Double.parseDouble(rpnStack.pop().toString());

                System.out.println(valueTwo);
                System.out.println(valueOne);

                switch (token) {

                    case "+":
                        result = valueTwo + valueOne;
                        rpnStack.push(result);
                        break;
                    case "-":
                        result = valueTwo - valueOne;
                        rpnStack.push(result);
                        break;
                    case "*":
                        result = valueTwo * valueOne;
                        rpnStack.push(result);
                        break;
                    case "/":
                        result = valueTwo / valueOne;
                        rpnStack.push(result);
                }
            } else {

                rpnStack.push(token);
            }
        }
        System.out.println(rpnStack);
        return Double.parseDouble(rpnStack.peek().toString());
    }

    private boolean isOperator(String input) {

        boolean isOp;

        switch (input) {

            case "+":
                isOp = true;
                break;
            case "-":
                isOp = true;
                break;
            case "*":
                isOp = true;
                break;
            case "/":
                isOp = true;
                break;
            default:
                isOp = false;
        }
        return isOp;
    }
}