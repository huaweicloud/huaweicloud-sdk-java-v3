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
public class ListConnectionMonitorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_connection_id")

    private String vpnConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    public ListConnectionMonitorsRequest withVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }

    /**
     * VPN连接Id
     * @return vpnConnectionId
     */
    public String getVpnConnectionId() {
        return vpnConnectionId;
    }

    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    public ListConnectionMonitorsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListConnectionMonitorsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListConnectionMonitorsRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConnectionMonitorsRequest that = (ListConnectionMonitorsRequest) obj;
        return Objects.equals(this.vpnConnectionId, that.vpnConnectionId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnConnectionId, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConnectionMonitorsRequest {\n");
        sb.append("    vpnConnectionId: ").append(toIndentedString(vpnConnectionId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
