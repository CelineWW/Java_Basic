final int LIST_SIZE = 4;
String[] toDoList = new String[LIST_SIZE];
int toDoListSize = 0;
                
toDoListSize = addElement(toDoList, toDoListSize, "Study");

...

public static int addElement(String[] arrayRef,
                            int currentSize,
                            String addMe) {
   // Check that array has space 
   if (currentSize == arrayRef.length) {    
      return currentSize;  
   }

   // If array has space, add the element to the array 
   arrayRef[currentSize] = addMe; 
   ++currentSize; 
   return currentSize;
}