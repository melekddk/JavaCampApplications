
public class StringDemo {

	public static void main(String[] args) {
		//string bir karakter dizisidir.
		String mesaj ="         Bugün hava çok güzel       ";
		
		System.out.println(mesaj);
		
		/*
		 * System.out.println("Eleman Sayýsý " + " " + mesaj.length());
		 * 
		 * //charAt: dizinin istenildiði eleman sayýsýný döndürmeye yarýyor.
		 * System.out.println("5.eleman" + " " + mesaj.charAt(4)); //concat: stringleri
		 * birleþtirmeye yarýyor.Bunda mesajý tekrar yazdýrmak istediðimiz zaman ayný
		 * þekilde gelmesini istiyorsak tekrar bir deðiþkene atama iþlemi yapýlmalý
		 * System.out.println(mesaj.concat(" Yaþasýn dýþarý çýkabiliriz."));
		 * 
		 * //startsWith : içine verdiðimiz deðer ile baþlýyor ise true deðil ise false
		 * deðerini döndürüyor. System.out.println(mesaj.startsWith("B")); //Bu da içeri
		 * verilen deðer ile bitiyor mu onu kontrol ediyor.
		 * System.out.println(mesaj.endsWith("B"));
		 * 
		 * //getChars: Karakterleri al isimli operasyon bir þey döndürmüyor. void tarzý
		 * operasyon char[] karakterler = new char[5]; mesaj.getChars(0, 5, karakterler,
		 * 0); System.out.println(karakterler);
		 * 
		 * //indexOf:Baþtan olacak þekilde Ýçine verdiðimiz karakterin ilk nerede olduðu
		 * bulur ve bize o deðeri verir. System.out.println(mesaj.indexOf('a'));
		 * //lastIndexOf: Aramaya en saðdan baþlýyor ve oradaki deðeri veriyor.
		 * System.out.println(mesaj.lastIndexOf('a'));
		 */
		
		//replace: deðiþtirme ifadesi verdýr. Mesajý istediðimiz þekilde deðiþtirmemize yarýyor.Url kýsýmlarýnda en çok kullanýlýyor.
		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		
		
		
		//substring: Bir metnin içerisinden parça kýsým almaktýr.
		
		System.out.println(mesaj.substring(2,5));
		
		//split:Bir metni, belli bir karakter veya karakter dizisini dikkate alarak parçalar.
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
			
		}
		//mesajý küçük harflerle yazýyor.
		
		System.out.println(mesaj.toLowerCase());
		//mesajý büyük harflerle yazýyor.
		System.out.println(mesaj.toUpperCase());
		//mesajýn baþýndaki ve sonundaki boþluklarý düzeltmesine sebep oluyor.
		System.out.println(mesaj.trim());
		
		
		
		
	}

}
