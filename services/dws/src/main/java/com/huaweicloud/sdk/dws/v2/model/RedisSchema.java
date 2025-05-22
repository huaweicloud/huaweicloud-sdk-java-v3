package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 待重分布的schema对象。 **取值范围**： 不涉及。
 */
public class RedisSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_order")

    private Integer redisOrder;

    public RedisSchema withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * **参数解释**： schema名称。 **取值范围**： 不涉及。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public RedisSchema withRedisOrder(Integer redisOrder) {
        this.redisOrder = redisOrder;
        return this;
    }

    /**
     * **参数解释**： 优先级序号。 **取值范围**： 大于0的整数
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
        RedisSchema that = (RedisSchema) obj;
        return Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.redisOrder, that.redisOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaName, redisOrder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisSchema {\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
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
