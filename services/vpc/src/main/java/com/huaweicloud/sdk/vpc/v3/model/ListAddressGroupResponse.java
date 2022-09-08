package com.huaweicloud.sdk.vpc.v3.model;

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
public class ListAddressGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_groups")

    private List<AddressGroup> addressGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAddressGroupResponse withRequestId(String requestId) {
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

    public ListAddressGroupResponse withAddressGroups(List<AddressGroup> addressGroups) {
        this.addressGroups = addressGroups;
        return this;
    }

    public ListAddressGroupResponse addAddressGroupsItem(AddressGroup addressGroupsItem) {
        if (this.addressGroups == null) {
            this.addressGroups = new ArrayList<>();
        }
        this.addressGroups.add(addressGroupsItem);
        return this;
    }

    public ListAddressGroupResponse withAddressGroups(Consumer<List<AddressGroup>> addressGroupsSetter) {
        if (this.addressGroups == null) {
            this.addressGroups = new ArrayList<>();
        }
        addressGroupsSetter.accept(this.addressGroups);
        return this;
    }

    /**
     * 地址组列表响应体
     * @return addressGroups
     */
    public List<AddressGroup> getAddressGroups() {
        return addressGroups;
    }

    public void setAddressGroups(List<AddressGroup> addressGroups) {
        this.addressGroups = addressGroups;
    }

    public ListAddressGroupResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAddressGroupResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAddressGroupResponse listAddressGroupResponse = (ListAddressGroupResponse) o;
        return Objects.equals(this.requestId, listAddressGroupResponse.requestId)
            && Objects.equals(this.addressGroups, listAddressGroupResponse.addressGroups)
            && Objects.equals(this.pageInfo, listAddressGroupResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, addressGroups, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAddressGroupResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    addressGroups: ").append(toIndentedString(addressGroups)).append("\n");
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
