package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdateTaskStatusRequestBody
 */
public class BatchUpdateTaskStatusRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id_list")

    private List<Integer> taskIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private Integer clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_package")

    private Integer withoutPackage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_info")

    private NetworkInfo networkInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public BatchUpdateTaskStatusRequestBody withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 类型（0-旧版本任务；1-新版本任务）
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BatchUpdateTaskStatusRequestBody withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 所属工程id
     * minimum: 1
     * maximum: 2147483647
     * @return projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public BatchUpdateTaskStatusRequestBody withTaskIdList(List<Integer> taskIdList) {
        this.taskIdList = taskIdList;
        return this;
    }

    public BatchUpdateTaskStatusRequestBody addTaskIdListItem(Integer taskIdListItem) {
        if (this.taskIdList == null) {
            this.taskIdList = new ArrayList<>();
        }
        this.taskIdList.add(taskIdListItem);
        return this;
    }

    public BatchUpdateTaskStatusRequestBody withTaskIdList(Consumer<List<Integer>> taskIdListSetter) {
        if (this.taskIdList == null) {
            this.taskIdList = new ArrayList<>();
        }
        taskIdListSetter.accept(this.taskIdList);
        return this;
    }

    /**
     * 任务id列表
     * @return taskIdList
     */
    public List<Integer> getTaskIdList() {
        return taskIdList;
    }

    public void setTaskIdList(List<Integer> taskIdList) {
        this.taskIdList = taskIdList;
    }

    public BatchUpdateTaskStatusRequestBody withClusterId(Integer clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * cluster_id
     * minimum: -1
     * maximum: 2147483647
     * @return clusterId
     */
    public Integer getClusterId() {
        return clusterId;
    }

    public void setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
    }

    public BatchUpdateTaskStatusRequestBody withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * cluster_type
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public BatchUpdateTaskStatusRequestBody withWithoutPackage(Integer withoutPackage) {
        this.withoutPackage = withoutPackage;
        return this;
    }

    /**
     * without_package
     * minimum: 0
     * maximum: 2147483647
     * @return withoutPackage
     */
    public Integer getWithoutPackage() {
        return withoutPackage;
    }

    public void setWithoutPackage(Integer withoutPackage) {
        this.withoutPackage = withoutPackage;
    }

    public BatchUpdateTaskStatusRequestBody withNetworkInfo(NetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
        return this;
    }

    public BatchUpdateTaskStatusRequestBody withNetworkInfo(Consumer<NetworkInfo> networkInfoSetter) {
        if (this.networkInfo == null) {
            this.networkInfo = new NetworkInfo();
            networkInfoSetter.accept(this.networkInfo);
        }

        return this;
    }

    /**
     * Get networkInfo
     * @return networkInfo
     */
    public NetworkInfo getNetworkInfo() {
        return networkInfo;
    }

    public void setNetworkInfo(NetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
    }

    public BatchUpdateTaskStatusRequestBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * status
     * minimum: 0
     * maximum: 2147483647
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BatchUpdateTaskStatusRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateTaskStatusRequestBody that = (BatchUpdateTaskStatusRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.taskIdList, that.taskIdList) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.withoutPackage, that.withoutPackage)
            && Objects.equals(this.networkInfo, that.networkInfo) && Objects.equals(this.status, that.status)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            projectId,
            taskIdList,
            clusterId,
            clusterType,
            withoutPackage,
            networkInfo,
            status,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateTaskStatusRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    taskIdList: ").append(toIndentedString(taskIdList)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    withoutPackage: ").append(toIndentedString(withoutPackage)).append("\n");
        sb.append("    networkInfo: ").append(toIndentedString(networkInfo)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
