package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Resources
 */
public class Resources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    /**
     * 资源类型。 fgs_func_scale_down_timeout：v1版本函数的实例闲置释放时间 fgs_func_occurs：v1版本函数为实例数配额, v2版本函数为预留实例配额 fgs_func_pat_idle_time：vpc函数的pat闲置释放时间 fgs_func_num：用户函数数量配额 fgs_func_code_size：用户函数总代码大小配额 fgs_workflow_num：用户函数流数量配额 fgs_on_demand_instance_limit：v2版本函数单函数最大实例数配额 fgs_func_qos_limit 用户函数实例数配额
     */
    public static final class TypeEnum {

        /**
         * Enum FGS_FUNC_SCALE_DOWN_TIMEOUT for value: "fgs_func_scale_down_timeout"
         */
        public static final TypeEnum FGS_FUNC_SCALE_DOWN_TIMEOUT = new TypeEnum("fgs_func_scale_down_timeout");

        /**
         * Enum FGS_FUNC_OCCURS for value: "fgs_func_occurs"
         */
        public static final TypeEnum FGS_FUNC_OCCURS = new TypeEnum("fgs_func_occurs");

        /**
         * Enum FGS_FUNC_PAT_IDLE_TIME for value: "fgs_func_pat_idle_time"
         */
        public static final TypeEnum FGS_FUNC_PAT_IDLE_TIME = new TypeEnum("fgs_func_pat_idle_time");

        /**
         * Enum FGS_FUNC_NUM for value: "fgs_func_num"
         */
        public static final TypeEnum FGS_FUNC_NUM = new TypeEnum("fgs_func_num");

        /**
         * Enum FGS_FUNC_CODE_SIZE for value: "fgs_func_code_size"
         */
        public static final TypeEnum FGS_FUNC_CODE_SIZE = new TypeEnum("fgs_func_code_size");

        /**
         * Enum FGS_WORKFLOW_NUM for value: "fgs_workflow_num"
         */
        public static final TypeEnum FGS_WORKFLOW_NUM = new TypeEnum("fgs_workflow_num");

        /**
         * Enum FGS_ON_DEMAND_INSTANCE_LIMIT for value: "fgs_on_demand_instance_limit"
         */
        public static final TypeEnum FGS_ON_DEMAND_INSTANCE_LIMIT = new TypeEnum("fgs_on_demand_instance_limit");

        /**
         * Enum FGS_FUNC_QOS_LIMIT for value: "fgs_func_qos_limit"
         */
        public static final TypeEnum FGS_FUNC_QOS_LIMIT = new TypeEnum("fgs_func_qos_limit");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("fgs_func_scale_down_timeout", FGS_FUNC_SCALE_DOWN_TIMEOUT);
            map.put("fgs_func_occurs", FGS_FUNC_OCCURS);
            map.put("fgs_func_pat_idle_time", FGS_FUNC_PAT_IDLE_TIME);
            map.put("fgs_func_num", FGS_FUNC_NUM);
            map.put("fgs_func_code_size", FGS_FUNC_CODE_SIZE);
            map.put("fgs_workflow_num", FGS_WORKFLOW_NUM);
            map.put("fgs_on_demand_instance_limit", FGS_ON_DEMAND_INSTANCE_LIMIT);
            map.put("fgs_func_qos_limit", FGS_FUNC_QOS_LIMIT);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "unit")

    private String unit;

    public Resources withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 函数配额限制。
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Resources withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用的配额。
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public Resources withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型。 fgs_func_scale_down_timeout：v1版本函数的实例闲置释放时间 fgs_func_occurs：v1版本函数为实例数配额, v2版本函数为预留实例配额 fgs_func_pat_idle_time：vpc函数的pat闲置释放时间 fgs_func_num：用户函数数量配额 fgs_func_code_size：用户函数总代码大小配额 fgs_workflow_num：用户函数流数量配额 fgs_on_demand_instance_limit：v2版本函数单函数最大实例数配额 fgs_func_qos_limit 用户函数实例数配额
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Resources withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 资源的计数单位。fgs_func_code_size,单位为MB,其他场景无单位
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Resources that = (Resources) obj;
        return Objects.equals(this.quota, that.quota) && Objects.equals(this.used, that.used)
            && Objects.equals(this.type, that.type) && Objects.equals(this.unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quota, used, type, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resources {\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
