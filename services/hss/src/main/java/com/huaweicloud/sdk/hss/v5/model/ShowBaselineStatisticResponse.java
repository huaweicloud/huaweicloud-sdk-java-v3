package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowBaselineStatisticResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_weak_pwd")

    private Long hostWeakPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_policy")

    private Long pwdPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_check")

    private Long securityCheck;

    public ShowBaselineStatisticResponse withHostWeakPwd(Long hostWeakPwd) {
        this.hostWeakPwd = hostWeakPwd;
        return this;
    }

    /**
     * **参数解释**: 弱口令检测数量 **取值范围**: 取值0-9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return hostWeakPwd
     */
    public Long getHostWeakPwd() {
        return hostWeakPwd;
    }

    public void setHostWeakPwd(Long hostWeakPwd) {
        this.hostWeakPwd = hostWeakPwd;
    }

    public ShowBaselineStatisticResponse withPwdPolicy(Long pwdPolicy) {
        this.pwdPolicy = pwdPolicy;
        return this;
    }

    /**
     * **参数解释**: 口令复杂度策略检测数量 **取值范围**: 取值0-9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return pwdPolicy
     */
    public Long getPwdPolicy() {
        return pwdPolicy;
    }

    public void setPwdPolicy(Long pwdPolicy) {
        this.pwdPolicy = pwdPolicy;
    }

    public ShowBaselineStatisticResponse withSecurityCheck(Long securityCheck) {
        this.securityCheck = securityCheck;
        return this;
    }

    /**
     * **参数解释**: 服务器配置检测数量 **取值范围**: 取值0-9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return securityCheck
     */
    public Long getSecurityCheck() {
        return securityCheck;
    }

    public void setSecurityCheck(Long securityCheck) {
        this.securityCheck = securityCheck;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBaselineStatisticResponse that = (ShowBaselineStatisticResponse) obj;
        return Objects.equals(this.hostWeakPwd, that.hostWeakPwd) && Objects.equals(this.pwdPolicy, that.pwdPolicy)
            && Objects.equals(this.securityCheck, that.securityCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostWeakPwd, pwdPolicy, securityCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBaselineStatisticResponse {\n");
        sb.append("    hostWeakPwd: ").append(toIndentedString(hostWeakPwd)).append("\n");
        sb.append("    pwdPolicy: ").append(toIndentedString(pwdPolicy)).append("\n");
        sb.append("    securityCheck: ").append(toIndentedString(securityCheck)).append("\n");
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
