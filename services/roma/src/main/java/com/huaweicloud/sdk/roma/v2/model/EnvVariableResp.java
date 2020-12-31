package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * EnvVariableResp
 */
public class EnvVariableResp  {



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

    public EnvVariableResp withVariableValue(String variableValue) {
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

    public EnvVariableResp withEnvId(String envId) {
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

    public EnvVariableResp withGroupId(String groupId) {
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

    public EnvVariableResp withId(String id) {
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

    public EnvVariableResp withVariableName(String variableName) {
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
        EnvVariableResp envVariableResp = (EnvVariableResp) o;
        return Objects.equals(this.variableValue, envVariableResp.variableValue) &&
            Objects.equals(this.envId, envVariableResp.envId) &&
            Objects.equals(this.groupId, envVariableResp.groupId) &&
            Objects.equals(this.id, envVariableResp.id) &&
            Objects.equals(this.variableName, envVariableResp.variableName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(variableValue, envId, groupId, id, variableName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvVariableResp {\n");
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

