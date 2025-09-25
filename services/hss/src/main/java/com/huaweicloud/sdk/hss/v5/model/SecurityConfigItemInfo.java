package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置检查项信息
 */
public class SecurityConfigItemInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_name")

    private String checkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item_rule")

    private String checkItemRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_result")

    private String scanResult;

    public SecurityConfigItemInfo withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * **参数解释**： 基线名称 **取值范围**： 不涉及 
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public SecurityConfigItemInfo withCheckItemRule(String checkItemRule) {
        this.checkItemRule = checkItemRule;
        return this;
    }

    /**
     * **参数解释**： 检查项规则 **取值范围**： 不涉及 
     * @return checkItemRule
     */
    public String getCheckItemRule() {
        return checkItemRule;
    }

    public void setCheckItemRule(String checkItemRule) {
        this.checkItemRule = checkItemRule;
    }

    public SecurityConfigItemInfo withScanResult(String scanResult) {
        this.scanResult = scanResult;
        return this;
    }

    /**
     * **参数解释**： 检测结果 **取值范围**： - pass：通过 - failed：未通过 
     * @return scanResult
     */
    public String getScanResult() {
        return scanResult;
    }

    public void setScanResult(String scanResult) {
        this.scanResult = scanResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityConfigItemInfo that = (SecurityConfigItemInfo) obj;
        return Objects.equals(this.checkName, that.checkName) && Objects.equals(this.checkItemRule, that.checkItemRule)
            && Objects.equals(this.scanResult, that.scanResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkName, checkItemRule, scanResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityConfigItemInfo {\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    checkItemRule: ").append(toIndentedString(checkItemRule)).append("\n");
        sb.append("    scanResult: ").append(toIndentedString(scanResult)).append("\n");
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
