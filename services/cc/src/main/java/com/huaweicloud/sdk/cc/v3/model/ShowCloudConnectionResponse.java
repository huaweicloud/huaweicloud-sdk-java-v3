package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowCloudConnectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection")

    private CloudConnection cloudConnection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowCloudConnectionResponse withCloudConnection(CloudConnection cloudConnection) {
        this.cloudConnection = cloudConnection;
        return this;
    }

    public ShowCloudConnectionResponse withCloudConnection(Consumer<CloudConnection> cloudConnectionSetter) {
        if (this.cloudConnection == null) {
            this.cloudConnection = new CloudConnection();
            cloudConnectionSetter.accept(this.cloudConnection);
        }

        return this;
    }

    /** Get cloudConnection
     * 
     * @return cloudConnection */
    public CloudConnection getCloudConnection() {
        return cloudConnection;
    }

    public void setCloudConnection(CloudConnection cloudConnection) {
        this.cloudConnection = cloudConnection;
    }

    public ShowCloudConnectionResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /** 请求ID。
     * 
     * @return requestId */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCloudConnectionResponse showCloudConnectionResponse = (ShowCloudConnectionResponse) o;
        return Objects.equals(this.cloudConnection, showCloudConnectionResponse.cloudConnection)
            && Objects.equals(this.requestId, showCloudConnectionResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudConnection, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCloudConnectionResponse {\n");
        sb.append("    cloudConnection: ").append(toIndentedString(cloudConnection)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
