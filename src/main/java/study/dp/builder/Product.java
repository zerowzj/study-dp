package study.dp.builder;

public class Product {

    private String name;

    private String logo;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String name;

        private String logo;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder logo(String logo) {
            this.logo = logo;
            return this;
        }

        public Product build() {
            return new Product();
        }
    }
}
