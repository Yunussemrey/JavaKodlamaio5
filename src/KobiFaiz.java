
public class KobiFaiz extends BaseFaiz{

	

	public double hesapla(double para) {
		
		double tutar=para * 2.40;
		System.out.println( "Kobilere "	+para+" için faiz tutarı: "+tutar);
		return tutar;
	}

}
