package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 分区的配置信息 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
 */
public class PartitionReqBodySpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostNetwork")

    private PartitionReqBodySpecHostNetwork hostNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containerNetwork")

    private List<PartitionReqBodySpecContainerNetwork> containerNetwork = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicBorderGroup")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    public PartitionReqBodySpec withHostNetwork(PartitionReqBodySpecHostNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    public PartitionReqBodySpec withHostNetwork(Consumer<PartitionReqBodySpecHostNetwork> hostNetworkSetter) {
        if (this.hostNetwork == null) {
            this.hostNetwork = new PartitionReqBodySpecHostNetwork();
            hostNetworkSetter.accept(this.hostNetwork);
        }

        return this;
    }

    /**
     * Get hostNetwork
     * @return hostNetwork
     */
    public PartitionReqBodySpecHostNetwork getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(PartitionReqBodySpecHostNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    public PartitionReqBodySpec withContainerNetwork(List<PartitionReqBodySpecContainerNetwork> containerNetwork) {
        this.containerNetwork = containerNetwork;
        return this;
    }

    public PartitionReqBodySpec addContainerNetworkItem(PartitionReqBodySpecContainerNetwork containerNetworkItem) {
        if (this.containerNetwork == null) {
            this.containerNetwork = new ArrayList<>();
        }
        this.containerNetwork.add(containerNetworkItem);
        return this;
    }

    public PartitionReqBodySpec withContainerNetwork(
        Consumer<List<PartitionReqBodySpecContainerNetwork>> containerNetworkSetter) {
        if (this.containerNetwork == null) {
            this.containerNetwork = new ArrayList<>();
        }
        containerNetworkSetter.accept(this.containerNetwork);
        return this;
    }

    /**
     * **参数解释**： 分区容器子网 **约束限制**： 列表长度不能大于20 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return containerNetwork
     */
    public List<PartitionReqBodySpecContainerNetwork> getContainerNetwork() {
        return containerNetwork;
    }

    public void setContainerNetwork(List<PartitionReqBodySpecContainerNetwork> containerNetwork) {
        this.containerNetwork = containerNetwork;
    }

    public PartitionReqBodySpec withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * **参数解释**： 群组，IES边缘场景为可用区ID，中心区统一为“center”。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public PartitionReqBodySpec withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 可用区分类 **约束限制**： 不涉及 **取值范围**： - Default: 中心云可用区 - IES: 专属云可用区 - HomeZone: 智能边缘云可用区 **默认取值**： 不涉及
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PartitionReqBodySpec that = (PartitionReqBodySpec) obj;
        return Objects.equals(this.hostNetwork, that.hostNetwork)
            && Objects.equals(this.containerNetwork, that.containerNetwork)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostNetwork, containerNetwork, publicBorderGroup, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartitionReqBodySpec {\n");
        sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
        sb.append("    containerNetwork: ").append(toIndentedString(containerNetwork)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
