package com.huaweicloud.sdk.servicestage.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.ApplicationConfigModifyConfiguration;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ApplicationConfigModify
 */
public class ApplicationConfigModify  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="environment_id")
    
    private String environmentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration")
    
    private ApplicationConfigModifyConfiguration _configuration;

    public ApplicationConfigModify withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    


    /**
     * 环境ID。
     * @return environmentId
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    

    public ApplicationConfigModify withConfiguration(ApplicationConfigModifyConfiguration _configuration) {
        this._configuration = _configuration;
        return this;
    }

    public ApplicationConfigModify withConfiguration(Consumer<ApplicationConfigModifyConfiguration> _configurationSetter) {
        if(this._configuration == null ){
            this._configuration = new ApplicationConfigModifyConfiguration();
            _configurationSetter.accept(this._configuration);
        }
        
        return this;
    }


    /**
     * Get _configuration
     * @return _configuration
     */
    public ApplicationConfigModifyConfiguration getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(ApplicationConfigModifyConfiguration _configuration) {
        this._configuration = _configuration;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationConfigModify applicationConfigModify = (ApplicationConfigModify) o;
        return Objects.equals(this.environmentId, applicationConfigModify.environmentId) &&
            Objects.equals(this._configuration, applicationConfigModify._configuration);
    }
    @Override
    public int hashCode() {
        return Objects.hash(environmentId, _configuration);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationConfigModify {\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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

