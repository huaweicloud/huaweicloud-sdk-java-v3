package com.huaweicloud.sdk.apig.v2.model;

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
 * InstanceCreateReq
 */
public class InstanceCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_begin")

    private String maintainBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_end")

    private String maintainEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 实例规格： - BASIC：基础版实例 - PROFESSIONAL：专业版实例 - ENTERPRISE：企业版实例 - PLATINUM：铂金版实例 - BASIC_IPV6：基础版IPV6实例 - PROFESSIONAL_IPV6：专业版IPV6实例 - ENTERPRISE_IPV6：企业版IPV6实例 - PLATINUM_IPV6：铂金版IPV6实例
     */
    public static final class SpecIdEnum {

        /**
         * Enum BASIC for value: "BASIC"
         */
        public static final SpecIdEnum BASIC = new SpecIdEnum("BASIC");

        /**
         * Enum PROFESSIONAL for value: "PROFESSIONAL"
         */
        public static final SpecIdEnum PROFESSIONAL = new SpecIdEnum("PROFESSIONAL");

        /**
         * Enum ENTERPRISE for value: "ENTERPRISE"
         */
        public static final SpecIdEnum ENTERPRISE = new SpecIdEnum("ENTERPRISE");

        /**
         * Enum PLATINUM for value: "PLATINUM"
         */
        public static final SpecIdEnum PLATINUM = new SpecIdEnum("PLATINUM");

        /**
         * Enum BASIC_IPV6 for value: "BASIC_IPV6"
         */
        public static final SpecIdEnum BASIC_IPV6 = new SpecIdEnum("BASIC_IPV6");

        /**
         * Enum PROFESSIONAL_IPV6 for value: "PROFESSIONAL_IPV6"
         */
        public static final SpecIdEnum PROFESSIONAL_IPV6 = new SpecIdEnum("PROFESSIONAL_IPV6");

        /**
         * Enum ENTERPRISE_IPV6 for value: "ENTERPRISE_IPV6"
         */
        public static final SpecIdEnum ENTERPRISE_IPV6 = new SpecIdEnum("ENTERPRISE_IPV6");

        /**
         * Enum PLATINUM_IPV6 for value: "PLATINUM_IPV6"
         */
        public static final SpecIdEnum PLATINUM_IPV6 = new SpecIdEnum("PLATINUM_IPV6");

        private static final Map<String, SpecIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecIdEnum> createStaticFields() {
            Map<String, SpecIdEnum> map = new HashMap<>();
            map.put("BASIC", BASIC);
            map.put("PROFESSIONAL", PROFESSIONAL);
            map.put("ENTERPRISE", ENTERPRISE);
            map.put("PLATINUM", PLATINUM);
            map.put("BASIC_IPV6", BASIC_IPV6);
            map.put("PROFESSIONAL_IPV6", PROFESSIONAL_IPV6);
            map.put("ENTERPRISE_IPV6", ENTERPRISE_IPV6);
            map.put("PLATINUM_IPV6", PLATINUM_IPV6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecIdEnum(String value) {
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
        public static SpecIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SpecIdEnum(value));
        }

        public static SpecIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SpecIdEnum) {
                return this.value.equals(((SpecIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_id")

    private SpecIdEnum specId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_id")

    private String eipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone_ids")

    private List<String> availableZoneIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Integer bandwidthSize;

    /**
     * 出公网带宽计费类型，实例需要开启出公网功能时需要填写： - bandwidth：按带宽计费 - traffic：按流量计费
     */
    public static final class BandwidthChargingModeEnum {

        /**
         * Enum BANDWIDTH for value: "bandwidth"
         */
        public static final BandwidthChargingModeEnum BANDWIDTH = new BandwidthChargingModeEnum("bandwidth");

        /**
         * Enum TRAFFIC for value: "traffic"
         */
        public static final BandwidthChargingModeEnum TRAFFIC = new BandwidthChargingModeEnum("traffic");

        private static final Map<String, BandwidthChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BandwidthChargingModeEnum> createStaticFields() {
            Map<String, BandwidthChargingModeEnum> map = new HashMap<>();
            map.put("bandwidth", BANDWIDTH);
            map.put("traffic", TRAFFIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BandwidthChargingModeEnum(String value) {
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
        public static BandwidthChargingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BandwidthChargingModeEnum(value));
        }

        public static BandwidthChargingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BandwidthChargingModeEnum) {
                return this.value.equals(((BandwidthChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_charging_mode")

    private BandwidthChargingModeEnum bandwidthChargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    /**
     * 实例使用的负载均衡器类型 - lvs Linux虚拟服务器 - elb 弹性负载均衡，elb仅部分region支持
     */
    public static final class LoadbalancerProviderEnum {

        /**
         * Enum LVS for value: "lvs"
         */
        public static final LoadbalancerProviderEnum LVS = new LoadbalancerProviderEnum("lvs");

        /**
         * Enum ELB for value: "elb"
         */
        public static final LoadbalancerProviderEnum ELB = new LoadbalancerProviderEnum("elb");

        private static final Map<String, LoadbalancerProviderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LoadbalancerProviderEnum> createStaticFields() {
            Map<String, LoadbalancerProviderEnum> map = new HashMap<>();
            map.put("lvs", LVS);
            map.put("elb", ELB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LoadbalancerProviderEnum(String value) {
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
        public static LoadbalancerProviderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LoadbalancerProviderEnum(value));
        }

        public static LoadbalancerProviderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LoadbalancerProviderEnum) {
                return this.value.equals(((LoadbalancerProviderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_provider")

    private LoadbalancerProviderEnum loadbalancerProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsKeyValue> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcep_service_name")

    private String vpcepServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_bandwidth_size")

    private Integer ingressBandwidthSize;

    /**
     * 入公网带宽计费类型，实例需要开启入公网功能，且loadbalancer_provider为elb时需要填写： - bandwidth：按带宽计费 - traffic：按流量计费
     */
    public static final class IngressBandwidthChargingModeEnum {

        /**
         * Enum BANDWIDTH for value: "bandwidth"
         */
        public static final IngressBandwidthChargingModeEnum BANDWIDTH =
            new IngressBandwidthChargingModeEnum("bandwidth");

        /**
         * Enum TRAFFIC for value: "traffic"
         */
        public static final IngressBandwidthChargingModeEnum TRAFFIC = new IngressBandwidthChargingModeEnum("traffic");

        private static final Map<String, IngressBandwidthChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IngressBandwidthChargingModeEnum> createStaticFields() {
            Map<String, IngressBandwidthChargingModeEnum> map = new HashMap<>();
            map.put("bandwidth", BANDWIDTH);
            map.put("traffic", TRAFFIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IngressBandwidthChargingModeEnum(String value) {
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
        public static IngressBandwidthChargingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new IngressBandwidthChargingModeEnum(value));
        }

        public static IngressBandwidthChargingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IngressBandwidthChargingModeEnum) {
                return this.value.equals(((IngressBandwidthChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_bandwidth_charging_mode")

    private IngressBandwidthChargingModeEnum ingressBandwidthChargingMode;

    public InstanceCreateReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InstanceCreateReq withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    /**
     * 维护时间窗开始时间。时间格式为 xx:00:00，xx取值为02,06,10,14,18,22。  在这个时间段内，运维人员可以对该实例的节点进行维护操作。维护期间，业务可以正常使用，可能会发生闪断。维护操作通常几个月一次。
     * @return maintainBegin
     */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public InstanceCreateReq withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    /**
     * 维护时间窗结束时间。时间格式为 xx:00:00，与维护时间窗开始时间相差4个小时。  在这个时间段内，运维人员可以对该实例的节点进行维护操作。维护期间，业务可以正常使用，可能会发生闪断。维护操作通常几个月一次。
     * @return maintainEnd
     */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public InstanceCreateReq withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public InstanceCreateReq withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例编号，不填写自动生成
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceCreateReq withSpecId(SpecIdEnum specId) {
        this.specId = specId;
        return this;
    }

    /**
     * 实例规格： - BASIC：基础版实例 - PROFESSIONAL：专业版实例 - ENTERPRISE：企业版实例 - PLATINUM：铂金版实例 - BASIC_IPV6：基础版IPV6实例 - PROFESSIONAL_IPV6：专业版IPV6实例 - ENTERPRISE_IPV6：企业版IPV6实例 - PLATINUM_IPV6：铂金版IPV6实例
     * @return specId
     */
    public SpecIdEnum getSpecId() {
        return specId;
    }

    public void setSpecId(SpecIdEnum specId) {
        this.specId = specId;
    }

    public InstanceCreateReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID。  获取方法如下：   - 方法1：登录虚拟私有云服务的控制台界面，在虚拟私有云的详情页面查找VPC ID。   - 方法2：通过虚拟私有云服务的API接口查询，具体方法请参见《虚拟私有云服务API参考》的“查询VPC列表”章节。 
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public InstanceCreateReq withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网的网络ID。  获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，单击VPC下的子网，进入子网详情页面，查找网络ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体方法请参见《虚拟私有云服务API参考》的“查询子网列表”章节。 
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public InstanceCreateReq withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 指定实例所属的安全组。  获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，在安全组的详情页面查找安全组ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体方法请参见《虚拟私有云服务API参考》的“查询安全组列表”章节。 
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public InstanceCreateReq withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    /**
     * 弹性公网IP ID。  实例需要开启公网访问，且loadbalancer_provider为lvs时需要填写，绑定后使用者可以通过该入口从公网访问APIG实例中的API等资源  获取方法：登录虚拟私有云服务的控制台界面，在弹性公网IP的详情页面查找弹性公网IP ID。
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public InstanceCreateReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，企业帐号必填。  获取方法如下： - 方法1：登录企业项目管理界面，在项目管理详情页面查找项目ID。 - 方法2：通过企业项目管理的API接口查询，具体方法请参见《企业管理API参考》的“查询企业项目列表”章节。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public InstanceCreateReq withAvailableZoneIds(List<String> availableZoneIds) {
        this.availableZoneIds = availableZoneIds;
        return this;
    }

    public InstanceCreateReq addAvailableZoneIdsItem(String availableZoneIdsItem) {
        if (this.availableZoneIds == null) {
            this.availableZoneIds = new ArrayList<>();
        }
        this.availableZoneIds.add(availableZoneIdsItem);
        return this;
    }

    public InstanceCreateReq withAvailableZoneIds(Consumer<List<String>> availableZoneIdsSetter) {
        if (this.availableZoneIds == null) {
            this.availableZoneIds = new ArrayList<>();
        }
        availableZoneIdsSetter.accept(this.availableZoneIds);
        return this;
    }

    /**
     * 可用区列表。  可用区指在同一地域下，电力、网络隔离的物理区域，可用区之内内网互通，不同可用区之间物理隔离。选择多个AZ部署可以有效提升可靠性。  获取方法：通过文档中实例管理的可用区列表接口查询。
     * @return availableZoneIds
     */
    public List<String> getAvailableZoneIds() {
        return availableZoneIds;
    }

    public void setAvailableZoneIds(List<String> availableZoneIds) {
        this.availableZoneIds = availableZoneIds;
    }

    public InstanceCreateReq withBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 出公网带宽  实例需要开启出公网功能时需要填写，绑定后使用者可以利用该出口访问公网上的互联网资源
     * @return bandwidthSize
     */
    public Integer getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public InstanceCreateReq withBandwidthChargingMode(BandwidthChargingModeEnum bandwidthChargingMode) {
        this.bandwidthChargingMode = bandwidthChargingMode;
        return this;
    }

    /**
     * 出公网带宽计费类型，实例需要开启出公网功能时需要填写： - bandwidth：按带宽计费 - traffic：按流量计费
     * @return bandwidthChargingMode
     */
    public BandwidthChargingModeEnum getBandwidthChargingMode() {
        return bandwidthChargingMode;
    }

    public void setBandwidthChargingMode(BandwidthChargingModeEnum bandwidthChargingMode) {
        this.bandwidthChargingMode = bandwidthChargingMode;
    }

    public InstanceCreateReq withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 公网访问是否支持IPv6。  当前仅部分region部分可用区支持IPv6
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public InstanceCreateReq withLoadbalancerProvider(LoadbalancerProviderEnum loadbalancerProvider) {
        this.loadbalancerProvider = loadbalancerProvider;
        return this;
    }

    /**
     * 实例使用的负载均衡器类型 - lvs Linux虚拟服务器 - elb 弹性负载均衡，elb仅部分region支持
     * @return loadbalancerProvider
     */
    public LoadbalancerProviderEnum getLoadbalancerProvider() {
        return loadbalancerProvider;
    }

    public void setLoadbalancerProvider(LoadbalancerProviderEnum loadbalancerProvider) {
        this.loadbalancerProvider = loadbalancerProvider;
    }

    public InstanceCreateReq withTags(List<TmsKeyValue> tags) {
        this.tags = tags;
        return this;
    }

    public InstanceCreateReq addTagsItem(TmsKeyValue tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public InstanceCreateReq withTags(Consumer<List<TmsKeyValue>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。  一个实例默认最多支持创建20个标签
     * @return tags
     */
    public List<TmsKeyValue> getTags() {
        return tags;
    }

    public void setTags(List<TmsKeyValue> tags) {
        this.tags = tags;
    }

    public InstanceCreateReq withVpcepServiceName(String vpcepServiceName) {
        this.vpcepServiceName = vpcepServiceName;
        return this;
    }

    /**
     * 终端节点服务的名称。  长度不超过16个字符，允许输入大小写字母、数字、下划线、中划线。  如果您不填写该参数，系统生成的终端节点服务的名称为{region}.apig.{service_id}。 如果您填写该参数，系统生成的终端节点服务的名称为{region}.{vpcep_service_name}.{service_id}。 实例创建完成后，可以在实例管理->终端节点管理页面修改该名称。 
     * @return vpcepServiceName
     */
    public String getVpcepServiceName() {
        return vpcepServiceName;
    }

    public void setVpcepServiceName(String vpcepServiceName) {
        this.vpcepServiceName = vpcepServiceName;
    }

    public InstanceCreateReq withIngressBandwidthSize(Integer ingressBandwidthSize) {
        this.ingressBandwidthSize = ingressBandwidthSize;
        return this;
    }

    /**
     * 入公网带宽  实例需要开启入公网功能，且loadbalancer_provider为elb时需要填写，绑定后使用者可以通过该入口从公网访问APIG实例中的API等资源
     * @return ingressBandwidthSize
     */
    public Integer getIngressBandwidthSize() {
        return ingressBandwidthSize;
    }

    public void setIngressBandwidthSize(Integer ingressBandwidthSize) {
        this.ingressBandwidthSize = ingressBandwidthSize;
    }

    public InstanceCreateReq withIngressBandwidthChargingMode(
        IngressBandwidthChargingModeEnum ingressBandwidthChargingMode) {
        this.ingressBandwidthChargingMode = ingressBandwidthChargingMode;
        return this;
    }

    /**
     * 入公网带宽计费类型，实例需要开启入公网功能，且loadbalancer_provider为elb时需要填写： - bandwidth：按带宽计费 - traffic：按流量计费
     * @return ingressBandwidthChargingMode
     */
    public IngressBandwidthChargingModeEnum getIngressBandwidthChargingMode() {
        return ingressBandwidthChargingMode;
    }

    public void setIngressBandwidthChargingMode(IngressBandwidthChargingModeEnum ingressBandwidthChargingMode) {
        this.ingressBandwidthChargingMode = ingressBandwidthChargingMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceCreateReq that = (InstanceCreateReq) obj;
        return Objects.equals(this.description, that.description)
            && Objects.equals(this.maintainBegin, that.maintainBegin)
            && Objects.equals(this.maintainEnd, that.maintainEnd)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.specId, that.specId) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId) && Objects.equals(this.eipId, that.eipId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.availableZoneIds, that.availableZoneIds)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize)
            && Objects.equals(this.bandwidthChargingMode, that.bandwidthChargingMode)
            && Objects.equals(this.ipv6Enable, that.ipv6Enable)
            && Objects.equals(this.loadbalancerProvider, that.loadbalancerProvider)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.vpcepServiceName, that.vpcepServiceName)
            && Objects.equals(this.ingressBandwidthSize, that.ingressBandwidthSize)
            && Objects.equals(this.ingressBandwidthChargingMode, that.ingressBandwidthChargingMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            maintainBegin,
            maintainEnd,
            instanceName,
            instanceId,
            specId,
            vpcId,
            subnetId,
            securityGroupId,
            eipId,
            enterpriseProjectId,
            availableZoneIds,
            bandwidthSize,
            bandwidthChargingMode,
            ipv6Enable,
            loadbalancerProvider,
            tags,
            vpcepServiceName,
            ingressBandwidthSize,
            ingressBandwidthChargingMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceCreateReq {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    specId: ").append(toIndentedString(specId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    availableZoneIds: ").append(toIndentedString(availableZoneIds)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    bandwidthChargingMode: ").append(toIndentedString(bandwidthChargingMode)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    loadbalancerProvider: ").append(toIndentedString(loadbalancerProvider)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    vpcepServiceName: ").append(toIndentedString(vpcepServiceName)).append("\n");
        sb.append("    ingressBandwidthSize: ").append(toIndentedString(ingressBandwidthSize)).append("\n");
        sb.append("    ingressBandwidthChargingMode: ")
            .append(toIndentedString(ingressBandwidthChargingMode))
            .append("\n");
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
