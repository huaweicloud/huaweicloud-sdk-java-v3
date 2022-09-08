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
 * 创建微服务引擎专享版请求结构体
 */
public class EngineCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 微服务引擎专享版计费方式，1表示按需
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
            PaymentEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PaymentEnum(value);
            }
            return result;
        }

        public static PaymentEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PaymentEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
     * 微服务引擎专享版的规格
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

        private static final Map<String, FlavorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FlavorEnum> createStaticFields() {
            Map<String, FlavorEnum> map = new HashMap<>();
            map.put("cse.s1.small2", CSE_S1_SMALL2);
            map.put("cse.s1.medium2", CSE_S1_MEDIUM2);
            map.put("cse.s1.large2", CSE_S1_LARGE2);
            map.put("cse.s1.xlarge2", CSE_S1_XLARGE2);
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
            FlavorEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FlavorEnum(value);
            }
            return result;
        }

        public static FlavorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FlavorEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    * 微服务引擎专享版认证方式，RBAC为安全认证，NONE为无认证。
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
            AuthTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AuthTypeEnum(value);
            }
            return result;
        }

        public static AuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AuthTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
     * 微服务引擎专享版应用部署类型
     */
    public static final class SpecTypeEnum {

        /**
         * Enum CSE for value: "CSE"
         */
        public static final SpecTypeEnum CSE = new SpecTypeEnum("CSE");

        /**
         * Enum CSE2 for value: "CSE2"
         */
        public static final SpecTypeEnum CSE2 = new SpecTypeEnum("CSE2");

        private static final Map<String, SpecTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecTypeEnum> createStaticFields() {
            Map<String, SpecTypeEnum> map = new HashMap<>();
            map.put("CSE", CSE);
            map.put("CSE2", CSE2);
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
            SpecTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SpecTypeEnum(value);
            }
            return result;
        }

        public static SpecTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SpecTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public EngineCreateReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 微服务引擎专享版的名称，名称为字母开头，字母、数字、-组成，且不能以-结尾，3-24个字符。
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
     * 微服务引擎专享版描述，长度0~255。
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
     * 微服务引擎专享版计费方式，1表示按需
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
     * 微服务引擎专享版的规格
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
     * 当前局点可用区列表。
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
     * 微服务引擎专享版认证方式，RBAC为安全认证，NONE为无认证。
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

    public EngineCreateReq withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * 微服务引擎专享版子网ID
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
     * 微服务引擎专享版子网划分
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
     * 微服务引擎专享版公网地址ID，当前为null
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
     * 微服务引擎专享版应用部署类型
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EngineCreateReq engineCreateReq = (EngineCreateReq) o;
        return Objects.equals(this.name, engineCreateReq.name)
            && Objects.equals(this.description, engineCreateReq.description)
            && Objects.equals(this.payment, engineCreateReq.payment)
            && Objects.equals(this.flavor, engineCreateReq.flavor)
            && Objects.equals(this.azList, engineCreateReq.azList)
            && Objects.equals(this.authType, engineCreateReq.authType) && Objects.equals(this.vpc, engineCreateReq.vpc)
            && Objects.equals(this.networkId, engineCreateReq.networkId)
            && Objects.equals(this.subnetCidr, engineCreateReq.subnetCidr)
            && Objects.equals(this.publicIpId, engineCreateReq.publicIpId)
            && Objects.equals(this.authCred, engineCreateReq.authCred)
            && Objects.equals(this.specType, engineCreateReq.specType)
            && Objects.equals(this.inputs, engineCreateReq.inputs);
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
            networkId,
            subnetCidr,
            publicIpId,
            authCred,
            specType,
            inputs);
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
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    subnetCidr: ").append(toIndentedString(subnetCidr)).append("\n");
        sb.append("    publicIpId: ").append(toIndentedString(publicIpId)).append("\n");
        sb.append("    authCred: ").append(toIndentedString(authCred)).append("\n");
        sb.append("    specType: ").append(toIndentedString(specType)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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
