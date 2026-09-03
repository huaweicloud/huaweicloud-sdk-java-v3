package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源可用容量，不考虑资源已分配量，即资源总容量减去故障资源和热备节点的资源
 */
public class WorkloadInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocated")

    private WorkloadStatisticsInfo allocated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue")

    private WorkloadStatisticsInfo queue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private String timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "window")

    private String window;

    public WorkloadInfo withAllocated(WorkloadStatisticsInfo allocated) {
        this.allocated = allocated;
        return this;
    }

    public WorkloadInfo withAllocated(Consumer<WorkloadStatisticsInfo> allocatedSetter) {
        if (this.allocated == null) {
            this.allocated = new WorkloadStatisticsInfo();
            allocatedSetter.accept(this.allocated);
        }

        return this;
    }

    /**
     * Get allocated
     * @return allocated
     */
    public WorkloadStatisticsInfo getAllocated() {
        return allocated;
    }

    public void setAllocated(WorkloadStatisticsInfo allocated) {
        this.allocated = allocated;
    }

    public WorkloadInfo withQueue(WorkloadStatisticsInfo queue) {
        this.queue = queue;
        return this;
    }

    public WorkloadInfo withQueue(Consumer<WorkloadStatisticsInfo> queueSetter) {
        if (this.queue == null) {
            this.queue = new WorkloadStatisticsInfo();
            queueSetter.accept(this.queue);
        }

        return this;
    }

    /**
     * Get queue
     * @return queue
     */
    public WorkloadStatisticsInfo getQueue() {
        return queue;
    }

    public void setQueue(WorkloadStatisticsInfo queue) {
        this.queue = queue;
    }

    public WorkloadInfo withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * UTC时间，格式yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public WorkloadInfo withWindow(String window) {
        this.window = window;
        return this;
    }

    /**
     * 统计间隔，1s表示1秒，1m表示一分钟，1h为一小时。
     * @return window
     */
    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadInfo that = (WorkloadInfo) obj;
        return Objects.equals(this.allocated, that.allocated) && Objects.equals(this.queue, that.queue)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.window, that.window);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allocated, queue, timestamp, window);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadInfo {\n");
        sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    window: ").append(toIndentedString(window)).append("\n");
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
