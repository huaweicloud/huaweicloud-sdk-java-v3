package com.huaweicloud.sdk.iotedge.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QueryClusterBriefResponseDTO
 */
public class QueryClusterBriefResponseDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_name")
    

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_upgradeable")
    

    private Boolean isUpgradeable;

    public QueryClusterBriefResponseDTO withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public QueryClusterBriefResponseDTO withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    


    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    

    public QueryClusterBriefResponseDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 集群描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public QueryClusterBriefResponseDTO withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 边缘集群版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public QueryClusterBriefResponseDTO withState(String state) {
        this.state = state;
        return this;
    }

    


    /**
     * 边缘集群状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    

    public QueryClusterBriefResponseDTO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public QueryClusterBriefResponseDTO withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 最后一次修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    public QueryClusterBriefResponseDTO withIsUpgradeable(Boolean isUpgradeable) {
        this.isUpgradeable = isUpgradeable;
        return this;
    }

    


    /**
     * 是否可升级
     * @return isUpgradeable
     */
    public Boolean getIsUpgradeable() {
        return isUpgradeable;
    }

    public void setIsUpgradeable(Boolean isUpgradeable) {
        this.isUpgradeable = isUpgradeable;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryClusterBriefResponseDTO queryClusterBriefResponseDTO = (QueryClusterBriefResponseDTO) o;
        return Objects.equals(this.clusterId, queryClusterBriefResponseDTO.clusterId) &&
            Objects.equals(this.clusterName, queryClusterBriefResponseDTO.clusterName) &&
            Objects.equals(this.description, queryClusterBriefResponseDTO.description) &&
            Objects.equals(this.version, queryClusterBriefResponseDTO.version) &&
            Objects.equals(this.state, queryClusterBriefResponseDTO.state) &&
            Objects.equals(this.createTime, queryClusterBriefResponseDTO.createTime) &&
            Objects.equals(this.updateTime, queryClusterBriefResponseDTO.updateTime) &&
            Objects.equals(this.isUpgradeable, queryClusterBriefResponseDTO.isUpgradeable);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clusterId, clusterName, description, version, state, createTime, updateTime, isUpgradeable);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryClusterBriefResponseDTO {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    isUpgradeable: ").append(toIndentedString(isUpgradeable)).append("\n");
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

