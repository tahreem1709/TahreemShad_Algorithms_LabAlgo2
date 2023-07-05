package Currency;

public class NoteCount {

	public void counting(int[] currency, int amount) {
		int notes[]=new int[currency.length];
		int sumOfNotes=0;
		
		for (int i = 0; i < currency.length; i++) 
		{
			notes[i]=amount/currency[i];
			amount=amount%currency[i];
			sumOfNotes+=notes[i];
			
		}
		for (int i = 0; i < currency.length; i++) 
		{
			if(notes[i]!=0)//if we do not want 0*notes
			System.out.println(notes[i] +"x"+ currency[i]);
		}
		    System.out.println("Total number of notes "+ sumOfNotes);
	}

}
