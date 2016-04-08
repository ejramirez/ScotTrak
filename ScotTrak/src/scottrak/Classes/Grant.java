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
public class Grant extends AbDonor implements Donor{

    public Grant(Address ad, PhoneNumber p, String e, UserStatus Ustatus, boolean sol) {
        super(ad, p, e, Ustatus, sol);
    }

    @Override
    public boolean equals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
