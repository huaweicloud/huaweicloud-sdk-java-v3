package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 源库中的schema信息。
 */
public class SchemaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_select_all_schemas")

    private Boolean isSelectAllSchemas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas_list")

    private List<String> schemasList = null;

    public SchemaInfo withIsSelectAllSchemas(Boolean isSelectAllSchemas) {
        this.isSelectAllSchemas = isSelectAllSchemas;
        return this;
    }

    /**
     * 是否选择全部schema。
     * @return isSelectAllSchemas
     */
    public Boolean getIsSelectAllSchemas() {
        return isSelectAllSchemas;
    }

    public void setIsSelectAllSchemas(Boolean isSelectAllSchemas) {
        this.isSelectAllSchemas = isSelectAllSchemas;
    }

    public SchemaInfo withSchemasList(List<String> schemasList) {
        this.schemasList = schemasList;
        return this;
    }

    public SchemaInfo addSchemasListItem(String schemasListItem) {
        if (this.schemasList == null) {
            this.schemasList = new ArrayList<>();
        }
        this.schemasList.add(schemasListItem);
        return this;
    }

    public SchemaInfo withSchemasList(Consumer<List<String>> schemasListSetter) {
        if (this.schemasList == null) {
            this.schemasList = new ArrayList<>();
        }
        schemasListSetter.accept(this.schemasList);
        return this;
    }

    /**
     * 需要评估的源库schema列表。is_select_all_schemas为false时，必填。
     * @return schemasList
     */
    public List<String> getSchemasList() {
        return schemasList;
    }

    public void setSchemasList(List<String> schemasList) {
        this.schemasList = schemasList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SchemaInfo schemaInfo = (SchemaInfo) o;
        return Objects.equals(this.isSelectAllSchemas, schemaInfo.isSelectAllSchemas)
            && Objects.equals(this.schemasList, schemaInfo.schemasList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSelectAllSchemas, schemasList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchemaInfo {\n");
        sb.append("    isSelectAllSchemas: ").append(toIndentedString(isSelectAllSchemas)).append("\n");
        sb.append("    schemasList: ").append(toIndentedString(schemasList)).append("\n");
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
