package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListVmsCallbacksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private ListVmsCallbacksMode data;

    public ListVmsCallbacksResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 请求状态，固定200。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListVmsCallbacksResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 状态描述。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListVmsCallbacksResponse withData(ListVmsCallbacksMode data) {
        this.data = data;
        return this;
    }

    public ListVmsCallbacksResponse withData(Consumer<ListVmsCallbacksMode> dataSetter) {
        if (this.data == null) {
            this.data = new ListVmsCallbacksMode();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public ListVmsCallbacksMode getData() {
        return data;
    }

    public void setData(ListVmsCallbacksMode data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVmsCallbacksResponse listVmsCallbacksResponse = (ListVmsCallbacksResponse) o;
        return Objects.equals(this.status, listVmsCallbacksResponse.status)
            && Objects.equals(this.message, listVmsCallbacksResponse.message)
            && Objects.equals(this.data, listVmsCallbacksResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, message, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVmsCallbacksResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
