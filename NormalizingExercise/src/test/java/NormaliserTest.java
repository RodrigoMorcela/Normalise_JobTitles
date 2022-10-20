import org.example.Normaliser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NormaliserTest {

    @Test
    public void CheckNormalizationForChiefAccountant(){

        String jt = "Chief Accountant";
        Normaliser n = new Normaliser();
        String normalisedTitle = n.normalise(jt);
        Assertions.assertEquals(normalisedTitle, "Accountant");

    }

    @Test
    public void CheckNormalizationForAccountant(){

        String jt = "Accountant";
        Normaliser n = new Normaliser();
        String normalisedTitle = n.normalise(jt);
        Assertions.assertEquals(normalisedTitle, "Accountant");

    }

    @Test
    public void CheckNormalizationForJavaEngineer(){

        String jt = "Java engineer";
        Normaliser n = new Normaliser();
        String normalisedTitle = n.normalise(jt);
        Assertions.assertEquals(normalisedTitle, "Software engineer");

    }

    @Test
    public void CheckNormalizationForCEngineer(){

        String jt = "C# engineer";
        Normaliser n = new Normaliser();
        String normalisedTitle = n.normalise(jt);
        Assertions.assertEquals(normalisedTitle, "Software engineer");

    }

}
