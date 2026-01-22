package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceDetail
 */
public class InstanceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch_type")

    private String archType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_name")

    private String vpcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_name")

    private String securityGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr")

    private String subnetCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone_names")

    private List<String> availableZoneNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_begin")

    private String maintainBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_end")

    private String maintainEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_log_collection")

    private Boolean enableLogCollection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_space")

    private Integer storageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_storage_space")

    private Integer usedStorageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_publicip")

    private Boolean enablePublicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_address")

    private String publicipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_enable")

    private Boolean sslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_vpc_info")

    private String crossVpcInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_resource_id")

    private String storageResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_spec_code")

    private String storageSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private String storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_times")

    private Long extendTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_features")

    private String supportFeatures;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_encrypted")

    private Boolean diskEncrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ces_version")

    private String cesVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_spec_billing_enable")

    private Boolean newSpecBillingEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_acl")

    private Boolean enableAcl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_num")

    private Integer brokerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_enable")

    private Boolean dnsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namesrv_address")

    private String namesrvAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namesrv_domain_name")

    private String namesrvDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_address")

    private String brokerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_namesrv_address")

    private String publicNamesrvAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_namesrv_domain_name")

    private String publicNamesrvDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_broker_address")

    private String publicBrokerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grpc_address")

    private String grpcAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grpc_domain_name")

    private String grpcDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_grpc_address")

    private String publicGrpcAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_grpc_domain_name")

    private String publicGrpcDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagEntity> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_storage_space")

    private Integer totalStorageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "produce_portion")

    private Integer producePortion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_portion")

    private Integer consumePortion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_enable")

    private Boolean drEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_address")

    private String quotaAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_msg_process_tps")

    private Integer maxMsgProcessTps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_ssl_need_restart_process")

    private Boolean configSslNeedRestartProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_mode")

    private String tlsMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_elastic_tps")

    private Boolean enableElasticTps;

    public InstanceDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 实例名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceDetail withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * **参数解释**： 消息引擎。 **约束限制**： 不涉及。 **取值范围**： - rocketmq：RocketMQ消息引擎。 - reliability：RocketMQ消息引擎别称。 **默认取值**： 不涉及。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public InstanceDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 状态。 **约束限制**： 不涉及。 **取值范围**： [详细状态说明请参考[实例状态说明](hrm-api-0010.xml)。](tag:hws,hws_hk,ctc,hws_eu,ocb,g42,hk_g42,tm,sbc,hk_sbc,cmcc,hk_tm,dt,ax,srg)[详细状态说明请参考[实例状态说明](kafka-api-180514012.xml)。](tag:hcs,fcs,hcs_oemout) **默认取值**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 消息描述。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InstanceDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 实例类型。 **约束限制**： 不涉及。 **取值范围**： [- single：4.8.0单机。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- cluster：4.8.0集群。](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- single.basic：5.x单机基础版。](tag:hws,hws_hk,ctc,hws_eu,ocb,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt,hcs,fcs,hcs_oemout,srg) [- cluster.basic：5.x集群基础版。](tag:hws,hws_hk,ctc,hws_eu,ocb,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt,hcs,fcs,hcs_oemout,srg) [- cluster.professional：5.x集群专业版。](tag:hws,hws_eu,hws_hk,ctc,srg) **默认取值**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InstanceDetail withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * **参数解释**： 实例规格。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public InstanceDetail withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * **参数解释**： 实例版本。 **约束限制**： 不涉及。 **取值范围**： [- 4.8.0](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- 5.x](tag:hws,hws_hk,ctc,hws_eu,ocb,tm,sbc,hk_sbc,hk_tm,dt,hcs,fcs,srg,hcs_oemout) **默认取值**： 不涉及。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public InstanceDetail withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceDetail withArchType(String archType) {
        this.archType = archType;
        return this;
    }

    /**
     * **参数解释**： 架构类型。 **取值范围**： - X86。 - ARM。
     * @return archType
     */
    public String getArchType() {
        return archType;
    }

    public void setArchType(String archType) {
        this.archType = archType;
    }

    public InstanceDetail withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释**： 付费模式。 **约束限制**： 不涉及。 **取值范围**： [1表示按需计费。](tag:hws_eu,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[1表示按需计费，0表示包年/包月计费。](tag:hws,hws_eu,hws_hk,ctc,cmcc,ax) [计费模式，参数暂未使用。](tag:ocb,hws_ocb,hcs,fcs,hcs_oemout,srg) **默认取值**： 不涉及。
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public InstanceDetail withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**： 私有云ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public InstanceDetail withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * **参数解释**： 私有云名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return vpcName
     */
    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public InstanceDetail withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**： 完成创建时间。  格式为时间戳，指从格林威治时间1970年01月01日00时00分00秒起至指定时间的偏差总毫秒数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public InstanceDetail withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数解释**： RocketMQ实例规格。[x86环境后缀为.x86，arm环境为.arm。single表示单机，cluster表示集群。](tag:hcs,fcs,hcs_oemout)  **约束限制**： 不涉及。  **取值范围**： [当“type”为“single.basic”选择单机规格；当“type”为“cluster.basic”选择集群规格。](tag:dt) [- c6.2u8g.cluster.x86或c6.2u8g.cluster.arm：单个代理最大分区数50，单个代理最大消费组数100](tag:fcs) [- c6.4u8g.cluster.small：单个代理最大Topic数2000，单个代理最大消费组数2000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- c6.4u8g.cluster：单个代理最大Topic数4000，单个代理最大消费组数4000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- c6.4u16g.cluster.x86或c6.4u16g.cluster.arm：单个代理最大分区数100，单个代理最大消费组数200](tag:hcs,hcs_oemout) [- c6.8u16g.cluster：单个代理最大Topic数8000，单个代理最大消费组数8000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- c6.8u32g.cluster.x86或c6.8u32g.cluster.arm：单个代理最大Topic数200，单个代理最大消费组数400](tag:hcs,fcs,hcs_oemout) [- c6.12u24g.cluster：单个代理最大Topic数12000，单个代理最大消费组数12000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- c6.16u64g.cluster.x86或c6.16u64g.cluster.arm：单个代理最大Topic数300，单个代理最大消费组数600](tag:hcs,fcs,hcs_oemout) [- c6.16u32g.cluster：单个代理最大Topic数16000，单个代理最大消费组数16000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- c6.32u128g.cluster.x86或c6.32u128g.cluster.arm：单个代理最大Topic数400，单个代理最大消费组数800](tag:hcs,fcs,hcs_oemout) [- rocketmq.b1.large.1：RocketMQ 5.x 基础版单机规格，实例TPS 500](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt,srg) [- rocketmq.b2.large.4：RocketMQ 5.x 基础版集群规格，实例TPS 2000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt,srg) [- rocketmq.b2.large.8：RocketMQ 5.x 基础版集群规格，实例TPS 4000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt,srg) [- rocketmq.b2.large.12：RocketMQ 5.x 基础版集群规格，实例TPS 6000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt,srg) [- rocketmq.p1.large.1：RocketMQ 5.x 专业版单机规格，实例TPS 500](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.8：RocketMQ 5.x 专业版集群规格，实例TPS 4000](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.12：RocketMQ 5.x 专业版集群规格，实例TPS 6000](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.20：RocketMQ 5.x 专业版集群规格，实例TPS 10000](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.40：RocketMQ 5.x 专业版集群规格，实例TPS 20000](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.100：RocketMQ 5.x 专业版集群规格，实例TPS 50000](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.150：RocketMQ 5.x 专业版集群规格，实例TPS 75000](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.200：RocketMQ 5.x 专业版集群规格，实例TPS 100000](tag:hws,hws_eu,hws_hk,ctc,srg) [- rocketmq.p2.large.300：RocketMQ 5.x 专业版集群规格，实例TPS 150000](tag:hws,hws_eu,hws_hk,ctc,srg) **默认取值**： 不涉及。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public InstanceDetail withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * **参数解释**： 安全组ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public InstanceDetail withSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }

    /**
     * **参数解释**： 安全组名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public InstanceDetail withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释**： 子网ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public InstanceDetail withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * **参数解释**： 子网路由。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return subnetCidr
     */
    public String getSubnetCidr() {
        return subnetCidr;
    }

    public void setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
    }

    public InstanceDetail withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public InstanceDetail addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public InstanceDetail withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * **参数解释**： 可用区ID列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public InstanceDetail withAvailableZoneNames(List<String> availableZoneNames) {
        this.availableZoneNames = availableZoneNames;
        return this;
    }

    public InstanceDetail addAvailableZoneNamesItem(String availableZoneNamesItem) {
        if (this.availableZoneNames == null) {
            this.availableZoneNames = new ArrayList<>();
        }
        this.availableZoneNames.add(availableZoneNamesItem);
        return this;
    }

    public InstanceDetail withAvailableZoneNames(Consumer<List<String>> availableZoneNamesSetter) {
        if (this.availableZoneNames == null) {
            this.availableZoneNames = new ArrayList<>();
        }
        availableZoneNamesSetter.accept(this.availableZoneNames);
        return this;
    }

    /**
     * **参数解释**： 可用区名称列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return availableZoneNames
     */
    public List<String> getAvailableZoneNames() {
        return availableZoneNames;
    }

    public void setAvailableZoneNames(List<String> availableZoneNames) {
        this.availableZoneNames = availableZoneNames;
    }

    public InstanceDetail withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**： 用户ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public InstanceDetail withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**： 用户名。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public InstanceDetail withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    /**
     * **参数解释**： 维护时间窗开始时间，格式为HH:mm:ss。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return maintainBegin
     */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public InstanceDetail withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    /**
     * **参数解释**： 维护时间窗结束时间，格式为HH:mm:ss。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return maintainEnd
     */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public InstanceDetail withEnableLogCollection(Boolean enableLogCollection) {
        this.enableLogCollection = enableLogCollection;
        return this;
    }

    /**
     * **参数解释**： 是否开启消息收集功能。 **约束限制**： 不涉及。 **取值范围**： - true：开启。 - false：不开启。 **默认取值**： 不涉及。
     * @return enableLogCollection
     */
    public Boolean getEnableLogCollection() {
        return enableLogCollection;
    }

    public void setEnableLogCollection(Boolean enableLogCollection) {
        this.enableLogCollection = enableLogCollection;
    }

    public InstanceDetail withStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }

    /**
     * **参数解释**： 存储空间，单位：GB。 **约束限制**： 不涉及。 **取值范围**： 不同的实例规格支持不同的存储配置。 [- RocketMQ 5.x 单机存储取值范围：100-30000。](tag:dt) [- RocketMQ 5.x 集群存储取值范围：200-60000。](tag:dt) **默认取值**： 不涉及。
     * @return storageSpace
     */
    public Integer getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
    }

    public InstanceDetail withUsedStorageSpace(Integer usedStorageSpace) {
        this.usedStorageSpace = usedStorageSpace;
        return this;
    }

    /**
     * **参数解释**： 已用消息存储空间，单位：GB。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return usedStorageSpace
     */
    public Integer getUsedStorageSpace() {
        return usedStorageSpace;
    }

    public void setUsedStorageSpace(Integer usedStorageSpace) {
        this.usedStorageSpace = usedStorageSpace;
    }

    public InstanceDetail withEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
        return this;
    }

    /**
     * **参数解释**： 是否开启公网。 **约束限制**： 不涉及。 **取值范围**： - true：开启。 - false：不开启。 **默认取值**： 不涉及。
     * @return enablePublicip
     */
    public Boolean getEnablePublicip() {
        return enablePublicip;
    }

    public void setEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
    }

    public InstanceDetail withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * **参数解释**： 实例绑定的弹性IP地址的ID。  以英文逗号隔开多个弹性IP地址的ID。  如果开启了公网访问功能（即enable_publicip为true），该字段为必选。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public InstanceDetail withPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
        return this;
    }

    /**
     * **参数解释**： 公网IP地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return publicipAddress
     */
    public String getPublicipAddress() {
        return publicipAddress;
    }

    public void setPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
    }

    public InstanceDetail withSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
        return this;
    }

    /**
     * **参数解释**： 是否开启SSL。 **取值范围**： - true：开启。 - false：未开启。
     * @return sslEnable
     */
    public Boolean getSslEnable() {
        return sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    public InstanceDetail withCrossVpcInfo(String crossVpcInfo) {
        this.crossVpcInfo = crossVpcInfo;
        return this;
    }

    /**
     * **参数解释**： 跨VPC访问信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return crossVpcInfo
     */
    public String getCrossVpcInfo() {
        return crossVpcInfo;
    }

    public void setCrossVpcInfo(String crossVpcInfo) {
        this.crossVpcInfo = crossVpcInfo;
    }

    public InstanceDetail withStorageResourceId(String storageResourceId) {
        this.storageResourceId = storageResourceId;
        return this;
    }

    /**
     * **参数解释**： 存储资源ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return storageResourceId
     */
    public String getStorageResourceId() {
        return storageResourceId;
    }

    public void setStorageResourceId(String storageResourceId) {
        this.storageResourceId = storageResourceId;
    }

    public InstanceDetail withStorageSpecCode(String storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
        return this;
    }

    /**
     * **参数解释**： 存储规格代码。 **约束限制**： 不涉及。 **取值范围**： - dms.physical.storage.high.v2：高IO类型磁盘 - dms.physical.storage.ultra.v2：超高IO类型磁盘 [- dms.physical.storage.general：使用通用型SSD的磁盘类型。](tag:hws,hws_hk,dt,ctc,ax) [- dms.physical.storage.extreme：使用极速型SSD的磁盘类型。](tag:hws,hws_hk,dt,ctc,ax) **默认取值**： 不涉及。
     * @return storageSpecCode
     */
    public String getStorageSpecCode() {
        return storageSpecCode;
    }

    public void setStorageSpecCode(String storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
    }

    public InstanceDetail withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * **参数解释**： 服务类型。 **约束限制**： 不涉及。 **取值范围**： - advanced：[华为云服务类型。](tag:hws,hws_hk)[服务类型。](tag:ctc,hws_eu,ocb,g42,hk_g42,tm,sbc,hk_sbc,cmcc,hk_tm,hcs,fcs,dt,hcs_oemout,ax,srg) [- dec：专属云服务类型。](tag:hws,hws_hk) **默认取值**： 不涉及。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public InstanceDetail withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * **参数解释**： 存储类型。 **约束限制**： 不涉及。 **取值范围**： - hec：[华为云存储类型。](tag:hws,hws_hk)[存储类型。](tag:ctc,hws_eu,ocb,g42,hk_g42,tm,sbc,hk_sbc,cmcc,hk_tm,hcs,fcs,dt,hcs_oemout,ax,srg) [- dss：专属云存储类型。](tag:hws,hws_hk) **默认取值**： 不涉及。
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public InstanceDetail withExtendTimes(Long extendTimes) {
        this.extendTimes = extendTimes;
        return this;
    }

    /**
     * **参数解释**： 扩展时间。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return extendTimes
     */
    public Long getExtendTimes() {
        return extendTimes;
    }

    public void setExtendTimes(Long extendTimes) {
        this.extendTimes = extendTimes;
    }

    public InstanceDetail withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * **参数解释**： 是否开启IPv6。[华为云Stack不支持此参数。](tag:hcs,hcs_oemout) **约束限制**： 不涉及。 **取值范围**： - true：开启。 - false：未开启。 **默认取值**： 不涉及。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public InstanceDetail withSupportFeatures(String supportFeatures) {
        this.supportFeatures = supportFeatures;
        return this;
    }

    /**
     * **参数解释**： 实例支持的特性功能。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return supportFeatures
     */
    public String getSupportFeatures() {
        return supportFeatures;
    }

    public void setSupportFeatures(String supportFeatures) {
        this.supportFeatures = supportFeatures;
    }

    public InstanceDetail withDiskEncrypted(Boolean diskEncrypted) {
        this.diskEncrypted = diskEncrypted;
        return this;
    }

    /**
     * **参数解释**： 是否开启磁盘加密。 **取值范围**： - true：开启。 - false：不开启。
     * @return diskEncrypted
     */
    public Boolean getDiskEncrypted() {
        return diskEncrypted;
    }

    public void setDiskEncrypted(Boolean diskEncrypted) {
        this.diskEncrypted = diskEncrypted;
    }

    public InstanceDetail withCesVersion(String cesVersion) {
        this.cesVersion = cesVersion;
        return this;
    }

    /**
     * **参数解释**： 云监控版本。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return cesVersion
     */
    public String getCesVersion() {
        return cesVersion;
    }

    public void setCesVersion(String cesVersion) {
        this.cesVersion = cesVersion;
    }

    public InstanceDetail withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * **参数解释**： 节点数。（仅RocketMQ 4.8.0版本会显示此字段） **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public InstanceDetail withNewSpecBillingEnable(Boolean newSpecBillingEnable) {
        this.newSpecBillingEnable = newSpecBillingEnable;
        return this;
    }

    /**
     * **参数解释**： 是否启用新规格计费。 **约束限制**： 不涉及。 **取值范围**： - true：开启。 - false：未开启。 **默认取值**： 不涉及。
     * @return newSpecBillingEnable
     */
    public Boolean getNewSpecBillingEnable() {
        return newSpecBillingEnable;
    }

    public void setNewSpecBillingEnable(Boolean newSpecBillingEnable) {
        this.newSpecBillingEnable = newSpecBillingEnable;
    }

    public InstanceDetail withEnableAcl(Boolean enableAcl) {
        this.enableAcl = enableAcl;
        return this;
    }

    /**
     * **参数解释**： 是否开启访问控制列表。 **约束限制**： 不涉及。 **取值范围**： - true：开启。 - false：未开启。 **默认取值**： 不涉及。
     * @return enableAcl
     */
    public Boolean getEnableAcl() {
        return enableAcl;
    }

    public void setEnableAcl(Boolean enableAcl) {
        this.enableAcl = enableAcl;
    }

    public InstanceDetail withBrokerNum(Integer brokerNum) {
        this.brokerNum = brokerNum;
        return this;
    }

    /**
     * **参数解释**： Broker节点数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return brokerNum
     */
    public Integer getBrokerNum() {
        return brokerNum;
    }

    public void setBrokerNum(Integer brokerNum) {
        this.brokerNum = brokerNum;
    }

    public InstanceDetail withDnsEnable(Boolean dnsEnable) {
        this.dnsEnable = dnsEnable;
        return this;
    }

    /**
     * **参数解释**： 实例是否开启域名访问功能。 **约束限制**： 不涉及。 **取值范围**： - true：开启。 - false：未开启。 **默认取值**： 不涉及。
     * @return dnsEnable
     */
    public Boolean getDnsEnable() {
        return dnsEnable;
    }

    public void setDnsEnable(Boolean dnsEnable) {
        this.dnsEnable = dnsEnable;
    }

    public InstanceDetail withNamesrvAddress(String namesrvAddress) {
        this.namesrvAddress = namesrvAddress;
        return this;
    }

    /**
     * **参数解释**： 元数据地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return namesrvAddress
     */
    public String getNamesrvAddress() {
        return namesrvAddress;
    }

    public void setNamesrvAddress(String namesrvAddress) {
        this.namesrvAddress = namesrvAddress;
    }

    public InstanceDetail withNamesrvDomainName(String namesrvDomainName) {
        this.namesrvDomainName = namesrvDomainName;
        return this;
    }

    /**
     * **参数解释**： 元数据域名。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return namesrvDomainName
     */
    public String getNamesrvDomainName() {
        return namesrvDomainName;
    }

    public void setNamesrvDomainName(String namesrvDomainName) {
        this.namesrvDomainName = namesrvDomainName;
    }

    public InstanceDetail withBrokerAddress(String brokerAddress) {
        this.brokerAddress = brokerAddress;
        return this;
    }

    /**
     * **参数解释**： 业务数据地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return brokerAddress
     */
    public String getBrokerAddress() {
        return brokerAddress;
    }

    public void setBrokerAddress(String brokerAddress) {
        this.brokerAddress = brokerAddress;
    }

    public InstanceDetail withPublicNamesrvAddress(String publicNamesrvAddress) {
        this.publicNamesrvAddress = publicNamesrvAddress;
        return this;
    }

    /**
     * **参数解释**： 公网元数据地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return publicNamesrvAddress
     */
    public String getPublicNamesrvAddress() {
        return publicNamesrvAddress;
    }

    public void setPublicNamesrvAddress(String publicNamesrvAddress) {
        this.publicNamesrvAddress = publicNamesrvAddress;
    }

    public InstanceDetail withPublicNamesrvDomainName(String publicNamesrvDomainName) {
        this.publicNamesrvDomainName = publicNamesrvDomainName;
        return this;
    }

    /**
     * **参数解释**： 公网元数据域名。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return publicNamesrvDomainName
     */
    public String getPublicNamesrvDomainName() {
        return publicNamesrvDomainName;
    }

    public void setPublicNamesrvDomainName(String publicNamesrvDomainName) {
        this.publicNamesrvDomainName = publicNamesrvDomainName;
    }

    public InstanceDetail withPublicBrokerAddress(String publicBrokerAddress) {
        this.publicBrokerAddress = publicBrokerAddress;
        return this;
    }

    /**
     * **参数解释**： 公网业务数据地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return publicBrokerAddress
     */
    public String getPublicBrokerAddress() {
        return publicBrokerAddress;
    }

    public void setPublicBrokerAddress(String publicBrokerAddress) {
        this.publicBrokerAddress = publicBrokerAddress;
    }

    public InstanceDetail withGrpcAddress(String grpcAddress) {
        this.grpcAddress = grpcAddress;
        return this;
    }

    /**
     * **参数解释**： grpc连接地址（仅RocketMQ 5.x版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return grpcAddress
     */
    public String getGrpcAddress() {
        return grpcAddress;
    }

    public void setGrpcAddress(String grpcAddress) {
        this.grpcAddress = grpcAddress;
    }

    public InstanceDetail withGrpcDomainName(String grpcDomainName) {
        this.grpcDomainName = grpcDomainName;
        return this;
    }

    /**
     * **参数解释**： grpc连接域名（仅RocketMQ 5.x版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return grpcDomainName
     */
    public String getGrpcDomainName() {
        return grpcDomainName;
    }

    public void setGrpcDomainName(String grpcDomainName) {
        this.grpcDomainName = grpcDomainName;
    }

    public InstanceDetail withPublicGrpcAddress(String publicGrpcAddress) {
        this.publicGrpcAddress = publicGrpcAddress;
        return this;
    }

    /**
     * **参数解释**： 公网grpc连接地址（仅RocketMQ 5.x版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return publicGrpcAddress
     */
    public String getPublicGrpcAddress() {
        return publicGrpcAddress;
    }

    public void setPublicGrpcAddress(String publicGrpcAddress) {
        this.publicGrpcAddress = publicGrpcAddress;
    }

    public InstanceDetail withPublicGrpcDomainName(String publicGrpcDomainName) {
        this.publicGrpcDomainName = publicGrpcDomainName;
        return this;
    }

    /**
     * **参数解释**： 公网grpc连接域名（仅RocketMQ 5.x版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return publicGrpcDomainName
     */
    public String getPublicGrpcDomainName() {
        return publicGrpcDomainName;
    }

    public void setPublicGrpcDomainName(String publicGrpcDomainName) {
        this.publicGrpcDomainName = publicGrpcDomainName;
    }

    public InstanceDetail withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public InstanceDetail withTags(List<TagEntity> tags) {
        this.tags = tags;
        return this;
    }

    public InstanceDetail addTagsItem(TagEntity tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public InstanceDetail withTags(Consumer<List<TagEntity>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**： 标签列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return tags
     */
    public List<TagEntity> getTags() {
        return tags;
    }

    public void setTags(List<TagEntity> tags) {
        this.tags = tags;
    }

    public InstanceDetail withTotalStorageSpace(Integer totalStorageSpace) {
        this.totalStorageSpace = totalStorageSpace;
        return this;
    }

    /**
     * **参数解释**： 总存储空间。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return totalStorageSpace
     */
    public Integer getTotalStorageSpace() {
        return totalStorageSpace;
    }

    public void setTotalStorageSpace(Integer totalStorageSpace) {
        this.totalStorageSpace = totalStorageSpace;
    }

    public InstanceDetail withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * **参数解释**： 资源规格。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public InstanceDetail withProducePortion(Integer producePortion) {
        this.producePortion = producePortion;
        return this;
    }

    /**
     * **参数解释**： 生产TPS占比。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return producePortion
     */
    public Integer getProducePortion() {
        return producePortion;
    }

    public void setProducePortion(Integer producePortion) {
        this.producePortion = producePortion;
    }

    public InstanceDetail withConsumePortion(Integer consumePortion) {
        this.consumePortion = consumePortion;
        return this;
    }

    /**
     * **参数解释**： 消费TPS占比。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return consumePortion
     */
    public Integer getConsumePortion() {
        return consumePortion;
    }

    public void setConsumePortion(Integer consumePortion) {
        this.consumePortion = consumePortion;
    }

    public InstanceDetail withDrEnable(Boolean drEnable) {
        this.drEnable = drEnable;
        return this;
    }

    /**
     * **参数解释**： 是否为容灾实例。 **约束限制**： 不涉及。 **取值范围**： - true：容灾实例。 - false：非容灾实例。 **默认取值**： 不涉及。
     * @return drEnable
     */
    public Boolean getDrEnable() {
        return drEnable;
    }

    public void setDrEnable(Boolean drEnable) {
        this.drEnable = drEnable;
    }

    public InstanceDetail withQuotaAddress(String quotaAddress) {
        this.quotaAddress = quotaAddress;
        return this;
    }

    /**
     * **参数解释**： 流控地址。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return quotaAddress
     */
    public String getQuotaAddress() {
        return quotaAddress;
    }

    public void setQuotaAddress(String quotaAddress) {
        this.quotaAddress = quotaAddress;
    }

    public InstanceDetail withMaxMsgProcessTps(Integer maxMsgProcessTps) {
        this.maxMsgProcessTps = maxMsgProcessTps;
        return this;
    }

    /**
     * **参数解释**： 最大消息TPS。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return maxMsgProcessTps
     */
    public Integer getMaxMsgProcessTps() {
        return maxMsgProcessTps;
    }

    public void setMaxMsgProcessTps(Integer maxMsgProcessTps) {
        this.maxMsgProcessTps = maxMsgProcessTps;
    }

    public InstanceDetail withConfigSslNeedRestartProcess(Boolean configSslNeedRestartProcess) {
        this.configSslNeedRestartProcess = configSslNeedRestartProcess;
        return this;
    }

    /**
     * **参数解释**： 配置SSL是否需要重启。 **约束限制**： 不涉及。 **取值范围**： - true：需要重启。 - false：不需要重启。 **默认取值**： 不涉及。
     * @return configSslNeedRestartProcess
     */
    public Boolean getConfigSslNeedRestartProcess() {
        return configSslNeedRestartProcess;
    }

    public void setConfigSslNeedRestartProcess(Boolean configSslNeedRestartProcess) {
        this.configSslNeedRestartProcess = configSslNeedRestartProcess;
    }

    public InstanceDetail withTlsMode(String tlsMode) {
        this.tlsMode = tlsMode;
        return this;
    }

    /**
     * **参数解释**： 实例使用的安全协议。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return tlsMode
     */
    public String getTlsMode() {
        return tlsMode;
    }

    public void setTlsMode(String tlsMode) {
        this.tlsMode = tlsMode;
    }

    public InstanceDetail withEnableElasticTps(Boolean enableElasticTps) {
        this.enableElasticTps = enableElasticTps;
        return this;
    }

    /**
     * **参数解释**： 弹性TPS开关状态。 **约束限制**： 不涉及。 **取值范围**： - true：开启弹性TPS。 - false：不开启弹性TPS。 **默认取值**： 不涉及。
     * @return enableElasticTps
     */
    public Boolean getEnableElasticTps() {
        return enableElasticTps;
    }

    public void setEnableElasticTps(Boolean enableElasticTps) {
        this.enableElasticTps = enableElasticTps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDetail that = (InstanceDetail) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.engine, that.engine)
            && Objects.equals(this.status, that.status) && Objects.equals(this.description, that.description)
            && Objects.equals(this.type, that.type) && Objects.equals(this.specification, that.specification)
            && Objects.equals(this.engineVersion, that.engineVersion)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.archType, that.archType)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.vpcName, that.vpcName) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.securityGroupName, that.securityGroupName)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.subnetCidr, that.subnetCidr)
            && Objects.equals(this.availableZones, that.availableZones)
            && Objects.equals(this.availableZoneNames, that.availableZoneNames)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.maintainBegin, that.maintainBegin)
            && Objects.equals(this.maintainEnd, that.maintainEnd)
            && Objects.equals(this.enableLogCollection, that.enableLogCollection)
            && Objects.equals(this.storageSpace, that.storageSpace)
            && Objects.equals(this.usedStorageSpace, that.usedStorageSpace)
            && Objects.equals(this.enablePublicip, that.enablePublicip)
            && Objects.equals(this.publicipId, that.publicipId)
            && Objects.equals(this.publicipAddress, that.publicipAddress)
            && Objects.equals(this.sslEnable, that.sslEnable) && Objects.equals(this.crossVpcInfo, that.crossVpcInfo)
            && Objects.equals(this.storageResourceId, that.storageResourceId)
            && Objects.equals(this.storageSpecCode, that.storageSpecCode)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.storageType, that.storageType)
            && Objects.equals(this.extendTimes, that.extendTimes) && Objects.equals(this.ipv6Enable, that.ipv6Enable)
            && Objects.equals(this.supportFeatures, that.supportFeatures)
            && Objects.equals(this.diskEncrypted, that.diskEncrypted)
            && Objects.equals(this.cesVersion, that.cesVersion) && Objects.equals(this.nodeNum, that.nodeNum)
            && Objects.equals(this.newSpecBillingEnable, that.newSpecBillingEnable)
            && Objects.equals(this.enableAcl, that.enableAcl) && Objects.equals(this.brokerNum, that.brokerNum)
            && Objects.equals(this.dnsEnable, that.dnsEnable)
            && Objects.equals(this.namesrvAddress, that.namesrvAddress)
            && Objects.equals(this.namesrvDomainName, that.namesrvDomainName)
            && Objects.equals(this.brokerAddress, that.brokerAddress)
            && Objects.equals(this.publicNamesrvAddress, that.publicNamesrvAddress)
            && Objects.equals(this.publicNamesrvDomainName, that.publicNamesrvDomainName)
            && Objects.equals(this.publicBrokerAddress, that.publicBrokerAddress)
            && Objects.equals(this.grpcAddress, that.grpcAddress)
            && Objects.equals(this.grpcDomainName, that.grpcDomainName)
            && Objects.equals(this.publicGrpcAddress, that.publicGrpcAddress)
            && Objects.equals(this.publicGrpcDomainName, that.publicGrpcDomainName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.totalStorageSpace, that.totalStorageSpace)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.producePortion, that.producePortion)
            && Objects.equals(this.consumePortion, that.consumePortion) && Objects.equals(this.drEnable, that.drEnable)
            && Objects.equals(this.quotaAddress, that.quotaAddress)
            && Objects.equals(this.maxMsgProcessTps, that.maxMsgProcessTps)
            && Objects.equals(this.configSslNeedRestartProcess, that.configSslNeedRestartProcess)
            && Objects.equals(this.tlsMode, that.tlsMode)
            && Objects.equals(this.enableElasticTps, that.enableElasticTps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            engine,
            status,
            description,
            type,
            specification,
            engineVersion,
            instanceId,
            archType,
            chargingMode,
            vpcId,
            vpcName,
            createdAt,
            productId,
            securityGroupId,
            securityGroupName,
            subnetId,
            subnetCidr,
            availableZones,
            availableZoneNames,
            userId,
            userName,
            maintainBegin,
            maintainEnd,
            enableLogCollection,
            storageSpace,
            usedStorageSpace,
            enablePublicip,
            publicipId,
            publicipAddress,
            sslEnable,
            crossVpcInfo,
            storageResourceId,
            storageSpecCode,
            serviceType,
            storageType,
            extendTimes,
            ipv6Enable,
            supportFeatures,
            diskEncrypted,
            cesVersion,
            nodeNum,
            newSpecBillingEnable,
            enableAcl,
            brokerNum,
            dnsEnable,
            namesrvAddress,
            namesrvDomainName,
            brokerAddress,
            publicNamesrvAddress,
            publicNamesrvDomainName,
            publicBrokerAddress,
            grpcAddress,
            grpcDomainName,
            publicGrpcAddress,
            publicGrpcDomainName,
            enterpriseProjectId,
            tags,
            totalStorageSpace,
            resourceSpecCode,
            producePortion,
            consumePortion,
            drEnable,
            quotaAddress,
            maxMsgProcessTps,
            configSslNeedRestartProcess,
            tlsMode,
            enableElasticTps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    archType: ").append(toIndentedString(archType)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    subnetCidr: ").append(toIndentedString(subnetCidr)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    availableZoneNames: ").append(toIndentedString(availableZoneNames)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    enableLogCollection: ").append(toIndentedString(enableLogCollection)).append("\n");
        sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
        sb.append("    usedStorageSpace: ").append(toIndentedString(usedStorageSpace)).append("\n");
        sb.append("    enablePublicip: ").append(toIndentedString(enablePublicip)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    publicipAddress: ").append(toIndentedString(publicipAddress)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
        sb.append("    crossVpcInfo: ").append(toIndentedString(crossVpcInfo)).append("\n");
        sb.append("    storageResourceId: ").append(toIndentedString(storageResourceId)).append("\n");
        sb.append("    storageSpecCode: ").append(toIndentedString(storageSpecCode)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    extendTimes: ").append(toIndentedString(extendTimes)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    supportFeatures: ").append(toIndentedString(supportFeatures)).append("\n");
        sb.append("    diskEncrypted: ").append(toIndentedString(diskEncrypted)).append("\n");
        sb.append("    cesVersion: ").append(toIndentedString(cesVersion)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    newSpecBillingEnable: ").append(toIndentedString(newSpecBillingEnable)).append("\n");
        sb.append("    enableAcl: ").append(toIndentedString(enableAcl)).append("\n");
        sb.append("    brokerNum: ").append(toIndentedString(brokerNum)).append("\n");
        sb.append("    dnsEnable: ").append(toIndentedString(dnsEnable)).append("\n");
        sb.append("    namesrvAddress: ").append(toIndentedString(namesrvAddress)).append("\n");
        sb.append("    namesrvDomainName: ").append(toIndentedString(namesrvDomainName)).append("\n");
        sb.append("    brokerAddress: ").append(toIndentedString(brokerAddress)).append("\n");
        sb.append("    publicNamesrvAddress: ").append(toIndentedString(publicNamesrvAddress)).append("\n");
        sb.append("    publicNamesrvDomainName: ").append(toIndentedString(publicNamesrvDomainName)).append("\n");
        sb.append("    publicBrokerAddress: ").append(toIndentedString(publicBrokerAddress)).append("\n");
        sb.append("    grpcAddress: ").append(toIndentedString(grpcAddress)).append("\n");
        sb.append("    grpcDomainName: ").append(toIndentedString(grpcDomainName)).append("\n");
        sb.append("    publicGrpcAddress: ").append(toIndentedString(publicGrpcAddress)).append("\n");
        sb.append("    publicGrpcDomainName: ").append(toIndentedString(publicGrpcDomainName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    totalStorageSpace: ").append(toIndentedString(totalStorageSpace)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    producePortion: ").append(toIndentedString(producePortion)).append("\n");
        sb.append("    consumePortion: ").append(toIndentedString(consumePortion)).append("\n");
        sb.append("    drEnable: ").append(toIndentedString(drEnable)).append("\n");
        sb.append("    quotaAddress: ").append(toIndentedString(quotaAddress)).append("\n");
        sb.append("    maxMsgProcessTps: ").append(toIndentedString(maxMsgProcessTps)).append("\n");
        sb.append("    configSslNeedRestartProcess: ")
            .append(toIndentedString(configSslNeedRestartProcess))
            .append("\n");
        sb.append("    tlsMode: ").append(toIndentedString(tlsMode)).append("\n");
        sb.append("    enableElasticTps: ").append(toIndentedString(enableElasticTps)).append("\n");
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
