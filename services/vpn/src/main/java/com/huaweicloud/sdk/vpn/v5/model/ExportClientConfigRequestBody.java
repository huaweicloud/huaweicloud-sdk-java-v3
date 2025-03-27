package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ExportClientConfigRequestBody
 */
public class ExportClientConfigRequestBody {

    /**
     * 操作系统类型
     */
    public static final class OsTypeEnum {

        /**
         * Enum WINDOWS for value: "Windows"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("Windows");

        /**
         * Enum LINUX for value: "Linux"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("Linux");

        /**
         * Enum MACOS for value: "MacOS"
         */
        public static final OsTypeEnum MACOS = new OsTypeEnum("MacOS");

        /**
         * Enum ANDROID for value: "Android"
         */
        public static final OsTypeEnum ANDROID = new OsTypeEnum("Android");

        /**
         * Enum IOS for value: "iOS"
         */
        public static final OsTypeEnum IOS = new OsTypeEnum("iOS");

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("Windows", WINDOWS);
            map.put("Linux", LINUX);
            map.put("MacOS", MACOS);
            map.put("Android", ANDROID);
            map.put("iOS", IOS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsTypeEnum(String value) {
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
        public static OsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsTypeEnum(value));
        }

        public static OsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsTypeEnum) {
                return this.value.equals(((OsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private OsTypeEnum osType;

    public ExportClientConfigRequestBody withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportClientConfigRequestBody that = (ExportClientConfigRequestBody) obj;
        return Objects.equals(this.osType, that.osType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportClientConfigRequestBody {\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
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
