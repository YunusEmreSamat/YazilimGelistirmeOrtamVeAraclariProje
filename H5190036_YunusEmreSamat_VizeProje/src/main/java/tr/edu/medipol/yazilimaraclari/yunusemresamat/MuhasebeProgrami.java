package tr.edu.medipol.yazilimaraclari.yunusemresamat;

public class MuhasebeProgrami {

	public static void main(String[] args) {
		System.out.println(ucretHesapla(5, 25));
	}

	public static String ucretHesapla(int calisilanSaat, int saatlikUcret) {

		if (calisilanSaat > 0 && saatlikUcret > 0) {
			return new Ucret(calisilanSaat, saatlikUcret).toString();
		} 
		else {
			return "Hatalý Deðer Giriþi Yaptýnýz!!!";
		}

	}

	private static class Ucret {
		int calisilanSaat;
		int saatlikUcret;
		int ucret;

		public Ucret(int calisilanSaat, int saatlikUcret) {
			this.calisilanSaat = calisilanSaat;
			this.saatlikUcret = saatlikUcret;
			this.ucret = calisilanSaat * saatlikUcret;
		}

		@Override
		public String toString() {
			return calisilanSaat + " * " + saatlikUcret + " = " + ucret;
		}
	}

}