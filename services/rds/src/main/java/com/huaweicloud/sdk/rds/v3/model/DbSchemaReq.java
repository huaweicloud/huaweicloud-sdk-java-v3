package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.SchemaReq;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建数据库schema信息。
 */
public class DbSchemaReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_name")
    
    private String dbName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schemas")
    
    private List<SchemaReq> schemas = null;
    
    public DbSchemaReq withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    


    /**
     * 数据库名称。 数据库名称在1到63个字符之间，由字母、数字、或下划线组成，不能包含其他特殊字符，不能以“pg”和数字开头，且不能和RDS for PostgreSQL模板库重名。 RDS for PostgreSQL模板库包括postgres， template0 ，template1。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    

    public DbSchemaReq withSchemas(List<SchemaReq> schemas) {
        this.schemas = schemas;
        return this;
    }

    
    public DbSchemaReq addSchemasItem(SchemaReq schemasItem) {
        this.schemas.add(schemasItem);
        return this;
    }

    public DbSchemaReq withSchemas(Consumer<List<SchemaReq>> schemasSetter) {
        if(this.schemas == null ){
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * Get schemas
     * @return schemas
     */
    public List<SchemaReq> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<SchemaReq> schemas) {
        this.schemas = schemas;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DbSchemaReq dbSchemaReq = (DbSchemaReq) o;
        return Objects.equals(this.dbName, dbSchemaReq.dbName) &&
            Objects.equals(this.schemas, dbSchemaReq.schemas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dbName, schemas);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbSchemaReq {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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

