package com.huaweicloud.sdk.ec.v1.model;

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
public class ListEcnResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_connect_networks")

    private List<EcnItem> enterpriseConnectNetworks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListEcnResponse withEnterpriseConnectNetworks(List<EcnItem> enterpriseConnectNetworks) {
        this.enterpriseConnectNetworks = enterpriseConnectNetworks;
        return this;
    }

    public ListEcnResponse addEnterpriseConnectNetworksItem(EcnItem enterpriseConnectNetworksItem) {
        if (this.enterpriseConnectNetworks == null) {
            this.enterpriseConnectNetworks = new ArrayList<>();
        }
        this.enterpriseConnectNetworks.add(enterpriseConnectNetworksItem);
        return this;
    }

    public ListEcnResponse withEnterpriseConnectNetworks(Consumer<List<EcnItem>> enterpriseConnectNetworksSetter) {
        if (this.enterpriseConnectNetworks == null) {
            this.enterpriseConnectNetworks = new ArrayList<>();
        }
        enterpriseConnectNetworksSetter.accept(this.enterpriseConnectNetworks);
        return this;
    }

    /**
     * 企业连接网络列表
     * @return enterpriseConnectNetworks
     */
    public List<EcnItem> getEnterpriseConnectNetworks() {
        return enterpriseConnectNetworks;
    }

    public void setEnterpriseConnectNetworks(List<EcnItem> enterpriseConnectNetworks) {
        this.enterpriseConnectNetworks = enterpriseConnectNetworks;
    }

    public ListEcnResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListEcnResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListEcnResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 企业连接网络数量
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEcnResponse that = (ListEcnResponse) obj;
        return Objects.equals(this.enterpriseConnectNetworks, that.enterpriseConnectNetworks)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseConnectNetworks, pageInfo, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEcnResponse {\n");
        sb.append("    enterpriseConnectNetworks: ").append(toIndentedString(enterpriseConnectNetworks)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
