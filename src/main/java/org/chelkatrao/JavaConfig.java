package org.chelkatrao;

import org.reflections.Reflections;

import java.util.Map;
import java.util.Set;

public class JavaConfig implements Config {

    private Reflections scanner;
    private Map<Class, Class> ifc2ImplClass;

    public JavaConfig(String package2Scan, Map<Class, Class> ifc2ImplClass) {
        this.ifc2ImplClass = ifc2ImplClass;
        this.scanner = new Reflections(package2Scan);
    }

    @Override
    public <T> Class<? extends T> getImplClass(Class<T> ifc) {
        return ifc2ImplClass.computeIfAbsent(ifc, aClass -> {
            Set<Class<? extends T>> classes = scanner.getSubTypesOf(ifc);
            if (classes.size() != 1) {
                throw new RuntimeException(ifc + "has 0 or more than one impl please update your config");
            }
            return classes.iterator().next();
        });
        // map.computeIfAbsent qanday ishlaydi
        // agar mapda ifc degan kalit bo'lsa mapda o'sha kalitni mos valuesini qaytaradi
        // agar mapda ifc degan kalit bo'lmasa -> { } qavs ichidagi codeni ishga tushuradi va qiymay qaytaradi
        // va qaytgan qiymatni mapga set qilinadi va keyin qiymatni  natija qilib qaytaradi
    }

    @Override
    public Reflections getScanner() {
        return this.scanner;
    }

}
