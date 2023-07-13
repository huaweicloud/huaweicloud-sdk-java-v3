package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新虚拟网关参数
 */
public class UpdateVirtualGateway {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_ep_group")

    private List<String> localEpGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_ep_group_ipv6")

    private List<String> localEpGroupIpv6 = null;

    public UpdateVirtualGateway withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 更新虚拟网关的名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateVirtualGateway withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 虚拟网关的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateVirtualGateway withLocalEpGroup(List<String> localEpGroup) {
        this.localEpGroup = localEpGroup;
        return this;
    }

    public UpdateVirtualGateway addLocalEpGroupItem(String localEpGroupItem) {
        if (this.localEpGroup == null) {
            this.localEpGroup = new ArrayList<>();
        }
        this.localEpGroup.add(localEpGroupItem);
        return this;
    }

    public UpdateVirtualGateway withLocalEpGroup(Consumer<List<String>> localEpGroupSetter) {
        if (this.localEpGroup == null) {
            this.localEpGroup = new ArrayList<>();
        }
        localEpGroupSetter.accept(this.localEpGroup);
        return this;
    }

    /**
     * 虚拟网关到访问云上服务IPv4子网列表，通常是vpc的cidrs
     * @return localEpGroup
     */
    public List<String> getLocalEpGroup() {
        return localEpGroup;
    }

    public void setLocalEpGroup(List<String> localEpGroup) {
        this.localEpGroup = localEpGroup;
    }

    public UpdateVirtualGateway withLocalEpGroupIpv6(List<String> localEpGroupIpv6) {
        this.localEpGroupIpv6 = localEpGroupIpv6;
        return this;
    }

    public UpdateVirtualGateway addLocalEpGroupIpv6Item(String localEpGroupIpv6Item) {
        if (this.localEpGroupIpv6 == null) {
            this.localEpGroupIpv6 = new ArrayList<>();
        }
        this.localEpGroupIpv6.add(localEpGroupIpv6Item);
        return this;
    }

    public UpdateVirtualGateway withLocalEpGroupIpv6(Consumer<List<String>> localEpGroupIpv6Setter) {
        if (this.localEpGroupIpv6 == null) {
            this.localEpGroupIpv6 = new ArrayList<>();
        }
        localEpGroupIpv6Setter.accept(this.localEpGroupIpv6);
        return this;
    }

    /**
     * 虚拟网关到访问云上服务IPv6子网列表，通常是vpc的cidrs
     * @return localEpGroupIpv6
     */
    public List<String> getLocalEpGroupIpv6() {
        return localEpGroupIpv6;
    }

    public void setLocalEpGroupIpv6(List<String> localEpGroupIpv6) {
        this.localEpGroupIpv6 = localEpGroupIpv6;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVirtualGateway that = (UpdateVirtualGateway) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.localEpGroup, that.localEpGroup)
            && Objects.equals(this.localEpGroupIpv6, that.localEpGroupIpv6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, localEpGroup, localEpGroupIpv6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVirtualGateway {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    localEpGroup: ").append(toIndentedString(localEpGroup)).append("\n");
        sb.append("    localEpGroupIpv6: ").append(toIndentedString(localEpGroupIpv6)).append("\n");
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
