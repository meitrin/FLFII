package Cabin;

public class ResidualQuantitiesDisplay {

    double residualEnergy;

    public ResidualQuantitiesDisplay(double residualEnergy) {
        this.residualEnergy = residualEnergy;
    }

    public void updateDisplay(double energy) {
        residualEnergy = -energy * 25;
    }

}
