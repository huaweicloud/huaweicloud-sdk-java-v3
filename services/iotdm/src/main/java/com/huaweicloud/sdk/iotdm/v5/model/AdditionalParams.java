package com.huaweicloud.sdk.iotdm.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 企业版附加参数信息。 
 */
public class AdditionalParams {

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
    @JsonProperty(value = "smn_topic_urn")

    private String smnTopicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ciphering_algorithm")

    private String cipheringAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_info")

    private Port portInfo;

    public AdditionalParams withVpcId(String vpcId) {
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

    public AdditionalParams withSubnetId(String subnetId) {
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

    public AdditionalParams withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * **参数说明**：企业版实例的安全组ID。请确保所选安全组已放通22端口（Linux SSH登录），3389端口（Windows远程登录）和ICMP协议（Ping）。 
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public AdditionalParams withSmnTopicUrn(String smnTopicUrn) {
        this.smnTopicUrn = smnTopicUrn;
        return this;
    }

    /**
     * **参数说明**：SMN的topic urn, 当企业版实例创建成功时，平台将通过该topic发送通知。 
     * @return smnTopicUrn
     */
    public String getSmnTopicUrn() {
        return smnTopicUrn;
    }

    public void setSmnTopicUrn(String smnTopicUrn) {
        this.smnTopicUrn = smnTopicUrn;
    }

    public AdditionalParams withCipheringAlgorithm(String cipheringAlgorithm) {
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

    public AdditionalParams withPortInfo(Port portInfo) {
        this.portInfo = portInfo;
        return this;
    }

    public AdditionalParams withPortInfo(Consumer<Port> portInfoSetter) {
        if (this.portInfo == null) {
            this.portInfo = new Port();
            portInfoSetter.accept(this.portInfo);
        }

        return this;
    }

    /**
     * Get portInfo
     * @return portInfo
     */
    public Port getPortInfo() {
        return portInfo;
    }

    public void setPortInfo(Port portInfo) {
        this.portInfo = portInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdditionalParams that = (AdditionalParams) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.smnTopicUrn, that.smnTopicUrn)
            && Objects.equals(this.cipheringAlgorithm, that.cipheringAlgorithm)
            && Objects.equals(this.portInfo, that.portInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, subnetId, securityGroupId, smnTopicUrn, cipheringAlgorithm, portInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdditionalParams {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    smnTopicUrn: ").append(toIndentedString(smnTopicUrn)).append("\n");
        sb.append("    cipheringAlgorithm: ").append(toIndentedString(cipheringAlgorithm)).append("\n");
        sb.append("    portInfo: ").append(toIndentedString(portInfo)).append("\n");
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
