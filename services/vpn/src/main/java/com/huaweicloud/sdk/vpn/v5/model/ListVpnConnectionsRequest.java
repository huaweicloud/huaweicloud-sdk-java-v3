package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListVpnConnectionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_id")

    private String vpnId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_id")

    private String eipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_ip")

    private String vgwIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_id")

    private String vgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListVpnConnectionsRequest withVpnId(String vpnId) {
        this.vpnId = vpnId;
        return this;
    }

    /**
     * VPN ID
     * @return vpnId
     */
    public String getVpnId() {
        return vpnId;
    }

    public void setVpnId(String vpnId) {
        this.vpnId = vpnId;
    }

    public ListVpnConnectionsRequest withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    /**
     * Eip ID
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public ListVpnConnectionsRequest withVgwIp(String vgwIp) {
        this.vgwIp = vgwIp;
        return this;
    }

    /**
     * VGW IP
     * @return vgwIp
     */
    public String getVgwIp() {
        return vgwIp;
    }

    public void setVgwIp(String vgwIp) {
        this.vgwIp = vgwIp;
    }

    public ListVpnConnectionsRequest withVgwId(String vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    /**
     * vgw ID
     * @return vgwId
     */
    public String getVgwId() {
        return vgwId;
    }

    public void setVgwId(String vgwId) {
        this.vgwId = vgwId;
    }

    public ListVpnConnectionsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListVpnConnectionsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListVpnConnectionsRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListVpnConnectionsRequest withLimit(Integer limit) {
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

    public ListVpnConnectionsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一页最后一条记录的id，为空时为查询第一页。使用说明：必须与limit一起使用。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVpnConnectionsRequest that = (ListVpnConnectionsRequest) obj;
        return Objects.equals(this.vpnId, that.vpnId) && Objects.equals(this.eipId, that.eipId)
            && Objects.equals(this.vgwIp, that.vgwIp) && Objects.equals(this.vgwId, that.vgwId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnId, eipId, vgwIp, vgwId, enterpriseProjectId, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpnConnectionsRequest {\n");
        sb.append("    vpnId: ").append(toIndentedString(vpnId)).append("\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
        sb.append("    vgwIp: ").append(toIndentedString(vgwIp)).append("\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
