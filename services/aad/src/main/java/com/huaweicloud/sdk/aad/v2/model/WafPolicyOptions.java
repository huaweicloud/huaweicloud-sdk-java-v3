package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WafPolicyOptions
 */
public class WafPolicyOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc")

    private Boolean cc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom")

    private Boolean custom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geoip")

    private Boolean geoip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whiteblackip")

    private Boolean whiteblackip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modulex_enabled")

    private Boolean modulexEnabled;

    public WafPolicyOptions withCc(Boolean cc) {
        this.cc = cc;
        return this;
    }

    /**
     * 是否开启CC（频率控制）
     * @return cc
     */
    public Boolean getCc() {
        return cc;
    }

    public void setCc(Boolean cc) {
        this.cc = cc;
    }

    public WafPolicyOptions withCustom(Boolean custom) {
        this.custom = custom;
        return this;
    }

    /**
     * 是否开启精准访问防护
     * @return custom
     */
    public Boolean getCustom() {
        return custom;
    }

    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    public WafPolicyOptions withGeoip(Boolean geoip) {
        this.geoip = geoip;
        return this;
    }

    /**
     * 是否开启区域封禁防护
     * @return geoip
     */
    public Boolean getGeoip() {
        return geoip;
    }

    public void setGeoip(Boolean geoip) {
        this.geoip = geoip;
    }

    public WafPolicyOptions withWhiteblackip(Boolean whiteblackip) {
        this.whiteblackip = whiteblackip;
        return this;
    }

    /**
     * 是否开启黑白名单防护
     * @return whiteblackip
     */
    public Boolean getWhiteblackip() {
        return whiteblackip;
    }

    public void setWhiteblackip(Boolean whiteblackip) {
        this.whiteblackip = whiteblackip;
    }

    public WafPolicyOptions withModulexEnabled(Boolean modulexEnabled) {
        this.modulexEnabled = modulexEnabled;
        return this;
    }

    /**
     * 是否开启智能CC防护
     * @return modulexEnabled
     */
    public Boolean getModulexEnabled() {
        return modulexEnabled;
    }

    public void setModulexEnabled(Boolean modulexEnabled) {
        this.modulexEnabled = modulexEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WafPolicyOptions that = (WafPolicyOptions) obj;
        return Objects.equals(this.cc, that.cc) && Objects.equals(this.custom, that.custom)
            && Objects.equals(this.geoip, that.geoip) && Objects.equals(this.whiteblackip, that.whiteblackip)
            && Objects.equals(this.modulexEnabled, that.modulexEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cc, custom, geoip, whiteblackip, modulexEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WafPolicyOptions {\n");
        sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
        sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
        sb.append("    geoip: ").append(toIndentedString(geoip)).append("\n");
        sb.append("    whiteblackip: ").append(toIndentedString(whiteblackip)).append("\n");
        sb.append("    modulexEnabled: ").append(toIndentedString(modulexEnabled)).append("\n");
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
