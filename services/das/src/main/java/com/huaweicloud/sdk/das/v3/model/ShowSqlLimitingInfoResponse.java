package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSqlLimitingInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_use")

    private Boolean canUse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_sensitive")

    private Boolean caseSensitive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire")

    private Boolean expire;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_detail_version")

    private String instanceDetailVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_readonly_set_rule")

    private Boolean canReadonlySetRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly_set_rule_msg")

    private String readonlySetRuleMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_rule_limit")

    private Integer maxRuleLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_add_insert_type")

    private Boolean canAddInsertType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_key_str")

    private Boolean supportKeyStr;

    public ShowSqlLimitingInfoResponse withCanUse(Boolean canUse) {
        this.canUse = canUse;
        return this;
    }

    /**
     * 实例能否使用SQL限流功能
     * @return canUse
     */
    public Boolean getCanUse() {
        return canUse;
    }

    public void setCanUse(Boolean canUse) {
        this.canUse = canUse;
    }

    public ShowSqlLimitingInfoResponse withCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    /**
     * 是否大小写敏感
     * @return caseSensitive
     */
    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    public ShowSqlLimitingInfoResponse withExpire(Boolean expire) {
        this.expire = expire;
        return this;
    }

    /**
     * 是否支持展示过期
     * @return expire
     */
    public Boolean getExpire() {
        return expire;
    }

    public void setExpire(Boolean expire) {
        this.expire = expire;
    }

    public ShowSqlLimitingInfoResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 当canUse为False时展示错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ShowSqlLimitingInfoResponse withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 实例类型
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public ShowSqlLimitingInfoResponse withInstanceDetailVersion(String instanceDetailVersion) {
        this.instanceDetailVersion = instanceDetailVersion;
        return this;
    }

    /**
     * 实例详细版本号
     * @return instanceDetailVersion
     */
    public String getInstanceDetailVersion() {
        return instanceDetailVersion;
    }

    public void setInstanceDetailVersion(String instanceDetailVersion) {
        this.instanceDetailVersion = instanceDetailVersion;
    }

    public ShowSqlLimitingInfoResponse withCanReadonlySetRule(Boolean canReadonlySetRule) {
        this.canReadonlySetRule = canReadonlySetRule;
        return this;
    }

    /**
     * 只读实例是否可以添加、删除限流规则
     * @return canReadonlySetRule
     */
    public Boolean getCanReadonlySetRule() {
        return canReadonlySetRule;
    }

    public void setCanReadonlySetRule(Boolean canReadonlySetRule) {
        this.canReadonlySetRule = canReadonlySetRule;
    }

    public ShowSqlLimitingInfoResponse withReadonlySetRuleMsg(String readonlySetRuleMsg) {
        this.readonlySetRuleMsg = readonlySetRuleMsg;
        return this;
    }

    /**
     * 当canReadonlySetRule为False时展示的提示
     * @return readonlySetRuleMsg
     */
    public String getReadonlySetRuleMsg() {
        return readonlySetRuleMsg;
    }

    public void setReadonlySetRuleMsg(String readonlySetRuleMsg) {
        this.readonlySetRuleMsg = readonlySetRuleMsg;
    }

    public ShowSqlLimitingInfoResponse withMaxRuleLimit(Integer maxRuleLimit) {
        this.maxRuleLimit = maxRuleLimit;
        return this;
    }

    /**
     * 最大可用SQL限流规则数
     * @return maxRuleLimit
     */
    public Integer getMaxRuleLimit() {
        return maxRuleLimit;
    }

    public void setMaxRuleLimit(Integer maxRuleLimit) {
        this.maxRuleLimit = maxRuleLimit;
    }

    public ShowSqlLimitingInfoResponse withCanAddInsertType(Boolean canAddInsertType) {
        this.canAddInsertType = canAddInsertType;
        return this;
    }

    /**
     * 是否支持添加insert类型sql
     * @return canAddInsertType
     */
    public Boolean getCanAddInsertType() {
        return canAddInsertType;
    }

    public void setCanAddInsertType(Boolean canAddInsertType) {
        this.canAddInsertType = canAddInsertType;
    }

    public ShowSqlLimitingInfoResponse withSupportKeyStr(Boolean supportKeyStr) {
        this.supportKeyStr = supportKeyStr;
        return this;
    }

    /**
     * 实例能否使用关键字自治限流功能
     * @return supportKeyStr
     */
    public Boolean getSupportKeyStr() {
        return supportKeyStr;
    }

    public void setSupportKeyStr(Boolean supportKeyStr) {
        this.supportKeyStr = supportKeyStr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSqlLimitingInfoResponse that = (ShowSqlLimitingInfoResponse) obj;
        return Objects.equals(this.canUse, that.canUse) && Objects.equals(this.caseSensitive, that.caseSensitive)
            && Objects.equals(this.expire, that.expire) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.instanceDetailVersion, that.instanceDetailVersion)
            && Objects.equals(this.canReadonlySetRule, that.canReadonlySetRule)
            && Objects.equals(this.readonlySetRuleMsg, that.readonlySetRuleMsg)
            && Objects.equals(this.maxRuleLimit, that.maxRuleLimit)
            && Objects.equals(this.canAddInsertType, that.canAddInsertType)
            && Objects.equals(this.supportKeyStr, that.supportKeyStr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canUse,
            caseSensitive,
            expire,
            errorMsg,
            instanceType,
            instanceDetailVersion,
            canReadonlySetRule,
            readonlySetRuleMsg,
            maxRuleLimit,
            canAddInsertType,
            supportKeyStr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlLimitingInfoResponse {\n");
        sb.append("    canUse: ").append(toIndentedString(canUse)).append("\n");
        sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
        sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    instanceDetailVersion: ").append(toIndentedString(instanceDetailVersion)).append("\n");
        sb.append("    canReadonlySetRule: ").append(toIndentedString(canReadonlySetRule)).append("\n");
        sb.append("    readonlySetRuleMsg: ").append(toIndentedString(readonlySetRuleMsg)).append("\n");
        sb.append("    maxRuleLimit: ").append(toIndentedString(maxRuleLimit)).append("\n");
        sb.append("    canAddInsertType: ").append(toIndentedString(canAddInsertType)).append("\n");
        sb.append("    supportKeyStr: ").append(toIndentedString(supportKeyStr)).append("\n");
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
