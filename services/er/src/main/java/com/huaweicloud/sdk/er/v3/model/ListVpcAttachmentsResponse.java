package com.huaweicloud.sdk.er.v3.model;

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
public class ListVpcAttachmentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_attachments")

    private List<VpcAttachmentDetails> vpcAttachments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListVpcAttachmentsResponse withVpcAttachments(List<VpcAttachmentDetails> vpcAttachments) {
        this.vpcAttachments = vpcAttachments;
        return this;
    }

    public ListVpcAttachmentsResponse addVpcAttachmentsItem(VpcAttachmentDetails vpcAttachmentsItem) {
        if (this.vpcAttachments == null) {
            this.vpcAttachments = new ArrayList<>();
        }
        this.vpcAttachments.add(vpcAttachmentsItem);
        return this;
    }

    public ListVpcAttachmentsResponse withVpcAttachments(Consumer<List<VpcAttachmentDetails>> vpcAttachmentsSetter) {
        if (this.vpcAttachments == null) {
            this.vpcAttachments = new ArrayList<>();
        }
        vpcAttachmentsSetter.accept(this.vpcAttachments);
        return this;
    }

    /**
     * VPC连接列表
     * @return vpcAttachments
     */
    public List<VpcAttachmentDetails> getVpcAttachments() {
        return vpcAttachments;
    }

    public void setVpcAttachments(List<VpcAttachmentDetails> vpcAttachments) {
        this.vpcAttachments = vpcAttachments;
    }

    public ListVpcAttachmentsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListVpcAttachmentsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListVpcAttachmentsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVpcAttachmentsResponse listVpcAttachmentsResponse = (ListVpcAttachmentsResponse) o;
        return Objects.equals(this.vpcAttachments, listVpcAttachmentsResponse.vpcAttachments)
            && Objects.equals(this.pageInfo, listVpcAttachmentsResponse.pageInfo)
            && Objects.equals(this.requestId, listVpcAttachmentsResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcAttachments, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpcAttachmentsResponse {\n");
        sb.append("    vpcAttachments: ").append(toIndentedString(vpcAttachments)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
