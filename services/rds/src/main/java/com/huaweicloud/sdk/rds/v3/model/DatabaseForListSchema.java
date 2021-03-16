package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库信息。
 */
public class DatabaseForListSchema  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schema_name")
    
    private String schemaName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner")
    
    private String owner;

    public DatabaseForListSchema withSchemaName(String schemaName) {
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

    

    public DatabaseForListSchema withOwner(String owner) {
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
        DatabaseForListSchema databaseForListSchema = (DatabaseForListSchema) o;
        return Objects.equals(this.schemaName, databaseForListSchema.schemaName) &&
            Objects.equals(this.owner, databaseForListSchema.owner);
    }
    @Override
    public int hashCode() {
        return Objects.hash(schemaName, owner);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseForListSchema {\n");
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

