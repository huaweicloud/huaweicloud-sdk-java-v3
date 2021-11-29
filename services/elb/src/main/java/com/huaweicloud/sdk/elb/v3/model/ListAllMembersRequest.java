package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ListAllMembersRequest {

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
    @JsonProperty(value = "pool_id")

    private List<String> poolId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private List<String> loadbalancerId = null;

    public ListAllMembersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 上一页最后一条记录的ID。 使用说明： - 必须与limit一起使用。 - 不指定时表示查询第一页。 - 该字段不允许为空或无效的ID。
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListAllMembersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页返回的个数。 minimum: 0 maximum: 2000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAllMembersRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /** 分页的顺序，true表示从后往前分页，false表示从前往后分页，默认为false。 使用说明： - 必须与limit一起使用。
     * 
     * @return pageReverse */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListAllMembersRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListAllMembersRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListAllMembersRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /** 后端云服务器名称。 支持多值查询，查询条件格式：*name=xxx&name=xxx*。
     * 
     * @return name */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListAllMembersRequest withWeight(List<Integer> weight) {
        this.weight = weight;
        return this;
    }

    public ListAllMembersRequest addWeightItem(Integer weightItem) {
        if (this.weight == null) {
            this.weight = new ArrayList<>();
        }
        this.weight.add(weightItem);
        return this;
    }

    public ListAllMembersRequest withWeight(Consumer<List<Integer>> weightSetter) {
        if (this.weight == null) {
            this.weight = new ArrayList<>();
        }
        weightSetter.accept(this.weight);
        return this;
    }

    /** 后端云服务器的权重，请求按权重在同一后端云服务器组下的后端云服务器间分发。权重为0的后端不再接受新的请求。当后端云服务器所在的后端云服务器组的lb_algorithm的取值为SOURCE_IP时，该字段无效。
     * 支持多值查询，查询条件格式：*weight=xxx&weight=xxx*。
     * 
     * @return weight */
    public List<Integer> getWeight() {
        return weight;
    }

    public void setWeight(List<Integer> weight) {
        this.weight = weight;
    }

    public ListAllMembersRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /** 后端云服务器的管理状态；该字段虽然支持创建、更新，但实际取值决定于member对应的弹性云服务器是否存在。若存在，该值为true，否则，该值为false。
     * 
     * @return adminStateUp */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListAllMembersRequest withSubnetCidrId(List<String> subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
        return this;
    }

    public ListAllMembersRequest addSubnetCidrIdItem(String subnetCidrIdItem) {
        if (this.subnetCidrId == null) {
            this.subnetCidrId = new ArrayList<>();
        }
        this.subnetCidrId.add(subnetCidrIdItem);
        return this;
    }

    public ListAllMembersRequest withSubnetCidrId(Consumer<List<String>> subnetCidrIdSetter) {
        if (this.subnetCidrId == null) {
            this.subnetCidrId = new ArrayList<>();
        }
        subnetCidrIdSetter.accept(this.subnetCidrId);
        return this;
    }

    /** 后端云服务器所在的子网ID。该子网和后端云服务器关联的负载均衡器的子网必须在同一VPC下。只支持指定IPv4的子网ID。
     * 支持多值查询，查询条件格式：***subnet_cidr_id=xxx&subnet_cidr_id=xxx*。
     * 
     * @return subnetCidrId */
    public List<String> getSubnetCidrId() {
        return subnetCidrId;
    }

    public void setSubnetCidrId(List<String> subnetCidrId) {
        this.subnetCidrId = subnetCidrId;
    }

    public ListAllMembersRequest withAddress(List<String> address) {
        this.address = address;
        return this;
    }

    public ListAllMembersRequest addAddressItem(String addressItem) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        this.address.add(addressItem);
        return this;
    }

    public ListAllMembersRequest withAddress(Consumer<List<String>> addressSetter) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        addressSetter.accept(this.address);
        return this;
    }

    /** 后端云服务器的对应的IP地址，这个IP必须在subnet_cidr_id字段的子网网段中。例如：192.168.3.11。只能指定为主网卡的IP。
     * 支持多值查询，查询条件格式：*address=xxx&address=xxx*。
     * 
     * @return address */
    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public ListAllMembersRequest withProtocolPort(List<Integer> protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    public ListAllMembersRequest addProtocolPortItem(Integer protocolPortItem) {
        if (this.protocolPort == null) {
            this.protocolPort = new ArrayList<>();
        }
        this.protocolPort.add(protocolPortItem);
        return this;
    }

    public ListAllMembersRequest withProtocolPort(Consumer<List<Integer>> protocolPortSetter) {
        if (this.protocolPort == null) {
            this.protocolPort = new ArrayList<>();
        }
        protocolPortSetter.accept(this.protocolPort);
        return this;
    }

    /** 后端服务器端口号。 支持多值查询，查询条件格式：*protocol_port=xxx&protocol_port=xxx*。
     * 
     * @return protocolPort */
    public List<Integer> getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(List<Integer> protocolPort) {
        this.protocolPort = protocolPort;
    }

    public ListAllMembersRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListAllMembersRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListAllMembersRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /** 后端云服务器ID。 支持多值查询，查询条件格式：*id=xxx&id=xxx*。
     * 
     * @return id */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListAllMembersRequest withOperatingStatus(List<String> operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    public ListAllMembersRequest addOperatingStatusItem(String operatingStatusItem) {
        if (this.operatingStatus == null) {
            this.operatingStatus = new ArrayList<>();
        }
        this.operatingStatus.add(operatingStatusItem);
        return this;
    }

    public ListAllMembersRequest withOperatingStatus(Consumer<List<String>> operatingStatusSetter) {
        if (this.operatingStatus == null) {
            this.operatingStatus = new ArrayList<>();
        }
        operatingStatusSetter.accept(this.operatingStatus);
        return this;
    }

    /** 后端云服务器的健康状态，取值： ONLINE，后端服务器正常运行。 NO_MONITOR，后端服务器无健康检查。 OFFLINE，已下线。
     * 支持多值查询，查询条件格式：*operating_status=xxx&operating_status=*。
     * 
     * @return operatingStatus */
    public List<String> getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(List<String> operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public ListAllMembersRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListAllMembersRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListAllMembersRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /** 企业项目ID。不传时查询default企业项目\"0\"下的资源，鉴权按照default企业项目鉴权；如果传值，则传已存在的企业项目ID或all_granted_eps（表示查询所有企业项目）进行查询。
     * 支持多值查询，查询条件格式：*enterprise_project_id=xxx&enterprise_project_id=xxx*。 [不支持该字段，请勿使用。](tag:otc,otc_test,dt,dt_test)
     * 
     * @return enterpriseProjectId */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListAllMembersRequest withIpVersion(List<String> ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public ListAllMembersRequest addIpVersionItem(String ipVersionItem) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        this.ipVersion.add(ipVersionItem);
        return this;
    }

    public ListAllMembersRequest withIpVersion(Consumer<List<String>> ipVersionSetter) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        ipVersionSetter.accept(this.ipVersion);
        return this;
    }

    /** IP版本，取值v4、v6。 支持多值查询，查询条件格式：*ip_version=xxx&ip_version=xxx*。
     * 
     * @return ipVersion */
    public List<String> getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(List<String> ipVersion) {
        this.ipVersion = ipVersion;
    }

    public ListAllMembersRequest withPoolId(List<String> poolId) {
        this.poolId = poolId;
        return this;
    }

    public ListAllMembersRequest addPoolIdItem(String poolIdItem) {
        if (this.poolId == null) {
            this.poolId = new ArrayList<>();
        }
        this.poolId.add(poolIdItem);
        return this;
    }

    public ListAllMembersRequest withPoolId(Consumer<List<String>> poolIdSetter) {
        if (this.poolId == null) {
            this.poolId = new ArrayList<>();
        }
        poolIdSetter.accept(this.poolId);
        return this;
    }

    /** member所属的服务器组ID 支持多值查询，查询条件格式：*pool_id=xxx&pool_id=xxx*。
     * 
     * @return poolId */
    public List<String> getPoolId() {
        return poolId;
    }

    public void setPoolId(List<String> poolId) {
        this.poolId = poolId;
    }

    public ListAllMembersRequest withLoadbalancerId(List<String> loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    public ListAllMembersRequest addLoadbalancerIdItem(String loadbalancerIdItem) {
        if (this.loadbalancerId == null) {
            this.loadbalancerId = new ArrayList<>();
        }
        this.loadbalancerId.add(loadbalancerIdItem);
        return this;
    }

    public ListAllMembersRequest withLoadbalancerId(Consumer<List<String>> loadbalancerIdSetter) {
        if (this.loadbalancerId == null) {
            this.loadbalancerId = new ArrayList<>();
        }
        loadbalancerIdSetter.accept(this.loadbalancerId);
        return this;
    }

    /** member所属的负载均衡器ID。 支持多值查询，查询条件格式：*loadbalancer_id=xxx&loadbalancer_id=xxx*。
     * 
     * @return loadbalancerId */
    public List<String> getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(List<String> loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAllMembersRequest listAllMembersRequest = (ListAllMembersRequest) o;
        return Objects.equals(this.marker, listAllMembersRequest.marker)
            && Objects.equals(this.limit, listAllMembersRequest.limit)
            && Objects.equals(this.pageReverse, listAllMembersRequest.pageReverse)
            && Objects.equals(this.name, listAllMembersRequest.name)
            && Objects.equals(this.weight, listAllMembersRequest.weight)
            && Objects.equals(this.adminStateUp, listAllMembersRequest.adminStateUp)
            && Objects.equals(this.subnetCidrId, listAllMembersRequest.subnetCidrId)
            && Objects.equals(this.address, listAllMembersRequest.address)
            && Objects.equals(this.protocolPort, listAllMembersRequest.protocolPort)
            && Objects.equals(this.id, listAllMembersRequest.id)
            && Objects.equals(this.operatingStatus, listAllMembersRequest.operatingStatus)
            && Objects.equals(this.enterpriseProjectId, listAllMembersRequest.enterpriseProjectId)
            && Objects.equals(this.ipVersion, listAllMembersRequest.ipVersion)
            && Objects.equals(this.poolId, listAllMembersRequest.poolId)
            && Objects.equals(this.loadbalancerId, listAllMembersRequest.loadbalancerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker,
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
            poolId,
            loadbalancerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllMembersRequest {\n");
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
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
