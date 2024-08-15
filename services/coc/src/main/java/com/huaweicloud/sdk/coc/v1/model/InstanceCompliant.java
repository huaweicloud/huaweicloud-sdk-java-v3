package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点合规性报告
 */
public class InstanceCompliant {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliant_summary")

    private CompliantSummary compliantSummary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_compliant_summary")

    private NonCompliantSummary nonCompliantSummary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_summary")

    private ExecutionSummary executionSummary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private String eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_scene")

    private String reportScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_info_id")

    private String cceInfoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_id")

    private String baselineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_name")

    private String baselineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_system")

    private String operatingSystem;

    public InstanceCompliant withCompliantSummary(CompliantSummary compliantSummary) {
        this.compliantSummary = compliantSummary;
        return this;
    }

    public InstanceCompliant withCompliantSummary(Consumer<CompliantSummary> compliantSummarySetter) {
        if (this.compliantSummary == null) {
            this.compliantSummary = new CompliantSummary();
            compliantSummarySetter.accept(this.compliantSummary);
        }

        return this;
    }

    /**
     * Get compliantSummary
     * @return compliantSummary
     */
    public CompliantSummary getCompliantSummary() {
        return compliantSummary;
    }

    public void setCompliantSummary(CompliantSummary compliantSummary) {
        this.compliantSummary = compliantSummary;
    }

    public InstanceCompliant withNonCompliantSummary(NonCompliantSummary nonCompliantSummary) {
        this.nonCompliantSummary = nonCompliantSummary;
        return this;
    }

    public InstanceCompliant withNonCompliantSummary(Consumer<NonCompliantSummary> nonCompliantSummarySetter) {
        if (this.nonCompliantSummary == null) {
            this.nonCompliantSummary = new NonCompliantSummary();
            nonCompliantSummarySetter.accept(this.nonCompliantSummary);
        }

        return this;
    }

    /**
     * Get nonCompliantSummary
     * @return nonCompliantSummary
     */
    public NonCompliantSummary getNonCompliantSummary() {
        return nonCompliantSummary;
    }

    public void setNonCompliantSummary(NonCompliantSummary nonCompliantSummary) {
        this.nonCompliantSummary = nonCompliantSummary;
    }

    public InstanceCompliant withExecutionSummary(ExecutionSummary executionSummary) {
        this.executionSummary = executionSummary;
        return this;
    }

    public InstanceCompliant withExecutionSummary(Consumer<ExecutionSummary> executionSummarySetter) {
        if (this.executionSummary == null) {
            this.executionSummary = new ExecutionSummary();
            executionSummarySetter.accept(this.executionSummary);
        }

        return this;
    }

    /**
     * Get executionSummary
     * @return executionSummary
     */
    public ExecutionSummary getExecutionSummary() {
        return executionSummary;
    }

    public void setExecutionSummary(ExecutionSummary executionSummary) {
        this.executionSummary = executionSummary;
    }

    public InstanceCompliant withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InstanceCompliant withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public InstanceCompliant withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 节点名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceCompliant withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 节点ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceCompliant withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * cce集群节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public InstanceCompliant withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 节点IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public InstanceCompliant withEip(String eip) {
        this.eip = eip;
        return this;
    }

    /**
     * 弹性公网ip
     * @return eip
     */
    public String getEip() {
        return eip;
    }

    public void setEip(String eip) {
        this.eip = eip;
    }

    public InstanceCompliant withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public InstanceCompliant withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 分组
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public InstanceCompliant withReportScene(String reportScene) {
        this.reportScene = reportScene;
        return this;
    }

    /**
     * 报告场景(CCE,ECS)
     * @return reportScene
     */
    public String getReportScene() {
        return reportScene;
    }

    public void setReportScene(String reportScene) {
        this.reportScene = reportScene;
    }

    public InstanceCompliant withCceInfoId(String cceInfoId) {
        this.cceInfoId = cceInfoId;
        return this;
    }

    /**
     * cce 集群信息id
     * @return cceInfoId
     */
    public String getCceInfoId() {
        return cceInfoId;
    }

    public void setCceInfoId(String cceInfoId) {
        this.cceInfoId = cceInfoId;
    }

    public InstanceCompliant withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 合规性状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceCompliant withBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }

    /**
     * 基线id
     * @return baselineId
     */
    public String getBaselineId() {
        return baselineId;
    }

    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    public InstanceCompliant withBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }

    /**
     * 基线名称
     * @return baselineName
     */
    public String getBaselineName() {
        return baselineName;
    }

    public void setBaselineName(String baselineName) {
        this.baselineName = baselineName;
    }

    public InstanceCompliant withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * 基线规则类型
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public InstanceCompliant withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * 操作系统
     * @return operatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceCompliant that = (InstanceCompliant) obj;
        return Objects.equals(this.compliantSummary, that.compliantSummary)
            && Objects.equals(this.nonCompliantSummary, that.nonCompliantSummary)
            && Objects.equals(this.executionSummary, that.executionSummary) && Objects.equals(this.id, that.id)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.eip, that.eip) && Objects.equals(this.region, that.region)
            && Objects.equals(this.group, that.group) && Objects.equals(this.reportScene, that.reportScene)
            && Objects.equals(this.cceInfoId, that.cceInfoId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.baselineId, that.baselineId) && Objects.equals(this.baselineName, that.baselineName)
            && Objects.equals(this.ruleType, that.ruleType)
            && Objects.equals(this.operatingSystem, that.operatingSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compliantSummary,
            nonCompliantSummary,
            executionSummary,
            id,
            enterpriseProjectId,
            name,
            instanceId,
            nodeId,
            ip,
            eip,
            region,
            group,
            reportScene,
            cceInfoId,
            status,
            baselineId,
            baselineName,
            ruleType,
            operatingSystem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceCompliant {\n");
        sb.append("    compliantSummary: ").append(toIndentedString(compliantSummary)).append("\n");
        sb.append("    nonCompliantSummary: ").append(toIndentedString(nonCompliantSummary)).append("\n");
        sb.append("    executionSummary: ").append(toIndentedString(executionSummary)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    reportScene: ").append(toIndentedString(reportScene)).append("\n");
        sb.append("    cceInfoId: ").append(toIndentedString(cceInfoId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    baselineId: ").append(toIndentedString(baselineId)).append("\n");
        sb.append("    baselineName: ").append(toIndentedString(baselineName)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
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
