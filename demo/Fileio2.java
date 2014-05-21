package demo;

import java.io.BufferedReader;
import java.io.FileReader;

import record.Address;
import record.MyDate;
import record.Person;

public class Fileio2 {

	public static void main(String[] args) {

		try{
			BufferedReader br = new BufferedReader(new FileReader
		    		("D:/david/out0.w268wang"));
			br.readLine();
			String line=br.readLine();
			while(line!=null) {
				line = br.readLine();
				if(line.compareTo("*********************************")==0)
					break;
				System.out.println(line);
			}
			System.out.println("QWERTYUIOP");
			/*while ((line = br.readLine()) != null) {
				
				// \\s+ means any number of whitespaces between tokens
			    String [] tokens = line.split("\\s+");
			    int ID = Integer.valueOf(tokens[0]).intValue();
				String lastname = tokens[2];
				String firstname = tokens[4];
				String gender = tokens[6];
				int age = Integer.valueOf(tokens[8]).intValue();
				String eMail = tokens[10];
				Address address = new 
						Address(tokens[12], tokens[13], tokens[14], tokens[15]);
				int year = Integer.valueOf(tokens[17]).intValue();
				int month = Integer.valueOf(tokens[29]).intValue();
				int day = Integer.valueOf(tokens[21]).intValue();
				MyDate dateofbirth = new MyDate(year, month, day);
				String result = tokens[23];
				Person temp = new Person(ID, lastname, firstname,
						gender, age, eMail, address, dateofbirth, result);
			    System.out.println(line);
			}*/
			br.close();
		}catch (Exception e){//Catch exception if any
		      System.err.println("Error: " + e.getMessage());
		}

	}

}
