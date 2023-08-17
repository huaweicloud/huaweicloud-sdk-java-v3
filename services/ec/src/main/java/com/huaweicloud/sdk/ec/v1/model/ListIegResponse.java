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
public class ListIegResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intelligent_enterprise_gateways")

    private List<IegItem> intelligentEnterpriseGateways = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListIegResponse withIntelligentEnterpriseGateways(List<IegItem> intelligentEnterpriseGateways) {
        this.intelligentEnterpriseGateways = intelligentEnterpriseGateways;
        return this;
    }

    public ListIegResponse addIntelligentEnterpriseGatewaysItem(IegItem intelligentEnterpriseGatewaysItem) {
        if (this.intelligentEnterpriseGateways == null) {
            this.intelligentEnterpriseGateways = new ArrayList<>();
        }
        this.intelligentEnterpriseGateways.add(intelligentEnterpriseGatewaysItem);
        return this;
    }

    public ListIegResponse withIntelligentEnterpriseGateways(
        Consumer<List<IegItem>> intelligentEnterpriseGatewaysSetter) {
        if (this.intelligentEnterpriseGateways == null) {
            this.intelligentEnterpriseGateways = new ArrayList<>();
        }
        intelligentEnterpriseGatewaysSetter.accept(this.intelligentEnterpriseGateways);
        return this;
    }

    /**
     * 智能企业网关列表
     * @return intelligentEnterpriseGateways
     */
    public List<IegItem> getIntelligentEnterpriseGateways() {
        return intelligentEnterpriseGateways;
    }

    public void setIntelligentEnterpriseGateways(List<IegItem> intelligentEnterpriseGateways) {
        this.intelligentEnterpriseGateways = intelligentEnterpriseGateways;
    }

    public ListIegResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListIegResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListIegResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 智能企业网关数量
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
        ListIegResponse that = (ListIegResponse) obj;
        return Objects.equals(this.intelligentEnterpriseGateways, that.intelligentEnterpriseGateways)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intelligentEnterpriseGateways, pageInfo, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIegResponse {\n");
        sb.append("    intelligentEnterpriseGateways: ")
            .append(toIndentedString(intelligentEnterpriseGateways))
            .append("\n");
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
