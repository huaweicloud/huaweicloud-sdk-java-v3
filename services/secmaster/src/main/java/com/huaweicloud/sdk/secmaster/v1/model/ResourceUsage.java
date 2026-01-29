package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 资源用量，当接口请求参数usage&#x3D;true时会返回具体的使用量信息，其它场景不返回
 */
public class ResourceUsage {

    /**
     * 使用量单位，OPS 次，MB 流量体积MB，GB 流量体积GB
     */
    public static final class UnitEnum {

        /**
         * Enum OPS for value: "OPS"
         */
        public static final UnitEnum OPS = new UnitEnum("OPS");

        /**
         * Enum MB for value: "MB"
         */
        public static final UnitEnum MB = new UnitEnum("MB");

        /**
         * Enum GB for value: "GB"
         */
        public static final UnitEnum GB = new UnitEnum("GB");

        private static final Map<String, UnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UnitEnum> createStaticFields() {
            Map<String, UnitEnum> map = new HashMap<>();
            map.put("OPS", OPS);
            map.put("MB", MB);
            map.put("GB", GB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UnitEnum(String value) {
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
        public static UnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UnitEnum(value));
        }

        public static UnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UnitEnum) {
                return this.value.equals(((UnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private UnitEnum unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_resource_spec_code")

    private String sourceResourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private Object resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_percent")

    private Double usedPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Double quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Double used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free")

    private Double free;

    public ResourceUsage withUnit(UnitEnum unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 使用量单位，OPS 次，MB 流量体积MB，GB 流量体积GB
     * @return unit
     */
    public UnitEnum getUnit() {
        return unit;
    }

    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }

    public ResourceUsage withResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
        return this;
    }

    /**
     * 资源类型名称
     * @return resourceTypeName
     */
    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    public ResourceUsage withSourceResourceSpecCode(String sourceResourceSpecCode) {
        this.sourceResourceSpecCode = sourceResourceSpecCode;
        return this;
    }

    /**
     * 源资源规格编码
     * @return sourceResourceSpecCode
     */
    public String getSourceResourceSpecCode() {
        return sourceResourceSpecCode;
    }

    public void setSourceResourceSpecCode(String sourceResourceSpecCode) {
        this.sourceResourceSpecCode = sourceResourceSpecCode;
    }

    public ResourceUsage withResourceSpecCode(Object resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 源资源规格编码
     * @return resourceSpecCode
     */
    public Object getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(Object resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ResourceUsage withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 源资源类型编码
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public ResourceUsage withUsedPercent(Double usedPercent) {
        this.usedPercent = usedPercent;
        return this;
    }

    /**
     * 用量百分比
     * minimum: 0
     * maximum: 1
     * @return usedPercent
     */
    public Double getUsedPercent() {
        return usedPercent;
    }

    public void setUsedPercent(Double usedPercent) {
        this.usedPercent = usedPercent;
    }

    public ResourceUsage withQuota(Double quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 配额总量
     * minimum: 0
     * maximum: 2E+8
     * @return quota
     */
    public Double getQuota() {
        return quota;
    }

    public void setQuota(Double quota) {
        this.quota = quota;
    }

    public ResourceUsage withUsed(Double used) {
        this.used = used;
        return this;
    }

    /**
     * 已用量
     * minimum: 0
     * maximum: 2E+8
     * @return used
     */
    public Double getUsed() {
        return used;
    }

    public void setUsed(Double used) {
        this.used = used;
    }

    public ResourceUsage withFree(Double free) {
        this.free = free;
        return this;
    }

    /**
     * 剩余量
     * minimum: 0
     * maximum: 2E+8
     * @return free
     */
    public Double getFree() {
        return free;
    }

    public void setFree(Double free) {
        this.free = free;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceUsage that = (ResourceUsage) obj;
        return Objects.equals(this.unit, that.unit) && Objects.equals(this.resourceTypeName, that.resourceTypeName)
            && Objects.equals(this.sourceResourceSpecCode, that.sourceResourceSpecCode)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.usedPercent, that.usedPercent)
            && Objects.equals(this.quota, that.quota) && Objects.equals(this.used, that.used)
            && Objects.equals(this.free, that.free);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit,
            resourceTypeName,
            sourceResourceSpecCode,
            resourceSpecCode,
            sourceType,
            usedPercent,
            quota,
            used,
            free);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceUsage {\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    sourceResourceSpecCode: ").append(toIndentedString(sourceResourceSpecCode)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    usedPercent: ").append(toIndentedString(usedPercent)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    free: ").append(toIndentedString(free)).append("\n");
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
