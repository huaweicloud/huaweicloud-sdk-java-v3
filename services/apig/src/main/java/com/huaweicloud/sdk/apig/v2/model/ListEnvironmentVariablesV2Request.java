package com.huaweicloud.sdk.apig.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListEnvironmentVariablesV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_id")
    
    private String envId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="variable_name")
    
    private String variableName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Long offset = 0l;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 20;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="precise_search")
    
    private String preciseSearch;

    public ListEnvironmentVariablesV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListEnvironmentVariablesV2Request withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * Get groupId
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListEnvironmentVariablesV2Request withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    


    /**
     * Get envId
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public ListEnvironmentVariablesV2Request withVariableName(String variableName) {
        this.variableName = variableName;
        return this;
    }

    


    /**
     * Get variableName
     * @return variableName
     */
    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public ListEnvironmentVariablesV2Request withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListEnvironmentVariablesV2Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEnvironmentVariablesV2Request withPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
        return this;
    }

    


    /**
     * Get preciseSearch
     * @return preciseSearch
     */
    public String getPreciseSearch() {
        return preciseSearch;
    }

    public void setPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnvironmentVariablesV2Request listEnvironmentVariablesV2Request = (ListEnvironmentVariablesV2Request) o;
        return Objects.equals(this.instanceId, listEnvironmentVariablesV2Request.instanceId) &&
            Objects.equals(this.groupId, listEnvironmentVariablesV2Request.groupId) &&
            Objects.equals(this.envId, listEnvironmentVariablesV2Request.envId) &&
            Objects.equals(this.variableName, listEnvironmentVariablesV2Request.variableName) &&
            Objects.equals(this.offset, listEnvironmentVariablesV2Request.offset) &&
            Objects.equals(this.limit, listEnvironmentVariablesV2Request.limit) &&
            Objects.equals(this.preciseSearch, listEnvironmentVariablesV2Request.preciseSearch);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, groupId, envId, variableName, offset, limit, preciseSearch);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnvironmentVariablesV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    preciseSearch: ").append(toIndentedString(preciseSearch)).append("\n");
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

