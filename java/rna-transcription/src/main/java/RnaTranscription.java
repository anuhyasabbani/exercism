class RnaTranscription {

    String transcribe(String dnaStrand) {
        
         String RNA="";
        for(int i=0;i<dnaStrand.length();i++){
            if(dnaStrand.charAt(i)=='G'){
                RNA = RNA + "C";
            }
            if(dnaStrand.charAt(i)=='C'){
                RNA = RNA + "G";
            }
            if(dnaStrand.charAt(i)=='T'){
                RNA = RNA + "A";
            }
            if(dnaStrand.charAt(i)=='A'){
               RNA = RNA + "U";
            }
        }
        return RNA;
    }

}
