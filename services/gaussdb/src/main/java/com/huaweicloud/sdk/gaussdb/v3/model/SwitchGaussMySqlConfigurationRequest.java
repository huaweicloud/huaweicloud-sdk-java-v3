package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.ApplyConfigurationRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class SwitchGaussMySqlConfigurationRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration_id")
    
    
    private String configurationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private ApplyConfigurationRequestBody body;

    public SwitchGaussMySqlConfigurationRequest withXLanguage(String xLanguage) {
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

    

    public SwitchGaussMySqlConfigurationRequest withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    


    /**
     * 参数模板ID。
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    

    public SwitchGaussMySqlConfigurationRequest withBody(ApplyConfigurationRequestBody body) {
        this.body = body;
        return this;
    }

    public SwitchGaussMySqlConfigurationRequest withBody(Consumer<ApplyConfigurationRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ApplyConfigurationRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ApplyConfigurationRequestBody getBody() {
        return body;
    }

    public void setBody(ApplyConfigurationRequestBody body) {
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
        SwitchGaussMySqlConfigurationRequest switchGaussMySqlConfigurationRequest = (SwitchGaussMySqlConfigurationRequest) o;
        return Objects.equals(this.xLanguage, switchGaussMySqlConfigurationRequest.xLanguage) &&
            Objects.equals(this.configurationId, switchGaussMySqlConfigurationRequest.configurationId) &&
            Objects.equals(this.body, switchGaussMySqlConfigurationRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, configurationId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchGaussMySqlConfigurationRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
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

