package com.huaweicloud.sdk.functiongraph.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateDependencyRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateDependencyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="depend_id")
    
    private String dependId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateDependencyRequestBody body = null;

    public UpdateDependencyRequest withDependId(String dependId) {
        this.dependId = dependId;
        return this;
    }

    


    /**
     * Get dependId
     * @return dependId
     */
    public String getDependId() {
        return dependId;
    }

    public void setDependId(String dependId) {
        this.dependId = dependId;
    }

    public UpdateDependencyRequest withBody(UpdateDependencyRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateDependencyRequest withBody(Consumer<UpdateDependencyRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateDependencyRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateDependencyRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateDependencyRequestBody body) {
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
        UpdateDependencyRequest updateDependencyRequest = (UpdateDependencyRequest) o;
        return Objects.equals(this.dependId, updateDependencyRequest.dependId) &&
            Objects.equals(this.body, updateDependencyRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dependId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDependencyRequest {\n");
        sb.append("    dependId: ").append(toIndentedString(dependId)).append("\n");
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

