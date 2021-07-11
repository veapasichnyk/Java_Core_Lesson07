public abstract class Aircraft extends AircraftControl  {
    double length;
    double weight;
    double width;

    void StartingEngines () {
        System.out.println ((20 + (int) (Math.random() * 88)) + " seconds left to fly readiness" );
    }
    void AircraftTakingOff () {
        System.out.println ("On a full tank of fuel the plane will fly " +
                            (0 + (int) (Math.random() * 1000)) + " kilometers" );
    }
    void AircraftLanding () {
        System.out.println ("The plane is landing" );
    }
}
