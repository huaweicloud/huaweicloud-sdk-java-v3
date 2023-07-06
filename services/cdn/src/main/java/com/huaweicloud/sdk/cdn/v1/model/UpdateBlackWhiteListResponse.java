package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateBlackWhiteListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Object data;

    public UpdateBlackWhiteListResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 响应码，200：成功，400，失败。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UpdateBlackWhiteListResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 响应结果。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public UpdateBlackWhiteListResponse withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * 响应体返回内容。
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBlackWhiteListResponse that = (UpdateBlackWhiteListResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.result, that.result)
            && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, result, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBlackWhiteListResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
