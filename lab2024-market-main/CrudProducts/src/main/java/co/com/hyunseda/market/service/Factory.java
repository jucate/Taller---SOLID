package co.com.hyunseda.market.service;

public class Factory {
    private static Factory instance;

    private Factory(){

    }

    public static Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public iProductRepository getRepository(String type) {

        iProductRepository result = null;

        switch (type) {
            case "default":
                result = new ProductRepository();
                break;
        }

        return result;

    }
    public iCategory getRepositoryCategory(String type){
        iCategory result = null;
        switch (type) {
            case "default":
                result = new CategoryRepository();
                break;
        }

        return result;
    }
}
