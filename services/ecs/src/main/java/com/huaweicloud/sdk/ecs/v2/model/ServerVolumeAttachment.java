package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ServerVolumeAttachment
 */
public class ServerVolumeAttachment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private String device;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverId")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeId")

    private String volumeId;

    public ServerVolumeAttachment withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * 云硬盘挂载盘符，即磁盘挂载点。
     * @return device
     */
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public ServerVolumeAttachment withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 挂载ID，与云硬盘ID相同，UUID格式。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServerVolumeAttachment withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 弹性云服务器ID，UUID格式。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ServerVolumeAttachment withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * 云硬盘ID，UUID格式。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerVolumeAttachment that = (ServerVolumeAttachment) obj;
        return Objects.equals(this.device, that.device) && Objects.equals(this.id, that.id)
            && Objects.equals(this.serverId, that.serverId) && Objects.equals(this.volumeId, that.volumeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device, id, serverId, volumeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerVolumeAttachment {\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
