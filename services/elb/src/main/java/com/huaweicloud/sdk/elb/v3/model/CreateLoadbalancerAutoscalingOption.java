package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateLoadbalancerAutoscalingOption
 */
public class CreateLoadbalancerAutoscalingOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_l7_flavor_id")

    private String minL7FlavorId;

    public CreateLoadbalancerAutoscalingOption withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释**：负载均衡器实例弹性扩缩容开关。  **约束限制**：不涉及  **取值范围**： - true：开启。 - false：关闭。   **默认取值**：不涉及  [网关型LB不支持该字段。](tag:hws_eu)
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public CreateLoadbalancerAutoscalingOption withMinL7FlavorId(String minL7FlavorId) {
        this.minL7FlavorId = minL7FlavorId;
        return this;
    }

    /**
     * **参数解释**：实例弹性扩缩容的最小七层规格ID。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
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
        CreateLoadbalancerAutoscalingOption that = (CreateLoadbalancerAutoscalingOption) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.minL7FlavorId, that.minL7FlavorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, minL7FlavorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLoadbalancerAutoscalingOption {\n");
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
