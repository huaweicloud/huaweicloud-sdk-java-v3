package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

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
public class ListAccessPreviewsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_previews")

    private List<AccessPreviewSummary> accessPreviews = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAccessPreviewsResponse withAccessPreviews(List<AccessPreviewSummary> accessPreviews) {
        this.accessPreviews = accessPreviews;
        return this;
    }

    public ListAccessPreviewsResponse addAccessPreviewsItem(AccessPreviewSummary accessPreviewsItem) {
        if (this.accessPreviews == null) {
            this.accessPreviews = new ArrayList<>();
        }
        this.accessPreviews.add(accessPreviewsItem);
        return this;
    }

    public ListAccessPreviewsResponse withAccessPreviews(Consumer<List<AccessPreviewSummary>> accessPreviewsSetter) {
        if (this.accessPreviews == null) {
            this.accessPreviews = new ArrayList<>();
        }
        accessPreviewsSetter.accept(this.accessPreviews);
        return this;
    }

    /**
     * Get accessPreviews
     * @return accessPreviews
     */
    public List<AccessPreviewSummary> getAccessPreviews() {
        return accessPreviews;
    }

    public void setAccessPreviews(List<AccessPreviewSummary> accessPreviews) {
        this.accessPreviews = accessPreviews;
    }

    public ListAccessPreviewsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAccessPreviewsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListAccessPreviewsResponse that = (ListAccessPreviewsResponse) obj;
        return Objects.equals(this.accessPreviews, that.accessPreviews) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessPreviews, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessPreviewsResponse {\n");
        sb.append("    accessPreviews: ").append(toIndentedString(accessPreviews)).append("\n");
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
