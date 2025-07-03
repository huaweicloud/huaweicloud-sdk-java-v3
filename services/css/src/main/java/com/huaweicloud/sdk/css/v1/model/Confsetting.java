package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Confsetting
 */
public class Confsetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workers")

    private Integer workers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batchSize")

    private Integer batchSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batchDelayMs")

    private Integer batchDelayMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queueType")

    private String queueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queueCheckPointWrites")

    private Integer queueCheckPointWrites;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queueMaxBytesMb")

    private Integer queueMaxBytesMb;

    public Confsetting withWorkers(Integer workers) {
        this.workers = workers;
        return this;
    }

    /**
     * 并行执行管道的Filters+Outputs阶段的工作线程数，默认值为CPU核数。
     * @return workers
     */
    public Integer getWorkers() {
        return workers;
    }

    public void setWorkers(Integer workers) {
        this.workers = workers;
    }

    public Confsetting withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * 单个工作线程在尝试执行其Filters和Outputs之前将从inputs收集的最大事件数，该值较大通常更有效，但会增加内存开销，默认为125。
     * @return batchSize
     */
    public Integer getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    public Confsetting withBatchDelayMs(Integer batchDelayMs) {
        this.batchDelayMs = batchDelayMs;
        return this;
    }

    /**
     * 每个event被pipeline调度等待的最小时间。 单位毫秒。
     * @return batchDelayMs
     */
    public Integer getBatchDelayMs() {
        return batchDelayMs;
    }

    public void setBatchDelayMs(Integer batchDelayMs) {
        this.batchDelayMs = batchDelayMs;
    }

    public Confsetting withQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }

    /**
     * 用于事件缓冲的内部队列模型。memory 为基于内存的传统队列，persisted为基于磁盘的ACKed持久化队列，默认值为memory。
     * @return queueType
     */
    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public Confsetting withQueueCheckPointWrites(Integer queueCheckPointWrites) {
        this.queueCheckPointWrites = queueCheckPointWrites;
        return this;
    }

    /**
     * 如果使用持久化队列，则表示强制执行检查点之前写入的最大事件数，默认值为1024。
     * @return queueCheckPointWrites
     */
    public Integer getQueueCheckPointWrites() {
        return queueCheckPointWrites;
    }

    public void setQueueCheckPointWrites(Integer queueCheckPointWrites) {
        this.queueCheckPointWrites = queueCheckPointWrites;
    }

    public Confsetting withQueueMaxBytesMb(Integer queueMaxBytesMb) {
        this.queueMaxBytesMb = queueMaxBytesMb;
        return this;
    }

    /**
     * 如果使用持久化队列，则表示持久化队列的总容量（以兆字节MB为单位），确保磁盘的容量大于该值，默认值为1024。
     * @return queueMaxBytesMb
     */
    public Integer getQueueMaxBytesMb() {
        return queueMaxBytesMb;
    }

    public void setQueueMaxBytesMb(Integer queueMaxBytesMb) {
        this.queueMaxBytesMb = queueMaxBytesMb;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Confsetting that = (Confsetting) obj;
        return Objects.equals(this.workers, that.workers) && Objects.equals(this.batchSize, that.batchSize)
            && Objects.equals(this.batchDelayMs, that.batchDelayMs) && Objects.equals(this.queueType, that.queueType)
            && Objects.equals(this.queueCheckPointWrites, that.queueCheckPointWrites)
            && Objects.equals(this.queueMaxBytesMb, that.queueMaxBytesMb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workers, batchSize, batchDelayMs, queueType, queueCheckPointWrites, queueMaxBytesMb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Confsetting {\n");
        sb.append("    workers: ").append(toIndentedString(workers)).append("\n");
        sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
        sb.append("    batchDelayMs: ").append(toIndentedString(batchDelayMs)).append("\n");
        sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
        sb.append("    queueCheckPointWrites: ").append(toIndentedString(queueCheckPointWrites)).append("\n");
        sb.append("    queueMaxBytesMb: ").append(toIndentedString(queueMaxBytesMb)).append("\n");
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
