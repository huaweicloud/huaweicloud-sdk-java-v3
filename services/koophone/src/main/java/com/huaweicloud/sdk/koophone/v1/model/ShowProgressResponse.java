package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProgressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private InstancePrepareProgressRspData data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public ShowProgressResponse withData(InstancePrepareProgressRspData data) {
        this.data = data;
        return this;
    }

    public ShowProgressResponse withData(Consumer<InstancePrepareProgressRspData> dataSetter) {
        if (this.data == null) {
            this.data = new InstancePrepareProgressRspData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public InstancePrepareProgressRspData getData() {
        return data;
    }

    public void setData(InstancePrepareProgressRspData data) {
        this.data = data;
    }

    public ShowProgressResponse withErrorCode(String errorCode) {
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

    public ShowProgressResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProgressResponse that = (ShowProgressResponse) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProgressResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
