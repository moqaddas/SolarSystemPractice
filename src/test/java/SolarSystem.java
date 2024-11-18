public class SolarSystem {
    public static void main(String[] args) {
        BasicStructure bb = new BasicStructure();
        bb.Planet = "Mercury";
        bb.Moon = "Moon";
        bb.Sun = "Sun";
        bb.Stars = "Stars";
        System.out.println("Solar System: " + bb.Planet + " " + bb.Moon + " " + bb.Sun + " " + bb.Stars);

        FeatureSun fs = new FeatureSun();
        fs.Color = "Yellow";
        fs.Size = "Small";
        fs.Temperature = "Warm";
        System.out.println("Sun: " + fs.Color + " " + fs.Size + " " + fs.Temperature);

        Planet1 p1 = new Planet1();
        p1.Color = "Blue";
        p1.Size = "Large";
        p1.Temperature = "Cold";
        System.out.println("Planet: " + p1.Color + " " + p1.Size + " " + p1.Temperature);
    }

}