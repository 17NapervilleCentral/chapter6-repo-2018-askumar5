//Arjun Kumar

public class AccountTest
{
  public static void main(String[] args)
  {
    //Address home = new Address("123 Maple Ave", "Naperville", "IL", 60540);
    
    Account p1 = new Account("Julius Caesar", 1025, 1090.45, 1);
    Account p2 = new Account("Rjun Koomar", 1599, 721.42, 1);
    Account p3 = new Account("Cigar Morodia", 1564, 2354.23, 1);
    Account p4 = new Account("Kvn Hays", 1349, 3502.76, 1);
    Account p5 = new Account("Spider Man", 2499, 896.55, 1);
    Account p6 = new Account("Captain America", 2391, 746.75, 1);
    Account p7 = new Account("Person Seven", 3598, 889.22, 1);
    Account p8 = new Account("La Biblioteca", 4562, 3446.35, 1);
    Account p9 = new Account("Stick Figure", 3208, 1323.54, 1);
    Account p10 = new Account("Jeffrey Bezos", 4568, 9999.99, 1);
    
    //initializer list
    Account[] people = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
    
    System.out.println("Here is the full array of Accounts, sorted by account number.");
    //sorting using an insertion sort
    Sorts.insertionSort(people);
    for (Account person: people)
        System.out.println(person);
        
    System.out.println("\n");
    
    //makes the hash array
    Account[] hash_array = new Account[2 * people.length];
    for (int i = 0; i < people.length; i++)
    {
        //uses a for loop to add into the hash table using hash number
            hash_array[people[i].hash() % 20] = people[i];
    }
    
    //prints out the hash_array
    for (Account person: hash_array)
        System.out.println(person);
    
    //i got two collisions in my hash table
    

  }
}