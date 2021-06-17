package arrayInObject;

public class DataMhs {
	public static void main(String[] args) {
		
		int maxSize = 100;
		ManageMahasiswa obj = new ManageMahasiswa(maxSize);
		obj.insert("116705090", "Bokir", 24);
		obj.insert("116705201", "Juned", 24);
		obj.insert("116705202", "Juneb", 24);
		obj.insert("116705413", "Dodo", 24);
		obj.insert("116705114", "Eman", 24);
		System.out.println("Data Mahasiswa : ");
		obj.display();
	}

}
