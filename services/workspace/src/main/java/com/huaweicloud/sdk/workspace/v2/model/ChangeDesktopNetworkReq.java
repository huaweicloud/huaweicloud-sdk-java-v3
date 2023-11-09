package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 切换桌面网络请求体
 */
public class ChangeDesktopNetworkReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_ids")

    private List<String> securityGroupIds = null;

    public ChangeDesktopNetworkReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 待切换VPC的ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ChangeDesktopNetworkReq withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 待切换子网的ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ChangeDesktopNetworkReq withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 指定私有IP地址
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ChangeDesktopNetworkReq withSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public ChangeDesktopNetworkReq addSecurityGroupIdsItem(String securityGroupIdsItem) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        this.securityGroupIds.add(securityGroupIdsItem);
        return this;
    }

    public ChangeDesktopNetworkReq withSecurityGroupIds(Consumer<List<String>> securityGroupIdsSetter) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        securityGroupIdsSetter.accept(this.securityGroupIds);
        return this;
    }

    /**
     * 安全组ID列表
     * @return securityGroupIds
     */
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeDesktopNetworkReq that = (ChangeDesktopNetworkReq) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.securityGroupIds, that.securityGroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, subnetId, privateIp, securityGroupIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeDesktopNetworkReq {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
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
