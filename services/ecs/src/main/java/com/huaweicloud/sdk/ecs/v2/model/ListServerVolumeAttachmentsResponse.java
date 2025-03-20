package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListServerVolumeAttachmentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeAttachments")

    private List<ServerVolumeAttachment> volumeAttachments = null;

    public ListServerVolumeAttachmentsResponse withVolumeAttachments(List<ServerVolumeAttachment> volumeAttachments) {
        this.volumeAttachments = volumeAttachments;
        return this;
    }

    public ListServerVolumeAttachmentsResponse addVolumeAttachmentsItem(ServerVolumeAttachment volumeAttachmentsItem) {
        if (this.volumeAttachments == null) {
            this.volumeAttachments = new ArrayList<>();
        }
        this.volumeAttachments.add(volumeAttachmentsItem);
        return this;
    }

    public ListServerVolumeAttachmentsResponse withVolumeAttachments(
        Consumer<List<ServerVolumeAttachment>> volumeAttachmentsSetter) {
        if (this.volumeAttachments == null) {
            this.volumeAttachments = new ArrayList<>();
        }
        volumeAttachmentsSetter.accept(this.volumeAttachments);
        return this;
    }

    /**
     * 云服务器挂载信息列表
     * @return volumeAttachments
     */
    public List<ServerVolumeAttachment> getVolumeAttachments() {
        return volumeAttachments;
    }

    public void setVolumeAttachments(List<ServerVolumeAttachment> volumeAttachments) {
        this.volumeAttachments = volumeAttachments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServerVolumeAttachmentsResponse that = (ListServerVolumeAttachmentsResponse) obj;
        return Objects.equals(this.volumeAttachments, that.volumeAttachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeAttachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerVolumeAttachmentsResponse {\n");
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
