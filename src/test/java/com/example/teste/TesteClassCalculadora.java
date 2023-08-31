package com.example.teste;

import com.example.teste.service.ReceboService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class TesteClassCalculadora {

    @Test
    public void testeMedia(){
        Double[] v = {20.0,20.0};
        List<Double> lista = Arrays.asList(v);

        ReceboService receboService = new ReceboService();

        Double m = 20.0;
        Assert.assertEquals(m,receboService.media(lista));
    }

    @Test
    public void testeMediana(){
        Double[] v = {10.0,20.0,30.0};
        List<Double> lista = Arrays.asList(v);

        ReceboService receboService = new ReceboService();

        Double m = 20.0;
        Assert.assertEquals(m,receboService.mediana(lista));
    }

    @Test
    public void testeSatanas(){
        Double[] v = {10.0,20.0,30.0};
        List<Double> lista = Arrays.asList(v);

        ReceboService receboService = new ReceboService();

        Double m = 8.16496580927726;
        Assert.assertEquals(m,receboService.satanas(lista));
    }

    @Test
    public void testTamanho(){
        Double[] v = {10.0,20.0,30.0};
        List<Double> lista = Arrays.asList(v);

        ReceboService receboService = new ReceboService();

        Assert.assertEquals(3,receboService.tamanho(lista));
    }

    @Test
    public void testeValorMin(){
        Double[] v = {10.0,20.0,30.0};
        List<Double> lista = Arrays.asList(v);

        ReceboService receboService = new ReceboService();

        Double m = 10.0;

        Assert.assertEquals(m,receboService.valorMin(lista));
    }

    @Test
    public void testeValorMax(){
        Double[] v = {10.0,30.0,20.0};
        List<Double> lista = Arrays.asList(v);

        ReceboService receboService = new ReceboService();

        Double m = 30.0;

        Assert.assertEquals(m,receboService.valorMax(lista));
    }

    @Test
    public void testeSomaTodosValores(){
        Double[] v = {10.0,30.0,20.0};
        List<Double> lista = Arrays.asList(v);

        ReceboService receboService = new ReceboService();

        Double m = 60.0;

        Assert.assertEquals(m,receboService.sum(lista));
    }
}
