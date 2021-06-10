package Tespackage;

public class ArrayExample {
	public static void main(String[]args) {
		String[] DataProdi = new String[10];
		DataProdi[0] = "Administrasi";
		DataProdi[1] = "Algroteknologi";
		DataProdi[2] = "Teknik Elektro";
		DataProdi[3] = "Bahasa Arab";
		DataProdi[4] = "Bahasa Inggris";
		DataProdi[5] = "Teknik Informatika";
		DataProdi[6] = "Fisika";
		DataProdi[7] = "Kimia";
		DataProdi[8] = "Biologi";
		DataProdi[9] = "Manajemen";
		
		System.out.println("Tampilin Data 1, 3, 5");
		System.out.println("Data ke-1 :"+ DataProdi[1]);
		System.out.println("Data ke-3 :"+ DataProdi[3]);
		System.out.println("Data ke-5 :"+ DataProdi[5]);
		
		System.out.println("\n Tampilkan all data terkecuali data ke-3");
		for(int i=0; i<10; i++){
			if(i==3)
				continue;
			System.out.println("Data Ke-"+i+" "+DataProdi[i]);
		}
	}
}
