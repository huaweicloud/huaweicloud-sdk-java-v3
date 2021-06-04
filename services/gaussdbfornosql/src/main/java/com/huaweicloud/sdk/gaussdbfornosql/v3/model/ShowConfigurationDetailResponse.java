package com.huaweicloud.sdk.gaussdbfornosql.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ConfigurationParameterResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowConfigurationDetailResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore_version_name")
    
    private String datastoreVersionName;


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
    
    private List<ConfigurationParameterResult> configurationParameters = null;
    
    public ShowConfigurationDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 参数模板ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ShowConfigurationDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 参数模板名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ShowConfigurationDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 参数模板描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ShowConfigurationDetailResponse withDatastoreVersionName(String datastoreVersionName) {
        this.datastoreVersionName = datastoreVersionName;
        return this;
    }

    


    /**
     * 数据库版本名称。
     * @return datastoreVersionName
     */
    public String getDatastoreVersionName() {
        return datastoreVersionName;
    }

    public void setDatastoreVersionName(String datastoreVersionName) {
        this.datastoreVersionName = datastoreVersionName;
    }

    

    public ShowConfigurationDetailResponse withDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    


    /**
     * 数据库名称。
     * @return datastoreName
     */
    public String getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    

    public ShowConfigurationDetailResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 创建时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    

    public ShowConfigurationDetailResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 更新时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    

    public ShowConfigurationDetailResponse withConfigurationParameters(List<ConfigurationParameterResult> configurationParameters) {
        this.configurationParameters = configurationParameters;
        return this;
    }

    
    public ShowConfigurationDetailResponse addConfigurationParametersItem(ConfigurationParameterResult configurationParametersItem) {
        if(this.configurationParameters == null) {
            this.configurationParameters = new ArrayList<>();
        }
        this.configurationParameters.add(configurationParametersItem);
        return this;
    }

    public ShowConfigurationDetailResponse withConfigurationParameters(Consumer<List<ConfigurationParameterResult>> configurationParametersSetter) {
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
    public List<ConfigurationParameterResult> getConfigurationParameters() {
        return configurationParameters;
    }

    public void setConfigurationParameters(List<ConfigurationParameterResult> configurationParameters) {
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
        ShowConfigurationDetailResponse showConfigurationDetailResponse = (ShowConfigurationDetailResponse) o;
        return Objects.equals(this.id, showConfigurationDetailResponse.id) &&
            Objects.equals(this.name, showConfigurationDetailResponse.name) &&
            Objects.equals(this.description, showConfigurationDetailResponse.description) &&
            Objects.equals(this.datastoreVersionName, showConfigurationDetailResponse.datastoreVersionName) &&
            Objects.equals(this.datastoreName, showConfigurationDetailResponse.datastoreName) &&
            Objects.equals(this.created, showConfigurationDetailResponse.created) &&
            Objects.equals(this.updated, showConfigurationDetailResponse.updated) &&
            Objects.equals(this.configurationParameters, showConfigurationDetailResponse.configurationParameters);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, datastoreVersionName, datastoreName, created, updated, configurationParameters);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConfigurationDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    datastoreVersionName: ").append(toIndentedString(datastoreVersionName)).append("\n");
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

