package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.BlockDeviceAttachableQuantity;
import com.huaweicloud.sdk.ecs.v2.model.ServerBlockDevice;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListServerBlockDevicesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attachableQuantity")
    
    private BlockDeviceAttachableQuantity attachableQuantity = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumeAttachments")
    
    private List<ServerBlockDevice> volumeAttachments = null;
    
    public ListServerBlockDevicesResponse withAttachableQuantity(BlockDeviceAttachableQuantity attachableQuantity) {
        this.attachableQuantity = attachableQuantity;
        return this;
    }

    public ListServerBlockDevicesResponse withAttachableQuantity(Consumer<BlockDeviceAttachableQuantity> attachableQuantitySetter) {
        if(this.attachableQuantity == null ){
            this.attachableQuantity = new BlockDeviceAttachableQuantity();
        }
        attachableQuantitySetter.accept(this.attachableQuantity);
        return this;
    }


    /**
     * Get attachableQuantity
     * @return attachableQuantity
     */
    public BlockDeviceAttachableQuantity getAttachableQuantity() {
        return attachableQuantity;
    }

    public void setAttachableQuantity(BlockDeviceAttachableQuantity attachableQuantity) {
        this.attachableQuantity = attachableQuantity;
    }

    public ListServerBlockDevicesResponse withVolumeAttachments(List<ServerBlockDevice> volumeAttachments) {
        this.volumeAttachments = volumeAttachments;
        return this;
    }

    
    public ListServerBlockDevicesResponse addVolumeAttachmentsItem(ServerBlockDevice volumeAttachmentsItem) {
        if (this.volumeAttachments == null) {
            this.volumeAttachments = new ArrayList<>();
        }
        this.volumeAttachments.add(volumeAttachmentsItem);
        return this;
    }

    public ListServerBlockDevicesResponse withVolumeAttachments(Consumer<List<ServerBlockDevice>> volumeAttachmentsSetter) {
        if(this.volumeAttachments == null ){
            this.volumeAttachments = new ArrayList<>();
        }
        volumeAttachmentsSetter.accept(this.volumeAttachments);
        return this;
    }

    /**
     * 云服务器挂载信息列表。
     * @return volumeAttachments
     */
    public List<ServerBlockDevice> getVolumeAttachments() {
        return volumeAttachments;
    }

    public void setVolumeAttachments(List<ServerBlockDevice> volumeAttachments) {
        this.volumeAttachments = volumeAttachments;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServerBlockDevicesResponse listServerBlockDevicesResponse = (ListServerBlockDevicesResponse) o;
        return Objects.equals(this.attachableQuantity, listServerBlockDevicesResponse.attachableQuantity) &&
            Objects.equals(this.volumeAttachments, listServerBlockDevicesResponse.volumeAttachments);
    }
    @Override
    public int hashCode() {
        return Objects.hash(attachableQuantity, volumeAttachments);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerBlockDevicesResponse {\n");
            sb.append("    attachableQuantity: ").append(toIndentedString(attachableQuantity)).append("\n");
            sb.append("    volumeAttachments: ").append(toIndentedString(volumeAttachments)).append("\n");
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

