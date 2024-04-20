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
class Obra implements Comparable{
    private String nombre;
    private Inventario inicial;
    private Inventario fin;

    public Obra() 
    {
        nombre = "No Id";
        inicial = new Inventario();
        fin = new Inventario();
    }

    public Obra(String nombre, Inventario inicial, Inventario fin) 
    {
        this.nombre = nombre;
        this.inicial = inicial;
        this.fin = fin;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String obra) 
    {
        this.nombre = obra;
    }

    public Inventario getInicial() 
    {
        return inicial;
    }

    public void setInicial(Inventario inicial) 
    {
        this.inicial = inicial;
    }

    public Inventario getFin() 
    {
        return fin;
    }

    public void setFin(Inventario fin) 
    {
        this.fin = fin;
    }

    @Override
    public String toString() 
    {
        return nombre + " Inicial -->" + inicial + " Final-->" + fin;
    }
    
    public Inventario consumo()
    {
        return inicial.resta(fin);
    }

    @Override
    public int compareTo(Object o) {
        Obra b = (Obra) o;
        if(consumo().totalKilos() == b.consumo().totalKilos())
                return 1;
        else
            if(consumo().totalKilos() > b.consumo().totalKilos())
                return -1;
            else
                return 1;
    }
    
    
}
