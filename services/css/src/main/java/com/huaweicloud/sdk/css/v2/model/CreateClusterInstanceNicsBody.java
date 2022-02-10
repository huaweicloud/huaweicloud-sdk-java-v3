package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 子网信息。 */
public class CreateClusterInstanceNicsBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcId")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "netId")

    private String netId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securityGroupId")

    private String securityGroupId;

    public CreateClusterInstanceNicsBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** 指定虚拟私有云ID，用于集群网络配置。
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateClusterInstanceNicsBody withNetId(String netId) {
        this.netId = netId;
        return this;
    }

    /** 子网ID(网络ID)，其中一个搜索集群所有实例的子网和安全组必须相同。
     * 
     * @return netId */
    public String getNetId() {
        return netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }

    public CreateClusterInstanceNicsBody withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /** 安全组ID，其中一个搜索集群所有实例的子网和安全组必须相同。
     * 
     * @return securityGroupId */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterInstanceNicsBody createClusterInstanceNicsBody = (CreateClusterInstanceNicsBody) o;
        return Objects.equals(this.vpcId, createClusterInstanceNicsBody.vpcId)
            && Objects.equals(this.netId, createClusterInstanceNicsBody.netId)
            && Objects.equals(this.securityGroupId, createClusterInstanceNicsBody.securityGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, netId, securityGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterInstanceNicsBody {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
