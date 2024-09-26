package com.huaweicloud.sdk.cc.v3.model;

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
public class ListAuthorisationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorisations")

    private List<Authorisation> authorisations = null;

    public ListAuthorisationsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListAuthorisationsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAuthorisationsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListAuthorisationsResponse withAuthorisations(List<Authorisation> authorisations) {
        this.authorisations = authorisations;
        return this;
    }

    public ListAuthorisationsResponse addAuthorisationsItem(Authorisation authorisationsItem) {
        if (this.authorisations == null) {
            this.authorisations = new ArrayList<>();
        }
        this.authorisations.add(authorisationsItem);
        return this;
    }

    public ListAuthorisationsResponse withAuthorisations(Consumer<List<Authorisation>> authorisationsSetter) {
        if (this.authorisations == null) {
            this.authorisations = new ArrayList<>();
        }
        authorisationsSetter.accept(this.authorisations);
        return this;
    }

    /**
     * 授权实例列表。
     * @return authorisations
     */
    public List<Authorisation> getAuthorisations() {
        return authorisations;
    }

    public void setAuthorisations(List<Authorisation> authorisations) {
        this.authorisations = authorisations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuthorisationsResponse that = (ListAuthorisationsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.authorisations, that.authorisations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, authorisations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthorisationsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    authorisations: ").append(toIndentedString(authorisations)).append("\n");
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
