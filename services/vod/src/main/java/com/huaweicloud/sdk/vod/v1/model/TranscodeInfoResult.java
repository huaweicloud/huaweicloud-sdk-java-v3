package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TranscodeInfoResult
 */
public class TranscodeInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_time")

    private Integer waitingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_time")

    private Integer processTime;

    public TranscodeInfoResult withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 转码模板名 
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public TranscodeInfoResult withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 转码进度 
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

    public TranscodeInfoResult withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 转码开始处理时间，格式按照RFC3339，UTC时间，如2020-09-01T18:50:20Z 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public TranscodeInfoResult withWaitingTime(Integer waitingTime) {
        this.waitingTime = waitingTime;
        return this;
    }

    /**
     * 等待时长，单位为秒，当值为非-1时有效 
     * minimum: -1
     * maximum: 2147483647
     * @return waitingTime
     */
    public Integer getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Integer waitingTime) {
        this.waitingTime = waitingTime;
    }

    public TranscodeInfoResult withProcessTime(Integer processTime) {
        this.processTime = processTime;
        return this;
    }

    /**
     * 处理时长，单位为秒，当值为非-1时有效 
     * minimum: -1
     * maximum: 2147483647
     * @return processTime
     */
    public Integer getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Integer processTime) {
        this.processTime = processTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TranscodeInfoResult that = (TranscodeInfoResult) obj;
        return Objects.equals(this.templateName, that.templateName) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.waitingTime, that.waitingTime)
            && Objects.equals(this.processTime, that.processTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName, progress, startTime, waitingTime, processTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranscodeInfoResult {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    waitingTime: ").append(toIndentedString(waitingTime)).append("\n");
        sb.append("    processTime: ").append(toIndentedString(processTime)).append("\n");
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
