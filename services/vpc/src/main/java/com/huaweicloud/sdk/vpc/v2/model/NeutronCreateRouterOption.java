package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronCreateRouterOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_gateway_info")

    private ExternalGatewayInfoOption externalGatewayInfo;

    public NeutronCreateRouterOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：路由器的名称。 取值范围：0-64个字符，仅支持数字、字母、中文、_(下划线)、-（中划线）、.（点）。 约束：如果name非空，则name不能重复
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NeutronCreateRouterOption withAdminStateUp(Boolean adminStateUp) {
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

    public NeutronCreateRouterOption withExternalGatewayInfo(ExternalGatewayInfoOption externalGatewayInfo) {
        this.externalGatewayInfo = externalGatewayInfo;
        return this;
    }

    public NeutronCreateRouterOption withExternalGatewayInfo(
        Consumer<ExternalGatewayInfoOption> externalGatewayInfoSetter) {
        if (this.externalGatewayInfo == null) {
            this.externalGatewayInfo = new ExternalGatewayInfoOption();
            externalGatewayInfoSetter.accept(this.externalGatewayInfo);
        }

        return this;
    }

    /**
     * Get externalGatewayInfo
     * @return externalGatewayInfo
     */
    public ExternalGatewayInfoOption getExternalGatewayInfo() {
        return externalGatewayInfo;
    }

    public void setExternalGatewayInfo(ExternalGatewayInfoOption externalGatewayInfo) {
        this.externalGatewayInfo = externalGatewayInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronCreateRouterOption that = (NeutronCreateRouterOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.externalGatewayInfo, that.externalGatewayInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adminStateUp, externalGatewayInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateRouterOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    externalGatewayInfo: ").append(toIndentedString(externalGatewayInfo)).append("\n");
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
