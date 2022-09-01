package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CancelBatchJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    @JacksonXmlProperty(localName = "msg")

    private String msg;

    public CancelBatchJobResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * 取消成功，返回“deleted”。
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CancelBatchJobResponse cancelBatchJobResponse = (CancelBatchJobResponse) o;
        return Objects.equals(this.msg, cancelBatchJobResponse.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelBatchJobResponse {\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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
