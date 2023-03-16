package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 性能加速资源信息
 */
public class PerformanceResourcesRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_job_count")

    private Integer runningJobCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedulable")

    private Boolean schedulable;

    public PerformanceResourcesRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 性能加速资源id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PerformanceResourcesRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 性能加速资源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PerformanceResourcesRsp withRunningJobCount(Integer runningJobCount) {
        this.runningJobCount = runningJobCount;
        return this;
    }

    /**
     * 当前运行中的作业总数
     * @return runningJobCount
     */
    public Integer getRunningJobCount() {
        return runningJobCount;
    }

    public void setRunningJobCount(Integer runningJobCount) {
        this.runningJobCount = runningJobCount;
    }

    public PerformanceResourcesRsp withSchedulable(Boolean schedulable) {
        this.schedulable = schedulable;
        return this;
    }

    /**
     * 资源是否可调度
     * @return schedulable
     */
    public Boolean getSchedulable() {
        return schedulable;
    }

    public void setSchedulable(Boolean schedulable) {
        this.schedulable = schedulable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PerformanceResourcesRsp performanceResourcesRsp = (PerformanceResourcesRsp) o;
        return Objects.equals(this.id, performanceResourcesRsp.id)
            && Objects.equals(this.name, performanceResourcesRsp.name)
            && Objects.equals(this.runningJobCount, performanceResourcesRsp.runningJobCount)
            && Objects.equals(this.schedulable, performanceResourcesRsp.schedulable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, runningJobCount, schedulable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PerformanceResourcesRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    runningJobCount: ").append(toIndentedString(runningJobCount)).append("\n");
        sb.append("    schedulable: ").append(toIndentedString(schedulable)).append("\n");
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
