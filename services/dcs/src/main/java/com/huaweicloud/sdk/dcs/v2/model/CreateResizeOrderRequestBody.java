package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 包周期实例变更规格请求
 */
public class CreateResizeOrderRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_open_security_group_rule")

    private Boolean autoOpenSecurityGroupRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_immediately")

    private Boolean executeImmediately;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_capacity")

    private Float newCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    public CreateResizeOrderRequestBody withAutoOpenSecurityGroupRule(Boolean autoOpenSecurityGroupRule) {
        this.autoOpenSecurityGroupRule = autoOpenSecurityGroupRule;
        return this;
    }

    /**
     * 自动开启安全组规则
     * @return autoOpenSecurityGroupRule
     */
    public Boolean getAutoOpenSecurityGroupRule() {
        return autoOpenSecurityGroupRule;
    }

    public void setAutoOpenSecurityGroupRule(Boolean autoOpenSecurityGroupRule) {
        this.autoOpenSecurityGroupRule = autoOpenSecurityGroupRule;
    }

    public CreateResizeOrderRequestBody withExecuteImmediately(Boolean executeImmediately) {
        this.executeImmediately = executeImmediately;
        return this;
    }

    /**
     * 启动迅速
     * @return executeImmediately
     */
    public Boolean getExecuteImmediately() {
        return executeImmediately;
    }

    public void setExecuteImmediately(Boolean executeImmediately) {
        this.executeImmediately = executeImmediately;
    }

    public CreateResizeOrderRequestBody withNewCapacity(Float newCapacity) {
        this.newCapacity = newCapacity;
        return this;
    }

    /**
     * 新的容量，单位是GB
     * @return newCapacity
     */
    public Float getNewCapacity() {
        return newCapacity;
    }

    public void setNewCapacity(Float newCapacity) {
        this.newCapacity = newCapacity;
    }

    public CreateResizeOrderRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateResizeOrderRequestBody withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 区域代码
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateResizeOrderRequestBody that = (CreateResizeOrderRequestBody) obj;
        return Objects.equals(this.autoOpenSecurityGroupRule, that.autoOpenSecurityGroupRule)
            && Objects.equals(this.executeImmediately, that.executeImmediately)
            && Objects.equals(this.newCapacity, that.newCapacity) && Objects.equals(this.password, that.password)
            && Objects.equals(this.specCode, that.specCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoOpenSecurityGroupRule, executeImmediately, newCapacity, password, specCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResizeOrderRequestBody {\n");
        sb.append("    autoOpenSecurityGroupRule: ").append(toIndentedString(autoOpenSecurityGroupRule)).append("\n");
        sb.append("    executeImmediately: ").append(toIndentedString(executeImmediately)).append("\n");
        sb.append("    newCapacity: ").append(toIndentedString(newCapacity)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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
