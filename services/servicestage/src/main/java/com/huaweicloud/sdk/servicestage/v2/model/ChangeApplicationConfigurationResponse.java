package com.huaweicloud.sdk.servicestage.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.ApplicationListConfigConfiguration;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ChangeApplicationConfigurationResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_id")
    
    private String applicationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="environment_id")
    
    private String environmentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration")
    
    private ApplicationListConfigConfiguration _configuration = null;

    public ChangeApplicationConfigurationResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    


    /**
     * 应用ID。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ChangeApplicationConfigurationResponse withEnvironmentId(String environmentId) {
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

    public ChangeApplicationConfigurationResponse withConfiguration(ApplicationListConfigConfiguration _configuration) {
        this._configuration = _configuration;
        return this;
    }

    public ChangeApplicationConfigurationResponse withConfiguration(Consumer<ApplicationListConfigConfiguration> _configurationSetter) {
        if(this._configuration == null ){
            this._configuration = new ApplicationListConfigConfiguration();
            _configurationSetter.accept(this._configuration);
        }
        
        return this;
    }


    /**
     * Get _configuration
     * @return _configuration
     */
    public ApplicationListConfigConfiguration getConfiguration() {
        return _configuration;
    }

    public void setConfiguration(ApplicationListConfigConfiguration _configuration) {
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
        ChangeApplicationConfigurationResponse changeApplicationConfigurationResponse = (ChangeApplicationConfigurationResponse) o;
        return Objects.equals(this.applicationId, changeApplicationConfigurationResponse.applicationId) &&
            Objects.equals(this.environmentId, changeApplicationConfigurationResponse.environmentId) &&
            Objects.equals(this._configuration, changeApplicationConfigurationResponse._configuration);
    }
    @Override
    public int hashCode() {
        return Objects.hash(applicationId, environmentId, _configuration);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeApplicationConfigurationResponse {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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

