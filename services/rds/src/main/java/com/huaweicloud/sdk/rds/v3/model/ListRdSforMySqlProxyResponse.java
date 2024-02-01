package com.huaweicloud.sdk.rds.v3.model;

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
public class ListRdSforMySqlProxyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_query_info_list")

    private List<QueryProxyResponseV3> proxyQueryInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_proxy_num")

    private Integer maxProxyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_proxy_node_num")

    private Integer maxProxyNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_balance_route_mode_for_favored_version")

    private Boolean supportBalanceRouteModeForFavoredVersion;

    public ListRdSforMySqlProxyResponse withProxyQueryInfoList(List<QueryProxyResponseV3> proxyQueryInfoList) {
        this.proxyQueryInfoList = proxyQueryInfoList;
        return this;
    }

    public ListRdSforMySqlProxyResponse addProxyQueryInfoListItem(QueryProxyResponseV3 proxyQueryInfoListItem) {
        if (this.proxyQueryInfoList == null) {
            this.proxyQueryInfoList = new ArrayList<>();
        }
        this.proxyQueryInfoList.add(proxyQueryInfoListItem);
        return this;
    }

    public ListRdSforMySqlProxyResponse withProxyQueryInfoList(
        Consumer<List<QueryProxyResponseV3>> proxyQueryInfoListSetter) {
        if (this.proxyQueryInfoList == null) {
            this.proxyQueryInfoList = new ArrayList<>();
        }
        proxyQueryInfoListSetter.accept(this.proxyQueryInfoList);
        return this;
    }

    /**
     * 数据库实例下的数据库代理信息列表。
     * @return proxyQueryInfoList
     */
    public List<QueryProxyResponseV3> getProxyQueryInfoList() {
        return proxyQueryInfoList;
    }

    public void setProxyQueryInfoList(List<QueryProxyResponseV3> proxyQueryInfoList) {
        this.proxyQueryInfoList = proxyQueryInfoList;
    }

    public ListRdSforMySqlProxyResponse withMaxProxyNum(Integer maxProxyNum) {
        this.maxProxyNum = maxProxyNum;
        return this;
    }

    /**
     * 支持同时开启的数据库代理的最大数量。
     * @return maxProxyNum
     */
    public Integer getMaxProxyNum() {
        return maxProxyNum;
    }

    public void setMaxProxyNum(Integer maxProxyNum) {
        this.maxProxyNum = maxProxyNum;
    }

    public ListRdSforMySqlProxyResponse withMaxProxyNodeNum(Integer maxProxyNodeNum) {
        this.maxProxyNodeNum = maxProxyNodeNum;
        return this;
    }

    /**
     * 单个数据库代理支持选择的代理节点的最大数量。
     * @return maxProxyNodeNum
     */
    public Integer getMaxProxyNodeNum() {
        return maxProxyNodeNum;
    }

    public void setMaxProxyNodeNum(Integer maxProxyNodeNum) {
        this.maxProxyNodeNum = maxProxyNodeNum;
    }

    public ListRdSforMySqlProxyResponse withSupportBalanceRouteModeForFavoredVersion(
        Boolean supportBalanceRouteModeForFavoredVersion) {
        this.supportBalanceRouteModeForFavoredVersion = supportBalanceRouteModeForFavoredVersion;
        return this;
    }

    /**
     * 是否支持创建数据库代理时设置负载均衡路由模式。
     * @return supportBalanceRouteModeForFavoredVersion
     */
    public Boolean getSupportBalanceRouteModeForFavoredVersion() {
        return supportBalanceRouteModeForFavoredVersion;
    }

    public void setSupportBalanceRouteModeForFavoredVersion(Boolean supportBalanceRouteModeForFavoredVersion) {
        this.supportBalanceRouteModeForFavoredVersion = supportBalanceRouteModeForFavoredVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRdSforMySqlProxyResponse that = (ListRdSforMySqlProxyResponse) obj;
        return Objects.equals(this.proxyQueryInfoList, that.proxyQueryInfoList)
            && Objects.equals(this.maxProxyNum, that.maxProxyNum)
            && Objects.equals(this.maxProxyNodeNum, that.maxProxyNodeNum) && Objects
                .equals(this.supportBalanceRouteModeForFavoredVersion, that.supportBalanceRouteModeForFavoredVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proxyQueryInfoList, maxProxyNum, maxProxyNodeNum, supportBalanceRouteModeForFavoredVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRdSforMySqlProxyResponse {\n");
        sb.append("    proxyQueryInfoList: ").append(toIndentedString(proxyQueryInfoList)).append("\n");
        sb.append("    maxProxyNum: ").append(toIndentedString(maxProxyNum)).append("\n");
        sb.append("    maxProxyNodeNum: ").append(toIndentedString(maxProxyNodeNum)).append("\n");
        sb.append("    supportBalanceRouteModeForFavoredVersion: ")
            .append(toIndentedString(supportBalanceRouteModeForFavoredVersion))
            .append("\n");
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
