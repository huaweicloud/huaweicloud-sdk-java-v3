package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 竞价计费信息
 */
public class TemplateSpotOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spot_price")

    private Float spotPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_duration_minutes")

    private Integer blockDurationMinutes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_interruption_behavior")

    private String instanceInterruptionBehavior;

    public TemplateSpotOptions withSpotPrice(Float spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * 用户愿意为竞价实例每小时支付的最高价格
     * @return spotPrice
     */
    public Float getSpotPrice() {
        return spotPrice;
    }

    public void setSpotPrice(Float spotPrice) {
        this.spotPrice = spotPrice;
    }

    public TemplateSpotOptions withBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
        return this;
    }

    /**
     * 购买的竞价实例时长
     * @return blockDurationMinutes
     */
    public Integer getBlockDurationMinutes() {
        return blockDurationMinutes;
    }

    public void setBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
    }

    public TemplateSpotOptions withInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        return this;
    }

    /**
     * 竞价实例中断策略，当前支持immediate
     * @return instanceInterruptionBehavior
     */
    public String getInstanceInterruptionBehavior() {
        return instanceInterruptionBehavior;
    }

    public void setInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateSpotOptions that = (TemplateSpotOptions) obj;
        return Objects.equals(this.spotPrice, that.spotPrice)
            && Objects.equals(this.blockDurationMinutes, that.blockDurationMinutes)
            && Objects.equals(this.instanceInterruptionBehavior, that.instanceInterruptionBehavior);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spotPrice, blockDurationMinutes, instanceInterruptionBehavior);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateSpotOptions {\n");
        sb.append("    spotPrice: ").append(toIndentedString(spotPrice)).append("\n");
        sb.append("    blockDurationMinutes: ").append(toIndentedString(blockDurationMinutes)).append("\n");
        sb.append("    instanceInterruptionBehavior: ")
            .append(toIndentedString(instanceInterruptionBehavior))
            .append("\n");
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
