package collections;

public class collectionBasics {

    //why do we need collections 
    /*  firstly we can't create 1000+ variables but we use array in order to solve this 
    problem
    but array also has its own limitations.

    *****Problems with Array**********
    1=> Fixed Size : Array comes with a fixed size in order so usully 
    we dont know how much size to be allocated 
    2=> Difficult insertion/deletions 
    3=>Searching and Sorting is written manually 
    

    ----------What problem does collection solve ------------
    Collections solves this by providing in built interfaces and classes having all the basic operartions 
    in Data Structures



    
        ------------------Collection vs Collections-----------------------

    ->Collection : It is an interface (interface Collection<E> );
    is interface me inbuilt methods 
    e.g- ye sab kuch methods declared in Collection
        add(),
        remove(),
        size(),
        contains(),
        isEmpty()
    

    ->Collections : it is utility class  (java.util.Collections)
                    -> isme static utility methods milte hain
                    
    

    What is Collection Framework 
    Java has alot of interfaces and classes which are used for data organise/ manage  this
    complete ecosystem is java Collection framework.
    
   Iterable
      |
  Collection
    / | \
   /  |  \
List Set Queue
    


and Map is separate 
Technically map does not technically extends Collection interface

     Map
    /  \
   /    \
HashMap TreeMap
 

Q. Why different List,set,queue,map ?
Different use different structure


-> List: Duplicate values allowed 
         insertion order is maintained 
     
     e.g
        ->ArrayList
        ->LinkedList
        ->vector

        
-> Set: Duplicates values are not allowed 
        
        e.g
           ->HashSet
           ->LinkedHashSet
           ->TreeSet

->Queue: usually processing order based 

       e.g
        ->PriorityQueue
        ->ArrayDeque

-> Map stores data in key value pair
        e.g
            ->HashMap
            ->LinkedHashMap
            ->TreeMap
            ->HashTable

*/
}
