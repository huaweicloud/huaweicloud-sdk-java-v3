package com.huaweicloud.sdk.mrs.v2.model;

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
public class ListNodesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_group")

    private String nodeGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    /**
     * 排序键，支持对节点名称排序。
     */
    public static final class SortKeyEnum {

        /**
         * Enum NODE_NAME for value: "node_name"
         */
        public static final SortKeyEnum NODE_NAME = new SortKeyEnum("node_name");

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("node_name", NODE_NAME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortKeyEnum(String value) {
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
        public static SortKeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortKeyEnum(value));
        }

        public static SortKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortKeyEnum) {
                return this.value.equals(((SortKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private SortKeyEnum sortKey;

    /**
     * 列表排序方式，desc为降序，asc为升序。
     */
    public static final class SortDirEnum {

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("desc", DESC);
            map.put("asc", ASC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortDirEnum(value));
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private SortDirEnum sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_node_detail")

    private Boolean queryNodeDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_ecs_detail")

    private Boolean queryEcsDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_ip")

    private String internalIp;

    public ListNodesRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListNodesRequest withNodeGroup(String nodeGroup) {
        this.nodeGroup = nodeGroup;
        return this;
    }

    /**
     * 要查询的节点组名称。
     * @return nodeGroup
     */
    public String getNodeGroup() {
        return nodeGroup;
    }

    public void setNodeGroup(String nodeGroup) {
        this.nodeGroup = nodeGroup;
    }

    public ListNodesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回结果中每页显示条数。缺省值：10。
     * minimum: 1
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListNodesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 表示作业列表从该偏移量开始查询。缺省值：1。
     * minimum: 1
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListNodesRequest withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 指定节点名称，支持模糊搜索。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public ListNodesRequest withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序键，支持对节点名称排序。
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    public ListNodesRequest withSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 列表排序方式，desc为降序，asc为升序。
     * @return sortDir
     */
    public SortDirEnum getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
    }

    public ListNodesRequest withQueryNodeDetail(Boolean queryNodeDetail) {
        this.queryNodeDetail = queryNodeDetail;
        return this;
    }

    /**
     * 是否查询节点详情。该字段设为true时可能会影响接口性能。
     * @return queryNodeDetail
     */
    public Boolean getQueryNodeDetail() {
        return queryNodeDetail;
    }

    public void setQueryNodeDetail(Boolean queryNodeDetail) {
        this.queryNodeDetail = queryNodeDetail;
    }

    public ListNodesRequest withQueryEcsDetail(Boolean queryEcsDetail) {
        this.queryEcsDetail = queryEcsDetail;
        return this;
    }

    /**
     * 是否查询ECS详情信息，会涉及对ECS接口调用。
     * @return queryEcsDetail
     */
    public Boolean getQueryEcsDetail() {
        return queryEcsDetail;
    }

    public void setQueryEcsDetail(Boolean queryEcsDetail) {
        this.queryEcsDetail = queryEcsDetail;
    }

    public ListNodesRequest withInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    /**
     * 指定内网IP。
     * @return internalIp
     */
    public String getInternalIp() {
        return internalIp;
    }

    public void setInternalIp(String internalIp) {
        this.internalIp = internalIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNodesRequest that = (ListNodesRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.nodeGroup, that.nodeGroup)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.queryNodeDetail, that.queryNodeDetail)
            && Objects.equals(this.queryEcsDetail, that.queryEcsDetail)
            && Objects.equals(this.internalIp, that.internalIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId,
            nodeGroup,
            limit,
            offset,
            nodeName,
            sortKey,
            sortDir,
            queryNodeDetail,
            queryEcsDetail,
            internalIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNodesRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    nodeGroup: ").append(toIndentedString(nodeGroup)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    queryNodeDetail: ").append(toIndentedString(queryNodeDetail)).append("\n");
        sb.append("    queryEcsDetail: ").append(toIndentedString(queryEcsDetail)).append("\n");
        sb.append("    internalIp: ").append(toIndentedString(internalIp)).append("\n");
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
