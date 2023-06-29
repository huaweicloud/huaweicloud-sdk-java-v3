package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 告警配置信息
 */
public class AlertConfigRespWarnConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "antiDDoS")

    private Boolean antiDDoS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "back_doors")

    private Boolean backDoors;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bruce_force")

    private Boolean bruceForce;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_privilege")

    private Boolean highPrivilege;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_login")

    private Boolean remoteLogin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_frequency")

    private Integer sendFrequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf")

    private Boolean waf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_password")

    private Boolean weakPassword;

    public AlertConfigRespWarnConfig withAntiDDoS(Boolean antiDDoS) {
        this.antiDDoS = antiDDoS;
        return this;
    }

    /**
     * DDoS攻击
     * @return antiDDoS
     */
    public Boolean getAntiDDoS() {
        return antiDDoS;
    }

    public void setAntiDDoS(Boolean antiDDoS) {
        this.antiDDoS = antiDDoS;
    }

    public AlertConfigRespWarnConfig withBackDoors(Boolean backDoors) {
        this.backDoors = backDoors;
        return this;
    }

    /**
     * 网页后门
     * @return backDoors
     */
    public Boolean getBackDoors() {
        return backDoors;
    }

    public void setBackDoors(Boolean backDoors) {
        this.backDoors = backDoors;
    }

    public AlertConfigRespWarnConfig withBruceForce(Boolean bruceForce) {
        this.bruceForce = bruceForce;
        return this;
    }

    /**
     * 暴力破解（系统登录，FTP，DB）
     * @return bruceForce
     */
    public Boolean getBruceForce() {
        return bruceForce;
    }

    public void setBruceForce(Boolean bruceForce) {
        this.bruceForce = bruceForce;
    }

    public AlertConfigRespWarnConfig withHighPrivilege(Boolean highPrivilege) {
        this.highPrivilege = highPrivilege;
        return this;
    }

    /**
     * 数据库进程权限过高
     * @return highPrivilege
     */
    public Boolean getHighPrivilege() {
        return highPrivilege;
    }

    public void setHighPrivilege(Boolean highPrivilege) {
        this.highPrivilege = highPrivilege;
    }

    public AlertConfigRespWarnConfig withRemoteLogin(Boolean remoteLogin) {
        this.remoteLogin = remoteLogin;
        return this;
    }

    /**
     * 异地登录提醒
     * @return remoteLogin
     */
    public Boolean getRemoteLogin() {
        return remoteLogin;
    }

    public void setRemoteLogin(Boolean remoteLogin) {
        this.remoteLogin = remoteLogin;
    }

    public AlertConfigRespWarnConfig withSendFrequency(Integer sendFrequency) {
        this.sendFrequency = sendFrequency;
        return this;
    }

    /**
     * 取值范围： - 0：表示每天一次 - 1：表示半小时一次  对于HID必选。
     * @return sendFrequency
     */
    public Integer getSendFrequency() {
        return sendFrequency;
    }

    public void setSendFrequency(Integer sendFrequency) {
        this.sendFrequency = sendFrequency;
    }

    public AlertConfigRespWarnConfig withWaf(Boolean waf) {
        this.waf = waf;
        return this;
    }

    /**
     * 保留字段
     * @return waf
     */
    public Boolean getWaf() {
        return waf;
    }

    public void setWaf(Boolean waf) {
        this.waf = waf;
    }

    public AlertConfigRespWarnConfig withWeakPassword(Boolean weakPassword) {
        this.weakPassword = weakPassword;
        return this;
    }

    /**
     * 弱口令（系统，数据库）
     * @return weakPassword
     */
    public Boolean getWeakPassword() {
        return weakPassword;
    }

    public void setWeakPassword(Boolean weakPassword) {
        this.weakPassword = weakPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertConfigRespWarnConfig that = (AlertConfigRespWarnConfig) obj;
        return Objects.equals(this.antiDDoS, that.antiDDoS) && Objects.equals(this.backDoors, that.backDoors)
            && Objects.equals(this.bruceForce, that.bruceForce)
            && Objects.equals(this.highPrivilege, that.highPrivilege)
            && Objects.equals(this.remoteLogin, that.remoteLogin)
            && Objects.equals(this.sendFrequency, that.sendFrequency) && Objects.equals(this.waf, that.waf)
            && Objects.equals(this.weakPassword, that.weakPassword);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(antiDDoS, backDoors, bruceForce, highPrivilege, remoteLogin, sendFrequency, waf, weakPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertConfigRespWarnConfig {\n");
        sb.append("    antiDDoS: ").append(toIndentedString(antiDDoS)).append("\n");
        sb.append("    backDoors: ").append(toIndentedString(backDoors)).append("\n");
        sb.append("    bruceForce: ").append(toIndentedString(bruceForce)).append("\n");
        sb.append("    highPrivilege: ").append(toIndentedString(highPrivilege)).append("\n");
        sb.append("    remoteLogin: ").append(toIndentedString(remoteLogin)).append("\n");
        sb.append("    sendFrequency: ").append(toIndentedString(sendFrequency)).append("\n");
        sb.append("    waf: ").append(toIndentedString(waf)).append("\n");
        sb.append("    weakPassword: ").append(toIndentedString(weakPassword)).append("\n");
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
