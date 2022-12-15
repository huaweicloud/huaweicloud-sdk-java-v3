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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterLoadBalance createClusterLoadBalance = (CreateClusterLoadBalance) o;
        return Objects.equals(this.endpointWithDnsName, createClusterLoadBalance.endpointWithDnsName)
            && Objects.equals(this.vpcPermissions, createClusterLoadBalance.vpcPermissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointWithDnsName, vpcPermissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterLoadBalance {\n");
        sb.append("    endpointWithDnsName: ").append(toIndentedString(endpointWithDnsName)).append("\n");
        sb.append("    vpcPermissions: ").append(toIndentedString(vpcPermissions)).append("\n");
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
