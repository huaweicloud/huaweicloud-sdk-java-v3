package com.huaweicloud.sdk.mrs.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteSqlResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="statement")
    

    private String statement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result_location")
    

    private String resultLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    private List<List<String>> content = null;
    
    public ExecuteSqlResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * SQL的执行id。执行select、show和desc语句时才会生成id，其他操作id为空
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ExecuteSqlResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    


    /**
     * 错误信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    

    public ExecuteSqlResponse withStatement(String statement) {
        this.statement = statement;
        return this;
    }

    


    /**
     * 执行的SQL语句。
     * @return statement
     */
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    

    public ExecuteSqlResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * SQL的执行状态。 - QUEUED - WAITING_FOR_RESOURCES - PLANNING - STARTING - RUNNING - FINISHING - FINISHED - FAILED
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ExecuteSqlResponse withResultLocation(String resultLocation) {
        this.resultLocation = resultLocation;
        return this;
    }

    


    /**
     * SQL查询语句的最终结果归档路径。 说明： 只有select的语句才会在将SQL的执行结果转储到result_location中。
     * @return resultLocation
     */
    public String getResultLocation() {
        return resultLocation;
    }

    public void setResultLocation(String resultLocation) {
        this.resultLocation = resultLocation;
    }

    

    public ExecuteSqlResponse withContent(List<List<String>> content) {
        this.content = content;
        return this;
    }

    
    public ExecuteSqlResponse addContentItem(List<String> contentItem) {
        if(this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    public ExecuteSqlResponse withContent(Consumer<List<List<String>>> contentSetter) {
        if(this.content == null) {
            this.content = new ArrayList<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /**
     * SQL的执行结果。 说明： 只有非select的语句才会在content中返回结果，如果SQL中没有结果，content为空。
     * @return content
     */
    public List<List<String>> getContent() {
        return content;
    }

    public void setContent(List<List<String>> content) {
        this.content = content;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteSqlResponse executeSqlResponse = (ExecuteSqlResponse) o;
        return Objects.equals(this.id, executeSqlResponse.id) &&
            Objects.equals(this.message, executeSqlResponse.message) &&
            Objects.equals(this.statement, executeSqlResponse.statement) &&
            Objects.equals(this.status, executeSqlResponse.status) &&
            Objects.equals(this.resultLocation, executeSqlResponse.resultLocation) &&
            Objects.equals(this.content, executeSqlResponse.content);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, message, statement, status, resultLocation, content);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteSqlResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    resultLocation: ").append(toIndentedString(resultLocation)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

