package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 任务实例规格信息体。
 */
public class JobNodeSpecInfo {

    /**
     * 实例规格编码。取值： - micro：极小规格。 - small：小规格。 - medium：中规格。 - high：大规格。
     */
    public static final class NodeTypeEnum {

        /**
         * Enum MICRO for value: "micro"
         */
        public static final NodeTypeEnum MICRO = new NodeTypeEnum("micro");

        /**
         * Enum SMALL for value: "small"
         */
        public static final NodeTypeEnum SMALL = new NodeTypeEnum("small");

        /**
         * Enum MEDIUM for value: "medium"
         */
        public static final NodeTypeEnum MEDIUM = new NodeTypeEnum("medium");

        /**
         * Enum HIGH for value: "high"
         */
        public static final NodeTypeEnum HIGH = new NodeTypeEnum("high");

        private static final Map<String, NodeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodeTypeEnum> createStaticFields() {
            Map<String, NodeTypeEnum> map = new HashMap<>();
            map.put("micro", MICRO);
            map.put("small", SMALL);
            map.put("medium", MEDIUM);
            map.put("high", HIGH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NodeTypeEnum(String value) {
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
        public static NodeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NodeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NodeTypeEnum(value);
            }
            return result;
        }

        public static NodeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NodeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NodeTypeEnum) {
                return this.value.equals(((NodeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private NodeTypeEnum nodeType;

    public JobNodeSpecInfo withNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 实例规格编码。取值： - micro：极小规格。 - small：小规格。 - medium：中规格。 - high：大规格。
     * @return nodeType
     */
    public NodeTypeEnum getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobNodeSpecInfo jobNodeSpecInfo = (JobNodeSpecInfo) o;
        return Objects.equals(this.nodeType, jobNodeSpecInfo.nodeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobNodeSpecInfo {\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
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
