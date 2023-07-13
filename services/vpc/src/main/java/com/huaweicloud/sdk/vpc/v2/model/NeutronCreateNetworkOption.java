package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建network对象
 */
public class NeutronCreateNetworkOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared")

    private Boolean shared;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider:network_type")

    private String providerNetworkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_security_enabled")

    private Boolean portSecurityEnabled;

    public NeutronCreateNetworkOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：网络名称 取值范围：0-255个字符 约束：不能为admin_external_net
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NeutronCreateNetworkOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 功能说明：资源的管理状态 取值范围：true、false 约束：只支持true
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public NeutronCreateNetworkOption withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * 功能说明：是否支持跨租户共享 取值范围：true、false
     * @return shared
     */
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public NeutronCreateNetworkOption withProviderNetworkType(String providerNetworkType) {
        this.providerNetworkType = providerNetworkType;
        return this;
    }

    /**
     * 功能说明：扩展属性：网络类型。管理员属性，普通租户不可见，允许 geneve类型租户执行操作。 取值范围：vxlan, geneve
     * @return providerNetworkType
     */
    public String getProviderNetworkType() {
        return providerNetworkType;
    }

    public void setProviderNetworkType(String providerNetworkType) {
        this.providerNetworkType = providerNetworkType;
    }

    public NeutronCreateNetworkOption withPortSecurityEnabled(Boolean portSecurityEnabled) {
        this.portSecurityEnabled = portSecurityEnabled;
        return this;
    }

    /**
     * 功能说明：端口安全使能标记 取值范围：true(启用)、false(禁用) 约束：如果不使能，则network下所有虚机的安全组和dhcp防欺骗不生效
     * @return portSecurityEnabled
     */
    public Boolean getPortSecurityEnabled() {
        return portSecurityEnabled;
    }

    public void setPortSecurityEnabled(Boolean portSecurityEnabled) {
        this.portSecurityEnabled = portSecurityEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronCreateNetworkOption that = (NeutronCreateNetworkOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.shared, that.shared)
            && Objects.equals(this.providerNetworkType, that.providerNetworkType)
            && Objects.equals(this.portSecurityEnabled, that.portSecurityEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adminStateUp, shared, providerNetworkType, portSecurityEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateNetworkOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    providerNetworkType: ").append(toIndentedString(providerNetworkType)).append("\n");
        sb.append("    portSecurityEnabled: ").append(toIndentedString(portSecurityEnabled)).append("\n");
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
