public class Su27 extends Aircraft implements AccessibilityAircraft{
    int maxSpeed;
    String color;

    public Su27 (int maxSpeed, String color, double length,
            double weight, double width) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.length = length;
        this.weight = weight;
        this.width = width;
    }

    @Override
    public void TurboAcceleration ( ) {
        System.out.println ("Turbo acceleration speed is " + (maxSpeed + (1 + (int) (Math.random() * 100))) + " km/h" );
    }

    @Override
    public void StealthTechnology ( ) {
        System.out.println ("The plane is not visible for " +  (1 + (int) (Math.random() * 10)) + " seconds");
    }

    @Override
    public void NuclearStrike ( ) {
        System.out.println ("The number of nuclear warheads that will be dropped is " + (1 + (int) (Math.random() * 10)) );
    }


}
