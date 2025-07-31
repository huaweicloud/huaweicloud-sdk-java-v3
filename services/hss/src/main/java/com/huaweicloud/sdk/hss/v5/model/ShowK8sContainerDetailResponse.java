package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowK8sContainerDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_username")

    private String serviceUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_password")

    private String servicePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_port_list")

    private List<ServicePortInfo> servicePortList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_simulate")

    private String enableSimulate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private String hosts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra")

    private ContainerExtraInfo extra;

    public ShowK8sContainerDetailResponse withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 服务名称
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ShowK8sContainerDetailResponse withServiceUsername(String serviceUsername) {
        this.serviceUsername = serviceUsername;
        return this;
    }

    /**
     * 服务用户名
     * @return serviceUsername
     */
    public String getServiceUsername() {
        return serviceUsername;
    }

    public void setServiceUsername(String serviceUsername) {
        this.serviceUsername = serviceUsername;
    }

    public ShowK8sContainerDetailResponse withServicePassword(String servicePassword) {
        this.servicePassword = servicePassword;
        return this;
    }

    /**
     * 服务密码
     * @return servicePassword
     */
    public String getServicePassword() {
        return servicePassword;
    }

    public void setServicePassword(String servicePassword) {
        this.servicePassword = servicePassword;
    }

    public ShowK8sContainerDetailResponse withServicePortList(List<ServicePortInfo> servicePortList) {
        this.servicePortList = servicePortList;
        return this;
    }

    public ShowK8sContainerDetailResponse addServicePortListItem(ServicePortInfo servicePortListItem) {
        if (this.servicePortList == null) {
            this.servicePortList = new ArrayList<>();
        }
        this.servicePortList.add(servicePortListItem);
        return this;
    }

    public ShowK8sContainerDetailResponse withServicePortList(Consumer<List<ServicePortInfo>> servicePortListSetter) {
        if (this.servicePortList == null) {
            this.servicePortList = new ArrayList<>();
        }
        servicePortListSetter.accept(this.servicePortList);
        return this;
    }

    /**
     * 容器各服务端口信息
     * @return servicePortList
     */
    public List<ServicePortInfo> getServicePortList() {
        return servicePortList;
    }

    public void setServicePortList(List<ServicePortInfo> servicePortList) {
        this.servicePortList = servicePortList;
    }

    public ShowK8sContainerDetailResponse withEnableSimulate(String enableSimulate) {
        this.enableSimulate = enableSimulate;
        return this;
    }

    /**
     * 数据仿真，默认关闭。开启后将在沙箱中注入仿真数据 - open : 开启 - close : 关闭
     * @return enableSimulate
     */
    public String getEnableSimulate() {
        return enableSimulate;
    }

    public void setEnableSimulate(String enableSimulate) {
        this.enableSimulate = enableSimulate;
    }

    public ShowK8sContainerDetailResponse withHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }

    /**
     * 沙箱域名 使用 ',' 隔开
     * @return hosts
     */
    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public ShowK8sContainerDetailResponse withExtra(ContainerExtraInfo extra) {
        this.extra = extra;
        return this;
    }

    public ShowK8sContainerDetailResponse withExtra(Consumer<ContainerExtraInfo> extraSetter) {
        if (this.extra == null) {
            this.extra = new ContainerExtraInfo();
            extraSetter.accept(this.extra);
        }

        return this;
    }

    /**
     * Get extra
     * @return extra
     */
    public ContainerExtraInfo getExtra() {
        return extra;
    }

    public void setExtra(ContainerExtraInfo extra) {
        this.extra = extra;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowK8sContainerDetailResponse that = (ShowK8sContainerDetailResponse) obj;
        return Objects.equals(this.serviceName, that.serviceName)
            && Objects.equals(this.serviceUsername, that.serviceUsername)
            && Objects.equals(this.servicePassword, that.servicePassword)
            && Objects.equals(this.servicePortList, that.servicePortList)
            && Objects.equals(this.enableSimulate, that.enableSimulate) && Objects.equals(this.hosts, that.hosts)
            && Objects.equals(this.extra, that.extra);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(serviceName, serviceUsername, servicePassword, servicePortList, enableSimulate, hosts, extra);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowK8sContainerDetailResponse {\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    serviceUsername: ").append(toIndentedString(serviceUsername)).append("\n");
        sb.append("    servicePassword: ").append(toIndentedString(servicePassword)).append("\n");
        sb.append("    servicePortList: ").append(toIndentedString(servicePortList)).append("\n");
        sb.append("    enableSimulate: ").append(toIndentedString(enableSimulate)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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
