package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NextflowTaskListDto
 */
public class NextflowTaskListDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private String process;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash")

    private String hash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container")

    private String container;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_name")

    private String podName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submit")

    private String submit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete")

    private String complete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "realtime")

    private Long realtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_percent")

    private Double cpuPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_percent")

    private Double memPercent;

    public NextflowTaskListDto withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 子任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public NextflowTaskListDto withProcess(String process) {
        this.process = process;
        return this;
    }

    /**
     * 流程名称
     * @return process
     */
    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public NextflowTaskListDto withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 子任务标识符
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public NextflowTaskListDto withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * 哈希值
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public NextflowTaskListDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 子任务状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NextflowTaskListDto withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * 容器名称
     * @return container
     */
    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public NextflowTaskListDto withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * pod名称
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public NextflowTaskListDto withSubmit(String submit) {
        this.submit = submit;
        return this;
    }

    /**
     * 提交时间
     * @return submit
     */
    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public NextflowTaskListDto withComplete(String complete) {
        this.complete = complete;
        return this;
    }

    /**
     * 完成时间
     * @return complete
     */
    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    public NextflowTaskListDto withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 总时间
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public NextflowTaskListDto withRealtime(Long realtime) {
        this.realtime = realtime;
        return this;
    }

    /**
     * 实际运行时间
     * @return realtime
     */
    public Long getRealtime() {
        return realtime;
    }

    public void setRealtime(Long realtime) {
        this.realtime = realtime;
    }

    public NextflowTaskListDto withCpuPercent(Double cpuPercent) {
        this.cpuPercent = cpuPercent;
        return this;
    }

    /**
     * cpu使用率
     * @return cpuPercent
     */
    public Double getCpuPercent() {
        return cpuPercent;
    }

    public void setCpuPercent(Double cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    public NextflowTaskListDto withMemPercent(Double memPercent) {
        this.memPercent = memPercent;
        return this;
    }

    /**
     * 内存使用率
     * @return memPercent
     */
    public Double getMemPercent() {
        return memPercent;
    }

    public void setMemPercent(Double memPercent) {
        this.memPercent = memPercent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NextflowTaskListDto nextflowTaskListDto = (NextflowTaskListDto) o;
        return Objects.equals(this.taskId, nextflowTaskListDto.taskId)
            && Objects.equals(this.process, nextflowTaskListDto.process)
            && Objects.equals(this.tag, nextflowTaskListDto.tag) && Objects.equals(this.hash, nextflowTaskListDto.hash)
            && Objects.equals(this.status, nextflowTaskListDto.status)
            && Objects.equals(this.container, nextflowTaskListDto.container)
            && Objects.equals(this.podName, nextflowTaskListDto.podName)
            && Objects.equals(this.submit, nextflowTaskListDto.submit)
            && Objects.equals(this.complete, nextflowTaskListDto.complete)
            && Objects.equals(this.duration, nextflowTaskListDto.duration)
            && Objects.equals(this.realtime, nextflowTaskListDto.realtime)
            && Objects.equals(this.cpuPercent, nextflowTaskListDto.cpuPercent)
            && Objects.equals(this.memPercent, nextflowTaskListDto.memPercent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            process,
            tag,
            hash,
            status,
            container,
            podName,
            submit,
            complete,
            duration,
            realtime,
            cpuPercent,
            memPercent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NextflowTaskListDto {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    container: ").append(toIndentedString(container)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    submit: ").append(toIndentedString(submit)).append("\n");
        sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    realtime: ").append(toIndentedString(realtime)).append("\n");
        sb.append("    cpuPercent: ").append(toIndentedString(cpuPercent)).append("\n");
        sb.append("    memPercent: ").append(toIndentedString(memPercent)).append("\n");
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
