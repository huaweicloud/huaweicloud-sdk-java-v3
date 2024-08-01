package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowLogStreamShardsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorCode")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isQueryComplete")

    private Boolean isQueryComplete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    public ShowLogStreamShardsResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ShowLogStreamShardsResponse withIsQueryComplete(Boolean isQueryComplete) {
        this.isQueryComplete = isQueryComplete;
        return this;
    }

    /**
     * 是否完全查询
     * @return isQueryComplete
     */
    public Boolean getIsQueryComplete() {
        return isQueryComplete;
    }

    public void setIsQueryComplete(Boolean isQueryComplete) {
        this.isQueryComplete = isQueryComplete;
    }

    public ShowLogStreamShardsResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 查询结果
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLogStreamShardsResponse that = (ShowLogStreamShardsResponse) obj;
        return Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.isQueryComplete, that.isQueryComplete) && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, isQueryComplete, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLogStreamShardsResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    isQueryComplete: ").append(toIndentedString(isQueryComplete)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
