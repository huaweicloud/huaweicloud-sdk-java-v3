package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点故障自愈配置
 */
public class NodePoolRepairPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private String policy;

    public NodePoolRepairPolicy withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释**： 系统与 K8s 组件异常时是否启用policy中配置的自愈策略。 **约束限制**： 不涉及 **取值范围**： - false：使用基础自愈策略 - true：使用policy中配置的自愈策略  **默认取值**： false
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public NodePoolRepairPolicy withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * **参数解释**： 节点自愈的恢复策略 **约束限制**： - 当 enable 为 true 时，此字段必填。 - 当 enable 为 false 时，此字段无效，用户填写任意值均不会生效，系统使用基础自愈策略。  **取值范围**： - restartNode：系统与 K8s 组件异常时允许通过重启节点自愈  **默认取值**： 不涉及
     * @return policy
     */
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodePoolRepairPolicy that = (NodePoolRepairPolicy) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolRepairPolicy {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
