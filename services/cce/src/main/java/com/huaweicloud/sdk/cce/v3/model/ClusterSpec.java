package com.huaweicloud.sdk.cce.v3.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.Authentication;
import com.huaweicloud.sdk.cce.v3.model.ClusterExtendParam;
import com.huaweicloud.sdk.cce.v3.model.ContainerNetwork;
import com.huaweicloud.sdk.cce.v3.model.EniNetwork;
import com.huaweicloud.sdk.cce.v3.model.HostNetwork;
import com.huaweicloud.sdk.cce.v3.model.MasterSpec;
import com.huaweicloud.sdk.cce.v3.model.ResourceTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 集群参数定义。
 */
public class ClusterSpec  {

    /**
     * 集群类别：   - CCE：CCE集群    CCE集群支持虚拟机与裸金属服务器混合、GPU、NPU等异构节点的混合部署，基于高性能网络模型提供全方位、多场景、安全稳定的容器运行环境。  - Turbo: CCE Turbo集群    全面基于云原生基础设施构建的云原生2.0的容器引擎服务，具备软硬协同、网络无损、安全可靠、调度智能的优势，为用户提供一站式、高性价比的全新容器服务体验。 
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CategoryEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CategoryEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CategoryEnum(value);
            }
            return result;
        }

        public static CategoryEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CategoryEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof CategoryEnum) {
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
    @JsonProperty(value="category")
    
    private CategoryEnum category;
    /**
     * 集群管控面节点架构：   - VirtualMachine：管控面节点为x86架构服务器  - ARM64: 管控面节点为鲲鹏（ARM架构）服务器 
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
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
    @JsonProperty(value="type")
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private String flavor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipv6enable")
    
    private Boolean ipv6enable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostNetwork")
    
    private HostNetwork hostNetwork;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="containerNetwork")
    
    private ContainerNetwork containerNetwork;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eniNetwork")
    
    private EniNetwork eniNetwork;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authentication")
    
    private Authentication authentication;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="billingMode")
    
    private Integer billingMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="masters")
    
    private List<MasterSpec> masters = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kubernetesSvcIpRange")
    
    private String kubernetesSvcIpRange;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clusterTags")
    
    private List<ResourceTag> clusterTags = null;
        /**
     * 服务转发模式，支持以下两种实现： - iptables：社区传统的kube-proxy模式，完全以iptables规则的方式来实现service负载均衡。该方式最主要的问题是在服务多的时候产生太多的iptables规则，非增量式更新会引入一定的时延，大规模情况下有明显的性能问题。 - ipvs：主导开发并在社区获得广泛支持的kube-proxy模式，采用增量式更新，吞吐更高，速度更快，并可以保证service更新期间连接保持不断开，适用于大规模场景。 
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static KubeProxyModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            KubeProxyModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new KubeProxyModeEnum(value);
            }
            return result;
        }

        public static KubeProxyModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            KubeProxyModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof KubeProxyModeEnum) {
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
    @JsonProperty(value="kubeProxyMode")
    
    private KubeProxyModeEnum kubeProxyMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az")
    
    private String az;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extendParam")
    
    private ClusterExtendParam extendParam;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="supportIstio")
    
    private Boolean supportIstio;

    public ClusterSpec withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    


    /**
     * 集群类别：   - CCE：CCE集群    CCE集群支持虚拟机与裸金属服务器混合、GPU、NPU等异构节点的混合部署，基于高性能网络模型提供全方位、多场景、安全稳定的容器运行环境。  - Turbo: CCE Turbo集群    全面基于云原生基础设施构建的云原生2.0的容器引擎服务，具备软硬协同、网络无损、安全可靠、调度智能的优势，为用户提供一站式、高性价比的全新容器服务体验。 
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
     * 集群管控面节点架构：   - VirtualMachine：管控面节点为x86架构服务器  - ARM64: 管控面节点为鲲鹏（ARM架构）服务器 
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
     * 字段默认值：创建CCE集群[或鲲鹏集群](tag:hws)时，如果是非专属云为 cce.s1.small，专属云则为 cce.dec.s1.small；   集群规格，集群创建完成后规格不可再变更，请按实际业务需求进行选择：   - cce.s1.small: 小规模单控制节点CCE集群（最大50节点）  - cce.s1.medium: 中等规模单控制节点CCE集群（最大200节点）  - cce.s2.small: 小规模多控制节点CCE集群（最大50节点）  - cce.s2.medium: 中等规模多控制节点CCE集群（最大200节点）  - cce.s2.large: 大规模多控制节点CCE集群（最大1000节点）  - cce.s2.xlarge: 超大规模多控制节点CCE集群（最大2000节点）   >    - s1：单控制节点CCE集群。 >    - s2：多控制节点CCE集群。 >    - dec：专属CCE集群规格。如cce.dec.s1.small为小规模单控制节点专属CCE集群（最大50节点）。 >    - 最大节点数：当前集群支持管理的最大节点规模，请根据业务需求选择。 >    - 单控制节点集群：普通集群是单控制节点，控制节点故障后，集群将不可用，但已运行工作负载不受影响。 >    - 多控制节点集群：即高可用集群，当某个控制节点故障时，集群仍然可用。查看集群模式请参见[[如何排查已创建的集群是否为高可用集群？](https://support.huaweicloud.com/cce_faq/cce_faq_00155.html)](tag:hws)[[如何排查已创建的集群是否为高可用集群？](https://support.huaweicloud.com/intl/zh-cn/cce_faq/cce_faq_00155.html)](tag:hws_hk) 
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
     * 集群版本，与Kubernetes社区基线版本保持一致，建议选择最新版本。  在CCE控制台中支持创建两种最新版本的集群。可登录CCE控制台，单击“总览 > 购买Kubernetes集群”，在“版本”处获取到集群版本。 其它集群版本，当前仍可通过api创建，但后续会逐渐下线，具体下线策略请关注CCE官方公告。  >    - 若不配置，默认创建最新版本的集群。 >    - 若指定集群基线版本但是不指定具体r版本，则系统默认选择对应集群版本的最新r版本。建议不指定具体r版本由系统选择最新版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public ClusterSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 集群描述，对于集群使用目的的描述，可根据实际情况自定义，默认为空。集群创建成功后可通过接口[[更新指定的集群](https://support.huaweicloud.com/api-cce/cce_02_0240.html)](tag:hws)[[更新指定的集群](https://support.huaweicloud.com/intl/zh-cn/api-cce/cce_02_0240.html)](tag:hws_hk)来做出修改，也可在CCE控制台中对应集群的“集群详情”下的“描述”处进行修改。仅支持utf-8编码。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if(this.hostNetwork == null ){
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
        if(this.containerNetwork == null ){
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
        if(this.eniNetwork == null ){
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

    

    public ClusterSpec withAuthentication(Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

    public ClusterSpec withAuthentication(Consumer<Authentication> authenticationSetter) {
        if(this.authentication == null ){
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
     * 集群的计费方式。计费方式为“按需计费”时，取值为“0”；计费方式为“包周期”时，取值为“1”。若不填，则默认为“按需计费”。
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
        if(this.masters == null) {
            this.masters = new ArrayList<>();
        }
        this.masters.add(mastersItem);
        return this;
    }

    public ClusterSpec withMasters(Consumer<List<MasterSpec>> mastersSetter) {
        if(this.masters == null) {
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
     * 服务网段参数，kubernetes clusterIp取值范围，1.11.7版本及以上支持。 
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
        if(this.clusterTags == null) {
            this.clusterTags = new ArrayList<>();
        }
        this.clusterTags.add(clusterTagsItem);
        return this;
    }

    public ClusterSpec withClusterTags(Consumer<List<ResourceTag>> clusterTagsSetter) {
        if(this.clusterTags == null) {
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
     * 服务转发模式，支持以下两种实现： - iptables：社区传统的kube-proxy模式，完全以iptables规则的方式来实现service负载均衡。该方式最主要的问题是在服务多的时候产生太多的iptables规则，非增量式更新会引入一定的时延，大规模情况下有明显的性能问题。 - ipvs：主导开发并在社区获得广泛支持的kube-proxy模式，采用增量式更新，吞吐更高，速度更快，并可以保证service更新期间连接保持不断开，适用于大规模场景。 
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
     * 可用区（仅查询返回字段）, CCE支持的可用区请参考[[地区和终端节点](https://developer.huaweicloud.com/endpoint?CCE)](tag:hws)[[地区和终端节点](https://developer.huaweicloud.com/intl/zh-cn/endpoint?CCE)](tag:hws_hk)获取。 
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
        if(this.extendParam == null ){
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterSpec clusterSpec = (ClusterSpec) o;
        return Objects.equals(this.category, clusterSpec.category) &&
            Objects.equals(this.type, clusterSpec.type) &&
            Objects.equals(this.flavor, clusterSpec.flavor) &&
            Objects.equals(this.version, clusterSpec.version) &&
            Objects.equals(this.description, clusterSpec.description) &&
            Objects.equals(this.ipv6enable, clusterSpec.ipv6enable) &&
            Objects.equals(this.hostNetwork, clusterSpec.hostNetwork) &&
            Objects.equals(this.containerNetwork, clusterSpec.containerNetwork) &&
            Objects.equals(this.eniNetwork, clusterSpec.eniNetwork) &&
            Objects.equals(this.authentication, clusterSpec.authentication) &&
            Objects.equals(this.billingMode, clusterSpec.billingMode) &&
            Objects.equals(this.masters, clusterSpec.masters) &&
            Objects.equals(this.kubernetesSvcIpRange, clusterSpec.kubernetesSvcIpRange) &&
            Objects.equals(this.clusterTags, clusterSpec.clusterTags) &&
            Objects.equals(this.kubeProxyMode, clusterSpec.kubeProxyMode) &&
            Objects.equals(this.az, clusterSpec.az) &&
            Objects.equals(this.extendParam, clusterSpec.extendParam) &&
            Objects.equals(this.supportIstio, clusterSpec.supportIstio);
    }
    @Override
    public int hashCode() {
        return Objects.hash(category, type, flavor, version, description, ipv6enable, hostNetwork, containerNetwork, eniNetwork, authentication, billingMode, masters, kubernetesSvcIpRange, clusterTags, kubeProxyMode, az, extendParam, supportIstio);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterSpec {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipv6enable: ").append(toIndentedString(ipv6enable)).append("\n");
        sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
        sb.append("    containerNetwork: ").append(toIndentedString(containerNetwork)).append("\n");
        sb.append("    eniNetwork: ").append(toIndentedString(eniNetwork)).append("\n");
        sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    masters: ").append(toIndentedString(masters)).append("\n");
        sb.append("    kubernetesSvcIpRange: ").append(toIndentedString(kubernetesSvcIpRange)).append("\n");
        sb.append("    clusterTags: ").append(toIndentedString(clusterTags)).append("\n");
        sb.append("    kubeProxyMode: ").append(toIndentedString(kubeProxyMode)).append("\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    supportIstio: ").append(toIndentedString(supportIstio)).append("\n");
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

