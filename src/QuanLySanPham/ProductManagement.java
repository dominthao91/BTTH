package QuanLySanPham;

import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
    private List<Product> products = new ArrayList<>();


    public void showProduct() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }


    public List<Product> getProducts() {
        return products;
    }


    public int searchProductById(String id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (id.equals(products.get(i).getId())) {
                index = i;
                break;
            }
        }
        return index;
    }



    public boolean updateProduct(String id, Product product) {
        boolean isUpdate = false;
        int index = searchProductById(id);
        if (index != -1) {
            isUpdate = true;
            products.set(index, product);
        }
        return isUpdate;
    }


    public boolean deleteProduct(String id) {
        boolean isDelete = false;
        int index = searchProductById(id);
        if (index != -1) {
            isDelete = true;
            products.remove(index);
        }
        return isDelete;
    }

}
