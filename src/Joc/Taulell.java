package Joc;

public class Taulell {
	
		private static char table[][] = new char[17][19];
		
		public Taulell(){
			table= new char [][]{
	
					
			};
			
		}	
		

		

		public static void mostrar_taulell() {

			for (int i = 0; i <17; i++) {
				for (int j = 0; j <19; j++) {
					System.out.print("" + table[i][j]+ " ");
				}
				System.out.println("");
			}
		}
		
		

	
}

