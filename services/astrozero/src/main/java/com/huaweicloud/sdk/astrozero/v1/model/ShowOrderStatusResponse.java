package com.huaweicloud.sdk.astrozero.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOrderStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resCode")

    private String resCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resMsg")

    private String resMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Object result;

    public ShowOrderStatusResponse withResCode(String resCode) {
        this.resCode = resCode;
        return this;
    }

    /**
     * 响应码
     * @return resCode
     */
    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public ShowOrderStatusResponse withResMsg(String resMsg) {
        this.resMsg = resMsg;
        return this;
    }

    /**
     * 响应信息
     * @return resMsg
     */
    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public ShowOrderStatusResponse withResult(Object result) {
        this.result = result;
        return this;
    }

    public ShowOrderStatusResponse withResult(Consumer<Object> resultSetter) {
        if (this.result == null) {
            this.result = new Object();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
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
        ShowOrderStatusResponse that = (ShowOrderStatusResponse) obj;
        return Objects.equals(this.resCode, that.resCode) && Objects.equals(this.resMsg, that.resMsg)
            && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resCode, resMsg, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOrderStatusResponse {\n");
        sb.append("    resCode: ").append(toIndentedString(resCode)).append("\n");
        sb.append("    resMsg: ").append(toIndentedString(resMsg)).append("\n");
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
