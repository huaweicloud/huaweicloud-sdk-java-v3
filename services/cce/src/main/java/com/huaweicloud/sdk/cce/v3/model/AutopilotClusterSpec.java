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
public class AutopilotClusterSpec {

    /**
     * 集群类别。 
     */
    public static final class CategoryEnum {

        /**
         * Enum TURBO for value: "Turbo"
         */
        public static final CategoryEnum TURBO = new CategoryEnum("Turbo");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
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
     * 集群Master节点架构：  - VirtualMachine：Master节点为x86架构服务器 
     */
    public static final class TypeEnum {

        /**
         * Enum VIRTUALMACHINE for value: "VirtualMachine"
         */
        public static final TypeEnum VIRTUALMACHINE = new TypeEnum("VirtualMachine");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("VirtualMachine", VIRTUALMACHINE);
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
    @JsonProperty(value = "enableSnat")

    private Boolean enableSnat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableSWRImageAccess")

    private Boolean enableSWRImageAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6enable")

    private Boolean ipv6enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostNetwork")

    private AutopilotHostNetwork hostNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containerNetwork")

    private AutopilotContainerNetwork containerNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eniNetwork")

    private AutopilotEniNetwork eniNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceNetwork")

    private AutopilotServiceNetwork serviceNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication")

    private AutopilotAuthentication authentication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billingMode")

    private Integer billingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubernetesSvcIpRange")

    private String kubernetesSvcIpRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterTags")

    private List<AutopilotResourceTag> clusterTags = null;

    /**
     * 服务转发模式：  - iptables：社区传统的kube-proxy模式，完全以iptables规则的方式来实现service负载均衡。该方式最主要的问题是在服务多的时候产生太多的iptables规则，非增量式更新会引入一定的时延，大规模情况下有明显的性能问题。  > 默认使用iptables转发模式。 
     */
    public static final class KubeProxyModeEnum {

        /**
         * Enum IPTABLES for value: "iptables"
         */
        public static final KubeProxyModeEnum IPTABLES = new KubeProxyModeEnum("iptables");

        private static final Map<String, KubeProxyModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KubeProxyModeEnum> createStaticFields() {
            Map<String, KubeProxyModeEnum> map = new HashMap<>();
            map.put("iptables", IPTABLES);
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

    private AutopilotClusterExtendParam extendParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurationsOverride")

    private List<AutopilotPackageConfiguration> configurationsOverride = null;

    public AutopilotClusterSpec withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 集群类别。 
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public AutopilotClusterSpec withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 集群Master节点架构：  - VirtualMachine：Master节点为x86架构服务器 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AutopilotClusterSpec withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 集群规格，cce.autopilot.cluster 
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public AutopilotClusterSpec withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 集群版本，与Kubernetes社区基线版本保持一致，建议选择最新版本。  在CCE控制台支持创建两种最新版本的集群。可登录CCE控制台创建集群，在“版本”处获取到集群版本。 其它集群版本，当前仍可通过api创建，但后续会逐渐下线，具体下线策略请关注CCE官方公告。  >    - 若不配置，默认创建最新版本的集群。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AutopilotClusterSpec withPlatformVersion(String platformVersion) {
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

    public AutopilotClusterSpec withDescription(String description) {
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

    public AutopilotClusterSpec withCustomSan(List<String> customSan) {
        this.customSan = customSan;
        return this;
    }

    public AutopilotClusterSpec addCustomSanItem(String customSanItem) {
        if (this.customSan == null) {
            this.customSan = new ArrayList<>();
        }
        this.customSan.add(customSanItem);
        return this;
    }

    public AutopilotClusterSpec withCustomSan(Consumer<List<String>> customSanSetter) {
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

    public AutopilotClusterSpec withEnableSnat(Boolean enableSnat) {
        this.enableSnat = enableSnat;
        return this;
    }

    /**
     * 集群是否配置SNAT。开启后您的集群可以通过NAT网关访问公网，默认使用所选的VPC中已有的NAT网关，否则系统将会为您自动创建一个默认规格的NAT网关并绑定弹性公网IP，自动配置SNAT规则。
     * @return enableSnat
     */
    public Boolean getEnableSnat() {
        return enableSnat;
    }

    public void setEnableSnat(Boolean enableSnat) {
        this.enableSnat = enableSnat;
    }

    public AutopilotClusterSpec withEnableSWRImageAccess(Boolean enableSWRImageAccess) {
        this.enableSWRImageAccess = enableSWRImageAccess;
        return this;
    }

    /**
     * 集群是否配置镜像访问。为确保您的集群节点可以从容器镜像服务中拉取镜像，默认使用所选VPC中已有的SWR和OBS终端节点，否则将会为您自动新建SWR和OBS终端节点。
     * @return enableSWRImageAccess
     */
    public Boolean getEnableSWRImageAccess() {
        return enableSWRImageAccess;
    }

    public void setEnableSWRImageAccess(Boolean enableSWRImageAccess) {
        this.enableSWRImageAccess = enableSWRImageAccess;
    }

    public AutopilotClusterSpec withIpv6enable(Boolean ipv6enable) {
        this.ipv6enable = ipv6enable;
        return this;
    }

    /**
     * 集群是否使用IPv6模式。
     * @return ipv6enable
     */
    public Boolean getIpv6enable() {
        return ipv6enable;
    }

    public void setIpv6enable(Boolean ipv6enable) {
        this.ipv6enable = ipv6enable;
    }

    public AutopilotClusterSpec withHostNetwork(AutopilotHostNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    public AutopilotClusterSpec withHostNetwork(Consumer<AutopilotHostNetwork> hostNetworkSetter) {
        if (this.hostNetwork == null) {
            this.hostNetwork = new AutopilotHostNetwork();
            hostNetworkSetter.accept(this.hostNetwork);
        }

        return this;
    }

    /**
     * Get hostNetwork
     * @return hostNetwork
     */
    public AutopilotHostNetwork getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(AutopilotHostNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    public AutopilotClusterSpec withContainerNetwork(AutopilotContainerNetwork containerNetwork) {
        this.containerNetwork = containerNetwork;
        return this;
    }

    public AutopilotClusterSpec withContainerNetwork(Consumer<AutopilotContainerNetwork> containerNetworkSetter) {
        if (this.containerNetwork == null) {
            this.containerNetwork = new AutopilotContainerNetwork();
            containerNetworkSetter.accept(this.containerNetwork);
        }

        return this;
    }

    /**
     * Get containerNetwork
     * @return containerNetwork
     */
    public AutopilotContainerNetwork getContainerNetwork() {
        return containerNetwork;
    }

    public void setContainerNetwork(AutopilotContainerNetwork containerNetwork) {
        this.containerNetwork = containerNetwork;
    }

    public AutopilotClusterSpec withEniNetwork(AutopilotEniNetwork eniNetwork) {
        this.eniNetwork = eniNetwork;
        return this;
    }

    public AutopilotClusterSpec withEniNetwork(Consumer<AutopilotEniNetwork> eniNetworkSetter) {
        if (this.eniNetwork == null) {
            this.eniNetwork = new AutopilotEniNetwork();
            eniNetworkSetter.accept(this.eniNetwork);
        }

        return this;
    }

    /**
     * Get eniNetwork
     * @return eniNetwork
     */
    public AutopilotEniNetwork getEniNetwork() {
        return eniNetwork;
    }

    public void setEniNetwork(AutopilotEniNetwork eniNetwork) {
        this.eniNetwork = eniNetwork;
    }

    public AutopilotClusterSpec withServiceNetwork(AutopilotServiceNetwork serviceNetwork) {
        this.serviceNetwork = serviceNetwork;
        return this;
    }

    public AutopilotClusterSpec withServiceNetwork(Consumer<AutopilotServiceNetwork> serviceNetworkSetter) {
        if (this.serviceNetwork == null) {
            this.serviceNetwork = new AutopilotServiceNetwork();
            serviceNetworkSetter.accept(this.serviceNetwork);
        }

        return this;
    }

    /**
     * Get serviceNetwork
     * @return serviceNetwork
     */
    public AutopilotServiceNetwork getServiceNetwork() {
        return serviceNetwork;
    }

    public void setServiceNetwork(AutopilotServiceNetwork serviceNetwork) {
        this.serviceNetwork = serviceNetwork;
    }

    public AutopilotClusterSpec withAuthentication(AutopilotAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }

    public AutopilotClusterSpec withAuthentication(Consumer<AutopilotAuthentication> authenticationSetter) {
        if (this.authentication == null) {
            this.authentication = new AutopilotAuthentication();
            authenticationSetter.accept(this.authentication);
        }

        return this;
    }

    /**
     * Get authentication
     * @return authentication
     */
    public AutopilotAuthentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(AutopilotAuthentication authentication) {
        this.authentication = authentication;
    }

    public AutopilotClusterSpec withBillingMode(Integer billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    /**
     * 集群的计费方式。 - 0: 按需计费  默认为“按需计费”。 
     * @return billingMode
     */
    public Integer getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(Integer billingMode) {
        this.billingMode = billingMode;
    }

    public AutopilotClusterSpec withKubernetesSvcIpRange(String kubernetesSvcIpRange) {
        this.kubernetesSvcIpRange = kubernetesSvcIpRange;
        return this;
    }

    /**
     * 服务网段参数，kubernetes clusterIP取值范围。创建集群时如若未传参，默认为\"10.247.0.0/16\"。该参数废弃中，推荐使用新字段serviceNetwork，包含IPv4服务网段。 
     * @return kubernetesSvcIpRange
     */
    public String getKubernetesSvcIpRange() {
        return kubernetesSvcIpRange;
    }

    public void setKubernetesSvcIpRange(String kubernetesSvcIpRange) {
        this.kubernetesSvcIpRange = kubernetesSvcIpRange;
    }

    public AutopilotClusterSpec withClusterTags(List<AutopilotResourceTag> clusterTags) {
        this.clusterTags = clusterTags;
        return this;
    }

    public AutopilotClusterSpec addClusterTagsItem(AutopilotResourceTag clusterTagsItem) {
        if (this.clusterTags == null) {
            this.clusterTags = new ArrayList<>();
        }
        this.clusterTags.add(clusterTagsItem);
        return this;
    }

    public AutopilotClusterSpec withClusterTags(Consumer<List<AutopilotResourceTag>> clusterTagsSetter) {
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
    public List<AutopilotResourceTag> getClusterTags() {
        return clusterTags;
    }

    public void setClusterTags(List<AutopilotResourceTag> clusterTags) {
        this.clusterTags = clusterTags;
    }

    public AutopilotClusterSpec withKubeProxyMode(KubeProxyModeEnum kubeProxyMode) {
        this.kubeProxyMode = kubeProxyMode;
        return this;
    }

    /**
     * 服务转发模式：  - iptables：社区传统的kube-proxy模式，完全以iptables规则的方式来实现service负载均衡。该方式最主要的问题是在服务多的时候产生太多的iptables规则，非增量式更新会引入一定的时延，大规模情况下有明显的性能问题。  > 默认使用iptables转发模式。 
     * @return kubeProxyMode
     */
    public KubeProxyModeEnum getKubeProxyMode() {
        return kubeProxyMode;
    }

    public void setKubeProxyMode(KubeProxyModeEnum kubeProxyMode) {
        this.kubeProxyMode = kubeProxyMode;
    }

    public AutopilotClusterSpec withAz(String az) {
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

    public AutopilotClusterSpec withExtendParam(AutopilotClusterExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public AutopilotClusterSpec withExtendParam(Consumer<AutopilotClusterExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new AutopilotClusterExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public AutopilotClusterExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(AutopilotClusterExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    public AutopilotClusterSpec withConfigurationsOverride(List<AutopilotPackageConfiguration> configurationsOverride) {
        this.configurationsOverride = configurationsOverride;
        return this;
    }

    public AutopilotClusterSpec addConfigurationsOverrideItem(
        AutopilotPackageConfiguration configurationsOverrideItem) {
        if (this.configurationsOverride == null) {
            this.configurationsOverride = new ArrayList<>();
        }
        this.configurationsOverride.add(configurationsOverrideItem);
        return this;
    }

    public AutopilotClusterSpec withConfigurationsOverride(
        Consumer<List<AutopilotPackageConfiguration>> configurationsOverrideSetter) {
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
    public List<AutopilotPackageConfiguration> getConfigurationsOverride() {
        return configurationsOverride;
    }

    public void setConfigurationsOverride(List<AutopilotPackageConfiguration> configurationsOverride) {
        this.configurationsOverride = configurationsOverride;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutopilotClusterSpec that = (AutopilotClusterSpec) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.type, that.type)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.version, that.version)
            && Objects.equals(this.platformVersion, that.platformVersion)
            && Objects.equals(this.description, that.description) && Objects.equals(this.customSan, that.customSan)
            && Objects.equals(this.enableSnat, that.enableSnat)
            && Objects.equals(this.enableSWRImageAccess, that.enableSWRImageAccess)
            && Objects.equals(this.ipv6enable, that.ipv6enable) && Objects.equals(this.hostNetwork, that.hostNetwork)
            && Objects.equals(this.containerNetwork, that.containerNetwork)
            && Objects.equals(this.eniNetwork, that.eniNetwork)
            && Objects.equals(this.serviceNetwork, that.serviceNetwork)
            && Objects.equals(this.authentication, that.authentication)
            && Objects.equals(this.billingMode, that.billingMode)
            && Objects.equals(this.kubernetesSvcIpRange, that.kubernetesSvcIpRange)
            && Objects.equals(this.clusterTags, that.clusterTags)
            && Objects.equals(this.kubeProxyMode, that.kubeProxyMode) && Objects.equals(this.az, that.az)
            && Objects.equals(this.extendParam, that.extendParam)
            && Objects.equals(this.configurationsOverride, that.configurationsOverride);
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
            enableSnat,
            enableSWRImageAccess,
            ipv6enable,
            hostNetwork,
            containerNetwork,
            eniNetwork,
            serviceNetwork,
            authentication,
            billingMode,
            kubernetesSvcIpRange,
            clusterTags,
            kubeProxyMode,
            az,
            extendParam,
            configurationsOverride);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutopilotClusterSpec {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    platformVersion: ").append(toIndentedString(platformVersion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    customSan: ").append(toIndentedString(customSan)).append("\n");
        sb.append("    enableSnat: ").append(toIndentedString(enableSnat)).append("\n");
        sb.append("    enableSWRImageAccess: ").append(toIndentedString(enableSWRImageAccess)).append("\n");
        sb.append("    ipv6enable: ").append(toIndentedString(ipv6enable)).append("\n");
        sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
        sb.append("    containerNetwork: ").append(toIndentedString(containerNetwork)).append("\n");
        sb.append("    eniNetwork: ").append(toIndentedString(eniNetwork)).append("\n");
        sb.append("    serviceNetwork: ").append(toIndentedString(serviceNetwork)).append("\n");
        sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    kubernetesSvcIpRange: ").append(toIndentedString(kubernetesSvcIpRange)).append("\n");
        sb.append("    clusterTags: ").append(toIndentedString(clusterTags)).append("\n");
        sb.append("    kubeProxyMode: ").append(toIndentedString(kubeProxyMode)).append("\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    configurationsOverride: ").append(toIndentedString(configurationsOverride)).append("\n");
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
