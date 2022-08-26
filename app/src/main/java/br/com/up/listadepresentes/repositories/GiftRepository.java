package br.com.up.listadepresentes.repositories;

public class GiftRepository {

    private static GiftRepository repository;

    public static GiftRepository getInstance(){

        if(repository == null){
            repository = new GiftRepository();
        }
        return repository;

    }

    private GiftRepository(){ }
}
