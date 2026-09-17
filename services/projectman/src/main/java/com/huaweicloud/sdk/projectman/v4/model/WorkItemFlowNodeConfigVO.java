package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作流节点配置
 */
public class WorkItemFlowNodeConfigVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end")

    private Boolean end;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last")

    private Boolean last;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Boolean start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_suspend")

    private Boolean enableSuspend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_config")

    private Map<String, Object> extraConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_rules")

    private List<Map<String, Object>> staticRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_actions")

    private Map<String, Object> staticActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "any_status")

    private Boolean anyStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submit_can_operate")

    private Boolean submitCanOperate;

    public WorkItemFlowNodeConfigVO withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 节点编码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public WorkItemFlowNodeConfigVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 节点名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkItemFlowNodeConfigVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 节点描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkItemFlowNodeConfigVO withEnd(Boolean end) {
        this.end = end;
        return this;
    }

    /**
     * 是否为结束节点
     * @return end
     */
    public Boolean getEnd() {
        return end;
    }

    public void setEnd(Boolean end) {
        this.end = end;
    }

    public WorkItemFlowNodeConfigVO withLast(Boolean last) {
        this.last = last;
        return this;
    }

    /**
     * 是否为最末节点
     * @return last
     */
    public Boolean getLast() {
        return last;
    }

    public void setLast(Boolean last) {
        this.last = last;
    }

    public WorkItemFlowNodeConfigVO withStart(Boolean start) {
        this.start = start;
        return this;
    }

    /**
     * 是否为开始节点
     * @return start
     */
    public Boolean getStart() {
        return start;
    }

    public void setStart(Boolean start) {
        this.start = start;
    }

    public WorkItemFlowNodeConfigVO withEnableSuspend(Boolean enableSuspend) {
        this.enableSuspend = enableSuspend;
        return this;
    }

    /**
     * 是否允许挂起
     * @return enableSuspend
     */
    public Boolean getEnableSuspend() {
        return enableSuspend;
    }

    public void setEnableSuspend(Boolean enableSuspend) {
        this.enableSuspend = enableSuspend;
    }

    public WorkItemFlowNodeConfigVO withExtraConfig(Map<String, Object> extraConfig) {
        this.extraConfig = extraConfig;
        return this;
    }

    public WorkItemFlowNodeConfigVO putExtraConfigItem(String key, Object extraConfigItem) {
        if (this.extraConfig == null) {
            this.extraConfig = new HashMap<>();
        }
        this.extraConfig.put(key, extraConfigItem);
        return this;
    }

    public WorkItemFlowNodeConfigVO withExtraConfig(Consumer<Map<String, Object>> extraConfigSetter) {
        if (this.extraConfig == null) {
            this.extraConfig = new HashMap<>();
        }
        extraConfigSetter.accept(this.extraConfig);
        return this;
    }

    /**
     * 节点扩展配置
     * @return extraConfig
     */
    public Map<String, Object> getExtraConfig() {
        return extraConfig;
    }

    public void setExtraConfig(Map<String, Object> extraConfig) {
        this.extraConfig = extraConfig;
    }

    public WorkItemFlowNodeConfigVO withStaticRules(List<Map<String, Object>> staticRules) {
        this.staticRules = staticRules;
        return this;
    }

    public WorkItemFlowNodeConfigVO addStaticRulesItem(Map<String, Object> staticRulesItem) {
        if (this.staticRules == null) {
            this.staticRules = new ArrayList<>();
        }
        this.staticRules.add(staticRulesItem);
        return this;
    }

    public WorkItemFlowNodeConfigVO withStaticRules(Consumer<List<Map<String, Object>>> staticRulesSetter) {
        if (this.staticRules == null) {
            this.staticRules = new ArrayList<>();
        }
        staticRulesSetter.accept(this.staticRules);
        return this;
    }

    /**
     * 静态规则列表
     * @return staticRules
     */
    public List<Map<String, Object>> getStaticRules() {
        return staticRules;
    }

    public void setStaticRules(List<Map<String, Object>> staticRules) {
        this.staticRules = staticRules;
    }

    public WorkItemFlowNodeConfigVO withStaticActions(Map<String, Object> staticActions) {
        this.staticActions = staticActions;
        return this;
    }

    public WorkItemFlowNodeConfigVO putStaticActionsItem(String key, Object staticActionsItem) {
        if (this.staticActions == null) {
            this.staticActions = new HashMap<>();
        }
        this.staticActions.put(key, staticActionsItem);
        return this;
    }

    public WorkItemFlowNodeConfigVO withStaticActions(Consumer<Map<String, Object>> staticActionsSetter) {
        if (this.staticActions == null) {
            this.staticActions = new HashMap<>();
        }
        staticActionsSetter.accept(this.staticActions);
        return this;
    }

    /**
     * 静态动作配置
     * @return staticActions
     */
    public Map<String, Object> getStaticActions() {
        return staticActions;
    }

    public void setStaticActions(Map<String, Object> staticActions) {
        this.staticActions = staticActions;
    }

    public WorkItemFlowNodeConfigVO withAnyStatus(Boolean anyStatus) {
        this.anyStatus = anyStatus;
        return this;
    }

    /**
     * 是否任意状态可流转
     * @return anyStatus
     */
    public Boolean getAnyStatus() {
        return anyStatus;
    }

    public void setAnyStatus(Boolean anyStatus) {
        this.anyStatus = anyStatus;
    }

    public WorkItemFlowNodeConfigVO withSubmitCanOperate(Boolean submitCanOperate) {
        this.submitCanOperate = submitCanOperate;
        return this;
    }

    /**
     * 提交时是否可操作
     * @return submitCanOperate
     */
    public Boolean getSubmitCanOperate() {
        return submitCanOperate;
    }

    public void setSubmitCanOperate(Boolean submitCanOperate) {
        this.submitCanOperate = submitCanOperate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkItemFlowNodeConfigVO that = (WorkItemFlowNodeConfigVO) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.end, that.end)
            && Objects.equals(this.last, that.last) && Objects.equals(this.start, that.start)
            && Objects.equals(this.enableSuspend, that.enableSuspend)
            && Objects.equals(this.extraConfig, that.extraConfig) && Objects.equals(this.staticRules, that.staticRules)
            && Objects.equals(this.staticActions, that.staticActions) && Objects.equals(this.anyStatus, that.anyStatus)
            && Objects.equals(this.submitCanOperate, that.submitCanOperate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code,
            name,
            description,
            end,
            last,
            start,
            enableSuspend,
            extraConfig,
            staticRules,
            staticActions,
            anyStatus,
            submitCanOperate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkItemFlowNodeConfigVO {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    last: ").append(toIndentedString(last)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    enableSuspend: ").append(toIndentedString(enableSuspend)).append("\n");
        sb.append("    extraConfig: ").append(toIndentedString(extraConfig)).append("\n");
        sb.append("    staticRules: ").append(toIndentedString(staticRules)).append("\n");
        sb.append("    staticActions: ").append(toIndentedString(staticActions)).append("\n");
        sb.append("    anyStatus: ").append(toIndentedString(anyStatus)).append("\n");
        sb.append("    submitCanOperate: ").append(toIndentedString(submitCanOperate)).append("\n");
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
