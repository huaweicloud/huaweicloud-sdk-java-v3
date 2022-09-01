package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.UUID;

/**
 * Response Object
 */
public class AddNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobid")

    @JacksonXmlProperty(localName = "jobid")

    private UUID jobid;

    public AddNodeResponse withJobid(UUID jobid) {
        this.jobid = jobid;
        return this;
    }

    /**
     * 提交任务成功后返回的任务ID，用户可以使用该ID对任务执行情况进行查询。
     * @return jobid
     */
    public UUID getJobid() {
        return jobid;
    }

    public void setJobid(UUID jobid) {
        this.jobid = jobid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddNodeResponse addNodeResponse = (AddNodeResponse) o;
        return Objects.equals(this.jobid, addNodeResponse.jobid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddNodeResponse {\n");
        sb.append("    jobid: ").append(toIndentedString(jobid)).append("\n");
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
