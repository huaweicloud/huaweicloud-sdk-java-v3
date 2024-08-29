package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NetworkSwitchPolicyDTO
 */
public class NetworkSwitchPolicyDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preferred_carrier")

    private Integer preferredCarrier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "least_preferred_carrier")

    private Integer leastPreferredCarrier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optimal_signal")

    private Boolean optimalSignal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_switch")

    private Boolean autoSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_signal_switch")

    private Boolean weakSignalSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_ip")

    private String connectIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_order")

    private String switchOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blacklist")

    private Integer blacklist;

    public NetworkSwitchPolicyDTO withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public NetworkSwitchPolicyDTO withPreferredCarrier(Integer preferredCarrier) {
        this.preferredCarrier = preferredCarrier;
        return this;
    }

    /**
     * 最优选运营商,1:移动、2:电信、3:联通、4:上次使用的运营商
     * minimum: 1
     * maximum: 4
     * @return preferredCarrier
     */
    public Integer getPreferredCarrier() {
        return preferredCarrier;
    }

    public void setPreferredCarrier(Integer preferredCarrier) {
        this.preferredCarrier = preferredCarrier;
    }

    public NetworkSwitchPolicyDTO withLeastPreferredCarrier(Integer leastPreferredCarrier) {
        this.leastPreferredCarrier = leastPreferredCarrier;
        return this;
    }

    /**
     * 最不优选运营商,1:移动、2:电信、3:联通
     * minimum: 1
     * maximum: 3
     * @return leastPreferredCarrier
     */
    public Integer getLeastPreferredCarrier() {
        return leastPreferredCarrier;
    }

    public void setLeastPreferredCarrier(Integer leastPreferredCarrier) {
        this.leastPreferredCarrier = leastPreferredCarrier;
    }

    public NetworkSwitchPolicyDTO withOptimalSignal(Boolean optimalSignal) {
        this.optimalSignal = optimalSignal;
        return this;
    }

    /**
     * 最优信号选取策略是否开启,true:开启,false:不开启
     * @return optimalSignal
     */
    public Boolean getOptimalSignal() {
        return optimalSignal;
    }

    public void setOptimalSignal(Boolean optimalSignal) {
        this.optimalSignal = optimalSignal;
    }

    public NetworkSwitchPolicyDTO withAutoSwitch(Boolean autoSwitch) {
        this.autoSwitch = autoSwitch;
        return this;
    }

    /**
     * 自动切卡是否开启,true:开启,false:不开启
     * @return autoSwitch
     */
    public Boolean getAutoSwitch() {
        return autoSwitch;
    }

    public void setAutoSwitch(Boolean autoSwitch) {
        this.autoSwitch = autoSwitch;
    }

    public NetworkSwitchPolicyDTO withWeakSignalSwitch(Boolean weakSignalSwitch) {
        this.weakSignalSwitch = weakSignalSwitch;
        return this;
    }

    /**
     * 弱信号切换策略是否开启,true:开启,false:不开启
     * @return weakSignalSwitch
     */
    public Boolean getWeakSignalSwitch() {
        return weakSignalSwitch;
    }

    public void setWeakSignalSwitch(Boolean weakSignalSwitch) {
        this.weakSignalSwitch = weakSignalSwitch;
    }

    public NetworkSwitchPolicyDTO withConnectIp(String connectIp) {
        this.connectIp = connectIp;
        return this;
    }

    /**
     * 连接延时切换策略，连接延时时需要ping的ip地址
     * @return connectIp
     */
    public String getConnectIp() {
        return connectIp;
    }

    public void setConnectIp(String connectIp) {
        this.connectIp = connectIp;
    }

    public NetworkSwitchPolicyDTO withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 版本枚举1-SDK版 2-无SDK版
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public NetworkSwitchPolicyDTO withSwitchOrder(String switchOrder) {
        this.switchOrder = switchOrder;
        return this;
    }

    /**
     * 切卡顺序，运营商以英文逗号分隔
     * @return switchOrder
     */
    public String getSwitchOrder() {
        return switchOrder;
    }

    public void setSwitchOrder(String switchOrder) {
        this.switchOrder = switchOrder;
    }

    public NetworkSwitchPolicyDTO withBlacklist(Integer blacklist) {
        this.blacklist = blacklist;
        return this;
    }

    /**
     * 黑名单，只支持单个运营商
     * minimum: 0
     * maximum: 3
     * @return blacklist
     */
    public Integer getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(Integer blacklist) {
        this.blacklist = blacklist;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkSwitchPolicyDTO that = (NetworkSwitchPolicyDTO) obj;
        return Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.preferredCarrier, that.preferredCarrier)
            && Objects.equals(this.leastPreferredCarrier, that.leastPreferredCarrier)
            && Objects.equals(this.optimalSignal, that.optimalSignal)
            && Objects.equals(this.autoSwitch, that.autoSwitch)
            && Objects.equals(this.weakSignalSwitch, that.weakSignalSwitch)
            && Objects.equals(this.connectIp, that.connectIp) && Objects.equals(this.version, that.version)
            && Objects.equals(this.switchOrder, that.switchOrder) && Objects.equals(this.blacklist, that.blacklist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName,
            preferredCarrier,
            leastPreferredCarrier,
            optimalSignal,
            autoSwitch,
            weakSignalSwitch,
            connectIp,
            version,
            switchOrder,
            blacklist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkSwitchPolicyDTO {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    preferredCarrier: ").append(toIndentedString(preferredCarrier)).append("\n");
        sb.append("    leastPreferredCarrier: ").append(toIndentedString(leastPreferredCarrier)).append("\n");
        sb.append("    optimalSignal: ").append(toIndentedString(optimalSignal)).append("\n");
        sb.append("    autoSwitch: ").append(toIndentedString(autoSwitch)).append("\n");
        sb.append("    weakSignalSwitch: ").append(toIndentedString(weakSignalSwitch)).append("\n");
        sb.append("    connectIp: ").append(toIndentedString(connectIp)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    switchOrder: ").append(toIndentedString(switchOrder)).append("\n");
        sb.append("    blacklist: ").append(toIndentedString(blacklist)).append("\n");
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
