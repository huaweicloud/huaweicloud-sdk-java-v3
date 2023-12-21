package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 物理专线对象
 */
public class DirectConnect {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 物理专线接入接口的类型，支持1G 10G 40G 100G
     */
    public static final class PortTypeEnum {

        /**
         * Enum _1G for value: "1G"
         */
        public static final PortTypeEnum _1G = new PortTypeEnum("1G");

        /**
         * Enum _10G for value: "10G"
         */
        public static final PortTypeEnum _10G = new PortTypeEnum("10G");

        /**
         * Enum _40G for value: "40G"
         */
        public static final PortTypeEnum _40G = new PortTypeEnum("40G");

        /**
         * Enum _100G for value: "100G"
         */
        public static final PortTypeEnum _100G = new PortTypeEnum("100G");

        private static final Map<String, PortTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PortTypeEnum> createStaticFields() {
            Map<String, PortTypeEnum> map = new HashMap<>();
            map.put("1G", _1G);
            map.put("10G", _10G);
            map.put("40G", _40G);
            map.put("100G", _100G);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PortTypeEnum(String value) {
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
        public static PortTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PortTypeEnum(value));
        }

        public static PortTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PortTypeEnum) {
                return this.value.equals(((PortTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_type")

    private PortTypeEnum portType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_location")

    private String peerLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    /**
     * 物理专线的类型，类型包括标准(standard)，运营专线(hosting)，托管专线（hosted）[，一站式标准（onestop_standard），一站式托管（onestop_hosted）](tag:hws)。
     */
    public static final class TypeEnum {

        /**
         * Enum STANDARD for value: "standard"
         */
        public static final TypeEnum STANDARD = new TypeEnum("standard");

        /**
         * Enum HOSTING for value: "hosting"
         */
        public static final TypeEnum HOSTING = new TypeEnum("hosting");

        /**
         * Enum HOSTED for value: "hosted"
         */
        public static final TypeEnum HOSTED = new TypeEnum("hosted");

        /**
         * Enum ONESTOP_STANDARD for value: "onestop_standard"
         */
        public static final TypeEnum ONESTOP_STANDARD = new TypeEnum("onestop_standard");

        /**
         * Enum ONESTOP_HOSTED for value: "onestop_hosted"
         */
        public static final TypeEnum ONESTOP_HOSTED = new TypeEnum("onestop_hosted");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("standard", STANDARD);
            map.put("hosting", HOSTING);
            map.put("hosted", HOSTED);
            map.put("onestop_standard", ONESTOP_STANDARD);
            map.put("onestop_hosted", ONESTOP_HOSTED);
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
    @JsonProperty(value = "hosting_id")

    private String hostingId;

    /**
     * 计费模式：prepayment/bandwidth/traffic
     */
    public static final class ChargeModeEnum {

        /**
         * Enum PREPAYMENT for value: "prepayment"
         */
        public static final ChargeModeEnum PREPAYMENT = new ChargeModeEnum("prepayment");

        /**
         * Enum BANDWIDTH for value: "bandwidth"
         */
        public static final ChargeModeEnum BANDWIDTH = new ChargeModeEnum("bandwidth");

        /**
         * Enum TRAFFIC for value: "traffic"
         */
        public static final ChargeModeEnum TRAFFIC = new ChargeModeEnum("traffic");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("prepayment", PREPAYMENT);
            map.put("bandwidth", BANDWIDTH);
            map.put("traffic", TRAFFIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargeModeEnum(String value) {
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
        public static ChargeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargeModeEnum(value));
        }

        public static ChargeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargeModeEnum) {
                return this.value.equals(((ChargeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private ChargeModeEnum chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vlan")

    private Integer vlan;

    /**
     * 资源状态，合法值是： ACTIVE：专线已经开通完成且线路处于正常状态 DOWN：专线对应的端口处于down的状态，可能存在线路故障等异常。 BUILD：申请专线正在施工建设中 ERROR：专线配置异常，请联系客服解决相关问题。 PENDING_DELETE：正在删除 DELETED：已删除 APPLY：申请开通 DENY：客户需求无法满足，拒绝工勘。 PENDING_PAY：待支付 PAID：已支付 PENDING_SURVEY：待工勘
     */
    public static final class StatusEnum {

        /**
         * Enum BUILD for value: "BUILD"
         */
        public static final StatusEnum BUILD = new StatusEnum("BUILD");

        /**
         * Enum PAID for value: "PAID"
         */
        public static final StatusEnum PAID = new StatusEnum("PAID");

        /**
         * Enum APPLY for value: "APPLY"
         */
        public static final StatusEnum APPLY = new StatusEnum("APPLY");

        /**
         * Enum PENDING_SURVEY for value: "PENDING_SURVEY"
         */
        public static final StatusEnum PENDING_SURVEY = new StatusEnum("PENDING_SURVEY");

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final StatusEnum DOWN = new StatusEnum("DOWN");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum PENDING_DELETE for value: "PENDING_DELETE"
         */
        public static final StatusEnum PENDING_DELETE = new StatusEnum("PENDING_DELETE");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum DENY for value: "DENY"
         */
        public static final StatusEnum DENY = new StatusEnum("DENY");

        /**
         * Enum PENDING_PAY for value: "PENDING_PAY"
         */
        public static final StatusEnum PENDING_PAY = new StatusEnum("PENDING_PAY");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("BUILD", BUILD);
            map.put("PAID", PAID);
            map.put("APPLY", APPLY);
            map.put("PENDING_SURVEY", PENDING_SURVEY);
            map.put("ACTIVE", ACTIVE);
            map.put("DOWN", DOWN);
            map.put("ERROR", ERROR);
            map.put("PENDING_DELETE", PENDING_DELETE);
            map.put("DELETED", DELETED);
            map.put("DENY", DENY);
            map.put("PENDING_PAY", PENDING_PAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_time")

    private OffsetDateTime applyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    /**
     * 物理专线的运营商操作状态，合法值是：ACTIVE， DOWN
     */
    public static final class ProviderStatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final ProviderStatusEnum ACTIVE = new ProviderStatusEnum("ACTIVE");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final ProviderStatusEnum DOWN = new ProviderStatusEnum("DOWN");

        private static final Map<String, ProviderStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProviderStatusEnum> createStaticFields() {
            Map<String, ProviderStatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("DOWN", DOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProviderStatusEnum(String value) {
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
        public static ProviderStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProviderStatusEnum(value));
        }

        public static ProviderStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProviderStatusEnum) {
                return this.value.equals(((ProviderStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_status")

    private ProviderStatusEnum providerStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_port_type")

    private String peerPortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_provider")

    private String peerProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    /**
     * 专线要求的网关类型
     */
    public static final class VgwTypeEnum {

        /**
         * Enum DEFAULT for value: "default"
         */
        public static final VgwTypeEnum DEFAULT = new VgwTypeEnum("default");

        private static final Map<String, VgwTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VgwTypeEnum> createStaticFields() {
            Map<String, VgwTypeEnum> map = new HashMap<>();
            map.put("default", DEFAULT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VgwTypeEnum(String value) {
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
        public static VgwTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VgwTypeEnum(value));
        }

        public static VgwTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VgwTypeEnum) {
                return this.value.equals(((VgwTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_type")

    private VgwTypeEnum vgwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lag_id")

    private String lagId;

    /**
     * 专线协议的签暑状态
     */
    public static final class SignedAgreementStatusEnum {

        /**
         * Enum SIGNED for value: "signed"
         */
        public static final SignedAgreementStatusEnum SIGNED = new SignedAgreementStatusEnum("signed");

        private static final Map<String, SignedAgreementStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SignedAgreementStatusEnum> createStaticFields() {
            Map<String, SignedAgreementStatusEnum> map = new HashMap<>();
            map.put("signed", SIGNED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SignedAgreementStatusEnum(String value) {
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
        public static SignedAgreementStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SignedAgreementStatusEnum(value));
        }

        public static SignedAgreementStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SignedAgreementStatusEnum) {
                return this.value.equals(((SignedAgreementStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signed_agreement_status")

    private SignedAgreementStatusEnum signedAgreementStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signed_agreement_time")

    private OffsetDateTime signedAgreementTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locales")

    private LocalesBody locales;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_feature")

    private List<String> supportFeature = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ies_id")

    private String iesId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "onestop_product_id")

    private String onestopProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "building_line_product_id")

    private String buildingLineProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_onestop_product_id")

    private String lastOnestopProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_building_line_product_id")

    private String lastBuildingLineProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_bandwidth")

    private Integer modifiedBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_mode")

    private Integer changeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "onestopdc_status")

    private String onestopdcStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_renew")

    private Integer autoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio_95peak")

    private Integer ratio95peak;

    public DirectConnect withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 物理专线标识符ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DirectConnect withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 实例所属项目ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public DirectConnect withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 物理专线名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DirectConnect withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 物理专线描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DirectConnect withPortType(PortTypeEnum portType) {
        this.portType = portType;
        return this;
    }

    /**
     * 物理专线接入接口的类型，支持1G 10G 40G 100G
     * @return portType
     */
    public PortTypeEnum getPortType() {
        return portType;
    }

    public void setPortType(PortTypeEnum portType) {
        this.portType = portType;
    }

    public DirectConnect withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 物理专线接入带宽，单位Mbps。
     * minimum: 2
     * maximum: 100000
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public DirectConnect withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 专线的接入位置信息
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public DirectConnect withPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }

    /**
     * 物理专线对端所在的物理位置，省/市/街道或IDC名字。
     * @return peerLocation
     */
    public String getPeerLocation() {
        return peerLocation;
    }

    public void setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
    }

    public DirectConnect withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 物理专线连接的设备的标识ID
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public DirectConnect withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 物理专线的类型，类型包括标准(standard)，运营专线(hosting)，托管专线（hosted）[，一站式标准（onestop_standard），一站式托管（onestop_hosted）](tag:hws)。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public DirectConnect withHostingId(String hostingId) {
        this.hostingId = hostingId;
        return this;
    }

    /**
     * hosted物理专线对应的hosting物理专线的ID
     * @return hostingId
     */
    public String getHostingId() {
        return hostingId;
    }

    public void setHostingId(String hostingId) {
        this.hostingId = hostingId;
    }

    public DirectConnect withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式：prepayment/bandwidth/traffic
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public DirectConnect withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 物理专线连接的线路运营商 [如：中国电信 中国联通 中国移动 中国其他 境外其他专线归属的运营商](tag:hws,hws_hk)
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public DirectConnect withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 管理状态：true或false
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public DirectConnect withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    /**
     * 为托管hosted物理专线分配的vlan。
     * minimum: 0
     * maximum: 3999
     * @return vlan
     */
    public Integer getVlan() {
        return vlan;
    }

    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }

    public DirectConnect withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态，合法值是： ACTIVE：专线已经开通完成且线路处于正常状态 DOWN：专线对应的端口处于down的状态，可能存在线路故障等异常。 BUILD：申请专线正在施工建设中 ERROR：专线配置异常，请联系客服解决相关问题。 PENDING_DELETE：正在删除 DELETED：已删除 APPLY：申请开通 DENY：客户需求无法满足，拒绝工勘。 PENDING_PAY：待支付 PAID：已支付 PENDING_SURVEY：待工勘
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public DirectConnect withApplyTime(OffsetDateTime applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    /**
     * 物理专线的申请时间
     * @return applyTime
     */
    public OffsetDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(OffsetDateTime applyTime) {
        this.applyTime = applyTime;
    }

    public DirectConnect withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 物理专线的创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public DirectConnect withProviderStatus(ProviderStatusEnum providerStatus) {
        this.providerStatus = providerStatus;
        return this;
    }

    /**
     * 物理专线的运营商操作状态，合法值是：ACTIVE， DOWN
     * @return providerStatus
     */
    public ProviderStatusEnum getProviderStatus() {
        return providerStatus;
    }

    public void setProviderStatus(ProviderStatusEnum providerStatus) {
        this.providerStatus = providerStatus;
    }

    public DirectConnect withPeerPortType(String peerPortType) {
        this.peerPortType = peerPortType;
        return this;
    }

    /**
     * 连接对端的端口类型
     * @return peerPortType
     */
    public String getPeerPortType() {
        return peerPortType;
    }

    public void setPeerPortType(String peerPortType) {
        this.peerPortType = peerPortType;
    }

    public DirectConnect withPeerProvider(String peerProvider) {
        this.peerProvider = peerProvider;
        return this;
    }

    /**
     * 专线连接对接的运营商
     * @return peerProvider
     */
    public String getPeerProvider() {
        return peerProvider;
    }

    public void setPeerProvider(String peerProvider) {
        this.peerProvider = peerProvider;
    }

    public DirectConnect withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 物理专线对应订单号，用于支持包周期计费，识别用户订单
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public DirectConnect withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 物理专线订单对应产品标识，用于订制包周期套餐等计费策略
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public DirectConnect withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 物理专线订单对应产品规格，用于订制包周期套餐等计费策略
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public DirectConnect withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 物理专线对应订单号对应包周期的类型
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public DirectConnect withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 物理专线对应的包周期时间
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public DirectConnect withVgwType(VgwTypeEnum vgwType) {
        this.vgwType = vgwType;
        return this;
    }

    /**
     * 专线要求的网关类型
     * @return vgwType
     */
    public VgwTypeEnum getVgwType() {
        return vgwType;
    }

    public void setVgwType(VgwTypeEnum vgwType) {
        this.vgwType = vgwType;
    }

    public DirectConnect withLagId(String lagId) {
        this.lagId = lagId;
        return this;
    }

    /**
     * 物理专线归属的链路聚合组(lag）的ID
     * @return lagId
     */
    public String getLagId() {
        return lagId;
    }

    public void setLagId(String lagId) {
        this.lagId = lagId;
    }

    public DirectConnect withSignedAgreementStatus(SignedAgreementStatusEnum signedAgreementStatus) {
        this.signedAgreementStatus = signedAgreementStatus;
        return this;
    }

    /**
     * 专线协议的签暑状态
     * @return signedAgreementStatus
     */
    public SignedAgreementStatusEnum getSignedAgreementStatus() {
        return signedAgreementStatus;
    }

    public void setSignedAgreementStatus(SignedAgreementStatusEnum signedAgreementStatus) {
        this.signedAgreementStatus = signedAgreementStatus;
    }

    public DirectConnect withSignedAgreementTime(OffsetDateTime signedAgreementTime) {
        this.signedAgreementTime = signedAgreementTime;
        return this;
    }

    /**
     * 专线协议的签暑时间
     * @return signedAgreementTime
     */
    public OffsetDateTime getSignedAgreementTime() {
        return signedAgreementTime;
    }

    public void setSignedAgreementTime(OffsetDateTime signedAgreementTime) {
        this.signedAgreementTime = signedAgreementTime;
    }

    public DirectConnect withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 实例所属企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public DirectConnect withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public DirectConnect addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public DirectConnect withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public DirectConnect withLocales(LocalesBody locales) {
        this.locales = locales;
        return this;
    }

    public DirectConnect withLocales(Consumer<LocalesBody> localesSetter) {
        if (this.locales == null) {
            this.locales = new LocalesBody();
            localesSetter.accept(this.locales);
        }

        return this;
    }

    /**
     * Get locales
     * @return locales
     */
    public LocalesBody getLocales() {
        return locales;
    }

    public void setLocales(LocalesBody locales) {
        this.locales = locales;
    }

    public DirectConnect withSupportFeature(List<String> supportFeature) {
        this.supportFeature = supportFeature;
        return this;
    }

    public DirectConnect addSupportFeatureItem(String supportFeatureItem) {
        if (this.supportFeature == null) {
            this.supportFeature = new ArrayList<>();
        }
        this.supportFeature.add(supportFeatureItem);
        return this;
    }

    public DirectConnect withSupportFeature(Consumer<List<String>> supportFeatureSetter) {
        if (this.supportFeature == null) {
            this.supportFeature = new ArrayList<>();
        }
        supportFeatureSetter.accept(this.supportFeature);
        return this;
    }

    /**
     * 用户专线可支持的特性列表[（功能暂不支持）](tag:dt)
     * @return supportFeature
     */
    public List<String> getSupportFeature() {
        return supportFeature;
    }

    public void setSupportFeature(List<String> supportFeature) {
        this.supportFeature = supportFeature;
    }

    public DirectConnect withIesId(String iesId) {
        this.iesId = iesId;
        return this;
    }

    /**
     * 归属的IES站点的ID[（功能暂不支持）](tag:dt)
     * @return iesId
     */
    public String getIesId() {
        return iesId;
    }

    public void setIesId(String iesId) {
        this.iesId = iesId;
    }

    public DirectConnect withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 如果专线资源的状态是Error的情况下，该参数会显示相关错误信息。[（功能暂不支持）](tag:dt)
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public DirectConnect withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 客户邮箱信息[（功能暂不支持）](tag:dt)
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DirectConnect withOnestopProductId(String onestopProductId) {
        this.onestopProductId = onestopProductId;
        return this;
    }

    /**
     * 该参数用于销售线路场景，标识一站式专线产品ID[（功能暂不支持）](tag:dt)
     * @return onestopProductId
     */
    public String getOnestopProductId() {
        return onestopProductId;
    }

    public void setOnestopProductId(String onestopProductId) {
        this.onestopProductId = onestopProductId;
    }

    public DirectConnect withBuildingLineProductId(String buildingLineProductId) {
        this.buildingLineProductId = buildingLineProductId;
        return this;
    }

    /**
     * 该参数用于销售线路场景，标识机房内部线路资源产品ID[（功能暂不支持）](tag:dt)
     * @return buildingLineProductId
     */
    public String getBuildingLineProductId() {
        return buildingLineProductId;
    }

    public void setBuildingLineProductId(String buildingLineProductId) {
        this.buildingLineProductId = buildingLineProductId;
    }

    public DirectConnect withLastOnestopProductId(String lastOnestopProductId) {
        this.lastOnestopProductId = lastOnestopProductId;
        return this;
    }

    /**
     * 该参数用于销售线路场景，标识变更前的一站式专线产品ID，用于在做线路带宽变更时保存上一次的记录。[（功能暂不支持）](tag:dt)
     * @return lastOnestopProductId
     */
    public String getLastOnestopProductId() {
        return lastOnestopProductId;
    }

    public void setLastOnestopProductId(String lastOnestopProductId) {
        this.lastOnestopProductId = lastOnestopProductId;
    }

    public DirectConnect withLastBuildingLineProductId(String lastBuildingLineProductId) {
        this.lastBuildingLineProductId = lastBuildingLineProductId;
        return this;
    }

    /**
     * 该参数用于销售线路场景，标识变更前机房内部线路资源产品ID，用于在做线路带宽变更时保存上一次的记录。[（功能暂不支持）](tag:dt)
     * @return lastBuildingLineProductId
     */
    public String getLastBuildingLineProductId() {
        return lastBuildingLineProductId;
    }

    public void setLastBuildingLineProductId(String lastBuildingLineProductId) {
        this.lastBuildingLineProductId = lastBuildingLineProductId;
    }

    public DirectConnect withModifiedBandwidth(Integer modifiedBandwidth) {
        this.modifiedBandwidth = modifiedBandwidth;
        return this;
    }

    /**
     * 线路带宽变更后的带宽值[（功能暂不支持）](tag:dt)
     * @return modifiedBandwidth
     */
    public Integer getModifiedBandwidth() {
        return modifiedBandwidth;
    }

    public void setModifiedBandwidth(Integer modifiedBandwidth) {
        this.modifiedBandwidth = modifiedBandwidth;
    }

    public DirectConnect withChangeMode(Integer changeMode) {
        this.changeMode = changeMode;
        return this;
    }

    /**
     * 标识续费变更的一种状态[（功能暂不支持）](tag:dt)
     * @return changeMode
     */
    public Integer getChangeMode() {
        return changeMode;
    }

    public void setChangeMode(Integer changeMode) {
        this.changeMode = changeMode;
    }

    public DirectConnect withOnestopdcStatus(String onestopdcStatus) {
        this.onestopdcStatus = onestopdcStatus;
        return this;
    }

    /**
     * 一站式专线状态[（功能暂不支持）](tag:dt)
     * @return onestopdcStatus
     */
    public String getOnestopdcStatus() {
        return onestopdcStatus;
    }

    public void setOnestopdcStatus(String onestopdcStatus) {
        this.onestopdcStatus = onestopdcStatus;
    }

    public DirectConnect withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 归属的可用区对应的边界组(public border group)，标识是否homezone局点。[（功能暂不支持）](tag:dt)
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public DirectConnect withAutoRenew(Integer autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * 用于标识包周期产品是否自动续订[（功能暂不支持）](tag:dt)
     * @return autoRenew
     */
    public Integer getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(Integer autoRenew) {
        this.autoRenew = autoRenew;
    }

    public DirectConnect withRatio95peak(Integer ratio95peak) {
        this.ratio95peak = ratio95peak;
        return this;
    }

    /**
     * 95计费保底带宽率[（功能暂不支持）](tag:dt)
     * minimum: 0
     * maximum: 100
     * @return ratio95peak
     */
    public Integer getRatio95peak() {
        return ratio95peak;
    }

    public void setRatio95peak(Integer ratio95peak) {
        this.ratio95peak = ratio95peak;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DirectConnect that = (DirectConnect) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.portType, that.portType) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.location, that.location) && Objects.equals(this.peerLocation, that.peerLocation)
            && Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.hostingId, that.hostingId) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.vlan, that.vlan) && Objects.equals(this.status, that.status)
            && Objects.equals(this.applyTime, that.applyTime) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.providerStatus, that.providerStatus)
            && Objects.equals(this.peerPortType, that.peerPortType)
            && Objects.equals(this.peerProvider, that.peerProvider) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.vgwType, that.vgwType) && Objects.equals(this.lagId, that.lagId)
            && Objects.equals(this.signedAgreementStatus, that.signedAgreementStatus)
            && Objects.equals(this.signedAgreementTime, that.signedAgreementTime)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.locales, that.locales)
            && Objects.equals(this.supportFeature, that.supportFeature) && Objects.equals(this.iesId, that.iesId)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.email, that.email)
            && Objects.equals(this.onestopProductId, that.onestopProductId)
            && Objects.equals(this.buildingLineProductId, that.buildingLineProductId)
            && Objects.equals(this.lastOnestopProductId, that.lastOnestopProductId)
            && Objects.equals(this.lastBuildingLineProductId, that.lastBuildingLineProductId)
            && Objects.equals(this.modifiedBandwidth, that.modifiedBandwidth)
            && Objects.equals(this.changeMode, that.changeMode)
            && Objects.equals(this.onestopdcStatus, that.onestopdcStatus)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.autoRenew, that.autoRenew) && Objects.equals(this.ratio95peak, that.ratio95peak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tenantId,
            name,
            description,
            portType,
            bandwidth,
            location,
            peerLocation,
            deviceId,
            type,
            hostingId,
            chargeMode,
            provider,
            adminStateUp,
            vlan,
            status,
            applyTime,
            createTime,
            providerStatus,
            peerPortType,
            peerProvider,
            orderId,
            productId,
            specCode,
            periodType,
            periodNum,
            vgwType,
            lagId,
            signedAgreementStatus,
            signedAgreementTime,
            enterpriseProjectId,
            tags,
            locales,
            supportFeature,
            iesId,
            reason,
            email,
            onestopProductId,
            buildingLineProductId,
            lastOnestopProductId,
            lastBuildingLineProductId,
            modifiedBandwidth,
            changeMode,
            onestopdcStatus,
            publicBorderGroup,
            autoRenew,
            ratio95peak);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectConnect {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    peerLocation: ").append(toIndentedString(peerLocation)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    hostingId: ").append(toIndentedString(hostingId)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    providerStatus: ").append(toIndentedString(providerStatus)).append("\n");
        sb.append("    peerPortType: ").append(toIndentedString(peerPortType)).append("\n");
        sb.append("    peerProvider: ").append(toIndentedString(peerProvider)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    vgwType: ").append(toIndentedString(vgwType)).append("\n");
        sb.append("    lagId: ").append(toIndentedString(lagId)).append("\n");
        sb.append("    signedAgreementStatus: ").append(toIndentedString(signedAgreementStatus)).append("\n");
        sb.append("    signedAgreementTime: ").append(toIndentedString(signedAgreementTime)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
        sb.append("    supportFeature: ").append(toIndentedString(supportFeature)).append("\n");
        sb.append("    iesId: ").append(toIndentedString(iesId)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    onestopProductId: ").append(toIndentedString(onestopProductId)).append("\n");
        sb.append("    buildingLineProductId: ").append(toIndentedString(buildingLineProductId)).append("\n");
        sb.append("    lastOnestopProductId: ").append(toIndentedString(lastOnestopProductId)).append("\n");
        sb.append("    lastBuildingLineProductId: ").append(toIndentedString(lastBuildingLineProductId)).append("\n");
        sb.append("    modifiedBandwidth: ").append(toIndentedString(modifiedBandwidth)).append("\n");
        sb.append("    changeMode: ").append(toIndentedString(changeMode)).append("\n");
        sb.append("    onestopdcStatus: ").append(toIndentedString(onestopdcStatus)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
        sb.append("    ratio95peak: ").append(toIndentedString(ratio95peak)).append("\n");
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
