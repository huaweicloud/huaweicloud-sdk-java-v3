package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Statement
 */
public class Statement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Effect")

    private String effect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Principal")

    private String principal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NotPrincipal")

    private String notPrincipal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NotAction")

    private String notAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NotResource")

    private String notResource;

    public Statement withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Statement语句的ID。 Statement语句ID必须是唯一的，例如statement01、statement02。
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Statement withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    /**
     * Statement语句的效果。“Allow”或者“Deny”。
     * @return effect
     */
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public Statement withPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    /**
     * Statement语句作用的对象。 目前支持“CSP”和“Service”两类对象。  “CSP”对象指的是其他用户，可以作用于多个用户。  “Service”对象指的是云服务，可以作用于多个云服务。  Principal元素和NotPrincipal元素两者任选其一。选定后， “CSP”对象填写内容的格式为urn:csp:iam::domainId:root或“\\*”，其中domainId为其他用户的“账号ID”，“\\*”指作用于所有人。  “Service”对象填写内容的格式为小写的云服务名称缩写。
     * @return principal
     */
    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public Statement withNotPrincipal(String notPrincipal) {
        this.notPrincipal = notPrincipal;
        return this;
    }

    /**
     * NotPrincipal：Statement语句排除作用的对象。  目前支持“CSP”和“Service”两类对象。  “CSP”对象指的是其他用户，可以作用于多个用户。  “Service”对象指的是云服务，可以作用于多个云服务。  Principal元素和NotPrincipal元素两者任选其一。选定后， “CSP”对象填写内容的格式为urn:csp:iam::domainId:root或“\\*”，其中domainId为其他用户的“账号ID”，“\\*”指作用于所有人。  “Service”对象填写内容的格式为小写的云服务名称缩写。
     * @return notPrincipal
     */
    public String getNotPrincipal() {
        return notPrincipal;
    }

    public void setNotPrincipal(String notPrincipal) {
        this.notPrincipal = notPrincipal;
    }

    public Statement withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Statement语句作用的操作。  允许使用通配符来表示一类操作，例如：SMN:Update*、SMN:Delete*。如果只填写“*”，表示Statement语句作用的操作为该资源支持的所有操作。  Action元素和NotAction元素两者任选其一。  目前支持的操作有：  SMN:UpdateTopic SMN:DeleteTopic SMN:QueryTopicDetail SMN:ListTopicAttributes SMN:UpdateTopicAttribute SMN:DeleteTopicAttributes SMN:DeleteTopicAttributeByName SMN:ListSubscriptionsByTopic SMN:Subscribe SMN:Unsubscribe SMN:Publish
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Statement withNotAction(String notAction) {
        this.notAction = notAction;
        return this;
    }

    /**
     * Statement语句排除作用的操作。  允许使用通配符来表示一类操作，例如：SMN:Update*、SMN:Delete*。如果只填写“*”，表示Statement语句作用的操作为该资源支持的所有操作。  Action元素和NotAction元素两者任选其一。  目前支持的操作有：  SMN:UpdateTopic  SMN:DeleteTopic  SMN:QueryTopicDetail  SMN:ListTopicAttributes  SMN:UpdateTopicAttribute  SMN:DeleteTopicAttributes  SMN:DeleteTopicAttributeByName  SMN:ListSubscriptionsByTopic  SMN:Subscribe  SMN:Unsubscribe  SMN:Publish
     * @return notAction
     */
    public String getNotAction() {
        return notAction;
    }

    public void setNotAction(String notAction) {
        this.notAction = notAction;
    }

    public Statement withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Statement语句作用的主题。  Resource和NotResource两者任选其一。选定后，填写内容为主题URN。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Statement withNotResource(String notResource) {
        this.notResource = notResource;
        return this;
    }

    /**
     * Statement语句排除作用的主题。  Resource和NotResource两者任选其一。选定后，填写内容为主题URN。
     * @return notResource
     */
    public String getNotResource() {
        return notResource;
    }

    public void setNotResource(String notResource) {
        this.notResource = notResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Statement that = (Statement) obj;
        return Objects.equals(this.sid, that.sid) && Objects.equals(this.effect, that.effect)
            && Objects.equals(this.principal, that.principal) && Objects.equals(this.notPrincipal, that.notPrincipal)
            && Objects.equals(this.action, that.action) && Objects.equals(this.notAction, that.notAction)
            && Objects.equals(this.resource, that.resource) && Objects.equals(this.notResource, that.notResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, effect, principal, notPrincipal, action, notAction, resource, notResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Statement {\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    notPrincipal: ").append(toIndentedString(notPrincipal)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    notAction: ").append(toIndentedString(notAction)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    notResource: ").append(toIndentedString(notResource)).append("\n");
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
