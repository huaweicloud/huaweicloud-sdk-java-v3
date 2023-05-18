package com.huaweicloud.sdk.gaussdb.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateDatabaseUserCommentRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateGaussMySqlDatabaseUserCommentRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private UpdateDatabaseUserCommentRequest body;

    public UpdateGaussMySqlDatabaseUserCommentRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * 语言。
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

    

    public UpdateGaussMySqlDatabaseUserCommentRequest withInstanceId(String instanceId) {
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

    

    public UpdateGaussMySqlDatabaseUserCommentRequest withBody(UpdateDatabaseUserCommentRequest body) {
        this.body = body;
        return this;
    }

    public UpdateGaussMySqlDatabaseUserCommentRequest withBody(Consumer<UpdateDatabaseUserCommentRequest> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateDatabaseUserCommentRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateDatabaseUserCommentRequest getBody() {
        return body;
    }

    public void setBody(UpdateDatabaseUserCommentRequest body) {
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
        UpdateGaussMySqlDatabaseUserCommentRequest updateGaussMySqlDatabaseUserCommentRequest = (UpdateGaussMySqlDatabaseUserCommentRequest) o;
        return Objects.equals(this.xLanguage, updateGaussMySqlDatabaseUserCommentRequest.xLanguage) &&
            Objects.equals(this.instanceId, updateGaussMySqlDatabaseUserCommentRequest.instanceId) &&
            Objects.equals(this.body, updateGaussMySqlDatabaseUserCommentRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGaussMySqlDatabaseUserCommentRequest {\n");
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

