package com.huaweicloud.sdk.servicestage.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.EnvironmentResourceModify;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ChangeResourceInEnvironmentRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="environment_id")
    
    private String environmentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private EnvironmentResourceModify body = null;

    public ChangeResourceInEnvironmentRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    


    /**
     * Get environmentId
     * @return environmentId
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    public ChangeResourceInEnvironmentRequest withBody(EnvironmentResourceModify body) {
        this.body = body;
        return this;
    }

    public ChangeResourceInEnvironmentRequest withBody(Consumer<EnvironmentResourceModify> bodySetter) {
        if(this.body == null ){
            this.body = new EnvironmentResourceModify();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public EnvironmentResourceModify getBody() {
        return body;
    }

    public void setBody(EnvironmentResourceModify body) {
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
        ChangeResourceInEnvironmentRequest changeResourceInEnvironmentRequest = (ChangeResourceInEnvironmentRequest) o;
        return Objects.equals(this.environmentId, changeResourceInEnvironmentRequest.environmentId) &&
            Objects.equals(this.body, changeResourceInEnvironmentRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(environmentId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeResourceInEnvironmentRequest {\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
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

