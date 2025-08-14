package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 评估任务数据
 */
public class QueryAssessTaskResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_name")

    private String applicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    /**
     * 评估任务状态.  no_assessment 未评估 assess_finish 评估完成 assess_failed 评估失败 assessing     评估中
     */
    public static final class StatusEnum {

        /**
         * Enum NO_ASSESSMENT for value: "no_assessment"
         */
        public static final StatusEnum NO_ASSESSMENT = new StatusEnum("no_assessment");

        /**
         * Enum ASSESS_FINISH for value: "assess_finish"
         */
        public static final StatusEnum ASSESS_FINISH = new StatusEnum("assess_finish");

        /**
         * Enum ASSESS_FAILED for value: "assess_failed"
         */
        public static final StatusEnum ASSESS_FAILED = new StatusEnum("assess_failed");

        /**
         * Enum ASSESSING for value: "assessing"
         */
        public static final StatusEnum ASSESSING = new StatusEnum("assessing");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("no_assessment", NO_ASSESSMENT);
            map.put("assess_finish", ASSESS_FINISH);
            map.put("assess_failed", ASSESS_FAILED);
            map.put("assessing", ASSESSING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assess_report_id")

    private String assessReportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_assess_time")

    private Long lastAssessTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator_name")

    private String operatorName;

    public QueryAssessTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryAssessTaskResponse withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * 应用名称
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public QueryAssessTaskResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 应用ID
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public QueryAssessTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 评估任务状态.  no_assessment 未评估 assess_finish 评估完成 assess_failed 评估失败 assessing     评估中
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public QueryAssessTaskResponse withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 失败原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public QueryAssessTaskResponse withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 评估进度
     * minimum: 0
     * maximum: 100
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public QueryAssessTaskResponse withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * Get score
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public QueryAssessTaskResponse withAssessReportId(String assessReportId) {
        this.assessReportId = assessReportId;
        return this;
    }

    /**
     * 评估报告编号ID
     * @return assessReportId
     */
    public String getAssessReportId() {
        return assessReportId;
    }

    public void setAssessReportId(String assessReportId) {
        this.assessReportId = assessReportId;
    }

    public QueryAssessTaskResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public QueryAssessTaskResponse withLastAssessTime(Long lastAssessTime) {
        this.lastAssessTime = lastAssessTime;
        return this;
    }

    /**
     * 最新评估时间
     * @return lastAssessTime
     */
    public Long getLastAssessTime() {
        return lastAssessTime;
    }

    public void setLastAssessTime(Long lastAssessTime) {
        this.lastAssessTime = lastAssessTime;
    }

    public QueryAssessTaskResponse withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最新更新时间
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public QueryAssessTaskResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人ID
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public QueryAssessTaskResponse withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public QueryAssessTaskResponse withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作人ID
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public QueryAssessTaskResponse withOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }

    /**
     * 操作人名称
     * @return operatorName
     */
    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryAssessTaskResponse that = (QueryAssessTaskResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.applicationName, that.applicationName)
            && Objects.equals(this.applicationId, that.applicationId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.score, that.score) && Objects.equals(this.assessReportId, that.assessReportId)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastAssessTime, that.lastAssessTime)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.operatorName, that.operatorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            applicationName,
            applicationId,
            status,
            reason,
            progress,
            score,
            assessReportId,
            createTime,
            lastAssessTime,
            lastUpdateTime,
            creator,
            creatorName,
            operator,
            operatorName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryAssessTaskResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    assessReportId: ").append(toIndentedString(assessReportId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastAssessTime: ").append(toIndentedString(lastAssessTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    operatorName: ").append(toIndentedString(operatorName)).append("\n");
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
