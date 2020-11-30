package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 裸金属服务器挂载信息列表
 */
public class VolumeAttachments  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private UUID id = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="serverId")
    
    private UUID serverId = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumeId")
    
    private UUID volumeId = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device")
    
    private String device;

    public VolumeAttachments withId(UUID id) {
        this.id = id;
        return this;
    }

    


    /**
     * 挂载资源ID
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public VolumeAttachments withServerId(UUID serverId) {
        this.serverId = serverId;
        return this;
    }

    


    /**
     * 所属裸金属服务器ID
     * @return serverId
     */
    public UUID getServerId() {
        return serverId;
    }

    public void setServerId(UUID serverId) {
        this.serverId = serverId;
    }

    public VolumeAttachments withVolumeId(UUID volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    


    /**
     * 挂载云磁盘ID
     * @return volumeId
     */
    public UUID getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(UUID volumeId) {
        this.volumeId = volumeId;
    }

    public VolumeAttachments withDevice(String device) {
        this.device = device;
        return this;
    }

    


    /**
     * 挂载目录，例如“/dev/sdd”。
     * @return device
     */
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VolumeAttachments volumeAttachments = (VolumeAttachments) o;
        return Objects.equals(this.id, volumeAttachments.id) &&
            Objects.equals(this.serverId, volumeAttachments.serverId) &&
            Objects.equals(this.volumeId, volumeAttachments.volumeId) &&
            Objects.equals(this.device, volumeAttachments.device);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, serverId, volumeId, device);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeAttachments {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
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

