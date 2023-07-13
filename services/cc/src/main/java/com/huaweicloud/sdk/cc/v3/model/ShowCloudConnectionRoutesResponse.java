package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCloudConnectionRoutesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_route")

    private CloudConnectionRoute cloudConnectionRoute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowCloudConnectionRoutesResponse withCloudConnectionRoute(CloudConnectionRoute cloudConnectionRoute) {
        this.cloudConnectionRoute = cloudConnectionRoute;
        return this;
    }

    public ShowCloudConnectionRoutesResponse withCloudConnectionRoute(
        Consumer<CloudConnectionRoute> cloudConnectionRouteSetter) {
        if (this.cloudConnectionRoute == null) {
            this.cloudConnectionRoute = new CloudConnectionRoute();
            cloudConnectionRouteSetter.accept(this.cloudConnectionRoute);
        }

        return this;
    }

    /**
     * Get cloudConnectionRoute
     * @return cloudConnectionRoute
     */
    public CloudConnectionRoute getCloudConnectionRoute() {
        return cloudConnectionRoute;
    }

    public void setCloudConnectionRoute(CloudConnectionRoute cloudConnectionRoute) {
        this.cloudConnectionRoute = cloudConnectionRoute;
    }

    public ShowCloudConnectionRoutesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCloudConnectionRoutesResponse that = (ShowCloudConnectionRoutesResponse) obj;
        return Objects.equals(this.cloudConnectionRoute, that.cloudConnectionRoute)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudConnectionRoute, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCloudConnectionRoutesResponse {\n");
        sb.append("    cloudConnectionRoute: ").append(toIndentedString(cloudConnectionRoute)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
