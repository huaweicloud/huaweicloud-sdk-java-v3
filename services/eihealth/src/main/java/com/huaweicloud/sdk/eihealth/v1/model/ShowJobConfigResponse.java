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

    public ShowJobConfigResponse withJobRetainNumber(Integer jobRetainNumber) {
        this.jobRetainNumber = jobRetainNumber;
        return this;
    }

    /**
     * 作业保存条数
     * @return jobRetainNumber
     */
    public Integer getJobRetainNumber() {
        return jobRetainNumber;
    }

    public void setJobRetainNumber(Integer jobRetainNumber) {
        this.jobRetainNumber = jobRetainNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobConfigResponse that = (ShowJobConfigResponse) obj;
        return Objects.equals(this.jobRetainNumber, that.jobRetainNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobRetainNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobConfigResponse {\n");
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
