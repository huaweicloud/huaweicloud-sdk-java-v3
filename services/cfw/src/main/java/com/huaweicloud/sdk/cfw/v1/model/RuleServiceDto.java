package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RuleServiceDto
 */
public class RuleServiceDto {

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
    @JsonProperty(value = "predefined_group")

    private List<String> predefinedGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_group")

    private List<String> serviceGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_group_names")

    private List<ServiceGroupVO> serviceGroupNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_set_type")

    private Integer serviceSetType;

    public RuleServiceDto withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 服务输入类型，用于明确规则的服务输入类型。 **约束限制**： 不涉及 **取值范围**： 0为手动输入类型，1为自动输入类型 **默认取值**： 不涉及
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public RuleServiceDto withProtocol(Integer protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释**： 服务协议类型，用于明确规则引用服务协议类型。 **约束限制**： type为0（手动类型）时，此处不能为空。 **取值范围**： 协议类型：TCP为6，UDP为17，ICMP为1，ICMPv6为58，Any为-1 **默认取值**： 不涉及
     * @return protocol
     */
    public Integer getProtocol() {
        return protocol;
    }

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    public RuleServiceDto withProtocols(List<Integer> protocols) {
        this.protocols = protocols;
        return this;
    }

    public RuleServiceDto addProtocolsItem(Integer protocolsItem) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        this.protocols.add(protocolsItem);
        return this;
    }

    public RuleServiceDto withProtocols(Consumer<List<Integer>> protocolsSetter) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        protocolsSetter.accept(this.protocols);
        return this;
    }

    /**
     * **参数解释**： 协议列表，用于明确规则引用协议列表。 **约束限制**： type为0（手动类型）时，此处不能为空。 **取值范围**： 协议类型：TCP为6，UDP为17，ICMP为1，ICMPv6为58，Any为-1 **默认取值**： 不涉及
     * @return protocols
     */
    public List<Integer> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<Integer> protocols) {
        this.protocols = protocols;
    }

    public RuleServiceDto withSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    /**
     * **参数解释**： 源端口，会话发起方的端口。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return sourcePort
     */
    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    public RuleServiceDto withDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }

    /**
     * **参数解释**： 目的端口，会话接收方的端口。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return destPort
     */
    public String getDestPort() {
        return destPort;
    }

    public void setDestPort(String destPort) {
        this.destPort = destPort;
    }

    public RuleServiceDto withServiceSetId(String serviceSetId) {
        this.serviceSetId = serviceSetId;
        return this;
    }

    /**
     * **参数解释**： 服务组ID，用于明确规则引用服务组，可通过[获取服务组列表接口](ListServiceSets.xml)查询获得，通过返回值中的data.records.set_id（.表示各对象之间层级的区分）获得。 **约束限制**： 当address的type为1（关联IP地址组）时，此处不能为空 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return serviceSetId
     */
    public String getServiceSetId() {
        return serviceSetId;
    }

    public void setServiceSetId(String serviceSetId) {
        this.serviceSetId = serviceSetId;
    }

    public RuleServiceDto withServiceSetName(String serviceSetName) {
        this.serviceSetName = serviceSetName;
        return this;
    }

    /**
     * **参数解释**： 服务（协议、源端口、目的端口）组的名称，用于明确规则引用服务组，可通过[获取服务组列表接口](ListServiceSets.xml)查询获得，通过返回值中的data.records.name（.表示各对象之间层级的区分）获得。 **约束限制**： 当address的type为1（关联IP地址组）时，此处不能为空 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return serviceSetName
     */
    public String getServiceSetName() {
        return serviceSetName;
    }

    public void setServiceSetName(String serviceSetName) {
        this.serviceSetName = serviceSetName;
    }

    public RuleServiceDto withCustomService(List<ServiceItem> customService) {
        this.customService = customService;
        return this;
    }

    public RuleServiceDto addCustomServiceItem(ServiceItem customServiceItem) {
        if (this.customService == null) {
            this.customService = new ArrayList<>();
        }
        this.customService.add(customServiceItem);
        return this;
    }

    public RuleServiceDto withCustomService(Consumer<List<ServiceItem>> customServiceSetter) {
        if (this.customService == null) {
            this.customService = new ArrayList<>();
        }
        customServiceSetter.accept(this.customService);
        return this;
    }

    /**
     * **参数解释**： 自定义服务，用于明确规则引用服务。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return customService
     */
    public List<ServiceItem> getCustomService() {
        return customService;
    }

    public void setCustomService(List<ServiceItem> customService) {
        this.customService = customService;
    }

    public RuleServiceDto withPredefinedGroup(List<String> predefinedGroup) {
        this.predefinedGroup = predefinedGroup;
        return this;
    }

    public RuleServiceDto addPredefinedGroupItem(String predefinedGroupItem) {
        if (this.predefinedGroup == null) {
            this.predefinedGroup = new ArrayList<>();
        }
        this.predefinedGroup.add(predefinedGroupItem);
        return this;
    }

    public RuleServiceDto withPredefinedGroup(Consumer<List<String>> predefinedGroupSetter) {
        if (this.predefinedGroup == null) {
            this.predefinedGroup = new ArrayList<>();
        }
        predefinedGroupSetter.accept(this.predefinedGroup);
        return this;
    }

    /**
     * **参数解释**： 预定义服务组ID列表，用于明确规则引用预定义服务组。服务组ID可通过[获取服务组列表接口](ListServiceSets.xml)查询获得，通过返回值中的data.records.set_id（.表示各对象之间层级的区分）获得。 **约束限制**： 查询条件中query_service_set_type需要设置为1预定义服务组。 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return predefinedGroup
     */
    public List<String> getPredefinedGroup() {
        return predefinedGroup;
    }

    public void setPredefinedGroup(List<String> predefinedGroup) {
        this.predefinedGroup = predefinedGroup;
    }

    public RuleServiceDto withServiceGroup(List<String> serviceGroup) {
        this.serviceGroup = serviceGroup;
        return this;
    }

    public RuleServiceDto addServiceGroupItem(String serviceGroupItem) {
        if (this.serviceGroup == null) {
            this.serviceGroup = new ArrayList<>();
        }
        this.serviceGroup.add(serviceGroupItem);
        return this;
    }

    public RuleServiceDto withServiceGroup(Consumer<List<String>> serviceGroupSetter) {
        if (this.serviceGroup == null) {
            this.serviceGroup = new ArrayList<>();
        }
        serviceGroupSetter.accept(this.serviceGroup);
        return this;
    }

    /**
     * **参数解释**： 服务组ID列表，用于明确规则引用服务组。服务组ID可通过[获取服务组列表接口](ListServiceSets.xml)查询获得，通过返回值中的data.records.set_id（.表示各对象之间层级的区分）获得。 **约束限制**： 查询条件中query_service_set_type需要设置为0自定义服务组。 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return serviceGroup
     */
    public List<String> getServiceGroup() {
        return serviceGroup;
    }

    public void setServiceGroup(List<String> serviceGroup) {
        this.serviceGroup = serviceGroup;
    }

    public RuleServiceDto withServiceGroupNames(List<ServiceGroupVO> serviceGroupNames) {
        this.serviceGroupNames = serviceGroupNames;
        return this;
    }

    public RuleServiceDto addServiceGroupNamesItem(ServiceGroupVO serviceGroupNamesItem) {
        if (this.serviceGroupNames == null) {
            this.serviceGroupNames = new ArrayList<>();
        }
        this.serviceGroupNames.add(serviceGroupNamesItem);
        return this;
    }

    public RuleServiceDto withServiceGroupNames(Consumer<List<ServiceGroupVO>> serviceGroupNamesSetter) {
        if (this.serviceGroupNames == null) {
            this.serviceGroupNames = new ArrayList<>();
        }
        serviceGroupNamesSetter.accept(this.serviceGroupNames);
        return this;
    }

    /**
     * **参数解释**： 服务（协议、源端口、目的端口）组的名称。列表。 **约束限制**： 不涉及
     * @return serviceGroupNames
     */
    public List<ServiceGroupVO> getServiceGroupNames() {
        return serviceGroupNames;
    }

    public void setServiceGroupNames(List<ServiceGroupVO> serviceGroupNames) {
        this.serviceGroupNames = serviceGroupNames;
    }

    public RuleServiceDto withServiceSetType(Integer serviceSetType) {
        this.serviceSetType = serviceSetType;
        return this;
    }

    /**
     * **参数解释**： 服务组类型，用于明确规则引用服务组类型。 **约束限制**： 不涉及 **取值范围**： 0表示自定义服务组，1表示常用Web服务，2表示常用远程登录和PING，3表示常用数据库 **默认取值**： 不涉及
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
        RuleServiceDto that = (RuleServiceDto) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.protocols, that.protocols) && Objects.equals(this.sourcePort, that.sourcePort)
            && Objects.equals(this.destPort, that.destPort) && Objects.equals(this.serviceSetId, that.serviceSetId)
            && Objects.equals(this.serviceSetName, that.serviceSetName)
            && Objects.equals(this.customService, that.customService)
            && Objects.equals(this.predefinedGroup, that.predefinedGroup)
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
            predefinedGroup,
            serviceGroup,
            serviceGroupNames,
            serviceSetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleServiceDto {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
        sb.append("    destPort: ").append(toIndentedString(destPort)).append("\n");
        sb.append("    serviceSetId: ").append(toIndentedString(serviceSetId)).append("\n");
        sb.append("    serviceSetName: ").append(toIndentedString(serviceSetName)).append("\n");
        sb.append("    customService: ").append(toIndentedString(customService)).append("\n");
        sb.append("    predefinedGroup: ").append(toIndentedString(predefinedGroup)).append("\n");
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
