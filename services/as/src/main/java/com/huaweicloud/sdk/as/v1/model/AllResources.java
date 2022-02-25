package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 配额资源 */
public class AllResources {

    /** 查询配额的类型。scaling_Group：伸缩组配额。scaling_Config：伸缩配置配额。scaling_Policy：伸缩策略配额。scaling_Instance：伸缩实例配额。bandwidth_scaling_policy：伸缩带宽策略配额。 */
    public static final class TypeEnum {

        /** Enum SCALING_GROUP for value: "scaling_group" */
        public static final TypeEnum SCALING_GROUP = new TypeEnum("scaling_group");

        /** Enum SCALING_CONFIG for value: "scaling_config" */
        public static final TypeEnum SCALING_CONFIG = new TypeEnum("scaling_config");

        /** Enum SCALING_POLICY for value: "scaling_Policy" */
        public static final TypeEnum SCALING_POLICY = new TypeEnum("scaling_Policy");

        /** Enum SCALING_INSTANCE for value: "scaling_Instance" */
        public static final TypeEnum SCALING_INSTANCE = new TypeEnum("scaling_Instance");

        /** Enum BANDWIDTH_SCALING_POLICY for value: "bandwidth_scaling_policy" */
        public static final TypeEnum BANDWIDTH_SCALING_POLICY = new TypeEnum("bandwidth_scaling_policy");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("scaling_group", SCALING_GROUP);
            map.put("scaling_config", SCALING_CONFIG);
            map.put("scaling_Policy", SCALING_POLICY);
            map.put("scaling_Instance", SCALING_INSTANCE);
            map.put("bandwidth_scaling_policy", BANDWIDTH_SCALING_POLICY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    public AllResources withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 查询配额的类型。scaling_Group：伸缩组配额。scaling_Config：伸缩配置配额。scaling_Policy：伸缩策略配额。scaling_Instance：伸缩实例配额。bandwidth_scaling_policy：伸缩带宽策略配额。
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AllResources withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /** 已使用的配额数量。当type为scaling_Policy和scaling_Instance时，该字段为保留字段，返回-1。可通过查询弹性伸缩策略和伸缩实例配额查询指定弹性伸缩组下的弹性伸缩策略和伸缩实例已使用的配额数量。
     * 
     * @return used */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public AllResources withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /** 配额总数量。
     * 
     * @return quota */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public AllResources withMax(Integer max) {
        this.max = max;
        return this;
    }

    /** 配额上限。
     * 
     * @return max */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public AllResources withMin(Integer min) {
        this.min = min;
        return this;
    }

    /** 配额下限。
     * 
     * @return min */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllResources allResources = (AllResources) o;
        return Objects.equals(this.type, allResources.type) && Objects.equals(this.used, allResources.used)
            && Objects.equals(this.quota, allResources.quota) && Objects.equals(this.max, allResources.max)
            && Objects.equals(this.min, allResources.min);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, used, quota, max, min);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllResources {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
