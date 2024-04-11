package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 对比列表信息体
 */
public class CompareJobInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private Map<String, String> options = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_status")

    private String exportStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_remain_seconds")

    private Long reportRemainSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_job_tag")

    private Map<String, String> compareJobTag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proportion_value")

    private String proportionValue;

    public CompareJobInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 对比任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CompareJobInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 对比类型。 - lines：行数对比 - contents：内容对比 - random：抽样对比，当前仅支持gaussdbv5、gaussdbv5-to-postgresql、gaussdbv5ha-to-postgresql链路。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CompareJobInfo withOptions(Map<String, String> options) {
        this.options = options;
        return this;
    }

    public CompareJobInfo putOptionsItem(String key, String optionsItem) {
        if (this.options == null) {
            this.options = new HashMap<>();
        }
        this.options.put(key, optionsItem);
        return this;
    }

    public CompareJobInfo withOptions(Consumer<Map<String, String>> optionsSetter) {
        if (this.options == null) {
            this.options = new HashMap<>();
        }
        optionsSetter.accept(this.options);
        return this;
    }

    /**
     * 对比配置项，key-value形式。 内容对比支持以下配置项： - 对比方式配置，key：contentCompareType，value：dynamic表示动态对比，static表示静态对比。 - lob字段对比类型配置，key：lobCompare，value：ignore表示忽略，length表示长度对比。  行数对比支持以下配置项： - 对比策略配置，多表归一情况下适用，key：comparePolicy，value：normal表示正常对比，manyToOne表示多对一对比。
     * @return options
     */
    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    public CompareJobInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间，UTC时间，例如：2020-09-01T18:50:20Z。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CompareJobInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，UTC时间，例如：2020-09-01T18:50:20Z。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CompareJobInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 对比任务的状态。 - RUNNING-运行中 - WAITING_FOR_RUNNING-等待启动中 - SUCCESSFUL-完成 - FAILED-失败 - CANCELLED-已取消 - TIMEOUT_INTERRUPT-超时中断 - FULL_DOING-全量校验中 - INCRE_DOING-增量校验中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CompareJobInfo withExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }

    /**
     * 导出对比结果状态。 - INIT：初始状态 - EXPORTING：对比结果导出中 - EXPORT_COMPLETE：对比结果导出完成 - EXPORT_COMMON_FAILED：对比结果导出失败
     * @return exportStatus
     */
    public String getExportStatus() {
        return exportStatus;
    }

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    public CompareJobInfo withReportRemainSeconds(Long reportRemainSeconds) {
        this.reportRemainSeconds = reportRemainSeconds;
        return this;
    }

    /**
     * 导出比对结果有效期剩余时间。
     * @return reportRemainSeconds
     */
    public Long getReportRemainSeconds() {
        return reportRemainSeconds;
    }

    public void setReportRemainSeconds(Long reportRemainSeconds) {
        this.reportRemainSeconds = reportRemainSeconds;
    }

    public CompareJobInfo withCompareJobTag(Map<String, String> compareJobTag) {
        this.compareJobTag = compareJobTag;
        return this;
    }

    public CompareJobInfo putCompareJobTagItem(String key, String compareJobTagItem) {
        if (this.compareJobTag == null) {
            this.compareJobTag = new HashMap<>();
        }
        this.compareJobTag.put(key, compareJobTagItem);
        return this;
    }

    public CompareJobInfo withCompareJobTag(Consumer<Map<String, String>> compareJobTagSetter) {
        if (this.compareJobTag == null) {
            this.compareJobTag = new HashMap<>();
        }
        compareJobTagSetter.accept(this.compareJobTag);
        return this;
    }

    /**
     * 对比任务的标签，当前仅涉及对比策略时返回。
     * @return compareJobTag
     */
    public Map<String, String> getCompareJobTag() {
        return compareJobTag;
    }

    public void setCompareJobTag(Map<String, String> compareJobTag) {
        this.compareJobTag = compareJobTag;
    }

    public CompareJobInfo withProportionValue(String proportionValue) {
        this.proportionValue = proportionValue;
        return this;
    }

    /**
     * 抽样比例，对比类型为抽样对比时填写。
     * @return proportionValue
     */
    public String getProportionValue() {
        return proportionValue;
    }

    public void setProportionValue(String proportionValue) {
        this.proportionValue = proportionValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareJobInfo that = (CompareJobInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.options, that.options) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.exportStatus, that.exportStatus)
            && Objects.equals(this.reportRemainSeconds, that.reportRemainSeconds)
            && Objects.equals(this.compareJobTag, that.compareJobTag)
            && Objects.equals(this.proportionValue, that.proportionValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            type,
            options,
            startTime,
            endTime,
            status,
            exportStatus,
            reportRemainSeconds,
            compareJobTag,
            proportionValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareJobInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    exportStatus: ").append(toIndentedString(exportStatus)).append("\n");
        sb.append("    reportRemainSeconds: ").append(toIndentedString(reportRemainSeconds)).append("\n");
        sb.append("    compareJobTag: ").append(toIndentedString(compareJobTag)).append("\n");
        sb.append("    proportionValue: ").append(toIndentedString(proportionValue)).append("\n");
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
