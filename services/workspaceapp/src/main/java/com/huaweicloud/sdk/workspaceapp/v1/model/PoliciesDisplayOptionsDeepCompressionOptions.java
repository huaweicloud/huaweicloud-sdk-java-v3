package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 深度压缩控制选项。
 */
public class PoliciesDisplayOptionsDeepCompressionOptions {

    /**
     * 深度压缩级别。取值为： 压缩级别0：Compression grade 0 压缩级别1：Compression grade 1 压缩级别2：Compression grade 2 压缩级别3：Compression grade 3 压缩级别4：Compression grade 4 压缩级别5：Compression grade 5 压缩级别6：Compression grade 6 压缩级别7：Compression grade 7 压缩级别8：Compression grade 8 压缩级别9：Compression grade 9
     */
    public static final class DeepCompressionLevelEnum {

        /**
         * Enum COMPRESSION_GRADE_0 for value: "Compression grade 0"
         */
        public static final DeepCompressionLevelEnum COMPRESSION_GRADE_0 =
            new DeepCompressionLevelEnum("Compression grade 0");

        /**
         * Enum COMPRESSION_GRADE_1 for value: "Compression grade 1"
         */
        public static final DeepCompressionLevelEnum COMPRESSION_GRADE_1 =
            new DeepCompressionLevelEnum("Compression grade 1");

        /**
         * Enum COMPRESSION_GRADE_2 for value: "Compression grade 2"
         */
        public static final DeepCompressionLevelEnum COMPRESSION_GRADE_2 =
            new DeepCompressionLevelEnum("Compression grade 2");

        /**
         * Enum COMPRESSION_GRADE_3 for value: "Compression grade 3"
         */
        public static final DeepCompressionLevelEnum COMPRESSION_GRADE_3 =
            new DeepCompressionLevelEnum("Compression grade 3");

        /**
         * Enum COMPRESSION_GRADE_4 for value: "Compression grade 4"
         */
        public static final DeepCompressionLevelEnum COMPRESSION_GRADE_4 =
            new DeepCompressionLevelEnum("Compression grade 4");

        /**
         * Enum COMPRESSION_GRADE_5 for value: "Compression grade 5"
         */
        public static final DeepCompressionLevelEnum COMPRESSION_GRADE_5 =
            new DeepCompressionLevelEnum("Compression grade 5");

        /**
         * Enum COMPRESSION_GRADE_6 for value: "Compression grade 6"
         */
        public static final DeepCompressionLevelEnum COMPRESSION_GRADE_6 =
            new DeepCompressionLevelEnum("Compression grade 6");

        /**
         * Enum COMPRESSION_GRADE_7 for value: "Compression grade 7"
         */
        public static final DeepCompressionLevelEnum COMPRESSION_GRADE_7 =
            new DeepCompressionLevelEnum("Compression grade 7");

        /**
         * Enum COMPRESSION_GRADE_8 for value: "Compression grade 8"
         */
        public static final DeepCompressionLevelEnum COMPRESSION_GRADE_8 =
            new DeepCompressionLevelEnum("Compression grade 8");

        /**
         * Enum COMPRESSION_GRADE_9 for value: "Compression grade 9"
         */
        public static final DeepCompressionLevelEnum COMPRESSION_GRADE_9 =
            new DeepCompressionLevelEnum("Compression grade 9");

        private static final Map<String, DeepCompressionLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeepCompressionLevelEnum> createStaticFields() {
            Map<String, DeepCompressionLevelEnum> map = new HashMap<>();
            map.put("Compression grade 0", COMPRESSION_GRADE_0);
            map.put("Compression grade 1", COMPRESSION_GRADE_1);
            map.put("Compression grade 2", COMPRESSION_GRADE_2);
            map.put("Compression grade 3", COMPRESSION_GRADE_3);
            map.put("Compression grade 4", COMPRESSION_GRADE_4);
            map.put("Compression grade 5", COMPRESSION_GRADE_5);
            map.put("Compression grade 6", COMPRESSION_GRADE_6);
            map.put("Compression grade 7", COMPRESSION_GRADE_7);
            map.put("Compression grade 8", COMPRESSION_GRADE_8);
            map.put("Compression grade 9", COMPRESSION_GRADE_9);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeepCompressionLevelEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DeepCompressionLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeepCompressionLevelEnum(value));
        }

        public static DeepCompressionLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeepCompressionLevelEnum) {
                return this.value.equals(((DeepCompressionLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deep_compression_level")

    private DeepCompressionLevelEnum deepCompressionLevel;

    public PoliciesDisplayOptionsDeepCompressionOptions withDeepCompressionLevel(
        DeepCompressionLevelEnum deepCompressionLevel) {
        this.deepCompressionLevel = deepCompressionLevel;
        return this;
    }

    /**
     * 深度压缩级别。取值为： 压缩级别0：Compression grade 0 压缩级别1：Compression grade 1 压缩级别2：Compression grade 2 压缩级别3：Compression grade 3 压缩级别4：Compression grade 4 压缩级别5：Compression grade 5 压缩级别6：Compression grade 6 压缩级别7：Compression grade 7 压缩级别8：Compression grade 8 压缩级别9：Compression grade 9
     * @return deepCompressionLevel
     */
    public DeepCompressionLevelEnum getDeepCompressionLevel() {
        return deepCompressionLevel;
    }

    public void setDeepCompressionLevel(DeepCompressionLevelEnum deepCompressionLevel) {
        this.deepCompressionLevel = deepCompressionLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesDisplayOptionsDeepCompressionOptions that = (PoliciesDisplayOptionsDeepCompressionOptions) obj;
        return Objects.equals(this.deepCompressionLevel, that.deepCompressionLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deepCompressionLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesDisplayOptionsDeepCompressionOptions {\n");
        sb.append("    deepCompressionLevel: ").append(toIndentedString(deepCompressionLevel)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
