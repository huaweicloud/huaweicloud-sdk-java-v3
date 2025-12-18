package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点池扩容时覆盖节点的默认计费模式配置
 */
public class ScaleUpBillingConfigOverride {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billingMode")

    private Integer billingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private ScaleUpExtendParam extendParam;

    public ScaleUpBillingConfigOverride withBillingMode(Integer billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    /**
     * **参数解释**： 节点计费类型 **约束限制**： 选填参数，不填表示使用节点池默认计费配置 **取值范围**： - 0：按需 - 1：包周期 **默认取值**： 不涉及
     * @return billingMode
     */
    public Integer getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(Integer billingMode) {
        this.billingMode = billingMode;
    }

    public ScaleUpBillingConfigOverride withExtendParam(ScaleUpExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public ScaleUpBillingConfigOverride withExtendParam(Consumer<ScaleUpExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new ScaleUpExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public ScaleUpExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(ScaleUpExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScaleUpBillingConfigOverride that = (ScaleUpBillingConfigOverride) obj;
        return Objects.equals(this.billingMode, that.billingMode) && Objects.equals(this.extendParam, that.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingMode, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleUpBillingConfigOverride {\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
