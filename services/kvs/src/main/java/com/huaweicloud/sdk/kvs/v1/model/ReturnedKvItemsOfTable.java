package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReturnedKvItemsOfTable
 */
public class ReturnedKvItemsOfTable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")
    @BsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returned_kv_items")
    @BsonProperty(value = "returned_kv_items")

    private List<ReturnedKvItem> returnedKvItems = null;

    public ReturnedKvItemsOfTable withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名，仓内唯一。 - 长度：[3, 63] - 取值字符限制：[a-z0-9_-]+
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ReturnedKvItemsOfTable withReturnedKvItems(List<ReturnedKvItem> returnedKvItems) {
        this.returnedKvItems = returnedKvItems;
        return this;
    }

    public ReturnedKvItemsOfTable addReturnedKvItemsItem(ReturnedKvItem returnedKvItemsItem) {
        if (this.returnedKvItems == null) {
            this.returnedKvItems = new ArrayList<>();
        }
        this.returnedKvItems.add(returnedKvItemsItem);
        return this;
    }

    public ReturnedKvItemsOfTable withReturnedKvItems(Consumer<List<ReturnedKvItem>> returnedKvItemsSetter) {
        if (this.returnedKvItems == null) {
            this.returnedKvItems = new ArrayList<>();
        }
        returnedKvItemsSetter.accept(this.returnedKvItems);
        return this;
    }

    /**
     * Get returnedKvItems
     * @return returnedKvItems
     */
    public List<ReturnedKvItem> getReturnedKvItems() {
        return returnedKvItems;
    }

    public void setReturnedKvItems(List<ReturnedKvItem> returnedKvItems) {
        this.returnedKvItems = returnedKvItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReturnedKvItemsOfTable that = (ReturnedKvItemsOfTable) obj;
        return Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.returnedKvItems, that.returnedKvItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, returnedKvItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReturnedKvItemsOfTable {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    returnedKvItems: ").append(toIndentedString(returnedKvItems)).append("\n");
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
