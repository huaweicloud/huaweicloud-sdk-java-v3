package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateManualBackupRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateManualBackupRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private CreateManualBackupRequestBody body;

    public CreateManualBackupRequest withXLanguage(String xLanguage) {
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

    

    public CreateManualBackupRequest withBody(CreateManualBackupRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateManualBackupRequest withBody(Consumer<CreateManualBackupRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateManualBackupRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateManualBackupRequestBody getBody() {
        return body;
    }

    public void setBody(CreateManualBackupRequestBody body) {
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
        CreateManualBackupRequest createManualBackupRequest = (CreateManualBackupRequest) o;
        return Objects.equals(this.xLanguage, createManualBackupRequest.xLanguage) &&
            Objects.equals(this.body, createManualBackupRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateManualBackupRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
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

