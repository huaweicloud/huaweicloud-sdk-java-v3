package com.huaweicloud.sdk.codeartside.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowLatestUpgradableReleaseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_product_name")

    private String subProductName;

    /**
     * 系统类型
     */
    public static final class OsTypeEnum {

        /**
         * Enum WINDOWS for value: "windows"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("windows");

        /**
         * Enum DEBIAN for value: "debian"
         */
        public static final OsTypeEnum DEBIAN = new OsTypeEnum("debian");

        /**
         * Enum DARWIN for value: "darwin"
         */
        public static final OsTypeEnum DARWIN = new OsTypeEnum("darwin");

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("windows", WINDOWS);
            map.put("debian", DEBIAN);
            map.put("darwin", DARWIN);
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

    /**
     * CPU架构
     */
    public static final class ArchEnum {

        /**
         * Enum X86_64 for value: "X86-64"
         */
        public static final ArchEnum X86_64 = new ArchEnum("X86-64");

        /**
         * Enum ARM64 for value: "Arm64"
         */
        public static final ArchEnum ARM64 = new ArchEnum("Arm64");

        /**
         * Enum UNIVERSAL for value: "Universal"
         */
        public static final ArchEnum UNIVERSAL = new ArchEnum("Universal");

        private static final Map<String, ArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchEnum> createStaticFields() {
            Map<String, ArchEnum> map = new HashMap<>();
            map.put("X86-64", X86_64);
            map.put("Arm64", ARM64);
            map.put("Universal", UNIVERSAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchEnum(String value) {
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
        public static ArchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ArchEnum(value));
        }

        public static ArchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ArchEnum) {
                return this.value.equals(((ArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private ArchEnum arch;

    public ShowLatestUpgradableReleaseRequest withSubProductName(String subProductName) {
        this.subProductName = subProductName;
        return this;
    }

    /**
     * 子产品名称
     * @return subProductName
     */
    public String getSubProductName() {
        return subProductName;
    }

    public void setSubProductName(String subProductName) {
        this.subProductName = subProductName;
    }

    public ShowLatestUpgradableReleaseRequest withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 系统类型
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public ShowLatestUpgradableReleaseRequest withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    /**
     * CPU架构
     * @return arch
     */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLatestUpgradableReleaseRequest that = (ShowLatestUpgradableReleaseRequest) obj;
        return Objects.equals(this.subProductName, that.subProductName) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.arch, that.arch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subProductName, osType, arch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLatestUpgradableReleaseRequest {\n");
        sb.append("    subProductName: ").append(toIndentedString(subProductName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
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
