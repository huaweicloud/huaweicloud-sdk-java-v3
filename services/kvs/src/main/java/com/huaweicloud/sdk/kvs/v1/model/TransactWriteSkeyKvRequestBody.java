package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TransactWriteSkeyKvRequestBody
 */
public class TransactWriteSkeyKvRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")
    @BsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_key")
    @BsonProperty(value = "shard_key")

    private Document shardKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_key_kv_opers")
    @BsonProperty(value = "shard_key_kv_opers")

    private List<ShardKeyKvOperItem> shardKeyKvOpers = null;

    public TransactWriteSkeyKvRequestBody withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名，仓内唯一
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public TransactWriteSkeyKvRequestBody withShardKey(Document shardKey) {
        this.shardKey = shardKey;
        return this;
    }

    /**
     * 要遍历的指定分区键下的kv
     * @return shardKey
     */
    public Document getShardKey() {
        return shardKey;
    }

    public void setShardKey(Document shardKey) {
        this.shardKey = shardKey;
    }

    public TransactWriteSkeyKvRequestBody withShardKeyKvOpers(List<ShardKeyKvOperItem> shardKeyKvOpers) {
        this.shardKeyKvOpers = shardKeyKvOpers;
        return this;
    }

    public TransactWriteSkeyKvRequestBody addShardKeyKvOpersItem(ShardKeyKvOperItem shardKeyKvOpersItem) {
        if (this.shardKeyKvOpers == null) {
            this.shardKeyKvOpers = new ArrayList<>();
        }
        this.shardKeyKvOpers.add(shardKeyKvOpersItem);
        return this;
    }

    public TransactWriteSkeyKvRequestBody withShardKeyKvOpers(
        Consumer<List<ShardKeyKvOperItem>> shardKeyKvOpersSetter) {
        if (this.shardKeyKvOpers == null) {
            this.shardKeyKvOpers = new ArrayList<>();
        }
        shardKeyKvOpersSetter.accept(this.shardKeyKvOpers);
        return this;
    }

    /**
     * 行操作数组，行操作类型可以是多个文档的 put_kv_oper或delete_kv或CheckKv或update_kv
     * @return shardKeyKvOpers
     */
    public List<ShardKeyKvOperItem> getShardKeyKvOpers() {
        return shardKeyKvOpers;
    }

    public void setShardKeyKvOpers(List<ShardKeyKvOperItem> shardKeyKvOpers) {
        this.shardKeyKvOpers = shardKeyKvOpers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransactWriteSkeyKvRequestBody that = (TransactWriteSkeyKvRequestBody) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.shardKey, that.shardKey)
            && Objects.equals(this.shardKeyKvOpers, that.shardKeyKvOpers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, shardKey, shardKeyKvOpers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactWriteSkeyKvRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    shardKey: ").append(toIndentedString(shardKey)).append("\n");
        sb.append("    shardKeyKvOpers: ").append(toIndentedString(shardKeyKvOpers)).append("\n");
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
