package com.example;




//
import org.apache.pig.ExecType;
import org.apache.pig.PigRunner;
import org.apache.pig.PigServer;




public class WordCountPig {

    public static void main(String[] args) throws Exception {
//        String scriptPath = "C:\\Users\\U-19\\Desktop\\FILE DI INSTALLAZIONE\\ApacheSpark\\ScriptPigLatin.pig";
//        
//        
//        
//        
//            // Creazione di un'istanza di PigServer
//            PigServer pigServer = new PigServer(ExecType.LOCAL);
//
//            // Esecuzione dello script Pig
//            pigServer.registerScript(scriptPath);
//            pigServer.executeBatch();
//            pigServer.shutdown();
//
//            System.out.println("Esecuzione dello script Pig completata con successo.");
//        
    	String[] argument = {"-x", "local", "-f", "C:\\Users\\U-19\\Desktop\\FILE DI INSTALLAZIONE\\ApacheSpark\\ScriptPigLatin.pig"};       
    	PigRunner.run(argument,null);
        }
       
        

}

