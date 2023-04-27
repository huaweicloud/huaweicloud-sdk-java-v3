package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NextflowTaskResourceRequested
 */
public class NextflowTaskResourceRequested {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container")

    private String container;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue")

    private String queue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpus")

    private Integer cpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private String disk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public NextflowTaskResourceRequested withContainer(String container) {
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

    public NextflowTaskResourceRequested withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * 执行队列，使用','分隔多个值
     * @return queue
     */
    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public NextflowTaskResourceRequested withCpus(Integer cpus) {
        this.cpus = cpus;
        return this;
    }

    /**
     * 指定task执行需要的cpu数量
     * @return cpus
     */
    public Integer getCpus() {
        return cpus;
    }

    public void setCpus(Integer cpus) {
        this.cpus = cpus;
    }

    public NextflowTaskResourceRequested withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 指定task执行需要的内存大小
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public NextflowTaskResourceRequested withDisk(String disk) {
        this.disk = disk;
        return this;
    }

    /**
     * 指定task执行需要的磁盘大小
     * @return disk
     */
    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public NextflowTaskResourceRequested withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 指定task执行需要的时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NextflowTaskResourceRequested nextflowTaskResourceRequested = (NextflowTaskResourceRequested) o;
        return Objects.equals(this.container, nextflowTaskResourceRequested.container)
            && Objects.equals(this.queue, nextflowTaskResourceRequested.queue)
            && Objects.equals(this.cpus, nextflowTaskResourceRequested.cpus)
            && Objects.equals(this.memory, nextflowTaskResourceRequested.memory)
            && Objects.equals(this.disk, nextflowTaskResourceRequested.disk)
            && Objects.equals(this.time, nextflowTaskResourceRequested.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(container, queue, cpus, memory, disk, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NextflowTaskResourceRequested {\n");
        sb.append("    container: ").append(toIndentedString(container)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    cpus: ").append(toIndentedString(cpus)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
