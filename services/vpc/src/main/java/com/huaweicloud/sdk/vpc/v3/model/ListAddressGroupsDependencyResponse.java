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
public class ListAddressGroupsDependencyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_groups")

    private List<AddressGroupDependency> addressGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAddressGroupsDependencyResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**： 请求ID。 **取值范围**： 不涉及。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListAddressGroupsDependencyResponse withAddressGroups(List<AddressGroupDependency> addressGroups) {
        this.addressGroups = addressGroups;
        return this;
    }

    public ListAddressGroupsDependencyResponse addAddressGroupsItem(AddressGroupDependency addressGroupsItem) {
        if (this.addressGroups == null) {
            this.addressGroups = new ArrayList<>();
        }
        this.addressGroups.add(addressGroupsItem);
        return this;
    }

    public ListAddressGroupsDependencyResponse withAddressGroups(
        Consumer<List<AddressGroupDependency>> addressGroupsSetter) {
        if (this.addressGroups == null) {
            this.addressGroups = new ArrayList<>();
        }
        addressGroupsSetter.accept(this.addressGroups);
        return this;
    }

    /**
     * **参数解释**： 查询地址组的关联资源的响应体。 **取值范围**： 不涉及。
     * @return addressGroups
     */
    public List<AddressGroupDependency> getAddressGroups() {
        return addressGroups;
    }

    public void setAddressGroups(List<AddressGroupDependency> addressGroups) {
        this.addressGroups = addressGroups;
    }

    public ListAddressGroupsDependencyResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAddressGroupsDependencyResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListAddressGroupsDependencyResponse that = (ListAddressGroupsDependencyResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.addressGroups, that.addressGroups)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, addressGroups, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAddressGroupsDependencyResponse {\n");
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
