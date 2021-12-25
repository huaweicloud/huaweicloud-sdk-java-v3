package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateNodeByDeviceIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EdgeNodeUpdateByDevice body;

    public UpdateNodeByDeviceIdRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /** 设备ID
     * 
     * @return deviceId */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public UpdateNodeByDeviceIdRequest withBody(EdgeNodeUpdateByDevice body) {
        this.body = body;
        return this;
    }

    public UpdateNodeByDeviceIdRequest withBody(Consumer<EdgeNodeUpdateByDevice> bodySetter) {
        if (this.body == null) {
            this.body = new EdgeNodeUpdateByDevice();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public EdgeNodeUpdateByDevice getBody() {
        return body;
    }

    public void setBody(EdgeNodeUpdateByDevice body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNodeByDeviceIdRequest updateNodeByDeviceIdRequest = (UpdateNodeByDeviceIdRequest) o;
        return Objects.equals(this.deviceId, updateNodeByDeviceIdRequest.deviceId)
            && Objects.equals(this.body, updateNodeByDeviceIdRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNodeByDeviceIdRequest {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
