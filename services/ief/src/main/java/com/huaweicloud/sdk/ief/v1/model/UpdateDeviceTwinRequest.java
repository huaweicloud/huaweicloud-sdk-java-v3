package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDeviceTwinRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    @JacksonXmlProperty(localName = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    @JacksonXmlProperty(localName = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private TwinUpdateDetail body;

    public UpdateDeviceTwinRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /**
     * 铂金版实例ID，专业版实例为空值
     * @return iefInstanceId
     */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public UpdateDeviceTwinRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备ID
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public UpdateDeviceTwinRequest withBody(TwinUpdateDetail body) {
        this.body = body;
        return this;
    }

    public UpdateDeviceTwinRequest withBody(Consumer<TwinUpdateDetail> bodySetter) {
        if (this.body == null) {
            this.body = new TwinUpdateDetail();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TwinUpdateDetail getBody() {
        return body;
    }

    public void setBody(TwinUpdateDetail body) {
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
        UpdateDeviceTwinRequest updateDeviceTwinRequest = (UpdateDeviceTwinRequest) o;
        return Objects.equals(this.iefInstanceId, updateDeviceTwinRequest.iefInstanceId)
            && Objects.equals(this.deviceId, updateDeviceTwinRequest.deviceId)
            && Objects.equals(this.body, updateDeviceTwinRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iefInstanceId, deviceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeviceTwinRequest {\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
