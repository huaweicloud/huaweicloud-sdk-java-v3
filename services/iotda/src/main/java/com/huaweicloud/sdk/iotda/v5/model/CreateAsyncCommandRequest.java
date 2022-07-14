package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateAsyncCommandRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AsyncDeviceCommandRequest body;

    public CreateAsyncCommandRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * **参数说明**：下发命令的设备ID，用于唯一标识一个设备，在注册设备时由物联网平台分配获得。 **取值范围**：长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public CreateAsyncCommandRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数说明**：实例ID。物理多租下各实例的唯一标识，一般华为云租户无需携带该参数，仅在物理多租场景下从管理面访问API时需要携带该参数。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateAsyncCommandRequest withBody(AsyncDeviceCommandRequest body) {
        this.body = body;
        return this;
    }

    public CreateAsyncCommandRequest withBody(Consumer<AsyncDeviceCommandRequest> bodySetter) {
        if (this.body == null) {
            this.body = new AsyncDeviceCommandRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AsyncDeviceCommandRequest getBody() {
        return body;
    }

    public void setBody(AsyncDeviceCommandRequest body) {
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
        CreateAsyncCommandRequest createAsyncCommandRequest = (CreateAsyncCommandRequest) o;
        return Objects.equals(this.deviceId, createAsyncCommandRequest.deviceId)
            && Objects.equals(this.instanceId, createAsyncCommandRequest.instanceId)
            && Objects.equals(this.body, createAsyncCommandRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, instanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAsyncCommandRequest {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
