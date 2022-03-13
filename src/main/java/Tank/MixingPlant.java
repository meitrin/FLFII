package Tank;

import Turrets.FloorSprayNozzles;
import Turrets.FrontWaterCannon;
import Turrets.Mode;
import Turrets.RoofExtinguishingArm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Array;

public class MixingPlant {

    private final Object mixingPlantPort;
    private WaterTank xWaterTank;
    private FoamTank xFoamTank;
    private FloorSprayNozzles[] xFloorSprayNozzles;
    private RoofExtinguishingArm xRoofExtinguishingArm;
    private FrontWaterCannon xFrontWaterCannon;

    public MixingPlant(FoamTank xFoamTank, WaterTank xWaterTank){
        this.xWaterTank=xWaterTank;
        this.xFoamTank=xFoamTank;
        this.mixingPlantPort=MixingPlantFactory.build();
    }

    public void mix(MixingRatio mixture, Mode mode) throws Exception{
        String result="";
        String[] helper;
        Method mix= mixingPlantPort.getClass().getDeclaredMethod("mixing", Enum.class,Enum.class);
        result= (String) mix.invoke(mixingPlantPort,mixture,mode);
        helper=result.split(" ");
        switch (mixture) {
            case ZEROPERCENT -> mix(xWaterTank.water(Integer.parseInt(helper[1])), xFoamTank.foam(0), helper[0]);
            case THREEPERCENT -> {
                mix((xWaterTank.water((int) (Integer.parseInt(helper[1]) * 0.97))), xFoamTank.foam((int) (Integer.parseInt(helper[1]) * 0.03)), helper[0]);
            }
            case FIVEPERCENT -> {
                mix(xWaterTank.water((int) (Integer.parseInt(helper[1]) * 0.95)), xFoamTank.foam((int) (Integer.parseInt(helper[1]) * 0.05)), helper[0]);
            }
            case TENPERCENT -> {
                mix(xWaterTank.water((int) (Integer.parseInt(helper[1]) * 0.90)), xFoamTank.foam((int) (Integer.parseInt(helper[1]) * 0.1)), helper[0]);
            }
        }

    }

    public void mix(char[] water, char[] foam, String turret) throws Exception {
        //übregabe an jeweiligen turret mit attribut turret
        Method getMix = mixingPlantPort.getClass().getDeclaredMethod("getMixing", Array.class,Array.class);
        if (turret.equals("Roof")) {
            xRoofExtinguishingArm.spray((char[]) getMix.invoke(mixingPlantPort,water,foam));
            //an roof übergeben!
        } else {
            if (turret.equals("Front")) {
                xFrontWaterCannon.spray((char[]) getMix.invoke(mixingPlantPort,water,foam));
                //an front übergeben!
            } else {
                for (int i = 0; i < 4; i++) {
                    xFloorSprayNozzles[i].sprayWater((char[]) getMix.invoke(mixingPlantPort,water,foam));
                }
            }
        }
    }

    public void setxFrontWaterCannon(FrontWaterCannon xFrontWaterCannon) {
        this.xFrontWaterCannon = xFrontWaterCannon;
    }

    public void setxRoofExtinguishingArm(RoofExtinguishingArm xRoofExtinguishingArm) {
        this.xRoofExtinguishingArm = xRoofExtinguishingArm;
    }

    public void setxFloorSprayNozzles(FloorSprayNozzles[] xFloorSprayNozzles) {
        this.xFloorSprayNozzles = xFloorSprayNozzles;
    }
    public char[] getWater() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        char[] water;
        Method getMix = mixingPlantPort.getClass().getDeclaredMethod("getMixing", Array.class,Array.class);
        water= (char[]) getMix.invoke(mixingPlantPort,xWaterTank.water((int) 100),xFoamTank.foam((int) (0)));
        return water;
    }
}
