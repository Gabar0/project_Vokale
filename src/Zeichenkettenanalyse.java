

  /**
  * Diese Klasse enthält verschiedene Klassenmethoden zur Analyse von Zeichenketten
  *
  */


public class Zeichenkettenanalyse {

	/**
	 * Die Methode vokaleZaehlen zählt alle Vokale (a, e, i, o, u) in der ihr als Parameter übergebenen Zeichenkette
	 * Die Anzahlen der gezählten Vokale sollen als Array vom Typ int von der Methode zurückgeben werden
	 *
	 * @param zeichenkette
	 *            Zeichenfolge, in der alle Vokale (a, e, i, o, u) gezält werden
	 *
	 * @return int Array: wie viel Vokale enthälten
	 */

		static char[] vokale = {'a','e','i','o','u'};
		public static int[] vokaleZaehlen(String zeichenkette){

				char[] vokale = {'a','e','i','o','u'};

				int[] result = {0,0,0,0,0};

			        for (char c : zeichenkette.toCharArray()) {
			            if (c == vokale[0]) {
			                result[0]++;
		                }
			            if (c == vokale[1]) {
			                result[1]++;
		                }
			            if (c == vokale[2]) {
			                result[2]++;
		                }
			            if (c == vokale[3]) {
			                result[3]++;
		                }
			            if (c == vokale[4]) {
			                result[4]++;
		                }
		            }
				return result;
		 }

		/**
		 * Die Methode meldungVokaleZaehlen() gibt die Vokale als Array auf der Standardausgabe aus
		 */
		public static void meldungVokaleZaehlen(){
			System.out.println("Zu analysierende Zeichenkette: Wieviele Vokale stehen in diesem Satz?"
					+ "\n" + "Die Zeichenkette enthaelt:");
		   int[] result2 = Zeichenkettenanalyse.vokaleZaehlen("Wieviele Vokale stehen in diesem Satz");

		   for (int i=0; i < result2.length; i++) {
		    System.out.println("Anzahl an " + vokale[i] + " : " + result2[i]);
		   }
	    }

	     /**
	      * Die Methode zeichenZaehlen1 zählt die Anzahl des ihr als Parameter übergebenen Zeichens in der ihr übergebenen Zeichenkette
	      * Die Methode soll die Anzahl der gefundenen Zeichen als Rückgabewert zurückgeben
	      *
	      * @param zeichenkette
	      *         Zeichenfolge, in der die Zeichen gezält werden
	      *
	      * @param letter
	      *        das Zeichen, das gezält wird
	      *
	      * @return
	      *     int: liefert den Wert von die Zeichen zurück
	      *
	      */


	    public static int zeichenZaehlen1(String zeichenkette, char letter){

			int result = 0;

			char[] arrayChar = zeichenkette.toLowerCase().toCharArray();

			for (char c : arrayChar) {
		        if(c == letter){
		        	result++;;
		        }
	        }
			return result;
		}

	     /**
	      * Die Methode meldungZeichenZaehlen1 gibt die Anzahl der gefundenen Zeichen  auf der Standardausgabe aus
	      */
	    public static void meldungZeichenZaehlen1(){
	     System.out.println("Anzahl des Zeichens 'a' in  in der Zeichenkette : abracadabra " );
	     System.out.println(Zeichenkettenanalyse.zeichenZaehlen1("abracadabra", 'a'));

	   }


	    /**
	     * Die Methode zeichenZaehlen2 zählt die Anzahl der ihr als Array übergebenen Zeichen in der ihr übergebenen Zeichenkette
	     * Die Anzahlen der gezählten Zeichen sollen als Array vom Typ int von der Methode zurückgeben werden
	     *
	     * @param zeichenkette
	     *        Zeichenfolge, in der die Zeichen gezält werden
	     * @param chars
	     *        die Zeichen, die gezält wird
	     * @return int Array: wie viel Zeichn enthälten
	     */
	    public static int[] zeichenZaehlen2(String zeichenkette, char...chars){
			int results[] = new int[chars.length];

			char[] arrayChar = zeichenkette.toLowerCase().toCharArray();

			for (int i = 0; i < chars.length; i++) {
		        for (char c : arrayChar) {
		           if (c == chars[i]) {
		                results[i]++;
	               }
	            }
	        }

			return results;
		}

	    /**
	     * Die Methode meldungZeichenZaehlen2 gibt die Anzahl der gefundenen Zeichen als Array auf der Standardausgabe aus
	     */
	    public static void meldungZeichenZaehlen2(){
	    	System.out.println("Anzahl der Zeichen 'z', 'i', 'n' in der Zeichenkette : Zaehle die Zeichen "
	    				+ "\n" + "Die Zeichenkette enthaelt:");
	    	int[] res = Zeichenkettenanalyse.zeichenZaehlen2 ("Zaehle die Zeichen", 'z', 'i', 'n');

	        for (int i = 0; i < res.length; i++) {
	            System.out.println("Anzahl an "  + res[i] );
	        }

	     }

		/**
		 * schreibt eine Linie auf die Konsole
		 */
	    public static void schreibeLinie() {
	        System.out.println("----------------------------------------");
		}





	}





