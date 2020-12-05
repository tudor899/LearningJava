import obiectual.Animal;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnimalTest {

    Animal animalObject;

    @BeforeClass
    public void objectSetup() {
        animalObject = new Animal("Degetica", 2);
    }

    @AfterClass
    public void objectDeletion() {
        animalObject = null;
    }

    @Test
    public void testAnimalName() {
        String numeMimi = animalObject.getNume();
        Assert.assertEquals(numeMimi, "Degetica");
    }

    @Test
    public void testAnimalAge() {
        int age = animalObject.getAge();
        Assert.assertEquals(age, 2);
    }
}
