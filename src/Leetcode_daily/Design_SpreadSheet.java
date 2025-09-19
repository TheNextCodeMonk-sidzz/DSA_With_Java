package Leetcode_daily;

import java.util.HashMap;

//https://leetcode.com/problems/design-spreadsheet/description/?envType=daily-question&envId=2025-09-19
public class Design_SpreadSheet {
    private int rows;
    HashMap<String, Integer> map;


    public Design_SpreadSheet(int rows) {
        this.rows=rows;
        this.map=new HashMap<>();
    }

    public void setCell(String cell, int value) {
        map.put(cell,value);
    }

    public void resetCell(String cell) {

        map.remove(cell);
    }

    public int getValue(String formula) {
        String expression=formula.substring(1);

        String[] parts=expression.split("\\+");
        int sum=0;
        for(String part:parts){
            sum +=evaluatePart(part);
        }
        return sum;
    }

    private int evaluatePart(String part){
        if(Character.isDigit(part.charAt(0))){
            return Integer.parseInt(part);
        }else{
            return map.getOrDefault(part,0);
        }
    }
}
