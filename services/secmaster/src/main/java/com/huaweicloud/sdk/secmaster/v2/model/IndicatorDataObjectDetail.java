package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 情报详情
 */
public class IndicatorDataObjectDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indicator_type")

    private IndicatorDataObjectDetailIndicatorType indicatorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private IndicatorDataObjectDetailEnvironment environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source")

    private IndicatorDataObjectDetailDataSource dataSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_report_time")

    private String firstReportTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_deleted")

    private Boolean isDeleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_report_time")

    private String lastReportTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "granular_marking")

    private Integer granularMarking;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revoked")

    private Boolean revoked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verdict")

    private String verdict;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Integer confidence;

    public IndicatorDataObjectDetail withIndicatorType(IndicatorDataObjectDetailIndicatorType indicatorType) {
        this.indicatorType = indicatorType;
        return this;
    }

    public IndicatorDataObjectDetail withIndicatorType(
        Consumer<IndicatorDataObjectDetailIndicatorType> indicatorTypeSetter) {
        if (this.indicatorType == null) {
            this.indicatorType = new IndicatorDataObjectDetailIndicatorType();
            indicatorTypeSetter.accept(this.indicatorType);
        }

        return this;
    }

    /**
     * Get indicatorType
     * @return indicatorType
     */
    public IndicatorDataObjectDetailIndicatorType getIndicatorType() {
        return indicatorType;
    }

    public void setIndicatorType(IndicatorDataObjectDetailIndicatorType indicatorType) {
        this.indicatorType = indicatorType;
    }

    public IndicatorDataObjectDetail withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值，如：ip url domain等
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public IndicatorDataObjectDetail withUpdateTime(String updateTime) {
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

    public IndicatorDataObjectDetail withCreateTime(String createTime) {
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

    public IndicatorDataObjectDetail withEnvironment(IndicatorDataObjectDetailEnvironment environment) {
        this.environment = environment;
        return this;
    }

    public IndicatorDataObjectDetail withEnvironment(Consumer<IndicatorDataObjectDetailEnvironment> environmentSetter) {
        if (this.environment == null) {
            this.environment = new IndicatorDataObjectDetailEnvironment();
            environmentSetter.accept(this.environment);
        }

        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    public IndicatorDataObjectDetailEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(IndicatorDataObjectDetailEnvironment environment) {
        this.environment = environment;
    }

    public IndicatorDataObjectDetail withDataSource(IndicatorDataObjectDetailDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public IndicatorDataObjectDetail withDataSource(Consumer<IndicatorDataObjectDetailDataSource> dataSourceSetter) {
        if (this.dataSource == null) {
            this.dataSource = new IndicatorDataObjectDetailDataSource();
            dataSourceSetter.accept(this.dataSource);
        }

        return this;
    }

    /**
     * Get dataSource
     * @return dataSource
     */
    public IndicatorDataObjectDetailDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(IndicatorDataObjectDetailDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public IndicatorDataObjectDetail withFirstReportTime(String firstReportTime) {
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

    public IndicatorDataObjectDetail withIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * 是否删除
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public IndicatorDataObjectDetail withLastReportTime(String lastReportTime) {
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

    public IndicatorDataObjectDetail withGranularMarking(Integer granularMarking) {
        this.granularMarking = granularMarking;
        return this;
    }

    /**
     * 粒度（保密等级），由高到低：1（首次发现）、2（自产数据）、3（需购买）、4（外网直接查询）
     * minimum: 1
     * maximum: 4
     * @return granularMarking
     */
    public Integer getGranularMarking() {
        return granularMarking;
    }

    public void setGranularMarking(Integer granularMarking) {
        this.granularMarking = granularMarking;
    }

    public IndicatorDataObjectDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IndicatorDataObjectDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 情报ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IndicatorDataObjectDetail withProjectId(String projectId) {
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

    public IndicatorDataObjectDetail withRevoked(Boolean revoked) {
        this.revoked = revoked;
        return this;
    }

    /**
     * 是否作废
     * @return revoked
     */
    public Boolean getRevoked() {
        return revoked;
    }

    public void setRevoked(Boolean revoked) {
        this.revoked = revoked;
    }

    public IndicatorDataObjectDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态， Open--打开，Closed--关闭, Revoked--作废
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public IndicatorDataObjectDetail withVerdict(String verdict) {
        this.verdict = verdict;
        return this;
    }

    /**
     * 威胁度， Black--黑,White--白，Gray--灰
     * @return verdict
     */
    public String getVerdict() {
        return verdict;
    }

    public void setVerdict(String verdict) {
        this.verdict = verdict;
    }

    public IndicatorDataObjectDetail withWorkspaceId(String workspaceId) {
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

    public IndicatorDataObjectDetail withConfidence(Integer confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 置信度，取值范围是80-100
     * minimum: 80
     * maximum: 100
     * @return confidence
     */
    public Integer getConfidence() {
        return confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndicatorDataObjectDetail that = (IndicatorDataObjectDetail) obj;
        return Objects.equals(this.indicatorType, that.indicatorType) && Objects.equals(this.value, that.value)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.environment, that.environment) && Objects.equals(this.dataSource, that.dataSource)
            && Objects.equals(this.firstReportTime, that.firstReportTime)
            && Objects.equals(this.isDeleted, that.isDeleted)
            && Objects.equals(this.lastReportTime, that.lastReportTime)
            && Objects.equals(this.granularMarking, that.granularMarking) && Objects.equals(this.name, that.name)
            && Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.revoked, that.revoked) && Objects.equals(this.status, that.status)
            && Objects.equals(this.verdict, that.verdict) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.confidence, that.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indicatorType,
            value,
            updateTime,
            createTime,
            environment,
            dataSource,
            firstReportTime,
            isDeleted,
            lastReportTime,
            granularMarking,
            name,
            id,
            projectId,
            revoked,
            status,
            verdict,
            workspaceId,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndicatorDataObjectDetail {\n");
        sb.append("    indicatorType: ").append(toIndentedString(indicatorType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
        sb.append("    firstReportTime: ").append(toIndentedString(firstReportTime)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
        sb.append("    lastReportTime: ").append(toIndentedString(lastReportTime)).append("\n");
        sb.append("    granularMarking: ").append(toIndentedString(granularMarking)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
