public class MixingPlant {

    private static final MixingPlant instance = new MixingPlant();
    private SprayMixture xSprayMixture;
    private char[] water;
    private char[] foam;
    public Port port;

    public MixingPlant() {
        this.xSprayMixture=new SprayMixture();
        port=new Port();
    }
    public static MixingPlant getInstance(){return instance;}

    public String mix(MixingRatio mixture, Mode mode) {
        //Frontwerfer stufen -> enum Cannonsteps
        //Dachwerfer stufen -> enum A(500) B(1000) C(2500)
        String result="";
        int intMode = 0;
        String turret = null;
        if (mode.equals("A") || mode.equals("B") || mode.equals("C")) {
            turret = "Roof";
        } else {
            if (mode.equals("c0")) {
                turret = "Floor";
            }
            turret = "Front";
        }
        result=turret;
        switch (mode) {
            case A -> intMode = 500;
            case B -> intMode = 1000;
            case C -> intMode = 2500;
            case c500 -> intMode = 500;
            case c1000 -> intMode = 1000;
            case c1500 -> intMode = 1500;
            case c2000 -> intMode = 2000;
            case c2500 -> intMode = 2500;
            case c3000 -> intMode = 3000;
            case c3500 -> intMode = 3500;
            case c0 -> intMode = 100;
        }
        result=result+" "+intMode;
        return result;
    }
    public void setField(char[] water, char[] foam){
        this.water=water;
        this.foam=foam;
    };

    public char[] getMix(char[] water,char[] foam){
        char[] mix = new char[water.length + foam.length];
        xSprayMixture.getMix(water,foam);
        return mix;
    }

    public char[] getWater() {return xSprayMixture.getMix(water, foam);}
    public void setxSprayMixture(SprayMixture xSprayMixture) {
        this.xSprayMixture = xSprayMixture;
    }

    public class Port implements IMixingPlant {
        public String mixing(MixingRatio mixture, Mode mode){return mix(mixture, mode);}
        public char[] getMixing(char[] water,char[] foam){return getMix(water,foam);}
        public char[] getWater(char[] water,char[] foam){return getMix(water,foam);}
    }
}