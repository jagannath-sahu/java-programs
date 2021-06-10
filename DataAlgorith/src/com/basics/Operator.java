package com.basics;

import java.util.HashMap;
import java.util.Map;

public enum Operator {

	H("Hydrogen"),
    HE("Helium"),
    // ...
    NE("Neon"),
	NOT_LIKE("not like");

    private String operator;

    private static Map<String, String> cond;

    static {
    	cond = new HashMap<>();
    	cond.put(H.getOperator(), "Hydrogen");
    	cond.put(HE.getOperator(), "Helium");
    	cond.put(NE.getOperator(), "Neon");
    	cond.put(NOT_LIKE.getOperator(), "not like");
    }

    Operator(final String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public static Operator matchOperator(final String enumDemo) {
    	Operator[] operators;

        operators = Operator.values();

        for (Operator opr : operators) {
            if (opr.getOperator().equalsIgnoreCase(enumDemo)) {
                return opr;
            }
            else if (enumDemo.indexOf(opr.getOperator()) == 0 && enumDemo.contains("_") && opr.getOperator().equalsIgnoreCase(enumDemo.substring(0, enumDemo.indexOf('_')))) {
                return opr;
            }
        }

        return null;
    }

    public static String getCond(final String operatorName) {
        return cond.get(operatorName);
    }

}
