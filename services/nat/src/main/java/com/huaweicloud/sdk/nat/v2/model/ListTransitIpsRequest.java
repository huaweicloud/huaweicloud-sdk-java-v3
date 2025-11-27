package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListTransitIpsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_interface_id")

    private List<String> networkInterfaceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private List<String> ipAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private List<String> gatewayId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private List<String> virsubnetId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_subnet_id")

    private List<String> transitSubnetId = null;

    public ListTransitIpsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 功能说明：每页返回的个数。 取值范围：1~2000。 默认值：2000。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTransitIpsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 功能说明：分页查询起始的资源ID，为空时查询第一页。 值从上一次查询的PageInfo中的next_marker或者previous_marker中获取。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListTransitIpsRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * 是否查询前一页。
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListTransitIpsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListTransitIpsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListTransitIpsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 中转IP的ID。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListTransitIpsRequest withNetworkInterfaceId(List<String> networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    public ListTransitIpsRequest addNetworkInterfaceIdItem(String networkInterfaceIdItem) {
        if (this.networkInterfaceId == null) {
            this.networkInterfaceId = new ArrayList<>();
        }
        this.networkInterfaceId.add(networkInterfaceIdItem);
        return this;
    }

    public ListTransitIpsRequest withNetworkInterfaceId(Consumer<List<String>> networkInterfaceIdSetter) {
        if (this.networkInterfaceId == null) {
            this.networkInterfaceId = new ArrayList<>();
        }
        networkInterfaceIdSetter.accept(this.networkInterfaceId);
        return this;
    }

    /**
     * 中转IP的网络接口ID。
     * @return networkInterfaceId
     */
    public List<String> getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    public void setNetworkInterfaceId(List<String> networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    public ListTransitIpsRequest withIpAddress(List<String> ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public ListTransitIpsRequest addIpAddressItem(String ipAddressItem) {
        if (this.ipAddress == null) {
            this.ipAddress = new ArrayList<>();
        }
        this.ipAddress.add(ipAddressItem);
        return this;
    }

    public ListTransitIpsRequest withIpAddress(Consumer<List<String>> ipAddressSetter) {
        if (this.ipAddress == null) {
            this.ipAddress = new ArrayList<>();
        }
        ipAddressSetter.accept(this.ipAddress);
        return this;
    }

    /**
     * 中转IP地址。
     * @return ipAddress
     */
    public List<String> getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(List<String> ipAddress) {
        this.ipAddress = ipAddress;
    }

    public ListTransitIpsRequest withGatewayId(List<String> gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    public ListTransitIpsRequest addGatewayIdItem(String gatewayIdItem) {
        if (this.gatewayId == null) {
            this.gatewayId = new ArrayList<>();
        }
        this.gatewayId.add(gatewayIdItem);
        return this;
    }

    public ListTransitIpsRequest withGatewayId(Consumer<List<String>> gatewayIdSetter) {
        if (this.gatewayId == null) {
            this.gatewayId = new ArrayList<>();
        }
        gatewayIdSetter.accept(this.gatewayId);
        return this;
    }

    /**
     * 中转IP绑定的私网NAT网关实例的ID。
     * @return gatewayId
     */
    public List<String> getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(List<String> gatewayId) {
        this.gatewayId = gatewayId;
    }

    public ListTransitIpsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListTransitIpsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListTransitIpsRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 企业项目ID。创建中转IP时，关联的企业项目ID。
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListTransitIpsRequest withVirsubnetId(List<String> virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    public ListTransitIpsRequest addVirsubnetIdItem(String virsubnetIdItem) {
        if (this.virsubnetId == null) {
            this.virsubnetId = new ArrayList<>();
        }
        this.virsubnetId.add(virsubnetIdItem);
        return this;
    }

    public ListTransitIpsRequest withVirsubnetId(Consumer<List<String>> virsubnetIdSetter) {
        if (this.virsubnetId == null) {
            this.virsubnetId = new ArrayList<>();
        }
        virsubnetIdSetter.accept(this.virsubnetId);
        return this;
    }

    /**
     * 当前租户子网的ID。
     * @return virsubnetId
     */
    public List<String> getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(List<String> virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public ListTransitIpsRequest withTransitSubnetId(List<String> transitSubnetId) {
        this.transitSubnetId = transitSubnetId;
        return this;
    }

    public ListTransitIpsRequest addTransitSubnetIdItem(String transitSubnetIdItem) {
        if (this.transitSubnetId == null) {
            this.transitSubnetId = new ArrayList<>();
        }
        this.transitSubnetId.add(transitSubnetIdItem);
        return this;
    }

    public ListTransitIpsRequest withTransitSubnetId(Consumer<List<String>> transitSubnetIdSetter) {
        if (this.transitSubnetId == null) {
            this.transitSubnetId = new ArrayList<>();
        }
        transitSubnetIdSetter.accept(this.transitSubnetId);
        return this;
    }

    /**
     * 中转子网的ID。
     * @return transitSubnetId
     */
    public List<String> getTransitSubnetId() {
        return transitSubnetId;
    }

    public void setTransitSubnetId(List<String> transitSubnetId) {
        this.transitSubnetId = transitSubnetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTransitIpsRequest that = (ListTransitIpsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.pageReverse, that.pageReverse) && Objects.equals(this.id, that.id)
            && Objects.equals(this.networkInterfaceId, that.networkInterfaceId)
            && Objects.equals(this.ipAddress, that.ipAddress) && Objects.equals(this.gatewayId, that.gatewayId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.virsubnetId, that.virsubnetId)
            && Objects.equals(this.transitSubnetId, that.transitSubnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            marker,
            pageReverse,
            id,
            networkInterfaceId,
            ipAddress,
            gatewayId,
            enterpriseProjectId,
            virsubnetId,
            transitSubnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTransitIpsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    transitSubnetId: ").append(toIndentedString(transitSubnetId)).append("\n");
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
