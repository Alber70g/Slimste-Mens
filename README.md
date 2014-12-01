Slimste-Mens
============

Repository voor project groep A van Avans.


Conventies:
	
	Binnen deze applicatie maken we qua notatie van variabelen, namen en andere code van de camelCasing
	standaard. Dit houd in dat we ieder nieuw woord in een naam beginnen met een hoofdletter:
	getAllPersonsWithPhoneNumber();
	
	We maken gebruik van beschrijvende functienamen als getVariable(), setVariable(), countEntries()
	en schrijven daarbij de woorden voluit.
	
	In de code is Engels de voertaal, ook het commentaar. Bovenaan iedere method is een 'Java-Doc block' te vinden
	met daarin de beschrijving van de functionaliteit van de methode. Het is optioneel om variabelen te voorzien van
	Java-Doc. 
	
	class Test {
		private List<Integer> numbers = new List();
		
		/**
		 * Constructor
		 */
		public Test() {
			System.out.print(this.sumAllNumbers());
		}
		
		/**
		 * Method to sum up all entries in numbers array
		 * @return {Integer} The sum of all integers in numbers array
		 */ 
		private void sumAllNumbers() {
			int sum = 0;
			
			// Sum the Integers that are in the numbers array
			for(int i = 0; i < this.numbers.length; i++) {
				sum += this.numbers[i];
			}
			
			return sum;
		}
		
		/**
		 * Method to set the numbers array
		 * @param {List<Integer} value The new numbers array
		 */
		public void setNumbers(List<Integer> value) {
			this.numbers = value;
		}
		
		/**
		 * Method to get the numbers array
		 * @return {List<Integer>} The numbers array
		 */
		public List<Integer> getNumbers() {
			return this.numbers;
		}
	}
	
	
	
