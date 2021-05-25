package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.PostgresqlDatabaseSchemaReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreatePostgresqlDatabaseSchemaRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private PostgresqlDatabaseSchemaReq body;

    public CreatePostgresqlDatabaseSchemaRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * 语言
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    public CreatePostgresqlDatabaseSchemaRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public CreatePostgresqlDatabaseSchemaRequest withBody(PostgresqlDatabaseSchemaReq body) {
        this.body = body;
        return this;
    }

    public CreatePostgresqlDatabaseSchemaRequest withBody(Consumer<PostgresqlDatabaseSchemaReq> bodySetter) {
        if(this.body == null ){
            this.body = new PostgresqlDatabaseSchemaReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public PostgresqlDatabaseSchemaReq getBody() {
        return body;
    }

    public void setBody(PostgresqlDatabaseSchemaReq body) {
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
        CreatePostgresqlDatabaseSchemaRequest createPostgresqlDatabaseSchemaRequest = (CreatePostgresqlDatabaseSchemaRequest) o;
        return Objects.equals(this.xLanguage, createPostgresqlDatabaseSchemaRequest.xLanguage) &&
            Objects.equals(this.instanceId, createPostgresqlDatabaseSchemaRequest.instanceId) &&
            Objects.equals(this.body, createPostgresqlDatabaseSchemaRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePostgresqlDatabaseSchemaRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

