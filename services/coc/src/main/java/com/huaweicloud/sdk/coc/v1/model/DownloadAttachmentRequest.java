package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DownloadAttachmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_type")

    private String ticketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_id")

    private String docId;

    public DownloadAttachmentRequest withTicketType(String ticketType) {
        this.ticketType = ticketType;
        return this;
    }

    /**
     * **参数解释：** 工单类型，此处传递固定值incident。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ticketType
     */
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public DownloadAttachmentRequest withDocId(String docId) {
        this.docId = docId;
        return this;
    }

    /**
     * **参数解释：** 需要下载的文件唯一ID。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return docId
     */
    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadAttachmentRequest that = (DownloadAttachmentRequest) obj;
        return Objects.equals(this.ticketType, that.ticketType) && Objects.equals(this.docId, that.docId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketType, docId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadAttachmentRequest {\n");
        sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
        sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
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
