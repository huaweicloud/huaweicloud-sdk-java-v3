package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateScaleOutPolicyReq
 */
public class UpdateScaleOutPolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_nodes")

    private Integer maxNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_nodes")

    private Integer minNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_rule_enable")

    private Boolean cpuRuleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_percent")

    private Integer cpuPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_nodes_for_cpu_rule")

    private Integer addNodesForCpuRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_rule_enable")

    private Boolean memRuleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_percent")

    private Integer memPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_nodes_for_mem_rule")

    private Integer addNodesForMemRule;

    public UpdateScaleOutPolicyReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateScaleOutPolicyReq withMaxNodes(Integer maxNodes) {
        this.maxNodes = maxNodes;
        return this;
    }

    /**
     * 扩容节点数上限
     * minimum: 0
     * maximum: 50
     * @return maxNodes
     */
    public Integer getMaxNodes() {
        return maxNodes;
    }

    public void setMaxNodes(Integer maxNodes) {
        this.maxNodes = maxNodes;
    }

    public UpdateScaleOutPolicyReq withMinNodes(Integer minNodes) {
        this.minNodes = minNodes;
        return this;
    }

    /**
     * 扩容节点数下限
     * minimum: 0
     * maximum: 50
     * @return minNodes
     */
    public Integer getMinNodes() {
        return minNodes;
    }

    public void setMinNodes(Integer minNodes) {
        this.minNodes = minNodes;
    }

    public UpdateScaleOutPolicyReq withCpuRuleEnable(Boolean cpuRuleEnable) {
        this.cpuRuleEnable = cpuRuleEnable;
        return this;
    }

    /**
     * 是否启用cpu规则
     * @return cpuRuleEnable
     */
    public Boolean getCpuRuleEnable() {
        return cpuRuleEnable;
    }

    public void setCpuRuleEnable(Boolean cpuRuleEnable) {
        this.cpuRuleEnable = cpuRuleEnable;
    }

    public UpdateScaleOutPolicyReq withCpuPercent(Integer cpuPercent) {
        this.cpuPercent = cpuPercent;
        return this;
    }

    /**
     * cpu分配率百分比
     * minimum: 1
     * maximum: 100
     * @return cpuPercent
     */
    public Integer getCpuPercent() {
        return cpuPercent;
    }

    public void setCpuPercent(Integer cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    public UpdateScaleOutPolicyReq withAddNodesForCpuRule(Integer addNodesForCpuRule) {
        this.addNodesForCpuRule = addNodesForCpuRule;
        return this;
    }

    /**
     * 满足扩容策略中cpu分配率时增加的节点数
     * minimum: 1
     * maximum: 50
     * @return addNodesForCpuRule
     */
    public Integer getAddNodesForCpuRule() {
        return addNodesForCpuRule;
    }

    public void setAddNodesForCpuRule(Integer addNodesForCpuRule) {
        this.addNodesForCpuRule = addNodesForCpuRule;
    }

    public UpdateScaleOutPolicyReq withMemRuleEnable(Boolean memRuleEnable) {
        this.memRuleEnable = memRuleEnable;
        return this;
    }

    /**
     * 是否启用mem规则
     * @return memRuleEnable
     */
    public Boolean getMemRuleEnable() {
        return memRuleEnable;
    }

    public void setMemRuleEnable(Boolean memRuleEnable) {
        this.memRuleEnable = memRuleEnable;
    }

    public UpdateScaleOutPolicyReq withMemPercent(Integer memPercent) {
        this.memPercent = memPercent;
        return this;
    }

    /**
     * mem分配率百分比
     * minimum: 1
     * maximum: 100
     * @return memPercent
     */
    public Integer getMemPercent() {
        return memPercent;
    }

    public void setMemPercent(Integer memPercent) {
        this.memPercent = memPercent;
    }

    public UpdateScaleOutPolicyReq withAddNodesForMemRule(Integer addNodesForMemRule) {
        this.addNodesForMemRule = addNodesForMemRule;
        return this;
    }

    /**
     * 满足扩容策略中mem分配率时增加的节点数
     * minimum: 1
     * maximum: 50
     * @return addNodesForMemRule
     */
    public Integer getAddNodesForMemRule() {
        return addNodesForMemRule;
    }

    public void setAddNodesForMemRule(Integer addNodesForMemRule) {
        this.addNodesForMemRule = addNodesForMemRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateScaleOutPolicyReq that = (UpdateScaleOutPolicyReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.maxNodes, that.maxNodes)
            && Objects.equals(this.minNodes, that.minNodes) && Objects.equals(this.cpuRuleEnable, that.cpuRuleEnable)
            && Objects.equals(this.cpuPercent, that.cpuPercent)
            && Objects.equals(this.addNodesForCpuRule, that.addNodesForCpuRule)
            && Objects.equals(this.memRuleEnable, that.memRuleEnable)
            && Objects.equals(this.memPercent, that.memPercent)
            && Objects.equals(this.addNodesForMemRule, that.addNodesForMemRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            maxNodes,
            minNodes,
            cpuRuleEnable,
            cpuPercent,
            addNodesForCpuRule,
            memRuleEnable,
            memPercent,
            addNodesForMemRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScaleOutPolicyReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    maxNodes: ").append(toIndentedString(maxNodes)).append("\n");
        sb.append("    minNodes: ").append(toIndentedString(minNodes)).append("\n");
        sb.append("    cpuRuleEnable: ").append(toIndentedString(cpuRuleEnable)).append("\n");
        sb.append("    cpuPercent: ").append(toIndentedString(cpuPercent)).append("\n");
        sb.append("    addNodesForCpuRule: ").append(toIndentedString(addNodesForCpuRule)).append("\n");
        sb.append("    memRuleEnable: ").append(toIndentedString(memRuleEnable)).append("\n");
        sb.append("    memPercent: ").append(toIndentedString(memPercent)).append("\n");
        sb.append("    addNodesForMemRule: ").append(toIndentedString(addNodesForMemRule)).append("\n");
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
