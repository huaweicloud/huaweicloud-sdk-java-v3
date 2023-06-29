package com.huaweicloud.sdk.dwr.v3.model;

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
 * 工作流中定义的每一个节点。
 */
public class State {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Boolean start;

    /**
     * 必须有TYPE，TYPE值必须是3种State（DELAY，OPERATION，END）中一种。
     */
    public static final class TypeEnum {

        /**
         * Enum DELAY for value: "DELAY"
         */
        public static final TypeEnum DELAY = new TypeEnum("DELAY");

        /**
         * Enum OPERATION for value: "OPERATION"
         */
        public static final TypeEnum OPERATION = new TypeEnum("OPERATION");

        /**
         * Enum END for value: "END"
         */
        public static final TypeEnum END = new TypeEnum("END");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("DELAY", DELAY);
            map.put("OPERATION", OPERATION);
            map.put("END", END);
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
    @JsonProperty(value = "payload_filter_in")

    private String payloadFilterIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payload_filter_out")

    private String payloadFilterOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_name")

    private String stateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_mode")

    private String actionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<Action> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_state")

    private String nextState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_delay")

    private Integer timeDelay;

    public State withStart(Boolean start) {
        this.start = start;
        return this;
    }

    /**
     * 标识开始的state，图中必须且只有一个start为true的state。
     * @return start
     */
    public Boolean getStart() {
        return start;
    }

    public void setStart(Boolean start) {
        this.start = start;
    }

    public State withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 必须有TYPE，TYPE值必须是3种State（DELAY，OPERATION，END）中一种。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public State withPayloadFilterIn(String payloadFilterIn) {
        this.payloadFilterIn = payloadFilterIn;
        return this;
    }

    /**
     * 过滤输入参数，默认值是\"$\"，表示不过滤。必须是合法的JSONPath格式。 说明 END State没有payload_filter_in属性。
     * @return payloadFilterIn
     */
    public String getPayloadFilterIn() {
        return payloadFilterIn;
    }

    public void setPayloadFilterIn(String payloadFilterIn) {
        this.payloadFilterIn = payloadFilterIn;
    }

    public State withPayloadFilterOut(String payloadFilterOut) {
        this.payloadFilterOut = payloadFilterOut;
        return this;
    }

    /**
     * 过滤state的输出结果，默认值是\"$\"，表示不过滤。 必须是合法的JSONPath格式。 说明 END State没有payload_filter_out属性。
     * @return payloadFilterOut
     */
    public String getPayloadFilterOut() {
        return payloadFilterOut;
    }

    public void setPayloadFilterOut(String payloadFilterOut) {
        this.payloadFilterOut = payloadFilterOut;
    }

    public State withStateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    /**
     * state的名字定义。 由小写字母、数字和中划线“-”组成，长度为[1, 20]。
     * @return stateName
     */
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public State withActionMode(String actionMode) {
        this.actionMode = actionMode;
        return this;
    }

    /**
     * Action执行模式，支持串行，并行两种模式，默认串行  最小长度：1  最大长度：32  枚举值：  sequential  parallel
     * @return actionMode
     */
    public String getActionMode() {
        return actionMode;
    }

    public void setActionMode(String actionMode) {
        this.actionMode = actionMode;
    }

    public State withActions(List<Action> actions) {
        this.actions = actions;
        return this;
    }

    public State addActionsItem(Action actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public State withActions(Consumer<List<Action>> actionsSetter) {
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

    public State withNextState(String nextState) {
        this.nextState = nextState;
        return this;
    }

    /**
     * 创建工作流指定的下一个节点名称
     * @return nextState
     */
    public String getNextState() {
        return nextState;
    }

    public void setNextState(String nextState) {
        this.nextState = nextState;
    }

    public State withTimeDelay(Integer timeDelay) {
        this.timeDelay = timeDelay;
        return this;
    }

    /**
     * 当节点类型为事件延迟时填入需要延迟的时间，单位为秒
     * @return timeDelay
     */
    public Integer getTimeDelay() {
        return timeDelay;
    }

    public void setTimeDelay(Integer timeDelay) {
        this.timeDelay = timeDelay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        State that = (State) obj;
        return Objects.equals(this.start, that.start) && Objects.equals(this.type, that.type)
            && Objects.equals(this.payloadFilterIn, that.payloadFilterIn)
            && Objects.equals(this.payloadFilterOut, that.payloadFilterOut)
            && Objects.equals(this.stateName, that.stateName) && Objects.equals(this.actionMode, that.actionMode)
            && Objects.equals(this.actions, that.actions) && Objects.equals(this.nextState, that.nextState)
            && Objects.equals(this.timeDelay, that.timeDelay);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(start, type, payloadFilterIn, payloadFilterOut, stateName, actionMode, actions, nextState, timeDelay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class State {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    payloadFilterIn: ").append(toIndentedString(payloadFilterIn)).append("\n");
        sb.append("    payloadFilterOut: ").append(toIndentedString(payloadFilterOut)).append("\n");
        sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
        sb.append("    actionMode: ").append(toIndentedString(actionMode)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    nextState: ").append(toIndentedString(nextState)).append("\n");
        sb.append("    timeDelay: ").append(toIndentedString(timeDelay)).append("\n");
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
