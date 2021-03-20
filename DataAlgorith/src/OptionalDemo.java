import java.util.Optional;

public class OptionalDemo {

  public static void main(String[] args) {

    Optional<PrimeMinister> pm = Optional.of(new PrimeMinister());
    String pmName = pm.map(PrimeMinister::getName).orElse("None");
    System.out.println(pmName);

    // Assign Some Value to PrimeMinister.name
    pm = Optional.of(new PrimeMinister("Narendra Modi"));
    pmName = pm.map(PrimeMinister::getName).orElse("None");
    System.out.println(pmName);

    // Assign Some Value to PrimeMinister.name
    Optional<PrimeMinister> pm1 = Optional.ofNullable(new PrimeMinister("Narendra Modi"));
    String pmName1 = pm1.map(PrimeMinister::getName).orElse("None");
    System.out.println(pmName1);

    PrimeMinister primeMinister = null;
    pm1 = Optional.ofNullable(primeMinister);
    pmName1 = pm1.map(PrimeMinister::getName).orElse("None");
    System.out.println(pmName1);

    //NullPointerException requireNonNull
    Optional<PrimeMinister> pm4 = Optional.of(primeMinister);
    String pmName4 = pm4.map(PrimeMinister::getName).orElse("None");
    System.out.println(pmName4);

  }
}
