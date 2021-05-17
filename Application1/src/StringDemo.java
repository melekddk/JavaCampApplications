
public class StringDemo {

	public static void main(String[] args) {
		//string bir karakter dizisidir.
		String mesaj ="         Bug�n hava �ok g�zel       ";
		
		System.out.println(mesaj);
		
		/*
		 * System.out.println("Eleman Say�s� " + " " + mesaj.length());
		 * 
		 * //charAt: dizinin istenildi�i eleman say�s�n� d�nd�rmeye yar�yor.
		 * System.out.println("5.eleman" + " " + mesaj.charAt(4)); //concat: stringleri
		 * birle�tirmeye yar�yor.Bunda mesaj� tekrar yazd�rmak istedi�imiz zaman ayn�
		 * �ekilde gelmesini istiyorsak tekrar bir de�i�kene atama i�lemi yap�lmal�
		 * System.out.println(mesaj.concat(" Ya�as�n d��ar� ��kabiliriz."));
		 * 
		 * //startsWith : i�ine verdi�imiz de�er ile ba�l�yor ise true de�il ise false
		 * de�erini d�nd�r�yor. System.out.println(mesaj.startsWith("B")); //Bu da i�eri
		 * verilen de�er ile bitiyor mu onu kontrol ediyor.
		 * System.out.println(mesaj.endsWith("B"));
		 * 
		 * //getChars: Karakterleri al isimli operasyon bir �ey d�nd�rm�yor. void tarz�
		 * operasyon char[] karakterler = new char[5]; mesaj.getChars(0, 5, karakterler,
		 * 0); System.out.println(karakterler);
		 * 
		 * //indexOf:Ba�tan olacak �ekilde ��ine verdi�imiz karakterin ilk nerede oldu�u
		 * bulur ve bize o de�eri verir. System.out.println(mesaj.indexOf('a'));
		 * //lastIndexOf: Aramaya en sa�dan ba�l�yor ve oradaki de�eri veriyor.
		 * System.out.println(mesaj.lastIndexOf('a'));
		 */
		
		//replace: de�i�tirme ifadesi verd�r. Mesaj� istedi�imiz �ekilde de�i�tirmemize yar�yor.Url k�s�mlar�nda en �ok kullan�l�yor.
		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		
		
		
		//substring: Bir metnin i�erisinden par�a k�s�m almakt�r.
		
		System.out.println(mesaj.substring(2,5));
		
		//split:Bir metni, belli bir karakter veya karakter dizisini dikkate alarak par�alar.
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
			
		}
		//mesaj� k���k harflerle yaz�yor.
		
		System.out.println(mesaj.toLowerCase());
		//mesaj� b�y�k harflerle yaz�yor.
		System.out.println(mesaj.toUpperCase());
		//mesaj�n ba��ndaki ve sonundaki bo�luklar� d�zeltmesine sebep oluyor.
		System.out.println(mesaj.trim());
		
		
		
		
	}

}
