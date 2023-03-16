package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 作业配置请求体
 */
public class UpdateJobConfigReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_retain_number")

    private Integer jobRetainNumber;

    public UpdateJobConfigReq withJobRetainNumber(Integer jobRetainNumber) {
        this.jobRetainNumber = jobRetainNumber;
        return this;
    }

    /**
     * 作业保存条数
     * minimum: 10000
     * maximum: 10000000
     * @return jobRetainNumber
     */
    public Integer getJobRetainNumber() {
        return jobRetainNumber;
    }

    public void setJobRetainNumber(Integer jobRetainNumber) {
        this.jobRetainNumber = jobRetainNumber;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateJobConfigReq updateJobConfigReq = (UpdateJobConfigReq) o;
        return Objects.equals(this.jobRetainNumber, updateJobConfigReq.jobRetainNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobRetainNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateJobConfigReq {\n");
        sb.append("    jobRetainNumber: ").append(toIndentedString(jobRetainNumber)).append("\n");
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
