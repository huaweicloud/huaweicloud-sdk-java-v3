package com.huaweicloud.sdk.cse.v1.model;

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
 * 创建微服务引擎请求结构体
 */
public class EngineCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 微服务引擎计费方式，1表示按需
     */
    public static final class PaymentEnum {

        /**
         * Enum _1 for value: "1"
         */
        public static final PaymentEnum _1 = new PaymentEnum("1");

        private static final Map<String, PaymentEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PaymentEnum> createStaticFields() {
            Map<String, PaymentEnum> map = new HashMap<>();
            map.put("1", _1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PaymentEnum(String value) {
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
        public static PaymentEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PaymentEnum(value));
        }

        public static PaymentEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PaymentEnum) {
                return this.value.equals(((PaymentEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment")

    private PaymentEnum payment;

    /**
     * 微服务引擎的规格
     */
    public static final class FlavorEnum {

        /**
         * Enum CSE_S1_SMALL2 for value: "cse.s1.small2"
         */
        public static final FlavorEnum CSE_S1_SMALL2 = new FlavorEnum("cse.s1.small2");

        /**
         * Enum CSE_S1_MEDIUM2 for value: "cse.s1.medium2"
         */
        public static final FlavorEnum CSE_S1_MEDIUM2 = new FlavorEnum("cse.s1.medium2");

        /**
         * Enum CSE_S1_LARGE2 for value: "cse.s1.large2"
         */
        public static final FlavorEnum CSE_S1_LARGE2 = new FlavorEnum("cse.s1.large2");

        /**
         * Enum CSE_S1_XLARGE2 for value: "cse.s1.xlarge2"
         */
        public static final FlavorEnum CSE_S1_XLARGE2 = new FlavorEnum("cse.s1.xlarge2");

        /**
         * Enum CSE_NACOS2_C1_LARGE_10 for value: "cse.nacos2.c1.large.10"
         */
        public static final FlavorEnum CSE_NACOS2_C1_LARGE_10 = new FlavorEnum("cse.nacos2.c1.large.10");

        /**
         * Enum CSE_NACOS2_C1_XLARGE_20 for value: "cse.nacos2.c1.xlarge.20"
         */
        public static final FlavorEnum CSE_NACOS2_C1_XLARGE_20 = new FlavorEnum("cse.nacos2.c1.xlarge.20");

        /**
         * Enum CSE_NACOS2_C1_XLARGE_50 for value: "cse.nacos2.c1.xlarge.50"
         */
        public static final FlavorEnum CSE_NACOS2_C1_XLARGE_50 = new FlavorEnum("cse.nacos2.c1.xlarge.50");

        /**
         * Enum CSE_NACOS2_C1_XLARGE_60 for value: "cse.nacos2.c1.xlarge.60"
         */
        public static final FlavorEnum CSE_NACOS2_C1_XLARGE_60 = new FlavorEnum("cse.nacos2.c1.xlarge.60");

        /**
         * Enum CSE_NACOS2_C1_2XLARGE_100 for value: "cse.nacos2.c1.2xlarge.100"
         */
        public static final FlavorEnum CSE_NACOS2_C1_2XLARGE_100 = new FlavorEnum("cse.nacos2.c1.2xlarge.100");

        /**
         * Enum CSE_MICROGATEWAY_PRO_SMALL_1 for value: "cse.microgateway.pro.small.1"
         */
        public static final FlavorEnum CSE_MICROGATEWAY_PRO_SMALL_1 = new FlavorEnum("cse.microgateway.pro.small.1");

        /**
         * Enum CSE_MICROGATEWAY_PRO_MEDIUM_1 for value: "cse.microgateway.pro.medium.1"
         */
        public static final FlavorEnum CSE_MICROGATEWAY_PRO_MEDIUM_1 = new FlavorEnum("cse.microgateway.pro.medium.1");

        /**
         * Enum CSE_MICROGATEWAY_PRO_LARGE_1 for value: "cse.microgateway.pro.large.1"
         */
        public static final FlavorEnum CSE_MICROGATEWAY_PRO_LARGE_1 = new FlavorEnum("cse.microgateway.pro.large.1");

        private static final Map<String, FlavorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FlavorEnum> createStaticFields() {
            Map<String, FlavorEnum> map = new HashMap<>();
            map.put("cse.s1.small2", CSE_S1_SMALL2);
            map.put("cse.s1.medium2", CSE_S1_MEDIUM2);
            map.put("cse.s1.large2", CSE_S1_LARGE2);
            map.put("cse.s1.xlarge2", CSE_S1_XLARGE2);
            map.put("cse.nacos2.c1.large.10", CSE_NACOS2_C1_LARGE_10);
            map.put("cse.nacos2.c1.xlarge.20", CSE_NACOS2_C1_XLARGE_20);
            map.put("cse.nacos2.c1.xlarge.50", CSE_NACOS2_C1_XLARGE_50);
            map.put("cse.nacos2.c1.xlarge.60", CSE_NACOS2_C1_XLARGE_60);
            map.put("cse.nacos2.c1.2xlarge.100", CSE_NACOS2_C1_2XLARGE_100);
            map.put("cse.microgateway.pro.small.1", CSE_MICROGATEWAY_PRO_SMALL_1);
            map.put("cse.microgateway.pro.medium.1", CSE_MICROGATEWAY_PRO_MEDIUM_1);
            map.put("cse.microgateway.pro.large.1", CSE_MICROGATEWAY_PRO_LARGE_1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FlavorEnum(String value) {
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
        public static FlavorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlavorEnum(value));
        }

        public static FlavorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FlavorEnum) {
                return this.value.equals(((FlavorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private FlavorEnum flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azList")

    private List<String> azList = null;

    /**
     * ServiceComb引擎专享版与注册配置中心认证方式，RBAC为安全认证，NONE为无认证。
     */
    public static final class AuthTypeEnum {

        /**
         * Enum RBAC for value: "RBAC"
         */
        public static final AuthTypeEnum RBAC = new AuthTypeEnum("RBAC");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final AuthTypeEnum NONE = new AuthTypeEnum("NONE");

        private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTypeEnum> createStaticFields() {
            Map<String, AuthTypeEnum> map = new HashMap<>();
            map.put("RBAC", RBAC);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthTypeEnum(String value) {
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
        public static AuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthTypeEnum(value));
        }

        public static AuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthTypeEnum) {
                return this.value.equals(((AuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authType")

    private AuthTypeEnum authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private String vpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcId")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkId")

    private String networkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetCidr")

    private String subnetCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicIpId")

    private String publicIpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_cred")

    private EngineRbacPwd authCred;

    /**
     * 微服务引擎部署类型
     */
    public static final class SpecTypeEnum {

        /**
         * Enum CSE2 for value: "CSE2"
         */
        public static final SpecTypeEnum CSE2 = new SpecTypeEnum("CSE2");

        /**
         * Enum NACOS2 for value: "Nacos2"
         */
        public static final SpecTypeEnum NACOS2 = new SpecTypeEnum("Nacos2");

        /**
         * Enum MICROGATEWAY for value: "MicroGateway"
         */
        public static final SpecTypeEnum MICROGATEWAY = new SpecTypeEnum("MicroGateway");

        private static final Map<String, SpecTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecTypeEnum> createStaticFields() {
            Map<String, SpecTypeEnum> map = new HashMap<>();
            map.put("CSE2", CSE2);
            map.put("Nacos2", NACOS2);
            map.put("MicroGateway", MICROGATEWAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecTypeEnum(String value) {
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
        public static SpecTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SpecTypeEnum(value));
        }

        public static SpecTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SpecTypeEnum) {
                return this.value.equals(((SpecTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specType")

    private SpecTypeEnum specType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private Map<String, String> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enginestateInfo")

    private EngineCreateReqEnginestateInfo enginestateInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodType")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorType")

    private EngineCreateReqFlavorType flavorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterpriseProject")

    private EngineCreateReqEnterpriseProject enterpriseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcCidr")

    private String vpcCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceParams")

    private EngineCreateReqResourceParams resourceParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "productId")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacityProductId")

    private String capacityProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isFree")

    private Boolean isFree;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetName")

    private String subnetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintenanceConfig")

    private EngineCreateReqMaintenanceConfig maintenanceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elbid")

    private String elbid;

    public EngineCreateReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 微服务引擎的名称，名称为字母开头，字母、数字、-组成，且不能以-结尾，3-24个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EngineCreateReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 微服务引擎描述，长度0~255。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EngineCreateReq withPayment(PaymentEnum payment) {
        this.payment = payment;
        return this;
    }

    /**
     * 微服务引擎计费方式，1表示按需
     * @return payment
     */
    public PaymentEnum getPayment() {
        return payment;
    }

    public void setPayment(PaymentEnum payment) {
        this.payment = payment;
    }

    public EngineCreateReq withFlavor(FlavorEnum flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 微服务引擎的规格
     * @return flavor
     */
    public FlavorEnum getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorEnum flavor) {
        this.flavor = flavor;
    }

    public EngineCreateReq withAzList(List<String> azList) {
        this.azList = azList;
        return this;
    }

    public EngineCreateReq addAzListItem(String azListItem) {
        if (this.azList == null) {
            this.azList = new ArrayList<>();
        }
        this.azList.add(azListItem);
        return this;
    }

    public EngineCreateReq withAzList(Consumer<List<String>> azListSetter) {
        if (this.azList == null) {
            this.azList = new ArrayList<>();
        }
        azListSetter.accept(this.azList);
        return this;
    }

    /**
     * 当前局点可用区列表，创建ServiceComb引擎专享版需要填写。
     * @return azList
     */
    public List<String> getAzList() {
        return azList;
    }

    public void setAzList(List<String> azList) {
        this.azList = azList;
    }

    public EngineCreateReq withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * ServiceComb引擎专享版与注册配置中心认证方式，RBAC为安全认证，NONE为无认证。
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public EngineCreateReq withVpc(String vpc) {
        this.vpc = vpc;
        return this;
    }

    /**
     * vpc名称
     * @return vpc
     */
    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    public EngineCreateReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * vpc标识
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public EngineCreateReq withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * 微服务引擎子网ID
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public EngineCreateReq withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * 微服务引擎子网划分
     * @return subnetCidr
     */
    public String getSubnetCidr() {
        return subnetCidr;
    }

    public void setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
    }

    public EngineCreateReq withPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
        return this;
    }

    /**
     * ServiceComb引擎专享版公网地址ID，当前为null
     * @return publicIpId
     */
    public String getPublicIpId() {
        return publicIpId;
    }

    public void setPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
    }

    public EngineCreateReq withAuthCred(EngineRbacPwd authCred) {
        this.authCred = authCred;
        return this;
    }

    public EngineCreateReq withAuthCred(Consumer<EngineRbacPwd> authCredSetter) {
        if (this.authCred == null) {
            this.authCred = new EngineRbacPwd();
            authCredSetter.accept(this.authCred);
        }

        return this;
    }

    /**
     * Get authCred
     * @return authCred
     */
    public EngineRbacPwd getAuthCred() {
        return authCred;
    }

    public void setAuthCred(EngineRbacPwd authCred) {
        this.authCred = authCred;
    }

    public EngineCreateReq withSpecType(SpecTypeEnum specType) {
        this.specType = specType;
        return this;
    }

    /**
     * 微服务引擎部署类型
     * @return specType
     */
    public SpecTypeEnum getSpecType() {
        return specType;
    }

    public void setSpecType(SpecTypeEnum specType) {
        this.specType = specType;
    }

    public EngineCreateReq withInputs(Map<String, String> inputs) {
        this.inputs = inputs;
        return this;
    }

    public EngineCreateReq putInputsItem(String key, String inputsItem) {
        if (this.inputs == null) {
            this.inputs = new HashMap<>();
        }
        this.inputs.put(key, inputsItem);
        return this;
    }

    public EngineCreateReq withInputs(Consumer<Map<String, String>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new HashMap<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 引擎附加参数
     * @return inputs
     */
    public Map<String, String> getInputs() {
        return inputs;
    }

    public void setInputs(Map<String, String> inputs) {
        this.inputs = inputs;
    }

    public EngineCreateReq withEnginestateInfo(EngineCreateReqEnginestateInfo enginestateInfo) {
        this.enginestateInfo = enginestateInfo;
        return this;
    }

    public EngineCreateReq withEnginestateInfo(Consumer<EngineCreateReqEnginestateInfo> enginestateInfoSetter) {
        if (this.enginestateInfo == null) {
            this.enginestateInfo = new EngineCreateReqEnginestateInfo();
            enginestateInfoSetter.accept(this.enginestateInfo);
        }

        return this;
    }

    /**
     * Get enginestateInfo
     * @return enginestateInfo
     */
    public EngineCreateReqEnginestateInfo getEnginestateInfo() {
        return enginestateInfo;
    }

    public void setEnginestateInfo(EngineCreateReqEnginestateInfo enginestateInfo) {
        this.enginestateInfo = enginestateInfo;
    }

    public EngineCreateReq withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 创建阶段类型
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public EngineCreateReq withFlavorType(EngineCreateReqFlavorType flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    public EngineCreateReq withFlavorType(Consumer<EngineCreateReqFlavorType> flavorTypeSetter) {
        if (this.flavorType == null) {
            this.flavorType = new EngineCreateReqFlavorType();
            flavorTypeSetter.accept(this.flavorType);
        }

        return this;
    }

    /**
     * Get flavorType
     * @return flavorType
     */
    public EngineCreateReqFlavorType getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(EngineCreateReqFlavorType flavorType) {
        this.flavorType = flavorType;
    }

    public EngineCreateReq withEnterpriseProject(EngineCreateReqEnterpriseProject enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
        return this;
    }

    public EngineCreateReq withEnterpriseProject(Consumer<EngineCreateReqEnterpriseProject> enterpriseProjectSetter) {
        if (this.enterpriseProject == null) {
            this.enterpriseProject = new EngineCreateReqEnterpriseProject();
            enterpriseProjectSetter.accept(this.enterpriseProject);
        }

        return this;
    }

    /**
     * Get enterpriseProject
     * @return enterpriseProject
     */
    public EngineCreateReqEnterpriseProject getEnterpriseProject() {
        return enterpriseProject;
    }

    public void setEnterpriseProject(EngineCreateReqEnterpriseProject enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
    }

    public EngineCreateReq withVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    /**
     * 网关vpc划分
     * @return vpcCidr
     */
    public String getVpcCidr() {
        return vpcCidr;
    }

    public void setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
    }

    public EngineCreateReq withResourceParams(EngineCreateReqResourceParams resourceParams) {
        this.resourceParams = resourceParams;
        return this;
    }

    public EngineCreateReq withResourceParams(Consumer<EngineCreateReqResourceParams> resourceParamsSetter) {
        if (this.resourceParams == null) {
            this.resourceParams = new EngineCreateReqResourceParams();
            resourceParamsSetter.accept(this.resourceParams);
        }

        return this;
    }

    /**
     * Get resourceParams
     * @return resourceParams
     */
    public EngineCreateReqResourceParams getResourceParams() {
        return resourceParams;
    }

    public void setResourceParams(EngineCreateReqResourceParams resourceParams) {
        this.resourceParams = resourceParams;
    }

    public EngineCreateReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public EngineCreateReq withCapacityProductId(String capacityProductId) {
        this.capacityProductId = capacityProductId;
        return this;
    }

    /**
     * 容量产品ID
     * @return capacityProductId
     */
    public String getCapacityProductId() {
        return capacityProductId;
    }

    public void setCapacityProductId(String capacityProductId) {
        this.capacityProductId = capacityProductId;
    }

    public EngineCreateReq withIsFree(Boolean isFree) {
        this.isFree = isFree;
        return this;
    }

    /**
     * 微服务引擎是否免费
     * @return isFree
     */
    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public EngineCreateReq withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * 微服务引擎使用的子网名称
     * @return subnetName
     */
    public String getSubnetName() {
        return subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public EngineCreateReq withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public EngineCreateReq addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public EngineCreateReq withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public EngineCreateReq withMaintenanceConfig(EngineCreateReqMaintenanceConfig maintenanceConfig) {
        this.maintenanceConfig = maintenanceConfig;
        return this;
    }

    public EngineCreateReq withMaintenanceConfig(Consumer<EngineCreateReqMaintenanceConfig> maintenanceConfigSetter) {
        if (this.maintenanceConfig == null) {
            this.maintenanceConfig = new EngineCreateReqMaintenanceConfig();
            maintenanceConfigSetter.accept(this.maintenanceConfig);
        }

        return this;
    }

    /**
     * Get maintenanceConfig
     * @return maintenanceConfig
     */
    public EngineCreateReqMaintenanceConfig getMaintenanceConfig() {
        return maintenanceConfig;
    }

    public void setMaintenanceConfig(EngineCreateReqMaintenanceConfig maintenanceConfig) {
        this.maintenanceConfig = maintenanceConfig;
    }

    public EngineCreateReq withElbid(String elbid) {
        this.elbid = elbid;
        return this;
    }

    /**
     * 微服务引擎使用的elb的id
     * @return elbid
     */
    public String getElbid() {
        return elbid;
    }

    public void setElbid(String elbid) {
        this.elbid = elbid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EngineCreateReq that = (EngineCreateReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.payment, that.payment) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.azList, that.azList) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.vpc, that.vpc) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.networkId, that.networkId) && Objects.equals(this.subnetCidr, that.subnetCidr)
            && Objects.equals(this.publicIpId, that.publicIpId) && Objects.equals(this.authCred, that.authCred)
            && Objects.equals(this.specType, that.specType) && Objects.equals(this.inputs, that.inputs)
            && Objects.equals(this.enginestateInfo, that.enginestateInfo)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.flavorType, that.flavorType)
            && Objects.equals(this.enterpriseProject, that.enterpriseProject)
            && Objects.equals(this.vpcCidr, that.vpcCidr) && Objects.equals(this.resourceParams, that.resourceParams)
            && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.capacityProductId, that.capacityProductId)
            && Objects.equals(this.isFree, that.isFree) && Objects.equals(this.subnetName, that.subnetName)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.maintenanceConfig, that.maintenanceConfig)
            && Objects.equals(this.elbid, that.elbid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            payment,
            flavor,
            azList,
            authType,
            vpc,
            vpcId,
            networkId,
            subnetCidr,
            publicIpId,
            authCred,
            specType,
            inputs,
            enginestateInfo,
            periodType,
            flavorType,
            enterpriseProject,
            vpcCidr,
            resourceParams,
            productId,
            capacityProductId,
            isFree,
            subnetName,
            tags,
            maintenanceConfig,
            elbid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineCreateReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    azList: ").append(toIndentedString(azList)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    subnetCidr: ").append(toIndentedString(subnetCidr)).append("\n");
        sb.append("    publicIpId: ").append(toIndentedString(publicIpId)).append("\n");
        sb.append("    authCred: ").append(toIndentedString(authCred)).append("\n");
        sb.append("    specType: ").append(toIndentedString(specType)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    enginestateInfo: ").append(toIndentedString(enginestateInfo)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    flavorType: ").append(toIndentedString(flavorType)).append("\n");
        sb.append("    enterpriseProject: ").append(toIndentedString(enterpriseProject)).append("\n");
        sb.append("    vpcCidr: ").append(toIndentedString(vpcCidr)).append("\n");
        sb.append("    resourceParams: ").append(toIndentedString(resourceParams)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    capacityProductId: ").append(toIndentedString(capacityProductId)).append("\n");
        sb.append("    isFree: ").append(toIndentedString(isFree)).append("\n");
        sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    maintenanceConfig: ").append(toIndentedString(maintenanceConfig)).append("\n");
        sb.append("    elbid: ").append(toIndentedString(elbid)).append("\n");
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
