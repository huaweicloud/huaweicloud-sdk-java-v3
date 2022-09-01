package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowServerBlockDeviceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeAttachment")

    @JacksonXmlProperty(localName = "volumeAttachment")

    private ServerBlockDevice volumeAttachment;

    public ShowServerBlockDeviceResponse withVolumeAttachment(ServerBlockDevice volumeAttachment) {
        this.volumeAttachment = volumeAttachment;
        return this;
    }

    public ShowServerBlockDeviceResponse withVolumeAttachment(Consumer<ServerBlockDevice> volumeAttachmentSetter) {
        if (this.volumeAttachment == null) {
            this.volumeAttachment = new ServerBlockDevice();
            volumeAttachmentSetter.accept(this.volumeAttachment);
        }

        return this;
    }

    /**
     * Get volumeAttachment
     * @return volumeAttachment
     */
    public ServerBlockDevice getVolumeAttachment() {
        return volumeAttachment;
    }

    public void setVolumeAttachment(ServerBlockDevice volumeAttachment) {
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
        ShowServerBlockDeviceResponse showServerBlockDeviceResponse = (ShowServerBlockDeviceResponse) o;
        return Objects.equals(this.volumeAttachment, showServerBlockDeviceResponse.volumeAttachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeAttachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerBlockDeviceResponse {\n");
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
