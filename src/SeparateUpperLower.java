/*
 * Written by David Olgers 2016 
 * 
 * Works great, it adds numbers to both the upper case and the lower case outputs
 */

public class SeparateUpperLower {

	private static String input;

	public static void main(String[] args) {
		input  = "COMPROMiSED and ThE UNEXPEctED MINimUm ExPEcTED PROPAGaNDA LIES LIEs LiES LieS and HALF TrUTHS ONE SImPLE FAcT ADA MUsT BE REAwAKENED WHO WiLL cONTROL HER THR3E AWAREnEsS IS EVERYtH1NG WATCH fOR CLUES USE ThEM WiSELY NOT ALL P0rTALS ARe CREATED EqUAL ThREATs aND OPPoRTUNITIES ANyWHERE NO NOt ALL BuT SoME MaY NOt coNTROL tHE iNFORMATION COnTROL ThE DAy Or MORe EXPEcT ThE UnEXpECTED WaTCH foR tHE CLuES AnD UsE THEM TO YoUR AdVANtaGE ANYwHERE EvERYWHERe AGeNTS FaR AND WiDE MuST ANSWER the CALL UnLESs OThERwise NoTED UnDER OrDInaRY ciRCUmSTances TheY KNOW Nothing FIGHt On ALL fRONTS UsE EVERY AvAILABLE rESOURCe CoNTROL is AN ILLuSION EffORT AND CoORDinaTION is EVERYTHINg ThERE iS ONLY ONE HaRD TRUTh EXpECT ThE uNExPECTeD";
		SeparateUpperLower ul = new SeparateUpperLower();
		ul.separate(input);

	}
	
	public void separate(String input){
		char[] splitInput = input.toCharArray();
		StringBuffer upper = new StringBuffer();
		StringBuffer lower = new StringBuffer();
		
		for(char c : splitInput){
			if(Character.isLowerCase(c)){
				lower.append(c);
			}
			else if(Character.isUpperCase(c)){
				upper.append(c);
			}
			else if(Character.isDigit(c)){
				lower.append(c);
				upper.append(c);
			}
		}
		
		System.out.println("Lower: ");
		System.out.println(lower.toString());
		System.out.println("Upper: ");
		System.out.println(upper.toString());
	}

}