package test0223;

public class Main {
	public static void main(String[] args) {
		
		
//		int lineCount = 4;
//      int spaceCount = lineCount/2 +1;
//      int starCount = 1;
//      
//      for (int i = 0; i < lineCount; i++) {
//         for (int j = 0; j < spaceCount; j++) {
//            System.out.print(' ');
//         }
//         for (int j = 0; j < starCount; j++) {
//            System.out.print('*');
//         }
//         for (int j = 0; j < spaceCount; j++) {
//            System.out.print(' ');
//         }
//         spaceCount-=1;
//         starCount+=2;
//         System.out.println();
//      }
		
      int lineCount = 4;  //4
         int spaceCount = lineCount/2 +1; //3,  // 2  // 1 // 0 // -1
         int starCount = 1; //1, // 3 // 5 // 7 // 9
         
         for(int i = 0; i<lineCount; i++) { //0 // 1 // 2 // 3 // 4
            for(int j = 0; j<spaceCount; j++) { // 0, 1, 2, 3 // 0, 1, 2 // 0, 1 // 0
               System.out.print(' ');
            }
            for(int j=0; j<starCount; j++) { // 0, 1 // 0, 1, 2, 3 // 0, 1, 2, 3, 4, 5 // 0, 1, 2, 3, 4, 5, 6, 7
               System.out.print('*');
            }
            for(int j = 0; j<spaceCount; j++) { // 0, 1, 2, 3 // 0, 1, 2 // 0, 1 // 0
               System.out.print(' ');
            }
            spaceCount-=1;
            starCount+=2;
            System.out.println();
         }
         
         int lineCount2 = 4;  //4
         int spaceCount2 = 1; //3,  // 2  // 1 
         int starCount2 =5; //1, // 3 // 5
         
         for(int i = 0; i<lineCount2; i++) { //0 // 1 // 2 // 3 // 4
            for(int j = 0; j<spaceCount2; j++) { // 0, 1, 2, 3 // 0, 1, 2 // 0, 1 // 0
               System.out.print(' ');
            }
            for(int j=0; j<starCount2; j++) { // 0, 1 // 0, 1, 2, 3 // 0, 1, 2, 3, 4, 5 // 0, 1, 2, 3, 4, 5, 6, 7
               System.out.print('*');
            }
            for(int j = 0; j<spaceCount2; j++) { // 0, 1, 2, 3 // 0, 1, 2 // 0, 1 // 0
               System.out.print(' ');
            }
            spaceCount2+=1;
            starCount2-=2;
            System.out.println();
         }
}
}
