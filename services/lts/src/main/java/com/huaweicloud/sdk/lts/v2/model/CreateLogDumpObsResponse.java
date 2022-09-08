package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateLogDumpObsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_dump_obs_id")

    private String logDumpObsId;

    public CreateLogDumpObsResponse withLogDumpObsId(String logDumpObsId) {
        this.logDumpObsId = logDumpObsId;
        return this;
    }

    /**
     * 转储id。
     * @return logDumpObsId
     */
    public String getLogDumpObsId() {
        return logDumpObsId;
    }

    public void setLogDumpObsId(String logDumpObsId) {
        this.logDumpObsId = logDumpObsId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateLogDumpObsResponse createLogDumpObsResponse = (CreateLogDumpObsResponse) o;
        return Objects.equals(this.logDumpObsId, createLogDumpObsResponse.logDumpObsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logDumpObsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLogDumpObsResponse {\n");
        sb.append("    logDumpObsId: ").append(toIndentedString(logDumpObsId)).append("\n");
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
