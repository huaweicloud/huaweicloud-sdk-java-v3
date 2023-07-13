package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateRoutingRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private RoutingRuleSubject subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private String appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select")

    private String select;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "where")

    private String where;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active")

    private Boolean active;

    public UpdateRoutingRuleResponse withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则触发条件ID，用于唯一标识一个规则触发条件，在创建规则条件时由物联网平台分配获得。
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public UpdateRoutingRuleResponse withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 用户自定义的规则名称。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public UpdateRoutingRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户自定义的规则描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateRoutingRuleResponse withSubject(RoutingRuleSubject subject) {
        this.subject = subject;
        return this;
    }

    public UpdateRoutingRuleResponse withSubject(Consumer<RoutingRuleSubject> subjectSetter) {
        if (this.subject == null) {
            this.subject = new RoutingRuleSubject();
            subjectSetter.accept(this.subject);
        }

        return this;
    }

    /**
     * Get subject
     * @return subject
     */
    public RoutingRuleSubject getSubject() {
        return subject;
    }

    public void setSubject(RoutingRuleSubject subject) {
        this.subject = subject;
    }

    public UpdateRoutingRuleResponse withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    /**
     * 租户规则的生效范围，取值如下： - GLOBAL：生效范围为租户级 - APP：生效范围为资源空间级。
     * @return appType
     */
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public UpdateRoutingRuleResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 资源空间ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public UpdateRoutingRuleResponse withSelect(String select) {
        this.select = select;
        return this;
    }

    /**
     * 用户自定义sql select语句，最大长度2500，该参数仅供标准版和企业版用户使用。
     * @return select
     */
    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public UpdateRoutingRuleResponse withWhere(String where) {
        this.where = where;
        return this;
    }

    /**
     * 用户自定义sql where语句，最大长度2500，该参数仅供标准版和企业版用户使用。
     * @return where
     */
    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public UpdateRoutingRuleResponse withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * 规则条件的状态是否为激活。
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRoutingRuleResponse that = (UpdateRoutingRuleResponse) obj;
        return Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.subject, that.subject)
            && Objects.equals(this.appType, that.appType) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.select, that.select) && Objects.equals(this.where, that.where)
            && Objects.equals(this.active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId, ruleName, description, subject, appType, appId, select, where, active);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRoutingRuleResponse {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    select: ").append(toIndentedString(select)).append("\n");
        sb.append("    where: ").append(toIndentedString(where)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
