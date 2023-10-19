package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MemberGroupCreate
 */
public class MemberGroupCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_name")

    private String memberGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_remark")

    private String memberGroupRemark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_weight")

    private Integer memberGroupWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_code")

    private String dictCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "microservice_version")

    private String microserviceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "microservice_port")

    private Integer microservicePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "microservice_labels")

    private List<MicroserviceLabel> microserviceLabels = null;

    public MemberGroupCreate withMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
        return this;
    }

    /**
     * VPC通道后端服务器组名称。支持汉字、英文、数字、下划线、中划线、点，且只能以英文和汉字开头，3-64字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return memberGroupName
     */
    public String getMemberGroupName() {
        return memberGroupName;
    }

    public void setMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
    }

    public MemberGroupCreate withMemberGroupRemark(String memberGroupRemark) {
        this.memberGroupRemark = memberGroupRemark;
        return this;
    }

    /**
     * VPC通道后端服务器组描述。
     * @return memberGroupRemark
     */
    public String getMemberGroupRemark() {
        return memberGroupRemark;
    }

    public void setMemberGroupRemark(String memberGroupRemark) {
        this.memberGroupRemark = memberGroupRemark;
    }

    public MemberGroupCreate withMemberGroupWeight(Integer memberGroupWeight) {
        this.memberGroupWeight = memberGroupWeight;
        return this;
    }

    /**
     * VPC通道后端服务器组权重值。  当前服务器组存在服务器且此权重值存在时，自动使用此权重值分配权重。
     * minimum: 0
     * maximum: 100
     * @return memberGroupWeight
     */
    public Integer getMemberGroupWeight() {
        return memberGroupWeight;
    }

    public void setMemberGroupWeight(Integer memberGroupWeight) {
        this.memberGroupWeight = memberGroupWeight;
    }

    public MemberGroupCreate withDictCode(String dictCode) {
        this.dictCode = dictCode;
        return this;
    }

    /**
     * VPC通道后端服务器组的字典编码  支持英文，数字，特殊字符（-_.）  暂不支持
     * @return dictCode
     */
    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public MemberGroupCreate withMicroserviceVersion(String microserviceVersion) {
        this.microserviceVersion = microserviceVersion;
        return this;
    }

    /**
     * VPC通道后端服务器组的版本，仅VPC通道类型为微服务时支持。
     * @return microserviceVersion
     */
    public String getMicroserviceVersion() {
        return microserviceVersion;
    }

    public void setMicroserviceVersion(String microserviceVersion) {
        this.microserviceVersion = microserviceVersion;
    }

    public MemberGroupCreate withMicroservicePort(Integer microservicePort) {
        this.microservicePort = microservicePort;
        return this;
    }

    /**
     * VPC通道后端服务器组的端口号，仅VPC通道类型为微服务时支持。端口号为0时后端服务器组下的所有地址沿用原来负载端口继承逻辑。
     * minimum: 0
     * maximum: 65535
     * @return microservicePort
     */
    public Integer getMicroservicePort() {
        return microservicePort;
    }

    public void setMicroservicePort(Integer microservicePort) {
        this.microservicePort = microservicePort;
    }

    public MemberGroupCreate withMicroserviceLabels(List<MicroserviceLabel> microserviceLabels) {
        this.microserviceLabels = microserviceLabels;
        return this;
    }

    public MemberGroupCreate addMicroserviceLabelsItem(MicroserviceLabel microserviceLabelsItem) {
        if (this.microserviceLabels == null) {
            this.microserviceLabels = new ArrayList<>();
        }
        this.microserviceLabels.add(microserviceLabelsItem);
        return this;
    }

    public MemberGroupCreate withMicroserviceLabels(Consumer<List<MicroserviceLabel>> microserviceLabelsSetter) {
        if (this.microserviceLabels == null) {
            this.microserviceLabels = new ArrayList<>();
        }
        microserviceLabelsSetter.accept(this.microserviceLabels);
        return this;
    }

    /**
     * VPC通道后端服务器组的标签，仅VPC通道类型为微服务时支持。
     * @return microserviceLabels
     */
    public List<MicroserviceLabel> getMicroserviceLabels() {
        return microserviceLabels;
    }

    public void setMicroserviceLabels(List<MicroserviceLabel> microserviceLabels) {
        this.microserviceLabels = microserviceLabels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberGroupCreate that = (MemberGroupCreate) obj;
        return Objects.equals(this.memberGroupName, that.memberGroupName)
            && Objects.equals(this.memberGroupRemark, that.memberGroupRemark)
            && Objects.equals(this.memberGroupWeight, that.memberGroupWeight)
            && Objects.equals(this.dictCode, that.dictCode)
            && Objects.equals(this.microserviceVersion, that.microserviceVersion)
            && Objects.equals(this.microservicePort, that.microservicePort)
            && Objects.equals(this.microserviceLabels, that.microserviceLabels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberGroupName,
            memberGroupRemark,
            memberGroupWeight,
            dictCode,
            microserviceVersion,
            microservicePort,
            microserviceLabels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberGroupCreate {\n");
        sb.append("    memberGroupName: ").append(toIndentedString(memberGroupName)).append("\n");
        sb.append("    memberGroupRemark: ").append(toIndentedString(memberGroupRemark)).append("\n");
        sb.append("    memberGroupWeight: ").append(toIndentedString(memberGroupWeight)).append("\n");
        sb.append("    dictCode: ").append(toIndentedString(dictCode)).append("\n");
        sb.append("    microserviceVersion: ").append(toIndentedString(microserviceVersion)).append("\n");
        sb.append("    microservicePort: ").append(toIndentedString(microservicePort)).append("\n");
        sb.append("    microserviceLabels: ").append(toIndentedString(microserviceLabels)).append("\n");
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
