package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class HandleUnionMemberQuitListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    @JacksonXmlProperty(localName = "operation_id")

    private String operationId;

    public HandleUnionMemberQuitListResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 请求结果
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public HandleUnionMemberQuitListResponse withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * 操作记录ID
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HandleUnionMemberQuitListResponse handleUnionMemberQuitListResponse = (HandleUnionMemberQuitListResponse) o;
        return Objects.equals(this.result, handleUnionMemberQuitListResponse.result)
            && Objects.equals(this.operationId, handleUnionMemberQuitListResponse.operationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, operationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HandleUnionMemberQuitListResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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
