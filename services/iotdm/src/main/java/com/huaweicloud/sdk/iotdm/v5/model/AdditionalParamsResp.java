package com.huaweicloud.sdk.iotdm.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 企业版附加参数信息。 
 */
public class AdditionalParamsResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ciphering_algorithm")

    private String cipheringAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forwarding_info")

    private ForwardingInfo forwardingInfo;

    public AdditionalParamsResp withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数说明**：企业版实例的VPCID。 
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public AdditionalParamsResp withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数说明**：企业版实例的子网ID。 
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public AdditionalParamsResp withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * **参数说明**：企业版实例的安全组ID。 
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public AdditionalParamsResp withCipheringAlgorithm(String cipheringAlgorithm) {
        this.cipheringAlgorithm = cipheringAlgorithm;
        return this;
    }

    /**
     * **参数说明**：实例支持的加密算法。 **取值范围**： - COMMON_ALGORITHM: 通用加密算法（支持RSA，SHA256等国际通用的密码算法） - SM_ALGORITHM: 支持SM系列商密算法（支持SM2，SM3，SM4等国密算法） 
     * @return cipheringAlgorithm
     */
    public String getCipheringAlgorithm() {
        return cipheringAlgorithm;
    }

    public void setCipheringAlgorithm(String cipheringAlgorithm) {
        this.cipheringAlgorithm = cipheringAlgorithm;
    }

    public AdditionalParamsResp withForwardingInfo(ForwardingInfo forwardingInfo) {
        this.forwardingInfo = forwardingInfo;
        return this;
    }

    public AdditionalParamsResp withForwardingInfo(Consumer<ForwardingInfo> forwardingInfoSetter) {
        if (this.forwardingInfo == null) {
            this.forwardingInfo = new ForwardingInfo();
            forwardingInfoSetter.accept(this.forwardingInfo);
        }

        return this;
    }

    /**
     * Get forwardingInfo
     * @return forwardingInfo
     */
    public ForwardingInfo getForwardingInfo() {
        return forwardingInfo;
    }

    public void setForwardingInfo(ForwardingInfo forwardingInfo) {
        this.forwardingInfo = forwardingInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdditionalParamsResp that = (AdditionalParamsResp) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.cipheringAlgorithm, that.cipheringAlgorithm)
            && Objects.equals(this.forwardingInfo, that.forwardingInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, subnetId, securityGroupId, cipheringAlgorithm, forwardingInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdditionalParamsResp {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    cipheringAlgorithm: ").append(toIndentedString(cipheringAlgorithm)).append("\n");
        sb.append("    forwardingInfo: ").append(toIndentedString(forwardingInfo)).append("\n");
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
