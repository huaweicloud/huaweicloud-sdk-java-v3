package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.smn.v2.model.UpdateApplicationRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateApplicationRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_urn")
    
    private String applicationUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateApplicationRequestBody body;

    public UpdateApplicationRequest withApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
        return this;
    }

    


    /**
     * Application的唯一资源标识，可通过[查询Application](https://support.huaweicloud.com/api-smn/smn_api_57004.html)获取该标识。
     * @return applicationUrn
     */
    public String getApplicationUrn() {
        return applicationUrn;
    }

    public void setApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
    }

    

    public UpdateApplicationRequest withBody(UpdateApplicationRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateApplicationRequest withBody(Consumer<UpdateApplicationRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateApplicationRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateApplicationRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateApplicationRequestBody body) {
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
        UpdateApplicationRequest updateApplicationRequest = (UpdateApplicationRequest) o;
        return Objects.equals(this.applicationUrn, updateApplicationRequest.applicationUrn) &&
            Objects.equals(this.body, updateApplicationRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(applicationUrn, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateApplicationRequest {\n");
        sb.append("    applicationUrn: ").append(toIndentedString(applicationUrn)).append("\n");
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

