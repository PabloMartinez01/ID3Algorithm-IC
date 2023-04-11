import java.util.ArrayList;
import java.util.Arrays;


public class Loader {

	public Loader() {
		
	}
	
	public static ArrayList<String> loadHeader(){
		return new ArrayList<String> (Arrays.asList("TiempoExterior,Temperatura,Humedad,Viento,Jugar".split(",")));
	}
	
	public static ArrayList<ArrayList<String>> loadData(){
		ArrayList<ArrayList<String>> matriz = new ArrayList<ArrayList<String>>();
	
		matriz.add(new ArrayList<String> (Arrays.asList("soleado,caluroso,alta,falso,no".split(","))));
		matriz.add(new ArrayList<String> (Arrays.asList("soleado,caluroso,alta,verdad,no".split(","))));
		matriz.add(new ArrayList<String> (Arrays.asList("nublado,caluroso,alta,falso,si".split(","))));
		matriz.add(new ArrayList<String> (Arrays.asList("lluvioso,templado,alta,falso,si".split(","))));
		matriz.add(new ArrayList<String> (Arrays.asList("lluvioso,frio,normal,falso,si".split(","))));
		matriz.add(new ArrayList<String> (Arrays.asList("lluvioso,frio,normal,verdad,no".split(","))));
		matriz.add(new ArrayList<String> (Arrays.asList("nublado,frio,normal,verdad,si".split(","))));
		matriz.add(new ArrayList<String> (Arrays.asList("soleado,templado,alta,falso,no".split(","))));
		matriz.add(new ArrayList<String> (Arrays.asList("soleado,frio,normal,falso,si".split(","))));
		matriz.add(new ArrayList<String> (Arrays.asList("lluvioso,templado,normal,falso,si".split(","))));
		matriz.add(new ArrayList<String> (Arrays.asList("soleado,templado,normal,verdad,si".split(","))));
		matriz.add(new ArrayList<String> (Arrays.asList("nublado,templado,alta,verdad,si".split(","))));
		matriz.add(new ArrayList<String> (Arrays.asList("nublado,caluroso,normal,falso,si".split(","))));
		matriz.add(new ArrayList<String> (Arrays.asList("lluvioso,templado,alta,verdad,no".split(","))));
		

		return matriz;
	}

}
