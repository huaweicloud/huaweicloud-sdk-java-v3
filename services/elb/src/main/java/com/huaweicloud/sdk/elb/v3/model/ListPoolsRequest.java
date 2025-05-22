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
public class ListPoolsRequest {

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
    @JsonProperty(value = "description")

    private List<String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor_id")

    private List<String> healthmonitorId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private List<String> loadbalancerId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private List<String> protocol = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_algorithm")

    private List<String> lbAlgorithm = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private List<String> ipVersion = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_address")

    private List<String> memberAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_device_id")

    private List<String> memberDeviceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_deletion_protection_enable")

    private Boolean memberDeletionProtectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private List<String> listenerId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_instance_id")

    private List<String> memberInstanceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private List<String> vpcId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_status")

    private List<String> protectionStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_drain")

    private Boolean connectionDrain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_health")

    private String poolHealth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "any_port_enable")

    private Boolean anyPortEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quic_cid_len")

    private Integer quicCidLen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quic_cid_offset")

    private Integer quicCidOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_affinity")

    private List<String> azAffinity = null;

    public ListPoolsRequest withMarker(String marker) {
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

    public ListPoolsRequest withLimit(Integer limit) {
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

    public ListPoolsRequest withPageReverse(Boolean pageReverse) {
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

    public ListPoolsRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListPoolsRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListPoolsRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * 后端服务器组的描述信息。  支持多值查询，查询条件格式：*description=xxx&description=xxx*。
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListPoolsRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 后端服务器组的管理状态。  [不支持该字段，请勿使用。](tag:dt,hcso_dt)
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListPoolsRequest withHealthmonitorId(List<String> healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
        return this;
    }

    public ListPoolsRequest addHealthmonitorIdItem(String healthmonitorIdItem) {
        if (this.healthmonitorId == null) {
            this.healthmonitorId = new ArrayList<>();
        }
        this.healthmonitorId.add(healthmonitorIdItem);
        return this;
    }

    public ListPoolsRequest withHealthmonitorId(Consumer<List<String>> healthmonitorIdSetter) {
        if (this.healthmonitorId == null) {
            this.healthmonitorId = new ArrayList<>();
        }
        healthmonitorIdSetter.accept(this.healthmonitorId);
        return this;
    }

    /**
     * 后端服务器组关联的健康检查的ID。  支持多值查询，查询条件格式：*healthmonitor_id=xxx&healthmonitor_id=xxx*。
     * @return healthmonitorId
     */
    public List<String> getHealthmonitorId() {
        return healthmonitorId;
    }

    public void setHealthmonitorId(List<String> healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
    }

    public ListPoolsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListPoolsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListPoolsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 后端服务器组的ID。  支持多值查询，查询条件格式：*id=xxx&id=xxx*。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListPoolsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListPoolsRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListPoolsRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 后端服务器组的名称。  支持多值查询，查询条件格式：*name=xxx&name=xxx*。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListPoolsRequest withLoadbalancerId(List<String> loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    public ListPoolsRequest addLoadbalancerIdItem(String loadbalancerIdItem) {
        if (this.loadbalancerId == null) {
            this.loadbalancerId = new ArrayList<>();
        }
        this.loadbalancerId.add(loadbalancerIdItem);
        return this;
    }

    public ListPoolsRequest withLoadbalancerId(Consumer<List<String>> loadbalancerIdSetter) {
        if (this.loadbalancerId == null) {
            this.loadbalancerId = new ArrayList<>();
        }
        loadbalancerIdSetter.accept(this.loadbalancerId);
        return this;
    }

    /**
     * 后端服务器组绑定的负载均衡器ID。  支持多值查询，查询条件格式：*loadbalancer_id=xxx&loadbalancer_id=xxx*。
     * @return loadbalancerId
     */
    public List<String> getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(List<String> loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public ListPoolsRequest withProtocol(List<String> protocol) {
        this.protocol = protocol;
        return this;
    }

    public ListPoolsRequest addProtocolItem(String protocolItem) {
        if (this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        this.protocol.add(protocolItem);
        return this;
    }

    public ListPoolsRequest withProtocol(Consumer<List<String>> protocolSetter) {
        if (this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        protocolSetter.accept(this.protocol);
        return this;
    }

    /**
     * 后端服务器组的后端协议。  取值：TCP、UDP、[IP、](tag:hws_eu)TLS、HTTP、HTTPS、QUIC和GRPC。  支持多值查询，查询条件格式：*protocol=xxx&protocol=xxx*。  [不支持QUIC协议。](tag:hws_eu,g42,hk_g42,hcso_dt)  [荷兰region不支持QUIC。](tag:dt)
     * @return protocol
     */
    public List<String> getProtocol() {
        return protocol;
    }

    public void setProtocol(List<String> protocol) {
        this.protocol = protocol;
    }

    public ListPoolsRequest withLbAlgorithm(List<String> lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
        return this;
    }

    public ListPoolsRequest addLbAlgorithmItem(String lbAlgorithmItem) {
        if (this.lbAlgorithm == null) {
            this.lbAlgorithm = new ArrayList<>();
        }
        this.lbAlgorithm.add(lbAlgorithmItem);
        return this;
    }

    public ListPoolsRequest withLbAlgorithm(Consumer<List<String>> lbAlgorithmSetter) {
        if (this.lbAlgorithm == null) {
            this.lbAlgorithm = new ArrayList<>();
        }
        lbAlgorithmSetter.accept(this.lbAlgorithm);
        return this;
    }

    /**
     * 后端服务器组的负载均衡算法。  取值： - ROUND_ROBIN：加权轮询算法。 - LEAST_CONNECTIONS：加权最少连接算法。 - SOURCE_IP：源IP算法。 - QUIC_CID：连接ID算法。 [- 2_TUPLE_HASH：二元组hash算法，仅IP类型的pool支持。 - 3_TUPLE_HASH：三元组hash算法，仅IP类型的pool支持。 - 5_TUPLE_HASH：五元组hash算法，仅IP类型的pool支持。 - IP型pool不指定该字段时，默认设置为5_TUPLE_HASH。](tag:hws_eu)  支持多值查询，查询条件格式：*lb_algorithm=xxx&lb_algorithm=xxx*。  [不支持QUIC_CID。](tag:hws_eu,g42,hk_g42,hcso_dt)  [荷兰region不支持QUIC_CID。](tag:dt)
     * @return lbAlgorithm
     */
    public List<String> getLbAlgorithm() {
        return lbAlgorithm;
    }

    public void setLbAlgorithm(List<String> lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
    }

    public ListPoolsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListPoolsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListPoolsRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 参数解释：所属的企业项目ID。 如果enterprise_project_id不传值，默认查询所有企业项目下的资源，鉴权按照细粒度权限鉴权，必须在用户组下分配elb:pools:list权限。 如果enterprise_project_id传值，鉴权按照企业项目权限鉴权，分为传入具体eps_id和all_granted_eps两种场景，前者查询指定eps_id的eps下的资源，后者查询的是所有有list权限的eps下的资源。  支持多值查询，查询条件格式： *enterprise_project_id=xxx&enterprise_project_id=xxx*。  [不支持该字段，请勿使用。](tag:dt,hcso_dt)
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListPoolsRequest withIpVersion(List<String> ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public ListPoolsRequest addIpVersionItem(String ipVersionItem) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        this.ipVersion.add(ipVersionItem);
        return this;
    }

    public ListPoolsRequest withIpVersion(Consumer<List<String>> ipVersionSetter) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        ipVersionSetter.accept(this.ipVersion);
        return this;
    }

    /**
     * 后端服务器组支持的IP版本。  支持多值查询，查询条件格式：*ip_version=xxx&ip_version=xxx*。
     * @return ipVersion
     */
    public List<String> getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(List<String> ipVersion) {
        this.ipVersion = ipVersion;
    }

    public ListPoolsRequest withMemberAddress(List<String> memberAddress) {
        this.memberAddress = memberAddress;
        return this;
    }

    public ListPoolsRequest addMemberAddressItem(String memberAddressItem) {
        if (this.memberAddress == null) {
            this.memberAddress = new ArrayList<>();
        }
        this.memberAddress.add(memberAddressItem);
        return this;
    }

    public ListPoolsRequest withMemberAddress(Consumer<List<String>> memberAddressSetter) {
        if (this.memberAddress == null) {
            this.memberAddress = new ArrayList<>();
        }
        memberAddressSetter.accept(this.memberAddress);
        return this;
    }

    /**
     * 后端服务器的IP地址。仅用于查询条件，不作为响应参数字段。  支持多值查询，查询条件格式：*member_address=xxx&member_address=xxx*。
     * @return memberAddress
     */
    public List<String> getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(List<String> memberAddress) {
        this.memberAddress = memberAddress;
    }

    public ListPoolsRequest withMemberDeviceId(List<String> memberDeviceId) {
        this.memberDeviceId = memberDeviceId;
        return this;
    }

    public ListPoolsRequest addMemberDeviceIdItem(String memberDeviceIdItem) {
        if (this.memberDeviceId == null) {
            this.memberDeviceId = new ArrayList<>();
        }
        this.memberDeviceId.add(memberDeviceIdItem);
        return this;
    }

    public ListPoolsRequest withMemberDeviceId(Consumer<List<String>> memberDeviceIdSetter) {
        if (this.memberDeviceId == null) {
            this.memberDeviceId = new ArrayList<>();
        }
        memberDeviceIdSetter.accept(this.memberDeviceId);
        return this;
    }

    /**
     * 后端服务器对应的弹性云服务器的ID。仅用于查询条件，不作为响应参数字段。  支持多值查询，查询条件格式：*member_device_id=xxx&member_device_id=xxx*。
     * @return memberDeviceId
     */
    public List<String> getMemberDeviceId() {
        return memberDeviceId;
    }

    public void setMemberDeviceId(List<String> memberDeviceId) {
        this.memberDeviceId = memberDeviceId;
    }

    public ListPoolsRequest withMemberDeletionProtectionEnable(Boolean memberDeletionProtectionEnable) {
        this.memberDeletionProtectionEnable = memberDeletionProtectionEnable;
        return this;
    }

    /**
     * 是否开启删除保护，false不开启，true开启，不传查询全部。 [不支持该字段，请勿使用。](tag:hws_eu,g42,hk_g42)  [荷兰region不支持该字段，请勿使用。](tag:dt)
     * @return memberDeletionProtectionEnable
     */
    public Boolean getMemberDeletionProtectionEnable() {
        return memberDeletionProtectionEnable;
    }

    public void setMemberDeletionProtectionEnable(Boolean memberDeletionProtectionEnable) {
        this.memberDeletionProtectionEnable = memberDeletionProtectionEnable;
    }

    public ListPoolsRequest withListenerId(List<String> listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    public ListPoolsRequest addListenerIdItem(String listenerIdItem) {
        if (this.listenerId == null) {
            this.listenerId = new ArrayList<>();
        }
        this.listenerId.add(listenerIdItem);
        return this;
    }

    public ListPoolsRequest withListenerId(Consumer<List<String>> listenerIdSetter) {
        if (this.listenerId == null) {
            this.listenerId = new ArrayList<>();
        }
        listenerIdSetter.accept(this.listenerId);
        return this;
    }

    /**
     * 关联的监听器ID，包括通过l7policy关联的。  支持多值查询，查询条件格式：*listener_id=xxx&listener_id=xxx*。
     * @return listenerId
     */
    public List<String> getListenerId() {
        return listenerId;
    }

    public void setListenerId(List<String> listenerId) {
        this.listenerId = listenerId;
    }

    public ListPoolsRequest withMemberInstanceId(List<String> memberInstanceId) {
        this.memberInstanceId = memberInstanceId;
        return this;
    }

    public ListPoolsRequest addMemberInstanceIdItem(String memberInstanceIdItem) {
        if (this.memberInstanceId == null) {
            this.memberInstanceId = new ArrayList<>();
        }
        this.memberInstanceId.add(memberInstanceIdItem);
        return this;
    }

    public ListPoolsRequest withMemberInstanceId(Consumer<List<String>> memberInstanceIdSetter) {
        if (this.memberInstanceId == null) {
            this.memberInstanceId = new ArrayList<>();
        }
        memberInstanceIdSetter.accept(this.memberInstanceId);
        return this;
    }

    /**
     * 后端服务器ID。仅用于查询条件，不作为响应参数字段。  支持多值查询，查询条件格式：*member_instance_id=xxx&member_instance_id=xxx*。
     * @return memberInstanceId
     */
    public List<String> getMemberInstanceId() {
        return memberInstanceId;
    }

    public void setMemberInstanceId(List<String> memberInstanceId) {
        this.memberInstanceId = memberInstanceId;
    }

    public ListPoolsRequest withVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public ListPoolsRequest addVpcIdItem(String vpcIdItem) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        this.vpcId.add(vpcIdItem);
        return this;
    }

    public ListPoolsRequest withVpcId(Consumer<List<String>> vpcIdSetter) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        vpcIdSetter.accept(this.vpcId);
        return this;
    }

    /**
     * 后端服务器组关联的虚拟私有云的ID。
     * @return vpcId
     */
    public List<String> getVpcId() {
        return vpcId;
    }

    public void setVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
    }

    public ListPoolsRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ListPoolsRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListPoolsRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * 后端服务器组的类型。  取值： - instance：允许任意类型的后端，type指定为该类型时，vpc_id是必选字段。 - ip：只能添加跨VPC后端，type指定为该类型时，vpc_id不允许指定。 - 空字符串（\"\"）：允许任意类型的后端
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public ListPoolsRequest withProtectionStatus(List<String> protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    public ListPoolsRequest addProtectionStatusItem(String protectionStatusItem) {
        if (this.protectionStatus == null) {
            this.protectionStatus = new ArrayList<>();
        }
        this.protectionStatus.add(protectionStatusItem);
        return this;
    }

    public ListPoolsRequest withProtectionStatus(Consumer<List<String>> protectionStatusSetter) {
        if (this.protectionStatus == null) {
            this.protectionStatus = new ArrayList<>();
        }
        protectionStatusSetter.accept(this.protectionStatus);
        return this;
    }

    /**
     * 修改保护状态, 取值： - nonProtection: 不保护，默认值为nonProtection - consoleProtection: 控制台修改保护
     * @return protectionStatus
     */
    public List<String> getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(List<String> protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public ListPoolsRequest withConnectionDrain(Boolean connectionDrain) {
        this.connectionDrain = connectionDrain;
        return this;
    }

    /**
     * 查询是否开启延迟注销的功能，查询条件格式：*connection_drain=true或者*connection_drain=false
     * @return connectionDrain
     */
    public Boolean getConnectionDrain() {
        return connectionDrain;
    }

    public void setConnectionDrain(Boolean connectionDrain) {
        this.connectionDrain = connectionDrain;
    }

    public ListPoolsRequest withPoolHealth(String poolHealth) {
        this.poolHealth = poolHealth;
        return this;
    }

    /**
     * 查询是否开启后端全下线转发功能，查询条件格式：*pool_health=minimum_healthy_member_count=0或者*pool_health=minimum_healthy_member_count=1
     * @return poolHealth
     */
    public String getPoolHealth() {
        return poolHealth;
    }

    public void setPoolHealth(String poolHealth) {
        this.poolHealth = poolHealth;
    }

    public ListPoolsRequest withAnyPortEnable(Boolean anyPortEnable) {
        this.anyPortEnable = anyPortEnable;
        return this;
    }

    /**
     * 后端是否开启端口透传。开启后，后端服务器端口与前端监听器端口保持一致。取值：false不开启，true开启。
     * @return anyPortEnable
     */
    public Boolean getAnyPortEnable() {
        return anyPortEnable;
    }

    public void setAnyPortEnable(Boolean anyPortEnable) {
        this.anyPortEnable = anyPortEnable;
    }

    public ListPoolsRequest withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 网络公共边界组
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public ListPoolsRequest withQuicCidLen(Integer quicCidLen) {
        this.quicCidLen = quicCidLen;
        return this;
    }

    /**
     * 查询相同QUIC CID策略配置的后端服务器组，仅用于查询条件，不作为响应参数字段。 支持多值查询，查询条件格式：*quic_cid_len=3&quic_cid_len=5*
     * @return quicCidLen
     */
    public Integer getQuicCidLen() {
        return quicCidLen;
    }

    public void setQuicCidLen(Integer quicCidLen) {
        this.quicCidLen = quicCidLen;
    }

    public ListPoolsRequest withQuicCidOffset(Integer quicCidOffset) {
        this.quicCidOffset = quicCidOffset;
        return this;
    }

    /**
     * 查询相同QUIC CID策略配置的后端服务器组，仅用于查询条件，不作为响应参数字段。 支持多值查询，查询条件格式：*quic_cid_offset=1&quic_cid_offset=3*
     * @return quicCidOffset
     */
    public Integer getQuicCidOffset() {
        return quicCidOffset;
    }

    public void setQuicCidOffset(Integer quicCidOffset) {
        this.quicCidOffset = quicCidOffset;
    }

    public ListPoolsRequest withAzAffinity(List<String> azAffinity) {
        this.azAffinity = azAffinity;
        return this;
    }

    public ListPoolsRequest addAzAffinityItem(String azAffinityItem) {
        if (this.azAffinity == null) {
            this.azAffinity = new ArrayList<>();
        }
        this.azAffinity.add(azAffinityItem);
        return this;
    }

    public ListPoolsRequest withAzAffinity(Consumer<List<String>> azAffinitySetter) {
        if (this.azAffinity == null) {
            this.azAffinity = new ArrayList<>();
        }
        azAffinitySetter.accept(this.azAffinity);
        return this;
    }

    /**
     * 查询后端服务器组可用区亲和性策略是否开启。示例如下： \"az_affinity\": {             \"enable\": \"true\"         }  支持多值查询，查询条件格式：  *az_affinity=enable=true&az_affinity=enable=false*。
     * @return azAffinity
     */
    public List<String> getAzAffinity() {
        return azAffinity;
    }

    public void setAzAffinity(List<String> azAffinity) {
        this.azAffinity = azAffinity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPoolsRequest that = (ListPoolsRequest) obj;
        return Objects.equals(this.marker, that.marker) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.pageReverse, that.pageReverse) && Objects.equals(this.description, that.description)
            && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.healthmonitorId, that.healthmonitorId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.loadbalancerId, that.loadbalancerId)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.lbAlgorithm, that.lbAlgorithm)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.ipVersion, that.ipVersion) && Objects.equals(this.memberAddress, that.memberAddress)
            && Objects.equals(this.memberDeviceId, that.memberDeviceId)
            && Objects.equals(this.memberDeletionProtectionEnable, that.memberDeletionProtectionEnable)
            && Objects.equals(this.listenerId, that.listenerId)
            && Objects.equals(this.memberInstanceId, that.memberInstanceId) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.connectionDrain, that.connectionDrain)
            && Objects.equals(this.poolHealth, that.poolHealth)
            && Objects.equals(this.anyPortEnable, that.anyPortEnable)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.quicCidLen, that.quicCidLen)
            && Objects.equals(this.quicCidOffset, that.quicCidOffset)
            && Objects.equals(this.azAffinity, that.azAffinity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker,
            limit,
            pageReverse,
            description,
            adminStateUp,
            healthmonitorId,
            id,
            name,
            loadbalancerId,
            protocol,
            lbAlgorithm,
            enterpriseProjectId,
            ipVersion,
            memberAddress,
            memberDeviceId,
            memberDeletionProtectionEnable,
            listenerId,
            memberInstanceId,
            vpcId,
            type,
            protectionStatus,
            connectionDrain,
            poolHealth,
            anyPortEnable,
            publicBorderGroup,
            quicCidLen,
            quicCidOffset,
            azAffinity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPoolsRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    healthmonitorId: ").append(toIndentedString(healthmonitorId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    memberAddress: ").append(toIndentedString(memberAddress)).append("\n");
        sb.append("    memberDeviceId: ").append(toIndentedString(memberDeviceId)).append("\n");
        sb.append("    memberDeletionProtectionEnable: ")
            .append(toIndentedString(memberDeletionProtectionEnable))
            .append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    memberInstanceId: ").append(toIndentedString(memberInstanceId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
        sb.append("    connectionDrain: ").append(toIndentedString(connectionDrain)).append("\n");
        sb.append("    poolHealth: ").append(toIndentedString(poolHealth)).append("\n");
        sb.append("    anyPortEnable: ").append(toIndentedString(anyPortEnable)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    quicCidLen: ").append(toIndentedString(quicCidLen)).append("\n");
        sb.append("    quicCidOffset: ").append(toIndentedString(quicCidOffset)).append("\n");
        sb.append("    azAffinity: ").append(toIndentedString(azAffinity)).append("\n");
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
