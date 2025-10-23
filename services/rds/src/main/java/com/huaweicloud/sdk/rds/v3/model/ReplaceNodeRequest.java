package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ReplaceNodeRequest
 */
public class ReplaceNodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    /**
     * 替换动作，取值范围： REPLACE: 节点顶替 REPLACE_ROLLBACK: 节点顶替回切
     */
    public static final class ReplaceActionEnum {

        /**
         * Enum REPLACE for value: "REPLACE"
         */
        public static final ReplaceActionEnum REPLACE = new ReplaceActionEnum("REPLACE");

        /**
         * Enum REPLACE_ROLLBACK for value: "REPLACE_ROLLBACK"
         */
        public static final ReplaceActionEnum REPLACE_ROLLBACK = new ReplaceActionEnum("REPLACE_ROLLBACK");

        private static final Map<String, ReplaceActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplaceActionEnum> createStaticFields() {
            Map<String, ReplaceActionEnum> map = new HashMap<>();
            map.put("REPLACE", REPLACE);
            map.put("REPLACE_ROLLBACK", REPLACE_ROLLBACK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplaceActionEnum(String value) {
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
        public static ReplaceActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReplaceActionEnum(value));
        }

        public static ReplaceActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplaceActionEnum) {
                return this.value.equals(((ReplaceActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replace_action")

    private ReplaceActionEnum replaceAction;

    public ReplaceNodeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 只读实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ReplaceNodeRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 只读实例的节点ID。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ReplaceNodeRequest withReplaceAction(ReplaceActionEnum replaceAction) {
        this.replaceAction = replaceAction;
        return this;
    }

    /**
     * 替换动作，取值范围： REPLACE: 节点顶替 REPLACE_ROLLBACK: 节点顶替回切
     * @return replaceAction
     */
    public ReplaceActionEnum getReplaceAction() {
        return replaceAction;
    }

    public void setReplaceAction(ReplaceActionEnum replaceAction) {
        this.replaceAction = replaceAction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplaceNodeRequest that = (ReplaceNodeRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.replaceAction, that.replaceAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, nodeId, replaceAction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplaceNodeRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    replaceAction: ").append(toIndentedString(replaceAction)).append("\n");
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
