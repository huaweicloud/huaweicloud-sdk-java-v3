package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListMembersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private List<Integer> weight = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr_id")

    private List<String> subnetCidrId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private List<String> address = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private List<Integer> protocolPort = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_status")

    private List<String> operatingStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private List<String> ipVersion = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_type")

    private List<String> memberType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private List<String> instanceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private List<String> availabilityZone = null;

    public ListMembersRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 参数解释：后端服务器组ID。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public ListMembersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一页最后一条记录的ID。  使用说明： - 必须与limit一起使用。 - 不指定时表示查询第一页。 - 该字段不允许为空或无效的ID。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListMembersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 参数解释：每页返回的个数。  取值范围：0-2000  默认取值：2000
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListMembersRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * 是否反向查询。  取值： - true：查询上一页。 - false：查询下一页，默认。  使用说明： - 必须与limit一起使用。 - 当page_reverse=true时，若要查询上一页，marker取值为当前页返回值的previous_marker。
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListMembersRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListMembersRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListMembersRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 后端服务器名称。注意：该名称并非ECS名称。  支持多值查询，查询条件格式：*name=xxx&name=xxx*。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListMembersRequest withWeight(List<Integer> weight) {
        this.weight = weight;
        return this;
    }

    public ListMembersRequest addWeightItem(Integer weightItem) {
        if (this.weight == null) {
            this.weight = new ArrayList<>();
        }
        this.weight.add(weightItem);
        return this;
    }

    public ListMembersRequest withWeight(Consumer<List<Integer>> weightSetter) {
        if (this.weight == null) {
            this.weight = new ArrayList<>();
        }
        weightSetter.accept(this.weight);
        return this;
    }

    /**
     * 后端服务器的权重，请求将根据pool配置的负载均衡算法和后端服务器的权重进行负载分发。 权重值越大，分发的请求越多。权重为0的后端不再接受新的请求。  取值：0-100。  支持多值查询，查询条件格式：*weight=xxx&weight=xxx*。
     * @return weight
     */
    public List<Integer> getWeight() {
        return weight;
    }

    public void setWeight(List<Integer> weight) {
        this.weight = weight;
    }

    public ListMembersRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 后端服务器的管理状态。  取值：true、false。  虽然创建、更新请求支持该字段，但实际取值决定于后端服务器对应的弹性云服务器是否存在。若存在，该值为true，否则，该值为false。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListMembersRequest withSubnetCidrId(List<String> subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
        return this;
    }

    public ListMembersRequest addSubnetCidrIdItem(String subnetCidrIdItem) {
        if (this.subnetCidrId == null) {
            this.subnetCidrId = new ArrayList<>();
        }
        this.subnetCidrId.add(subnetCidrIdItem);
        return this;
    }

    public ListMembersRequest withSubnetCidrId(Consumer<List<String>> subnetCidrIdSetter) {
        if (this.subnetCidrId == null) {
            this.subnetCidrId = new ArrayList<>();
        }
        subnetCidrIdSetter.accept(this.subnetCidrId);
        return this;
    }

    /**
     * 后端服务器所在子网的IPv4子网ID或IPv6子网ID。  支持多值查询，查询条件格式：***subnet_cidr_id=xxx&subnet_cidr_id=xxx*。  [不支持IPv6，请勿设置为IPv6子网ID。](tag:dt)
     * @return subnetCidrId
     */
    public List<String> getSubnetCidrId() {
        return subnetCidrId;
    }

    public void setSubnetCidrId(List<String> subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
    }

    public ListMembersRequest withAddress(List<String> address) {
        this.address = address;
        return this;
    }

    public ListMembersRequest addAddressItem(String addressItem) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        this.address.add(addressItem);
        return this;
    }

    public ListMembersRequest withAddress(Consumer<List<String>> addressSetter) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        addressSetter.accept(this.address);
        return this;
    }

    /**
     * 后端服务器对应的IPv4或IPv6地址。  支持多值查询，查询条件格式：*address=xxx&address=xxx*。  [不支持IPv6，请勿设置为IPv6地址。](tag:dt)
     * @return address
     */
    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public ListMembersRequest withProtocolPort(List<Integer> protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    public ListMembersRequest addProtocolPortItem(Integer protocolPortItem) {
        if (this.protocolPort == null) {
            this.protocolPort = new ArrayList<>();
        }
        this.protocolPort.add(protocolPortItem);
        return this;
    }

    public ListMembersRequest withProtocolPort(Consumer<List<Integer>> protocolPortSetter) {
        if (this.protocolPort == null) {
            this.protocolPort = new ArrayList<>();
        }
        protocolPortSetter.accept(this.protocolPort);
        return this;
    }

    /**
     * 后端服务器业务端口号。  支持多值查询，查询条件格式：*protocol_port=xxx&protocol_port=xxx*。
     * @return protocolPort
     */
    public List<Integer> getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(List<Integer> protocolPort) {
        this.protocolPort = protocolPort;
    }

    public ListMembersRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListMembersRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListMembersRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 后端服务器ID。  支持多值查询，查询条件格式：*id=xxx&id=xxx*。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListMembersRequest withOperatingStatus(List<String> operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    public ListMembersRequest addOperatingStatusItem(String operatingStatusItem) {
        if (this.operatingStatus == null) {
            this.operatingStatus = new ArrayList<>();
        }
        this.operatingStatus.add(operatingStatusItem);
        return this;
    }

    public ListMembersRequest withOperatingStatus(Consumer<List<String>> operatingStatusSetter) {
        if (this.operatingStatus == null) {
            this.operatingStatus = new ArrayList<>();
        }
        operatingStatusSetter.accept(this.operatingStatus);
        return this;
    }

    /**
     * 后端服务器的健康状态。  取值： - ONLINE：后端服务器正常。 - NO_MONITOR：后端服务器所在的服务器组没有健康检查器。 - OFFLINE：后端服务器关联的ECS服务器不存在或已关机。  支持多值查询，查询条件格式：*operating_status=xxx&operating_status=xxx*。
     * @return operatingStatus
     */
    public List<String> getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(List<String> operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public ListMembersRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListMembersRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListMembersRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 参数解释：所属的企业项目ID。 如果enterprise_project_id不传值，默认查询所有企业项目下的资源，鉴权按照细粒度权限鉴权，必须在用户组下分配elb:members:list权限。 如果enterprise_project_id传值，鉴权按照企业项目权限鉴权，分为传入具体eps_id和all_granted_eps两种场景，前者查询指定eps_id的eps下的资源，后者查询的是所有有list权限的eps下的资源。  支持多值查询，查询条件格式： *enterprise_project_id=xxx&enterprise_project_id=xxx*。  [不支持该字段，请勿使用。](tag:dt,hcso_dt)
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListMembersRequest withIpVersion(List<String> ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public ListMembersRequest addIpVersionItem(String ipVersionItem) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        this.ipVersion.add(ipVersionItem);
        return this;
    }

    public ListMembersRequest withIpVersion(Consumer<List<String>> ipVersionSetter) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        ipVersionSetter.accept(this.ipVersion);
        return this;
    }

    /**
     * 当前后端服务器的IP地址版本。取值：v4、v6。
     * @return ipVersion
     */
    public List<String> getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(List<String> ipVersion) {
        this.ipVersion = ipVersion;
    }

    public ListMembersRequest withMemberType(List<String> memberType) {
        this.memberType = memberType;
        return this;
    }

    public ListMembersRequest addMemberTypeItem(String memberTypeItem) {
        if (this.memberType == null) {
            this.memberType = new ArrayList<>();
        }
        this.memberType.add(memberTypeItem);
        return this;
    }

    public ListMembersRequest withMemberType(Consumer<List<String>> memberTypeSetter) {
        if (this.memberType == null) {
            this.memberType = new ArrayList<>();
        }
        memberTypeSetter.accept(this.memberType);
        return this;
    }

    /**
     * 后端服务器的类型。  取值： - ip：跨VPC的member。 - instance：关联到ECS的member。  支持多值查询，查询条件格式：*member_type=xxx&member_type=xxx*。
     * @return memberType
     */
    public List<String> getMemberType() {
        return memberType;
    }

    public void setMemberType(List<String> memberType) {
        this.memberType = memberType;
    }

    public ListMembersRequest withInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public ListMembersRequest addInstanceIdItem(String instanceIdItem) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        this.instanceId.add(instanceIdItem);
        return this;
    }

    public ListMembersRequest withInstanceId(Consumer<List<String>> instanceIdSetter) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        instanceIdSetter.accept(this.instanceId);
        return this;
    }

    /**
     * member关联的ECS实例ID，空表示跨VPC场景的member。  支持多值查询，查询条件格式：*instance_id=xxx&instance_id=xxx*。
     * @return instanceId
     */
    public List<String> getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
    }

    public ListMembersRequest withAvailabilityZone(List<String> availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public ListMembersRequest addAvailabilityZoneItem(String availabilityZoneItem) {
        if (this.availabilityZone == null) {
            this.availabilityZone = new ArrayList<>();
        }
        this.availabilityZone.add(availabilityZoneItem);
        return this;
    }

    public ListMembersRequest withAvailabilityZone(Consumer<List<String>> availabilityZoneSetter) {
        if (this.availabilityZone == null) {
            this.availabilityZone = new ArrayList<>();
        }
        availabilityZoneSetter.accept(this.availabilityZone);
        return this;
    }

    /**
     * 后端服务器的可用区。  支持多值查询，查询条件格式：*availability_zone=xxx&availability_zone=xxx*。
     * @return availabilityZone
     */
    public List<String> getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(List<String> availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMembersRequest that = (ListMembersRequest) obj;
        return Objects.equals(this.poolId, that.poolId) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.pageReverse, that.pageReverse)
            && Objects.equals(this.name, that.name) && Objects.equals(this.weight, that.weight)
            && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.subnetCidrId, that.subnetCidrId) && Objects.equals(this.address, that.address)
            && Objects.equals(this.protocolPort, that.protocolPort) && Objects.equals(this.id, that.id)
            && Objects.equals(this.operatingStatus, that.operatingStatus)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.ipVersion, that.ipVersion) && Objects.equals(this.memberType, that.memberType)
            && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.availabilityZone, that.availabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId,
            marker,
            limit,
            pageReverse,
            name,
            weight,
            adminStateUp,
            subnetCidrId,
            address,
            protocolPort,
            id,
            operatingStatus,
            enterpriseProjectId,
            ipVersion,
            memberType,
            instanceId,
            availabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMembersRequest {\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    subnetCidrId: ").append(toIndentedString(subnetCidrId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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
