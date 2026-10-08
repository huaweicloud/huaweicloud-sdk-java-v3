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
 * ModelManagementQuota
 */
public class ModelManagementQuota {

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

    /**
     * **参数解释：** 配额类型。 **取值范围：** - `model_providers_count`: 模型提供商数量配额，当指定custom_model_provider_id时，不返回该类型的配额详情。 - `total_model_proxies_count`: 模型代理总数量配额，当指定custom_model_provider_id时，不返回该类型的配额详情。 - `model_proxies_count_per_model_provider`: 每个模型提供商关联的模型代理数量配额，仅当指定了custom_model_provider_id时，才会返回该类型的配额详情。 - `models_count_per_model_provider`: 每个模型提供商关联的模型数量配额，仅当指定了custom_model_provider_id时，才会返回该类型的配额详情。 
     */
    public static final class TypeEnum {

        /**
         * Enum MODEL_PROVIDERS_COUNT for value: "model_providers_count"
         */
        public static final TypeEnum MODEL_PROVIDERS_COUNT = new TypeEnum("model_providers_count");

        /**
         * Enum TOTAL_MODEL_PROXIES_COUNT for value: "total_model_proxies_count"
         */
        public static final TypeEnum TOTAL_MODEL_PROXIES_COUNT = new TypeEnum("total_model_proxies_count");

        /**
         * Enum MODEL_PROXIES_COUNT_PER_MODEL_PROVIDER for value: "model_proxies_count_per_model_provider"
         */
        public static final TypeEnum MODEL_PROXIES_COUNT_PER_MODEL_PROVIDER =
            new TypeEnum("model_proxies_count_per_model_provider");

        /**
         * Enum MODELS_COUNT_PER_MODEL_PROVIDER for value: "models_count_per_model_provider"
         */
        public static final TypeEnum MODELS_COUNT_PER_MODEL_PROVIDER = new TypeEnum("models_count_per_model_provider");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("model_providers_count", MODEL_PROVIDERS_COUNT);
            map.put("total_model_proxies_count", TOTAL_MODEL_PROXIES_COUNT);
            map.put("model_proxies_count_per_model_provider", MODEL_PROXIES_COUNT_PER_MODEL_PROVIDER);
            map.put("models_count_per_model_provider", MODELS_COUNT_PER_MODEL_PROVIDER);
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

    public ModelManagementQuota withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * **参数解释：** 最小允许值。 **取值范围：** 1~10000 
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

    public ModelManagementQuota withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * **参数解释：** 最大允许值。 **取值范围：** 1~10000 
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

    public ModelManagementQuota withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * **参数解释：** 当前配置的配额值。 **取值范围：** 1~10000 
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

    public ModelManagementQuota withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * **参数解释：** 已使用数量（实时计算）。 **取值范围：** 0~10000 
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

    public ModelManagementQuota withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 配额类型。 **取值范围：** - `model_providers_count`: 模型提供商数量配额，当指定custom_model_provider_id时，不返回该类型的配额详情。 - `total_model_proxies_count`: 模型代理总数量配额，当指定custom_model_provider_id时，不返回该类型的配额详情。 - `model_proxies_count_per_model_provider`: 每个模型提供商关联的模型代理数量配额，仅当指定了custom_model_provider_id时，才会返回该类型的配额详情。 - `models_count_per_model_provider`: 每个模型提供商关联的模型数量配额，仅当指定了custom_model_provider_id时，才会返回该类型的配额详情。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelManagementQuota that = (ModelManagementQuota) obj;
        return Objects.equals(this.min, that.min) && Objects.equals(this.max, that.max)
            && Objects.equals(this.quota, that.quota) && Objects.equals(this.used, that.used)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max, quota, used, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelManagementQuota {\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
