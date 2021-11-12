package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListVpcsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcs")

    private List<Vpc> vpcs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListVpcsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /** 请求ID
     * 
     * @return requestId */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListVpcsResponse withVpcs(List<Vpc> vpcs) {
        this.vpcs = vpcs;
        return this;
    }

    public ListVpcsResponse addVpcsItem(Vpc vpcsItem) {
        if (this.vpcs == null) {
            this.vpcs = new ArrayList<>();
        }
        this.vpcs.add(vpcsItem);
        return this;
    }

    public ListVpcsResponse withVpcs(Consumer<List<Vpc>> vpcsSetter) {
        if (this.vpcs == null) {
            this.vpcs = new ArrayList<>();
        }
        vpcsSetter.accept(this.vpcs);
        return this;
    }

    /** VPC列表响应体
     * 
     * @return vpcs */
    public List<Vpc> getVpcs() {
        return vpcs;
    }

    public void setVpcs(List<Vpc> vpcs) {
        this.vpcs = vpcs;
    }

    public ListVpcsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListVpcsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /** Get pageInfo
     * 
     * @return pageInfo */
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
        ListVpcsResponse listVpcsResponse = (ListVpcsResponse) o;
        return Objects.equals(this.requestId, listVpcsResponse.requestId)
            && Objects.equals(this.vpcs, listVpcsResponse.vpcs)
            && Objects.equals(this.pageInfo, listVpcsResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, vpcs, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpcsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    vpcs: ").append(toIndentedString(vpcs)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
