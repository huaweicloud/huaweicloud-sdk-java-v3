package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdatePerformanceResourceReq
 */
public class UpdatePerformanceResourceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_quota")

    private Integer jobQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedulable")

    private Boolean schedulable;

    public UpdatePerformanceResourceReq withJobQuota(Integer jobQuota) {
        this.jobQuota = jobQuota;
        return this;
    }

    /**
     * 运行的最大作业数量
     * minimum: 1
     * maximum: 1000
     * @return jobQuota
     */
    public Integer getJobQuota() {
        return jobQuota;
    }

    public void setJobQuota(Integer jobQuota) {
        this.jobQuota = jobQuota;
    }

    public UpdatePerformanceResourceReq withSchedulable(Boolean schedulable) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePerformanceResourceReq that = (UpdatePerformanceResourceReq) obj;
        return Objects.equals(this.jobQuota, that.jobQuota) && Objects.equals(this.schedulable, that.schedulable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobQuota, schedulable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePerformanceResourceReq {\n");
        sb.append("    jobQuota: ").append(toIndentedString(jobQuota)).append("\n");
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
