/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_20130803_proyecto_04;

/**
 *
 * @author cgl05
 */
class Inventario {
    private int toneladas;
    private int bultos;
    private int kilos;
    
    public Inventario()
    {
        toneladas = bultos = kilos = 0;
    }
    
    public Inventario(int toneladas, int bultos, int kilos)
    {
        this.toneladas = toneladas;
        this.bultos = bultos;
        this.kilos = kilos;
    }
    
    public Inventario(Inventario i)
    {
        toneladas = i.toneladas;
        bultos = i.bultos;
        kilos = i.kilos;
    }

    public int getToneladas() 
    {
        return toneladas;
    }

    public int getBultos() 
    {
        return bultos;
    }
    
    public int getKilos() 
    {
        return kilos;
    }
    
    public void setToneladas(int toneladas) 
    {
        this.toneladas = toneladas;
    }

    public void setBultos(int bultos) 
    {
        this.bultos = bultos;
    }

    public void setKilos(int kilos) 
    {
        this.kilos = kilos;
    }

    @Override
    public String toString() 
    {
        return toneladas + "tn " + bultos + "blts " + kilos + "kg";
    }
    
    public int totalKilos()
    {
        return toneladas * 1000 + bultos * 50 + kilos;
    }
    
    public Inventario resta(Inventario i)
    {
        int restaKilos = totalKilos() - i.totalKilos();
        
        int ton = restaKilos / 1000;//div
        int restoKilos = restaKilos % 1000;//mod
        
        int blts = restoKilos / 50;//div
        int kg = restoKilos % 50;//mod
        
        return new Inventario(ton, blts, kg);
    }
      
    public Inventario suma(Inventario i)
    {
        int sumaKilos = totalKilos() + i.totalKilos();
        
        int ton = sumaKilos / 1000;//div
        int restoKilos = sumaKilos % 1000;//mod
        
        int blts = restoKilos / 50;//div
        int kg = restoKilos % 50;//mod
        
        return new Inventario(ton, blts, kg);
    }
    
    public Inventario division(int div)
    {
        int sumaKilos = totalKilos() / div;
        
        int ton = sumaKilos / 1000;//div
        int restoKilos = sumaKilos % 1000;//mod
        
        int blts = restoKilos / 50;//div
        int kg = restoKilos % 50;//mod
        
        return new Inventario(ton, blts, kg);
    }
    
    public boolean mayorQue(Inventario i)
    {
        if(totalKilos() > i.totalKilos())
            return true;
        else
            return false;
    }
    
    public boolean menorQue(Inventario i)
    {
        if(totalKilos() < i.totalKilos())
            return true;
        else
            return false;
    }
    
}
