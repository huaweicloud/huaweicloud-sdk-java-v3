package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTopIoTrafficsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_io_num")

    private Integer topIoNum;

    /**
     * TOP IO排序条件
     */
    public static final class SortConditionEnum {

        /**
         * Enum READ for value: "read"
         */
        public static final SortConditionEnum READ = new SortConditionEnum("read");

        /**
         * Enum WRITE for value: "write"
         */
        public static final SortConditionEnum WRITE = new SortConditionEnum("write");

        private static final Map<String, SortConditionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortConditionEnum> createStaticFields() {
            Map<String, SortConditionEnum> map = new HashMap<>();
            map.put("read", READ);
            map.put("write", WRITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortConditionEnum(String value) {
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
        public static SortConditionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortConditionEnum(value));
        }

        public static SortConditionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortConditionEnum) {
                return this.value.equals(((SortConditionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_condition")

    private SortConditionEnum sortCondition;

    public ListTopIoTrafficsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListTopIoTrafficsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，严格匹配UUID规则。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListTopIoTrafficsRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID。节点应为CN或者非日志角色的DN节点，并且节点状态为正常。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListTopIoTrafficsRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 组件ID。组件应为CN或者非日志角色的DN组件。 DN：Data Node，和CN对应的概念。负责实际执行表数据的存储、查询操作。 CN：Coordinator Node，负责数据库系统元数据存储、查询任务的分解和部分执行，以及将DN中查询结果汇聚在一起。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ListTopIoTrafficsRequest withTopIoNum(Integer topIoNum) {
        this.topIoNum = topIoNum;
        return this;
    }

    /**
     * 期望查询数据库进程下TOP IO线程数（默认值为20）。接口返回TOP IO线程与会话信息关联后的结果，数量最大不超过该值。
     * @return topIoNum
     */
    public Integer getTopIoNum() {
        return topIoNum;
    }

    public void setTopIoNum(Integer topIoNum) {
        this.topIoNum = topIoNum;
    }

    public ListTopIoTrafficsRequest withSortCondition(SortConditionEnum sortCondition) {
        this.sortCondition = sortCondition;
        return this;
    }

    /**
     * TOP IO排序条件
     * @return sortCondition
     */
    public SortConditionEnum getSortCondition() {
        return sortCondition;
    }

    public void setSortCondition(SortConditionEnum sortCondition) {
        this.sortCondition = sortCondition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTopIoTrafficsRequest that = (ListTopIoTrafficsRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.topIoNum, that.topIoNum) && Objects.equals(this.sortCondition, that.sortCondition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, nodeId, componentId, topIoNum, sortCondition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopIoTrafficsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    topIoNum: ").append(toIndentedString(topIoNum)).append("\n");
        sb.append("    sortCondition: ").append(toIndentedString(sortCondition)).append("\n");
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
