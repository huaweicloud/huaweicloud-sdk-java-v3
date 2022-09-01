package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class SwitchSslResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_option")

    @JacksonXmlProperty(localName = "ssl_option")

    private String sslOption;

    public SwitchSslResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public SwitchSslResponse withSslOption(String sslOption) {
        this.sslOption = sslOption;
        return this;
    }

    /**
     * SSL开关状态。
     * @return sslOption
     */
    public String getSslOption() {
        return sslOption;
    }

    public void setSslOption(String sslOption) {
        this.sslOption = sslOption;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SwitchSslResponse switchSslResponse = (SwitchSslResponse) o;
        return Objects.equals(this.jobId, switchSslResponse.jobId)
            && Objects.equals(this.sslOption, switchSslResponse.sslOption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, sslOption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchSslResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    sslOption: ").append(toIndentedString(sslOption)).append("\n");
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
