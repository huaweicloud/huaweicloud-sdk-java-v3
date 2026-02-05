package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * nacos微服务详细信息。
 */
public class MicroServiceInfoNacosBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_config")

    private List<NacosServerConfig> serverConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_info")

    private NacosUserInfo userInfo;

    public MicroServiceInfoNacosBase withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间ID，当选择默认命名空间public时，此项为空。由字母、数字、连接符('-')、下划线('_')组成且64个字符之内。 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public MicroServiceInfoNacosBase withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称，默认为DEFAULT。由字母、数字、连接符('-')、下划线('_')组成且64个字符之内。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public MicroServiceInfoNacosBase withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 分组名称，默认为DEFAULT_GROUP。由字母、数字、连接符('-')、下划线('_')、点号('.')、冒号(':')组成且128个字符之内。 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public MicroServiceInfoNacosBase withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 微服务名称。不包含中文和@@，不得以@开头，512个字符以内。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public MicroServiceInfoNacosBase withServerConfig(List<NacosServerConfig> serverConfig) {
        this.serverConfig = serverConfig;
        return this;
    }

    public MicroServiceInfoNacosBase addServerConfigItem(NacosServerConfig serverConfigItem) {
        if (this.serverConfig == null) {
            this.serverConfig = new ArrayList<>();
        }
        this.serverConfig.add(serverConfigItem);
        return this;
    }

    public MicroServiceInfoNacosBase withServerConfig(Consumer<List<NacosServerConfig>> serverConfigSetter) {
        if (this.serverConfig == null) {
            this.serverConfig = new ArrayList<>();
        }
        serverConfigSetter.accept(this.serverConfig);
        return this;
    }

    /**
     * nacos服务端配置信息。
     * @return serverConfig
     */
    public List<NacosServerConfig> getServerConfig() {
        return serverConfig;
    }

    public void setServerConfig(List<NacosServerConfig> serverConfig) {
        this.serverConfig = serverConfig;
    }

    public MicroServiceInfoNacosBase withUserInfo(NacosUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public MicroServiceInfoNacosBase withUserInfo(Consumer<NacosUserInfo> userInfoSetter) {
        if (this.userInfo == null) {
            this.userInfo = new NacosUserInfo();
            userInfoSetter.accept(this.userInfo);
        }

        return this;
    }

    /**
     * Get userInfo
     * @return userInfo
     */
    public NacosUserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(NacosUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MicroServiceInfoNacosBase that = (MicroServiceInfoNacosBase) obj;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.serviceName, that.serviceName)
            && Objects.equals(this.serverConfig, that.serverConfig) && Objects.equals(this.userInfo, that.userInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, clusterName, groupName, serviceName, serverConfig, userInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MicroServiceInfoNacosBase {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    serverConfig: ").append(toIndentedString(serverConfig)).append("\n");
        sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
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
