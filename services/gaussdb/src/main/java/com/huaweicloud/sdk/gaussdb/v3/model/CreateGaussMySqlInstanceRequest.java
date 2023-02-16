package com.huaweicloud.sdk.gaussdb.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlInstanceRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateGaussMySqlInstanceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private MysqlInstanceRequest body;

    public CreateGaussMySqlInstanceRequest withXLanguage(String xLanguage) {
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

    

    public CreateGaussMySqlInstanceRequest withBody(MysqlInstanceRequest body) {
        this.body = body;
        return this;
    }

    public CreateGaussMySqlInstanceRequest withBody(Consumer<MysqlInstanceRequest> bodySetter) {
        if(this.body == null ){
            this.body = new MysqlInstanceRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public MysqlInstanceRequest getBody() {
        return body;
    }

    public void setBody(MysqlInstanceRequest body) {
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
        CreateGaussMySqlInstanceRequest createGaussMySqlInstanceRequest = (CreateGaussMySqlInstanceRequest) o;
        return Objects.equals(this.xLanguage, createGaussMySqlInstanceRequest.xLanguage) &&
            Objects.equals(this.body, createGaussMySqlInstanceRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGaussMySqlInstanceRequest {\n");
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

