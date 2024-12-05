package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SimDeviceMultiplyVO
 */
public class SimDeviceMultiplyVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_id")

    private Long simCardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cid")

    private String cid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_carrier")

    private Integer onlineCarrier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_switch_policy_id")

    private Long networkSwitchPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iccid_mobile")

    private String iccidMobile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iccid_unicom")

    private String iccidUnicom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iccid_telcom")

    private String iccidTelcom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private Long orderId;

    public SimDeviceMultiplyVO withSimCardId(Long simCardId) {
        this.simCardId = simCardId;
        return this;
    }

    /**
     * sim卡id
     * @return simCardId
     */
    public Long getSimCardId() {
        return simCardId;
    }

    public void setSimCardId(Long simCardId) {
        this.simCardId = simCardId;
    }

    public SimDeviceMultiplyVO withCid(String cid) {
        this.cid = cid;
        return this;
    }

    /**
     * 三网卡标识
     * @return cid
     */
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public SimDeviceMultiplyVO withOnlineCarrier(Integer onlineCarrier) {
        this.onlineCarrier = onlineCarrier;
        return this;
    }

    /**
     * 在线运营商标识
     * @return onlineCarrier
     */
    public Integer getOnlineCarrier() {
        return onlineCarrier;
    }

    public void setOnlineCarrier(Integer onlineCarrier) {
        this.onlineCarrier = onlineCarrier;
    }

    public SimDeviceMultiplyVO withNetworkSwitchPolicyId(Long networkSwitchPolicyId) {
        this.networkSwitchPolicyId = networkSwitchPolicyId;
        return this;
    }

    /**
     * 网络切换策略id
     * @return networkSwitchPolicyId
     */
    public Long getNetworkSwitchPolicyId() {
        return networkSwitchPolicyId;
    }

    public void setNetworkSwitchPolicyId(Long networkSwitchPolicyId) {
        this.networkSwitchPolicyId = networkSwitchPolicyId;
    }

    public SimDeviceMultiplyVO withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 网络切换策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public SimDeviceMultiplyVO withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 版本信息
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public SimDeviceMultiplyVO withIccidMobile(String iccidMobile) {
        this.iccidMobile = iccidMobile;
        return this;
    }

    /**
     * 移动网络iccid
     * @return iccidMobile
     */
    public String getIccidMobile() {
        return iccidMobile;
    }

    public void setIccidMobile(String iccidMobile) {
        this.iccidMobile = iccidMobile;
    }

    public SimDeviceMultiplyVO withIccidUnicom(String iccidUnicom) {
        this.iccidUnicom = iccidUnicom;
        return this;
    }

    /**
     * 联通网络iccid
     * @return iccidUnicom
     */
    public String getIccidUnicom() {
        return iccidUnicom;
    }

    public void setIccidUnicom(String iccidUnicom) {
        this.iccidUnicom = iccidUnicom;
    }

    public SimDeviceMultiplyVO withIccidTelcom(String iccidTelcom) {
        this.iccidTelcom = iccidTelcom;
        return this;
    }

    /**
     * 电信网络iccid
     * @return iccidTelcom
     */
    public String getIccidTelcom() {
        return iccidTelcom;
    }

    public void setIccidTelcom(String iccidTelcom) {
        this.iccidTelcom = iccidTelcom;
    }

    public SimDeviceMultiplyVO withOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 批次号
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimDeviceMultiplyVO that = (SimDeviceMultiplyVO) obj;
        return Objects.equals(this.simCardId, that.simCardId) && Objects.equals(this.cid, that.cid)
            && Objects.equals(this.onlineCarrier, that.onlineCarrier)
            && Objects.equals(this.networkSwitchPolicyId, that.networkSwitchPolicyId)
            && Objects.equals(this.policyName, that.policyName) && Objects.equals(this.version, that.version)
            && Objects.equals(this.iccidMobile, that.iccidMobile) && Objects.equals(this.iccidUnicom, that.iccidUnicom)
            && Objects.equals(this.iccidTelcom, that.iccidTelcom) && Objects.equals(this.orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simCardId,
            cid,
            onlineCarrier,
            networkSwitchPolicyId,
            policyName,
            version,
            iccidMobile,
            iccidUnicom,
            iccidTelcom,
            orderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimDeviceMultiplyVO {\n");
        sb.append("    simCardId: ").append(toIndentedString(simCardId)).append("\n");
        sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
        sb.append("    onlineCarrier: ").append(toIndentedString(onlineCarrier)).append("\n");
        sb.append("    networkSwitchPolicyId: ").append(toIndentedString(networkSwitchPolicyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    iccidMobile: ").append(toIndentedString(iccidMobile)).append("\n");
        sb.append("    iccidUnicom: ").append(toIndentedString(iccidUnicom)).append("\n");
        sb.append("    iccidTelcom: ").append(toIndentedString(iccidTelcom)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
