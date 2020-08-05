import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightSaberTest {


    @Test
    public void hasCharge(){

        //Setup
        LightSaber lightSaber = new LightSaber(1776);

        //Execution
        lightSaber.setCharge(100.0f);
        float expected = 100.0f;
        float actual = lightSaber.getCharge();

        //Assert
        assertEquals(expected,actual);

    }

    @Test
    public void hasSerialNumber(){

        //Setup
        LightSaber lightSaber = new LightSaber(1776);

        //Execution
        long expected = 1776;
        long actual = lightSaber.getJediSerialNumber();

        //Assert
        assertEquals(expected,actual);

    }

    @Test
    public void hasColor(){

        //Setup
        LightSaber lightSaber = new LightSaber(1776);

        //Execution
        lightSaber.setColor("green");
        String expected = "green";
        String actual = lightSaber.getColor();

        //Assert
        assertEquals(expected,actual);

    }

    @Test
    public void lightSaberUsed(){

        //Setup
        LightSaber lightSaber = new LightSaber(1776);

        //Execution
        lightSaber.use(5);
        float expected = 297.49997f;
        float actual = lightSaber.getRemainingMinutes();

        //Assert
        assertEquals(expected,actual);

    }

    @Test
    public void reChargeFunctionCheck(){

        //Setup
        LightSaber lightSaber = new LightSaber(1776);

        //Execution
        lightSaber.recharge();
        float expected = 100.0f;
        float actual = lightSaber.getCharge();

        //Assert
        assertEquals(expected,actual);

    }


}



