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
public class ListAimResolveDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolve_details")

    private List<AIMResolveDetail> resolveDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private Page pageInfo;

    public ListAimResolveDetailsResponse withResolveDetails(List<AIMResolveDetail> resolveDetails) {
        this.resolveDetails = resolveDetails;
        return this;
    }

    public ListAimResolveDetailsResponse addResolveDetailsItem(AIMResolveDetail resolveDetailsItem) {
        if (this.resolveDetails == null) {
            this.resolveDetails = new ArrayList<>();
        }
        this.resolveDetails.add(resolveDetailsItem);
        return this;
    }

    public ListAimResolveDetailsResponse withResolveDetails(Consumer<List<AIMResolveDetail>> resolveDetailsSetter) {
        if (this.resolveDetails == null) {
            this.resolveDetails = new ArrayList<>();
        }
        resolveDetailsSetter.accept(this.resolveDetails);
        return this;
    }

    /**
     * 查询解析结果集。
     * @return resolveDetails
     */
    public List<AIMResolveDetail> getResolveDetails() {
        return resolveDetails;
    }

    public void setResolveDetails(List<AIMResolveDetail> resolveDetails) {
        this.resolveDetails = resolveDetails;
    }

    public ListAimResolveDetailsResponse withPageInfo(Page pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAimResolveDetailsResponse withPageInfo(Consumer<Page> pageInfoSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAimResolveDetailsResponse listAimResolveDetailsResponse = (ListAimResolveDetailsResponse) o;
        return Objects.equals(this.resolveDetails, listAimResolveDetailsResponse.resolveDetails)
            && Objects.equals(this.pageInfo, listAimResolveDetailsResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolveDetails, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAimResolveDetailsResponse {\n");
        sb.append("    resolveDetails: ").append(toIndentedString(resolveDetails)).append("\n");
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
