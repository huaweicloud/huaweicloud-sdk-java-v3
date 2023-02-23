package com.huaweicloud.sdk.gaussdb.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.SetQuotasRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class SetGaussMySqlQuotasRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private SetQuotasRequestBody body;

    public SetGaussMySqlQuotasRequest withXLanguage(String xLanguage) {
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

    

    public SetGaussMySqlQuotasRequest withBody(SetQuotasRequestBody body) {
        this.body = body;
        return this;
    }

    public SetGaussMySqlQuotasRequest withBody(Consumer<SetQuotasRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new SetQuotasRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public SetQuotasRequestBody getBody() {
        return body;
    }

    public void setBody(SetQuotasRequestBody body) {
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
        SetGaussMySqlQuotasRequest setGaussMySqlQuotasRequest = (SetGaussMySqlQuotasRequest) o;
        return Objects.equals(this.xLanguage, setGaussMySqlQuotasRequest.xLanguage) &&
            Objects.equals(this.body, setGaussMySqlQuotasRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetGaussMySqlQuotasRequest {\n");
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

