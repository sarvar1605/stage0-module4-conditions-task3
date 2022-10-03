package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if(character=='a' || character=='o' || character=='i' || character=='e' || character=='u'
          ||character=='A' || character=='O' || character=='I' || character=='E' || character=='U'){
            System.out.println("Vowel");
        } else if(character>='a' && character<='z' || character>='A' && character<='Z') {
             System.out.println("Consonant");
         } else {
             System.out.println("wrong alphabet!");
         }
     }     
}
