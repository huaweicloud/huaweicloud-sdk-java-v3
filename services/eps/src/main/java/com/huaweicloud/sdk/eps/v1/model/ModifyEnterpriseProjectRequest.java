package com.huaweicloud.sdk.eps.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eps.v1.model.EnterpriseProject;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ModifyEnterpriseProjectRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private EnterpriseProject body = null;

    public ModifyEnterpriseProjectRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * Get enterpriseProjectId
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ModifyEnterpriseProjectRequest withBody(EnterpriseProject body) {
        this.body = body;
        return this;
    }

    public ModifyEnterpriseProjectRequest withBody(Consumer<EnterpriseProject> bodySetter) {
        if(this.body == null ){
            this.body = new EnterpriseProject();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public EnterpriseProject getBody() {
        return body;
    }

    public void setBody(EnterpriseProject body) {
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
        ModifyEnterpriseProjectRequest modifyEnterpriseProjectRequest = (ModifyEnterpriseProjectRequest) o;
        return Objects.equals(this.enterpriseProjectId, modifyEnterpriseProjectRequest.enterpriseProjectId) &&
            Objects.equals(this.body, modifyEnterpriseProjectRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyEnterpriseProjectRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

