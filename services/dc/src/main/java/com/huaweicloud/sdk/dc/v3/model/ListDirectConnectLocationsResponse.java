package com.huaweicloud.sdk.dc.v3.model;

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
public class ListDirectConnectLocationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direct_connect_locations")

    private List<DirectConnectLocationEntry> directConnectLocations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListDirectConnectLocationsResponse withDirectConnectLocations(
        List<DirectConnectLocationEntry> directConnectLocations) {
        this.directConnectLocations = directConnectLocations;
        return this;
    }

    public ListDirectConnectLocationsResponse addDirectConnectLocationsItem(
        DirectConnectLocationEntry directConnectLocationsItem) {
        if (this.directConnectLocations == null) {
            this.directConnectLocations = new ArrayList<>();
        }
        this.directConnectLocations.add(directConnectLocationsItem);
        return this;
    }

    public ListDirectConnectLocationsResponse withDirectConnectLocations(
        Consumer<List<DirectConnectLocationEntry>> directConnectLocationsSetter) {
        if (this.directConnectLocations == null) {
            this.directConnectLocations = new ArrayList<>();
        }
        directConnectLocationsSetter.accept(this.directConnectLocations);
        return this;
    }

    /**
     * 专线接入点列表
     * @return directConnectLocations
     */
    public List<DirectConnectLocationEntry> getDirectConnectLocations() {
        return directConnectLocations;
    }

    public void setDirectConnectLocations(List<DirectConnectLocationEntry> directConnectLocations) {
        this.directConnectLocations = directConnectLocations;
    }

    public ListDirectConnectLocationsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListDirectConnectLocationsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListDirectConnectLocationsResponse withRequestId(String requestId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDirectConnectLocationsResponse that = (ListDirectConnectLocationsResponse) obj;
        return Objects.equals(this.directConnectLocations, that.directConnectLocations)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directConnectLocations, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDirectConnectLocationsResponse {\n");
        sb.append("    directConnectLocations: ").append(toIndentedString(directConnectLocations)).append("\n");
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
