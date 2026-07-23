package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CoreGatewayQuota
 */
public class CoreGatewayQuota {

    /**
     * **参数解释：** 配额类型。 **取值范围：** - `gateway_count`: 网关数量配额，当指定gateway id时，不返回该类型的配额详情。 - `target_count_per_gateway`: 每个网关的目标服务数量配额，仅当指定了gateway id时，才会返回该类型的配额详情。 
     */
    public static final class TypeEnum {

        /**
         * Enum GATEWAY_COUNT for value: "gateway_count"
         */
        public static final TypeEnum GATEWAY_COUNT = new TypeEnum("gateway_count");

        /**
         * Enum TARGET_COUNT_PER_GATEWAY for value: "target_count_per_gateway"
         */
        public static final TypeEnum TARGET_COUNT_PER_GATEWAY = new TypeEnum("target_count_per_gateway");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("gateway_count", GATEWAY_COUNT);
            map.put("target_count_per_gateway", TARGET_COUNT_PER_GATEWAY);
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
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    public CoreGatewayQuota withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 配额类型。 **取值范围：** - `gateway_count`: 网关数量配额，当指定gateway id时，不返回该类型的配额详情。 - `target_count_per_gateway`: 每个网关的目标服务数量配额，仅当指定了gateway id时，才会返回该类型的配额详情。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CoreGatewayQuota withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * **参数解释：** 最小允许值。 **取值范围：** 取值为 1-10000个。 
     * minimum: 1
     * maximum: 10000
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public CoreGatewayQuota withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * **参数解释：** 最大允许值。 **取值范围：** 取值为 1-10000个。 
     * minimum: 1
     * maximum: 10000
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public CoreGatewayQuota withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * **参数解释：** 当前配置的配额值。 **取值范围：** 取值为 1-10000个。 
     * minimum: 1
     * maximum: 10000
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public CoreGatewayQuota withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * **参数解释：** 已使用数量（实时计算）。 **取值范围：** 取值为 0-10000个。 
     * minimum: 0
     * maximum: 10000
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayQuota that = (CoreGatewayQuota) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.min, that.min)
            && Objects.equals(this.max, that.max) && Objects.equals(this.quota, that.quota)
            && Objects.equals(this.used, that.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, min, max, quota, used);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayQuota {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
