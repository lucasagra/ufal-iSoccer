package data;
import models.partners.Partner;

import java.util.ArrayList;
import java.util.List;

public class PartnersData {
    private List<Partner> partners = new ArrayList<>();

    public List<Partner> getPartnersData() {
        return this.partners;
    }

    public void addPartner(Partner partner) {
        this.partners.add(partner);
    }
}
