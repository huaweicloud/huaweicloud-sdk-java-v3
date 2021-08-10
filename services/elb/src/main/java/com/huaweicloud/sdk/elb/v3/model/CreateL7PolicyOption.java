package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 转发策略 */
public class CreateL7PolicyOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private Integer position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_listener_id")

    private String redirectListenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pool_id")

    private String redirectPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_url")

    private String redirectUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<CreateL7PolicyRuleOption> rules = null;

    public CreateL7PolicyOption withAction(String action) {
        this.action = action;
        return this;
    }

    /** 转发策略的转发动作；取值：REDIRECT_TO_POOL：转发到后端云服务器组；REDIRECT_TO_LISTENER：重定向到监听器
     * 
     * @return action */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CreateL7PolicyOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /** 转发策略的管理状态；该字段为预留字段，暂未启用。默认为true。
     * 
     * @return adminStateUp */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CreateL7PolicyOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 转发策略描述信息。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateL7PolicyOption withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /** 转发策略对应的监听器ID。当action为REDIRECT_TO_POOL时，只支持创建在PROTOCOL为HTTP或TERMINATED_HTTPS的listener上。
     * 当action为REDIRECT_TO_LISTENER时，只支持创建在PROTOCOL为HTTP的listener上。
     * 
     * @return listenerId */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public CreateL7PolicyOption withName(String name) {
        this.name = name;
        return this;
    }

    /** 转发策略名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateL7PolicyOption withPosition(Integer position) {
        this.position = position;
        return this;
    }

    /** 转发策略的优先级，从1递增，最高100。该字段为预留字段，暂未启用。 minimum: 1 maximum: 100
     * 
     * @return position */
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public CreateL7PolicyOption withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 转发策略所在的项目ID。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateL7PolicyOption withRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
        return this;
    }

    /** 转发到的listener的ID，当action为REDIRECT_TO_LISTENER时生效。当action为REDIRECT_TO_LISTENER时必选。
     * 
     * @return redirectListenerId */
    public String getRedirectListenerId() {
        return redirectListenerId;
    }

    public void setRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
    }

    public CreateL7PolicyOption withRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
        return this;
    }

    /** 转发到pool的ID。当action为REDIRECT_TO_POOL时生效。使用说明：指定的pool不能是listener的default_pool。不能是其他listener的l7policy使用的pool。当action为REDIRECT_TO_POOL时为必选字段。当action为REDIRECT_TO_LISTENER时，不可指定。
     * 
     * @return redirectPoolId */
    public String getRedirectPoolId() {
        return redirectPoolId;
    }

    public void setRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
    }

    public CreateL7PolicyOption withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /** 转发到的url。该字段未启用。
     * 
     * @return redirectUrl */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public CreateL7PolicyOption withRules(List<CreateL7PolicyRuleOption> rules) {
        this.rules = rules;
        return this;
    }

    public CreateL7PolicyOption addRulesItem(CreateL7PolicyRuleOption rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public CreateL7PolicyOption withRules(Consumer<List<CreateL7PolicyRuleOption>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /** 转发策略关联的转发规则对象。详细参考表 l7rule字段说明。rules列表中最多含有2个rule对象，且每个rule的type字段不可相同。
     * 
     * @return rules */
    public List<CreateL7PolicyRuleOption> getRules() {
        return rules;
    }

    public void setRules(List<CreateL7PolicyRuleOption> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateL7PolicyOption createL7PolicyOption = (CreateL7PolicyOption) o;
        return Objects.equals(this.action, createL7PolicyOption.action)
            && Objects.equals(this.adminStateUp, createL7PolicyOption.adminStateUp)
            && Objects.equals(this.description, createL7PolicyOption.description)
            && Objects.equals(this.listenerId, createL7PolicyOption.listenerId)
            && Objects.equals(this.name, createL7PolicyOption.name)
            && Objects.equals(this.position, createL7PolicyOption.position)
            && Objects.equals(this.projectId, createL7PolicyOption.projectId)
            && Objects.equals(this.redirectListenerId, createL7PolicyOption.redirectListenerId)
            && Objects.equals(this.redirectPoolId, createL7PolicyOption.redirectPoolId)
            && Objects.equals(this.redirectUrl, createL7PolicyOption.redirectUrl)
            && Objects.equals(this.rules, createL7PolicyOption.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            adminStateUp,
            description,
            listenerId,
            name,
            position,
            projectId,
            redirectListenerId,
            redirectPoolId,
            redirectUrl,
            rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateL7PolicyOption {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    redirectListenerId: ").append(toIndentedString(redirectListenerId)).append("\n");
        sb.append("    redirectPoolId: ").append(toIndentedString(redirectPoolId)).append("\n");
        sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
