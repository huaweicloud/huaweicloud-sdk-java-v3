package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 情报详情信息
 */
public class CreateIndicatorDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source")

    private CreateIndicatorDetailDataSource dataSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verdict")

    private String verdict;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Integer confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "granular_marking")

    private String granularMarking;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private CreateIndicatorDetailEnvironment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defanged")

    private Boolean defanged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_report_time")

    private String firstReportTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_report_time")

    private String lastReportTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indicator_type")

    private CreateIndicatorDetailIndicatorType indicatorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public CreateIndicatorDetail withDataSource(CreateIndicatorDetailDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public CreateIndicatorDetail withDataSource(Consumer<CreateIndicatorDetailDataSource> dataSourceSetter) {
        if (this.dataSource == null) {
            this.dataSource = new CreateIndicatorDetailDataSource();
            dataSourceSetter.accept(this.dataSource);
        }

        return this;
    }

    /**
     * Get dataSource
     * @return dataSource
     */
    public CreateIndicatorDetailDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(CreateIndicatorDetailDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public CreateIndicatorDetail withVerdict(String verdict) {
        this.verdict = verdict;
        return this;
    }

    /**
     * 威胁度
     * @return verdict
     */
    public String getVerdict() {
        return verdict;
    }

    public void setVerdict(String verdict) {
        this.verdict = verdict;
    }

    public CreateIndicatorDetail withConfidence(Integer confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 置信度
     * minimum: 0
     * maximum: 99
     * @return confidence
     */
    public Integer getConfidence() {
        return confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    public CreateIndicatorDetail withStatus(String status) {
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

    public CreateIndicatorDetail withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 标签
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public CreateIndicatorDetail withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CreateIndicatorDetail withGranularMarking(String granularMarking) {
        this.granularMarking = granularMarking;
        return this;
    }

    /**
     * 粒度（保密等级），由高到低：1（首次发现）、2（自产数据）、3（需购买）、4（外网直接查询）
     * @return granularMarking
     */
    public String getGranularMarking() {
        return granularMarking;
    }

    public void setGranularMarking(String granularMarking) {
        this.granularMarking = granularMarking;
    }

    public CreateIndicatorDetail withEnvironment(CreateIndicatorDetailEnvironment environment) {
        this.environment = environment;
        return this;
    }

    public CreateIndicatorDetail withEnvironment(Consumer<CreateIndicatorDetailEnvironment> environmentSetter) {
        if (this.environment == null) {
            this.environment = new CreateIndicatorDetailEnvironment();
            environmentSetter.accept(this.environment);
        }

        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    public CreateIndicatorDetailEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(CreateIndicatorDetailEnvironment environment) {
        this.environment = environment;
    }

    public CreateIndicatorDetail withDefanged(Boolean defanged) {
        this.defanged = defanged;
        return this;
    }

    /**
     * 是否失效
     * @return defanged
     */
    public Boolean getDefanged() {
        return defanged;
    }

    public void setDefanged(Boolean defanged) {
        this.defanged = defanged;
    }

    public CreateIndicatorDetail withFirstReportTime(String firstReportTime) {
        this.firstReportTime = firstReportTime;
        return this;
    }

    /**
     * 首次发生时间
     * @return firstReportTime
     */
    public String getFirstReportTime() {
        return firstReportTime;
    }

    public void setFirstReportTime(String firstReportTime) {
        this.firstReportTime = firstReportTime;
    }

    public CreateIndicatorDetail withLastReportTime(String lastReportTime) {
        this.lastReportTime = lastReportTime;
        return this;
    }

    /**
     * 最近发生时间
     * @return lastReportTime
     */
    public String getLastReportTime() {
        return lastReportTime;
    }

    public void setLastReportTime(String lastReportTime) {
        this.lastReportTime = lastReportTime;
    }

    public CreateIndicatorDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 威胁情报ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateIndicatorDetail withIndicatorType(CreateIndicatorDetailIndicatorType indicatorType) {
        this.indicatorType = indicatorType;
        return this;
    }

    public CreateIndicatorDetail withIndicatorType(Consumer<CreateIndicatorDetailIndicatorType> indicatorTypeSetter) {
        if (this.indicatorType == null) {
            this.indicatorType = new CreateIndicatorDetailIndicatorType();
            indicatorTypeSetter.accept(this.indicatorType);
        }

        return this;
    }

    /**
     * Get indicatorType
     * @return indicatorType
     */
    public CreateIndicatorDetailIndicatorType getIndicatorType() {
        return indicatorType;
    }

    public void setIndicatorType(CreateIndicatorDetailIndicatorType indicatorType) {
        this.indicatorType = indicatorType;
    }

    public CreateIndicatorDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 威胁情报名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateIndicatorDetail withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public CreateIndicatorDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateIndicatorDetail withCreateTime(String createTime) {
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

    public CreateIndicatorDetail withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateIndicatorDetail that = (CreateIndicatorDetail) obj;
        return Objects.equals(this.dataSource, that.dataSource) && Objects.equals(this.verdict, that.verdict)
            && Objects.equals(this.confidence, that.confidence) && Objects.equals(this.status, that.status)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.value, that.value)
            && Objects.equals(this.granularMarking, that.granularMarking)
            && Objects.equals(this.environment, that.environment) && Objects.equals(this.defanged, that.defanged)
            && Objects.equals(this.firstReportTime, that.firstReportTime)
            && Objects.equals(this.lastReportTime, that.lastReportTime) && Objects.equals(this.id, that.id)
            && Objects.equals(this.indicatorType, that.indicatorType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSource,
            verdict,
            confidence,
            status,
            labels,
            value,
            granularMarking,
            environment,
            defanged,
            firstReportTime,
            lastReportTime,
            id,
            indicatorType,
            name,
            workspaceId,
            projectId,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIndicatorDetail {\n");
        sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
        sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    granularMarking: ").append(toIndentedString(granularMarking)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    defanged: ").append(toIndentedString(defanged)).append("\n");
        sb.append("    firstReportTime: ").append(toIndentedString(firstReportTime)).append("\n");
        sb.append("    lastReportTime: ").append(toIndentedString(lastReportTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    indicatorType: ").append(toIndentedString(indicatorType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
