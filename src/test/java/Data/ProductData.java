package Data;

import Models.ProductModel;

public class ProductData {

    public static ProductModel postProductPayload() {
        ProductModel product = new ProductModel();

        product.setId("68ce5441-be99-cb4c-b0ba-61c100a6628a");
        product.setCookie("user=b881b3cf-d6b9-2356-251d-8bb06b06b5ab");
        product.setProd_id(1);
        product.setFlag(false);

        return product;
    }

    public static ProductModel deleteProductPayload() {
        ProductModel product = new ProductModel();

        product.setId("68ce5441-be99-cb4c-b0ba-61c100a6628a");

        return product;
    }
}
