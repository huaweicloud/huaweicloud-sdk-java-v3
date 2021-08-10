package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** ApplicationListConfigConfiguration1 */
public class ApplicationListConfigConfiguration1 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_id")

    private String environmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration")

    private ApplicationListConfigConfiguration _configuration;

    public ApplicationListConfigConfiguration1 withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /** 应用ID。
     * 
     * @return applicationId */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ApplicationListConfigConfiguration1 withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /** 环境ID。
     * 
     * @return environmentId */
    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    public ApplicationListConfigConfiguration1 withConfiguration(ApplicationListConfigConfiguration _configuration) {
        this._configuration = _configuration;
        return this;
    }

    public ApplicationListConfigConfiguration1 withConfiguration(
        Consumer<ApplicationListConfigConfiguration> _configurationSetter) {
        if (this._configuration == null) {
            this._configuration = new ApplicationListConfigConfiguration();
            _configurationSetter.accept(this._configuration);
        }

        return this;
    }

    /** Get _configuration
     * 
     * @return _configuration */
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
        ApplicationListConfigConfiguration1 applicationListConfigConfiguration1 =
            (ApplicationListConfigConfiguration1) o;
        return Objects.equals(this.applicationId, applicationListConfigConfiguration1.applicationId)
            && Objects.equals(this.environmentId, applicationListConfigConfiguration1.environmentId)
            && Objects.equals(this._configuration, applicationListConfigConfiguration1._configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, environmentId, _configuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationListConfigConfiguration1 {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
