public interface IMixingPlant {
    public String mixing(MixingRatio mixture, Mode mode);
    public char[] getMixing(char[] water,char[] foam);
    public char[] getWater(char[] water,char[] foam);
}
