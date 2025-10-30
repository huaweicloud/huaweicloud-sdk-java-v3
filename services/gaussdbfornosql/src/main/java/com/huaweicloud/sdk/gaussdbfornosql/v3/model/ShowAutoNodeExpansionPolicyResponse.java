package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAutoNodeExpansionPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_option")

    private Boolean switchOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overload_node_threshold")

    private Integer overloadNodeThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_threshold")

    private Integer cpuThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_threshold")

    private Integer memThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private Integer step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_limit")

    private Integer nodeLimit;

    public ShowAutoNodeExpansionPolicyResponse withSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
        return this;
    }

    /**
     * **参数解释：** 节点扩容是否开启。 **约束限制：** 不涉及。 **取值范围：**   true为开启。   false为关闭。 **默认取值：** 不涉及。
     * @return switchOption
     */
    public Boolean getSwitchOption() {
        return switchOption;
    }

    public void setSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
    }

    public ShowAutoNodeExpansionPolicyResponse withOverloadNodeThreshold(Integer overloadNodeThreshold) {
        this.overloadNodeThreshold = overloadNodeThreshold;
        return this;
    }

    /**
     * **参数解释：** 超负载节点比例。当大等于overload_node_threshold%的节点，节点内存使用率或cpu使用率满足条件时，触发自动扩容节点。 **约束限制：** 不涉及。 **取值范围：** 1-100的正整数。 **默认取值：** 不涉及。
     * @return overloadNodeThreshold
     */
    public Integer getOverloadNodeThreshold() {
        return overloadNodeThreshold;
    }

    public void setOverloadNodeThreshold(Integer overloadNodeThreshold) {
        this.overloadNodeThreshold = overloadNodeThreshold;
    }

    public ShowAutoNodeExpansionPolicyResponse withCpuThreshold(Integer cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
        return this;
    }

    /**
     * **参数解释：** 触发节点自动扩容的CPU使用率。 **约束限制：** 不涉及。 **取值范围：** 1-100的正整数。 **默认取值：** 不涉及。
     * @return cpuThreshold
     */
    public Integer getCpuThreshold() {
        return cpuThreshold;
    }

    public void setCpuThreshold(Integer cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
    }

    public ShowAutoNodeExpansionPolicyResponse withMemThreshold(Integer memThreshold) {
        this.memThreshold = memThreshold;
        return this;
    }

    /**
     * **参数解释：** 触发节点自动扩容的内存使用率。 **约束限制：** 不涉及。 **取值范围：** 1-100的正整数。 **默认取值：** 不涉及。
     * @return memThreshold
     */
    public Integer getMemThreshold() {
        return memThreshold;
    }

    public void setMemThreshold(Integer memThreshold) {
        this.memThreshold = memThreshold;
    }

    public ShowAutoNodeExpansionPolicyResponse withStep(Integer step) {
        this.step = step;
        return this;
    }

    /**
     * **参数解释：** 每次扩容的节点个数。 **约束限制：** 不涉及。 **取值范围：** 大等于1的正整数，最大不超过可扩容的节点上限。 **默认取值：** 不涉及。
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public ShowAutoNodeExpansionPolicyResponse withNodeLimit(Integer nodeLimit) {
        this.nodeLimit = nodeLimit;
        return this;
    }

    /**
     * **参数解释：** 自动扩容所能达到的节点上限。 **约束限制：** 不涉及。 **取值范围：** 大等于1的正整数，最大不超过当前实例可扩容的节点上限。 **默认取值：** 不涉及。
     * @return nodeLimit
     */
    public Integer getNodeLimit() {
        return nodeLimit;
    }

    public void setNodeLimit(Integer nodeLimit) {
        this.nodeLimit = nodeLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutoNodeExpansionPolicyResponse that = (ShowAutoNodeExpansionPolicyResponse) obj;
        return Objects.equals(this.switchOption, that.switchOption)
            && Objects.equals(this.overloadNodeThreshold, that.overloadNodeThreshold)
            && Objects.equals(this.cpuThreshold, that.cpuThreshold)
            && Objects.equals(this.memThreshold, that.memThreshold) && Objects.equals(this.step, that.step)
            && Objects.equals(this.nodeLimit, that.nodeLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchOption, overloadNodeThreshold, cpuThreshold, memThreshold, step, nodeLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoNodeExpansionPolicyResponse {\n");
        sb.append("    switchOption: ").append(toIndentedString(switchOption)).append("\n");
        sb.append("    overloadNodeThreshold: ").append(toIndentedString(overloadNodeThreshold)).append("\n");
        sb.append("    cpuThreshold: ").append(toIndentedString(cpuThreshold)).append("\n");
        sb.append("    memThreshold: ").append(toIndentedString(memThreshold)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    nodeLimit: ").append(toIndentedString(nodeLimit)).append("\n");
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
