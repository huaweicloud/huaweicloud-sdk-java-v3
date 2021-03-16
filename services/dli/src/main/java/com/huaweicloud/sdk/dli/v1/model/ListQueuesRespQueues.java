package com.huaweicloud.sdk.dli.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 查询所有队列的响应参数。
 */
public class ListQueuesRespQueues  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queue_name")
    
    private String queueName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner")
    
    private String owner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queue_type")
    
    private String queueType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cu_count")
    
    private Integer cuCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charging_mode")
    
    private Integer chargingMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr_in_vpc")
    
    private String cidrInVpc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr_in_mgntsubnet")
    
    private String cidrInMgntsubnet;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr_in_subnet")
    
    private String cidrInSubnet;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_mode")
    
    private String resourceMode;

    public ListQueuesRespQueues withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    


    /**
     * 队列名称。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    

    public ListQueuesRespQueues withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 队列描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ListQueuesRespQueues withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    


    /**
     * 创建队列的用户。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    

    public ListQueuesRespQueues withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建队列的时间。是单位为“毫秒”的时间戳。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public ListQueuesRespQueues withQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }

    


    /**
     * 队列的类型,。有如下两种类型： sql spark
     * @return queueType
     */
    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    

    public ListQueuesRespQueues withCuCount(Integer cuCount) {
        this.cuCount = cuCount;
        return this;
    }

    


    /**
     * 与该队列绑定的计算单元数。设置值当前只支持4，16，64。
     * @return cuCount
     */
    public Integer getCuCount() {
        return cuCount;
    }

    public void setCuCount(Integer cuCount) {
        this.cuCount = cuCount;
    }

    

    public ListQueuesRespQueues withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * 队列的收费模式。 “1”表示按照CU时收费。 “2”表示按照包年包月收费。
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    

    public ListQueuesRespQueues withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 队列的资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    public ListQueuesRespQueues withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。0”表示default，即默认的企业项目。 说明： 开通了企业管理服务的用户可设置该参数绑定指定的项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ListQueuesRespQueues withCidrInVpc(String cidrInVpc) {
        this.cidrInVpc = cidrInVpc;
        return this;
    }

    


    /**
     * 队列的虚拟私有云（VPC）的网段。建议使用网段：10.0.0.0/8~28，172.16.0.0/12~28，192.168.0.0/16~28。
     * @return cidrInVpc
     */
    public String getCidrInVpc() {
        return cidrInVpc;
    }

    public void setCidrInVpc(String cidrInVpc) {
        this.cidrInVpc = cidrInVpc;
    }

    

    public ListQueuesRespQueues withCidrInMgntsubnet(String cidrInMgntsubnet) {
        this.cidrInMgntsubnet = cidrInMgntsubnet;
        return this;
    }

    


    /**
     * 管理子网的网段。
     * @return cidrInMgntsubnet
     */
    public String getCidrInMgntsubnet() {
        return cidrInMgntsubnet;
    }

    public void setCidrInMgntsubnet(String cidrInMgntsubnet) {
        this.cidrInMgntsubnet = cidrInMgntsubnet;
    }

    

    public ListQueuesRespQueues withCidrInSubnet(String cidrInSubnet) {
        this.cidrInSubnet = cidrInSubnet;
        return this;
    }

    


    /**
     * 子网网段。
     * @return cidrInSubnet
     */
    public String getCidrInSubnet() {
        return cidrInSubnet;
    }

    public void setCidrInSubnet(String cidrInSubnet) {
        this.cidrInSubnet = cidrInSubnet;
    }

    

    public ListQueuesRespQueues withResourceMode(String resourceMode) {
        this.resourceMode = resourceMode;
        return this;
    }

    


    /**
     * 队列类型。 0：共享队列 1：专属队列
     * @return resourceMode
     */
    public String getResourceMode() {
        return resourceMode;
    }

    public void setResourceMode(String resourceMode) {
        this.resourceMode = resourceMode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQueuesRespQueues listQueuesRespQueues = (ListQueuesRespQueues) o;
        return Objects.equals(this.queueName, listQueuesRespQueues.queueName) &&
            Objects.equals(this.description, listQueuesRespQueues.description) &&
            Objects.equals(this.owner, listQueuesRespQueues.owner) &&
            Objects.equals(this.createTime, listQueuesRespQueues.createTime) &&
            Objects.equals(this.queueType, listQueuesRespQueues.queueType) &&
            Objects.equals(this.cuCount, listQueuesRespQueues.cuCount) &&
            Objects.equals(this.chargingMode, listQueuesRespQueues.chargingMode) &&
            Objects.equals(this.resourceId, listQueuesRespQueues.resourceId) &&
            Objects.equals(this.enterpriseProjectId, listQueuesRespQueues.enterpriseProjectId) &&
            Objects.equals(this.cidrInVpc, listQueuesRespQueues.cidrInVpc) &&
            Objects.equals(this.cidrInMgntsubnet, listQueuesRespQueues.cidrInMgntsubnet) &&
            Objects.equals(this.cidrInSubnet, listQueuesRespQueues.cidrInSubnet) &&
            Objects.equals(this.resourceMode, listQueuesRespQueues.resourceMode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(queueName, description, owner, createTime, queueType, cuCount, chargingMode, resourceId, enterpriseProjectId, cidrInVpc, cidrInMgntsubnet, cidrInSubnet, resourceMode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueuesRespQueues {\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
        sb.append("    cuCount: ").append(toIndentedString(cuCount)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    cidrInVpc: ").append(toIndentedString(cidrInVpc)).append("\n");
        sb.append("    cidrInMgntsubnet: ").append(toIndentedString(cidrInMgntsubnet)).append("\n");
        sb.append("    cidrInSubnet: ").append(toIndentedString(cidrInSubnet)).append("\n");
        sb.append("    resourceMode: ").append(toIndentedString(resourceMode)).append("\n");
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

