package FLF;

import Cabin.*;
import Cabin.extensions.IntelligientJoyStickFront;
import Cabin.extensions.IntelligientJoyStickRoof;
import Engine.Battery;
import Engine.BatteryManagement;
import Engine.ElectricEngine;
import Engine.TwoTwoBox;
import Lights.*;
import Persons.Driver;
import Persons.Employees;
import Persons.Operator;
import Persons.Person;
import Pivots.*;
import Tank.*;
import Turrets.*;

public class FLF {
    //<editor-fold desc="Attribute">
    private IntelligientJoyStickRoof xIntelligientJoyStickRoof;
    private IntelligientJoyStickFront xIntelligientJoyStickFront;
    private Pivot[] xPivot;
    private FirstSegment xFirstSegment;
    private SecondSegment[] xSecondSegment;
    private CentralUnit xCentralUnit;
    private Cabin xCabin;
    private ControlPanel xControlPanel;
    private FloorSprayNozzles[] xFloorSprayNozzles;
    private Person xPerson;

    //Lichter
    //private BlueLight xBlueLight;
    private SmallLightBlue[] xSmallLightBlue;
    private MidLightBlue[] xMidLightBlue;
    private LargeLightBlue[] xLargeLightBlue;
    private DirectionsIndicator[] xDirectionsIndicator;
    private BreakLight[] xBreakLight;
    private Headlights[] xHeadlights;
    private WarnLight[] xWarnLight;
    private LightPosition xLightPosition;
    private SideLight[] xSideLight;

    //restliche Klassen
    //Person
    private Operator xOperator;
    private Driver xDriver;
    private Employees xEmployees;

    //Pivot
    private Tire[] xTire;
    private BrakeDisc[] xBrakeDisc;
    private PivotDynamic xPivotDynamic;
    private PivotStatic xPivotStatic;

    //Engine
    private Battery[] xBattery;
    private TwoTwoBox xTwoTwoBox;
    private ElectricEngine[] xElectricEngine;
    private BatteryManagement xBatteryManagement;

    //Cabin
    private BusDoor[] xBusDoor;
    private IBusDoorEntry[] xIBusDoorEntry;
    private Button[] xButton;
    private Seat[] xSeat;
    private Respirators xRespirators;
    private Speedometer xSpeedometer;
    private ResidualQuantitiesDisplay xResidualQuantitiesDisplay;
    private OperatorSection xOperatorSection;
    private DriverSection xDriverSection;
    private IPedal xIPedal;
    private Accelerator xAccelerator;
    private BrakePedal xBrakePedal;
    private SteeringWheel xSteeringWheel;
    private IStreeringWheel xISteeringWheel;

    //Switch
    private Switch[] xSwitch;
    private SwitchType xSwitchType;

    //Cannon
    private SecondSeg xSecondSeg;
    private RoofExtinguishingArm xRoofExtinguishingArm;
    private FrontWaterCannon xFrontWaterCannon;
    private RotaryKnobFrontWaterCannon xRotaryKnobFrontWaterCannon;
    private RotaryKnobRoofExtinguishingArm xRotaryKnobRoofExtinguishingArm;
    private RotaryKnob xRotaryKnob;
    private IRotaryKnob xIRotaryKnob;
    private Mode xMode;
    private JoyStick xJoyStick;
    private JoyStickFront xJoyStickFront;
    private JoyStickRoof xJoyStickRoof;

    //Tank
    private FoamTank xFoamTank;
    private WaterTank xWaterTank;
    private MixingPlant xMixingPlant;
    private MixingRatio xMixingRatio;
    private Pedal[] xPedal;

    private FLF(Builder builder) {
        xIntelligientJoyStickFront = builder.xIntelligientJoyStickFront;
        xIntelligientJoyStickRoof = builder.xIntelligientJoyStickRoof;
        xSideLight = builder.xSideLight;
        xPivot = builder.xPivot;
        xCentralUnit = builder.xCentralUnit;
        xCabin = builder.xCabin;
        xControlPanel = builder.xControlPanel;
        xFloorSprayNozzles = builder.xFloorSprayNozzles;
        xPerson = builder.xPerson;
        // xBlueLight = builder.xBlueLight;
        xSmallLightBlue = builder.xSmallLightBlue;
        xMidLightBlue = builder.xMidLightBlue;
        xLargeLightBlue = builder.xLargeLightBlue;
        xDirectionsIndicator = builder.xDirectionsIndicator;
        xBreakLight = builder.xBreakLight;
        xHeadlights = builder.xHeadlights;
        xWarnLight = builder.xWarnLight;
        xLightPosition = builder.xLightPosition;
        xOperator = builder.xOperator;
        xDriver = builder.xDriver;
        xEmployees = builder.xEmployees;
        xTire = builder.xTire;
        xBrakeDisc = builder.xBrakeDisc;
        xPivotDynamic = builder.xPivotDynamic;
        xPivotStatic = builder.xPivotStatic;
        xBattery = builder.xBattery;
        xTwoTwoBox = builder.xTwoTwoBox;
        xElectricEngine = builder.xElectricEngine;
        xBatteryManagement = builder.xBatteryManagement;
        xBusDoor = builder.xBusDoor;
        xIBusDoorEntry = builder.xIBusDoorEntry;
        xButton = builder.xButton;
        xSeat = builder.xSeat;
        xRespirators = builder.xRespirators;
        xSpeedometer = builder.xSpeedometer;
        xResidualQuantitiesDisplay = builder.xResidualQuantitiesDisplay;
        xOperatorSection = builder.xOperatorSection;
        xDriverSection = builder.xDriverSection;
        xPedal = builder.xPedal;
        xIPedal = builder.xIPedal;
        xAccelerator = builder.xAccelerator;
        xBrakePedal = builder.xBrakePedal;
        xSteeringWheel = builder.xSteeringWheel;
        xISteeringWheel = builder.xISteeringWheel;
        xSwitch = builder.xSwitch;
        xSwitchType = builder.xSwitchType;

        xSecondSeg = builder.xSecondSeg;
        xFirstSegment = builder.xFirstSegment;
        xSecondSegment = builder.xSecondSegment;
        xRoofExtinguishingArm = builder.xRoofExtinguishingArm;
        xFrontWaterCannon = builder.xFrontWaterCannon;
        xIRotaryKnob = builder.xIRotaryKnob;
        xRotaryKnob = builder.xRotaryKnob;
        xRotaryKnobRoofExtinguishingArm = builder.xRotaryKnobRoofExtinguishingArm;
        xRotaryKnobFrontWaterCannon = builder.xRotaryKnobFrontWaterCannon;
        xMode = builder.xMode;
        xJoyStick = builder.xJoyStick;
        xJoyStickFront = builder.xJoyStickFront;
        xJoyStickRoof = builder.xJoyStickRoof;
        xFoamTank = builder.xFoamTank;
        xWaterTank = builder.xWaterTank;
        xMixingPlant = builder.xMixingPlant;
        xMixingRatio = builder.xMixingRatio;
    }

    public void allLightsOff() throws Exception {
        if (xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.BLUELIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.BLUELIGHT);
        if (xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.HEADLIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.HEADLIGHT);
        if (xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.ROOFLIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.ROOFLIGHT);
        if (xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.WARNLIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.WARNLIGHT);
        if (xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.SIDELIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.SIDELIGHT);
    }

    public void allLightsOn() throws Exception {
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.BLUELIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.BLUELIGHT);
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.HEADLIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.HEADLIGHT);
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.ROOFLIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.ROOFLIGHT);
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.WARNLIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.WARNLIGHT);
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.SIDELIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.SIDELIGHT);
    }

    public void initalRotaryKnob() {
        //RotaryKnob und Joystick auf initial einstellen
        while (xCabin.getxRotaryKnob().getxRotaryKnobFrontWaterCannon().getMode() != Mode.c500) {
            xCabin.getxRotaryKnob().getxRotaryKnobFrontWaterCannon().rotateRight();
        }
        while (xCabin.getxRotaryKnob().getxRotaryKnobRoofExtinguishingArm().getMode() != Mode.A) {
            xCabin.getxRotaryKnob().getxRotaryKnobRoofExtinguishingArm().rotateRight();
        }
    }

    public void openBusDoors() {
        for(int i = 0; i < 2; i++){
            if(!xCabin.getxBusDoor()[i].isOpen()){
                xCabin.getxBusDoor()[i].getxButton().use(i, xCabin.getxBusDoor()[i].isOpen());
            }
        }
    }

    public void closeBusDoors() {
        for(int i = 0; i < 2; i++){
            if(xCabin.getxBusDoor()[i].isOpen()){
                xCabin.getxBusDoor()[i].getxButton().use(i, xCabin.getxBusDoor()[i].isOpen());
            }
        }
    }

    public void parking() throws Exception {
        xPerson.getxEmployees().load();
        initalRotaryKnob();
        allLightsOff();
        if (xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.ENGINE))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.ENGINE);
        if (xCabin.getxDriverSection().getxFrontWaterCannon().isActivated())
            xCabin.getxDriverSection().getxJoyStickFront().pushLeftPushButton();
        if (xCabin.getxOperatorSection().getxRoofExtinguishingArm().isExtended())
            xCabin.getxOperatorSection().getxJoyStickRoof().pushLeftPushButton();
        xCabin.leaveAllSeats(xSeat);
        openBusDoors();
    }

    public void controlDrive() throws Exception {
        xPerson.getxEmployees().load();
        openBusDoors();
        xCabin.sitDown("Driver");
        xCabin.sitDown("Operator");
        initalRotaryKnob();
        if (xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.BLUELIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.BLUELIGHT);
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.HEADLIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.HEADLIGHT);
        if (xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.ROOFLIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.ROOFLIGHT);
        if (xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.SIDELIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.SIDELIGHT);
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.WARNLIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.WARNLIGHT);
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.ENGINE))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.ENGINE);
        closeBusDoors();
        if (xCabin.getxDriverSection().getxFrontWaterCannon().isActivated())
            xCabin.getxDriverSection().getxJoyStickFront().pushLeftPushButton();
        if (xCabin.getxOperatorSection().getxRoofExtinguishingArm().isExtended())
            xCabin.getxOperatorSection().getxJoyStickRoof().pushLeftPushButton();
        for (int i = 0; i < 7; i++) { //7 iterationen auf 28kmh
            xCabin.getxDriverSection().getxAccelerator().press();
        }
        for (int i = 0; i < 5; i++) {//gerade aus fahren 5 Iterationen
            xCabin.getxDriverSection().getxAccelerator().constant();
        }
        xSteeringWheel.turn(-5);
        for (int i = 0; i < 3; i++) {//3 iterationen fahren
            xCabin.getxDriverSection().getxAccelerator().constant();
        }
        xSteeringWheel.turn(5);
        for (int i = 0; i < 5; i++) {        //5 iterationen gerade aus
            xCabin.getxDriverSection().getxAccelerator().constant();
        }
        xSteeringWheel.turn(5);
        for (int i = 0; i < 5; i++){
            xCabin.getxDriverSection().getxAccelerator().constant();
        }
        for(int i = 0; i < 7; i++){//7 iterationen bremsen auf 0kmh
            xCabin.getxDriverSection().getxBrakePedal().press();
        }
        //energieverbrauch korrekt
    }

    public void missionTrip() throws Exception {
        //Driver in Driversection!
        xPerson.getxEmployees().load();
        initalRotaryKnob();
        openBusDoors();
        xCabin.sitDown("Driver");
        xCabin.sitDown("Operator");
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.BLUELIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.BLUELIGHT);
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.HEADLIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.HEADLIGHT);
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.ROOFLIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.ROOFLIGHT);
        if (xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.SIDELIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.SIDELIGHT);
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.WARNLIGHT))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.WARNLIGHT);
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.ENGINE))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.ENGINE);
        closeBusDoors();
        if (xCabin.getxDriverSection().getxFrontWaterCannon().isActivated())
            xCabin.getxDriverSection().getxJoyStickFront().pushLeftPushButton();
        if (xCabin.getxOperatorSection().getxRoofExtinguishingArm().isExtended())
            xCabin.getxOperatorSection().getxJoyStickRoof().pushLeftPushButton();

        for (int i = 0; i < 20; i++) {//20 Iterationen beschleunigen
            xCabin.getxDriverSection().getxAccelerator().press();
        }
        for (int i = 0; i < 10; i++) {        //10 Iterationen gerade aus fahren ohne Beschleunigung
            xCabin.getxDriverSection().getxAccelerator().constant();
        }
        //korrekter Energieverbrauch nach der Fahrt prüfen

    }

    public void tankTruckOnFire() throws Exception {
        xPerson.getxEmployees().load();
        initalRotaryKnob();
        openBusDoors();
        xCabin.sitDown("Driver");
        xCabin.sitDown("Operator");
        allLightsOn();
        closeBusDoors();
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.ENGINE))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.ENGINE);

        //activate Turrets
        if (!xCabin.getxDriverSection().getxFrontWaterCannon().isActivated())
            xCabin.getxDriverSection().getxJoyStickFront().pushLeftPushButton();
        if (!xCabin.getxOperatorSection().getxRoofExtinguishingArm().isExtended())
            xCabin.getxOperatorSection().getxJoyStickRoof().pushLeftPushButton();

        //bodensprühdüsen einmal
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.FLOORSPRAY))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.FLOORSPRAY);
        for (int i = 0; i < 5; i++) xCabin.getxOperatorSection().getxRotaryKnobFrontWaterCannon().rotateRight();
        for (int i = 0; i < 2; i++) xCabin.getxOperatorSection().getxRotaryKnobRoofExtinguishingArm().rotateRight();

        //spray
        for (int i = 0; i < 2; i++) xCabin.getxDriverSection().getxJoyStickFront().pushRightPushButton();
        xCabin.getxOperatorSection().getxJoyStickRoof().pushRightPushButton();
        for (int i = 0; i < 3; i++) xCabin.getxDriverSection().getxJoyStickFront().pushButton();
        for (int i = 0; i < 3; i++) xCabin.getxOperatorSection().getxJoyStickRoof().pushButton();
    }

    public void tractorInFullFire() throws Exception {
        //Employee ladet Tanks und Batterien auf
        initalRotaryKnob();
        xPerson.getxEmployees().load();
        openBusDoors();
        xCabin.sitDown("Driver");
        xCabin.sitDown("Operator");
        allLightsOn();
        closeBusDoors();
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.ENGINE))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.ENGINE);
        if (!xCabin.getxDriverSection().getxFrontWaterCannon().isActivated())
            xCabin.getxDriverSection().getxJoyStickFront().pushLeftPushButton();
        if (!xCabin.getxOperatorSection().getxRoofExtinguishingArm().isExtended())
            xCabin.getxOperatorSection().getxJoyStickRoof().pushLeftPushButton();

        //Turrets
        //Font
        for (int i = 0; i < 3; i++) xCabin.getxDriverSection().getxJoyStickFront().pushRightPushButton();
        for (int i = 0; i < 6; i++){
            xCabin.getxOperatorSection().getxRotaryKnobFrontWaterCannon().rotateRight();
        }
        for (int i = 0; i < 3; i++) xCabin.getxDriverSection().getxJoyStickFront().pushButton();

        //Roof
        for (int i = 0; i < 2; i++) xCabin.getxOperatorSection().getxJoyStickRoof().pushRightPushButton();
        for (int i = 0; i < 2; i++){
            xCabin.getxOperatorSection().getxRotaryKnobRoofExtinguishingArm().rotateRight();
        }
        for (int i = 0; i < 5; i++) xCabin.getxOperatorSection().getxJoyStickRoof().pushButton();

        //Front
        for (int i = 0; i < 5; i++) xCabin.getxOperatorSection().getxRotaryKnobFrontWaterCannon().rotateLeft();
        for (int i = 0; i < 2; i++) xCabin.getxDriverSection().getxJoyStickFront().pushRightPushButton();
        for (int i = 0; i < 5; i++) xCabin.getxDriverSection().getxJoyStickFront().pushButton();

    }//fertig

    public void fireInEngine() throws Exception {
        //Employee ladet Tanks und Batterien auf
        initalRotaryKnob();
        xPerson.getxEmployees().load();
        openBusDoors();
        //Seats
        xCabin.sitDown("Driver");
        xCabin.sitDown("Operator");

        //Doors and Lights and Engine
        allLightsOn();
        closeBusDoors();
        if (!xCabin.getxOperatorSection().getxControlPanel().isSwitchOn(SwitchType.ENGINE))
            xCabin.getxOperatorSection().getxControlPanel().pressSwitch(SwitchType.ENGINE);

        //turrets activated
        if (!xCabin.getxDriverSection().getxFrontWaterCannon().isActivated())
            xCabin.getxDriverSection().getxJoyStickFront().pushLeftPushButton();
        if (!xCabin.getxOperatorSection().getxRoofExtinguishingArm().isExtended())
            xCabin.getxOperatorSection().getxJoyStickRoof().pushLeftPushButton();

        //turrets spray
        //frontturret
        for (int i = 0; i < 6; i++) xCabin.getxOperatorSection().getxRotaryKnobFrontWaterCannon().rotateRight();
        for (int i = 0; i < 3; i++) xCabin.getxDriverSection().getxJoyStickFront().pushRightPushButton();
        for (int i = 0; i < 5; i++) xCabin.getxDriverSection().getxJoyStickFront().pushButton();

        //roofturret
        for (int i = 0; i < 2; i++) xCabin.getxOperatorSection().getxRotaryKnobRoofExtinguishingArm().rotateRight();
        for (int i = 0; i < 3; i++) xCabin.getxOperatorSection().getxJoyStickRoof().pushRightPushButton();
        for (int i = 0; i < 10; i++) xCabin.getxOperatorSection().getxJoyStickRoof().pushButton();

        //frontturret
        for (int i = 0; i < 2; i++) xCabin.getxDriverSection().getxJoyStickFront().pushRightPushButton();
        for (int i = 0; i < 5; i++) xCabin.getxOperatorSection().getxRotaryKnobFrontWaterCannon().rotateLeft();
        for (int i = 0; i < 5; i++) xCabin.getxDriverSection().getxJoyStickFront().pushButton();
    }

    public Pivot[] getxPivot() {
        return xPivot;
    }
    public FirstSegment getxFirstSegment() {
        return xFirstSegment;
    }
    public SecondSegment[] getxSecondSegment() {
        return xSecondSegment;
    }
    public CentralUnit getxCentralUnit() {
        return xCentralUnit;
    }
    public Cabin getxCabin() {
        return xCabin;
    }
    public ControlPanel getxControlPanel() {
        return xControlPanel;
    }
    public FloorSprayNozzles[] getxFloorSprayNozzles() {
        return xFloorSprayNozzles;
    }
    public Person getxPerson() {
        return xPerson;
    }
    public SmallLightBlue[] getxSmallLightBlue() {
        return xSmallLightBlue;
    }
    public MidLightBlue[] getxMidLightBlue() {
        return xMidLightBlue;
    }
    public LargeLightBlue[] getxLargeLightBlue() {
        return xLargeLightBlue;
    }
    public DirectionsIndicator[] getxDirectionsIndicator() {
        return xDirectionsIndicator;
    }
    public BreakLight[] getxBreakLight() {
        return xBreakLight;
    }
    public Headlights[] getxHeadlights() {
        return xHeadlights;
    }
    public WarnLight[] getxWarnLight() {
        return xWarnLight;
    }
    public Operator getxOperator() {
        return xOperator;
    }
    public Driver getxDriver() {
        return xDriver;
    }
    public Employees getxEmployees() {
        return xEmployees;
    }
    public Tire[] getxTire() {
        return xTire;
    }
    public BrakeDisc[] getxBrakeDisc() {
        return xBrakeDisc;
    }
    public PivotDynamic getxPivotDynamic() {
        return xPivotDynamic;
    }
    public PivotStatic getxPivotStatic() {
        return xPivotStatic;
    }
    public Battery[] getxBattery() {
        return xBattery;
    }
    public TwoTwoBox getxTwoTwoBox() {
        return xTwoTwoBox;
    }
    public ElectricEngine[] getxElectricEngine() {
        return xElectricEngine;
    }
    public BusDoor[] getxBusDoor() {
        return xBusDoor;
    }
    public IBusDoorEntry[] getxIBusDoorEntry() {
        return xIBusDoorEntry;
    }
    public Button[] getxButton() {
        return xButton;
    }
    public Seat[] getxSeat() {
        return xSeat;
    }
    public Respirators getxRespirators() {
        return xRespirators;
    }
    public Speedometer getxSpeedometer() {
        return xSpeedometer;
    }
    public ResidualQuantitiesDisplay getxResidualQuantitiesDisplay() {
        return xResidualQuantitiesDisplay;
    }
    public OperatorSection getxOperatorSection() {
        return xOperatorSection;
    }
    public DriverSection getxDriverSection() {
        return xDriverSection;
    }
    public Pedal[] getxPedal() {
        return xPedal;
    }
    public Accelerator getxAccelerator() {
        return xAccelerator;
    }
    public BrakePedal getxBrakePedal() {
        return xBrakePedal;
    }
    public SteeringWheel getxSteeringWheel() {
        return xSteeringWheel;
    }
    public Switch[] getxSwitch() {
        return xSwitch;
    }
    public RoofExtinguishingArm getxRoofExtinguishingArm() {
        return xRoofExtinguishingArm;
    }
    public FrontWaterCannon getxFrontWaterCannon() {
        return xFrontWaterCannon;
    }
    public RotaryKnobFrontWaterCannon getxRotaryKnobFrontWaterCannon() {
        return xRotaryKnobFrontWaterCannon;
    }
    public RotaryKnobRoofExtinguishingArm getxRotaryKnobRoofExtinguishingArm() {
        return xRotaryKnobRoofExtinguishingArm;
    }
    public IntelligientJoyStickRoof getxIntelligientJoyStickRoof() {
        return xIntelligientJoyStickRoof;
    }
    public IntelligientJoyStickFront getxIntelligientJoyStickFront() {
        return xIntelligientJoyStickFront;
    }
    public JoyStickFront getxJoyStickFront() {
        return xJoyStickFront;
    }
    public SideLight[] getxSideLight() {
        return xSideLight;
    }
    public JoyStickRoof getxJoyStickRoof() {
        return xJoyStickRoof;
    }
    public FoamTank getxFoamTank() {
        return xFoamTank;
    }
    public WaterTank getxWaterTank() {
        return xWaterTank;
    }
    public MixingPlant getxMixingPlant() {
        return xMixingPlant;
    }

    public static class Builder {
        private Pivot[] xPivot;
        private IntelligientJoyStickFront xIntelligientJoyStickFront;
        private IntelligientJoyStickRoof xIntelligientJoyStickRoof;
        private CentralUnit xCentralUnit;
        private Cabin xCabin;
        private ControlPanel xControlPanel;
        private Tank xTank;
        private FloorSprayNozzles[] xFloorSprayNozzles;

        //Lichter
        private SmallLightBlue[] xSmallLightBlue;
        private MidLightBlue[] xMidLightBlue;
        private LargeLightBlue[] xLargeLightBlue;
        private DirectionsIndicator[] xDirectionsIndicator;
        private BreakLight[] xBreakLight;
        private Headlights[] xHeadlights;
        private WarnLight[] xWarnLight;
        private LightPosition xLightPosition;
        private SideLight[] xSideLight;

        //restliche Klassen
        private Operator xOperator;
        private Driver xDriver;
        private Employees xEmployees;
        private Person xPerson;

        //Pivot
        private Tire[] xTire;
        private BrakeDisc[] xBrakeDisc;
        private PivotDynamic xPivotDynamic;
        private PivotStatic xPivotStatic;

        //Engine
        private Battery[] xBattery;
        private TwoTwoBox xTwoTwoBox;
        private ElectricEngine[] xElectricEngine;
        private BatteryManagement xBatteryManagement;

        //Cabin
        private BusDoor[] xBusDoor;
        private IBusDoorEntry[] xIBusDoorEntry;
        private Button[] xButton;
        private Seat[] xSeat;
        private Respirators xRespirators;
        private Speedometer xSpeedometer;
        private ResidualQuantitiesDisplay xResidualQuantitiesDisplay;
        private OperatorSection xOperatorSection;
        private DriverSection xDriverSection;
        private IPedal xIPedal;
        private Accelerator xAccelerator;
        private BrakePedal xBrakePedal;
        private SteeringWheel xSteeringWheel;
        private IStreeringWheel xISteeringWheel;

        //Switch
        private Switch[] xSwitch;
        private SwitchType xSwitchType;

        //Cannon
        private SecondSeg xSecondSeg;
        private FirstSegment xFirstSegment;
        private SecondSegment[] xSecondSegment;
        private RoofExtinguishingArm xRoofExtinguishingArm;
        private Turret xTurret;
        private FrontWaterCannon xFrontWaterCannon;
        private RotaryKnob xRotaryKnob;
        private IRotaryKnob xIRotaryKnob;
        private RotaryKnobRoofExtinguishingArm xRotaryKnobRoofExtinguishingArm;
        private RotaryKnobFrontWaterCannon xRotaryKnobFrontWaterCannon;
        private Mode xMode;
        private JoyStick xJoyStick;
        private JoyStickFront xJoyStickFront;
        private JoyStickRoof xJoyStickRoof;
        //Tank
        private FoamTank xFoamTank;
        private WaterTank xWaterTank;
        private MixingPlant xMixingPlant;
        private MixingRatio xMixingRatio;
        private Pedal[] xPedal;

        //Klassen an FLF erstellen mit Unterklassen
        public Builder() {
            xFloorSprayNozzles = new FloorSprayNozzles[]{new FloorSprayNozzles(1, xCentralUnit.getxFLF()), new FloorSprayNozzles(1, xCentralUnit.getxFLF()), new FloorSprayNozzles(1, xCentralUnit.getxFLF()),
                    new FloorSprayNozzles(1, xCentralUnit.getxFLF()), new FloorSprayNozzles(1, xCentralUnit.getxFLF()), new FloorSprayNozzles(1, xCentralUnit.getxFLF()), new FloorSprayNozzles(1, xCentralUnit.getxFLF())};
            for (int i = 0; i < 7; i++) {
                xFloorSprayNozzles[i].setpWaterTank(xWaterTank);
            }

            //buildPivotDynamic
            xPivotDynamic = new PivotDynamic();
            xTire = new Tire[]{new Tire(), new Tire()};
            for (int i = 0; i < 2; i++) {
                xBrakeDisc = new BrakeDisc[]{new BrakeDisc(), new BrakeDisc(), new BrakeDisc()};
                xTire[i].setxBrakeDisc(xBrakeDisc);
            }
            xPivotDynamic.setxTire(xTire);

            //buildPivotStatic
            xPivotStatic = new PivotStatic();
            xTire = new Tire[]{new Tire(), new Tire()};
            for (int i = 0; i < 2; i++) {
                xBrakeDisc = new BrakeDisc[]{new BrakeDisc(), new BrakeDisc(), new BrakeDisc()};
                xTire[i].setxBrakeDisc(xBrakeDisc);
            }
            xPivotStatic.setxTire(xTire);
            for (int i = 0; i < 2; i++) {
                xPivot = new Pivot[]{xPivotStatic, xPivotStatic, xPivotDynamic, xPivotDynamic};
            }

            //buildLights
            xSmallLightBlue = new SmallLightBlue[]{new SmallLightBlue(LightPosition.FRONT,1), new SmallLightBlue(LightPosition.FRONT,1)};
            xMidLightBlue = new MidLightBlue[]{new MidLightBlue(LightPosition.ROOFBACKLEFT,1), new MidLightBlue(LightPosition.ROOFBACKLEFT,1), new MidLightBlue(LightPosition.ROOFBACKRIGHT,1), new MidLightBlue(LightPosition.ROOFBACKRIGHT,1)};
            xLargeLightBlue = new LargeLightBlue[]{new LargeLightBlue(LightPosition.ROOFFRONTLEFT,1), new LargeLightBlue(LightPosition.ROOFFRONTLEFT,1), new LargeLightBlue(LightPosition.ROOFFRONTRIGHT,1), new LargeLightBlue(LightPosition.ROOFFRONTRIGHT,1)};
            xWarnLight = new WarnLight[]{new WarnLight(LightPosition.ROOFFRONTLEFT,1), new WarnLight(LightPosition.ROOFBACKRIGHT,1)};
            xDirectionsIndicator = new DirectionsIndicator[]{new DirectionsIndicator(LightPosition.SIDEFRONTLEFT), new DirectionsIndicator(LightPosition.SIDEFRONTRIGHT), new DirectionsIndicator(LightPosition.SIDEBACKLEFT), new DirectionsIndicator(LightPosition.SIDEBACKRIGHT)};
            xHeadlights = new Headlights[]{new Headlights(LightPosition.SIDEFRONTLEFT,1), new Headlights(LightPosition.SIDEFRONTLEFT,1), new Headlights(LightPosition.SIDEFRONTLEFT,1),
                    new Headlights(LightPosition.SIDEFRONTRIGHT,1), new Headlights(LightPosition.SIDEFRONTRIGHT,1), new Headlights(LightPosition.SIDEFRONTRIGHT,1),
                    new Headlights(LightPosition.FRONT,1), new Headlights(LightPosition.FRONT,1), new Headlights(LightPosition.FRONT,1), new Headlights(LightPosition.FRONT,1)};
            xBreakLight = new BreakLight[]{new BreakLight(LightPosition.BACK), new BreakLight(LightPosition.BACK)};
            xSideLight = new SideLight[]{new SideLight(LightPosition.LEFT,1), new SideLight(LightPosition.LEFT,1), new SideLight(LightPosition.LEFT,1), new SideLight(LightPosition.LEFT,1), new SideLight(LightPosition.LEFT,1),
                    new SideLight(LightPosition.RIGHT,1), new SideLight(LightPosition.RIGHT,1), new SideLight(LightPosition.RIGHT,1), new SideLight(LightPosition.RIGHT,1), new SideLight(LightPosition.RIGHT,1)};

            //Cabin
            xSpeedometer = new Speedometer();
            xJoyStickFront = new JoyStickFront();
            xJoyStickRoof = new JoyStickRoof();
            xRotaryKnobRoofExtinguishingArm = new RotaryKnobRoofExtinguishingArm();
            xRotaryKnobFrontWaterCannon = new RotaryKnobFrontWaterCannon();
            xRotaryKnob = new RotaryKnob(xRotaryKnobFrontWaterCannon, xRotaryKnobRoofExtinguishingArm);
            xButton = new Button[]{new Button(LeftRightPosition.LEFT), new Button(LeftRightPosition.RIGHT)};
            xBrakePedal = new BrakePedal();
            xBusDoor = new BusDoor[]{new BusDoor(LeftRightPosition.LEFT), new BusDoor(LeftRightPosition.RIGHT)};
            xSeat = new Seat[]{new Seat(LeftRightPosition.LEFT), new Seat(LeftRightPosition.RIGHT), new Seat(LeftRightPosition.BACKLEFT), new Seat(LeftRightPosition.BACKRIGHT)};
            xSteeringWheel = new SteeringWheel();
            xSwitch = new Switch[]{new Switch(SwitchType.BLUELIGHT), new Switch(SwitchType.ENGINE), new Switch(SwitchType.FLOORSPRAY), new Switch(SwitchType.HEADLIGHT), new Switch(SwitchType.ROOFLIGHT), new Switch(SwitchType.SIDELIGHT), new Switch(SwitchType.WARNLIGHT)};
            xResidualQuantitiesDisplay = new ResidualQuantitiesDisplay(100.0);
            xAccelerator = new Accelerator();
            xPedal = new Pedal[]{xAccelerator, xBrakePedal};
            for (int i = 0; i < 4; i++) {
                Respirators xRespirators = new Respirators();
                xSeat[i].setxRespirators(xRespirators);
            }
            for (int i = 0; i < 2; i++) {
                //beispielsweise mit button, auch IDCard möglich
                //xIBusDoorEntry = new IBusDoorEntry[xButton[i]];
                xBusDoor[i].setxButton(xButton[i]);
            }

            //Engine
            xBattery = new Battery[]{new Battery(), new Battery(), new Battery(), new Battery()};
            xTwoTwoBox = new TwoTwoBox();
            xTwoTwoBox.setxBattery(xBattery);
            xElectricEngine = new ElectricEngine[]{new ElectricEngine(0), new ElectricEngine(1)};

            //Tank
            xFoamTank = new FoamTank();
            xWaterTank = new WaterTank();
            xMixingPlant = new MixingPlant(xFoamTank, xWaterTank);

            //Turrets
            xFrontWaterCannon = new FrontWaterCannon();
            xSecondSegment = new SecondSegment[]{new SecondSegment(SecondSeg.SIXMETER), new SecondSegment(SecondSeg.SIXMETER), new SecondSegment(SecondSeg.FIVEMETER)};
            xFirstSegment = new FirstSegment();
            xRoofExtinguishingArm = new RoofExtinguishingArm(xSecondSegment, xFirstSegment);
            xFrontWaterCannon.setxMixingPlant(xMixingPlant);
            xRoofExtinguishingArm.setxMixingPlant(xMixingPlant);

            //Person
            xOperator = new Operator();
            xDriver = new Driver();
            xEmployees = new Employees();
            xPerson = new Person(xEmployees, xDriver, xOperator);

            //build mainclasses
            xControlPanel = new ControlPanel(xSwitch);
            xCentralUnit = new CentralUnit(xSteeringWheel, xAccelerator, xBrakePedal, xControlPanel);
            xOperatorSection = new OperatorSection(xJoyStickRoof, xControlPanel, xRoofExtinguishingArm);
            xDriverSection = new DriverSection(xAccelerator, xBrakePedal, xJoyStickFront, xFrontWaterCannon);
            xCabin = new Cabin(xBusDoor, xResidualQuantitiesDisplay, xSpeedometer, xJoyStick, xSeat, xRotaryKnob, xOperatorSection, xDriverSection, xCentralUnit);
            xIntelligientJoyStickFront = new IntelligientJoyStickFront();
            xIntelligientJoyStickRoof = new IntelligientJoyStickRoof();
        }

        public FLF build() {
            FLF flf = new FLF(this);
            //setter für nachträgliches hinzufügen
            flf.getxControlPanel().setxCentralUnit(xCentralUnit);
            flf.getxEmployees().setxWaterTank(xWaterTank);
            flf.getxEmployees().setxFoamTank(xFoamTank);
            flf.getxCentralUnit().setxFLF(flf);
            flf.getxAccelerator().setxCentralUnit(xCentralUnit);
            flf.getxCentralUnit().setxCabin(xCabin);
            flf.getxBrakePedal().setxCentralUnit(xCentralUnit);
            flf.getxJoyStickFront().setxFrontWaterCannon(xFrontWaterCannon);
            flf.getxFrontWaterCannon().setxRotaryKnobFrontWaterCannon(xRotaryKnobFrontWaterCannon);
            flf.getxDriverSection().setxDriver(xDriver);
            flf.getxOperatorSection().setxOperator(xOperator);
            flf.getxSteeringWheel().setxCentralUnit(xCentralUnit);
            flf.getxMixingPlant().setxFrontWaterCannon(xFrontWaterCannon);
            flf.getxMixingPlant().setxRoofExtinguishingArm(xRoofExtinguishingArm);
            flf.getxMixingPlant().setxFloorSprayNozzles(xFloorSprayNozzles);
            flf.getxOperatorSection().setxRotaryKnobRoofExtinguishingArm(xRotaryKnobRoofExtinguishingArm);
            flf.getxOperatorSection().setxRotaryKnobFrontWaterCannon(xRotaryKnobFrontWaterCannon);
            flf.getxJoyStickRoof().setFLF(flf);
            flf.getxJoyStickFront().setFLF(flf);
            flf.getxJoyStickFront().setxMixingPlant(xMixingPlant);
            BatteryManagement.instance.setTwoTwoBox(xTwoTwoBox);
            flf.getxJoyStickRoof().setxMixingPlant(xMixingPlant);
            flf.getxJoyStickRoof().setxRoofExtinguishingArm(xRoofExtinguishingArm);
            flf.getxJoyStickRoof().setxRotaryKnobRoofExtinguishingArm(xRotaryKnobRoofExtinguishingArm);
            flf.getxIntelligientJoyStickFront().setxFrontWaterCannon(xFrontWaterCannon);
            flf.getxIntelligientJoyStickFront().setxMixingPlant(xMixingPlant);
            flf.getxIntelligientJoyStickRoof().setxMixingPlant(xMixingPlant);
            flf.getxIntelligientJoyStickRoof().setxRoofExtinguishingArm(xRoofExtinguishingArm);
            flf.getxRoofExtinguishingArm().setxRotaryKnobRoofExtinguishingArm(xRotaryKnobRoofExtinguishingArm);
            for(int i = 0; i < 2; i++) flf.getxButton()[i].setCabin(xCabin);
            return flf;
        }
    }
}