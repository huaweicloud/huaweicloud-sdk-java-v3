package com.huaweicloud.sdk.agentidentity.v1.model;

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
public class ListPolicyEngineAttachmentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachments")

    private List<PolicyEngineAttachmentSummary> attachments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListPolicyEngineAttachmentsResponse withAttachments(List<PolicyEngineAttachmentSummary> attachments) {
        this.attachments = attachments;
        return this;
    }

    public ListPolicyEngineAttachmentsResponse addAttachmentsItem(PolicyEngineAttachmentSummary attachmentsItem) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    public ListPolicyEngineAttachmentsResponse withAttachments(
        Consumer<List<PolicyEngineAttachmentSummary>> attachmentsSetter) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        attachmentsSetter.accept(this.attachments);
        return this;
    }

    /**
     * Get attachments
     * @return attachments
     */
    public List<PolicyEngineAttachmentSummary> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<PolicyEngineAttachmentSummary> attachments) {
        this.attachments = attachments;
    }

    public ListPolicyEngineAttachmentsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPolicyEngineAttachmentsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPolicyEngineAttachmentsResponse that = (ListPolicyEngineAttachmentsResponse) obj;
        return Objects.equals(this.attachments, that.attachments) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachments, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyEngineAttachmentsResponse {\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
