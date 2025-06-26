package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDatabaseObjectsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_fine_grained_disaster")

    private String isFineGrainedDisaster;

    public ListDatabaseObjectsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID。获取方法请参见[获取集群ID](dws_02_00068.xml)。 **约束限制**： 必须是有效的dws集群ID。 **取值范围**： 36位UUID。 **默认取值**： 不涉及。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListDatabaseObjectsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 对象类型。 **约束限制**： 不涉及。 **取值范围**： DATABASE、SCHEMA、TABLE、VIEW、COLUMN、FUNCTION、SEQUENCE、NODEGROUP **默认取值**： null
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListDatabaseObjectsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 对象名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListDatabaseObjectsRequest withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * **参数解释**： 数据库名。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public ListDatabaseObjectsRequest withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * **参数解释**： 模式名。 **约束限制**： 当对象类型为TABLE、VIEW、COLUMN、FUNCTION、SEQUENCE时必选。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public ListDatabaseObjectsRequest withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * **参数解释**： 表名。 **约束限制**： 对象类型为COLUMN时必选。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public ListDatabaseObjectsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 分页偏移量，从0开始，页数减1。 **约束限制**： 不涉及。 **取值范围**： 大于等于0。 **默认取值**： 0
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDatabaseObjectsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 分页大小。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 1000
     * minimum: 1
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDatabaseObjectsRequest withIsFineGrainedDisaster(String isFineGrainedDisaster) {
        this.isFineGrainedDisaster = isFineGrainedDisaster;
        return this;
    }

    /**
     * **参数解释**： 是否细粒度容灾。 **约束限制**： 不涉及。 **取值范围**： true|false **默认取值**： 不涉及。
     * @return isFineGrainedDisaster
     */
    public String getIsFineGrainedDisaster() {
        return isFineGrainedDisaster;
    }

    public void setIsFineGrainedDisaster(String isFineGrainedDisaster) {
        this.isFineGrainedDisaster = isFineGrainedDisaster;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDatabaseObjectsRequest that = (ListDatabaseObjectsRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.name, that.name) && Objects.equals(this.database, that.database)
            && Objects.equals(this.schema, that.schema) && Objects.equals(this.table, that.table)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.isFineGrainedDisaster, that.isFineGrainedDisaster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, type, name, database, schema, table, offset, limit, isFineGrainedDisaster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabaseObjectsRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    isFineGrainedDisaster: ").append(toIndentedString(isFineGrainedDisaster)).append("\n");
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
