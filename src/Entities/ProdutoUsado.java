package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

    private Date manufactureDate;

    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return getName()
                + " (used) $ "
                + String.format("%.2f", getPrice())
                + "(Manufacture date: "
                + sdf.format(manufactureDate)
                + ")";

    }

}
