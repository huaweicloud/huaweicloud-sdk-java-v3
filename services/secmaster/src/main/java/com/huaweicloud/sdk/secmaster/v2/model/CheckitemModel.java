package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckitemModel
 */
public class CheckitemModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregation_handle_status")

    private String aggregationHandleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_procedure")

    private String auditProcedure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "impact")

    private String impact;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_server")

    private String cloudServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private Integer method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private Integer source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_checkitem_list")

    private List<SpecCheckitemModel> specCheckitemList = null;

    public CheckitemModel withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 检查项的id
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public CheckitemModel withAggregationHandleStatus(String aggregationHandleStatus) {
        this.aggregationHandleStatus = aggregationHandleStatus;
        return this;
    }

    /**
     * 检查项结果聚合状态
     * @return aggregationHandleStatus
     */
    public String getAggregationHandleStatus() {
        return aggregationHandleStatus;
    }

    public void setAggregationHandleStatus(String aggregationHandleStatus) {
        this.aggregationHandleStatus = aggregationHandleStatus;
    }

    public CheckitemModel withAuditProcedure(String auditProcedure) {
        this.auditProcedure = auditProcedure;
        return this;
    }

    /**
     * 检查项的检查过程
     * @return auditProcedure
     */
    public String getAuditProcedure() {
        return auditProcedure;
    }

    public void setAuditProcedure(String auditProcedure) {
        this.auditProcedure = auditProcedure;
    }

    public CheckitemModel withImpact(String impact) {
        this.impact = impact;
        return this;
    }

    /**
     * 检查项的影响
     * @return impact
     */
    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public CheckitemModel withCloudServer(String cloudServer) {
        this.cloudServer = cloudServer;
        return this;
    }

    /**
     * 检查项所属云服务
     * @return cloudServer
     */
    public String getCloudServer() {
        return cloudServer;
    }

    public void setCloudServer(String cloudServer) {
        this.cloudServer = cloudServer;
    }

    public CheckitemModel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 对检查项的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CheckitemModel withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 表示该检查项的严重程度 informational：提示 low: 低危 medium：中危 high: 高危 fatal：致命
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public CheckitemModel withMethod(Integer method) {
        this.method = method;
        return this;
    }

    /**
     * 表示该检查项的检查方式 0：手动 1：自动 3: 自动-剧本流程 4: 自动-企业主机安全 5：自动-配置审计服务
     * minimum: 0
     * maximum: 99
     * @return method
     */
    public Integer getMethod() {
        return method;
    }

    public void setMethod(Integer method) {
        this.method = method;
    }

    public CheckitemModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 检查项的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckitemModel withSource(Integer source) {
        this.source = source;
        return this;
    }

    /**
     * 表示该检查项的来源 0：自动 2: 自动-剧本流程 3: 手动 4: 自动-企业主机安全 5：自动-配置审计服务
     * minimum: 0
     * maximum: 99
     * @return source
     */
    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public CheckitemModel withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * **参数解释**: 流程ID **约束限制**: 不涉及
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public CheckitemModel withSpecCheckitemList(List<SpecCheckitemModel> specCheckitemList) {
        this.specCheckitemList = specCheckitemList;
        return this;
    }

    public CheckitemModel addSpecCheckitemListItem(SpecCheckitemModel specCheckitemListItem) {
        if (this.specCheckitemList == null) {
            this.specCheckitemList = new ArrayList<>();
        }
        this.specCheckitemList.add(specCheckitemListItem);
        return this;
    }

    public CheckitemModel withSpecCheckitemList(Consumer<List<SpecCheckitemModel>> specCheckitemListSetter) {
        if (this.specCheckitemList == null) {
            this.specCheckitemList = new ArrayList<>();
        }
        specCheckitemListSetter.accept(this.specCheckitemList);
        return this;
    }

    /**
     * 检查项所属遵从包的信息
     * @return specCheckitemList
     */
    public List<SpecCheckitemModel> getSpecCheckitemList() {
        return specCheckitemList;
    }

    public void setSpecCheckitemList(List<SpecCheckitemModel> specCheckitemList) {
        this.specCheckitemList = specCheckitemList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckitemModel that = (CheckitemModel) obj;
        return Objects.equals(this.uuid, that.uuid)
            && Objects.equals(this.aggregationHandleStatus, that.aggregationHandleStatus)
            && Objects.equals(this.auditProcedure, that.auditProcedure) && Objects.equals(this.impact, that.impact)
            && Objects.equals(this.cloudServer, that.cloudServer) && Objects.equals(this.description, that.description)
            && Objects.equals(this.level, that.level) && Objects.equals(this.method, that.method)
            && Objects.equals(this.name, that.name) && Objects.equals(this.source, that.source)
            && Objects.equals(this.workflowId, that.workflowId)
            && Objects.equals(this.specCheckitemList, that.specCheckitemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid,
            aggregationHandleStatus,
            auditProcedure,
            impact,
            cloudServer,
            description,
            level,
            method,
            name,
            source,
            workflowId,
            specCheckitemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckitemModel {\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    aggregationHandleStatus: ").append(toIndentedString(aggregationHandleStatus)).append("\n");
        sb.append("    auditProcedure: ").append(toIndentedString(auditProcedure)).append("\n");
        sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
        sb.append("    cloudServer: ").append(toIndentedString(cloudServer)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    specCheckitemList: ").append(toIndentedString(specCheckitemList)).append("\n");
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
