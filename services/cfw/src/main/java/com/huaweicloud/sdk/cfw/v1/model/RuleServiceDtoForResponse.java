package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RuleServiceDtoForResponse
 */
public class RuleServiceDtoForResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private Integer protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocols")

    private List<Integer> protocols = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_port")

    private String sourcePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_port")

    private String destPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_set_id")

    private String serviceSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_set_name")

    private String serviceSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_service")

    private List<ServiceItem> customService = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_group")

    private List<String> serviceGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_group_names")

    private List<ServiceGroupVO> serviceGroupNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_set_type")

    private Integer serviceSetType;

    public RuleServiceDtoForResponse withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 服务输入类型，0为手动输入类型，1为自动输入类型
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public RuleServiceDtoForResponse withProtocol(Integer protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型:TCP为6, UDP为17,ICMP为1,ICMPV6为58,ANY为-1,手动类型不为空，自动类型为空
     * @return protocol
     */
    public Integer getProtocol() {
        return protocol;
    }

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    public RuleServiceDtoForResponse withProtocols(List<Integer> protocols) {
        this.protocols = protocols;
        return this;
    }

    public RuleServiceDtoForResponse addProtocolsItem(Integer protocolsItem) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        this.protocols.add(protocolsItem);
        return this;
    }

    public RuleServiceDtoForResponse withProtocols(Consumer<List<Integer>> protocolsSetter) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        protocolsSetter.accept(this.protocols);
        return this;
    }

    /**
     * 协议列表，协议类型:TCP为6, UDP为17,ICMP为1,ICMPV6为58,ANY为-1,手动类型不为空，自动类型为空
     * @return protocols
     */
    public List<Integer> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<Integer> protocols) {
        this.protocols = protocols;
    }

    public RuleServiceDtoForResponse withSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    /**
     * 源端口
     * @return sourcePort
     */
    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    public RuleServiceDtoForResponse withDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }

    /**
     * 目的端口
     * @return destPort
     */
    public String getDestPort() {
        return destPort;
    }

    public void setDestPort(String destPort) {
        this.destPort = destPort;
    }

    public RuleServiceDtoForResponse withServiceSetId(String serviceSetId) {
        this.serviceSetId = serviceSetId;
        return this;
    }

    /**
     * 服务组id，手动类型为空，自动类型为非空
     * @return serviceSetId
     */
    public String getServiceSetId() {
        return serviceSetId;
    }

    public void setServiceSetId(String serviceSetId) {
        this.serviceSetId = serviceSetId;
    }

    public RuleServiceDtoForResponse withServiceSetName(String serviceSetName) {
        this.serviceSetName = serviceSetName;
        return this;
    }

    /**
     * 服务组名称
     * @return serviceSetName
     */
    public String getServiceSetName() {
        return serviceSetName;
    }

    public void setServiceSetName(String serviceSetName) {
        this.serviceSetName = serviceSetName;
    }

    public RuleServiceDtoForResponse withCustomService(List<ServiceItem> customService) {
        this.customService = customService;
        return this;
    }

    public RuleServiceDtoForResponse addCustomServiceItem(ServiceItem customServiceItem) {
        if (this.customService == null) {
            this.customService = new ArrayList<>();
        }
        this.customService.add(customServiceItem);
        return this;
    }

    public RuleServiceDtoForResponse withCustomService(Consumer<List<ServiceItem>> customServiceSetter) {
        if (this.customService == null) {
            this.customService = new ArrayList<>();
        }
        customServiceSetter.accept(this.customService);
        return this;
    }

    /**
     * 自定义服务
     * @return customService
     */
    public List<ServiceItem> getCustomService() {
        return customService;
    }

    public void setCustomService(List<ServiceItem> customService) {
        this.customService = customService;
    }

    public RuleServiceDtoForResponse withServiceGroup(List<String> serviceGroup) {
        this.serviceGroup = serviceGroup;
        return this;
    }

    public RuleServiceDtoForResponse addServiceGroupItem(String serviceGroupItem) {
        if (this.serviceGroup == null) {
            this.serviceGroup = new ArrayList<>();
        }
        this.serviceGroup.add(serviceGroupItem);
        return this;
    }

    public RuleServiceDtoForResponse withServiceGroup(Consumer<List<String>> serviceGroupSetter) {
        if (this.serviceGroup == null) {
            this.serviceGroup = new ArrayList<>();
        }
        serviceGroupSetter.accept(this.serviceGroup);
        return this;
    }

    /**
     * 服务组列表
     * @return serviceGroup
     */
    public List<String> getServiceGroup() {
        return serviceGroup;
    }

    public void setServiceGroup(List<String> serviceGroup) {
        this.serviceGroup = serviceGroup;
    }

    public RuleServiceDtoForResponse withServiceGroupNames(List<ServiceGroupVO> serviceGroupNames) {
        this.serviceGroupNames = serviceGroupNames;
        return this;
    }

    public RuleServiceDtoForResponse addServiceGroupNamesItem(ServiceGroupVO serviceGroupNamesItem) {
        if (this.serviceGroupNames == null) {
            this.serviceGroupNames = new ArrayList<>();
        }
        this.serviceGroupNames.add(serviceGroupNamesItem);
        return this;
    }

    public RuleServiceDtoForResponse withServiceGroupNames(Consumer<List<ServiceGroupVO>> serviceGroupNamesSetter) {
        if (this.serviceGroupNames == null) {
            this.serviceGroupNames = new ArrayList<>();
        }
        serviceGroupNamesSetter.accept(this.serviceGroupNames);
        return this;
    }

    /**
     * 服务组名称列表
     * @return serviceGroupNames
     */
    public List<ServiceGroupVO> getServiceGroupNames() {
        return serviceGroupNames;
    }

    public void setServiceGroupNames(List<ServiceGroupVO> serviceGroupNames) {
        this.serviceGroupNames = serviceGroupNames;
    }

    public RuleServiceDtoForResponse withServiceSetType(Integer serviceSetType) {
        this.serviceSetType = serviceSetType;
        return this;
    }

    /**
     * 服务组类型，0表示自定义服务组，1表示常用WEB服务，2表示常用远程登录和PING，3表示常用数据库
     * @return serviceSetType
     */
    public Integer getServiceSetType() {
        return serviceSetType;
    }

    public void setServiceSetType(Integer serviceSetType) {
        this.serviceSetType = serviceSetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleServiceDtoForResponse that = (RuleServiceDtoForResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.protocols, that.protocols) && Objects.equals(this.sourcePort, that.sourcePort)
            && Objects.equals(this.destPort, that.destPort) && Objects.equals(this.serviceSetId, that.serviceSetId)
            && Objects.equals(this.serviceSetName, that.serviceSetName)
            && Objects.equals(this.customService, that.customService)
            && Objects.equals(this.serviceGroup, that.serviceGroup)
            && Objects.equals(this.serviceGroupNames, that.serviceGroupNames)
            && Objects.equals(this.serviceSetType, that.serviceSetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            protocol,
            protocols,
            sourcePort,
            destPort,
            serviceSetId,
            serviceSetName,
            customService,
            serviceGroup,
            serviceGroupNames,
            serviceSetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleServiceDtoForResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
        sb.append("    destPort: ").append(toIndentedString(destPort)).append("\n");
        sb.append("    serviceSetId: ").append(toIndentedString(serviceSetId)).append("\n");
        sb.append("    serviceSetName: ").append(toIndentedString(serviceSetName)).append("\n");
        sb.append("    customService: ").append(toIndentedString(customService)).append("\n");
        sb.append("    serviceGroup: ").append(toIndentedString(serviceGroup)).append("\n");
        sb.append("    serviceGroupNames: ").append(toIndentedString(serviceGroupNames)).append("\n");
        sb.append("    serviceSetType: ").append(toIndentedString(serviceSetType)).append("\n");
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
