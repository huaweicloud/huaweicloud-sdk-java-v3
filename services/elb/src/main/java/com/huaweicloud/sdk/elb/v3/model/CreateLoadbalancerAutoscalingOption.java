package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 弹性扩缩容配置信息。负载均衡器配置并开启弹性扩缩容后，可根据负载情况自动调整负载均衡器的规格。 使用说明： - 仅当局点支持弹性扩缩特性该字段才有效。可咨询客服了解当前局点是否支持弹性扩缩容特性。 -
 * 开启弹性扩缩容后，l4_flavor_id和l7_flavor_id不再起作用。 */
public class CreateLoadbalancerAutoscalingOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_l4_flavor_id")

    private String minL4FlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_l7_flavor_id")

    private String minL7FlavorId;

    public CreateLoadbalancerAutoscalingOption withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /** 当前负载均衡器是否开启弹性扩缩容。 取值： - true：开启。 - false：不开启。
     * 
     * @return enable */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public CreateLoadbalancerAutoscalingOption withMinL4FlavorId(String minL4FlavorId) {
        this.minL4FlavorId = minL4FlavorId;
        return this;
    }

    /** 弹性扩缩容的最小四层规格ID，有四层监听器时，该字段不能为空。
     * 
     * @return minL4FlavorId */
    public String getMinL4FlavorId() {
        return minL4FlavorId;
    }

    public void setMinL4FlavorId(String minL4FlavorId) {
        this.minL4FlavorId = minL4FlavorId;
    }

    public CreateLoadbalancerAutoscalingOption withMinL7FlavorId(String minL7FlavorId) {
        this.minL7FlavorId = minL7FlavorId;
        return this;
    }

    /** 弹性扩缩容的最小七层规格ID，有七层监听器时，该字段不能为空。
     * 
     * @return minL7FlavorId */
    public String getMinL7FlavorId() {
        return minL7FlavorId;
    }

    public void setMinL7FlavorId(String minL7FlavorId) {
        this.minL7FlavorId = minL7FlavorId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateLoadbalancerAutoscalingOption createLoadbalancerAutoscalingOption =
            (CreateLoadbalancerAutoscalingOption) o;
        return Objects.equals(this.enable, createLoadbalancerAutoscalingOption.enable)
            && Objects.equals(this.minL4FlavorId, createLoadbalancerAutoscalingOption.minL4FlavorId)
            && Objects.equals(this.minL7FlavorId, createLoadbalancerAutoscalingOption.minL7FlavorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, minL4FlavorId, minL7FlavorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLoadbalancerAutoscalingOption {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    minL4FlavorId: ").append(toIndentedString(minL4FlavorId)).append("\n");
        sb.append("    minL7FlavorId: ").append(toIndentedString(minL7FlavorId)).append("\n");
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