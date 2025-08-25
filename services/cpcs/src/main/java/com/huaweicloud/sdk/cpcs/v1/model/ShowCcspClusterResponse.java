package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCcspClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_details")

    private List<Object> taskDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccsp_id")

    private String ccspId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distributed_type")

    private String distributedType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_num")

    private Integer instanceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress_info")

    private String progressInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vsm_num")

    private Integer vsmNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_ccsp")

    private Boolean sharedCcsp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az")

    private String az;

    public ShowCcspClusterResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowCcspClusterResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowCcspClusterResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowCcspClusterResponse withTaskDetails(List<Object> taskDetails) {
        this.taskDetails = taskDetails;
        return this;
    }

    public ShowCcspClusterResponse addTaskDetailsItem(Object taskDetailsItem) {
        if (this.taskDetails == null) {
            this.taskDetails = new ArrayList<>();
        }
        this.taskDetails.add(taskDetailsItem);
        return this;
    }

    public ShowCcspClusterResponse withTaskDetails(Consumer<List<Object>> taskDetailsSetter) {
        if (this.taskDetails == null) {
            this.taskDetails = new ArrayList<>();
        }
        taskDetailsSetter.accept(this.taskDetails);
        return this;
    }

    /**
     * 任务详情
     * @return taskDetails
     */
    public List<Object> getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(List<Object> taskDetails) {
        this.taskDetails = taskDetails;
    }

    public ShowCcspClusterResponse withCcspId(String ccspId) {
        this.ccspId = ccspId;
        return this;
    }

    /**
     * ccsp集群id
     * @return ccspId
     */
    public String getCcspId() {
        return ccspId;
    }

    public void setCcspId(String ccspId) {
        this.ccspId = ccspId;
    }

    public ShowCcspClusterResponse withDistributedType(String distributedType) {
        this.distributedType = distributedType;
        return this;
    }

    /**
     * 分布类型
     * @return distributedType
     */
    public String getDistributedType() {
        return distributedType;
    }

    public void setDistributedType(String distributedType) {
        this.distributedType = distributedType;
    }

    public ShowCcspClusterResponse withClusterId(String clusterId) {
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

    public ShowCcspClusterResponse withClusterName(String clusterName) {
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

    public ShowCcspClusterResponse withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 集群所属的服务
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ShowCcspClusterResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 集群的类型： - **SHARED** : 应用共享； - **EXCLUSIVE** : 应用独享
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowCcspClusterResponse withInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    /**
     * 集群中包含的服务实例数量
     * @return instanceNum
     */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
    }

    public ShowCcspClusterResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 集群状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowCcspClusterResponse withProgressInfo(String progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    /**
     * 进度信息
     * @return progressInfo
     */
    public String getProgressInfo() {
        return progressInfo;
    }

    public void setProgressInfo(String progressInfo) {
        this.progressInfo = progressInfo;
    }

    public ShowCcspClusterResponse withVsmNum(Integer vsmNum) {
        this.vsmNum = vsmNum;
        return this;
    }

    /**
     * 集群使用VSM集群的vsm实例数量
     * @return vsmNum
     */
    public Integer getVsmNum() {
        return vsmNum;
    }

    public void setVsmNum(Integer vsmNum) {
        this.vsmNum = vsmNum;
    }

    public ShowCcspClusterResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 集群的创建时间，UNIX时间戳，单位毫秒
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowCcspClusterResponse withSharedCcsp(Boolean sharedCcsp) {
        this.sharedCcsp = sharedCcsp;
        return this;
    }

    /**
     * 是否共享ccsp
     * @return sharedCcsp
     */
    public Boolean getSharedCcsp() {
        return sharedCcsp;
    }

    public void setSharedCcsp(Boolean sharedCcsp) {
        this.sharedCcsp = sharedCcsp;
    }

    public ShowCcspClusterResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowCcspClusterResponse withAz(String az) {
        this.az = az;
        return this;
    }

    /**
     * az
     * @return az
     */
    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCcspClusterResponse that = (ShowCcspClusterResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.taskDetails, that.taskDetails)
            && Objects.equals(this.ccspId, that.ccspId) && Objects.equals(this.distributedType, that.distributedType)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.type, that.type)
            && Objects.equals(this.instanceNum, that.instanceNum) && Objects.equals(this.status, that.status)
            && Objects.equals(this.progressInfo, that.progressInfo) && Objects.equals(this.vsmNum, that.vsmNum)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.sharedCcsp, that.sharedCcsp)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId) && Objects.equals(this.az, that.az);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            projectId,
            domainId,
            taskDetails,
            ccspId,
            distributedType,
            clusterId,
            clusterName,
            serviceType,
            type,
            instanceNum,
            status,
            progressInfo,
            vsmNum,
            createTime,
            sharedCcsp,
            enterpriseProjectId,
            az);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCcspClusterResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    taskDetails: ").append(toIndentedString(taskDetails)).append("\n");
        sb.append("    ccspId: ").append(toIndentedString(ccspId)).append("\n");
        sb.append("    distributedType: ").append(toIndentedString(distributedType)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    progressInfo: ").append(toIndentedString(progressInfo)).append("\n");
        sb.append("    vsmNum: ").append(toIndentedString(vsmNum)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    sharedCcsp: ").append(toIndentedString(sharedCcsp)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
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
