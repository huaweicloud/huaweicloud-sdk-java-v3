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
public class ListPrivateDnatsRequest {

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
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private List<String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private List<String> gatewayId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip_id")

    private List<String> transitIpId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_interface_id")

    private List<String> networkInterfaceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip_address")

    private List<String> privateIpAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private List<String> protocol = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_service_port")

    private List<String> internalServicePort = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_service_port")

    private List<String> transitServicePort = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip_address")

    private List<String> transitIpAddress = null;

    public ListPrivateDnatsRequest withLimit(Integer limit) {
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

    public ListPrivateDnatsRequest withMarker(String marker) {
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

    public ListPrivateDnatsRequest withPageReverse(Boolean pageReverse) {
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

    public ListPrivateDnatsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListPrivateDnatsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListPrivateDnatsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * DNAT规则的ID。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListPrivateDnatsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListPrivateDnatsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListPrivateDnatsRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 企业项目ID。创建DNAT规则时，关联的企业项目ID。
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListPrivateDnatsRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListPrivateDnatsRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListPrivateDnatsRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * DNAT规则的描述。长度范围小于等于255个字符，不能包含“<”和“>”。
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListPrivateDnatsRequest withGatewayId(List<String> gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    public ListPrivateDnatsRequest addGatewayIdItem(String gatewayIdItem) {
        if (this.gatewayId == null) {
            this.gatewayId = new ArrayList<>();
        }
        this.gatewayId.add(gatewayIdItem);
        return this;
    }

    public ListPrivateDnatsRequest withGatewayId(Consumer<List<String>> gatewayIdSetter) {
        if (this.gatewayId == null) {
            this.gatewayId = new ArrayList<>();
        }
        gatewayIdSetter.accept(this.gatewayId);
        return this;
    }

    /**
     * 私网NAT网关实例的ID。
     * @return gatewayId
     */
    public List<String> getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(List<String> gatewayId) {
        this.gatewayId = gatewayId;
    }

    public ListPrivateDnatsRequest withTransitIpId(List<String> transitIpId) {
        this.transitIpId = transitIpId;
        return this;
    }

    public ListPrivateDnatsRequest addTransitIpIdItem(String transitIpIdItem) {
        if (this.transitIpId == null) {
            this.transitIpId = new ArrayList<>();
        }
        this.transitIpId.add(transitIpIdItem);
        return this;
    }

    public ListPrivateDnatsRequest withTransitIpId(Consumer<List<String>> transitIpIdSetter) {
        if (this.transitIpId == null) {
            this.transitIpId = new ArrayList<>();
        }
        transitIpIdSetter.accept(this.transitIpId);
        return this;
    }

    /**
     * 中转IP的ID。
     * @return transitIpId
     */
    public List<String> getTransitIpId() {
        return transitIpId;
    }

    public void setTransitIpId(List<String> transitIpId) {
        this.transitIpId = transitIpId;
    }

    public ListPrivateDnatsRequest withNetworkInterfaceId(List<String> networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    public ListPrivateDnatsRequest addNetworkInterfaceIdItem(String networkInterfaceIdItem) {
        if (this.networkInterfaceId == null) {
            this.networkInterfaceId = new ArrayList<>();
        }
        this.networkInterfaceId.add(networkInterfaceIdItem);
        return this;
    }

    public ListPrivateDnatsRequest withNetworkInterfaceId(Consumer<List<String>> networkInterfaceIdSetter) {
        if (this.networkInterfaceId == null) {
            this.networkInterfaceId = new ArrayList<>();
        }
        networkInterfaceIdSetter.accept(this.networkInterfaceId);
        return this;
    }

    /**
     * 计算实例、ELBV2、ELBV3、VIP等资源的端口ID。
     * @return networkInterfaceId
     */
    public List<String> getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    public void setNetworkInterfaceId(List<String> networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    public ListPrivateDnatsRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ListPrivateDnatsRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListPrivateDnatsRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * DNAT规则后端的类型。 取值：     COMPUTE：后端为计算实例。     VIP：后端为VIP的实例。     ELB：后端为ELBv2的实例。     ELBv3：后端为ELBv3的实例。     CUSTOMIZE：后端为自定义IP。
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public ListPrivateDnatsRequest withPrivateIpAddress(List<String> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public ListPrivateDnatsRequest addPrivateIpAddressItem(String privateIpAddressItem) {
        if (this.privateIpAddress == null) {
            this.privateIpAddress = new ArrayList<>();
        }
        this.privateIpAddress.add(privateIpAddressItem);
        return this;
    }

    public ListPrivateDnatsRequest withPrivateIpAddress(Consumer<List<String>> privateIpAddressSetter) {
        if (this.privateIpAddress == null) {
            this.privateIpAddress = new ArrayList<>();
        }
        privateIpAddressSetter.accept(this.privateIpAddress);
        return this;
    }

    /**
     * 后端资源（计算实例、ELBV2、ELBV3、VIP等）的私网IP地址。
     * @return privateIpAddress
     */
    public List<String> getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(List<String> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public ListPrivateDnatsRequest withProtocol(List<String> protocol) {
        this.protocol = protocol;
        return this;
    }

    public ListPrivateDnatsRequest addProtocolItem(String protocolItem) {
        if (this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        this.protocol.add(protocolItem);
        return this;
    }

    public ListPrivateDnatsRequest withProtocol(Consumer<List<String>> protocolSetter) {
        if (this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        protocolSetter.accept(this.protocol);
        return this;
    }

    /**
     * DNAT规则协议类型， 目前支持TCP/tcp/Tcp/tCp/tcP/TCp/tCP/TcP、 UDP/udp/Udp/uDp/udP/UDp/uDP/UdP、 ANY/any/Any/aNy/anY/ANy/aNY/AnY。 分别对应协议号6、17、0。
     * @return protocol
     */
    public List<String> getProtocol() {
        return protocol;
    }

    public void setProtocol(List<String> protocol) {
        this.protocol = protocol;
    }

    public ListPrivateDnatsRequest withInternalServicePort(List<String> internalServicePort) {
        this.internalServicePort = internalServicePort;
        return this;
    }

    public ListPrivateDnatsRequest addInternalServicePortItem(String internalServicePortItem) {
        if (this.internalServicePort == null) {
            this.internalServicePort = new ArrayList<>();
        }
        this.internalServicePort.add(internalServicePortItem);
        return this;
    }

    public ListPrivateDnatsRequest withInternalServicePort(Consumer<List<String>> internalServicePortSetter) {
        if (this.internalServicePort == null) {
            this.internalServicePort = new ArrayList<>();
        }
        internalServicePortSetter.accept(this.internalServicePort);
        return this;
    }

    /**
     * 后端实例的端口号（计算实例、ELBV2、ELBV3、VIP等)。
     * @return internalServicePort
     */
    public List<String> getInternalServicePort() {
        return internalServicePort;
    }

    public void setInternalServicePort(List<String> internalServicePort) {
        this.internalServicePort = internalServicePort;
    }

    public ListPrivateDnatsRequest withTransitServicePort(List<String> transitServicePort) {
        this.transitServicePort = transitServicePort;
        return this;
    }

    public ListPrivateDnatsRequest addTransitServicePortItem(String transitServicePortItem) {
        if (this.transitServicePort == null) {
            this.transitServicePort = new ArrayList<>();
        }
        this.transitServicePort.add(transitServicePortItem);
        return this;
    }

    public ListPrivateDnatsRequest withTransitServicePort(Consumer<List<String>> transitServicePortSetter) {
        if (this.transitServicePort == null) {
            this.transitServicePort = new ArrayList<>();
        }
        transitServicePortSetter.accept(this.transitServicePort);
        return this;
    }

    /**
     * 中转IP的端口号。
     * @return transitServicePort
     */
    public List<String> getTransitServicePort() {
        return transitServicePort;
    }

    public void setTransitServicePort(List<String> transitServicePort) {
        this.transitServicePort = transitServicePort;
    }

    public ListPrivateDnatsRequest withTransitIpAddress(List<String> transitIpAddress) {
        this.transitIpAddress = transitIpAddress;
        return this;
    }

    public ListPrivateDnatsRequest addTransitIpAddressItem(String transitIpAddressItem) {
        if (this.transitIpAddress == null) {
            this.transitIpAddress = new ArrayList<>();
        }
        this.transitIpAddress.add(transitIpAddressItem);
        return this;
    }

    public ListPrivateDnatsRequest withTransitIpAddress(Consumer<List<String>> transitIpAddressSetter) {
        if (this.transitIpAddress == null) {
            this.transitIpAddress = new ArrayList<>();
        }
        transitIpAddressSetter.accept(this.transitIpAddress);
        return this;
    }

    /**
     * 中转IP的地址。
     * @return transitIpAddress
     */
    public List<String> getTransitIpAddress() {
        return transitIpAddress;
    }

    public void setTransitIpAddress(List<String> transitIpAddress) {
        this.transitIpAddress = transitIpAddress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPrivateDnatsRequest that = (ListPrivateDnatsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.pageReverse, that.pageReverse) && Objects.equals(this.id, that.id)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.gatewayId, that.gatewayId)
            && Objects.equals(this.transitIpId, that.transitIpId)
            && Objects.equals(this.networkInterfaceId, that.networkInterfaceId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.privateIpAddress, that.privateIpAddress)
            && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.internalServicePort, that.internalServicePort)
            && Objects.equals(this.transitServicePort, that.transitServicePort)
            && Objects.equals(this.transitIpAddress, that.transitIpAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            marker,
            pageReverse,
            id,
            enterpriseProjectId,
            description,
            gatewayId,
            transitIpId,
            networkInterfaceId,
            type,
            privateIpAddress,
            protocol,
            internalServicePort,
            transitServicePort,
            transitIpAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrivateDnatsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    transitIpId: ").append(toIndentedString(transitIpId)).append("\n");
        sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    internalServicePort: ").append(toIndentedString(internalServicePort)).append("\n");
        sb.append("    transitServicePort: ").append(toIndentedString(transitServicePort)).append("\n");
        sb.append("    transitIpAddress: ").append(toIndentedString(transitIpAddress)).append("\n");
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
