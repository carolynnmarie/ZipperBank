package io.zipcoder.domainTest;

import io.zipcoder.domain.Address;
import org.junit.Assert;
import org.junit.Test;

public class AddressTest {

    Address address = new Address();
    Address address2 = new Address("2002", "State St", "Wilmington", "PA", "55555");

    @Test
    public void getId(){
        address.setId((long)1);
        Long expected = (long)1;
        Long actual = address.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStreetNumberTest(){
        address.setStreet_address_line_one("200 Willow Lane");
        String expected = "200 Willow Lane";
        String actual = address.getStreet_address_line_one();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStreetNumberTest2(){
        String expected = "2002";
        String actual = address2.getStreet_address_line_one();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStreetNameTest(){
        address.setStreet_address_line_two("Willow Avenue");
        String expected = "Willow Avenue";
        String actual = address.getStreet_address_line_two();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCityTest(){
        address.setCity("Wilmington");
        String expected = "Wilmington";
        String actual = address.getCity();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStateTest(){
        address.setState("DE");
        String expected = "DE";
        String actual = address.getState();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getZipTest(){
        address.setZip("55555");
        String expected = "55555";
        String actual = address.getZip();
        Assert.assertEquals(expected, actual);
    }
}
