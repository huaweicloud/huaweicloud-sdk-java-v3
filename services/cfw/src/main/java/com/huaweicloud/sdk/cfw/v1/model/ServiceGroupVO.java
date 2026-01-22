package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ServiceGroupVO
 */
public class ServiceGroupVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocols")

    private List<Integer> protocols = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_set_type")

    private Integer serviceSetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_id")

    private String setId;

    public ServiceGroupVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 服务（协议、源端口、目的端口）组的名称。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceGroupVO withProtocols(List<Integer> protocols) {
        this.protocols = protocols;
        return this;
    }

    public ServiceGroupVO addProtocolsItem(Integer protocolsItem) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        this.protocols.add(protocolsItem);
        return this;
    }

    public ServiceGroupVO withProtocols(Consumer<List<Integer>> protocolsSetter) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        protocolsSetter.accept(this.protocols);
        return this;
    }

    /**
     * **参数解释**： 协议列表 **约束限制**： 不涉及 **取值范围**： - 6：TCP - 17：UDP - 1：ICMP - 58：ICMPV6 - -1：Any **默认取值**： 不涉及
     * @return protocols
     */
    public List<Integer> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<Integer> protocols) {
        this.protocols = protocols;
    }

    public ServiceGroupVO withServiceSetType(Integer serviceSetType) {
        this.serviceSetType = serviceSetType;
        return this;
    }

    /**
     * **参数解释**： 服务（协议、源端口、目的端口）组的类型 **约束限制**： 不涉及 **取值范围**： 0表示自定义服务组，1表示预定义服务组 **默认取值**： 不涉及
     * @return serviceSetType
     */
    public Integer getServiceSetType() {
        return serviceSetType;
    }

    public void setServiceSetType(Integer serviceSetType) {
        this.serviceSetType = serviceSetType;
    }

    public ServiceGroupVO withSetId(String setId) {
        this.setId = setId;
        return this;
    }

    /**
     * **参数解释**： 服务组ID，可通过[获取服务组列表接口](ListServiceSets.xml)查询获得，通过返回值中的data.records.set_id（.表示各对象之间层级的区分）获得。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return setId
     */
    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceGroupVO that = (ServiceGroupVO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.protocols, that.protocols)
            && Objects.equals(this.serviceSetType, that.serviceSetType) && Objects.equals(this.setId, that.setId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, protocols, serviceSetType, setId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceGroupVO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
        sb.append("    serviceSetType: ").append(toIndentedString(serviceSetType)).append("\n");
        sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
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
