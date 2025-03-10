package com.prep;

public class StrngPrep
{
	public static void main(String args[])
	{
    	
		String s="abc";
		String p="abc";
		System.out.println("compareTo-"+s.compareTo(p));
		
    	String ss="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
    			+ "<OrdSubmtDTCFnclMstr xmlns=\"http://xmlns.int.nike.com/orders/xsd/v1\">\n"
    			+ "    <OrdSubmtDTCFnclHdr/>\n"
    			+ "</OrdSubmtDTCFnclMstr>\n"
    			+ "";
    	System.out.println("output --ss -- "+ss.length());

    	System.out.println("output --ss -- "+ss.substring(-1, 13));
    	
    	
	}

}
