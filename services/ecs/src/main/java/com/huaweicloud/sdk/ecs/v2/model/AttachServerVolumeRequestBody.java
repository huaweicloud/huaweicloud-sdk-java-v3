package com.huaweicloud.sdk.ecs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.AttachServerVolumeOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class AttachServerVolumeRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumeAttachment")
    
    private AttachServerVolumeOption volumeAttachment;

    public AttachServerVolumeRequestBody withVolumeAttachment(AttachServerVolumeOption volumeAttachment) {
        this.volumeAttachment = volumeAttachment;
        return this;
    }

    public AttachServerVolumeRequestBody withVolumeAttachment(Consumer<AttachServerVolumeOption> volumeAttachmentSetter) {
        if(this.volumeAttachment == null ){
            this.volumeAttachment = new AttachServerVolumeOption();
            volumeAttachmentSetter.accept(this.volumeAttachment);
        }
        
        return this;
    }


    /**
     * Get volumeAttachment
     * @return volumeAttachment
     */
    public AttachServerVolumeOption getVolumeAttachment() {
        return volumeAttachment;
    }

    public void setVolumeAttachment(AttachServerVolumeOption volumeAttachment) {
        this.volumeAttachment = volumeAttachment;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttachServerVolumeRequestBody attachServerVolumeRequestBody = (AttachServerVolumeRequestBody) o;
        return Objects.equals(this.volumeAttachment, attachServerVolumeRequestBody.volumeAttachment);
    }
    @Override
    public int hashCode() {
        return Objects.hash(volumeAttachment);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachServerVolumeRequestBody {\n");
        sb.append("    volumeAttachment: ").append(toIndentedString(volumeAttachment)).append("\n");
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

