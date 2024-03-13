package org.utils.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class BaseLoadFile<T> {

    private static final String SUFFIX = ".dat";

    /**
     * Сохраняет объект в файл.
     *
     * @param data объект для сохранения
     * @param fileName имя файла для сохранения
     * @throws IOException если произошла ошибка ввода-вывода
     */
    public void save(T data, String fileName) throws IOException {
        if (data == null) {
            throw new IllegalArgumentException("Data cannot be null");
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName + SUFFIX))) {
            oos.writeObject(data);
        }
    }

    /**
     * Загружает объект из файла.
     *
     * @param fileName имя файла для загрузки
     * @return загруженный объект
     * @throws FileNotFoundException если файл не найден
     * @throws IOException если произошла ошибка ввода-вывода
     * @throws ClassNotFoundException если класс объекта не найден
     */
    public T load(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName + SUFFIX))) {
            return (T) ois.readObject();
        }
    }

}
