package info.sjd.model;


public class Currency {

    private String shortName;
    private String fullName;
    private Integer code;
    private String symbol;
    private Integer value;

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Currency() {
    }

    public Currency(String shortName, String fullName, Integer code, String symbol, Integer value) {
        this.shortName = shortName;
        this.fullName = fullName;
        this.code = code;
        this.symbol = symbol;
        this.value = value;
    }

    @Override
    public String toString() {
        return shortName + " " + fullName + " " + code + " " + symbol + " " + value;
    }
}
