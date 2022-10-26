object Start {

  def main(args : Array[String]) ={

    // Exo 1.1

    /**
     * Try creating a variable of type Double and assigning an integer
        value to it. Does it work? If yes, research this. Do it the other way
        (storing a Double value in an Integer variable).
     */

    var monDouble : Double = 2;
    println("Mon double "+monDouble)

    //    var monEntier : Int = 2.1     // Ce ci ne fonctionne pas car Double est pas un sous type de Int

    //Exo 1.2

    /**
     * Try creating a variable (e.g., x) and assigning a value to it
      (e.g., 10). Then create another variable (e.g., y) and assign it to
      another variable (i.e., x=y). Now change the value of x. Check
      whether it changed the value of y or not. If not, research this
      concept (specifically what is meant by pass by value and pass
      by reference).
     */

    var x = 10;
    var y = 11;
    x = y;
    x = 12;

    println("X : "+x)
    println("Y : "+y)

    // On constate que le avaleur de y n'a pas changé
    // Constat : en scala certains types intégrés sont automatiquement transmis par valeur (par exemple, int ou Int)
    // et chaque type défini par l'utilisateur est transmis par référence (c'est-à-dire qu'il doit les copier manuellement pour ne transmettre que leur valeur)

    //Exo 1.3

    /**
     * Try creating multiple variables on one line.
     */

    var a :Int = 0;   var b :Int = 0;


  }
}
