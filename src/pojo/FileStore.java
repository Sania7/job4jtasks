package pojo;

import pojo.pojo.Store;

public class FileStore implements Store {
    @Override
    public void save(String value) {
    }

    @Override
    public String[] load() {
        return new String[0];
    }
}
