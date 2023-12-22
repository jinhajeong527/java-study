package extension.example;

public class NikeShoes extends Shoes implements Platform, ShoeLace {

    private String showLace;
    private String platform;
    @Override
    public void changeShoeLace(String kind) {
        this.showLace = kind;
    }

    @Override
    public void changePlatform(String platform) {
        this.platform = platform;
    }
}
