package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskIP
 */
public class TaskIP {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private String task;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_count")

    private Integer scheduleCount;

    public TaskIP withTask(String task) {
        this.task = task;
        return this;
    }

    /**
     * Task 名称，如 worker-0。
     * @return task
     */
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public TaskIP withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Task IP 地址。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public TaskIP withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 宿主机 IP。 **约束限制**：仅专属资源池作业返回；公共资源池作业该字段为空。
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public TaskIP withScheduleCount(Integer scheduleCount) {
        this.scheduleCount = scheduleCount;
        return this;
    }

    /**
     * 当前 Task 的第几次调度，默认 1。 重调度、抢占等场景下递增。
     * @return scheduleCount
     */
    public Integer getScheduleCount() {
        return scheduleCount;
    }

    public void setScheduleCount(Integer scheduleCount) {
        this.scheduleCount = scheduleCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskIP that = (TaskIP) obj;
        return Objects.equals(this.task, that.task) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.hostIp, that.hostIp) && Objects.equals(this.scheduleCount, that.scheduleCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, ip, hostIp, scheduleCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskIP {\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    scheduleCount: ").append(toIndentedString(scheduleCount)).append("\n");
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
