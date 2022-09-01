package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.GaussDBforOpenGaussDatabaseForListSchema;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDatabaseSchemasResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="database_schemas")
    
    @JacksonXmlProperty(localName = "database_schemas")
    
    private List<GaussDBforOpenGaussDatabaseForListSchema> databaseSchemas = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    @JacksonXmlProperty(localName = "total_count")
    
    private Integer totalCount;

    public ListDatabaseSchemasResponse withDatabaseSchemas(List<GaussDBforOpenGaussDatabaseForListSchema> databaseSchemas) {
        this.databaseSchemas = databaseSchemas;
        return this;
    }

    
    public ListDatabaseSchemasResponse addDatabaseSchemasItem(GaussDBforOpenGaussDatabaseForListSchema databaseSchemasItem) {
        if(this.databaseSchemas == null) {
            this.databaseSchemas = new ArrayList<>();
        }
        this.databaseSchemas.add(databaseSchemasItem);
        return this;
    }

    public ListDatabaseSchemasResponse withDatabaseSchemas(Consumer<List<GaussDBforOpenGaussDatabaseForListSchema>> databaseSchemasSetter) {
        if(this.databaseSchemas == null) {
            this.databaseSchemas = new ArrayList<>();
        }
        databaseSchemasSetter.accept(this.databaseSchemas);
        return this;
    }

    /**
     * 列表中每个元素表示一个数据库schema。
     * @return databaseSchemas
     */
    public List<GaussDBforOpenGaussDatabaseForListSchema> getDatabaseSchemas() {
        return databaseSchemas;
    }

    public void setDatabaseSchemas(List<GaussDBforOpenGaussDatabaseForListSchema> databaseSchemas) {
        this.databaseSchemas = databaseSchemas;
    }

    

    public ListDatabaseSchemasResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 数据库schema总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDatabaseSchemasResponse listDatabaseSchemasResponse = (ListDatabaseSchemasResponse) o;
        return Objects.equals(this.databaseSchemas, listDatabaseSchemasResponse.databaseSchemas) &&
            Objects.equals(this.totalCount, listDatabaseSchemasResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(databaseSchemas, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabaseSchemasResponse {\n");
        sb.append("    databaseSchemas: ").append(toIndentedString(databaseSchemas)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

