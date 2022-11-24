package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ClusterInformationSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customSan")

    private List<String> customSan = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containerNetwork")

    private ContainerNetworkUpdate containerNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eniNetwork")

    private EniNetworkUpdate eniNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostNetwork")

    private ClusterInformationSpecHostNetwork hostNetwork;

    public ClusterInformationSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 集群的描述信息。  1. 字符取值范围[0,200]。不包含~$%^&*<>[]{}()'\"#\\等特殊字符。 2. 仅运行和扩容状态（Available、ScalingUp、ScalingDown）的集群允许修改。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClusterInformationSpec withCustomSan(List<String> customSan) {
        this.customSan = customSan;
        return this;
    }

    public ClusterInformationSpec addCustomSanItem(String customSanItem) {
        if (this.customSan == null) {
            this.customSan = new ArrayList<>();
        }
        this.customSan.add(customSanItem);
        return this;
    }

    public ClusterInformationSpec withCustomSan(Consumer<List<String>> customSanSetter) {
        if (this.customSan == null) {
            this.customSan = new ArrayList<>();
        }
        customSanSetter.accept(this.customSan);
        return this;
    }

    /**
     * 集群的API Server服务端证书中的自定义SAN（Subject Alternative Name）字段，遵从SSL标准X509定义的格式规范。  1. 不允许出现同名重复。 2. 格式符合IP和域名格式。  示例: ``` SAN 1: DNS Name=example.com SAN 2: DNS Name=www.example.com SAN 3: DNS Name=example.net SAN 4: IP Address=93.184.216.34 ```
     * @return customSan
     */
    public List<String> getCustomSan() {
        return customSan;
    }

    public void setCustomSan(List<String> customSan) {
        this.customSan = customSan;
    }

    public ClusterInformationSpec withContainerNetwork(ContainerNetworkUpdate containerNetwork) {
        this.containerNetwork = containerNetwork;
        return this;
    }

    public ClusterInformationSpec withContainerNetwork(Consumer<ContainerNetworkUpdate> containerNetworkSetter) {
        if (this.containerNetwork == null) {
            this.containerNetwork = new ContainerNetworkUpdate();
            containerNetworkSetter.accept(this.containerNetwork);
        }

        return this;
    }

    /**
     * Get containerNetwork
     * @return containerNetwork
     */
    public ContainerNetworkUpdate getContainerNetwork() {
        return containerNetwork;
    }

    public void setContainerNetwork(ContainerNetworkUpdate containerNetwork) {
        this.containerNetwork = containerNetwork;
    }

    public ClusterInformationSpec withEniNetwork(EniNetworkUpdate eniNetwork) {
        this.eniNetwork = eniNetwork;
        return this;
    }

    public ClusterInformationSpec withEniNetwork(Consumer<EniNetworkUpdate> eniNetworkSetter) {
        if (this.eniNetwork == null) {
            this.eniNetwork = new EniNetworkUpdate();
            eniNetworkSetter.accept(this.eniNetwork);
        }

        return this;
    }

    /**
     * Get eniNetwork
     * @return eniNetwork
     */
    public EniNetworkUpdate getEniNetwork() {
        return eniNetwork;
    }

    public void setEniNetwork(EniNetworkUpdate eniNetwork) {
        this.eniNetwork = eniNetwork;
    }

    public ClusterInformationSpec withHostNetwork(ClusterInformationSpecHostNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    public ClusterInformationSpec withHostNetwork(Consumer<ClusterInformationSpecHostNetwork> hostNetworkSetter) {
        if (this.hostNetwork == null) {
            this.hostNetwork = new ClusterInformationSpecHostNetwork();
            hostNetworkSetter.accept(this.hostNetwork);
        }

        return this;
    }

    /**
     * Get hostNetwork
     * @return hostNetwork
     */
    public ClusterInformationSpecHostNetwork getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(ClusterInformationSpecHostNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterInformationSpec clusterInformationSpec = (ClusterInformationSpec) o;
        return Objects.equals(this.description, clusterInformationSpec.description)
            && Objects.equals(this.customSan, clusterInformationSpec.customSan)
            && Objects.equals(this.containerNetwork, clusterInformationSpec.containerNetwork)
            && Objects.equals(this.eniNetwork, clusterInformationSpec.eniNetwork)
            && Objects.equals(this.hostNetwork, clusterInformationSpec.hostNetwork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, customSan, containerNetwork, eniNetwork, hostNetwork);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterInformationSpec {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    customSan: ").append(toIndentedString(customSan)).append("\n");
        sb.append("    containerNetwork: ").append(toIndentedString(containerNetwork)).append("\n");
        sb.append("    eniNetwork: ").append(toIndentedString(eniNetwork)).append("\n");
        sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
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
