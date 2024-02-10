
public class EsnafFaiz extends BaseFaiz{

public double hesapla(double para) {
		
		double tutar=para * 1.75;
		System.out.println( "Esnaflara "+para+" için faiz tutarı: "+tutar);
		return tutar;
	}

}
