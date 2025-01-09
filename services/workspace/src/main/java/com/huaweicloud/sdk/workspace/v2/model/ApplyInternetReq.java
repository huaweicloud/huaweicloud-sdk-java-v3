package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApplyInternetReq
 */
public class ApplyInternetReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_spec")

    private String natSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_charge_mode")

    private String eipChargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Integer bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_type")

    private String eipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_id")

    private String natId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_name")

    private String natName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_name")

    private String eipName;

    public ApplyInternetReq withNatSpec(String natSpec) {
        this.natSpec = natSpec;
        return this;
    }

    /**
     * 公网NAT网关的规格，1：小型，2：中型，3：大型，4：超大型
     * @return natSpec
     */
    public String getNatSpec() {
        return natSpec;
    }

    public void setNatSpec(String natSpec) {
        this.natSpec = natSpec;
    }

    public ApplyInternetReq withEipChargeMode(String eipChargeMode) {
        this.eipChargeMode = eipChargeMode;
        return this;
    }

    /**
     * traffic（按流量计费），bandwidth（按带宽计费）
     * @return eipChargeMode
     */
    public String getEipChargeMode() {
        return eipChargeMode;
    }

    public void setEipChargeMode(String eipChargeMode) {
        this.eipChargeMode = eipChargeMode;
    }

    public ApplyInternetReq withBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 带宽大小
     * minimum: 1
     * maximum: 2000
     * @return bandwidthSize
     */
    public Integer getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public ApplyInternetReq withEipType(String eipType) {
        this.eipType = eipType;
        return this;
    }

    /**
     * EIP的类型，5_bgp（全动态BGP），5_sbgp（静态BGP），默认值：5_bgp
     * @return eipType
     */
    public String getEipType() {
        return eipType;
    }

    public void setEipType(String eipType) {
        this.eipType = eipType;
    }

    public ApplyInternetReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * vpc的id
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ApplyInternetReq withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网的id
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ApplyInternetReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，默认\"0\"
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ApplyInternetReq withNatId(String natId) {
        this.natId = natId;
        return this;
    }

    /**
     * nat的id，有传则使用该NAT，否则新建
     * @return natId
     */
    public String getNatId() {
        return natId;
    }

    public void setNatId(String natId) {
        this.natId = natId;
    }

    public ApplyInternetReq withNatName(String natName) {
        this.natName = natName;
        return this;
    }

    /**
     * nat名称，默认值：nat-workspace
     * @return natName
     */
    public String getNatName() {
        return natName;
    }

    public void setNatName(String natName) {
        this.natName = natName;
    }

    public ApplyInternetReq withEipName(String eipName) {
        this.eipName = eipName;
        return this;
    }

    /**
     * eip名称，默认值：eip-workspace
     * @return eipName
     */
    public String getEipName() {
        return eipName;
    }

    public void setEipName(String eipName) {
        this.eipName = eipName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyInternetReq that = (ApplyInternetReq) obj;
        return Objects.equals(this.natSpec, that.natSpec) && Objects.equals(this.eipChargeMode, that.eipChargeMode)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize) && Objects.equals(this.eipType, that.eipType)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.natId, that.natId) && Objects.equals(this.natName, that.natName)
            && Objects.equals(this.eipName, that.eipName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natSpec,
            eipChargeMode,
            bandwidthSize,
            eipType,
            vpcId,
            subnetId,
            enterpriseProjectId,
            natId,
            natName,
            eipName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyInternetReq {\n");
        sb.append("    natSpec: ").append(toIndentedString(natSpec)).append("\n");
        sb.append("    eipChargeMode: ").append(toIndentedString(eipChargeMode)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    eipType: ").append(toIndentedString(eipType)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    natId: ").append(toIndentedString(natId)).append("\n");
        sb.append("    natName: ").append(toIndentedString(natName)).append("\n");
        sb.append("    eipName: ").append(toIndentedString(eipName)).append("\n");
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
