package com.testetecnico.exercises;

public interface Interruptor {
    public static void main(String[] args) {
        boolean[] lampadas = new boolean[3];
        
        lampadas[0] = false; // desligada
        lampadas[1] = false; // desligada
        lampadas[2] = true;  // ligada 

    
        
        boolean[] controleInterruptores = new boolean[3];
        controleInterruptores[0] = true;  
        waitTime();                        
        controleInterruptores[0] = false; 
        controleInterruptores[1] = true;  

        // Sala com as lâmpadas
        int resultado = verificarLampadas(lampadas, controleInterruptores);
        switch (resultado) {
            case 1:
                System.out.println("A lâmpada 1 é controlada pelo primeiro interruptor.");
                System.out.println("A lâmpada 2 é controlada pelo segundo interruptor.");
                System.out.println("A lâmpada 3 é controlada pelo terceiro interruptor.");
                break;
            case 2:
                System.out.println("A lâmpada 1 é controlada pelo terceiro interruptor.");
                System.out.println("A lâmpada 2 é controlada pelo segundo interruptor.");
                System.out.println("A lâmpada 3 é controlada pelo primeiro interruptor.");
                break;
            default:
                System.out.println("Erro na identificação dos interruptores.");
                break;
        }
    }

    public static void waitTime() {
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static int verificarLampadas(boolean[] lampadas, boolean[] controleInterruptores) {
        if (controleInterruptores[1] && lampadas[2]) {
            return 1; 
        } else if (!controleInterruptores[0] && lampadas[0]) {
            return 2; 
        }
        return 0;
    }
}
