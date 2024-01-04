package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateClusterReqV2
 */
public class CreateClusterReqV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_dec_project")

    private Boolean isDecProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_version")

    private String clusterVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private ChargeInfo chargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_name")

    private String vpcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_name")

    private String subnetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components")

    private String components;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_datasources")

    private List<ClusterDataConnectorMap> externalDatasources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups_id")

    private String securityGroupsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_create_default_security_group")

    private Boolean autoCreateDefaultSecurityGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "safe_mode")

    private String safeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_admin_password")

    private String managerAdminPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_mode")

    private String loginMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_root_password")

    private String nodeRootPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_keypair_name")

    private String nodeKeypairName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_address")

    private String eipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_id")

    private String eipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mrs_ecs_default_agency")

    private String mrsEcsDefaultAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    /**
     * 集群创建失败时，是否收集失败日志。 默认设置为1，此时将创建OBS桶仅用于MRS集群创建失败时的日志收集。 枚举值： - 0：不收集 - 1：收集
     */
    public static final class LogCollectionEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final LogCollectionEnum NUMBER_0 = new LogCollectionEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final LogCollectionEnum NUMBER_1 = new LogCollectionEnum(1);

        private static final Map<Integer, LogCollectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, LogCollectionEnum> createStaticFields() {
            Map<Integer, LogCollectionEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        LogCollectionEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LogCollectionEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogCollectionEnum(value));
        }

        public static LogCollectionEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogCollectionEnum) {
                return this.value.equals(((LogCollectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_collection")

    private LogCollectionEnum logCollection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_groups")

    private List<NodeGroupV2> nodeGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bootstrap_scripts")

    private List<BootstrapScript> bootstrapScripts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_jobs")

    private List<AddJobsReqV11> addJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_uri")

    private String logUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_configs")

    private List<ComponentConfig> componentConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_notify")

    private SmnNotify smnNotify;

    public CreateClusterReqV2 withIsDecProject(Boolean isDecProject) {
        this.isDecProject = isDecProject;
        return this;
    }

    /**
     * 说明是否为专属云的资源，默认为false。
     * @return isDecProject
     */
    public Boolean getIsDecProject() {
        return isDecProject;
    }

    public void setIsDecProject(Boolean isDecProject) {
        this.isDecProject = isDecProject;
    }

    public CreateClusterReqV2 withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * 集群版本。例如：MRS 3.1.0。
     * @return clusterVersion
     */
    public String getClusterVersion() {
        return clusterVersion;
    }

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    public CreateClusterReqV2 withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称，不允许相同。  只能由字母、数字、中划线和下划线组成，并且长度为1～64个字符。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CreateClusterReqV2 withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 集群类型，取值范围： - ANALYSIS：分析集群 - STREAMING：流式集群 - MIXED：混合集群 - CUSTOM：自定义集群，仅MRS 3.x版本支持。
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public CreateClusterReqV2 withChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public CreateClusterReqV2 withChargeInfo(Consumer<ChargeInfo> chargeInfoSetter) {
        if (this.chargeInfo == null) {
            this.chargeInfo = new ChargeInfo();
            chargeInfoSetter.accept(this.chargeInfo);
        }

        return this;
    }

    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public ChargeInfo getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    public CreateClusterReqV2 withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 集群所在区域信息，请参见[终端节点](https://support.huaweicloud.com/api-mrs/mrs_02_0003.html)。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreateClusterReqV2 withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * 子网所在VPC名称。 通过VPC管理控制台获取名称： 1) 登录VPC管理控制台。 2) 单击“虚拟私有云”，从左侧列表选择虚拟私有云。 在“虚拟私有云”页面的列表中即可获取VPC名称。
     * @return vpcName
     */
    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public CreateClusterReqV2 withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网ID。通过VPC管理控制台获取子网ID： 1) 登录VPC管理控制台。 2) 单击“虚拟私有云”，从左侧列表选择虚拟私有云。 3) 单击对应虚拟私有云所在行的“子网个数”查看子网。 4) 单击对应子网名称，获取“网络ID”。 “subnet_id”和“subnet_name”必须至少填写一个，当这两个参数同时配置但是不匹配同一个子网时，集群会创建失败，请仔细填写参数。推荐使用“subnet_id”。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateClusterReqV2 withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * 子网名称。 通过VPC管理控制台获取子网名称： 1) 登录管理控制台。 2) 单击“虚拟私有云”，从左侧列表选择虚拟私有云。 3) 单击对应虚拟私有云所在行的“子网个数”查看子网，获取子网名称。 “subnet_id”和“subnet_name”必须至少填写一个，当这两个参数同时配置但是不匹配同一个子网时，集群会创建失败，请仔细填写参数。当仅填写“subnet_name”一个参数且VPC下存在同名子网时，创建集群时以VPC平台第一个名称的子网为准。推荐使用“subnet_id”。
     * @return subnetName
     */
    public String getSubnetName() {
        return subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public CreateClusterReqV2 withComponents(String components) {
        this.components = components;
        return this;
    }

    /**
     * 组件名称列表，用逗号分隔。支持的组件请参见[获取MRS集群信息](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)页面的“MRS服务支持的组件”内容。
     * @return components
     */
    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public CreateClusterReqV2 withExternalDatasources(List<ClusterDataConnectorMap> externalDatasources) {
        this.externalDatasources = externalDatasources;
        return this;
    }

    public CreateClusterReqV2 addExternalDatasourcesItem(ClusterDataConnectorMap externalDatasourcesItem) {
        if (this.externalDatasources == null) {
            this.externalDatasources = new ArrayList<>();
        }
        this.externalDatasources.add(externalDatasourcesItem);
        return this;
    }

    public CreateClusterReqV2 withExternalDatasources(
        Consumer<List<ClusterDataConnectorMap>> externalDatasourcesSetter) {
        if (this.externalDatasources == null) {
            this.externalDatasources = new ArrayList<>();
        }
        externalDatasourcesSetter.accept(this.externalDatasources);
        return this;
    }

    /**
     * 部署Hive和Ranger等组件时，可以关联数据连接，将元数据存储于关联的数据库
     * @return externalDatasources
     */
    public List<ClusterDataConnectorMap> getExternalDatasources() {
        return externalDatasources;
    }

    public void setExternalDatasources(List<ClusterDataConnectorMap> externalDatasources) {
        this.externalDatasources = externalDatasources;
    }

    public CreateClusterReqV2 withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用分区名称，不支持多AZ集群。 可用分区信息请参见[终端节点](https://support.huaweicloud.com/api-mrs/mrs_02_0003.html)。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateClusterReqV2 withSecurityGroupsId(String securityGroupsId) {
        this.securityGroupsId = securityGroupsId;
        return this;
    }

    /**
     * 集群安全组的ID。 - 当该ID为空时MRS后台会自动创建安全组，自动创建的安全组名称以mrs_{cluster_name}开头。 - 当该ID不为空时，表示使用固定安全组来创建集群，传入的ID必须是当前租户中包含的安全组ID，且该安全组中需要包含一条支持全部协议、全部端口、源地址为指定的管理面节点IP的入方向规则。 - 支持多个安全组ID，以逗号分隔。
     * @return securityGroupsId
     */
    public String getSecurityGroupsId() {
        return securityGroupsId;
    }

    public void setSecurityGroupsId(String securityGroupsId) {
        this.securityGroupsId = securityGroupsId;
    }

    public CreateClusterReqV2 withAutoCreateDefaultSecurityGroup(Boolean autoCreateDefaultSecurityGroup) {
        this.autoCreateDefaultSecurityGroup = autoCreateDefaultSecurityGroup;
        return this;
    }

    /**
     * 是否要创建MRS集群默认安全组，默认为false。 当指定该参数为true，则无论“security_groups_id”参数是否指定，都会为集群创建默认安全组。
     * @return autoCreateDefaultSecurityGroup
     */
    public Boolean getAutoCreateDefaultSecurityGroup() {
        return autoCreateDefaultSecurityGroup;
    }

    public void setAutoCreateDefaultSecurityGroup(Boolean autoCreateDefaultSecurityGroup) {
        this.autoCreateDefaultSecurityGroup = autoCreateDefaultSecurityGroup;
    }

    public CreateClusterReqV2 withSafeMode(String safeMode) {
        this.safeMode = safeMode;
        return this;
    }

    /**
     * MRS集群运行模式。 - SIMPLE：普通集群，表示Kerberos认证关闭，用户可使用集群提供的所有功能。 - KERBEROS：安全集群，表示Kerberos认证开启，普通用户无权限使用MRS集群的“文件管理”和“作业管理”功能，并且无法查看Hadoop、Spark的作业记录以及集群资源使用情况。如果需要使用集群更多功能，需要找Manager的管理员分配权限。
     * @return safeMode
     */
    public String getSafeMode() {
        return safeMode;
    }

    public void setSafeMode(String safeMode) {
        this.safeMode = safeMode;
    }

    public CreateClusterReqV2 withManagerAdminPassword(String managerAdminPassword) {
        this.managerAdminPassword = managerAdminPassword;
        return this;
    }

    /**
     * 配置Manager管理员用户的密码。 - 密码长度应在8～26个字符之间。 - 至少包含四种字符组合，如大写字母，小写字母，数字，特殊字符（!@$%^-_=+[{}]:,./?），但不能包含空格。 - 不能与用户名或者倒序用户名相同。
     * @return managerAdminPassword
     */
    public String getManagerAdminPassword() {
        return managerAdminPassword;
    }

    public void setManagerAdminPassword(String managerAdminPassword) {
        this.managerAdminPassword = managerAdminPassword;
    }

    public CreateClusterReqV2 withLoginMode(String loginMode) {
        this.loginMode = loginMode;
        return this;
    }

    /**
     * 节点登录方式。 - PASSWORD：密码登录，选择此项时，node_root_password不能为空。 - KEYPAIR：密钥对登录，选择此项时，node_keypair_name不能为空。
     * @return loginMode
     */
    public String getLoginMode() {
        return loginMode;
    }

    public void setLoginMode(String loginMode) {
        this.loginMode = loginMode;
    }

    public CreateClusterReqV2 withNodeRootPassword(String nodeRootPassword) {
        this.nodeRootPassword = nodeRootPassword;
        return this;
    }

    /**
     * 配置访问集群节点的root密码。 密码设置约束如下： - 字符串类型，可输入的字符串长度为8-26。 - 至少包含四种字符组合，如大写字母，小写字母，数字，特殊字符（!@$%^-_=+[{}]:,./?），但不能包含空格。 - 不能与用户名或者倒序用户名相同。
     * @return nodeRootPassword
     */
    public String getNodeRootPassword() {
        return nodeRootPassword;
    }

    public void setNodeRootPassword(String nodeRootPassword) {
        this.nodeRootPassword = nodeRootPassword;
    }

    public CreateClusterReqV2 withNodeKeypairName(String nodeKeypairName) {
        this.nodeKeypairName = nodeKeypairName;
        return this;
    }

    /**
     * 密钥对名称。用户可以使用密钥对方式登录集群节点。
     * @return nodeKeypairName
     */
    public String getNodeKeypairName() {
        return nodeKeypairName;
    }

    public void setNodeKeypairName(String nodeKeypairName) {
        this.nodeKeypairName = nodeKeypairName;
    }

    public CreateClusterReqV2 withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。 创建集群时，给集群绑定企业项目ID。 默认设置为0，表示为default企业项目。 获取方式请参见《企业管理API参考》的“查询企业项目列表”响应消息表“enterprise_project字段数据结构说明”的“id”。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateClusterReqV2 withEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }

    /**
     * 与MRS集群绑定的弹性公网IP，可实现使用弹性公网IP访问Manager的目的。该弹性公网IP必须已经创建且与集群在同一区域。
     * @return eipAddress
     */
    public String getEipAddress() {
        return eipAddress;
    }

    public void setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
    }

    public CreateClusterReqV2 withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    /**
     * 当“eip_address”配置时，该参数必须配置，用于表示绑定的弹性公网IP的ID。可通过在VPC服务的“网络控制台 > 弹性公网IP和带宽 > 弹性公网IP”页面单击待绑定的弹性公网IP，在基本信息中获取“ID”。
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public CreateClusterReqV2 withMrsEcsDefaultAgency(String mrsEcsDefaultAgency) {
        this.mrsEcsDefaultAgency = mrsEcsDefaultAgency;
        return this;
    }

    /**
     * 集群节点默认绑定的委托名称，固定为MRS_ECS_DEFAULT_AGENCY。 通过绑定委托，您可以将部分资源共享给ECS或BMS云服务来管理，例如通过配置ECS委托可自动获取AK/SK访问OBS。 MRS_ECS_DEFAULT_AGENCY委托拥有对象存储服务的OBS OperateAccess权限和在集群所在区域拥有CES FullAccess（对开启细粒度策略的用户）、CES Administrator和KMS Administrator权限。
     * @return mrsEcsDefaultAgency
     */
    public String getMrsEcsDefaultAgency() {
        return mrsEcsDefaultAgency;
    }

    public void setMrsEcsDefaultAgency(String mrsEcsDefaultAgency) {
        this.mrsEcsDefaultAgency = mrsEcsDefaultAgency;
    }

    public CreateClusterReqV2 withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 当集群类型为CUSTOM时，用于指定节点部署所使用的模板。 - mgmt_control_combined_v2：管控合设模板，管理角色和控制角色共同部署在Master节点中，数据实例合设在同一节点组。该部署方式适用于100个以下的节点，可以减少成本。 - mgmt_control_separated_v2：管控分设模板，管理角色和控制角色分别部署在不同的Master节点中，数据实例合设在同一节点组。该部署方式适用于100-500个节点，在高并发负载情况下表现更好。 - mgmt_control_data_separated_v2：数据分设模板，管理角色和控制角色分别部署在不同的Master节点中，数据实例分设在不同节点组。该部署方式适用于500个以上的节点，可以将各组件进一步分开部署，适用于更大的集群规模。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public CreateClusterReqV2 withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateClusterReqV2 addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateClusterReqV2 withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 集群的标签信息。 同一个集群最多能使用10个tag，tag的名称（key）不能重复。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CreateClusterReqV2 withLogCollection(LogCollectionEnum logCollection) {
        this.logCollection = logCollection;
        return this;
    }

    /**
     * 集群创建失败时，是否收集失败日志。 默认设置为1，此时将创建OBS桶仅用于MRS集群创建失败时的日志收集。 枚举值： - 0：不收集 - 1：收集
     * @return logCollection
     */
    public LogCollectionEnum getLogCollection() {
        return logCollection;
    }

    public void setLogCollection(LogCollectionEnum logCollection) {
        this.logCollection = logCollection;
    }

    public CreateClusterReqV2 withNodeGroups(List<NodeGroupV2> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }

    public CreateClusterReqV2 addNodeGroupsItem(NodeGroupV2 nodeGroupsItem) {
        if (this.nodeGroups == null) {
            this.nodeGroups = new ArrayList<>();
        }
        this.nodeGroups.add(nodeGroupsItem);
        return this;
    }

    public CreateClusterReqV2 withNodeGroups(Consumer<List<NodeGroupV2>> nodeGroupsSetter) {
        if (this.nodeGroups == null) {
            this.nodeGroups = new ArrayList<>();
        }
        nodeGroupsSetter.accept(this.nodeGroups);
        return this;
    }

    /**
     * 组成集群的节点组信息。
     * @return nodeGroups
     */
    public List<NodeGroupV2> getNodeGroups() {
        return nodeGroups;
    }

    public void setNodeGroups(List<NodeGroupV2> nodeGroups) {
        this.nodeGroups = nodeGroups;
    }

    public CreateClusterReqV2 withBootstrapScripts(List<BootstrapScript> bootstrapScripts) {
        this.bootstrapScripts = bootstrapScripts;
        return this;
    }

    public CreateClusterReqV2 addBootstrapScriptsItem(BootstrapScript bootstrapScriptsItem) {
        if (this.bootstrapScripts == null) {
            this.bootstrapScripts = new ArrayList<>();
        }
        this.bootstrapScripts.add(bootstrapScriptsItem);
        return this;
    }

    public CreateClusterReqV2 withBootstrapScripts(Consumer<List<BootstrapScript>> bootstrapScriptsSetter) {
        if (this.bootstrapScripts == null) {
            this.bootstrapScripts = new ArrayList<>();
        }
        bootstrapScriptsSetter.accept(this.bootstrapScripts);
        return this;
    }

    /**
     * 配置引导操作脚本信息。
     * @return bootstrapScripts
     */
    public List<BootstrapScript> getBootstrapScripts() {
        return bootstrapScripts;
    }

    public void setBootstrapScripts(List<BootstrapScript> bootstrapScripts) {
        this.bootstrapScripts = bootstrapScripts;
    }

    public CreateClusterReqV2 withAddJobs(List<AddJobsReqV11> addJobs) {
        this.addJobs = addJobs;
        return this;
    }

    public CreateClusterReqV2 addAddJobsItem(AddJobsReqV11 addJobsItem) {
        if (this.addJobs == null) {
            this.addJobs = new ArrayList<>();
        }
        this.addJobs.add(addJobsItem);
        return this;
    }

    public CreateClusterReqV2 withAddJobs(Consumer<List<AddJobsReqV11>> addJobsSetter) {
        if (this.addJobs == null) {
            this.addJobs = new ArrayList<>();
        }
        addJobsSetter.accept(this.addJobs);
        return this;
    }

    /**
     * 创建集群时可同时提交作业，当前仅MRS1.8.7之前版本支持，暂时只支持新增一个作业。建议使用创建集群并提交作业接口RunJobFlow的steps参数
     * @return addJobs
     */
    public List<AddJobsReqV11> getAddJobs() {
        return addJobs;
    }

    public void setAddJobs(List<AddJobsReqV11> addJobs) {
        this.addJobs = addJobs;
    }

    public CreateClusterReqV2 withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }

    /**
     * 集群日志转储至OBS的具体路径。 开启日志转储功能后，日志上传需要对应OBS路径的读写权限， 请配置MRS_ECS_DEFULT_AGENCY默认委托或具有对应OBS路径读写权限的自定义委托。 具体请参见[配置存算分离集群（委托方式）](https://support.huaweicloud.com/usermanual-mrs/mrs_01_0768.html)。 该参数只适用于支持“集群日志转储OBS”特性的集群版本。
     * @return logUri
     */
    public String getLogUri() {
        return logUri;
    }

    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    public CreateClusterReqV2 withComponentConfigs(List<ComponentConfig> componentConfigs) {
        this.componentConfigs = componentConfigs;
        return this;
    }

    public CreateClusterReqV2 addComponentConfigsItem(ComponentConfig componentConfigsItem) {
        if (this.componentConfigs == null) {
            this.componentConfigs = new ArrayList<>();
        }
        this.componentConfigs.add(componentConfigsItem);
        return this;
    }

    public CreateClusterReqV2 withComponentConfigs(Consumer<List<ComponentConfig>> componentConfigsSetter) {
        if (this.componentConfigs == null) {
            this.componentConfigs = new ArrayList<>();
        }
        componentConfigsSetter.accept(this.componentConfigs);
        return this;
    }

    /**
     * 集群组件自定义配置。 该参数只适用于支持“自定义组件配置创建集群”特性的集群版本。
     * @return componentConfigs
     */
    public List<ComponentConfig> getComponentConfigs() {
        return componentConfigs;
    }

    public void setComponentConfigs(List<ComponentConfig> componentConfigs) {
        this.componentConfigs = componentConfigs;
    }

    public CreateClusterReqV2 withSmnNotify(SmnNotify smnNotify) {
        this.smnNotify = smnNotify;
        return this;
    }

    public CreateClusterReqV2 withSmnNotify(Consumer<SmnNotify> smnNotifySetter) {
        if (this.smnNotify == null) {
            this.smnNotify = new SmnNotify();
            smnNotifySetter.accept(this.smnNotify);
        }

        return this;
    }

    /**
     * Get smnNotify
     * @return smnNotify
     */
    public SmnNotify getSmnNotify() {
        return smnNotify;
    }

    public void setSmnNotify(SmnNotify smnNotify) {
        this.smnNotify = smnNotify;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClusterReqV2 that = (CreateClusterReqV2) obj;
        return Objects.equals(this.isDecProject, that.isDecProject)
            && Objects.equals(this.clusterVersion, that.clusterVersion)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.chargeInfo, that.chargeInfo) && Objects.equals(this.region, that.region)
            && Objects.equals(this.vpcName, that.vpcName) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.subnetName, that.subnetName) && Objects.equals(this.components, that.components)
            && Objects.equals(this.externalDatasources, that.externalDatasources)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.securityGroupsId, that.securityGroupsId)
            && Objects.equals(this.autoCreateDefaultSecurityGroup, that.autoCreateDefaultSecurityGroup)
            && Objects.equals(this.safeMode, that.safeMode)
            && Objects.equals(this.managerAdminPassword, that.managerAdminPassword)
            && Objects.equals(this.loginMode, that.loginMode)
            && Objects.equals(this.nodeRootPassword, that.nodeRootPassword)
            && Objects.equals(this.nodeKeypairName, that.nodeKeypairName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.eipAddress, that.eipAddress) && Objects.equals(this.eipId, that.eipId)
            && Objects.equals(this.mrsEcsDefaultAgency, that.mrsEcsDefaultAgency)
            && Objects.equals(this.templateId, that.templateId) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.logCollection, that.logCollection)
            && Objects.equals(this.nodeGroups, that.nodeGroups)
            && Objects.equals(this.bootstrapScripts, that.bootstrapScripts)
            && Objects.equals(this.addJobs, that.addJobs) && Objects.equals(this.logUri, that.logUri)
            && Objects.equals(this.componentConfigs, that.componentConfigs)
            && Objects.equals(this.smnNotify, that.smnNotify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDecProject,
            clusterVersion,
            clusterName,
            clusterType,
            chargeInfo,
            region,
            vpcName,
            subnetId,
            subnetName,
            components,
            externalDatasources,
            availabilityZone,
            securityGroupsId,
            autoCreateDefaultSecurityGroup,
            safeMode,
            managerAdminPassword,
            loginMode,
            nodeRootPassword,
            nodeKeypairName,
            enterpriseProjectId,
            eipAddress,
            eipId,
            mrsEcsDefaultAgency,
            templateId,
            tags,
            logCollection,
            nodeGroups,
            bootstrapScripts,
            addJobs,
            logUri,
            componentConfigs,
            smnNotify);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterReqV2 {\n");
        sb.append("    isDecProject: ").append(toIndentedString(isDecProject)).append("\n");
        sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
        sb.append("    externalDatasources: ").append(toIndentedString(externalDatasources)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    securityGroupsId: ").append(toIndentedString(securityGroupsId)).append("\n");
        sb.append("    autoCreateDefaultSecurityGroup: ")
            .append(toIndentedString(autoCreateDefaultSecurityGroup))
            .append("\n");
        sb.append("    safeMode: ").append(toIndentedString(safeMode)).append("\n");
        sb.append("    managerAdminPassword: ").append(toIndentedString(managerAdminPassword)).append("\n");
        sb.append("    loginMode: ").append(toIndentedString(loginMode)).append("\n");
        sb.append("    nodeRootPassword: ").append(toIndentedString(nodeRootPassword)).append("\n");
        sb.append("    nodeKeypairName: ").append(toIndentedString(nodeKeypairName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
        sb.append("    mrsEcsDefaultAgency: ").append(toIndentedString(mrsEcsDefaultAgency)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    logCollection: ").append(toIndentedString(logCollection)).append("\n");
        sb.append("    nodeGroups: ").append(toIndentedString(nodeGroups)).append("\n");
        sb.append("    bootstrapScripts: ").append(toIndentedString(bootstrapScripts)).append("\n");
        sb.append("    addJobs: ").append(toIndentedString(addJobs)).append("\n");
        sb.append("    logUri: ").append(toIndentedString(logUri)).append("\n");
        sb.append("    componentConfigs: ").append(toIndentedString(componentConfigs)).append("\n");
        sb.append("    smnNotify: ").append(toIndentedString(smnNotify)).append("\n");
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
