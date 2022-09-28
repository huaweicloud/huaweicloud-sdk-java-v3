package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowJobConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_retain_number")

    private Integer jobRetainNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_retain_time")

    private Integer jobRetainTime;

    public ShowJobConfigResponse withJobRetainNumber(Integer jobRetainNumber) {
        this.jobRetainNumber = jobRetainNumber;
        return this;
    }

    /**
     * 作业保存条数
     * minimum: 10000
     * maximum: 5000000
     * @return jobRetainNumber
     */
    public Integer getJobRetainNumber() {
        return jobRetainNumber;
    }

    public void setJobRetainNumber(Integer jobRetainNumber) {
        this.jobRetainNumber = jobRetainNumber;
    }

    public ShowJobConfigResponse withJobRetainTime(Integer jobRetainTime) {
        this.jobRetainTime = jobRetainTime;
        return this;
    }

    /**
     * 作业保存时长，单位天
     * minimum: 180
     * maximum: 3650
     * @return jobRetainTime
     */
    public Integer getJobRetainTime() {
        return jobRetainTime;
    }

    public void setJobRetainTime(Integer jobRetainTime) {
        this.jobRetainTime = jobRetainTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobConfigResponse showJobConfigResponse = (ShowJobConfigResponse) o;
        return Objects.equals(this.jobRetainNumber, showJobConfigResponse.jobRetainNumber)
            && Objects.equals(this.jobRetainTime, showJobConfigResponse.jobRetainTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobRetainNumber, jobRetainTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobConfigResponse {\n");
        sb.append("    jobRetainNumber: ").append(toIndentedString(jobRetainNumber)).append("\n");
        sb.append("    jobRetainTime: ").append(toIndentedString(jobRetainTime)).append("\n");
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
