package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowImageBaselineStatisticResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_weak_pwd")

    private Integer imageWeakPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_policy")

    private Integer pwdPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_check")

    private Integer securityCheck;

    public ShowImageBaselineStatisticResponse withImageWeakPwd(Integer imageWeakPwd) {
        this.imageWeakPwd = imageWeakPwd;
        return this;
    }

    /**
     * **参数解释**: 弱口令检测 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return imageWeakPwd
     */
    public Integer getImageWeakPwd() {
        return imageWeakPwd;
    }

    public void setImageWeakPwd(Integer imageWeakPwd) {
        this.imageWeakPwd = imageWeakPwd;
    }

    public ShowImageBaselineStatisticResponse withPwdPolicy(Integer pwdPolicy) {
        this.pwdPolicy = pwdPolicy;
        return this;
    }

    /**
     * **参数解释**: 口令复杂度策略检测 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return pwdPolicy
     */
    public Integer getPwdPolicy() {
        return pwdPolicy;
    }

    public void setPwdPolicy(Integer pwdPolicy) {
        this.pwdPolicy = pwdPolicy;
    }

    public ShowImageBaselineStatisticResponse withSecurityCheck(Integer securityCheck) {
        this.securityCheck = securityCheck;
        return this;
    }

    /**
     * **参数解释**: 服务器配置检测 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return securityCheck
     */
    public Integer getSecurityCheck() {
        return securityCheck;
    }

    public void setSecurityCheck(Integer securityCheck) {
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
        ShowImageBaselineStatisticResponse that = (ShowImageBaselineStatisticResponse) obj;
        return Objects.equals(this.imageWeakPwd, that.imageWeakPwd) && Objects.equals(this.pwdPolicy, that.pwdPolicy)
            && Objects.equals(this.securityCheck, that.securityCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageWeakPwd, pwdPolicy, securityCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageBaselineStatisticResponse {\n");
        sb.append("    imageWeakPwd: ").append(toIndentedString(imageWeakPwd)).append("\n");
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
