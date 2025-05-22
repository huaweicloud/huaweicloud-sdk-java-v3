package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 待重分布表优先级请求信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class RedisPriorityTable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_order")

    private Integer redisOrder;

    public RedisPriorityTable withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * **参数解释**： 模式名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public RedisPriorityTable withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 表ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RedisPriorityTable withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * **参数解释**： 表名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public RedisPriorityTable withRedisOrder(Integer redisOrder) {
        this.redisOrder = redisOrder;
        return this;
    }

    /**
     * **参数解释**： 优先级。 **约束限制**： 不涉及。 **取值范围**： 1~1024 **默认取值**： 不涉及。
     * @return redisOrder
     */
    public Integer getRedisOrder() {
        return redisOrder;
    }

    public void setRedisOrder(Integer redisOrder) {
        this.redisOrder = redisOrder;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RedisPriorityTable that = (RedisPriorityTable) obj;
        return Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.id, that.id)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.redisOrder, that.redisOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaName, id, tableName, redisOrder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisPriorityTable {\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    redisOrder: ").append(toIndentedString(redisOrder)).append("\n");
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
