
public class IşletmeFaiz extends BaseFaiz{

public double hesapla(double para) {
		
		double tutar=para * 3.10;
		System.out.println( "İşletmelere "+para+" için faiz tutarı: "+tutar);
		return tutar;
	}
}
