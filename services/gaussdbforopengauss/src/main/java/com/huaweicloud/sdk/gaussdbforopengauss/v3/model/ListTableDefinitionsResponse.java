package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListTableDefinitionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_definitions")

    private List<SchemaTableDefinitionResult> tableDefinitions = null;

    public ListTableDefinitionsResponse withTableDefinitions(List<SchemaTableDefinitionResult> tableDefinitions) {
        this.tableDefinitions = tableDefinitions;
        return this;
    }

    public ListTableDefinitionsResponse addTableDefinitionsItem(SchemaTableDefinitionResult tableDefinitionsItem) {
        if (this.tableDefinitions == null) {
            this.tableDefinitions = new ArrayList<>();
        }
        this.tableDefinitions.add(tableDefinitionsItem);
        return this;
    }

    public ListTableDefinitionsResponse withTableDefinitions(
        Consumer<List<SchemaTableDefinitionResult>> tableDefinitionsSetter) {
        if (this.tableDefinitions == null) {
            this.tableDefinitions = new ArrayList<>();
        }
        tableDefinitionsSetter.accept(this.tableDefinitions);
        return this;
    }

    /**
     * **参数解释**: 数据库表定义信息列表。
     * @return tableDefinitions
     */
    public List<SchemaTableDefinitionResult> getTableDefinitions() {
        return tableDefinitions;
    }

    public void setTableDefinitions(List<SchemaTableDefinitionResult> tableDefinitions) {
        this.tableDefinitions = tableDefinitions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTableDefinitionsResponse that = (ListTableDefinitionsResponse) obj;
        return Objects.equals(this.tableDefinitions, that.tableDefinitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableDefinitions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTableDefinitionsResponse {\n");
        sb.append("    tableDefinitions: ").append(toIndentedString(tableDefinitions)).append("\n");
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
