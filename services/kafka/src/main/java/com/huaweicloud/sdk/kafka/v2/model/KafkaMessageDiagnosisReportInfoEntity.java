package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 消息积压诊断报告信息实体类
 */
public class KafkaMessageDiagnosisReportInfoEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    /**
     * 消息积压诊断任务状态。 - diagnosing：诊断中 - failed：诊断失败 - deleted：手动删除 - finished：诊断完成 - normal：诊断结果正常 - abnormal：诊断结果异常
     */
    public static final class StatusEnum {

        /**
         * Enum DIAGNOSING for value: "diagnosing"
         */
        public static final StatusEnum DIAGNOSING = new StatusEnum("diagnosing");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        /**
         * Enum DELETED for value: "deleted"
         */
        public static final StatusEnum DELETED = new StatusEnum("deleted");

        /**
         * Enum FINISHED for value: "finished"
         */
        public static final StatusEnum FINISHED = new StatusEnum("finished");

        /**
         * Enum NORMAL for value: "normal"
         */
        public static final StatusEnum NORMAL = new StatusEnum("normal");

        /**
         * Enum ABNORMAL for value: "abnormal"
         */
        public static final StatusEnum ABNORMAL = new StatusEnum("abnormal");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("diagnosing", DIAGNOSING);
            map.put("failed", FAILED);
            map.put("deleted", DELETED);
            map.put("finished", FINISHED);
            map.put("normal", NORMAL);
            map.put("abnormal", ABNORMAL);
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
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name")

    private String topicName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accumulated_partitions")

    private Integer accumulatedPartitions;

    public KafkaMessageDiagnosisReportInfoEntity withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * 诊断报告ID
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public KafkaMessageDiagnosisReportInfoEntity withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 消息积压诊断任务状态。 - diagnosing：诊断中 - failed：诊断失败 - deleted：手动删除 - finished：诊断完成 - normal：诊断结果正常 - abnormal：诊断结果异常
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public KafkaMessageDiagnosisReportInfoEntity withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 诊断任务开始时间
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public KafkaMessageDiagnosisReportInfoEntity withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 诊断任务结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public KafkaMessageDiagnosisReportInfoEntity withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 该次诊断任务诊断的消费组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public KafkaMessageDiagnosisReportInfoEntity withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * 该次诊断任务诊断的Topic名称
     * @return topicName
     */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public KafkaMessageDiagnosisReportInfoEntity withAccumulatedPartitions(Integer accumulatedPartitions) {
        this.accumulatedPartitions = accumulatedPartitions;
        return this;
    }

    /**
     * 该次诊断任务发现的存在消息堆积的分区数
     * @return accumulatedPartitions
     */
    public Integer getAccumulatedPartitions() {
        return accumulatedPartitions;
    }

    public void setAccumulatedPartitions(Integer accumulatedPartitions) {
        this.accumulatedPartitions = accumulatedPartitions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KafkaMessageDiagnosisReportInfoEntity that = (KafkaMessageDiagnosisReportInfoEntity) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.topicName, that.topicName)
            && Objects.equals(this.accumulatedPartitions, that.accumulatedPartitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId, status, beginTime, endTime, groupName, topicName, accumulatedPartitions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaMessageDiagnosisReportInfoEntity {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    accumulatedPartitions: ").append(toIndentedString(accumulatedPartitions)).append("\n");
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
