package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.VolumeAttachment;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 裸金属服务器挂载云硬盘接口请求结构体
 */
public class AttachVolumeBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumeAttachment")
    
    private VolumeAttachment volumeAttachment = null;

    public AttachVolumeBody withVolumeAttachment(VolumeAttachment volumeAttachment) {
        this.volumeAttachment = volumeAttachment;
        return this;
    }

    public AttachVolumeBody withVolumeAttachment(Consumer<VolumeAttachment> volumeAttachmentSetter) {
        if(this.volumeAttachment == null ){
            this.volumeAttachment = new VolumeAttachment();
            volumeAttachmentSetter.accept(this.volumeAttachment);
        }
        
        return this;
    }


    /**
     * Get volumeAttachment
     * @return volumeAttachment
     */
    public VolumeAttachment getVolumeAttachment() {
        return volumeAttachment;
    }

    public void setVolumeAttachment(VolumeAttachment volumeAttachment) {
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
        AttachVolumeBody attachVolumeBody = (AttachVolumeBody) o;
        return Objects.equals(this.volumeAttachment, attachVolumeBody.volumeAttachment);
    }
    @Override
    public int hashCode() {
        return Objects.hash(volumeAttachment);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachVolumeBody {\n");
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

