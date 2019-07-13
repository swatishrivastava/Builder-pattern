public class LunchOrder {

    public static class Builder {
        private String meat;
        private String wheat;
        private String lettue;
        private String sauce;

        public Builder() {
        }

        public Builder wheat(String wheat) {
            this.wheat = wheat;
            return this;

        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder lettuce(String lettuce) {
            this.lettue = lettuce;
            return this;
        }

        public LunchOrder getMeLunch() {
            return new LunchOrder(this);
        }


    }

    private LunchOrder(Builder builder) {
        this.meat = builder.meat;
        this.wheat = builder.wheat;
        this.lettue = builder.lettue;
        this.sauce = builder.sauce;
    }

    private String meat;
    private String wheat;
    private String lettue;
    private String sauce;

    public String getMeat() {
        return meat;
    }

    public String getWheat() {
        return wheat;
    }

    public String getLettue() {
        return lettue;
    }

    public String getSauce() {
        return sauce;
    }


}
