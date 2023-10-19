package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateCloudConnectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection")

    private CloudConnection cloudConnection;

    public UpdateCloudConnectionResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateCloudConnectionResponse withCloudConnection(CloudConnection cloudConnection) {
        this.cloudConnection = cloudConnection;
        return this;
    }

    public UpdateCloudConnectionResponse withCloudConnection(Consumer<CloudConnection> cloudConnectionSetter) {
        if (this.cloudConnection == null) {
            this.cloudConnection = new CloudConnection();
            cloudConnectionSetter.accept(this.cloudConnection);
        }

        return this;
    }

    /**
     * Get cloudConnection
     * @return cloudConnection
     */
    public CloudConnection getCloudConnection() {
        return cloudConnection;
    }

    public void setCloudConnection(CloudConnection cloudConnection) {
        this.cloudConnection = cloudConnection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCloudConnectionResponse that = (UpdateCloudConnectionResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.cloudConnection, that.cloudConnection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, cloudConnection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCloudConnectionResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    cloudConnection: ").append(toIndentedString(cloudConnection)).append("\n");
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
