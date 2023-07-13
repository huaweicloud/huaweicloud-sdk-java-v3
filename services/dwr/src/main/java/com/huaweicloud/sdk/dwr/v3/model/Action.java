package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作流节点定义
 */
public class Action {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name")

    private String actionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_agency")

    private String actionAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function")

    private String function;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_template")

    private String functionTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_template_name")

    private String actionTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_template_category")

    private String actionTemplateCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_template_provider_name")

    private String actionTemplateProviderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_mode")

    private String invocationMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payload_filter")

    private String payloadFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dynamic_source")

    private Map<String, Object> dynamicSource = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<ActionResult> results = null;

    public Action withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * 节点名称
     * @return actionName
     */
    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Action withActionAgency(String actionAgency) {
        this.actionAgency = actionAgency;
        return this;
    }

    /**
     * 节点使用的委托
     * @return actionAgency
     */
    public String getActionAgency() {
        return actionAgency;
    }

    public void setActionAgency(String actionAgency) {
        this.actionAgency = actionAgency;
    }

    public Action withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * 节点相关联的函数URN
     * @return function
     */
    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Action withFunctionTemplate(String functionTemplate) {
        this.functionTemplate = functionTemplate;
        return this;
    }

    /**
     * 算子模板使用的URM
     * @return functionTemplate
     */
    public String getFunctionTemplate() {
        return functionTemplate;
    }

    public void setFunctionTemplate(String functionTemplate) {
        this.functionTemplate = functionTemplate;
    }

    public Action withActionTemplateName(String actionTemplateName) {
        this.actionTemplateName = actionTemplateName;
        return this;
    }

    /**
     * 节点使用的算子名称
     * @return actionTemplateName
     */
    public String getActionTemplateName() {
        return actionTemplateName;
    }

    public void setActionTemplateName(String actionTemplateName) {
        this.actionTemplateName = actionTemplateName;
    }

    public Action withActionTemplateCategory(String actionTemplateCategory) {
        this.actionTemplateCategory = actionTemplateCategory;
        return this;
    }

    /**
     * 节点使用的模板类别
     * @return actionTemplateCategory
     */
    public String getActionTemplateCategory() {
        return actionTemplateCategory;
    }

    public void setActionTemplateCategory(String actionTemplateCategory) {
        this.actionTemplateCategory = actionTemplateCategory;
    }

    public Action withActionTemplateProviderName(String actionTemplateProviderName) {
        this.actionTemplateProviderName = actionTemplateProviderName;
        return this;
    }

    /**
     * 节点使用的模板提供方
     * @return actionTemplateProviderName
     */
    public String getActionTemplateProviderName() {
        return actionTemplateProviderName;
    }

    public void setActionTemplateProviderName(String actionTemplateProviderName) {
        this.actionTemplateProviderName = actionTemplateProviderName;
    }

    public Action withInvocationMode(String invocationMode) {
        this.invocationMode = invocationMode;
        return this;
    }

    /**
     * 触发模式
     * @return invocationMode
     */
    public String getInvocationMode() {
        return invocationMode;
    }

    public void setInvocationMode(String invocationMode) {
        this.invocationMode = invocationMode;
    }

    public Action withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 超时时间
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Action withPayloadFilter(String payloadFilter) {
        this.payloadFilter = payloadFilter;
        return this;
    }

    /**
     * 动态参数与inputs参数相关联使用的filter。默认为\"$\"
     * @return payloadFilter
     */
    public String getPayloadFilter() {
        return payloadFilter;
    }

    public void setPayloadFilter(String payloadFilter) {
        this.payloadFilter = payloadFilter;
    }

    public Action withDynamicSource(Map<String, Object> dynamicSource) {
        this.dynamicSource = dynamicSource;
        return this;
    }

    public Action putDynamicSourceItem(String key, Object dynamicSourceItem) {
        if (this.dynamicSource == null) {
            this.dynamicSource = new HashMap<>();
        }
        this.dynamicSource.put(key, dynamicSourceItem);
        return this;
    }

    public Action withDynamicSource(Consumer<Map<String, Object>> dynamicSourceSetter) {
        if (this.dynamicSource == null) {
            this.dynamicSource = new HashMap<>();
        }
        dynamicSourceSetter.accept(this.dynamicSource);
        return this;
    }

    /**
     * 节点使用的动态参数
     * @return dynamicSource
     */
    public Map<String, Object> getDynamicSource() {
        return dynamicSource;
    }

    public void setDynamicSource(Map<String, Object> dynamicSource) {
        this.dynamicSource = dynamicSource;
    }

    public Action withResults(List<ActionResult> results) {
        this.results = results;
        return this;
    }

    public Action addResultsItem(ActionResult resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public Action withResults(Consumer<List<ActionResult>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * action错误处理
     * @return results
     */
    public List<ActionResult> getResults() {
        return results;
    }

    public void setResults(List<ActionResult> results) {
        this.results = results;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Action that = (Action) obj;
        return Objects.equals(this.actionName, that.actionName) && Objects.equals(this.actionAgency, that.actionAgency)
            && Objects.equals(this.function, that.function)
            && Objects.equals(this.functionTemplate, that.functionTemplate)
            && Objects.equals(this.actionTemplateName, that.actionTemplateName)
            && Objects.equals(this.actionTemplateCategory, that.actionTemplateCategory)
            && Objects.equals(this.actionTemplateProviderName, that.actionTemplateProviderName)
            && Objects.equals(this.invocationMode, that.invocationMode) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.payloadFilter, that.payloadFilter)
            && Objects.equals(this.dynamicSource, that.dynamicSource) && Objects.equals(this.results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionName,
            actionAgency,
            function,
            functionTemplate,
            actionTemplateName,
            actionTemplateCategory,
            actionTemplateProviderName,
            invocationMode,
            timeout,
            payloadFilter,
            dynamicSource,
            results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Action {\n");
        sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
        sb.append("    actionAgency: ").append(toIndentedString(actionAgency)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    functionTemplate: ").append(toIndentedString(functionTemplate)).append("\n");
        sb.append("    actionTemplateName: ").append(toIndentedString(actionTemplateName)).append("\n");
        sb.append("    actionTemplateCategory: ").append(toIndentedString(actionTemplateCategory)).append("\n");
        sb.append("    actionTemplateProviderName: ").append(toIndentedString(actionTemplateProviderName)).append("\n");
        sb.append("    invocationMode: ").append(toIndentedString(invocationMode)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    payloadFilter: ").append(toIndentedString(payloadFilter)).append("\n");
        sb.append("    dynamicSource: ").append(toIndentedString(dynamicSource)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
