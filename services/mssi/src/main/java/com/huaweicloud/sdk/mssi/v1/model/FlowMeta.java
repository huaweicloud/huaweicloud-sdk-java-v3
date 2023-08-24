package com.huaweicloud.sdk.mssi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 编排的Flow元数据
 */
public class FlowMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apic_id")

    private String apicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apic_release_status")

    private String apicReleaseStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apig_url")

    private String apigUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connectors")

    private List<Object> connectors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connectors_latest")

    private List<Object> connectorsLatest = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creatd_time")

    private OffsetDateTime creatdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dev_status")

    private String devStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_configs")

    private Object extendConfigs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_source_type")

    private String flowSourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "functions")

    private Object functions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph")

    private Object graph;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "his_transfer_status")

    private String hisTransferStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon")

    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installed_connector")

    private String installedConnector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_valid")

    private Boolean isValid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice_status")

    private String noticeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemaVersion")

    private String schemaVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<Map<String, Object>> steps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_result")

    private String testResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private OffsetDateTime updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webhook")

    private String webhook;

    public FlowMeta withApicId(String apicId) {
        this.apicId = apicId;
        return this;
    }

    /**
     * 发布到apic的api id
     * @return apicId
     */
    public String getApicId() {
        return apicId;
    }

    public void setApicId(String apicId) {
        this.apicId = apicId;
    }

    public FlowMeta withApicReleaseStatus(String apicReleaseStatus) {
        this.apicReleaseStatus = apicReleaseStatus;
        return this;
    }

    /**
     * 发布到apic的状态
     * @return apicReleaseStatus
     */
    public String getApicReleaseStatus() {
        return apicReleaseStatus;
    }

    public void setApicReleaseStatus(String apicReleaseStatus) {
        this.apicReleaseStatus = apicReleaseStatus;
    }

    public FlowMeta withApigUrl(String apigUrl) {
        this.apigUrl = apigUrl;
        return this;
    }

    /**
     * api流注册到apig的url
     * @return apigUrl
     */
    public String getApigUrl() {
        return apigUrl;
    }

    public void setApigUrl(String apigUrl) {
        this.apigUrl = apigUrl;
    }

    public FlowMeta withConnectors(List<Object> connectors) {
        this.connectors = connectors;
        return this;
    }

    public FlowMeta addConnectorsItem(Object connectorsItem) {
        if (this.connectors == null) {
            this.connectors = new ArrayList<>();
        }
        this.connectors.add(connectorsItem);
        return this;
    }

    public FlowMeta withConnectors(Consumer<List<Object>> connectorsSetter) {
        if (this.connectors == null) {
            this.connectors = new ArrayList<>();
        }
        connectorsSetter.accept(this.connectors);
        return this;
    }

    /**
     * 连接器
     * @return connectors
     */
    public List<Object> getConnectors() {
        return connectors;
    }

    public void setConnectors(List<Object> connectors) {
        this.connectors = connectors;
    }

    public FlowMeta withConnectorsLatest(List<Object> connectorsLatest) {
        this.connectorsLatest = connectorsLatest;
        return this;
    }

    public FlowMeta addConnectorsLatestItem(Object connectorsLatestItem) {
        if (this.connectorsLatest == null) {
            this.connectorsLatest = new ArrayList<>();
        }
        this.connectorsLatest.add(connectorsLatestItem);
        return this;
    }

    public FlowMeta withConnectorsLatest(Consumer<List<Object>> connectorsLatestSetter) {
        if (this.connectorsLatest == null) {
            this.connectorsLatest = new ArrayList<>();
        }
        connectorsLatestSetter.accept(this.connectorsLatest);
        return this;
    }

    /**
     * 连接器最新版本
     * @return connectorsLatest
     */
    public List<Object> getConnectorsLatest() {
        return connectorsLatest;
    }

    public void setConnectorsLatest(List<Object> connectorsLatest) {
        this.connectorsLatest = connectorsLatest;
    }

    public FlowMeta withCreatdTime(OffsetDateTime creatdTime) {
        this.creatdTime = creatdTime;
        return this;
    }

    /**
     * 创建时间
     * @return creatdTime
     */
    public OffsetDateTime getCreatdTime() {
        return creatdTime;
    }

    public void setCreatdTime(OffsetDateTime creatdTime) {
        this.creatdTime = creatdTime;
    }

    public FlowMeta withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 流的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FlowMeta withDevStatus(String devStatus) {
        this.devStatus = devStatus;
        return this;
    }

    /**
     * 开发状态
     * @return devStatus
     */
    public String getDevStatus() {
        return devStatus;
    }

    public void setDevStatus(String devStatus) {
        this.devStatus = devStatus;
    }

    public FlowMeta withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public FlowMeta withEnterpriseProjectId(String enterpriseProjectId) {
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

    public FlowMeta withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 企业项目名称
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public FlowMeta withExtendConfigs(Object extendConfigs) {
        this.extendConfigs = extendConfigs;
        return this;
    }

    /**
     * 流/流模板扩展配置列表
     * @return extendConfigs
     */
    public Object getExtendConfigs() {
        return extendConfigs;
    }

    public void setExtendConfigs(Object extendConfigs) {
        this.extendConfigs = extendConfigs;
    }

    public FlowMeta withFlowSourceType(String flowSourceType) {
        this.flowSourceType = flowSourceType;
        return this;
    }

    /**
     * 流来源： inner: 公共流模板； custom： 我的流模板
     * @return flowSourceType
     */
    public String getFlowSourceType() {
        return flowSourceType;
    }

    public void setFlowSourceType(String flowSourceType) {
        this.flowSourceType = flowSourceType;
    }

    public FlowMeta withFunctions(Object functions) {
        this.functions = functions;
        return this;
    }

    /**
     * 流/流模板函数列表
     * @return functions
     */
    public Object getFunctions() {
        return functions;
    }

    public void setFunctions(Object functions) {
        this.functions = functions;
    }

    public FlowMeta withGraph(Object graph) {
        this.graph = graph;
        return this;
    }

    /**
     * 流的编排数据(大josn)
     * @return graph
     */
    public Object getGraph() {
        return graph;
    }

    public void setGraph(Object graph) {
        this.graph = graph;
    }

    public FlowMeta withHisTransferStatus(String hisTransferStatus) {
        this.hisTransferStatus = hisTransferStatus;
        return this;
    }

    /**
     * Get hisTransferStatus
     * @return hisTransferStatus
     */
    public String getHisTransferStatus() {
        return hisTransferStatus;
    }

    public void setHisTransferStatus(String hisTransferStatus) {
        this.hisTransferStatus = hisTransferStatus;
    }

    public FlowMeta withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * logo base64编码
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public FlowMeta withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlowMeta withInstalledConnector(String installedConnector) {
        this.installedConnector = installedConnector;
        return this;
    }

    /**
     * 已部署的connector id
     * @return installedConnector
     */
    public String getInstalledConnector() {
        return installedConnector;
    }

    public void setInstalledConnector(String installedConnector) {
        this.installedConnector = installedConnector;
    }

    public FlowMeta withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * Get isValid
     * @return isValid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public FlowMeta withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public FlowMeta withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlowMeta withNoticeStatus(String noticeStatus) {
        this.noticeStatus = noticeStatus;
        return this;
    }

    /**
     * Get noticeStatus
     * @return noticeStatus
     */
    public String getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(String noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public FlowMeta withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 用户项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public FlowMeta withSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }

    /**
     * schema版本
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public FlowMeta withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 流的状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FlowMeta withSteps(List<Map<String, Object>> steps) {
        this.steps = steps;
        return this;
    }

    public FlowMeta addStepsItem(Map<String, Object> stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public FlowMeta withSteps(Consumer<List<Map<String, Object>>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 流的编排数据（大josn）
     * @return steps
     */
    public List<Map<String, Object>> getSteps() {
        return steps;
    }

    public void setSteps(List<Map<String, Object>> steps) {
        this.steps = steps;
    }

    public FlowMeta withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public FlowMeta addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public FlowMeta withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public FlowMeta withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public FlowMeta withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 模板名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public FlowMeta withTestResult(String testResult) {
        this.testResult = testResult;
        return this;
    }

    /**
     * 测试结果
     * @return testResult
     */
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public FlowMeta withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlowMeta withUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 修改时间
     * @return updatedTime
     */
    public OffsetDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public FlowMeta withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 账号（所有者）
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public FlowMeta withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 流的版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public FlowMeta withWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }

    /**
     * webhook触发url的ID
     * @return webhook
     */
    public String getWebhook() {
        return webhook;
    }

    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlowMeta that = (FlowMeta) obj;
        return Objects.equals(this.apicId, that.apicId)
            && Objects.equals(this.apicReleaseStatus, that.apicReleaseStatus)
            && Objects.equals(this.apigUrl, that.apigUrl) && Objects.equals(this.connectors, that.connectors)
            && Objects.equals(this.connectorsLatest, that.connectorsLatest)
            && Objects.equals(this.creatdTime, that.creatdTime) && Objects.equals(this.description, that.description)
            && Objects.equals(this.devStatus, that.devStatus) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.extendConfigs, that.extendConfigs)
            && Objects.equals(this.flowSourceType, that.flowSourceType)
            && Objects.equals(this.functions, that.functions) && Objects.equals(this.graph, that.graph)
            && Objects.equals(this.hisTransferStatus, that.hisTransferStatus) && Objects.equals(this.icon, that.icon)
            && Objects.equals(this.id, that.id) && Objects.equals(this.installedConnector, that.installedConnector)
            && Objects.equals(this.isValid, that.isValid) && Objects.equals(this.label, that.label)
            && Objects.equals(this.name, that.name) && Objects.equals(this.noticeStatus, that.noticeStatus)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.schemaVersion, that.schemaVersion)
            && Objects.equals(this.status, that.status) && Objects.equals(this.steps, that.steps)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.templateName, that.templateName) && Objects.equals(this.testResult, that.testResult)
            && Objects.equals(this.type, that.type) && Objects.equals(this.updatedTime, that.updatedTime)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.version, that.version)
            && Objects.equals(this.webhook, that.webhook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apicId,
            apicReleaseStatus,
            apigUrl,
            connectors,
            connectorsLatest,
            creatdTime,
            description,
            devStatus,
            domainId,
            enterpriseProjectId,
            enterpriseProjectName,
            extendConfigs,
            flowSourceType,
            functions,
            graph,
            hisTransferStatus,
            icon,
            id,
            installedConnector,
            isValid,
            label,
            name,
            noticeStatus,
            projectId,
            schemaVersion,
            status,
            steps,
            tags,
            templateId,
            templateName,
            testResult,
            type,
            updatedTime,
            userId,
            version,
            webhook);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowMeta {\n");
        sb.append("    apicId: ").append(toIndentedString(apicId)).append("\n");
        sb.append("    apicReleaseStatus: ").append(toIndentedString(apicReleaseStatus)).append("\n");
        sb.append("    apigUrl: ").append(toIndentedString(apigUrl)).append("\n");
        sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
        sb.append("    connectorsLatest: ").append(toIndentedString(connectorsLatest)).append("\n");
        sb.append("    creatdTime: ").append(toIndentedString(creatdTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    devStatus: ").append(toIndentedString(devStatus)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    extendConfigs: ").append(toIndentedString(extendConfigs)).append("\n");
        sb.append("    flowSourceType: ").append(toIndentedString(flowSourceType)).append("\n");
        sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
        sb.append("    graph: ").append(toIndentedString(graph)).append("\n");
        sb.append("    hisTransferStatus: ").append(toIndentedString(hisTransferStatus)).append("\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    installedConnector: ").append(toIndentedString(installedConnector)).append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    noticeStatus: ").append(toIndentedString(noticeStatus)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    testResult: ").append(toIndentedString(testResult)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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
