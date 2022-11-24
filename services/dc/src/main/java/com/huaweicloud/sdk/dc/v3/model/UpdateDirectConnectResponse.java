package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateDirectConnectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direct_connect")

    private DirectConnect directConnect;

    public UpdateDirectConnectResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 操作请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateDirectConnectResponse withDirectConnect(DirectConnect directConnect) {
        this.directConnect = directConnect;
        return this;
    }

    public UpdateDirectConnectResponse withDirectConnect(Consumer<DirectConnect> directConnectSetter) {
        if (this.directConnect == null) {
            this.directConnect = new DirectConnect();
            directConnectSetter.accept(this.directConnect);
        }

        return this;
    }

    /**
     * Get directConnect
     * @return directConnect
     */
    public DirectConnect getDirectConnect() {
        return directConnect;
    }

    public void setDirectConnect(DirectConnect directConnect) {
        this.directConnect = directConnect;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDirectConnectResponse updateDirectConnectResponse = (UpdateDirectConnectResponse) o;
        return Objects.equals(this.requestId, updateDirectConnectResponse.requestId)
            && Objects.equals(this.directConnect, updateDirectConnectResponse.directConnect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, directConnect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDirectConnectResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    directConnect: ").append(toIndentedString(directConnect)).append("\n");
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
