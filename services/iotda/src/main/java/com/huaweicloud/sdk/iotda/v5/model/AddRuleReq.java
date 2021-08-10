package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 规则触发条件请求结构体 */
public class AddRuleReq {

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

    public AddRuleReq withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /** **参数说明**：用户自定义的规则名称。
     * 
     * @return ruleName */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public AddRuleReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /** **参数说明**：用户自定义的规则描述。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddRuleReq withSubject(RoutingRuleSubject subject) {
        this.subject = subject;
        return this;
    }

    public AddRuleReq withSubject(Consumer<RoutingRuleSubject> subjectSetter) {
        if (this.subject == null) {
            this.subject = new RoutingRuleSubject();
            subjectSetter.accept(this.subject);
        }

        return this;
    }

    /** Get subject
     * 
     * @return subject */
    public RoutingRuleSubject getSubject() {
        return subject;
    }

    public void setSubject(RoutingRuleSubject subject) {
        this.subject = subject;
    }

    public AddRuleReq withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    /** **参数说明**：租户规则的生效范围，默认GLOBAL，。 **取值范围**： - GLOBAL：生效范围为租户级。 -
     * APP：生效范围为资源空间级。如果类型为APP，创建的规则生效范围为携带的app_id指定的资源空间，不携带app_id则创建规则生效范围为[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)。
     * 
     * @return appType */
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public AddRuleReq withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** **参数说明**：资源空间ID。。 **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public AddRuleReq withSelect(String select) {
        this.select = select;
        return this;
    }

    /** **参数说明**：用户自定义sql select语句，最大长度500，该参数仅供标准版和企业版用户使用。
     * 
     * @return select */
    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public AddRuleReq withWhere(String where) {
        this.where = where;
        return this;
    }

    /** **参数说明**：用户自定义sql where语句，最大长度500，该参数仅供标准版和企业版用户使用。
     * 
     * @return where */
    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddRuleReq addRuleReq = (AddRuleReq) o;
        return Objects.equals(this.ruleName, addRuleReq.ruleName)
            && Objects.equals(this.description, addRuleReq.description)
            && Objects.equals(this.subject, addRuleReq.subject) && Objects.equals(this.appType, addRuleReq.appType)
            && Objects.equals(this.appId, addRuleReq.appId) && Objects.equals(this.select, addRuleReq.select)
            && Objects.equals(this.where, addRuleReq.where);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, description, subject, appType, appId, select, where);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddRuleReq {\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    select: ").append(toIndentedString(select)).append("\n");
        sb.append("    where: ").append(toIndentedString(where)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
