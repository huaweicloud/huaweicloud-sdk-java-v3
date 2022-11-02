package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateServerBlockDeviceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    private String volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateServerBlockDeviceReq body;

    public UpdateServerBlockDeviceRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云服务器ID。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public UpdateServerBlockDeviceRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * 磁盘id，uuid格式
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public UpdateServerBlockDeviceRequest withBody(UpdateServerBlockDeviceReq body) {
        this.body = body;
        return this;
    }

    public UpdateServerBlockDeviceRequest withBody(Consumer<UpdateServerBlockDeviceReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateServerBlockDeviceReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateServerBlockDeviceReq getBody() {
        return body;
    }

    public void setBody(UpdateServerBlockDeviceReq body) {
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
        UpdateServerBlockDeviceRequest updateServerBlockDeviceRequest = (UpdateServerBlockDeviceRequest) o;
        return Objects.equals(this.serverId, updateServerBlockDeviceRequest.serverId)
            && Objects.equals(this.volumeId, updateServerBlockDeviceRequest.volumeId)
            && Objects.equals(this.body, updateServerBlockDeviceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, volumeId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerBlockDeviceRequest {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
