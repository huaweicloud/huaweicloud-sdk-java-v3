package com.huaweicloud.sdk.mrs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowSqlResultWithJobResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sql_results")
    
    @JacksonXmlProperty(localName = "sql_results")
    
    private Object sqlResults;

    public ShowSqlResultWithJobResponse withSqlResults(Object sqlResults) {
        this.sqlResults = sqlResults;
        return this;
    }

    


    /**
     * SQL语句查询结果。
     * @return sqlResults
     */
    public Object getSqlResults() {
        return sqlResults;
    }

    public void setSqlResults(Object sqlResults) {
        this.sqlResults = sqlResults;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSqlResultWithJobResponse showSqlResultWithJobResponse = (ShowSqlResultWithJobResponse) o;
        return Objects.equals(this.sqlResults, showSqlResultWithJobResponse.sqlResults);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sqlResults);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlResultWithJobResponse {\n");
        sb.append("    sqlResults: ").append(toIndentedString(sqlResults)).append("\n");
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

