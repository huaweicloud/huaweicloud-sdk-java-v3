package com.huaweicloud.sdk.roma.v2.model;




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
public class ShowDetailsOfEnvironmentVariableV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="variable_value")
    
    private String variableValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_id")
    
    private String envId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="variable_name")
    
    private String variableName;

    public ShowDetailsOfEnvironmentVariableV2Response withVariableValue(String variableValue) {
        this.variableValue = variableValue;
        return this;
    }

    


    /**
     * 变量值
     * @return variableValue
     */
    public String getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue;
    }

    

    public ShowDetailsOfEnvironmentVariableV2Response withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    


    /**
     * 环境编号
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    

    public ShowDetailsOfEnvironmentVariableV2Response withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * API分组编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public ShowDetailsOfEnvironmentVariableV2Response withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 环境变量编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ShowDetailsOfEnvironmentVariableV2Response withVariableName(String variableName) {
        this.variableName = variableName;
        return this;
    }

    


    /**
     * 变量名
     * @return variableName
     */
    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDetailsOfEnvironmentVariableV2Response showDetailsOfEnvironmentVariableV2Response = (ShowDetailsOfEnvironmentVariableV2Response) o;
        return Objects.equals(this.variableValue, showDetailsOfEnvironmentVariableV2Response.variableValue) &&
            Objects.equals(this.envId, showDetailsOfEnvironmentVariableV2Response.envId) &&
            Objects.equals(this.groupId, showDetailsOfEnvironmentVariableV2Response.groupId) &&
            Objects.equals(this.id, showDetailsOfEnvironmentVariableV2Response.id) &&
            Objects.equals(this.variableName, showDetailsOfEnvironmentVariableV2Response.variableName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(variableValue, envId, groupId, id, variableName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailsOfEnvironmentVariableV2Response {\n");
        sb.append("    variableValue: ").append(toIndentedString(variableValue)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
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

