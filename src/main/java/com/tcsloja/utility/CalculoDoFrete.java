package com.tcsloja.utility;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CalculoDoFrete {
	
	   private Integer min=0;
	   private Integer max=0;
	   private BigDecimal valor = new BigDecimal(0).setScale(2,BigDecimal.ROUND_FLOOR);
	   private static ArrayList<CalculoDoFrete> auxList;
	   
	    public CalculoDoFrete(int min, int max, BigDecimal valor) {
	        this.min = min;
	        this.max = max;
	        this.valor = valor;
	    }
	    private static void criarTabela (){
	        auxList.add(new CalculoDoFrete(69900000, 69999999, new BigDecimal(62.75))); //AC
	        auxList.add(new CalculoDoFrete(57000000, 57999999, new BigDecimal(5.21))); //AL
	        auxList.add(new CalculoDoFrete(69000000, 69299999, new BigDecimal(53.74))); //AM
	        auxList.add(new CalculoDoFrete(69400000, 69899999, new BigDecimal(53.74))); //AM
	        auxList.add(new CalculoDoFrete(68900000, 68999999, new BigDecimal(44.12))); //AP
	        //inserir outros estados...
	    }   
	    private int getMin() {
	        return min;
	    }
	    private int getMax() {
	        return max;
	    }
	    private BigDecimal getValor() {
	        return valor;
	    }
	    public static BigDecimal numEntre (Integer CEP){
	       auxList = new ArrayList<>();
	       criarTabela();
	       
	       for (CalculoDoFrete c : auxList) {
	           if (CEP >= c.getMin() && CEP <= c.getMax()) {
	               return  c.getValor();
	           }
	       } 
	        return null;
	    }
}
