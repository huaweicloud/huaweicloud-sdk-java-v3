package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 终端节点服务信息。
 */
public class CreateClusterLoadBalance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpointWithDnsName")

    private Boolean endpointWithDnsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcPermissions")

    private List<String> vpcPermissions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "professionVpcep")

    private Boolean professionVpcep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dualstackEnable")

    private Boolean dualstackEnable;

    public CreateClusterLoadBalance withEndpointWithDnsName(Boolean endpointWithDnsName) {
        this.endpointWithDnsName = endpointWithDnsName;
        return this;
    }

    /**
     * 是否开启内网域名。 - true： 开启内网域名。 - false： 关闭内网域名。
     * @return endpointWithDnsName
     */
    public Boolean getEndpointWithDnsName() {
        return endpointWithDnsName;
    }

    public void setEndpointWithDnsName(Boolean endpointWithDnsName) {
        this.endpointWithDnsName = endpointWithDnsName;
    }

    public CreateClusterLoadBalance withVpcPermissions(List<String> vpcPermissions) {
        this.vpcPermissions = vpcPermissions;
        return this;
    }

    public CreateClusterLoadBalance addVpcPermissionsItem(String vpcPermissionsItem) {
        if (this.vpcPermissions == null) {
            this.vpcPermissions = new ArrayList<>();
        }
        this.vpcPermissions.add(vpcPermissionsItem);
        return this;
    }

    public CreateClusterLoadBalance withVpcPermissions(Consumer<List<String>> vpcPermissionsSetter) {
        if (this.vpcPermissions == null) {
            this.vpcPermissions = new ArrayList<>();
        }
        vpcPermissionsSetter.accept(this.vpcPermissions);
        return this;
    }

    /**
     * 访问控制。
     * @return vpcPermissions
     */
    public List<String> getVpcPermissions() {
        return vpcPermissions;
    }

    public void setVpcPermissions(List<String> vpcPermissions) {
        this.vpcPermissions = vpcPermissions;
    }

    public CreateClusterLoadBalance withProfessionVpcep(Boolean professionVpcep) {
        this.professionVpcep = professionVpcep;
        return this;
    }

    /**
     * 创建专业型终端节点。
     * @return professionVpcep
     */
    public Boolean getProfessionVpcep() {
        return professionVpcep;
    }

    public void setProfessionVpcep(Boolean professionVpcep) {
        this.professionVpcep = professionVpcep;
    }

    public CreateClusterLoadBalance withDualstackEnable(Boolean dualstackEnable) {
        this.dualstackEnable = dualstackEnable;
        return this;
    }

    /**
     * 是否开启IPv4/IPv6双栈网络。
     * @return dualstackEnable
     */
    public Boolean getDualstackEnable() {
        return dualstackEnable;
    }

    public void setDualstackEnable(Boolean dualstackEnable) {
        this.dualstackEnable = dualstackEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClusterLoadBalance that = (CreateClusterLoadBalance) obj;
        return Objects.equals(this.endpointWithDnsName, that.endpointWithDnsName)
            && Objects.equals(this.vpcPermissions, that.vpcPermissions)
            && Objects.equals(this.professionVpcep, that.professionVpcep)
            && Objects.equals(this.dualstackEnable, that.dualstackEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointWithDnsName, vpcPermissions, professionVpcep, dualstackEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterLoadBalance {\n");
        sb.append("    endpointWithDnsName: ").append(toIndentedString(endpointWithDnsName)).append("\n");
        sb.append("    vpcPermissions: ").append(toIndentedString(vpcPermissions)).append("\n");
        sb.append("    professionVpcep: ").append(toIndentedString(professionVpcep)).append("\n");
        sb.append("    dualstackEnable: ").append(toIndentedString(dualstackEnable)).append("\n");
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
