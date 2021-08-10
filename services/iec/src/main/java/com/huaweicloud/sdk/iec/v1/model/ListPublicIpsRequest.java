package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListPublicIpsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    public ListPublicIpsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 查询返回弹性IP列表数量。取值范围：0~1000。 minimum: 0 maximum: 1000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPublicIpsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 查询的偏移量。
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPublicIpsRequest withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /** 站点ID。
     * 
     * @return siteId */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public ListPublicIpsRequest withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /** 端口ID
     * 
     * @return portId */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPublicIpsRequest listPublicIpsRequest = (ListPublicIpsRequest) o;
        return Objects.equals(this.limit, listPublicIpsRequest.limit)
            && Objects.equals(this.offset, listPublicIpsRequest.offset)
            && Objects.equals(this.siteId, listPublicIpsRequest.siteId)
            && Objects.equals(this.portId, listPublicIpsRequest.portId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, siteId, portId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicIpsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
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
