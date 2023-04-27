package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowScaleOutPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_spec")

    private NodeSpecDto nodeSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private Integer nodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_nodes")

    private Integer maxNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_nodes")

    private Integer minNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_times")

    private Integer scalingTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_enable")

    private Boolean scalingEnable;

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

    public ShowScaleOutPolicyResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 策略ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowScaleOutPolicyResponse withName(String name) {
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

    public ShowScaleOutPolicyResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowScaleOutPolicyResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowScaleOutPolicyResponse withNodeSpec(NodeSpecDto nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }

    public ShowScaleOutPolicyResponse withNodeSpec(Consumer<NodeSpecDto> nodeSpecSetter) {
        if (this.nodeSpec == null) {
            this.nodeSpec = new NodeSpecDto();
            nodeSpecSetter.accept(this.nodeSpec);
        }

        return this;
    }

    /**
     * Get nodeSpec
     * @return nodeSpec
     */
    public NodeSpecDto getNodeSpec() {
        return nodeSpec;
    }

    public void setNodeSpec(NodeSpecDto nodeSpec) {
        this.nodeSpec = nodeSpec;
    }

    public ShowScaleOutPolicyResponse withAvailabilityZone(String availabilityZone) {
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

    public ShowScaleOutPolicyResponse withNodes(Integer nodes) {
        this.nodes = nodes;
        return this;
    }

    /**
     * 节点数量
     * @return nodes
     */
    public Integer getNodes() {
        return nodes;
    }

    public void setNodes(Integer nodes) {
        this.nodes = nodes;
    }

    public ShowScaleOutPolicyResponse withMaxNodes(Integer maxNodes) {
        this.maxNodes = maxNodes;
        return this;
    }

    /**
     * 扩容节点数上限
     * @return maxNodes
     */
    public Integer getMaxNodes() {
        return maxNodes;
    }

    public void setMaxNodes(Integer maxNodes) {
        this.maxNodes = maxNodes;
    }

    public ShowScaleOutPolicyResponse withMinNodes(Integer minNodes) {
        this.minNodes = minNodes;
        return this;
    }

    /**
     * 扩容节点数下限
     * @return minNodes
     */
    public Integer getMinNodes() {
        return minNodes;
    }

    public void setMinNodes(Integer minNodes) {
        this.minNodes = minNodes;
    }

    public ShowScaleOutPolicyResponse withScalingTimes(Integer scalingTimes) {
        this.scalingTimes = scalingTimes;
        return this;
    }

    /**
     * 伸缩次数
     * @return scalingTimes
     */
    public Integer getScalingTimes() {
        return scalingTimes;
    }

    public void setScalingTimes(Integer scalingTimes) {
        this.scalingTimes = scalingTimes;
    }

    public ShowScaleOutPolicyResponse withScalingEnable(Boolean scalingEnable) {
        this.scalingEnable = scalingEnable;
        return this;
    }

    /**
     * 是否开启自动扩容
     * @return scalingEnable
     */
    public Boolean getScalingEnable() {
        return scalingEnable;
    }

    public void setScalingEnable(Boolean scalingEnable) {
        this.scalingEnable = scalingEnable;
    }

    public ShowScaleOutPolicyResponse withCpuRuleEnable(Boolean cpuRuleEnable) {
        this.cpuRuleEnable = cpuRuleEnable;
        return this;
    }

    /**
     * 是否开启cpu执行策略
     * @return cpuRuleEnable
     */
    public Boolean getCpuRuleEnable() {
        return cpuRuleEnable;
    }

    public void setCpuRuleEnable(Boolean cpuRuleEnable) {
        this.cpuRuleEnable = cpuRuleEnable;
    }

    public ShowScaleOutPolicyResponse withCpuPercent(Integer cpuPercent) {
        this.cpuPercent = cpuPercent;
        return this;
    }

    /**
     * cpu分配率百分比
     * @return cpuPercent
     */
    public Integer getCpuPercent() {
        return cpuPercent;
    }

    public void setCpuPercent(Integer cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    public ShowScaleOutPolicyResponse withAddNodesForCpuRule(Integer addNodesForCpuRule) {
        this.addNodesForCpuRule = addNodesForCpuRule;
        return this;
    }

    /**
     * 满足扩容策略中cpu分配率时增加的节点数
     * @return addNodesForCpuRule
     */
    public Integer getAddNodesForCpuRule() {
        return addNodesForCpuRule;
    }

    public void setAddNodesForCpuRule(Integer addNodesForCpuRule) {
        this.addNodesForCpuRule = addNodesForCpuRule;
    }

    public ShowScaleOutPolicyResponse withMemRuleEnable(Boolean memRuleEnable) {
        this.memRuleEnable = memRuleEnable;
        return this;
    }

    /**
     * 是否开启mem执行策略
     * @return memRuleEnable
     */
    public Boolean getMemRuleEnable() {
        return memRuleEnable;
    }

    public void setMemRuleEnable(Boolean memRuleEnable) {
        this.memRuleEnable = memRuleEnable;
    }

    public ShowScaleOutPolicyResponse withMemPercent(Integer memPercent) {
        this.memPercent = memPercent;
        return this;
    }

    /**
     * mem分配率百分比
     * @return memPercent
     */
    public Integer getMemPercent() {
        return memPercent;
    }

    public void setMemPercent(Integer memPercent) {
        this.memPercent = memPercent;
    }

    public ShowScaleOutPolicyResponse withAddNodesForMemRule(Integer addNodesForMemRule) {
        this.addNodesForMemRule = addNodesForMemRule;
        return this;
    }

    /**
     * 满足扩容策略中mem分配率时增加的节点数
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
        ShowScaleOutPolicyResponse showScaleOutPolicyResponse = (ShowScaleOutPolicyResponse) o;
        return Objects.equals(this.id, showScaleOutPolicyResponse.id)
            && Objects.equals(this.name, showScaleOutPolicyResponse.name)
            && Objects.equals(this.status, showScaleOutPolicyResponse.status)
            && Objects.equals(this.createTime, showScaleOutPolicyResponse.createTime)
            && Objects.equals(this.nodeSpec, showScaleOutPolicyResponse.nodeSpec)
            && Objects.equals(this.availabilityZone, showScaleOutPolicyResponse.availabilityZone)
            && Objects.equals(this.nodes, showScaleOutPolicyResponse.nodes)
            && Objects.equals(this.maxNodes, showScaleOutPolicyResponse.maxNodes)
            && Objects.equals(this.minNodes, showScaleOutPolicyResponse.minNodes)
            && Objects.equals(this.scalingTimes, showScaleOutPolicyResponse.scalingTimes)
            && Objects.equals(this.scalingEnable, showScaleOutPolicyResponse.scalingEnable)
            && Objects.equals(this.cpuRuleEnable, showScaleOutPolicyResponse.cpuRuleEnable)
            && Objects.equals(this.cpuPercent, showScaleOutPolicyResponse.cpuPercent)
            && Objects.equals(this.addNodesForCpuRule, showScaleOutPolicyResponse.addNodesForCpuRule)
            && Objects.equals(this.memRuleEnable, showScaleOutPolicyResponse.memRuleEnable)
            && Objects.equals(this.memPercent, showScaleOutPolicyResponse.memPercent)
            && Objects.equals(this.addNodesForMemRule, showScaleOutPolicyResponse.addNodesForMemRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            createTime,
            nodeSpec,
            availabilityZone,
            nodes,
            maxNodes,
            minNodes,
            scalingTimes,
            scalingEnable,
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
        sb.append("class ShowScaleOutPolicyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    nodeSpec: ").append(toIndentedString(nodeSpec)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    maxNodes: ").append(toIndentedString(maxNodes)).append("\n");
        sb.append("    minNodes: ").append(toIndentedString(minNodes)).append("\n");
        sb.append("    scalingTimes: ").append(toIndentedString(scalingTimes)).append("\n");
        sb.append("    scalingEnable: ").append(toIndentedString(scalingEnable)).append("\n");
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
