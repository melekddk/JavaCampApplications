package overriding;

public class TarimKrediManager extends BaseKrediManager{
	public double hesapla(double tutar) {
		return tutar*2.10;
	}

}
