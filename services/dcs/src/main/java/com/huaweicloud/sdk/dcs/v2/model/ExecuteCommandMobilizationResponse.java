package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteCommandMobilizationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response")

    private String response;

    public ExecuteCommandMobilizationResponse withResponse(String response) {
        this.response = response;
        return this;
    }

    /**
     * 返回信息
     * @return response
     */
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteCommandMobilizationResponse that = (ExecuteCommandMobilizationResponse) obj;
        return Objects.equals(this.response, that.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteCommandMobilizationResponse {\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
