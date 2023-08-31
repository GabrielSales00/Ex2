/*
Exceção personalizada: Defina uma classe de exceção personalizada `MyCustomException`. Escreva um programa no qual você lança intencionalmente essa exceção e, em seguida, a captura usando um bloco try-catch.
*/

class ExcecaoCust extends Exception  
{  
    
}  
    
class TestCustomException  
{  
    public static void main(String args[])  
    {  
        try  
        {  
            throw new ExcecaoCust();  
        }  
        catch (ExcecaoCust error)  
        {  
            System.out.println("Exceção detectada!");  
        }  
    }  
}  
