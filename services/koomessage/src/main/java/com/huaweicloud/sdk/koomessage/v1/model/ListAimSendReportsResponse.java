package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAimSendReportsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private ListAimSendReportsMode data;

    public ListAimSendReportsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 响应码。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListAimSendReportsResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 响应信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListAimSendReportsResponse withData(ListAimSendReportsMode data) {
        this.data = data;
        return this;
    }

    public ListAimSendReportsResponse withData(Consumer<ListAimSendReportsMode> dataSetter) {
        if (this.data == null) {
            this.data = new ListAimSendReportsMode();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public ListAimSendReportsMode getData() {
        return data;
    }

    public void setData(ListAimSendReportsMode data) {
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
        ListAimSendReportsResponse listAimSendReportsResponse = (ListAimSendReportsResponse) o;
        return Objects.equals(this.status, listAimSendReportsResponse.status)
            && Objects.equals(this.message, listAimSendReportsResponse.message)
            && Objects.equals(this.data, listAimSendReportsResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, message, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAimSendReportsResponse {\n");
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
