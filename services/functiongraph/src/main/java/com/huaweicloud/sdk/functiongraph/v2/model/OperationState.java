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
 * 函数执行节点信息
 */
public class OperationState {

    /**
     * Action执行模式，支持串行，并行两种模式，默认串行
     */
    public static final class ActionModeEnum {

        /**
         * Enum SEQUENTIAL for value: "sequential"
         */
        public static final ActionModeEnum SEQUENTIAL = new ActionModeEnum("sequential");

        /**
         * Enum PARALLEL for value: "parallel"
         */
        public static final ActionModeEnum PARALLEL = new ActionModeEnum("parallel");

        private static final Map<String, ActionModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionModeEnum> createStaticFields() {
            Map<String, ActionModeEnum> map = new HashMap<>();
            map.put("sequential", SEQUENTIAL);
            map.put("parallel", PARALLEL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionModeEnum(String value) {
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
        public static ActionModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionModeEnum(value));
        }

        public static ActionModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionModeEnum) {
                return this.value.equals(((ActionModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_mode")

    private ActionModeEnum actionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<Action> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on_errors")

    private List<OnError> onErrors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 节点类型
     */
    public static final class TypeEnum {

        /**
         * Enum OPERATION for value: "Operation"
         */
        public static final TypeEnum OPERATION = new TypeEnum("Operation");

        /**
         * Enum SLEEP for value: "Sleep"
         */
        public static final TypeEnum SLEEP = new TypeEnum("Sleep");

        /**
         * Enum END for value: "End"
         */
        public static final TypeEnum END = new TypeEnum("End");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("Operation", OPERATION);
            map.put("Sleep", SLEEP);
            map.put("End", END);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end")

    private Boolean end;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transition")

    private String transition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_data_filter")

    private StateDataFilter stateDataFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    public OperationState withActionMode(ActionModeEnum actionMode) {
        this.actionMode = actionMode;
        return this;
    }

    /**
     * Action执行模式，支持串行，并行两种模式，默认串行
     * @return actionMode
     */
    public ActionModeEnum getActionMode() {
        return actionMode;
    }

    public void setActionMode(ActionModeEnum actionMode) {
        this.actionMode = actionMode;
    }

    public OperationState withActions(List<Action> actions) {
        this.actions = actions;
        return this;
    }

    public OperationState addActionsItem(Action actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public OperationState withActions(Consumer<List<Action>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 节点中要执行的操作列表
     * @return actions
     */
    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public OperationState withOnErrors(List<OnError> onErrors) {
        this.onErrors = onErrors;
        return this;
    }

    public OperationState addOnErrorsItem(OnError onErrorsItem) {
        if (this.onErrors == null) {
            this.onErrors = new ArrayList<>();
        }
        this.onErrors.add(onErrorsItem);
        return this;
    }

    public OperationState withOnErrors(Consumer<List<OnError>> onErrorsSetter) {
        if (this.onErrors == null) {
            this.onErrors = new ArrayList<>();
        }
        onErrorsSetter.accept(this.onErrors);
        return this;
    }

    /**
     * 错误处理策略
     * @return onErrors
     */
    public List<OnError> getOnErrors() {
        return onErrors;
    }

    public void setOnErrors(List<OnError> onErrors) {
        this.onErrors = onErrors;
    }

    public OperationState withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 节点ID，需要在当前函数流中唯一
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OperationState withName(String name) {
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

    public OperationState withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 节点类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public OperationState withEnd(Boolean end) {
        this.end = end;
        return this;
    }

    /**
     * 是否是结束节点
     * @return end
     */
    public Boolean getEnd() {
        return end;
    }

    public void setEnd(Boolean end) {
        this.end = end;
    }

    public OperationState withTransition(String transition) {
        this.transition = transition;
        return this;
    }

    /**
     * 下一步骤节点ID
     * @return transition
     */
    public String getTransition() {
        return transition;
    }

    public void setTransition(String transition) {
        this.transition = transition;
    }

    public OperationState withStateDataFilter(StateDataFilter stateDataFilter) {
        this.stateDataFilter = stateDataFilter;
        return this;
    }

    public OperationState withStateDataFilter(Consumer<StateDataFilter> stateDataFilterSetter) {
        if (this.stateDataFilter == null) {
            this.stateDataFilter = new StateDataFilter();
            stateDataFilterSetter.accept(this.stateDataFilter);
        }

        return this;
    }

    /**
     * Get stateDataFilter
     * @return stateDataFilter
     */
    public StateDataFilter getStateDataFilter() {
        return stateDataFilter;
    }

    public void setStateDataFilter(StateDataFilter stateDataFilter) {
        this.stateDataFilter = stateDataFilter;
    }

    public OperationState withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 时间等待节点等待时间（秒）,节点类型为Sleep时为必填，节点类型不为Sleep时无效
     * minimum: 0
     * maximum: 86400
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperationState that = (OperationState) obj;
        return Objects.equals(this.actionMode, that.actionMode) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.onErrors, that.onErrors) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.end, that.end) && Objects.equals(this.transition, that.transition)
            && Objects.equals(this.stateDataFilter, that.stateDataFilter)
            && Objects.equals(this.duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionMode, actions, onErrors, id, name, type, end, transition, stateDataFilter, duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperationState {\n");
        sb.append("    actionMode: ").append(toIndentedString(actionMode)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    onErrors: ").append(toIndentedString(onErrors)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    transition: ").append(toIndentedString(transition)).append("\n");
        sb.append("    stateDataFilter: ").append(toIndentedString(stateDataFilter)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
