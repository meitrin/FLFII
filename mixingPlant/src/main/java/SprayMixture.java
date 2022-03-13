public class SprayMixture {

    private char[] water = null;
    private char[] foam = null;
    private char[] mix = null;

    public char[] getMix(char[] water, char[] foam) {
        //wasser und foam zusammen in ein array und zurück geben
        mix = new char[water.length + foam.length];         //neues char[] mit länge wasser[]+foam[]
        System.arraycopy(water, 0, mix, 0, water.length);           //concat
        System.arraycopy(foam, 0, mix, water.length, foam.length);          //concat
        return mix;
    }

    public char[] getWater() {
        return water;
    }

    public char[] getFoam() {
        return foam;
    }

}