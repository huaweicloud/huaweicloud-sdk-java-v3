package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class DeleteGaussMySqlConfigurationResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration_id")
    

    private String configurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration_name")
    

    private String configurationName;

    public DeleteGaussMySqlConfigurationResponse withConfigurationId(String configurationId) {
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

    

    public DeleteGaussMySqlConfigurationResponse withConfigurationName(String configurationName) {
        this.configurationName = configurationName;
        return this;
    }

    


    /**
     * 参数模板名称。
     * @return configurationName
     */
    public String getConfigurationName() {
        return configurationName;
    }

    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteGaussMySqlConfigurationResponse deleteGaussMySqlConfigurationResponse = (DeleteGaussMySqlConfigurationResponse) o;
        return Objects.equals(this.configurationId, deleteGaussMySqlConfigurationResponse.configurationId) &&
            Objects.equals(this.configurationName, deleteGaussMySqlConfigurationResponse.configurationName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(configurationId, configurationName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteGaussMySqlConfigurationResponse {\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
        sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
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

