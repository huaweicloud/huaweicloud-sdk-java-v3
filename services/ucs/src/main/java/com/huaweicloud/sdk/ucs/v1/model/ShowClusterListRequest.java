package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowClusterListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enablestatus")

    private Boolean enablestatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clustergroupid")

    private String clustergroupid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managetype")

    private String managetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterids")

    private String clusterids;

    public ShowClusterListRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 获取特定category的集群。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ShowClusterListRequest withEnablestatus(Boolean enablestatus) {
        this.enablestatus = enablestatus;
        return this;
    }

    /**
     * 是否获取集群的资源信息。不填或者填写为true为获取集群资源汇总信息，置为false为不获取集群状态信息；缺省值为true
     * @return enablestatus
     */
    public Boolean getEnablestatus() {
        return enablestatus;
    }

    public void setEnablestatus(Boolean enablestatus) {
        this.enablestatus = enablestatus;
    }

    public ShowClusterListRequest withClustergroupid(String clustergroupid) {
        this.clustergroupid = clustergroupid;
        return this;
    }

    /**
     * 容器舰队ID。不填会返回用户所有集群，填了之后会返回属于该容器舰队的集群。
     * @return clustergroupid
     */
    public String getClustergroupid() {
        return clustergroupid;
    }

    public void setClustergroupid(String clustergroupid) {
        this.clustergroupid = clustergroupid;
    }

    public ShowClusterListRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页获取列表时，页的大小，默认为-1
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowClusterListRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页获取列表时，起始偏移量，默认为0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowClusterListRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 分页获取列表时，排序参数，支持 create_at 和 update_at
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ShowClusterListRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 分页获取列表时，排序方向，支持 desc 和 asc
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ShowClusterListRequest withManagetype(String managetype) {
        this.managetype = managetype;
        return this;
    }

    /**
     * 获取集群列表时，根据集群类型筛选，不传参时默认为 all ，支持 all ，grouped，discrete 三种类型。 - grouped：在舰队中纳管的集群 - discrete：未加入舰队的集群 - all：所有集群
     * @return managetype
     */
    public String getManagetype() {
        return managetype;
    }

    public void setManagetype(String managetype) {
        this.managetype = managetype;
    }

    public ShowClusterListRequest withClusterids(String clusterids) {
        this.clusterids = clusterids;
        return this;
    }

    /**
     * 集群ID。多个ID以英文逗号分隔。
     * @return clusterids
     */
    public String getClusterids() {
        return clusterids;
    }

    public void setClusterids(String clusterids) {
        this.clusterids = clusterids;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterListRequest that = (ShowClusterListRequest) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.enablestatus, that.enablestatus)
            && Objects.equals(this.clustergroupid, that.clustergroupid) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.order, that.order) && Objects.equals(this.managetype, that.managetype)
            && Objects.equals(this.clusterids, that.clusterids);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(category, enablestatus, clustergroupid, limit, offset, orderBy, order, managetype, clusterids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterListRequest {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    enablestatus: ").append(toIndentedString(enablestatus)).append("\n");
        sb.append("    clustergroupid: ").append(toIndentedString(clustergroupid)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    managetype: ").append(toIndentedString(managetype)).append("\n");
        sb.append("    clusterids: ").append(toIndentedString(clusterids)).append("\n");
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
