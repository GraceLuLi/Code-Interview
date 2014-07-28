import java.util.LinkedList;
import java.util.Queue;

/*
 *  People must adopt either the "oldest"(based on arrival time) of all animals or they can select either 
 *  a dog or a cat(should be the "oldest" of that type)
 *  Create the data structures to maintain this system, implement the operations such as:
 *  enqueue, dequeueAny, dequeueDog, dequeueCat
 */
public class ci5_3_7 {
	public class Animal{
		int ID;
		String name;
		Animal(String n){
			name = n;
		}
		void SetID(int val){
			ID = val;
		}
	}
	public class Dog extends Animal{
		Dog(String n){
			super(n);
		}
	}
	public class Cat extends Animal{
		Cat(String n){
			super(n);
		}
	}
      public class AnimalShelter{
    	  Queue<Dog> Dogs;
    	  Queue<Cat> Cats;
    	  int validID;
    	  AnimalShelter(){
    		  validID = 0;
    		  Dogs = new LinkedList<Dog>();
    		  Cats = new LinkedList<Cat>();
    	  }
    	  void enqueue(Animal a) throws Exception{
    		  a.SetID(validID);
    		  validID++;
    		  if(a instanceof Dog){
    			  Dogs.add((Dog) a);
    		  }
    		  else if(a instanceof Cat){
    			  Cats.add((Cat) a);
    		  }
    		  else throw new Exception("Sorry, we only adopt cats and dogs.");
    	  }
    	  Animal dequeueAny() throws Exception{
    		  if(Dogs.isEmpty() && Cats.isEmpty()){
    			  throw new Exception("Sorry, we don't have any animals at this moment.");
    		  }
    		  else if(Dogs.isEmpty()){
    			  return Cats.remove();
    		  }
    		  else if(Cats.isEmpty()){
    			  return Dogs.remove();
    		  }
    		  else{
    			  Dog d = Dogs.peek();
    			  Cat c = Cats.peek();
    			  if(d.ID < c.ID){ // Dog d came before Cat c
    				  return Dogs.remove();
    			  }
    			  else{
    				  return Cats.remove();
    			  }
    		  }
    	  }
    	  Dog dequeueDog() throws Exception{
    		  if(Dogs.isEmpty()){
    			  throw new Exception("Sorry, we don't have any dogs at this moment.");
    		  }
    		  return Dogs.remove();
    	  }
    	  Cat dequeueCat() throws Exception{
    		  if(Dogs.isEmpty()){
    			  throw new Exception("Sorry, we don't have any cats at this moment.");
    		  }
    		  return Cats.remove();
    	  }
      }
}
