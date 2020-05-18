package com.huaweicloud.sdk.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestEnumClass {

    public static class VolumetypeEnum {

        public static final VolumetypeEnum SATA = new VolumetypeEnum("SATA");

        public static final VolumetypeEnum SAS = new VolumetypeEnum("SAS");

        public static final VolumetypeEnum SSD = new VolumetypeEnum("SSD");

        private String value;

        public static Map<String, VolumetypeEnum> staticFields =
            new HashMap<String, VolumetypeEnum>() {
                {
                    put("SATA", SATA);
                    put("SAS", SAS);
                    put("SSD", SSD);
                }
            };

        VolumetypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static VolumetypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VolumetypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new VolumetypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static VolumetypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VolumetypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }

            throw new IllegalArgumentException("Unexpected value '" + value + "'");

        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof VolumetypeEnum) {
                return this.value.equals(((VolumetypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }

    }

    public static class EnumClass {

        private VolumetypeEnum volumetypeEnum;

        public VolumetypeEnum getVolumetypeEnum() {
            return volumetypeEnum;
        }

        public void setVolumetypeEnum(VolumetypeEnum volumetypeEnum) {
            this.volumetypeEnum = volumetypeEnum;
        }
    }

    @Test
    public void testEnumType() {
        VolumetypeEnum atype = VolumetypeEnum.fromValue("SATA");
        VolumetypeEnum btype = VolumetypeEnum.fromValue("SASC");
        String strJsonA = "{ \"volumetypeEnum\": \"SATA\"}";
        String strJsonB = "{ \"volumetypeEnum\": \"SASC\"}";
        String strJsonC = "{ }";
        EnumClass enumClassA = JsonUtils.toObject(strJsonA, EnumClass.class);
        EnumClass enumClassB = JsonUtils.toObject(strJsonB, EnumClass.class);
        EnumClass enumClassC = JsonUtils.toObject(strJsonC, EnumClass.class);
        enumClassC.getVolumetypeEnum();
        System.out.println(enumClassA.getVolumetypeEnum());
        System.out.println(enumClassB.getVolumetypeEnum());
        System.out.println(enumClassC.getVolumetypeEnum());
        Assert.assertEquals(atype, enumClassA.getVolumetypeEnum());
        Assert.assertEquals(btype, enumClassB.getVolumetypeEnum());
        Assert.assertEquals(btype == enumClassB.getVolumetypeEnum(), true);
        Assert.assertEquals(atype == enumClassA.getVolumetypeEnum(), true);
        Assert.assertEquals(atype.hashCode(), "SATA".hashCode());
    }

}
