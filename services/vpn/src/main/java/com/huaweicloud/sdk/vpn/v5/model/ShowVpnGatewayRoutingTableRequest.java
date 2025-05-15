package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowVpnGatewayRoutingTableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_id")

    private String vgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_include_nexthop_resource")

    private Boolean isIncludeNexthopResource;

    public ShowVpnGatewayRoutingTableRequest withVgwId(String vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    /**
     * VPN网关实例ID
     * @return vgwId
     */
    public String getVgwId() {
        return vgwId;
    }

    public void setVgwId(String vgwId) {
        this.vgwId = vgwId;
    }

    public ShowVpnGatewayRoutingTableRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询时每页返回的记录数量
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowVpnGatewayRoutingTableRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一页最后一条资源记录的创建时间，为空时为查询第一页。使用说明：必须与limit一起使用。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ShowVpnGatewayRoutingTableRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询的偏移量
     * minimum: 0
     * maximum: 3000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowVpnGatewayRoutingTableRequest withIsIncludeNexthopResource(Boolean isIncludeNexthopResource) {
        this.isIncludeNexthopResource = isIncludeNexthopResource;
        return this;
    }

    /**
     * 是否包含下一跳资源信息
     * @return isIncludeNexthopResource
     */
    public Boolean getIsIncludeNexthopResource() {
        return isIncludeNexthopResource;
    }

    public void setIsIncludeNexthopResource(Boolean isIncludeNexthopResource) {
        this.isIncludeNexthopResource = isIncludeNexthopResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVpnGatewayRoutingTableRequest that = (ShowVpnGatewayRoutingTableRequest) obj;
        return Objects.equals(this.vgwId, that.vgwId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.isIncludeNexthopResource, that.isIncludeNexthopResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vgwId, limit, marker, offset, isIncludeNexthopResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVpnGatewayRoutingTableRequest {\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    isIncludeNexthopResource: ").append(toIndentedString(isIncludeNexthopResource)).append("\n");
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
