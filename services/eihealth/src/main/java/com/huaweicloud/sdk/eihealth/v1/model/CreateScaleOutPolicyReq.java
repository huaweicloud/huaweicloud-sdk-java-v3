package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateScaleOutPolicyReq
 */
public class CreateScaleOutPolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_nodes")

    private Integer maxNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_nodes")

    private Integer minNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_spec_code")

    private String dataDiskSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_size")

    private Integer dataDiskSize;

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

    public CreateScaleOutPolicyReq withName(String name) {
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

    public CreateScaleOutPolicyReq withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateScaleOutPolicyReq withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 规格编码
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public CreateScaleOutPolicyReq withMaxNodes(Integer maxNodes) {
        this.maxNodes = maxNodes;
        return this;
    }

    /**
     * 扩容节点数上限
     * minimum: 1
     * maximum: 50
     * @return maxNodes
     */
    public Integer getMaxNodes() {
        return maxNodes;
    }

    public void setMaxNodes(Integer maxNodes) {
        this.maxNodes = maxNodes;
    }

    public CreateScaleOutPolicyReq withMinNodes(Integer minNodes) {
        this.minNodes = minNodes;
        return this;
    }

    /**
     * 扩容节点数下限
     * minimum: 1
     * maximum: 50
     * @return minNodes
     */
    public Integer getMinNodes() {
        return minNodes;
    }

    public void setMinNodes(Integer minNodes) {
        this.minNodes = minNodes;
    }

    public CreateScaleOutPolicyReq withDataDiskSpecCode(String dataDiskSpecCode) {
        this.dataDiskSpecCode = dataDiskSpecCode;
        return this;
    }

    /**
     * 额外数据盘规格编码
     * @return dataDiskSpecCode
     */
    public String getDataDiskSpecCode() {
        return dataDiskSpecCode;
    }

    public void setDataDiskSpecCode(String dataDiskSpecCode) {
        this.dataDiskSpecCode = dataDiskSpecCode;
    }

    public CreateScaleOutPolicyReq withDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }

    /**
     * 额外数据盘大小
     * minimum: 100
     * maximum: 32768
     * @return dataDiskSize
     */
    public Integer getDataDiskSize() {
        return dataDiskSize;
    }

    public void setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
    }

    public CreateScaleOutPolicyReq withCpuRuleEnable(Boolean cpuRuleEnable) {
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

    public CreateScaleOutPolicyReq withCpuPercent(Integer cpuPercent) {
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

    public CreateScaleOutPolicyReq withAddNodesForCpuRule(Integer addNodesForCpuRule) {
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

    public CreateScaleOutPolicyReq withMemRuleEnable(Boolean memRuleEnable) {
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

    public CreateScaleOutPolicyReq withMemPercent(Integer memPercent) {
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

    public CreateScaleOutPolicyReq withAddNodesForMemRule(Integer addNodesForMemRule) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateScaleOutPolicyReq createScaleOutPolicyReq = (CreateScaleOutPolicyReq) o;
        return Objects.equals(this.name, createScaleOutPolicyReq.name)
            && Objects.equals(this.availabilityZone, createScaleOutPolicyReq.availabilityZone)
            && Objects.equals(this.specCode, createScaleOutPolicyReq.specCode)
            && Objects.equals(this.maxNodes, createScaleOutPolicyReq.maxNodes)
            && Objects.equals(this.minNodes, createScaleOutPolicyReq.minNodes)
            && Objects.equals(this.dataDiskSpecCode, createScaleOutPolicyReq.dataDiskSpecCode)
            && Objects.equals(this.dataDiskSize, createScaleOutPolicyReq.dataDiskSize)
            && Objects.equals(this.cpuRuleEnable, createScaleOutPolicyReq.cpuRuleEnable)
            && Objects.equals(this.cpuPercent, createScaleOutPolicyReq.cpuPercent)
            && Objects.equals(this.addNodesForCpuRule, createScaleOutPolicyReq.addNodesForCpuRule)
            && Objects.equals(this.memRuleEnable, createScaleOutPolicyReq.memRuleEnable)
            && Objects.equals(this.memPercent, createScaleOutPolicyReq.memPercent)
            && Objects.equals(this.addNodesForMemRule, createScaleOutPolicyReq.addNodesForMemRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            availabilityZone,
            specCode,
            maxNodes,
            minNodes,
            dataDiskSpecCode,
            dataDiskSize,
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
        sb.append("class CreateScaleOutPolicyReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    maxNodes: ").append(toIndentedString(maxNodes)).append("\n");
        sb.append("    minNodes: ").append(toIndentedString(minNodes)).append("\n");
        sb.append("    dataDiskSpecCode: ").append(toIndentedString(dataDiskSpecCode)).append("\n");
        sb.append("    dataDiskSize: ").append(toIndentedString(dataDiskSize)).append("\n");
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
