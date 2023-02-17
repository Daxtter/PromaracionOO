import java.util.Random;

/**
 * Write a description of class InformacionCirculos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InformacionCirculos
{
    // instance variables - replace the example below with your own
    private int x;
    private Circle c1;
    private Circle c3;
    private Circle c2;
    private Circle c4 ;
    
    /**
     * Constructor for objects of class InformacionCirculos
     */
    public InformacionCirculos()
    {
        // initialise instance variables
        Random rn = new Random();
        int diametro1 = rn.nextInt(80)+30;
        int diametro2 = rn.nextInt(80)+30;
        int diametro3 = rn.nextInt(80)+30;
        
        int posicionX1 = rn.nextInt(401)+10;
        int posicionX2 = rn.nextInt(401)+10;
        int posicionX3 = rn.nextInt(401)+10;
        
        int posicionY1 = rn.nextInt(201)+10;
        int posicionY2 = rn.nextInt(201)+10;
        int posicionY3 = rn.nextInt(201)+10;
        
        c1 = new Circle(diametro1,posicionX1,posicionY1,"blue");
        c2 = new Circle(diametro2,posicionX2,posicionY2,"red");
         c3 = new Circle(diametro3,posicionX3,posicionY3,"black");
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     

       */ 
      
    public void mostrarCirculos()
    {
    c1.makeVisible();
    c2.makeVisible();
    c3.makeVisible();
    
    }
    public void ocultarCirculo()
    {
    c1.makeInvisible();
    c2.makeInvisible();
    c3.makeInvisible();
    c4.makeVisible();
    }
    
    public void crearCirculoPequeño()
    {
        
    int x,y,radio;
    Circle cMasGrande = new Circle(5,5,5,"blue");
cMasGrande=circuloMasGrandeEnDiametro();
    radio= Math.round(cMasGrande.getDiametro()/2);
    x=cMasGrande.getPosicionX()+radio-7;
    y=cMasGrande.getPosicionY()+radio-7;
    
    
    c4 = new Circle(15,x,y,"magenta");
    c4.makeVisible();
    }
    /** public void encontrarElMasGrande()
    {
        // put your code here
        Circle auxiliar;
        int d1,d2,d3;
        d1=c1.getDiametro();
        d2=c2.getDiametro();
        d3=c3.getDiametro();
        if (d2>d1 && d2>d3)
        {
        auxiluar=c1;
        c1=c2;
        c2=auxiliar;
        }
        else
            if(d3>)
        
    
    }
**/
    private Circle circuloMasGrandeEnDiametro()
    {
    if (
    c1.getDiametro() > c2.getDiametro() && c1.getDiametro() > c3.getDiametro())
    {
    return c1;
    }
    else
        if( c2.getDiametro() > c1.getDiametro() && c2.getDiametro() > c3.getDiametro())
        {
        return  c2;
        }
        else
        return c3;
    


}
}

