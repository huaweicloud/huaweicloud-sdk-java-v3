package com.huaweicloud.sdk.ugo.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ugo.v1.model.SqlConvertReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class MigrateSqlStatementRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private SqlConvertReq body;

    public MigrateSqlStatementRequest withBody(SqlConvertReq body) {
        this.body = body;
        return this;
    }

    public MigrateSqlStatementRequest withBody(Consumer<SqlConvertReq> bodySetter) {
        if(this.body == null ){
            this.body = new SqlConvertReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public SqlConvertReq getBody() {
        return body;
    }

    public void setBody(SqlConvertReq body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrateSqlStatementRequest migrateSqlStatementRequest = (MigrateSqlStatementRequest) o;
        return Objects.equals(this.body, migrateSqlStatementRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateSqlStatementRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

