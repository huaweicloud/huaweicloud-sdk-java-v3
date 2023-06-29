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
public class ListVirtualInterfacesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_interfaces")

    private List<VirtualInterface> virtualInterfaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListVirtualInterfacesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 操作请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListVirtualInterfacesResponse withVirtualInterfaces(List<VirtualInterface> virtualInterfaces) {
        this.virtualInterfaces = virtualInterfaces;
        return this;
    }

    public ListVirtualInterfacesResponse addVirtualInterfacesItem(VirtualInterface virtualInterfacesItem) {
        if (this.virtualInterfaces == null) {
            this.virtualInterfaces = new ArrayList<>();
        }
        this.virtualInterfaces.add(virtualInterfacesItem);
        return this;
    }

    public ListVirtualInterfacesResponse withVirtualInterfaces(
        Consumer<List<VirtualInterface>> virtualInterfacesSetter) {
        if (this.virtualInterfaces == null) {
            this.virtualInterfaces = new ArrayList<>();
        }
        virtualInterfacesSetter.accept(this.virtualInterfaces);
        return this;
    }

    /**
     * 虚拟接口对象
     * @return virtualInterfaces
     */
    public List<VirtualInterface> getVirtualInterfaces() {
        return virtualInterfaces;
    }

    public void setVirtualInterfaces(List<VirtualInterface> virtualInterfaces) {
        this.virtualInterfaces = virtualInterfaces;
    }

    public ListVirtualInterfacesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListVirtualInterfacesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListVirtualInterfacesResponse that = (ListVirtualInterfacesResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.virtualInterfaces, that.virtualInterfaces)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, virtualInterfaces, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVirtualInterfacesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    virtualInterfaces: ").append(toIndentedString(virtualInterfaces)).append("\n");
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
