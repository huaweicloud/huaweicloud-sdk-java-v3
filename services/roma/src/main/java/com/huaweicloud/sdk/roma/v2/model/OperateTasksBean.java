package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OperateTasksBean
 */
public class OperateTasksBean {

    /**
     * 操作类型 - start (启动) - stop (停止)
     */
    public static final class ActionIdEnum {

        /**
         * Enum START for value: "start"
         */
        public static final ActionIdEnum START = new ActionIdEnum("start");

        /**
         * Enum STOP for value: "stop"
         */
        public static final ActionIdEnum STOP = new ActionIdEnum("stop");

        private static final Map<String, ActionIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionIdEnum> createStaticFields() {
            Map<String, ActionIdEnum> map = new HashMap<>();
            map.put("start", START);
            map.put("stop", STOP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionIdEnum(String value) {
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
        public static ActionIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ActionIdEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionIdEnum(value);
            }
            return result;
        }

        public static ActionIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ActionIdEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionIdEnum) {
                return this.value.equals(((ActionIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_id")

    @JacksonXmlProperty(localName = "action_id")

    private ActionIdEnum actionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    @JacksonXmlProperty(localName = "list")

    private List<TaskBean> list = null;

    public OperateTasksBean withActionId(ActionIdEnum actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * 操作类型 - start (启动) - stop (停止)
     * @return actionId
     */
    public ActionIdEnum getActionId() {
        return actionId;
    }

    public void setActionId(ActionIdEnum actionId) {
        this.actionId = actionId;
    }

    public OperateTasksBean withList(List<TaskBean> list) {
        this.list = list;
        return this;
    }

    public OperateTasksBean addListItem(TaskBean listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public OperateTasksBean withList(Consumer<List<TaskBean>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 需要启动或者停止的任务ID列表
     * @return list
     */
    public List<TaskBean> getList() {
        return list;
    }

    public void setList(List<TaskBean> list) {
        this.list = list;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperateTasksBean operateTasksBean = (OperateTasksBean) o;
        return Objects.equals(this.actionId, operateTasksBean.actionId)
            && Objects.equals(this.list, operateTasksBean.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionId, list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateTasksBean {\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
