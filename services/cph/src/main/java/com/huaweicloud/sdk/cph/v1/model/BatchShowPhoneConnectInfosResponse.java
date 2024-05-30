package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchShowPhoneConnectInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_infos")

    private List<ConnectInfo> connectInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errors")

    private List<ConnectErrorInfo> errors = null;

    public BatchShowPhoneConnectInfosResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public BatchShowPhoneConnectInfosResponse withConnectInfos(List<ConnectInfo> connectInfos) {
        this.connectInfos = connectInfos;
        return this;
    }

    public BatchShowPhoneConnectInfosResponse addConnectInfosItem(ConnectInfo connectInfosItem) {
        if (this.connectInfos == null) {
            this.connectInfos = new ArrayList<>();
        }
        this.connectInfos.add(connectInfosItem);
        return this;
    }

    public BatchShowPhoneConnectInfosResponse withConnectInfos(Consumer<List<ConnectInfo>> connectInfosSetter) {
        if (this.connectInfos == null) {
            this.connectInfos = new ArrayList<>();
        }
        connectInfosSetter.accept(this.connectInfos);
        return this;
    }

    /**
     * 云手机接入信息列表
     * @return connectInfos
     */
    public List<ConnectInfo> getConnectInfos() {
        return connectInfos;
    }

    public void setConnectInfos(List<ConnectInfo> connectInfos) {
        this.connectInfos = connectInfos;
    }

    public BatchShowPhoneConnectInfosResponse withErrors(List<ConnectErrorInfo> errors) {
        this.errors = errors;
        return this;
    }

    public BatchShowPhoneConnectInfosResponse addErrorsItem(ConnectErrorInfo errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    public BatchShowPhoneConnectInfosResponse withErrors(Consumer<List<ConnectErrorInfo>> errorsSetter) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        errorsSetter.accept(this.errors);
        return this;
    }

    /**
     * 错误信息
     * @return errors
     */
    public List<ConnectErrorInfo> getErrors() {
        return errors;
    }

    public void setErrors(List<ConnectErrorInfo> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchShowPhoneConnectInfosResponse that = (BatchShowPhoneConnectInfosResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.connectInfos, that.connectInfos)
            && Objects.equals(this.errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, connectInfos, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowPhoneConnectInfosResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    connectInfos: ").append(toIndentedString(connectInfos)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
