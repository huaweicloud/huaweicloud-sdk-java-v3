package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListTableDefinitionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_definition")

    private String tableDefinition;

    public ListTableDefinitionResponse withTableDefinition(String tableDefinition) {
        this.tableDefinition = tableDefinition;
        return this;
    }

    /**
     * **参数解释**: 数据库表定义信息。 **取值范围**: 不涉及。 
     * @return tableDefinition
     */
    public String getTableDefinition() {
        return tableDefinition;
    }

    public void setTableDefinition(String tableDefinition) {
        this.tableDefinition = tableDefinition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTableDefinitionResponse that = (ListTableDefinitionResponse) obj;
        return Objects.equals(this.tableDefinition, that.tableDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableDefinition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTableDefinitionResponse {\n");
        sb.append("    tableDefinition: ").append(toIndentedString(tableDefinition)).append("\n");
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
