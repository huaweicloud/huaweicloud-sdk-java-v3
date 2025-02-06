package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CustomerModifyAutoUpgradePolicyReq
 */
public class CustomerModifyAutoUpgradePolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_option")

    private Boolean switchOption;

    public CustomerModifyAutoUpgradePolicyReq withSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
        return this;
    }

    /**
     * 自动小版本升级开关选项 true：打开自动小版本升级 false：关闭自动小版本升级
     * @return switchOption
     */
    public Boolean getSwitchOption() {
        return switchOption;
    }

    public void setSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomerModifyAutoUpgradePolicyReq that = (CustomerModifyAutoUpgradePolicyReq) obj;
        return Objects.equals(this.switchOption, that.switchOption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchOption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerModifyAutoUpgradePolicyReq {\n");
        sb.append("    switchOption: ").append(toIndentedString(switchOption)).append("\n");
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
