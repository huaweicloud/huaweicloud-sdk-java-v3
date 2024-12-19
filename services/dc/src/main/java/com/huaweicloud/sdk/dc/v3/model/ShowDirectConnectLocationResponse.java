package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDirectConnectLocationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direct_connect_location")

    private DirectConnectLocationEntry directConnectLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowDirectConnectLocationResponse withDirectConnectLocation(
        DirectConnectLocationEntry directConnectLocation) {
        this.directConnectLocation = directConnectLocation;
        return this;
    }

    public ShowDirectConnectLocationResponse withDirectConnectLocation(
        Consumer<DirectConnectLocationEntry> directConnectLocationSetter) {
        if (this.directConnectLocation == null) {
            this.directConnectLocation = new DirectConnectLocationEntry();
            directConnectLocationSetter.accept(this.directConnectLocation);
        }

        return this;
    }

    /**
     * Get directConnectLocation
     * @return directConnectLocation
     */
    public DirectConnectLocationEntry getDirectConnectLocation() {
        return directConnectLocation;
    }

    public void setDirectConnectLocation(DirectConnectLocationEntry directConnectLocation) {
        this.directConnectLocation = directConnectLocation;
    }

    public ShowDirectConnectLocationResponse withRequestId(String requestId) {
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
        ShowDirectConnectLocationResponse that = (ShowDirectConnectLocationResponse) obj;
        return Objects.equals(this.directConnectLocation, that.directConnectLocation)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directConnectLocation, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDirectConnectLocationResponse {\n");
        sb.append("    directConnectLocation: ").append(toIndentedString(directConnectLocation)).append("\n");
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
