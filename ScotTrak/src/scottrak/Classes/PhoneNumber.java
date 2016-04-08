/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scottrak.Classes;

/**
 *
 * @author Eric
 */
public class PhoneNumber {
    
    // XXX-XXX-XXX-XXXX
    
    private int iac; //International Access Code
    private int areaCode; //Area Code
    private int prefix;
    private int lineNumber;
    
    public PhoneNumber(int IAC, int AC, int PF, int LN){
        iac = IAC;
        areaCode = AC;
        prefix = PF;
        lineNumber = LN;
    }
    
    @Override
    public String toString(){
        return this.getIac() + "-" + this.getAreaCode() + "-" + this.getPrefix() + "-" + this.getLineNumber();
    }

    /**
     * @return the iac
     */
    public int getIac() {
        return iac;
    }

    /**
     * @param iac the iac to set
     */
    public void setIac(int iac) {
        this.iac = iac;
    }

    /**
     * @return the areaCode
     */
    public int getAreaCode() {
        return areaCode;
    }

    /**
     * @param areaCode the areaCode to set
     */
    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * @return the prefix
     */
    public int getPrefix() {
        return prefix;
    }

    /**
     * @param prefix the prefix to set
     */
    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    /**
     * @return the lineNumber
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * @param lineNumber the lineNumber to set
     */
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
    
}
