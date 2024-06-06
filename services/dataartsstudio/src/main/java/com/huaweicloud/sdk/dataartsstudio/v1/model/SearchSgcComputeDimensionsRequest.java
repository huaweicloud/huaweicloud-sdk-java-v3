package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class SearchSgcComputeDimensionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_creator_name")

    private String nodeCreatorName;

    /**
     * 类型，0表示节点实例,1表示脚本,2表示节点的测试运行,成本管理页面对于0和2的情况均展示为节点实例
     */
    public static final class TypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final TypeEnum NUMBER_0 = new TypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final TypeEnum NUMBER_1 = new TypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final TypeEnum NUMBER_2 = new TypeEnum(2);

        private static final Map<Integer, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TypeEnum> createStaticFields() {
            Map<Integer, TypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(Integer value) {
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

    /**
     * 节点类型，HIVE SQL, SparkSQL, Spark, Flink SQL, MRS Flink Job, DWS SQL为支持的枚举节点类型
     */
    public static final class NodeTypeEnum {

        /**
         * Enum HIVE_SQL for value: "HIVE SQL"
         */
        public static final NodeTypeEnum HIVE_SQL = new NodeTypeEnum("HIVE SQL");

        /**
         * Enum SPARKSQL for value: "SparkSQL"
         */
        public static final NodeTypeEnum SPARKSQL = new NodeTypeEnum("SparkSQL");

        /**
         * Enum SPARK for value: "Spark"
         */
        public static final NodeTypeEnum SPARK = new NodeTypeEnum("Spark");

        /**
         * Enum FLINK_SQL for value: "Flink SQL"
         */
        public static final NodeTypeEnum FLINK_SQL = new NodeTypeEnum("Flink SQL");

        /**
         * Enum MRS_FLINK_JOB for value: "MRS Flink Job"
         */
        public static final NodeTypeEnum MRS_FLINK_JOB = new NodeTypeEnum("MRS Flink Job");

        /**
         * Enum DWS_SQL for value: "DWS SQL"
         */
        public static final NodeTypeEnum DWS_SQL = new NodeTypeEnum("DWS SQL");

        private static final Map<String, NodeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodeTypeEnum> createStaticFields() {
            Map<String, NodeTypeEnum> map = new HashMap<>();
            map.put("HIVE SQL", HIVE_SQL);
            map.put("SparkSQL", SPARKSQL);
            map.put("Spark", SPARK);
            map.put("Flink SQL", FLINK_SQL);
            map.put("MRS Flink Job", MRS_FLINK_JOB);
            map.put("DWS SQL", DWS_SQL);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NodeTypeEnum(value));
        }

        public static NodeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    public SearchSgcComputeDimensionsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * DataArts Studio实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SearchSgcComputeDimensionsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public SearchSgcComputeDimensionsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchSgcComputeDimensionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回数据条数，表示页大小
     * minimum: 0
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchSgcComputeDimensionsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 节点实例名称或脚本名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SearchSgcComputeDimensionsRequest withNodeCreatorName(String nodeCreatorName) {
        this.nodeCreatorName = nodeCreatorName;
        return this;
    }

    /**
     * 节点实例创建者name
     * @return nodeCreatorName
     */
    public String getNodeCreatorName() {
        return nodeCreatorName;
    }

    public void setNodeCreatorName(String nodeCreatorName) {
        this.nodeCreatorName = nodeCreatorName;
    }

    public SearchSgcComputeDimensionsRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 类型，0表示节点实例,1表示脚本,2表示节点的测试运行,成本管理页面对于0和2的情况均展示为节点实例
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SearchSgcComputeDimensionsRequest withNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型，HIVE SQL, SparkSQL, Spark, Flink SQL, MRS Flink Job, DWS SQL为支持的枚举节点类型
     * @return nodeType
     */
    public NodeTypeEnum getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
    }

    public SearchSgcComputeDimensionsRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序规则，示例priority ASC表示按照优先级升序排序,priority DESC表示按照优先级降序排序
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchSgcComputeDimensionsRequest that = (SearchSgcComputeDimensionsRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nodeCreatorName, that.nodeCreatorName)
            && Objects.equals(this.type, that.type) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.orderBy, that.orderBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, workspaceId, offset, limit, name, nodeCreatorName, type, nodeType, orderBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchSgcComputeDimensionsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeCreatorName: ").append(toIndentedString(nodeCreatorName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
