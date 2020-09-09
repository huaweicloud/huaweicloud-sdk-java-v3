package com.huaweicloud.sdk.eps.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eps.v1.model.ResqEpResouce;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowResourceBindEPRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ResqEpResouce body = null;

    public ShowResourceBindEPRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ShowResourceBindEPRequest withBody(ResqEpResouce body) {
        this.body = body;
        return this;
    }

    public ShowResourceBindEPRequest withBody(Consumer<ResqEpResouce> bodySetter) {
        if(this.body == null ){
            this.body = new ResqEpResouce();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ResqEpResouce getBody() {
        return body;
    }

    public void setBody(ResqEpResouce body) {
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
        ShowResourceBindEPRequest showResourceBindEPRequest = (ShowResourceBindEPRequest) o;
        return Objects.equals(this.enterpriseProjectId, showResourceBindEPRequest.enterpriseProjectId) &&
            Objects.equals(this.body, showResourceBindEPRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceBindEPRequest {\n");
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

