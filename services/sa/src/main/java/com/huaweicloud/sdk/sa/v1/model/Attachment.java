package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Attachment
 */
public class Attachment  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_id")
    
    private String serverId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attachment_id")
    
    private String attachmentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attached_at")
    
    private OffsetDateTime attachedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device")
    
    private String device;

    public Attachment withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    


    /**
     * 云硬盘挂载到的云服务器的ID。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
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

    

    public Attachment withAttachedAt(OffsetDateTime attachedAt) {
        this.attachedAt = attachedAt;
        return this;
    }

    


    /**
     * 挂载时间。
     * @return attachedAt
     */
    public OffsetDateTime getAttachedAt() {
        return attachedAt;
    }

    public void setAttachedAt(OffsetDateTime attachedAt) {
        this.attachedAt = attachedAt;
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Attachment attachment = (Attachment) o;
        return Objects.equals(this.serverId, attachment.serverId) &&
            Objects.equals(this.attachmentId, attachment.attachmentId) &&
            Objects.equals(this.attachedAt, attachment.attachedAt) &&
            Objects.equals(this.device, attachment.device);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serverId, attachmentId, attachedAt, device);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Attachment {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
        sb.append("    attachedAt: ").append(toIndentedString(attachedAt)).append("\n");
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

