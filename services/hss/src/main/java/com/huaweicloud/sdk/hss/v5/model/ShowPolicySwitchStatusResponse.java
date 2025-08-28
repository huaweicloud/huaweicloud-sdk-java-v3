package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowPolicySwitchStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    public ShowPolicySwitchStatusResponse withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * **参数解释**： 策略名称 **取值范围**： 字符长度1-128位 
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ShowPolicySwitchStatusResponse withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释**： 策略总开关是否开启 **取值范围**： - true：是。 - false：否。 
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPolicySwitchStatusResponse that = (ShowPolicySwitchStatusResponse) obj;
        return Objects.equals(this.policyName, that.policyName) && Objects.equals(this.enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPolicySwitchStatusResponse {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
