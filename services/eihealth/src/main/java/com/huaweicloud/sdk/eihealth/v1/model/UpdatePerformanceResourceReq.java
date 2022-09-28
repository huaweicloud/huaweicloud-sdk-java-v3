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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePerformanceResourceReq updatePerformanceResourceReq = (UpdatePerformanceResourceReq) o;
        return Objects.equals(this.jobQuota, updatePerformanceResourceReq.jobQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePerformanceResourceReq {\n");
        sb.append("    jobQuota: ").append(toIndentedString(jobQuota)).append("\n");
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
