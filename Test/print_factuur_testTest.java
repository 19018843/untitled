import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class print_factuur_testTest {
@Test
    public void Testgegevens(){
    klant klant1 = new klant("Robert van Steen", "Piepenweg 405", "7423XN", "0672349214");
    Assert.assertEquals(klant1.naam + "\n" + klant1.adres + "\n" + klant1.postcode + "\n" + klant1.telefoon, print_factuur.print_gegevens());


}
public void Testaankoop(){

}
}