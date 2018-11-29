package com.mix.patterns.gof.structural.flyweight.example1;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

public class FontData {

    private static final WeakHashMap<FontData, WeakReference<FontData>> flyweightData =
            new WeakHashMap<>();
    private final int pointSize;
    private final String fontFace;
    private final Color color;
    private final Set<FontEffect> effects;

    private FontData(int pointSize, String fontFace, Color color, EnumSet<FontEffect> effects) {
        this.pointSize = pointSize;
        this.fontFace = fontFace;
        this.color = color;
        this.effects = effects;
    }

    public static FontData create(int pointSize, String fontFace, Color color, FontEffect... effects) {
        EnumSet<FontEffect> effectsSet = EnumSet.noneOf(FontEffect.class);
        effectsSet.addAll(Arrays.asList(effects));
        FontData data = new FontData(pointSize, fontFace, color, effectsSet);
        if (!flyweightData.containsKey(data)) {
            flyweightData.put(data, new WeakReference<>(data));
        }

        return flyweightData.get(data).get();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FontData fontData = (FontData) o;
        return pointSize == fontData.pointSize &&
                Objects.equals(fontFace, fontData.fontFace) &&
                Objects.equals(color, fontData.color) &&
                Objects.equals(effects, fontData.effects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointSize, fontFace, color, effects);
    }
}
