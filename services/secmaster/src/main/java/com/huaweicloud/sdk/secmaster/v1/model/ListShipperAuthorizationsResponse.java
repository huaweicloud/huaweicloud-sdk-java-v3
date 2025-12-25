package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListShipperAuthorizationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private ShowShipperAuthorizeResponseBodyData data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    public ListShipperAuthorizationsResponse withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * 错误码，0表示成功，其他值表示错误
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ListShipperAuthorizationsResponse withData(ShowShipperAuthorizeResponseBodyData data) {
        this.data = data;
        return this;
    }

    public ListShipperAuthorizationsResponse withData(Consumer<ShowShipperAuthorizeResponseBodyData> dataSetter) {
        if (this.data == null) {
            this.data = new ShowShipperAuthorizeResponseBodyData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public ShowShipperAuthorizeResponseBodyData getData() {
        return data;
    }

    public void setData(ShowShipperAuthorizeResponseBodyData data) {
        this.data = data;
    }

    public ListShipperAuthorizationsResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * 返回的状态信息，用于描述当前请求的结果
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListShipperAuthorizationsResponse that = (ListShipperAuthorizationsResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.data, that.data)
            && Objects.equals(this.msg, that.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, data, msg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListShipperAuthorizationsResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
