package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class MigrateSqlStatementResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement")

    private String statement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unsupported_items")

    private List<UnSupportedItem> unsupportedItems = null;

    public MigrateSqlStatementResponse withStatement(String statement) {
        this.statement = statement;
        return this;
    }

    /**
     * 输入SQL语句从源端到目标端的转换结果
     * @return statement
     */
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public MigrateSqlStatementResponse withUnsupportedItems(List<UnSupportedItem> unsupportedItems) {
        this.unsupportedItems = unsupportedItems;
        return this;
    }

    public MigrateSqlStatementResponse addUnsupportedItemsItem(UnSupportedItem unsupportedItemsItem) {
        if (this.unsupportedItems == null) {
            this.unsupportedItems = new ArrayList<>();
        }
        this.unsupportedItems.add(unsupportedItemsItem);
        return this;
    }

    public MigrateSqlStatementResponse withUnsupportedItems(Consumer<List<UnSupportedItem>> unsupportedItemsSetter) {
        if (this.unsupportedItems == null) {
            this.unsupportedItems = new ArrayList<>();
        }
        unsupportedItemsSetter.accept(this.unsupportedItems);
        return this;
    }

    /**
     * Get unsupportedItems
     * @return unsupportedItems
     */
    public List<UnSupportedItem> getUnsupportedItems() {
        return unsupportedItems;
    }

    public void setUnsupportedItems(List<UnSupportedItem> unsupportedItems) {
        this.unsupportedItems = unsupportedItems;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrateSqlStatementResponse migrateSqlStatementResponse = (MigrateSqlStatementResponse) o;
        return Objects.equals(this.statement, migrateSqlStatementResponse.statement)
            && Objects.equals(this.unsupportedItems, migrateSqlStatementResponse.unsupportedItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statement, unsupportedItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateSqlStatementResponse {\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
        sb.append("    unsupportedItems: ").append(toIndentedString(unsupportedItems)).append("\n");
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
