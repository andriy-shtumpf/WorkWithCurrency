package info.sjd.model;

public class ComercialCurrency extends Currency {

    private Integer buyValue;
    private Integer sellValue;

    public Integer getBuyValue() {
        return buyValue;
    }

    public void setBuyValue(Integer buyValue) {
        this.buyValue = buyValue;
    }

    public Integer getSellValue() {
        return sellValue;
    }

    public void setSellValue(Integer sellValue) {
        this.sellValue = sellValue;
    }

    public ComercialCurrency(String shortName, String fullName, Integer code, String symbol, Integer value, Integer buyValue, Integer sellValue) {
        super(shortName, fullName, code, symbol, value);
        this.buyValue = buyValue;
        this.sellValue = sellValue;
    }

    public ComercialCurrency() {
    }

    @Override
    public String toString() {
        return super.getShortName() + " " + super.getFullName().replaceAll("_", " ") + " " + super.getCode() + " " + getSymbol() + " " + super.getValue() + " " + buyValue + " " + sellValue;
    }
}
