package com.huaweicloud.sdk.eps.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eps.v1.model.MigrateResource;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class MigrateResourceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private MigrateResource body = null;

    public MigrateResourceRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public MigrateResourceRequest withBody(MigrateResource body) {
        this.body = body;
        return this;
    }

    public MigrateResourceRequest withBody(Consumer<MigrateResource> bodySetter) {
        if(this.body == null ){
            this.body = new MigrateResource();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public MigrateResource getBody() {
        return body;
    }

    public void setBody(MigrateResource body) {
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
        MigrateResourceRequest migrateResourceRequest = (MigrateResourceRequest) o;
        return Objects.equals(this.enterpriseProjectId, migrateResourceRequest.enterpriseProjectId) &&
            Objects.equals(this.body, migrateResourceRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateResourceRequest {\n");
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

