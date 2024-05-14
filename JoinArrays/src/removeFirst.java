public static int removeFirst(int[] arrayRef, int arraySize, int targetVal) {
   boolean targetFound;
   int index;

   targetFound = false;

   // Step through the array one element at a time
   for (index = 0; index < arraySize; ++index) {
      // If matching element found, move each element to the previous index
      if (targetFound) {
         arrayRef[index-1] = arrayRef[index];
      }

      // Check if matching element found
      if (arrayRef[index] == targetVal) {
         targetFound = true;
      }
   }

   // If matching element found, array size is one element smaller
   // otherwise array size hasn't changed 
   if (targetFound) {
      return arraySize - 1;
   }
   else {
      return arraySize;
   }
}