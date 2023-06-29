package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库引擎列表。
 */
public class DatastoresResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_versions")

    private List<String> supportedVersions = null;

    /**
     * 部署形态
     */
    public static final class InstanceModeEnum {

        /**
         * Enum HA for value: "ha"
         */
        public static final InstanceModeEnum HA = new InstanceModeEnum("ha");

        /**
         * Enum INDEPENDENT for value: "independent"
         */
        public static final InstanceModeEnum INDEPENDENT = new InstanceModeEnum("independent");

        private static final Map<String, InstanceModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceModeEnum> createStaticFields() {
            Map<String, InstanceModeEnum> map = new HashMap<>();
            map.put("ha", HA);
            map.put("independent", INDEPENDENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceModeEnum(String value) {
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
        public static InstanceModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceModeEnum(value));
        }

        public static InstanceModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceModeEnum) {
                return this.value.equals(((InstanceModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_mode")

    private InstanceModeEnum instanceMode;

    public DatastoresResult withSupportedVersions(List<String> supportedVersions) {
        this.supportedVersions = supportedVersions;
        return this;
    }

    public DatastoresResult addSupportedVersionsItem(String supportedVersionsItem) {
        if (this.supportedVersions == null) {
            this.supportedVersions = new ArrayList<>();
        }
        this.supportedVersions.add(supportedVersionsItem);
        return this;
    }

    public DatastoresResult withSupportedVersions(Consumer<List<String>> supportedVersionsSetter) {
        if (this.supportedVersions == null) {
            this.supportedVersions = new ArrayList<>();
        }
        supportedVersionsSetter.accept(this.supportedVersions);
        return this;
    }

    /**
     * 部署形态支持的引擎版本列表
     * @return supportedVersions
     */
    public List<String> getSupportedVersions() {
        return supportedVersions;
    }

    public void setSupportedVersions(List<String> supportedVersions) {
        this.supportedVersions = supportedVersions;
    }

    public DatastoresResult withInstanceMode(InstanceModeEnum instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }

    /**
     * 部署形态
     * @return instanceMode
     */
    public InstanceModeEnum getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(InstanceModeEnum instanceMode) {
        this.instanceMode = instanceMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatastoresResult that = (DatastoresResult) obj;
        return Objects.equals(this.supportedVersions, that.supportedVersions)
            && Objects.equals(this.instanceMode, that.instanceMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportedVersions, instanceMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatastoresResult {\n");
        sb.append("    supportedVersions: ").append(toIndentedString(supportedVersions)).append("\n");
        sb.append("    instanceMode: ").append(toIndentedString(instanceMode)).append("\n");
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
