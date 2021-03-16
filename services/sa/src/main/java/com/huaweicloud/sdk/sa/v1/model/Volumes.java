package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sa.v1.model.Attachment;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Volumes
 */
public class Volumes  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attachments")
    
    private List<Attachment> attachments = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private String size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_type")
    
    private String volumeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encrypted")
    
    private Boolean encrypted;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="multiattach")
    
    private Boolean multiattach;

    public Volumes withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 云硬盘状态，见EVS服务云硬盘状态描述。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public Volumes withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 云硬盘所属的AZ信息。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    

    public Volumes withAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    
    public Volumes addAttachmentsItem(Attachment attachmentsItem) {
        this.attachments.add(attachmentsItem);
        return this;
    }

    public Volumes withAttachments(Consumer<List<Attachment>> attachmentsSetter) {
        if(this.attachments == null ){
            this.attachments = new ArrayList<>();
        }
        attachmentsSetter.accept(this.attachments);
        return this;
    }

    /**
     * 云硬盘的挂载信息。
     * @return attachments
     */
    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    

    public Volumes withSize(String size) {
        this.size = size;
        return this;
    }

    


    /**
     * 云硬盘大小，单位为GB。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    

    public Volumes withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    


    /**
     * 云硬盘类型。 目前支持“SSD”，“SAS”和“SATA”三种。 “SSD”为超高IO云硬盘， “SAS”为高IO云硬盘， “SATA”为普通IO云硬盘。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    

    public Volumes withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    


    /**
     * 是否加密。
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    

    public Volumes withMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
        return this;
    }

    


    /**
     * 是否为共享云硬盘。 true：表示为共享云硬盘。 false：表示为非共享云硬盘。
     * @return multiattach
     */
    public Boolean getMultiattach() {
        return multiattach;
    }

    public void setMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Volumes volumes = (Volumes) o;
        return Objects.equals(this.status, volumes.status) &&
            Objects.equals(this.availabilityZone, volumes.availabilityZone) &&
            Objects.equals(this.attachments, volumes.attachments) &&
            Objects.equals(this.size, volumes.size) &&
            Objects.equals(this.volumeType, volumes.volumeType) &&
            Objects.equals(this.encrypted, volumes.encrypted) &&
            Objects.equals(this.multiattach, volumes.multiattach);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, availabilityZone, attachments, size, volumeType, encrypted, multiattach);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Volumes {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
        sb.append("    multiattach: ").append(toIndentedString(multiattach)).append("\n");
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

