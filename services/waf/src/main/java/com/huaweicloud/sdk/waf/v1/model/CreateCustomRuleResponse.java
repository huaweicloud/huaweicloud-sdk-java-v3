package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateCustomRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<CustomRuleConditions> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private CustomAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_mode")

    private Boolean actionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Boolean time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Long start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminal")

    private Long terminal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "producer")

    private Integer producer;

    public CreateCustomRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateCustomRuleResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCustomRuleResponse withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /**
     * 策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public CreateCustomRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCustomRuleResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 规则状态，0：关闭，1：开启
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CreateCustomRuleResponse withConditions(List<CustomRuleConditions> conditions) {
        this.conditions = conditions;
        return this;
    }

    public CreateCustomRuleResponse addConditionsItem(CustomRuleConditions conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public CreateCustomRuleResponse withConditions(Consumer<List<CustomRuleConditions>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 匹配条件列表，匹配条件必须同时满足。
     * @return conditions
     */
    public List<CustomRuleConditions> getConditions() {
        return conditions;
    }

    public void setConditions(List<CustomRuleConditions> conditions) {
        this.conditions = conditions;
    }

    public CreateCustomRuleResponse withAction(CustomAction action) {
        this.action = action;
        return this;
    }

    public CreateCustomRuleResponse withAction(Consumer<CustomAction> actionSetter) {
        if (this.action == null) {
            this.action = new CustomAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public CustomAction getAction() {
        return action;
    }

    public void setAction(CustomAction action) {
        this.action = action;
    }

    public CreateCustomRuleResponse withActionMode(Boolean actionMode) {
        this.actionMode = actionMode;
        return this;
    }

    /**
     * 预留参数，可忽略。
     * @return actionMode
     */
    public Boolean getActionMode() {
        return actionMode;
    }

    public void setActionMode(Boolean actionMode) {
        this.actionMode = actionMode;
    }

    public CreateCustomRuleResponse withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 执行该规则的优先级，值越小，优先级越高，值相同时，规则创建时间早，优先级越高。取值范围：0到1000。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public CreateCustomRuleResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 创建精准防护规则的
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public CreateCustomRuleResponse withTime(Boolean time) {
        this.time = time;
        return this;
    }

    /**
     * 精准防护规则生效时间:  - “false”：表示该规则立即生效。   - “true”：表示自定义生效时间。
     * @return time
     */
    public Boolean getTime() {
        return time;
    }

    public void setTime(Boolean time) {
        this.time = time;
    }

    public CreateCustomRuleResponse withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * 精准防护规则生效的起始时间戳（毫秒）。当time=true，才会返回该参数。
     * @return start
     */
    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public CreateCustomRuleResponse withTerminal(Long terminal) {
        this.terminal = terminal;
        return this;
    }

    /**
     * 精准防护规则生效的终止时间戳（毫秒）。当time=true，才会返回该参数。
     * @return terminal
     */
    public Long getTerminal() {
        return terminal;
    }

    public void setTerminal(Long terminal) {
        this.terminal = terminal;
    }

    public CreateCustomRuleResponse withProducer(Integer producer) {
        this.producer = producer;
        return this;
    }

    /**
     * 规则创建对象，该参数为预留参数，用于后续功能扩展，当前请用户忽略该参数
     * @return producer
     */
    public Integer getProducer() {
        return producer;
    }

    public void setProducer(Integer producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCustomRuleResponse createCustomRuleResponse = (CreateCustomRuleResponse) o;
        return Objects.equals(this.id, createCustomRuleResponse.id)
            && Objects.equals(this.name, createCustomRuleResponse.name)
            && Objects.equals(this.policyid, createCustomRuleResponse.policyid)
            && Objects.equals(this.description, createCustomRuleResponse.description)
            && Objects.equals(this.status, createCustomRuleResponse.status)
            && Objects.equals(this.conditions, createCustomRuleResponse.conditions)
            && Objects.equals(this.action, createCustomRuleResponse.action)
            && Objects.equals(this.actionMode, createCustomRuleResponse.actionMode)
            && Objects.equals(this.priority, createCustomRuleResponse.priority)
            && Objects.equals(this.timestamp, createCustomRuleResponse.timestamp)
            && Objects.equals(this.time, createCustomRuleResponse.time)
            && Objects.equals(this.start, createCustomRuleResponse.start)
            && Objects.equals(this.terminal, createCustomRuleResponse.terminal)
            && Objects.equals(this.producer, createCustomRuleResponse.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            policyid,
            description,
            status,
            conditions,
            action,
            actionMode,
            priority,
            timestamp,
            time,
            start,
            terminal,
            producer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCustomRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    actionMode: ").append(toIndentedString(actionMode)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
        sb.append("    producer: ").append(toIndentedString(producer)).append("\n");
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