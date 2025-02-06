package com.huaweicloud.sdk.cce.v3.model;

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
 * 集群参数定义。
 */
public class ClusterSpec {

    /**
     * 集群类别： - CCE：CCE集群   CCE集群支持虚拟机与裸金属服务器混合、GPU、NPU等异构节点的混合部署，基于高性能网络模型提供全方位、多场景、安全稳定的容器运行环境。 [- Turbo: CCE Turbo集群。   全面基于云原生基础设施构建的云原生2.0的容器引擎服务，具备软硬协同、网络无损、安全可靠、调度智能的优势，为用户提供一站式、高性价比的全新容器服务体验。](tag:hws,hws_hk,dt,hcs,g42,sbc) 
     */
    public static final class CategoryEnum {

        /**
         * Enum CCE for value: "CCE"
         */
        public static final CategoryEnum CCE = new CategoryEnum("CCE");

        /**
         * Enum TURBO for value: "Turbo"
         */
        public static final CategoryEnum TURBO = new CategoryEnum("Turbo");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("CCE", CCE);
            map.put("Turbo", TURBO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    /**
     * 集群Master节点架构：  - VirtualMachine：Master节点为x86架构服务器 [- ARM64: Master节点为鲲鹏（ARM架构）服务器](tag:hws,hws_hk,hcs) 
     */
    public static final class TypeEnum {

        /**
         * Enum VIRTUALMACHINE for value: "VirtualMachine"
         */
        public static final TypeEnum VIRTUALMACHINE = new TypeEnum("VirtualMachine");

        /**
         * Enum ARM64 for value: "ARM64"
         */
        public static final TypeEnum ARM64 = new TypeEnum("ARM64");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("VirtualMachine", VIRTUALMACHINE);
            map.put("ARM64", ARM64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platformVersion")

    private String platformVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customSan")

    private List<String> customSan = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6enable")

    private Boolean ipv6enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostNetwork")

    private HostNetwork hostNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containerNetwork")

    private ContainerNetwork containerNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eniNetwork")

    private EniNetwork eniNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceNetwork")

    private ServiceNetwork serviceNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication")

    private Authentication authentication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billingMode")

    private Integer billingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masters")

    private List<MasterSpec> masters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubernetesSvcIpRange")

    private String kubernetesSvcIpRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterTags")

    private List<ResourceTag> clusterTags = null;

    /**
     * 服务转发模式，支持以下两种实现：  - iptables：社区传统的kube-proxy模式，完全以iptables规则的方式来实现service负载均衡。该方式最主要的问题是在服务多的时候产生太多的iptables规则，非增量式更新会引入一定的时延，大规模情况下有明显的性能问题。 - ipvs：主导开发并在社区获得广泛支持的kube-proxy模式，采用增量式更新，吞吐更高，速度更快，并可以保证service更新期间连接保持不断开，适用于大规模场景。  > 默认使用iptables转发模式。 
     */
    public static final class KubeProxyModeEnum {

        /**
         * Enum IPTABLES for value: "iptables"
         */
        public static final KubeProxyModeEnum IPTABLES = new KubeProxyModeEnum("iptables");

        /**
         * Enum IPVS for value: "ipvs"
         */
        public static final KubeProxyModeEnum IPVS = new KubeProxyModeEnum("ipvs");

        private static final Map<String, KubeProxyModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KubeProxyModeEnum> createStaticFields() {
            Map<String, KubeProxyModeEnum> map = new HashMap<>();
            map.put("iptables", IPTABLES);
            map.put("ipvs", IPVS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KubeProxyModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static KubeProxyModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KubeProxyModeEnum(value));
        }

        public static KubeProxyModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KubeProxyModeEnum) {
                return this.value.equals(((KubeProxyModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubeProxyMode")

    private KubeProxyModeEnum kubeProxyMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az")

    private String az;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private ClusterExtendParam extendParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supportIstio")

    private Boolean supportIstio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableMasterVolumeEncryption")

    private Boolean enableMasterVolumeEncryption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableDistMgt")

    private Boolean enableDistMgt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletionProtection")

    private Boolean deletionProtection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurationsOverride")

    private List<PackageConfiguration> configurationsOverride = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterOps")

    private ClusterOps clusterOps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryptionConfig")

    private EncryptionConfig encryptionConfig;

    public ClusterSpec withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 集群类别： - CCE：CCE集群   CCE集群支持虚拟机与裸金属服务器混合、GPU、NPU等异构节点的混合部署，基于高性能网络模型提供全方位、多场景、安全稳定的容器运行环境。 [- Turbo: CCE Turbo集群。   全面基于云原生基础设施构建的云原生2.0的容器引擎服务，具备软硬协同、网络无损、安全可靠、调度智能的优势，为用户提供一站式、高性价比的全新容器服务体验。](tag:hws,hws_hk,dt,hcs,g42,sbc) 
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public ClusterSpec withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 集群Master节点架构：  - VirtualMachine：Master节点为x86架构服务器 [- ARM64: Master节点为鲲鹏（ARM架构）服务器](tag:hws,hws_hk,hcs) 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ClusterSpec withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 集群规格，当集群为v1.15及以上版本时支持创建后变更，详情请参见[变更集群规格](ResizeCluster.xml)。请按实际业务需求进行选择： - cce.s1.small: 小规模单控制节点CCE集群（最大50节点） - cce.s1.medium: 中等规模单控制节点CCE集群（最大200节点） - cce.s2.small: 小规模多控制节点CCE集群（最大50节点） - cce.s2.medium: 中等规模多控制节点CCE集群（最大200节点） - cce.s2.large: 大规模多控制节点CCE集群（最大1000节点） - cce.s2.xlarge: 超大规模多控制节点CCE集群（最大2000节点）  >    关于规格参数中的字段说明如下： >    - s1：单控制节点的集群，控制节点数为1。单控制节点故障后，集群将不可用，但已运行工作负载不受影响。 >    - s2：多控制节点的集群，即高可用集群，控制节点数为3。当某个控制节点故障时，集群仍然可用。 >    [- dec：表示专属云的CCE集群规格。例如cce.dec.s1.small表示小规模单控制节点的专属云CCE集群（最大50节点）。](tag:hws,hws_hk) >    - small：表示集群支持管理的最大节点规模为50节点。 >    - medium：表示集群支持管理的最大节点规模为200节点。 >    - large：表示集群支持管理的最大节点规模为1000节点。 >    - xlarge：表示集群支持管理的最大节点规模为2000节点。 
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ClusterSpec withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 集群版本，与Kubernetes社区基线版本保持一致，建议选择最新版本。  在CCE控制台支持创建两种最新版本的集群。可登录CCE控制台创建集群，在“版本”处获取到集群版本。 其它集群版本，当前仍可通过api创建，但后续会逐渐下线，具体下线策略请关注CCE官方公告。  >    - 若不配置，默认创建最新版本的集群。 >    - 若指定集群基线版本但是不指定具体r版本，则系统默认选择对应集群版本的最新r版本。建议不指定具体r版本由系统选择最新版本。 [>    - Turbo集群支持1.19及以上版本商用。](tag:hws,hws_hk,dt) [>    - Turbo集群支持1.23及以上版本商用。](tag:hcs,g42,sbc)
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClusterSpec withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * CCE集群平台版本号，表示集群版本(version)下的内部版本。用于跟踪某一集群版本内的迭代，集群版本内唯一，跨集群版本重新计数。不支持用户指定，集群创建时自动选择对应集群版本的最新平台版本。  platformVersion格式为：cce.X.Y - X: 表示内部特性版本。集群版本中特性或者补丁修复，或者OS支持等变更场景。其值从1开始单调递增。 - Y: 表示内部特性版本的补丁版本。仅用于特性版本上线后的软件包更新，不涉及其他修改。其值从0开始单调递增。 
     * @return platformVersion
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public ClusterSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 集群描述，对于集群使用目的的描述，可根据实际情况自定义，默认为空。集群创建成功后可通过接口[更新指定的集群](cce_02_0240.xml)来做出修改，也可在CCE控制台中对应集群的“集群详情”下的“描述”处进行修改。仅支持utf-8编码。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClusterSpec withCustomSan(List<String> customSan) {
        this.customSan = customSan;
        return this;
    }

    public ClusterSpec addCustomSanItem(String customSanItem) {
        if (this.customSan == null) {
            this.customSan = new ArrayList<>();
        }
        this.customSan.add(customSanItem);
        return this;
    }

    public ClusterSpec withCustomSan(Consumer<List<String>> customSanSetter) {
        if (this.customSan == null) {
            this.customSan = new ArrayList<>();
        }
        customSanSetter.accept(this.customSan);
        return this;
    }

    /**
     * 集群的API Server服务端证书中的自定义SAN（Subject Alternative Name）字段，遵从SSL标准X509定义的格式规范。  1. 不允许出现同名重复。 2. 格式符合IP和域名格式。  示例: ``` SAN 1: DNS Name=example.com SAN 2: DNS Name=www.example.com SAN 3: DNS Name=example.net SAN 4: IP Address=93.184.216.34 ```
     * @return customSan
     */
    public List<String> getCustomSan() {
        return customSan;
    }

    public void setCustomSan(List<String> customSan) {
        this.customSan = customSan;
    }

    public ClusterSpec withIpv6enable(Boolean ipv6enable) {
        this.ipv6enable = ipv6enable;
        return this;
    }

    /**
     * 集群是否使用IPv6模式，1.15版本及以上支持。
     * @return ipv6enable
     */
    public Boolean getIpv6enable() {
        return ipv6enable;
    }

    public void setIpv6enable(Boolean ipv6enable) {
        this.ipv6enable = ipv6enable;
    }

    public ClusterSpec withHostNetwork(HostNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    public ClusterSpec withHostNetwork(Consumer<HostNetwork> hostNetworkSetter) {
        if (this.hostNetwork == null) {
            this.hostNetwork = new HostNetwork();
            hostNetworkSetter.accept(this.hostNetwork);
        }

        return this;
    }

    /**
     * Get hostNetwork
     * @return hostNetwork
     */
    public HostNetwork getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(HostNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    public ClusterSpec withContainerNetwork(ContainerNetwork containerNetwork) {
        this.containerNetwork = containerNetwork;
        return this;
    }

    public ClusterSpec withContainerNetwork(Consumer<ContainerNetwork> containerNetworkSetter) {
        if (this.containerNetwork == null) {
            this.containerNetwork = new ContainerNetwork();
            containerNetworkSetter.accept(this.containerNetwork);
        }

        return this;
    }

    /**
     * Get containerNetwork
     * @return containerNetwork
     */
    public ContainerNetwork getContainerNetwork() {
        return containerNetwork;
    }

    public void setContainerNetwork(ContainerNetwork containerNetwork) {
        this.containerNetwork = containerNetwork;
    }

    public ClusterSpec withEniNetwork(EniNetwork eniNetwork) {
        this.eniNetwork = eniNetwork;
        return this;
    }

    public ClusterSpec withEniNetwork(Consumer<EniNetwork> eniNetworkSetter) {
        if (this.eniNetwork == null) {
            this.eniNetwork = new EniNetwork();
            eniNetworkSetter.accept(this.eniNetwork);
        }

        return this;
    }

    /**
     * Get eniNetwork
     * @return eniNetwork
     */
    public EniNetwork getEniNetwork() {
        return eniNetwork;
    }

    public void setEniNetwork(EniNetwork eniNetwork) {
        this.eniNetwork = eniNetwork;
    }

    public ClusterSpec withServiceNetwork(ServiceNetwork serviceNetwork) {
        this.serviceNetwork = serviceNetwork;
        return this;
    }

    public ClusterSpec withServiceNetwork(Consumer<ServiceNetwork> serviceNetworkSetter) {
        if (this.serviceNetwork == null) {
            this.serviceNetwork = new ServiceNetwork();
            serviceNetworkSetter.accept(this.serviceNetwork);
        }

        return this;
    }

    /**
     * Get serviceNetwork
     * @return serviceNetwork
     */
    public ServiceNetwork getServiceNetwork() {
        return serviceNetwork;
    }

    public void setServiceNetwork(ServiceNetwork serviceNetwork) {
        this.serviceNetwork = serviceNetwork;
    }

    public ClusterSpec withAuthentication(Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

    public ClusterSpec withAuthentication(Consumer<Authentication> authenticationSetter) {
        if (this.authentication == null) {
            this.authentication = new Authentication();
            authenticationSetter.accept(this.authentication);
        }

        return this;
    }

    /**
     * Get authentication
     * @return authentication
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public ClusterSpec withBillingMode(Integer billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    /**
     * 集群的计费方式。 - 0: 按需计费 [- 1: 包周期](tag:hws,hws_hk)  默认为“按需计费”。 
     * @return billingMode
     */
    public Integer getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(Integer billingMode) {
        this.billingMode = billingMode;
    }

    public ClusterSpec withMasters(List<MasterSpec> masters) {
        this.masters = masters;
        return this;
    }

    public ClusterSpec addMastersItem(MasterSpec mastersItem) {
        if (this.masters == null) {
            this.masters = new ArrayList<>();
        }
        this.masters.add(mastersItem);
        return this;
    }

    public ClusterSpec withMasters(Consumer<List<MasterSpec>> mastersSetter) {
        if (this.masters == null) {
            this.masters = new ArrayList<>();
        }
        mastersSetter.accept(this.masters);
        return this;
    }

    /**
     * 控制节点的高级配置
     * @return masters
     */
    public List<MasterSpec> getMasters() {
        return masters;
    }

    public void setMasters(List<MasterSpec> masters) {
        this.masters = masters;
    }

    public ClusterSpec withKubernetesSvcIpRange(String kubernetesSvcIpRange) {
        this.kubernetesSvcIpRange = kubernetesSvcIpRange;
        return this;
    }

    /**
     * 服务网段参数，kubernetes clusterIP取值范围，1.11.7版本及以上支持。创建集群时如若未传参，默认为\"10.247.0.0/16\"。该参数废弃中，推荐使用新字段serviceNetwork，包含IPv4服务网段。 
     * @return kubernetesSvcIpRange
     */
    public String getKubernetesSvcIpRange() {
        return kubernetesSvcIpRange;
    }

    public void setKubernetesSvcIpRange(String kubernetesSvcIpRange) {
        this.kubernetesSvcIpRange = kubernetesSvcIpRange;
    }

    public ClusterSpec withClusterTags(List<ResourceTag> clusterTags) {
        this.clusterTags = clusterTags;
        return this;
    }

    public ClusterSpec addClusterTagsItem(ResourceTag clusterTagsItem) {
        if (this.clusterTags == null) {
            this.clusterTags = new ArrayList<>();
        }
        this.clusterTags.add(clusterTagsItem);
        return this;
    }

    public ClusterSpec withClusterTags(Consumer<List<ResourceTag>> clusterTagsSetter) {
        if (this.clusterTags == null) {
            this.clusterTags = new ArrayList<>();
        }
        clusterTagsSetter.accept(this.clusterTags);
        return this;
    }

    /**
     * 集群资源标签
     * @return clusterTags
     */
    public List<ResourceTag> getClusterTags() {
        return clusterTags;
    }

    public void setClusterTags(List<ResourceTag> clusterTags) {
        this.clusterTags = clusterTags;
    }

    public ClusterSpec withKubeProxyMode(KubeProxyModeEnum kubeProxyMode) {
        this.kubeProxyMode = kubeProxyMode;
        return this;
    }

    /**
     * 服务转发模式，支持以下两种实现：  - iptables：社区传统的kube-proxy模式，完全以iptables规则的方式来实现service负载均衡。该方式最主要的问题是在服务多的时候产生太多的iptables规则，非增量式更新会引入一定的时延，大规模情况下有明显的性能问题。 - ipvs：主导开发并在社区获得广泛支持的kube-proxy模式，采用增量式更新，吞吐更高，速度更快，并可以保证service更新期间连接保持不断开，适用于大规模场景。  > 默认使用iptables转发模式。 
     * @return kubeProxyMode
     */
    public KubeProxyModeEnum getKubeProxyMode() {
        return kubeProxyMode;
    }

    public void setKubeProxyMode(KubeProxyModeEnum kubeProxyMode) {
        this.kubeProxyMode = kubeProxyMode;
    }

    public ClusterSpec withAz(String az) {
        this.az = az;
        return this;
    }

    /**
     * 可用区（仅查询返回字段）。  [CCE支持的可用区请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint?CCE)](tag:hws)  [CCE支持的可用区请参考[地区和终端节点](https://developer.huaweicloud.com/intl/zh-cn/endpoint?CCE)](tag:hws_hk) 
     * @return az
     */
    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    public ClusterSpec withExtendParam(ClusterExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public ClusterSpec withExtendParam(Consumer<ClusterExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new ClusterExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public ClusterExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(ClusterExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    public ClusterSpec withSupportIstio(Boolean supportIstio) {
        this.supportIstio = supportIstio;
        return this;
    }

    /**
     * 支持Istio
     * @return supportIstio
     */
    public Boolean getSupportIstio() {
        return supportIstio;
    }

    public void setSupportIstio(Boolean supportIstio) {
        this.supportIstio = supportIstio;
    }

    public ClusterSpec withEnableMasterVolumeEncryption(Boolean enableMasterVolumeEncryption) {
        this.enableMasterVolumeEncryption = enableMasterVolumeEncryption;
        return this;
    }

    /**
     * 集群控制节点系统盘、数据盘加密。默认使用AES_256加密算法。CCE、Turbo集群1.25及以上版本开始支持。集群创建后不支持修改。开启后存在一定的磁盘读写性能损耗。
     * @return enableMasterVolumeEncryption
     */
    public Boolean getEnableMasterVolumeEncryption() {
        return enableMasterVolumeEncryption;
    }

    public void setEnableMasterVolumeEncryption(Boolean enableMasterVolumeEncryption) {
        this.enableMasterVolumeEncryption = enableMasterVolumeEncryption;
    }

    public ClusterSpec withEnableDistMgt(Boolean enableDistMgt) {
        this.enableDistMgt = enableDistMgt;
        return this;
    }

    /**
     * 集群开启对分布式云支持。创建CCE Turbo集群时，可在创建集群过程中，开启对分布式云(cloudpond)支持。
     * @return enableDistMgt
     */
    public Boolean getEnableDistMgt() {
        return enableDistMgt;
    }

    public void setEnableDistMgt(Boolean enableDistMgt) {
        this.enableDistMgt = enableDistMgt;
    }

    public ClusterSpec withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

    /**
     * 集群删除保护，默认为false关闭，如果开启后用户将无法删除该集群。
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return deletionProtection;
    }

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    public ClusterSpec withConfigurationsOverride(List<PackageConfiguration> configurationsOverride) {
        this.configurationsOverride = configurationsOverride;
        return this;
    }

    public ClusterSpec addConfigurationsOverrideItem(PackageConfiguration configurationsOverrideItem) {
        if (this.configurationsOverride == null) {
            this.configurationsOverride = new ArrayList<>();
        }
        this.configurationsOverride.add(configurationsOverrideItem);
        return this;
    }

    public ClusterSpec withConfigurationsOverride(Consumer<List<PackageConfiguration>> configurationsOverrideSetter) {
        if (this.configurationsOverride == null) {
            this.configurationsOverride = new ArrayList<>();
        }
        configurationsOverrideSetter.accept(this.configurationsOverride);
        return this;
    }

    /**
     * 覆盖集群默认组件配置  若指定了不支持的组件或组件不支持的参数，该配置项将被忽略。  当前支持的可配置组件及其参数详见 [[配置管理](https://support.huaweicloud.com/usermanual-cce/cce_10_0213.html)](tag:hws) [[配置管理](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_0213.html)](tag:hws_hk) 
     * @return configurationsOverride
     */
    public List<PackageConfiguration> getConfigurationsOverride() {
        return configurationsOverride;
    }

    public void setConfigurationsOverride(List<PackageConfiguration> configurationsOverride) {
        this.configurationsOverride = configurationsOverride;
    }

    public ClusterSpec withClusterOps(ClusterOps clusterOps) {
        this.clusterOps = clusterOps;
        return this;
    }

    public ClusterSpec withClusterOps(Consumer<ClusterOps> clusterOpsSetter) {
        if (this.clusterOps == null) {
            this.clusterOps = new ClusterOps();
            clusterOpsSetter.accept(this.clusterOps);
        }

        return this;
    }

    /**
     * Get clusterOps
     * @return clusterOps
     */
    public ClusterOps getClusterOps() {
        return clusterOps;
    }

    public void setClusterOps(ClusterOps clusterOps) {
        this.clusterOps = clusterOps;
    }

    public ClusterSpec withEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
        return this;
    }

    public ClusterSpec withEncryptionConfig(Consumer<EncryptionConfig> encryptionConfigSetter) {
        if (this.encryptionConfig == null) {
            this.encryptionConfig = new EncryptionConfig();
            encryptionConfigSetter.accept(this.encryptionConfig);
        }

        return this;
    }

    /**
     * Get encryptionConfig
     * @return encryptionConfig
     */
    public EncryptionConfig getEncryptionConfig() {
        return encryptionConfig;
    }

    public void setEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterSpec that = (ClusterSpec) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.type, that.type)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.version, that.version)
            && Objects.equals(this.platformVersion, that.platformVersion)
            && Objects.equals(this.description, that.description) && Objects.equals(this.customSan, that.customSan)
            && Objects.equals(this.ipv6enable, that.ipv6enable) && Objects.equals(this.hostNetwork, that.hostNetwork)
            && Objects.equals(this.containerNetwork, that.containerNetwork)
            && Objects.equals(this.eniNetwork, that.eniNetwork)
            && Objects.equals(this.serviceNetwork, that.serviceNetwork)
            && Objects.equals(this.authentication, that.authentication)
            && Objects.equals(this.billingMode, that.billingMode) && Objects.equals(this.masters, that.masters)
            && Objects.equals(this.kubernetesSvcIpRange, that.kubernetesSvcIpRange)
            && Objects.equals(this.clusterTags, that.clusterTags)
            && Objects.equals(this.kubeProxyMode, that.kubeProxyMode) && Objects.equals(this.az, that.az)
            && Objects.equals(this.extendParam, that.extendParam)
            && Objects.equals(this.supportIstio, that.supportIstio)
            && Objects.equals(this.enableMasterVolumeEncryption, that.enableMasterVolumeEncryption)
            && Objects.equals(this.enableDistMgt, that.enableDistMgt)
            && Objects.equals(this.deletionProtection, that.deletionProtection)
            && Objects.equals(this.configurationsOverride, that.configurationsOverride)
            && Objects.equals(this.clusterOps, that.clusterOps)
            && Objects.equals(this.encryptionConfig, that.encryptionConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category,
            type,
            flavor,
            version,
            platformVersion,
            description,
            customSan,
            ipv6enable,
            hostNetwork,
            containerNetwork,
            eniNetwork,
            serviceNetwork,
            authentication,
            billingMode,
            masters,
            kubernetesSvcIpRange,
            clusterTags,
            kubeProxyMode,
            az,
            extendParam,
            supportIstio,
            enableMasterVolumeEncryption,
            enableDistMgt,
            deletionProtection,
            configurationsOverride,
            clusterOps,
            encryptionConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterSpec {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    platformVersion: ").append(toIndentedString(platformVersion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    customSan: ").append(toIndentedString(customSan)).append("\n");
        sb.append("    ipv6enable: ").append(toIndentedString(ipv6enable)).append("\n");
        sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
        sb.append("    containerNetwork: ").append(toIndentedString(containerNetwork)).append("\n");
        sb.append("    eniNetwork: ").append(toIndentedString(eniNetwork)).append("\n");
        sb.append("    serviceNetwork: ").append(toIndentedString(serviceNetwork)).append("\n");
        sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    masters: ").append(toIndentedString(masters)).append("\n");
        sb.append("    kubernetesSvcIpRange: ").append(toIndentedString(kubernetesSvcIpRange)).append("\n");
        sb.append("    clusterTags: ").append(toIndentedString(clusterTags)).append("\n");
        sb.append("    kubeProxyMode: ").append(toIndentedString(kubeProxyMode)).append("\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    supportIstio: ").append(toIndentedString(supportIstio)).append("\n");
        sb.append("    enableMasterVolumeEncryption: ")
            .append(toIndentedString(enableMasterVolumeEncryption))
            .append("\n");
        sb.append("    enableDistMgt: ").append(toIndentedString(enableDistMgt)).append("\n");
        sb.append("    deletionProtection: ").append(toIndentedString(deletionProtection)).append("\n");
        sb.append("    configurationsOverride: ").append(toIndentedString(configurationsOverride)).append("\n");
        sb.append("    clusterOps: ").append(toIndentedString(clusterOps)).append("\n");
        sb.append("    encryptionConfig: ").append(toIndentedString(encryptionConfig)).append("\n");
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
