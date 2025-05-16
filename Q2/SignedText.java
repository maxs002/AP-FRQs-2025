public class SignedText{
    private String firstN;
    private String lastN;

    public SignedText(String firstN,String lastN){
        this.firstN = firstN;
        this.lastN = lastN;
    }
    public String getSignature(){
        if (firstN.equals("")){
            return lastN;
        }
        else{
            return firstN.substring(0,1) +"-"+ lastN;
        }
    }
    public String addSignature(String str){
        String signature = getSignature();
        if(str.length()>= signature.length() && str.substring(str.length() - signature.length()).equals(signature)){
            return str;
        }
        if(str.length()>=signature.length() && str.substring(0,signature.length()).equals(signature)){
            return str.substring(signature.length()) + signature;
        }
        return str+ signature;
    }
}
