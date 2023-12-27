package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CadDomainSwitchRequest
 */
public class CadDomainSwitchRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_switch")

    private Integer wafSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc_switch")

    private Integer ccSwitch;

    public CadDomainSwitchRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 域名id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CadDomainSwitchRequest withWafSwitch(Integer wafSwitch) {
        this.wafSwitch = wafSwitch;
        return this;
    }

    /**
     * 是否开启WEB基础防护开关。0 - 开启， 1 - 关闭
     * @return wafSwitch
     */
    public Integer getWafSwitch() {
        return wafSwitch;
    }

    public void setWafSwitch(Integer wafSwitch) {
        this.wafSwitch = wafSwitch;
    }

    public CadDomainSwitchRequest withCcSwitch(Integer ccSwitch) {
        this.ccSwitch = ccSwitch;
        return this;
    }

    /**
     * 是否开启CC防护开关。0 - 开启， 1 - 关闭。开启CC开关必须同时开启WEB基础防护开关
     * @return ccSwitch
     */
    public Integer getCcSwitch() {
        return ccSwitch;
    }

    public void setCcSwitch(Integer ccSwitch) {
        this.ccSwitch = ccSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CadDomainSwitchRequest that = (CadDomainSwitchRequest) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.wafSwitch, that.wafSwitch)
            && Objects.equals(this.ccSwitch, that.ccSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, wafSwitch, ccSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CadDomainSwitchRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    wafSwitch: ").append(toIndentedString(wafSwitch)).append("\n");
        sb.append("    ccSwitch: ").append(toIndentedString(ccSwitch)).append("\n");
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
