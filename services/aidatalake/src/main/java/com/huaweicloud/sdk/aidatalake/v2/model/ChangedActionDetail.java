package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**：策略 action 变更详情，包含 action 操作、action 描述和变更类型。 
 */
public class ChangedActionDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_description")

    private String actionDescription;

    /**
     * **参数解释**：变更类型。added 表示需要新增的权限操作。 **取值范围**：   - added：需要新增
     */
    public static final class ChangeTypeEnum {

        /**
         * Enum ADDED for value: "added"
         */
        public static final ChangeTypeEnum ADDED = new ChangeTypeEnum("added");

        private static final Map<String, ChangeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChangeTypeEnum> createStaticFields() {
            Map<String, ChangeTypeEnum> map = new HashMap<>();
            map.put("added", ADDED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChangeTypeEnum(String value) {
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
        public static ChangeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChangeTypeEnum(value));
        }

        public static ChangeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChangeTypeEnum) {
                return this.value.equals(((ChangeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_type")

    private ChangeTypeEnum changeType;

    public ChangedActionDetail withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**：权限操作内容。 **取值范围**：长度0~256个字符。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ChangedActionDetail withActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
        return this;
    }

    /**
     * **参数解释**：权限操作的描述信息。 **取值范围**：不涉及。
     * @return actionDescription
     */
    public String getActionDescription() {
        return actionDescription;
    }

    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    public ChangedActionDetail withChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * **参数解释**：变更类型。added 表示需要新增的权限操作。 **取值范围**：   - added：需要新增
     * @return changeType
     */
    public ChangeTypeEnum getChangeType() {
        return changeType;
    }

    public void setChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangedActionDetail that = (ChangedActionDetail) obj;
        return Objects.equals(this.action, that.action)
            && Objects.equals(this.actionDescription, that.actionDescription)
            && Objects.equals(this.changeType, that.changeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, actionDescription, changeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangedActionDetail {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    actionDescription: ").append(toIndentedString(actionDescription)).append("\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
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
