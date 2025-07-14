package com.lms;

import java.util.HashMap;
import java.util.Map;

public class ObjectRegistry {

    private static final Map<String, Object> objects = new HashMap<>();

    public static void registerObject(String name, Object object) {
        if (name == null || object == null) {
            throw new IllegalArgumentException("Object name and object cannot be null");
        }
        objects.put(name, object);
    }

    public static Object getObject(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Object name cannot be null");
        }
        return objects.get(name);
    }
}
