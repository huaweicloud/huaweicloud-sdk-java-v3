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
    @JsonProperty(value = "agencyName")

    private String agencyName;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletionProtection")

    private Boolean deletionProtection;

    public ClusterInformationSpec withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释：** 指定集群使用的委托。该委托用于生成集群中组件使用的临时访问凭证，在集群中自动创建其他相关云服务的资源时会使用该委托权限。当不传或为空时，集群将自动选择使用CCE的系统委托cce_admin_trust或cce_cluster_agency。  [ > 关于CCE系统委托的说明详情参见[系统委托说明](https://support.huaweicloud.com/usermanual-cce/cce_10_0556.html)](tag:hws) [ > 关于CCE系统委托的说明详情参见[系统委托说明](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_0556.html)](tag:hws_hk)  **约束限制：** 仅1.27及以上版本集群支持该参数  **取值范围：** 不涉及 **默认取值：** 空 
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public ClusterInformationSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 集群的描述信息。 **约束限制：** 仅运行和扩容状态（Available、ScalingUp、ScalingDown）的集群允许修改。 **取值范围：** 字符取值范围[0,200]。不包含~$%^&*<>[]{}()'\"#\\等特殊字符。 **默认取值：** 无
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

    public ClusterInformationSpec withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

    /**
     * **参数解释：** 集群删除保护，如果开启后用户将无法删除该集群。 **约束限制：** 不涉及 **取值范围：** - true: 开启集群删除保护 - false: 关闭集群删除保护  **默认取值：** 默认false
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return deletionProtection;
    }

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterInformationSpec that = (ClusterInformationSpec) obj;
        return Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.customSan, that.customSan)
            && Objects.equals(this.containerNetwork, that.containerNetwork)
            && Objects.equals(this.eniNetwork, that.eniNetwork) && Objects.equals(this.hostNetwork, that.hostNetwork)
            && Objects.equals(this.deletionProtection, that.deletionProtection);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(agencyName, description, customSan, containerNetwork, eniNetwork, hostNetwork, deletionProtection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterInformationSpec {\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    customSan: ").append(toIndentedString(customSan)).append("\n");
        sb.append("    containerNetwork: ").append(toIndentedString(containerNetwork)).append("\n");
        sb.append("    eniNetwork: ").append(toIndentedString(eniNetwork)).append("\n");
        sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
        sb.append("    deletionProtection: ").append(toIndentedString(deletionProtection)).append("\n");
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
