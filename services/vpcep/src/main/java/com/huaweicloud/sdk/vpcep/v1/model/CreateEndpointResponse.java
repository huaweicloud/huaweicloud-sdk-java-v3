package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateEndpointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_status")

    private List<String> activeStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_service_name")

    private String endpointServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker_id")

    private Integer markerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_service_id")

    private String endpointServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_dns")

    private Boolean enableDns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagList> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whitelist")

    private List<String> whitelist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_whitelist")

    private Boolean enableWhitelist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetables")

    private List<String> routetables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification_name")

    private String specificationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_statement")

    private List<PolicyStatement> policyStatement = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_document")

    private Object policyDocument;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_status")

    private String enableStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_pool_id")

    private String endpointPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_address")

    private String ipv6Address;

    public CreateEndpointResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 终端节点的ID，唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateEndpointResponse withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 终端节点连接的终端节点服务类型。   - gateway：由运维人员配置。用户无需创建，可直接使用。   - interface：包括运维人员配置的云服务和用户自己创建的私有服务。 其中，运维人员配置的云服务无需创建，用户可直接使用。 您可以通过\"查询公共终端节点服务列表\"查看由运维人员配置的所有用户可见且可连接的终端节点服务，并通过创建终端节点服务创建Interface类型的终端节点服务。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public CreateEndpointResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 终端节点的状态。  - pendingAcceptance：待接受  - creating：创建中  - accepted：已接受  - rejected：已拒绝  - failed：失败  - deleting：删除中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateEndpointResponse withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 终端节点ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public CreateEndpointResponse withActiveStatus(List<String> activeStatus) {
        this.activeStatus = activeStatus;
        return this;
    }

    public CreateEndpointResponse addActiveStatusItem(String activeStatusItem) {
        if (this.activeStatus == null) {
            this.activeStatus = new ArrayList<>();
        }
        this.activeStatus.add(activeStatusItem);
        return this;
    }

    public CreateEndpointResponse withActiveStatus(Consumer<List<String>> activeStatusSetter) {
        if (this.activeStatus == null) {
            this.activeStatus = new ArrayList<>();
        }
        activeStatusSetter.accept(this.activeStatus);
        return this;
    }

    /**
     * 账号状态。  - frozen：冻结  - active：解冻
     * @return activeStatus
     */
    public List<String> getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(List<String> activeStatus) {
        this.activeStatus = activeStatus;
    }

    public CreateEndpointResponse withEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
        return this;
    }

    /**
     * 终端节点服务的名称。
     * @return endpointServiceName
     */
    public String getEndpointServiceName() {
        return endpointServiceName;
    }

    public void setEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
    }

    public CreateEndpointResponse withMarkerId(Integer markerId) {
        this.markerId = markerId;
        return this;
    }

    /**
     * 终端节点的报文标识。
     * @return markerId
     */
    public Integer getMarkerId() {
        return markerId;
    }

    public void setMarkerId(Integer markerId) {
        this.markerId = markerId;
    }

    public CreateEndpointResponse withEndpointServiceId(String endpointServiceId) {
        this.endpointServiceId = endpointServiceId;
        return this;
    }

    /**
     * 终端节点服务的ID。
     * @return endpointServiceId
     */
    public String getEndpointServiceId() {
        return endpointServiceId;
    }

    public void setEndpointServiceId(String endpointServiceId) {
        this.endpointServiceId = endpointServiceId;
    }

    public CreateEndpointResponse withEnableDns(Boolean enableDns) {
        this.enableDns = enableDns;
        return this;
    }

    /**
     * 是否创建域名。  - true：创建域名  - false：不创建域名 说明 当创建gateway类型终端节点服务的终端节点时， “enable_dns”设置为true或者false，均不创建域名。
     * @return enableDns
     */
    public Boolean getEnableDns() {
        return enableDns;
    }

    public void setEnableDns(Boolean enableDns) {
        this.enableDns = enableDns;
    }

    public CreateEndpointResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * vpc_id对应VPC下已创建的网络（network）的ID，UUID格式。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateEndpointResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 终端节点所在的VPC的ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateEndpointResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 终端节点的创建时间。 采用UTC时间格式，格式为：YYYY-MM-DDTHH:MM:SSZ
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CreateEndpointResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 终端节点的更新时间。 采用UTC时间格式，格式为：YYYY-MM-DDTHH:MM:SSZ
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CreateEndpointResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，获取方法请参见获取项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateEndpointResponse withTags(List<TagList> tags) {
        this.tags = tags;
        return this;
    }

    public CreateEndpointResponse addTagsItem(TagList tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateEndpointResponse withTags(Consumer<List<TagList>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，没有标签默认为空数组。
     * @return tags
     */
    public List<TagList> getTags() {
        return tags;
    }

    public void setTags(List<TagList> tags) {
        this.tags = tags;
    }

    public CreateEndpointResponse withWhitelist(List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }

    public CreateEndpointResponse addWhitelistItem(String whitelistItem) {
        if (this.whitelist == null) {
            this.whitelist = new ArrayList<>();
        }
        this.whitelist.add(whitelistItem);
        return this;
    }

    public CreateEndpointResponse withWhitelist(Consumer<List<String>> whitelistSetter) {
        if (this.whitelist == null) {
            this.whitelist = new ArrayList<>();
        }
        whitelistSetter.accept(this.whitelist);
        return this;
    }

    /**
     * 控制访问终端节点的白名单。 若未创建，则返回空列表。 创建连接Interface类型终端节点服务的终端节点时，显示此参数。
     * @return whitelist
     */
    public List<String> getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(List<String> whitelist) {
        this.whitelist = whitelist;
    }

    public CreateEndpointResponse withEnableWhitelist(Boolean enableWhitelist) {
        this.enableWhitelist = enableWhitelist;
        return this;
    }

    /**
     * 是否开启网络ACL隔离。  - true：开启网络ACL隔离  - false：不开启网络ACL隔离 若未指定，则返回false。 创建连接Interface类型终端节点服务的终端节点时，显示此参数。
     * @return enableWhitelist
     */
    public Boolean getEnableWhitelist() {
        return enableWhitelist;
    }

    public void setEnableWhitelist(Boolean enableWhitelist) {
        this.enableWhitelist = enableWhitelist;
    }

    public CreateEndpointResponse withRoutetables(List<String> routetables) {
        this.routetables = routetables;
        return this;
    }

    public CreateEndpointResponse addRoutetablesItem(String routetablesItem) {
        if (this.routetables == null) {
            this.routetables = new ArrayList<>();
        }
        this.routetables.add(routetablesItem);
        return this;
    }

    public CreateEndpointResponse withRoutetables(Consumer<List<String>> routetablesSetter) {
        if (this.routetables == null) {
            this.routetables = new ArrayList<>();
        }
        routetablesSetter.accept(this.routetables);
        return this;
    }

    /**
     * 路由表ID列表。 若未指定，返回默认VPC下路由表ID。 创建gateway类型终端节点服务的终端节点时，显示此参数。
     * @return routetables
     */
    public List<String> getRoutetables() {
        return routetables;
    }

    public void setRoutetables(List<String> routetables) {
        this.routetables = routetables;
    }

    public CreateEndpointResponse withSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }

    /**
     * 规格名称
     * @return specificationName
     */
    public String getSpecificationName() {
        return specificationName;
    }

    public void setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
    }

    public CreateEndpointResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateEndpointResponse withPolicyStatement(List<PolicyStatement> policyStatement) {
        this.policyStatement = policyStatement;
        return this;
    }

    public CreateEndpointResponse addPolicyStatementItem(PolicyStatement policyStatementItem) {
        if (this.policyStatement == null) {
            this.policyStatement = new ArrayList<>();
        }
        this.policyStatement.add(policyStatementItem);
        return this;
    }

    public CreateEndpointResponse withPolicyStatement(Consumer<List<PolicyStatement>> policyStatementSetter) {
        if (this.policyStatement == null) {
            this.policyStatement = new ArrayList<>();
        }
        policyStatementSetter.accept(this.policyStatement);
        return this;
    }

    /**
     * Gateway类型终端节点策略信息，仅限OBS、SFS的终端节点服务的enable_policy值为true时支持该参数。
     * @return policyStatement
     */
    public List<PolicyStatement> getPolicyStatement() {
        return policyStatement;
    }

    public void setPolicyStatement(List<PolicyStatement> policyStatement) {
        this.policyStatement = policyStatement;
    }

    public CreateEndpointResponse withPolicyDocument(Object policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * 终端节点策略信息，仅当终端节点服务的enable_policy值为true时支持该参数，默认值为完全访问权限。（OBS、SFS的终端节点服务暂不支持该参数）
     * @return policyDocument
     */
    public Object getPolicyDocument() {
        return policyDocument;
    }

    public void setPolicyDocument(Object policyDocument) {
        this.policyDocument = policyDocument;
    }

    public CreateEndpointResponse withEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }

    /**
     * 终端节点是否可用。  - enable：启用  - disable：不启用
     * @return enableStatus
     */
    public String getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
    }

    public CreateEndpointResponse withEndpointPoolId(String endpointPoolId) {
        this.endpointPoolId = endpointPoolId;
        return this;
    }

    /**
     * 待废弃，实例相关联的集群ID
     * @return endpointPoolId
     */
    public String getEndpointPoolId() {
        return endpointPoolId;
    }

    public void setEndpointPoolId(String endpointPoolId) {
        this.endpointPoolId = endpointPoolId;
    }

    public CreateEndpointResponse withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 终端节点对应Pool的Public Border Group信息
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public CreateEndpointResponse withIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    /**
     * 终端节点的IPv6地址,仅专业型终端节点支持此参数
     * @return ipv6Address
     */
    public String getIpv6Address() {
        return ipv6Address;
    }

    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEndpointResponse that = (CreateEndpointResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.activeStatus, that.activeStatus)
            && Objects.equals(this.endpointServiceName, that.endpointServiceName)
            && Objects.equals(this.markerId, that.markerId)
            && Objects.equals(this.endpointServiceId, that.endpointServiceId)
            && Objects.equals(this.enableDns, that.enableDns) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.whitelist, that.whitelist)
            && Objects.equals(this.enableWhitelist, that.enableWhitelist)
            && Objects.equals(this.routetables, that.routetables)
            && Objects.equals(this.specificationName, that.specificationName)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.policyStatement, that.policyStatement)
            && Objects.equals(this.policyDocument, that.policyDocument)
            && Objects.equals(this.enableStatus, that.enableStatus)
            && Objects.equals(this.endpointPoolId, that.endpointPoolId)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.ipv6Address, that.ipv6Address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            serviceType,
            status,
            ip,
            activeStatus,
            endpointServiceName,
            markerId,
            endpointServiceId,
            enableDns,
            subnetId,
            vpcId,
            createdAt,
            updatedAt,
            projectId,
            tags,
            whitelist,
            enableWhitelist,
            routetables,
            specificationName,
            description,
            policyStatement,
            policyDocument,
            enableStatus,
            endpointPoolId,
            publicBorderGroup,
            ipv6Address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEndpointResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    activeStatus: ").append(toIndentedString(activeStatus)).append("\n");
        sb.append("    endpointServiceName: ").append(toIndentedString(endpointServiceName)).append("\n");
        sb.append("    markerId: ").append(toIndentedString(markerId)).append("\n");
        sb.append("    endpointServiceId: ").append(toIndentedString(endpointServiceId)).append("\n");
        sb.append("    enableDns: ").append(toIndentedString(enableDns)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
        sb.append("    enableWhitelist: ").append(toIndentedString(enableWhitelist)).append("\n");
        sb.append("    routetables: ").append(toIndentedString(routetables)).append("\n");
        sb.append("    specificationName: ").append(toIndentedString(specificationName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyStatement: ").append(toIndentedString(policyStatement)).append("\n");
        sb.append("    policyDocument: ").append(toIndentedString(policyDocument)).append("\n");
        sb.append("    enableStatus: ").append(toIndentedString(enableStatus)).append("\n");
        sb.append("    endpointPoolId: ").append(toIndentedString(endpointPoolId)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
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
