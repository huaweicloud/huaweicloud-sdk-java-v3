package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DetachBaremetalServerVolumeRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_id")
    
    private String serverId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attachment_id")
    
    private String attachmentId;

    public DetachBaremetalServerVolumeRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    


    /**
     * Get serverId
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public DetachBaremetalServerVolumeRequest withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    


    /**
     * Get attachmentId
     * @return attachmentId
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetachBaremetalServerVolumeRequest detachBaremetalServerVolumeRequest = (DetachBaremetalServerVolumeRequest) o;
        return Objects.equals(this.serverId, detachBaremetalServerVolumeRequest.serverId) &&
            Objects.equals(this.attachmentId, detachBaremetalServerVolumeRequest.attachmentId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serverId, attachmentId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachBaremetalServerVolumeRequest {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
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

