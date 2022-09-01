package com.huaweicloud.sdk.mrs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SqlExecutionReq
 */
public class SqlExecutionReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sql_type")
    
    @JacksonXmlProperty(localName = "sql_type")
    
    private String sqlType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sql_content")
    
    @JacksonXmlProperty(localName = "sql_content")
    
    private String sqlContent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="database")
    
    @JacksonXmlProperty(localName = "database")
    
    private String database;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="archive_path")
    
    @JacksonXmlProperty(localName = "archive_path")
    
    private String archivePath;

    public SqlExecutionReq withSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    


    /**
     * SQL类型。目前仅支持“presto”类型的SQL。  说明： 只有包含Presto组件的集群才能提交执行presto类型的SQL。
     * @return sqlType
     */
    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    

    public SqlExecutionReq withSqlContent(String sqlContent) {
        this.sqlContent = sqlContent;
        return this;
    }

    


    /**
     * 待执行的SQL语句。  说明： 目前仅支持执行单条语句，语句中不包含“;”。
     * @return sqlContent
     */
    public String getSqlContent() {
        return sqlContent;
    }

    public void setSqlContent(String sqlContent) {
        this.sqlContent = sqlContent;
    }

    

    public SqlExecutionReq withDatabase(String database) {
        this.database = database;
        return this;
    }

    


    /**
     * 执行SQL所在的数据库，默认为default。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    

    public SqlExecutionReq withArchivePath(String archivePath) {
        this.archivePath = archivePath;
        return this;
    }

    


    /**
     * SQL执行结果的转储文件夹。  说明： 只有select语句才会转储查询的结果。当前仅支持转储到OBS中。
     * @return archivePath
     */
    public String getArchivePath() {
        return archivePath;
    }

    public void setArchivePath(String archivePath) {
        this.archivePath = archivePath;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SqlExecutionReq sqlExecutionReq = (SqlExecutionReq) o;
        return Objects.equals(this.sqlType, sqlExecutionReq.sqlType) &&
            Objects.equals(this.sqlContent, sqlExecutionReq.sqlContent) &&
            Objects.equals(this.database, sqlExecutionReq.database) &&
            Objects.equals(this.archivePath, sqlExecutionReq.archivePath);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sqlType, sqlContent, database, archivePath);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlExecutionReq {\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    sqlContent: ").append(toIndentedString(sqlContent)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    archivePath: ").append(toIndentedString(archivePath)).append("\n");
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

