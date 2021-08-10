package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 添加网卡请求体 */
public class AddNicsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<BaseId> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nic_num")

    private Integer nicNum;

    public AddNicsRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** 虚拟私有云ID。
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public AddNicsRequestBody withSecurityGroups(List<BaseId> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public AddNicsRequestBody addSecurityGroupsItem(BaseId securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public AddNicsRequestBody withSecurityGroups(Consumer<List<BaseId>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /** 安全组ID列表。
     * 
     * @return securityGroups */
    public List<BaseId> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<BaseId> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public AddNicsRequestBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /** 子网ID。 当subnet_id提供时，则在该子网下创建nic_num个网卡； 不输入，则自动分配subnet。 当添加网卡的VPC为手动规划VPC时，subnet_id必填。
     * 
     * @return subnetId */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public AddNicsRequestBody withNicNum(Integer nicNum) {
        this.nicNum = nicNum;
        return this;
    }

    /** 待添加网卡数量。 minimum: 1
     * 
     * @return nicNum */
    public Integer getNicNum() {
        return nicNum;
    }

    public void setNicNum(Integer nicNum) {
        this.nicNum = nicNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddNicsRequestBody addNicsRequestBody = (AddNicsRequestBody) o;
        return Objects.equals(this.vpcId, addNicsRequestBody.vpcId)
            && Objects.equals(this.securityGroups, addNicsRequestBody.securityGroups)
            && Objects.equals(this.subnetId, addNicsRequestBody.subnetId)
            && Objects.equals(this.nicNum, addNicsRequestBody.nicNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, securityGroups, subnetId, nicNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddNicsRequestBody {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    nicNum: ").append(toIndentedString(nicNum)).append("\n");
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
