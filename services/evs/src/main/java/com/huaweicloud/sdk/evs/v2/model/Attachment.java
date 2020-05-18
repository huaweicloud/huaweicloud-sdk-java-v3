package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Attachment
 */
public class Attachment  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attached_at")
    
    private String attachedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attachment_id")
    
    private String attachmentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device")
    
    private String device;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_name")
    
    private String hostName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_id")
    
    private String serverId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_id")
    
    private String volumeId;

    public Attachment withAttachedAt(String attachedAt) {
        this.attachedAt = attachedAt;
        return this;
    }

    


    /**
     * 挂载的时间信息。  时间格式：UTC YYYY-MM-DDTHH:MM:SS.XXXXXX
     * @return attachedAt
     */
    public String getAttachedAt() {
        return attachedAt;
    }

    public void setAttachedAt(String attachedAt) {
        this.attachedAt = attachedAt;
    }

    public Attachment withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    


    /**
     * 挂载信息对应的ID。
     * @return attachmentId
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public Attachment withDevice(String device) {
        this.device = device;
        return this;
    }

    


    /**
     * 挂载点。
     * @return device
     */
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Attachment withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    


    /**
     * 云硬盘挂载到的云服务器对应的物理主机的名称。
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Attachment withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 挂载的资源ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Attachment withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    


    /**
     * 云硬盘挂载到的云服务器的 ID。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public Attachment withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    


    /**
     * 云硬盘ID
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Attachment attachment = (Attachment) o;
        return Objects.equals(this.attachedAt, attachment.attachedAt) &&
            Objects.equals(this.attachmentId, attachment.attachmentId) &&
            Objects.equals(this.device, attachment.device) &&
            Objects.equals(this.hostName, attachment.hostName) &&
            Objects.equals(this.id, attachment.id) &&
            Objects.equals(this.serverId, attachment.serverId) &&
            Objects.equals(this.volumeId, attachment.volumeId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(attachedAt, attachmentId, device, hostName, id, serverId, volumeId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Attachment {\n");
            sb.append("    attachedAt: ").append(toIndentedString(attachedAt)).append("\n");
            sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
            sb.append("    device: ").append(toIndentedString(device)).append("\n");
            sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
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

