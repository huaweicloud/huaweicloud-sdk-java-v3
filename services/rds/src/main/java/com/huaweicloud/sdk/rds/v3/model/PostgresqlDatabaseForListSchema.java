package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 数据库schema信息。
 */
public class PostgresqlDatabaseForListSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    @JacksonXmlProperty(localName = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    @JacksonXmlProperty(localName = "owner")

    private String owner;

    public PostgresqlDatabaseForListSchema withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名称。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public PostgresqlDatabaseForListSchema withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * schema所属用户。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostgresqlDatabaseForListSchema postgresqlDatabaseForListSchema = (PostgresqlDatabaseForListSchema) o;
        return Objects.equals(this.schemaName, postgresqlDatabaseForListSchema.schemaName)
            && Objects.equals(this.owner, postgresqlDatabaseForListSchema.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaName, owner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgresqlDatabaseForListSchema {\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
