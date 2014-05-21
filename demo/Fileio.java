package demo;

import java.io.*;

public class Fileio {

	public static void main(String[] args) {
		File dir = new File("D:/david");
		File f = new File("D:/david/david.txt");
		if(!dir.exists()||!dir.isDirectory()){
			new File("D:/david").mkdirs();
		}
		try{
			 // Create file 
			 FileWriter fstream = new FileWriter("D:/david/david.txt");
			 BufferedWriter out = new BufferedWriter(fstream);
			 out.write("Hello Java");
			 out.newLine();
			 //Close the output stream
			 out.close();
		}catch (Exception e){//Catch exception if any
			   System.err.println("Error: " + e.getMessage());
		}
		try {
			OutputStreamWriter fStream = new OutputStreamWriter(new FileOutputStream
					("D:/david/david.txt", true));
            fStream.append("queryID=         " + "recall=           Pres=");
            fStream.flush();
            fStream.close();
        } catch (IOException ex) {}
		int nameInd = 0;
		//for(int i=0; i<Integer.MAX_VALUE; i++){
		for(int i=0; i<100; i++){
			f = new File("D:/david/out"+i+".txt");
			System.out.println(f.exists());
			if(!f.exists()){
				nameInd = i;
				break;
			}
		}
		try{
			 // Create file 
			 FileWriter fstream = new FileWriter("D:/david/out"+nameInd+".w268wang");
			 BufferedWriter out = new BufferedWriter(fstream);
			 out.write("Hello Java");
			 out.newLine();
			 //Close the output stream
			 out.close();
			 BufferedReader br = new BufferedReader(new FileReader("D:/david/out"+nameInd+".w268wang"));
			 String line;
			 while ((line = br.readLine()) != null) {
			    System.out.println(line);
			 }
			 br.close();
		}catch (Exception e){//Catch exception if any
			   System.err.println("Error: " + e.getMessage());
		}
		try{
			File file = new File("D:/david/out0.w268wang");
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String line = null;
			while( (line = br.readLine())!= null ){
			        // \\s+ means any number of whitespaces between tokens
			    String [] tokens = line.split("\\s+");
			    String var_1 = tokens[0];
			    String var_2 = tokens[1];
			    System.out.println(var_1);
			    System.out.println(var_2);
			}
		} catch (Exception e){}
		

	}

}
