package Cabin;

import FLF.CentralUnit;
import FLF.ControlPanel;
import Persons.Person;
import Turrets.RotaryKnob;

public class Cabin {

    private ControlPanel xControlPanel;
    private BusDoor[] xBusDoor;
    private Speedometer xSpeedometer;
    private ResidualQuantitiesDisplay xResidualQuantitiesDisplay;
    private JoyStick xJoystick;
    private RotaryKnob xRotaryKnob;
    private Seat[] xSeat;
    private OperatorSection xOperatorsection;
    private DriverSection xDriversection;
    private CentralUnit xCentralUnit;

    public Cabin(BusDoor[] xBusDoor, ResidualQuantitiesDisplay xResidualQuantitiesDisplay, Speedometer xSpeedometer, JoyStick xJoyStick, Seat[] xSeat, RotaryKnob xRotaryKnob, OperatorSection xOperatorSection, DriverSection xDriverSection, CentralUnit xCentralUnit) {
        this.xBusDoor = xBusDoor;
        this.xResidualQuantitiesDisplay = xResidualQuantitiesDisplay;
        this.xSpeedometer = xSpeedometer;
        this.xJoystick = xJoyStick;
        this.xSeat = xSeat;
        this.xRotaryKnob = xRotaryKnob;
        this.xOperatorsection = xOperatorSection;
        this.xDriversection = xDriverSection;
        this.xCentralUnit = xCentralUnit;
    }

    public Seat[] getxSeat() {
        return xSeat;
    }

    public void leaveAllSeats(Seat[] seat) {
        for (int i = 0; i < 4; i++) {
            seat[i].setIsused(false);
        }
    }

    public void sitDown(String person) {
        if (person.equals("Driver")) {
            xSeat[0].setIsused(true);
        } else xSeat[1].setIsused(true);
    }

    public void leaveSeat(Person person) {
        if (person.equals("Driver")) {
            xSeat[0].setIsused(false);
        } else if (person.equals("Operator")) {
            xSeat[1].setIsused(false);
        }
    }

    public CentralUnit getxCentralUnit() {
        return xCentralUnit;
    }

    public RotaryKnob getxRotaryKnob() {
        return xRotaryKnob;
    }

    public OperatorSection getxOperatorSection() {
        return xOperatorsection;
    }

    public DriverSection getxDriverSection() {
        return xDriversection;
    }

    public Speedometer getxSpeedometer() {
        return xSpeedometer;
    }

    public ResidualQuantitiesDisplay getxResidualQuantitiesDisplay() {
        return xResidualQuantitiesDisplay;
    }

    public BusDoor[] getxBusDoor() {
        return xBusDoor;
    }
}