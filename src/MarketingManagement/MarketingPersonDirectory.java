/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarketingManagement;

import TheBusiness.Business.Business;
import java.util.ArrayList;
import TheBusiness.Personnel.Person;

/**
 *
 * @author kal bugrara
 */
public class MarketingPersonDirectory {

    Business business;
    ArrayList<MarketingPersonProfile> marketingpersonlist;
    
    public MarketingPersonDirectory(Business d) {
        business = d;
        marketingpersonlist = new ArrayList();
    }

    public MarketingPersonProfile newMarketingPersonProfile(Person p) {
        MarketingPersonProfile sp = new MarketingPersonProfile(p);
        marketingpersonlist.add(sp);
        return sp;
    }

    public MarketingPersonProfile findMarketingPerson(String id) {
        for (MarketingPersonProfile sp : marketingpersonlist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }
    
    
    @Override
    public String toString() {
        return "MarketingPersonDirectory{" + "marketingpersonlist=" + marketingpersonlist + '}';
    }
   
    
}
