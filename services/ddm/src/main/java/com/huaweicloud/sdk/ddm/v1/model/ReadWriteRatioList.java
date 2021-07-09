package com.huaweicloud.sdk.ddm.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ReadWriteRatioList
 */
public class ReadWriteRatioList  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schema")
    
    private String schema;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="table")
    
    private String table;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="readCount")
    
    private String readCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="writeCount")
    
    private String writeCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="relationTables")
    
    private String relationTables;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lastUpdated")
    
    private String lastUpdated;

    public ReadWriteRatioList withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    


    /**
     * 逻辑库名称。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    

    public ReadWriteRatioList withTable(String table) {
        this.table = table;
        return this;
    }

    


    /**
     * 逻辑表名称。
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    

    public ReadWriteRatioList withReadCount(String readCount) {
        this.readCount = readCount;
        return this;
    }

    


    /**
     * 读次数。
     * @return readCount
     */
    public String getReadCount() {
        return readCount;
    }

    public void setReadCount(String readCount) {
        this.readCount = readCount;
    }

    

    public ReadWriteRatioList withWriteCount(String writeCount) {
        this.writeCount = writeCount;
        return this;
    }

    


    /**
     * 写次数。
     * @return writeCount
     */
    public String getWriteCount() {
        return writeCount;
    }

    public void setWriteCount(String writeCount) {
        this.writeCount = writeCount;
    }

    

    public ReadWriteRatioList withRelationTables(String relationTables) {
        this.relationTables = relationTables;
        return this;
    }

    


    /**
     * 关联表。
     * @return relationTables
     */
    public String getRelationTables() {
        return relationTables;
    }

    public void setRelationTables(String relationTables) {
        this.relationTables = relationTables;
    }

    

    public ReadWriteRatioList withLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    


    /**
     * 最后执行时间。
     * @return lastUpdated
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReadWriteRatioList readWriteRatioList = (ReadWriteRatioList) o;
        return Objects.equals(this.schema, readWriteRatioList.schema) &&
            Objects.equals(this.table, readWriteRatioList.table) &&
            Objects.equals(this.readCount, readWriteRatioList.readCount) &&
            Objects.equals(this.writeCount, readWriteRatioList.writeCount) &&
            Objects.equals(this.relationTables, readWriteRatioList.relationTables) &&
            Objects.equals(this.lastUpdated, readWriteRatioList.lastUpdated);
    }
    @Override
    public int hashCode() {
        return Objects.hash(schema, table, readCount, writeCount, relationTables, lastUpdated);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadWriteRatioList {\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    readCount: ").append(toIndentedString(readCount)).append("\n");
        sb.append("    writeCount: ").append(toIndentedString(writeCount)).append("\n");
        sb.append("    relationTables: ").append(toIndentedString(relationTables)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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

