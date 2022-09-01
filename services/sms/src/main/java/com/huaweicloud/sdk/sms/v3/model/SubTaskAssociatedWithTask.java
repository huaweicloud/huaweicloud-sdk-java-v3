package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 任务关联的子任务信息
 */
public class SubTaskAssociatedWithTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    @JacksonXmlProperty(localName = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    @JacksonXmlProperty(localName = "start_date")

    private Long startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    @JacksonXmlProperty(localName = "end_date")

    private Long endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_trace")

    @JacksonXmlProperty(localName = "process_trace")

    private String processTrace;

    public SubTaskAssociatedWithTask withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 子任务id
     * minimum: 0
     * maximum: 100
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubTaskAssociatedWithTask withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 子任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubTaskAssociatedWithTask withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 子任务的进度，取值为0-100之间的整数
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

    public SubTaskAssociatedWithTask withStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 子任务开始时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startDate
     */
    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public SubTaskAssociatedWithTask withEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 子任务结束时间（如果子任务还没有结束，则为空）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endDate
     */
    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public SubTaskAssociatedWithTask withProcessTrace(String processTrace) {
        this.processTrace = processTrace;
        return this;
    }

    /**
     * 迁移或同步时，具体的迁移详情
     * @return processTrace
     */
    public String getProcessTrace() {
        return processTrace;
    }

    public void setProcessTrace(String processTrace) {
        this.processTrace = processTrace;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubTaskAssociatedWithTask subTaskAssociatedWithTask = (SubTaskAssociatedWithTask) o;
        return Objects.equals(this.id, subTaskAssociatedWithTask.id)
            && Objects.equals(this.name, subTaskAssociatedWithTask.name)
            && Objects.equals(this.progress, subTaskAssociatedWithTask.progress)
            && Objects.equals(this.startDate, subTaskAssociatedWithTask.startDate)
            && Objects.equals(this.endDate, subTaskAssociatedWithTask.endDate)
            && Objects.equals(this.processTrace, subTaskAssociatedWithTask.processTrace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, progress, startDate, endDate, processTrace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubTaskAssociatedWithTask {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    processTrace: ").append(toIndentedString(processTrace)).append("\n");
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
