package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListDatasourceTablesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_id")

    @JacksonXmlProperty(localName = "datasource_id")

    private String datasourceId;

    /**
     * 数据源所在任务位置 - SOURCE 数据源处于任务源端 - TARGET 数据源处于任务目标端
     */
    public static final class PositionEnum {

        /**
         * Enum SOURCE for value: "SOURCE"
         */
        public static final PositionEnum SOURCE = new PositionEnum("SOURCE");

        /**
         * Enum TARGET for value: "TARGET"
         */
        public static final PositionEnum TARGET = new PositionEnum("TARGET");

        private static final Map<String, PositionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PositionEnum> createStaticFields() {
            Map<String, PositionEnum> map = new HashMap<>();
            map.put("SOURCE", SOURCE);
            map.put("TARGET", TARGET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PositionEnum(String value) {
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
        public static PositionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PositionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PositionEnum(value);
            }
            return result;
        }

        public static PositionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PositionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PositionEnum) {
                return this.value.equals(((PositionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    @JacksonXmlProperty(localName = "position")

    private PositionEnum position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    @JacksonXmlProperty(localName = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_schema")

    @JacksonXmlProperty(localName = "db_schema")

    private String dbSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    @JacksonXmlProperty(localName = "filter")

    private String filter;

    public ListDatasourceTablesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListDatasourceTablesRequest withDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }

    /**
     * 数据源ID
     * @return datasourceId
     */
    public String getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

    public ListDatasourceTablesRequest withPosition(PositionEnum position) {
        this.position = position;
        return this;
    }

    /**
     * 数据源所在任务位置 - SOURCE 数据源处于任务源端 - TARGET 数据源处于任务目标端
     * @return position
     */
    public PositionEnum getPosition() {
        return position;
    }

    public void setPosition(PositionEnum position) {
        this.position = position;
    }

    public ListDatasourceTablesRequest withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称，只支持MRSHIVE，FIHIVE类型的数据源
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ListDatasourceTablesRequest withDbSchema(String dbSchema) {
        this.dbSchema = dbSchema;
        return this;
    }

    /**
     * 数据库模式,GAUSS100数据库使用
     * @return dbSchema
     */
    public String getDbSchema() {
        return dbSchema;
    }

    public void setDbSchema(String dbSchema) {
        this.dbSchema = dbSchema;
    }

    public ListDatasourceTablesRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 表名模糊匹配过滤器
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDatasourceTablesRequest listDatasourceTablesRequest = (ListDatasourceTablesRequest) o;
        return Objects.equals(this.instanceId, listDatasourceTablesRequest.instanceId)
            && Objects.equals(this.datasourceId, listDatasourceTablesRequest.datasourceId)
            && Objects.equals(this.position, listDatasourceTablesRequest.position)
            && Objects.equals(this.dbName, listDatasourceTablesRequest.dbName)
            && Objects.equals(this.dbSchema, listDatasourceTablesRequest.dbSchema)
            && Objects.equals(this.filter, listDatasourceTablesRequest.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, datasourceId, position, dbName, dbSchema, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatasourceTablesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    dbSchema: ").append(toIndentedString(dbSchema)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
