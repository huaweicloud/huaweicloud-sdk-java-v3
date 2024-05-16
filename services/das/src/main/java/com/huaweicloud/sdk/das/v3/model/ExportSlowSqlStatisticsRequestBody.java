package com.huaweicloud.sdk.das.v3.model;

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
 * ExportSlowSqlStatisticsRequestBody
 */
public class ExportSlowSqlStatisticsRequestBody {

    /**
     * 数据库类型。慢SQL统计支持的类型：DDS-Community。
     */
    public static final class DatastoreTypeEnum {

        /**
         * Enum DDS_COMMUNITY for value: "DDS-Community"
         */
        public static final DatastoreTypeEnum DDS_COMMUNITY = new DatastoreTypeEnum("DDS-Community");

        private static final Map<String, DatastoreTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatastoreTypeEnum> createStaticFields() {
            Map<String, DatastoreTypeEnum> map = new HashMap<>();
            map.put("DDS-Community", DDS_COMMUNITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatastoreTypeEnum(String value) {
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
        public static DatastoreTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DatastoreTypeEnum(value));
        }

        public static DatastoreTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatastoreTypeEnum) {
                return this.value.equals(((DatastoreTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private DatastoreTypeEnum datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    /**
     * 统计字段。支持统计的字段：node_id、sql_type、db_name、collection、user、client。默认使用node_id统计。
     */
    public static final class StatisticsFieldEnum {

        /**
         * Enum NODE_ID for value: "node_id"
         */
        public static final StatisticsFieldEnum NODE_ID = new StatisticsFieldEnum("node_id");

        /**
         * Enum SQL_TYPE for value: "sql_type"
         */
        public static final StatisticsFieldEnum SQL_TYPE = new StatisticsFieldEnum("sql_type");

        /**
         * Enum DB_NAME for value: "db_name"
         */
        public static final StatisticsFieldEnum DB_NAME = new StatisticsFieldEnum("db_name");

        /**
         * Enum COLLECTION for value: "collection"
         */
        public static final StatisticsFieldEnum COLLECTION = new StatisticsFieldEnum("collection");

        /**
         * Enum USER for value: "user"
         */
        public static final StatisticsFieldEnum USER = new StatisticsFieldEnum("user");

        /**
         * Enum CLIENT for value: "client"
         */
        public static final StatisticsFieldEnum CLIENT = new StatisticsFieldEnum("client");

        private static final Map<String, StatisticsFieldEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatisticsFieldEnum> createStaticFields() {
            Map<String, StatisticsFieldEnum> map = new HashMap<>();
            map.put("node_id", NODE_ID);
            map.put("sql_type", SQL_TYPE);
            map.put("db_name", DB_NAME);
            map.put("collection", COLLECTION);
            map.put("user", USER);
            map.put("client", CLIENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatisticsFieldEnum(String value) {
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
        public static StatisticsFieldEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatisticsFieldEnum(value));
        }

        public static StatisticsFieldEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatisticsFieldEnum) {
                return this.value.equals(((StatisticsFieldEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics_field")

    private StatisticsFieldEnum statisticsField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ExportSlowSqlStatisticsRequestBody withDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库类型。慢SQL统计支持的类型：DDS-Community。
     * @return datastoreType
     */
    public DatastoreTypeEnum getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
    }

    public ExportSlowSqlStatisticsRequestBody withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 开始时间（Unix timestamp），单位：毫秒。
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public ExportSlowSqlStatisticsRequestBody withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 结束时间（Unix timestamp），单位：毫秒。
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public ExportSlowSqlStatisticsRequestBody withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public ExportSlowSqlStatisticsRequestBody addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public ExportSlowSqlStatisticsRequestBody withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * 节点ID列表。
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public ExportSlowSqlStatisticsRequestBody withStatisticsField(StatisticsFieldEnum statisticsField) {
        this.statisticsField = statisticsField;
        return this;
    }

    /**
     * 统计字段。支持统计的字段：node_id、sql_type、db_name、collection、user、client。默认使用node_id统计。
     * @return statisticsField
     */
    public StatisticsFieldEnum getStatisticsField() {
        return statisticsField;
    }

    public void setStatisticsField(StatisticsFieldEnum statisticsField) {
        this.statisticsField = statisticsField;
    }

    public ExportSlowSqlStatisticsRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询），必须为数字，不能为负数。
     * minimum: 0
     * maximum: 200
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ExportSlowSqlStatisticsRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页记录数，默认为20，最大取值100。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportSlowSqlStatisticsRequestBody that = (ExportSlowSqlStatisticsRequestBody) obj;
        return Objects.equals(this.datastoreType, that.datastoreType) && Objects.equals(this.startAt, that.startAt)
            && Objects.equals(this.endAt, that.endAt) && Objects.equals(this.nodeIds, that.nodeIds)
            && Objects.equals(this.statisticsField, that.statisticsField) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreType, startAt, endAt, nodeIds, statisticsField, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportSlowSqlStatisticsRequestBody {\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
        sb.append("    statisticsField: ").append(toIndentedString(statisticsField)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
