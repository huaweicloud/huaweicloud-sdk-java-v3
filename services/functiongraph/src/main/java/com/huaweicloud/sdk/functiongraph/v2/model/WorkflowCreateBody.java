package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建函数流的body体
 */
public class WorkflowCreateBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggers")

    private List<Trigger> triggers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "functions")

    private List<Function> functions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "states")

    private List<OperationState> states = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constants")

    private Object constants;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retries")

    private List<Retry> retries = null;

    /**
     * 函数流模式，当前支持两种模式 NORMAL: 标准模式，普通模式面向普通的业务场景，支持长时间任务，支持执行历史持久化和查询，只支持异步调用 EXPRESS: 快速模式，快速模式面向业务执行时长较短，需要极致性能的场景，只支持流程执行时长低于5分钟的场景，不支持执行历史持久化，支持同步和异步调用 默认为标准模式
     */
    public static final class ModeEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final ModeEnum NORMAL = new ModeEnum("NORMAL");

        /**
         * Enum EXPRESS for value: "EXPRESS"
         */
        public static final ModeEnum EXPRESS = new ModeEnum("EXPRESS");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("EXPRESS", EXPRESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "express_config")

    private ExpressConfig expressConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_stream_response")

    private Boolean enableStreamResponse;

    public WorkflowCreateBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 函数流名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkflowCreateBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 函数流描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkflowCreateBody withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * 流程开始节点ID
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public WorkflowCreateBody withTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public WorkflowCreateBody addTriggersItem(Trigger triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public WorkflowCreateBody withTriggers(Consumer<List<Trigger>> triggersSetter) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        triggersSetter.accept(this.triggers);
        return this;
    }

    /**
     * 触发器列表
     * @return triggers
     */
    public List<Trigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    public WorkflowCreateBody withFunctions(List<Function> functions) {
        this.functions = functions;
        return this;
    }

    public WorkflowCreateBody addFunctionsItem(Function functionsItem) {
        if (this.functions == null) {
            this.functions = new ArrayList<>();
        }
        this.functions.add(functionsItem);
        return this;
    }

    public WorkflowCreateBody withFunctions(Consumer<List<Function>> functionsSetter) {
        if (this.functions == null) {
            this.functions = new ArrayList<>();
        }
        functionsSetter.accept(this.functions);
        return this;
    }

    /**
     * 函数列表
     * @return functions
     */
    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }

    public WorkflowCreateBody withStates(List<OperationState> states) {
        this.states = states;
        return this;
    }

    public WorkflowCreateBody addStatesItem(OperationState statesItem) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        this.states.add(statesItem);
        return this;
    }

    public WorkflowCreateBody withStates(Consumer<List<OperationState>> statesSetter) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        statesSetter.accept(this.states);
        return this;
    }

    /**
     * 函数流节点清单，定义参考SleepState和OperationState
     * @return states
     */
    public List<OperationState> getStates() {
        return states;
    }

    public void setStates(List<OperationState> states) {
        this.states = states;
    }

    public WorkflowCreateBody withConstants(Object constants) {
        this.constants = constants;
        return this;
    }

    /**
     * 函数流中的常量
     * @return constants
     */
    public Object getConstants() {
        return constants;
    }

    public void setConstants(Object constants) {
        this.constants = constants;
    }

    public WorkflowCreateBody withRetries(List<Retry> retries) {
        this.retries = retries;
        return this;
    }

    public WorkflowCreateBody addRetriesItem(Retry retriesItem) {
        if (this.retries == null) {
            this.retries = new ArrayList<>();
        }
        this.retries.add(retriesItem);
        return this;
    }

    public WorkflowCreateBody withRetries(Consumer<List<Retry>> retriesSetter) {
        if (this.retries == null) {
            this.retries = new ArrayList<>();
        }
        retriesSetter.accept(this.retries);
        return this;
    }

    /**
     * 重试策略清单
     * @return retries
     */
    public List<Retry> getRetries() {
        return retries;
    }

    public void setRetries(List<Retry> retries) {
        this.retries = retries;
    }

    public WorkflowCreateBody withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 函数流模式，当前支持两种模式 NORMAL: 标准模式，普通模式面向普通的业务场景，支持长时间任务，支持执行历史持久化和查询，只支持异步调用 EXPRESS: 快速模式，快速模式面向业务执行时长较短，需要极致性能的场景，只支持流程执行时长低于5分钟的场景，不支持执行历史持久化，支持同步和异步调用 默认为标准模式
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public WorkflowCreateBody withExpressConfig(ExpressConfig expressConfig) {
        this.expressConfig = expressConfig;
        return this;
    }

    public WorkflowCreateBody withExpressConfig(Consumer<ExpressConfig> expressConfigSetter) {
        if (this.expressConfig == null) {
            this.expressConfig = new ExpressConfig();
            expressConfigSetter.accept(this.expressConfig);
        }

        return this;
    }

    /**
     * Get expressConfig
     * @return expressConfig
     */
    public ExpressConfig getExpressConfig() {
        return expressConfig;
    }

    public void setExpressConfig(ExpressConfig expressConfig) {
        this.expressConfig = expressConfig;
    }

    public WorkflowCreateBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public WorkflowCreateBody withEnableStreamResponse(Boolean enableStreamResponse) {
        this.enableStreamResponse = enableStreamResponse;
        return this;
    }

    /**
     * 是否返回流数据
     * @return enableStreamResponse
     */
    public Boolean getEnableStreamResponse() {
        return enableStreamResponse;
    }

    public void setEnableStreamResponse(Boolean enableStreamResponse) {
        this.enableStreamResponse = enableStreamResponse;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowCreateBody that = (WorkflowCreateBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.start, that.start) && Objects.equals(this.triggers, that.triggers)
            && Objects.equals(this.functions, that.functions) && Objects.equals(this.states, that.states)
            && Objects.equals(this.constants, that.constants) && Objects.equals(this.retries, that.retries)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.expressConfig, that.expressConfig)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enableStreamResponse, that.enableStreamResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            start,
            triggers,
            functions,
            states,
            constants,
            retries,
            mode,
            expressConfig,
            enterpriseProjectId,
            enableStreamResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowCreateBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
        sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
        sb.append("    constants: ").append(toIndentedString(constants)).append("\n");
        sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    expressConfig: ").append(toIndentedString(expressConfig)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enableStreamResponse: ").append(toIndentedString(enableStreamResponse)).append("\n");
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
