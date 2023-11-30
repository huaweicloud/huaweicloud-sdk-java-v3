package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分区的配置信息
 */
public class PartitionSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostNetwork")

    private PartitionSpecHostNetwork hostNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containerNetwork")

    private List<PartitionSpecContainerNetwork> containerNetwork = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicBorderGroup")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    public PartitionSpec withHostNetwork(PartitionSpecHostNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    public PartitionSpec withHostNetwork(Consumer<PartitionSpecHostNetwork> hostNetworkSetter) {
        if (this.hostNetwork == null) {
            this.hostNetwork = new PartitionSpecHostNetwork();
            hostNetworkSetter.accept(this.hostNetwork);
        }

        return this;
    }

    /**
     * Get hostNetwork
     * @return hostNetwork
     */
    public PartitionSpecHostNetwork getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(PartitionSpecHostNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    public PartitionSpec withContainerNetwork(List<PartitionSpecContainerNetwork> containerNetwork) {
        this.containerNetwork = containerNetwork;
        return this;
    }

    public PartitionSpec addContainerNetworkItem(PartitionSpecContainerNetwork containerNetworkItem) {
        if (this.containerNetwork == null) {
            this.containerNetwork = new ArrayList<>();
        }
        this.containerNetwork.add(containerNetworkItem);
        return this;
    }

    public PartitionSpec withContainerNetwork(Consumer<List<PartitionSpecContainerNetwork>> containerNetworkSetter) {
        if (this.containerNetwork == null) {
            this.containerNetwork = new ArrayList<>();
        }
        containerNetworkSetter.accept(this.containerNetwork);
        return this;
    }

    /**
     * 分区容器子网
     * @return containerNetwork
     */
    public List<PartitionSpecContainerNetwork> getContainerNetwork() {
        return containerNetwork;
    }

    public void setContainerNetwork(List<PartitionSpecContainerNetwork> containerNetwork) {
        this.containerNetwork = containerNetwork;
    }

    public PartitionSpec withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 群组
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public PartitionSpec withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 类别
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
        PartitionSpec that = (PartitionSpec) obj;
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
        sb.append("class PartitionSpec {\n");
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
