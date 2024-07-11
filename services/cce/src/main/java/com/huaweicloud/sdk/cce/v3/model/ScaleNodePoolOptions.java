package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点池伸缩选项配置
 */
public class ScaleNodePoolOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scalableChecking")

    private String scalableChecking;

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
            && Objects.equals(this.billingConfigOverride, that.billingConfigOverride);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalableChecking, billingConfigOverride);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleNodePoolOptions {\n");
        sb.append("    scalableChecking: ").append(toIndentedString(scalableChecking)).append("\n");
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
