package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点池伸缩选项配置
 */
public class ScaleNodePoolOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scalableChecking")

    private String scalableChecking;

    /**
     * **参数解释**： 扩容的策略，允许为空，该参数scaleGroups传多项时有效。 **约束限制**： 不涉及 **取值范围**： - AZBalance：AZ优先策略，扩容节点池时，系统会使各个AZ间的节点数尽可能的均衡，规格会在所选伸缩组中随机指定。该策略适用于对节点成本和可用区无特殊要求的场景，优点是配置简便、降低单点故障风险。注意：如果某个AZ资源不足，该AZ期望的扩容节点会向其他AZ扩容，可能会使AZ间节点不均衡。如需解决该问题，可在该AZ资源充足时尝试再次扩容。 - Random：随机策略，从下发的规格scaleGroups列表中随机选择伸缩组扩容。  **默认取值**： Random 
     */
    public static final class ScalePolicyEnum {

        /**
         * Enum AZBALANCE for value: "AZBalance"
         */
        public static final ScalePolicyEnum AZBALANCE = new ScalePolicyEnum("AZBalance");

        /**
         * Enum RANDOM for value: "Random"
         */
        public static final ScalePolicyEnum RANDOM = new ScalePolicyEnum("Random");

        private static final Map<String, ScalePolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScalePolicyEnum> createStaticFields() {
            Map<String, ScalePolicyEnum> map = new HashMap<>();
            map.put("AZBalance", AZBALANCE);
            map.put("Random", RANDOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScalePolicyEnum(String value) {
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
        public static ScalePolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScalePolicyEnum(value));
        }

        public static ScalePolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScalePolicyEnum) {
                return this.value.equals(((ScalePolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scalePolicy")

    private ScalePolicyEnum scalePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billingConfigOverride")

    private ScaleUpBillingConfigOverride billingConfigOverride;

    public ScaleNodePoolOptions withScalableChecking(String scalableChecking) {
        this.scalableChecking = scalableChecking;
        return this;
    }

    /**
     * 扩容状态检查策略: instant(同步检查), async(异步检查)。默认同步检查instant 
     * @return scalableChecking
     */
    public String getScalableChecking() {
        return scalableChecking;
    }

    public void setScalableChecking(String scalableChecking) {
        this.scalableChecking = scalableChecking;
    }

    public ScaleNodePoolOptions withScalePolicy(ScalePolicyEnum scalePolicy) {
        this.scalePolicy = scalePolicy;
        return this;
    }

    /**
     * **参数解释**： 扩容的策略，允许为空，该参数scaleGroups传多项时有效。 **约束限制**： 不涉及 **取值范围**： - AZBalance：AZ优先策略，扩容节点池时，系统会使各个AZ间的节点数尽可能的均衡，规格会在所选伸缩组中随机指定。该策略适用于对节点成本和可用区无特殊要求的场景，优点是配置简便、降低单点故障风险。注意：如果某个AZ资源不足，该AZ期望的扩容节点会向其他AZ扩容，可能会使AZ间节点不均衡。如需解决该问题，可在该AZ资源充足时尝试再次扩容。 - Random：随机策略，从下发的规格scaleGroups列表中随机选择伸缩组扩容。  **默认取值**： Random 
     * @return scalePolicy
     */
    public ScalePolicyEnum getScalePolicy() {
        return scalePolicy;
    }

    public void setScalePolicy(ScalePolicyEnum scalePolicy) {
        this.scalePolicy = scalePolicy;
    }

    public ScaleNodePoolOptions withBillingConfigOverride(ScaleUpBillingConfigOverride billingConfigOverride) {
        this.billingConfigOverride = billingConfigOverride;
        return this;
    }

    public ScaleNodePoolOptions withBillingConfigOverride(
        Consumer<ScaleUpBillingConfigOverride> billingConfigOverrideSetter) {
        if (this.billingConfigOverride == null) {
            this.billingConfigOverride = new ScaleUpBillingConfigOverride();
            billingConfigOverrideSetter.accept(this.billingConfigOverride);
        }

        return this;
    }

    /**
     * Get billingConfigOverride
     * @return billingConfigOverride
     */
    public ScaleUpBillingConfigOverride getBillingConfigOverride() {
        return billingConfigOverride;
    }

    public void setBillingConfigOverride(ScaleUpBillingConfigOverride billingConfigOverride) {
        this.billingConfigOverride = billingConfigOverride;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScaleNodePoolOptions that = (ScaleNodePoolOptions) obj;
        return Objects.equals(this.scalableChecking, that.scalableChecking)
            && Objects.equals(this.scalePolicy, that.scalePolicy)
            && Objects.equals(this.billingConfigOverride, that.billingConfigOverride);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalableChecking, scalePolicy, billingConfigOverride);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleNodePoolOptions {\n");
        sb.append("    scalableChecking: ").append(toIndentedString(scalableChecking)).append("\n");
        sb.append("    scalePolicy: ").append(toIndentedString(scalePolicy)).append("\n");
        sb.append("    billingConfigOverride: ").append(toIndentedString(billingConfigOverride)).append("\n");
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
