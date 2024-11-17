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
    }

}