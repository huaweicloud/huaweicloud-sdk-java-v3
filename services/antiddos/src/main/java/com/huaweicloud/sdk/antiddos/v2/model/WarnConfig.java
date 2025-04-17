package com.huaweicloud.sdk.antiddos.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 告警配置信息。
 */
public class WarnConfig {

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

    /**
     * 取值范围： - 0：表示每天一次 - 1：表示半小时一次  对于HID必选。
     */
    public static final class SendFrequencyEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final SendFrequencyEnum NUMBER_0 = new SendFrequencyEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final SendFrequencyEnum NUMBER_1 = new SendFrequencyEnum(1);

        private static final Map<Integer, SendFrequencyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, SendFrequencyEnum> createStaticFields() {
            Map<Integer, SendFrequencyEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        SendFrequencyEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SendFrequencyEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SendFrequencyEnum(value));
        }

        public static SendFrequencyEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SendFrequencyEnum) {
                return this.value.equals(((SendFrequencyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_frequency")

    private SendFrequencyEnum sendFrequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf")

    private Boolean waf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_password")

    private Boolean weakPassword;

    public WarnConfig withAntiDDoS(Boolean antiDDoS) {
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

    public WarnConfig withBackDoors(Boolean backDoors) {
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

    public WarnConfig withBruceForce(Boolean bruceForce) {
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

    public WarnConfig withHighPrivilege(Boolean highPrivilege) {
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

    public WarnConfig withRemoteLogin(Boolean remoteLogin) {
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

    public WarnConfig withSendFrequency(SendFrequencyEnum sendFrequency) {
        this.sendFrequency = sendFrequency;
        return this;
    }

    /**
     * 取值范围： - 0：表示每天一次 - 1：表示半小时一次  对于HID必选。
     * @return sendFrequency
     */
    public SendFrequencyEnum getSendFrequency() {
        return sendFrequency;
    }

    public void setSendFrequency(SendFrequencyEnum sendFrequency) {
        this.sendFrequency = sendFrequency;
    }

    public WarnConfig withWaf(Boolean waf) {
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

    public WarnConfig withWeakPassword(Boolean weakPassword) {
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
        WarnConfig that = (WarnConfig) obj;
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
        sb.append("class WarnConfig {\n");
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
