package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.ConfigurationForUpdate;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateConfigurationRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_id")
    
    private String configId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ConfigurationForUpdate body = null;

    public UpdateConfigurationRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
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

    public UpdateConfigurationRequest withConfigId(String configId) {
        this.configId = configId;
        return this;
    }

    


    /**
     * Get configId
     * @return configId
     */
    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public UpdateConfigurationRequest withBody(ConfigurationForUpdate body) {
        this.body = body;
        return this;
    }

    public UpdateConfigurationRequest withBody(Consumer<ConfigurationForUpdate> bodySetter) {
        if(this.body == null ){
            this.body = new ConfigurationForUpdate();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ConfigurationForUpdate getBody() {
        return body;
    }

    public void setBody(ConfigurationForUpdate body) {
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
        UpdateConfigurationRequest updateConfigurationRequest = (UpdateConfigurationRequest) o;
        return Objects.equals(this.xLanguage, updateConfigurationRequest.xLanguage) &&
            Objects.equals(this.configId, updateConfigurationRequest.configId) &&
            Objects.equals(this.body, updateConfigurationRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, configId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConfigurationRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
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

