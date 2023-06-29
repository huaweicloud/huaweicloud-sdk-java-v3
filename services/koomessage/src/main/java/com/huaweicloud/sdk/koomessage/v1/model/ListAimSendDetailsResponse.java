package com.huaweicloud.sdk.koomessage.v1.model;

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
public class ListAimSendDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_details")

    private List<AIMSendDetail> sendDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private Page pageInfo;

    public ListAimSendDetailsResponse withSendDetails(List<AIMSendDetail> sendDetails) {
        this.sendDetails = sendDetails;
        return this;
    }

    public ListAimSendDetailsResponse addSendDetailsItem(AIMSendDetail sendDetailsItem) {
        if (this.sendDetails == null) {
            this.sendDetails = new ArrayList<>();
        }
        this.sendDetails.add(sendDetailsItem);
        return this;
    }

    public ListAimSendDetailsResponse withSendDetails(Consumer<List<AIMSendDetail>> sendDetailsSetter) {
        if (this.sendDetails == null) {
            this.sendDetails = new ArrayList<>();
        }
        sendDetailsSetter.accept(this.sendDetails);
        return this;
    }

    /**
     * 查询发送明细结果集。
     * @return sendDetails
     */
    public List<AIMSendDetail> getSendDetails() {
        return sendDetails;
    }

    public void setSendDetails(List<AIMSendDetail> sendDetails) {
        this.sendDetails = sendDetails;
    }

    public ListAimSendDetailsResponse withPageInfo(Page pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAimSendDetailsResponse withPageInfo(Consumer<Page> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new Page();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public Page getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(Page pageInfo) {
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
        ListAimSendDetailsResponse that = (ListAimSendDetailsResponse) obj;
        return Objects.equals(this.sendDetails, that.sendDetails) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sendDetails, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAimSendDetailsResponse {\n");
        sb.append("    sendDetails: ").append(toIndentedString(sendDetails)).append("\n");
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
