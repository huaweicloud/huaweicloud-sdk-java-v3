package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ConfigurationParameter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceParamGroupResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore_version")
    

    private String datastoreVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore_name")
    

    private String datastoreName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration_parameters")
    
    private List<ConfigurationParameter> configurationParameters = null;
    
    public ShowInstanceParamGroupResponse withDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
        return this;
    }

    


    /**
     * 引擎版本。
     * @return datastoreVersion
     */
    public String getDatastoreVersion() {
        return datastoreVersion;
    }

    public void setDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
    }

    

    public ShowInstanceParamGroupResponse withDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    


    /**
     * 引擎名称。
     * @return datastoreName
     */
    public String getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    

    public ShowInstanceParamGroupResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 创建时间，格式为\"yyyy-MM-dd HH:mm:ss\"。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    

    public ShowInstanceParamGroupResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 更新时间，格式为\"yyyy-MM-ddHH:mm:ss\"。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    

    public ShowInstanceParamGroupResponse withConfigurationParameters(List<ConfigurationParameter> configurationParameters) {
        this.configurationParameters = configurationParameters;
        return this;
    }

    
    public ShowInstanceParamGroupResponse addConfigurationParametersItem(ConfigurationParameter configurationParametersItem) {
        if(this.configurationParameters == null) {
            this.configurationParameters = new ArrayList<>();
        }
        this.configurationParameters.add(configurationParametersItem);
        return this;
    }

    public ShowInstanceParamGroupResponse withConfigurationParameters(Consumer<List<ConfigurationParameter>> configurationParametersSetter) {
        if(this.configurationParameters == null) {
            this.configurationParameters = new ArrayList<>();
        }
        configurationParametersSetter.accept(this.configurationParameters);
        return this;
    }

    /**
     * 参数对象，用户基于默认参数模板自定义的参数配置。
     * @return configurationParameters
     */
    public List<ConfigurationParameter> getConfigurationParameters() {
        return configurationParameters;
    }

    public void setConfigurationParameters(List<ConfigurationParameter> configurationParameters) {
        this.configurationParameters = configurationParameters;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceParamGroupResponse showInstanceParamGroupResponse = (ShowInstanceParamGroupResponse) o;
        return Objects.equals(this.datastoreVersion, showInstanceParamGroupResponse.datastoreVersion) &&
            Objects.equals(this.datastoreName, showInstanceParamGroupResponse.datastoreName) &&
            Objects.equals(this.created, showInstanceParamGroupResponse.created) &&
            Objects.equals(this.updated, showInstanceParamGroupResponse.updated) &&
            Objects.equals(this.configurationParameters, showInstanceParamGroupResponse.configurationParameters);
    }
    @Override
    public int hashCode() {
        return Objects.hash(datastoreVersion, datastoreName, created, updated, configurationParameters);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceParamGroupResponse {\n");
        sb.append("    datastoreVersion: ").append(toIndentedString(datastoreVersion)).append("\n");
        sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    configurationParameters: ").append(toIndentedString(configurationParameters)).append("\n");
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

