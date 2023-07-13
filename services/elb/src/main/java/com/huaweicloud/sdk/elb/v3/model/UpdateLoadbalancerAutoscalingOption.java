package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 弹性扩缩容配置信息。负载均衡器配置并开启弹性扩缩容后，可根据负载情况自动调整负载均衡器的规格。  使用说明： - 仅当租户白名单放开后该字段才有效 - 开启弹性扩缩容后，l4_flavor_id和l7_flavor_id表示该LB实例弹性规格的上限。  [不支持该字段，请勿使用。](tag:hws_eu,g42,hk_g42,hcso,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b)
 */
public class UpdateLoadbalancerAutoscalingOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_l7_flavor_id")

    private String minL7FlavorId;

    public UpdateLoadbalancerAutoscalingOption withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 当前负载均衡器是否开启弹性扩缩容。  取值： - true：开启。 - false：不开启。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public UpdateLoadbalancerAutoscalingOption withMinL7FlavorId(String minL7FlavorId) {
        this.minL7FlavorId = minL7FlavorId;
        return this;
    }

    /**
     * 弹性扩缩容的最小七层规格ID（规格类型L7_elastic），有七层监听器时，该字段不能为空。
     * @return minL7FlavorId
     */
    public String getMinL7FlavorId() {
        return minL7FlavorId;
    }

    public void setMinL7FlavorId(String minL7FlavorId) {
        this.minL7FlavorId = minL7FlavorId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLoadbalancerAutoscalingOption that = (UpdateLoadbalancerAutoscalingOption) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.minL7FlavorId, that.minL7FlavorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, minL7FlavorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLoadbalancerAutoscalingOption {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    minL7FlavorId: ").append(toIndentedString(minL7FlavorId)).append("\n");
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
