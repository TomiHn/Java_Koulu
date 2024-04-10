package nippu.kaksi;

import java.util.Random;

public class T12 {
    public String[] firstNames = {
            "Matti", "Timo", "Juha", "Kari", "Pekka",
            "Jari", "Jukka", "Markku", "Antti", "Mikko",
            "Hannu", "Heikki", "Leena", "Seppo", "Tuula",
            "Mika", "Päivi", "Ritva", "Anne", "Pirjo"
    };

    public String[] lastNames = {
            "Korhonen", "Virtanen", "Mäkinen", "Nieminen", "Mäkelä",
            "Hämäläinen", "Laine", "Heikkinen", "Koskinen", "Järvinen",
            "Lehtonen", "Lehtinen", "Saarinen", "Salminen", "Heinonen",
            "Niemi", "Heikkilä", "Kinnunen", "Laitinen", "Turunen"
    };

    public String randNames() {

        Random rand = new Random();

        int firstNameNum = rand.nextInt(firstNames.length - 1);
        int lastNameNum = rand.nextInt(firstNames.length - 1);

        return String.format("%s %s", this.firstNames[firstNameNum], this.lastNames[lastNameNum]);
    }
}
