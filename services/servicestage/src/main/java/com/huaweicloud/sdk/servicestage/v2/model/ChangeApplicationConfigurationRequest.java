package com.huaweicloud.sdk.servicestage.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.ApplicationConfigModify;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ChangeApplicationConfigurationRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_id")
    
    private String applicationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ApplicationConfigModify body = null;

    public ChangeApplicationConfigurationRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    


    /**
     * Get applicationId
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ChangeApplicationConfigurationRequest withBody(ApplicationConfigModify body) {
        this.body = body;
        return this;
    }

    public ChangeApplicationConfigurationRequest withBody(Consumer<ApplicationConfigModify> bodySetter) {
        if(this.body == null ){
            this.body = new ApplicationConfigModify();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ApplicationConfigModify getBody() {
        return body;
    }

    public void setBody(ApplicationConfigModify body) {
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
        ChangeApplicationConfigurationRequest changeApplicationConfigurationRequest = (ChangeApplicationConfigurationRequest) o;
        return Objects.equals(this.applicationId, changeApplicationConfigurationRequest.applicationId) &&
            Objects.equals(this.body, changeApplicationConfigurationRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(applicationId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeApplicationConfigurationRequest {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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

