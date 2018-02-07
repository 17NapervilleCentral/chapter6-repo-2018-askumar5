//********************************************************************
//  StudentBody.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of an aggregate class.
//********************************************************************

public class Addressdata
{
   //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {


	   //Address [] contacts = new Address [10];
Address school = new Address ("800 Lancaster Ave.", "Villanova","PA", 19085);
Address rHome = new Address ("4 Privet Drive", "Lynchburg","OH",60123);
Address mHome = new Address ("1203 Main Street", "Euclid", "OH",60156);
Address ken   = new Address ("915 Elm Street", "Homewood", "IL", 60424);
Address dj   = new Address ("915 Maple Ave", "Homewood", "IL", 60518);
Address Homes   = new Address ("221 B Baker Street", "London", "UK", 60518);
Address Bob   = new Address ("124 Conch Street", "Bikini Bottom", "US", 61245);
Address Ned   = new Address ("740 Evergreen Terrace", "Springfield", "US", 78204);
Address Ed   = new Address ("9764 Jeopardy Lane","Chicago", "IL", 60678);
Address Tom   = new Address ("916 Elm Street","Flossmoor", "IL", 60148);

	   Address [] contacts = {school,rHome,mHome,dj,ken,Homes,Bob,Ned,Ed,Tom};

	   //Sort the Addresses



	  //String hash1 = contacts[3].hash();
/*	  int hash1 = contacts[3].hash();
	  System.out.println(hash1);
	  int hash2 = contacts[2].hash();
	  System.out.println(hash2);
/**/
	  for (Address me: contacts)
	  {
	  	System.out.print(me.hash());
	  	System.out.println("-"+me.hash()%30);
	}


	  Address [] hash_array = new Address[3*contacts.length];

	  for( int i = 0; i < contacts.length; i++)
	  {
		  hash_array[contacts[i].hash()%30] = contacts[i];

	  }

	  for (Address me2 :hash_array)
	  System.out.println(me2);


/*
		int hash2 = 0;
	   for( int i = 0; i<hash1.length();i++)
	   {
	   		hash2 += hash1.charAt(i);
		}

		System.out.print(hash2%20);


*/

   }
}
