package com.huaweicloud.sdk.eip.v3.model;

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
 * Request Object
 */
public class ListPublicipsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<String> fields = null;

    /**
    * 排序，形式为\"sort_key=id\"  支持字段：id/public_ip_address/public_ipv6_address/ip_version/created_at/updated_at/public_border_group
    */
    public static final class SortKeyEnum {

        /**
         * Enum ID for value: "id"
         */
        public static final SortKeyEnum ID = new SortKeyEnum("id");

        /**
         * Enum PUBLIC_IP_ADDRESS for value: "public_ip_address"
         */
        public static final SortKeyEnum PUBLIC_IP_ADDRESS = new SortKeyEnum("public_ip_address");

        /**
         * Enum PUBLIC_IPV6_ADDRESS for value: "public_ipv6_address"
         */
        public static final SortKeyEnum PUBLIC_IPV6_ADDRESS = new SortKeyEnum("public_ipv6_address");

        /**
         * Enum IP_VERSION for value: "ip_version"
         */
        public static final SortKeyEnum IP_VERSION = new SortKeyEnum("ip_version");

        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final SortKeyEnum CREATED_AT = new SortKeyEnum("created_at");

        /**
         * Enum UPDATED_AT for value: "updated_at"
         */
        public static final SortKeyEnum UPDATED_AT = new SortKeyEnum("updated_at");

        /**
         * Enum PUBLIC_BORDER_GROUP for value: "public_border_group"
         */
        public static final SortKeyEnum PUBLIC_BORDER_GROUP = new SortKeyEnum("public_border_group");

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("id", ID);
            map.put("public_ip_address", PUBLIC_IP_ADDRESS);
            map.put("public_ipv6_address", PUBLIC_IPV6_ADDRESS);
            map.put("ip_version", IP_VERSION);
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
            map.put("public_border_group", PUBLIC_BORDER_GROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortKeyEnum(String value) {
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
        public static SortKeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortKeyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortKeyEnum(value);
            }
            return result;
        }

        public static SortKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortKeyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortKeyEnum) {
                return this.value.equals(((SortKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private SortKeyEnum sortKey;

    /**
     * 排序方向  取值范围：asc、desc
     */
    public static final class SortDirEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortDirEnum(value);
            }
            return result;
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private SortDirEnum sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    /**
    * Gets or Sets ipVersion
    */
    public static final class IpVersionEnum {

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final IpVersionEnum NUMBER_4 = new IpVersionEnum(4);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final IpVersionEnum NUMBER_6 = new IpVersionEnum(6);

        private static final Map<Integer, IpVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IpVersionEnum> createStaticFields() {
            Map<Integer, IpVersionEnum> map = new HashMap<>();
            map.put(4, NUMBER_4);
            map.put(6, NUMBER_6);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IpVersionEnum(Integer value) {
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
        public static IpVersionEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            IpVersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IpVersionEnum(value);
            }
            return result;
        }

        public static IpVersionEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            IpVersionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpVersionEnum) {
                return this.value.equals(((IpVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private List<IpVersionEnum> ipVersion = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_address")

    private List<String> publicIpAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_address_like")

    private String publicIpAddressLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ipv6_address")

    private List<String> publicIpv6Address = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ipv6_address_like")

    private String publicIpv6AddressLike;

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum EIP for value: "EIP"
         */
        public static final TypeEnum EIP = new TypeEnum("EIP");

        /**
         * Enum DUALSTACK for value: "DUALSTACK"
         */
        public static final TypeEnum DUALSTACK = new TypeEnum("DUALSTACK");

        /**
         * Enum DUALSTACK_SUBNET for value: "DUALSTACK_SUBNET"
         */
        public static final TypeEnum DUALSTACK_SUBNET = new TypeEnum("DUALSTACK_SUBNET");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("EIP", EIP);
            map.put("DUALSTACK", DUALSTACK);
            map.put("DUALSTACK_SUBNET", DUALSTACK_SUBNET);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
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

    private List<TypeEnum> type = null;

    /**
    * Gets or Sets networkType
    */
    public static final class NetworkTypeEnum {

        /**
         * Enum _5_TELCOM for value: "5_telcom"
         */
        public static final NetworkTypeEnum _5_TELCOM = new NetworkTypeEnum("5_telcom");

        /**
         * Enum _5_UNION for value: "5_union"
         */
        public static final NetworkTypeEnum _5_UNION = new NetworkTypeEnum("5_union");

        /**
         * Enum _5_BGP for value: "5_bgp"
         */
        public static final NetworkTypeEnum _5_BGP = new NetworkTypeEnum("5_bgp");

        /**
         * Enum _5_SBGP for value: "5_sbgp"
         */
        public static final NetworkTypeEnum _5_SBGP = new NetworkTypeEnum("5_sbgp");

        /**
         * Enum _5_IPV6 for value: "5_ipv6"
         */
        public static final NetworkTypeEnum _5_IPV6 = new NetworkTypeEnum("5_ipv6");

        /**
         * Enum _5_GRAYBGP for value: "5_graybgp"
         */
        public static final NetworkTypeEnum _5_GRAYBGP = new NetworkTypeEnum("5_graybgp");

        private static final Map<String, NetworkTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetworkTypeEnum> createStaticFields() {
            Map<String, NetworkTypeEnum> map = new HashMap<>();
            map.put("5_telcom", _5_TELCOM);
            map.put("5_union", _5_UNION);
            map.put("5_bgp", _5_BGP);
            map.put("5_sbgp", _5_SBGP);
            map.put("5_ipv6", _5_IPV6);
            map.put("5_graybgp", _5_GRAYBGP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NetworkTypeEnum(String value) {
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
        public static NetworkTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NetworkTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NetworkTypeEnum(value);
            }
            return result;
        }

        public static NetworkTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NetworkTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NetworkTypeEnum) {
                return this.value.equals(((NetworkTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private List<NetworkTypeEnum> networkType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_pool_name")

    private List<String> publicipPoolName = null;

    /**
    * Gets or Sets status
    */
    public static final class StatusEnum {

        /**
         * Enum FREEZED for value: "FREEZED"
         */
        public static final StatusEnum FREEZED = new StatusEnum("FREEZED");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final StatusEnum DOWN = new StatusEnum("DOWN");

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("FREEZED", FREEZED);
            map.put("DOWN", DOWN);
            map.put("ACTIVE", ACTIVE);
            map.put("ERROR", ERROR);
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    private List<StatusEnum> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_like")

    private String aliasLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private List<String> alias = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private List<String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.private_ip_address")

    private List<String> vnicPrivateIpAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.private_ip_address_like")

    private String vnicPrivateIpAddressLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.device_id")

    private List<String> vnicDeviceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.device_owner")

    private List<String> vnicDeviceOwner = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.vpc_id")

    private List<String> vnicVpcId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.port_id")

    private List<String> vnicPortId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.device_owner_prefixlike")

    private String vnicDeviceOwnerPrefixlike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.instance_type")

    private List<String> vnicInstanceType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic.instance_id")

    private List<String> vnicInstanceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth.id")

    private List<String> bandwidthId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth.name")

    private List<String> bandwidthName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth.name_like")

    private List<String> bandwidthNameLike = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth.size")

    private List<Integer> bandwidthSize = null;

    /**
    * Gets or Sets bandwidthShareType
    */
    public static final class BandwidthShareTypeEnum {

        /**
         * Enum PER for value: "PER"
         */
        public static final BandwidthShareTypeEnum PER = new BandwidthShareTypeEnum("PER");

        /**
         * Enum WHOLE for value: "WHOLE"
         */
        public static final BandwidthShareTypeEnum WHOLE = new BandwidthShareTypeEnum("WHOLE");

        private static final Map<String, BandwidthShareTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BandwidthShareTypeEnum> createStaticFields() {
            Map<String, BandwidthShareTypeEnum> map = new HashMap<>();
            map.put("PER", PER);
            map.put("WHOLE", WHOLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BandwidthShareTypeEnum(String value) {
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
        public static BandwidthShareTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BandwidthShareTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BandwidthShareTypeEnum(value);
            }
            return result;
        }

        public static BandwidthShareTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BandwidthShareTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BandwidthShareTypeEnum) {
                return this.value.equals(((BandwidthShareTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth.share_type")

    private List<BandwidthShareTypeEnum> bandwidthShareType = null;

    /**
    * Gets or Sets bandwidthChargeMode
    */
    public static final class BandwidthChargeModeEnum {

        /**
         * Enum BANDWIDTH for value: "bandwidth"
         */
        public static final BandwidthChargeModeEnum BANDWIDTH = new BandwidthChargeModeEnum("bandwidth");

        /**
         * Enum TRAFFIC for value: "traffic"
         */
        public static final BandwidthChargeModeEnum TRAFFIC = new BandwidthChargeModeEnum("traffic");

        /**
         * Enum _95PEAK_PLUS for value: "95peak_plus"
         */
        public static final BandwidthChargeModeEnum _95PEAK_PLUS = new BandwidthChargeModeEnum("95peak_plus");

        private static final Map<String, BandwidthChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BandwidthChargeModeEnum> createStaticFields() {
            Map<String, BandwidthChargeModeEnum> map = new HashMap<>();
            map.put("bandwidth", BANDWIDTH);
            map.put("traffic", TRAFFIC);
            map.put("95peak_plus", _95PEAK_PLUS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BandwidthChargeModeEnum(String value) {
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
        public static BandwidthChargeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BandwidthChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BandwidthChargeModeEnum(value);
            }
            return result;
        }

        public static BandwidthChargeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BandwidthChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BandwidthChargeModeEnum) {
                return this.value.equals(((BandwidthChargeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth.charge_mode")

    private List<BandwidthChargeModeEnum> bandwidthChargeMode = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private List<String> billingInfo = null;

    /**
    * 根据订单模式过滤,   取值范围：YEARLY_MONTHLY、PAY_PER_USE
    */
    public static final class BillingModeEnum {

        /**
         * Enum YEARLY_MONTHLY for value: "YEARLY_MONTHLY"
         */
        public static final BillingModeEnum YEARLY_MONTHLY = new BillingModeEnum("YEARLY_MONTHLY");

        /**
         * Enum PAY_PER_USE for value: "PAY_PER_USE"
         */
        public static final BillingModeEnum PAY_PER_USE = new BillingModeEnum("PAY_PER_USE");

        private static final Map<String, BillingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BillingModeEnum> createStaticFields() {
            Map<String, BillingModeEnum> map = new HashMap<>();
            map.put("YEARLY_MONTHLY", YEARLY_MONTHLY);
            map.put("PAY_PER_USE", PAY_PER_USE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BillingModeEnum(String value) {
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
        public static BillingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BillingModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BillingModeEnum(value);
            }
            return result;
        }

        public static BillingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BillingModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BillingModeEnum) {
                return this.value.equals(((BillingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_mode")

    private BillingModeEnum billingMode;

    /**
     * Gets or Sets associateInstanceType
     */
    public static final class AssociateInstanceTypeEnum {

        /**
         * Enum PORT for value: "PORT"
         */
        public static final AssociateInstanceTypeEnum PORT = new AssociateInstanceTypeEnum("PORT");

        /**
         * Enum NATGW for value: "NATGW"
         */
        public static final AssociateInstanceTypeEnum NATGW = new AssociateInstanceTypeEnum("NATGW");

        /**
         * Enum ELB for value: "ELB"
         */
        public static final AssociateInstanceTypeEnum ELB = new AssociateInstanceTypeEnum("ELB");

        /**
         * Enum VPN for value: "VPN"
         */
        public static final AssociateInstanceTypeEnum VPN = new AssociateInstanceTypeEnum("VPN");

        /**
         * Enum ELBV1 for value: "ELBV1"
         */
        public static final AssociateInstanceTypeEnum ELBV1 = new AssociateInstanceTypeEnum("ELBV1");

        private static final Map<String, AssociateInstanceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssociateInstanceTypeEnum> createStaticFields() {
            Map<String, AssociateInstanceTypeEnum> map = new HashMap<>();
            map.put("PORT", PORT);
            map.put("NATGW", NATGW);
            map.put("ELB", ELB);
            map.put("VPN", VPN);
            map.put("ELBV1", ELBV1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssociateInstanceTypeEnum(String value) {
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
        public static AssociateInstanceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AssociateInstanceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AssociateInstanceTypeEnum(value);
            }
            return result;
        }

        public static AssociateInstanceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AssociateInstanceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssociateInstanceTypeEnum) {
                return this.value.equals(((AssociateInstanceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_type")

    private List<AssociateInstanceTypeEnum> associateInstanceType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_id")

    private List<String> associateInstanceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private List<String> publicBorderGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_share_bandwidth_type_any")

    private List<String> allowShareBandwidthTypeAny = null;

    public ListPublicipsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页查询起始的资源ID，为空时为查询第一页
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListPublicipsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询起始的资源序号
     * minimum: 0
     * maximum: 99999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPublicipsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数取值范围：0~[2000]，其中2000为局点差异项，具体取值由局点决定
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

    public ListPublicipsRequest withFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

    public ListPublicipsRequest addFieldsItem(String fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ListPublicipsRequest withFields(Consumer<List<String>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 显示，形式为\"fields=id&fields=owner&...\"  支持字段：id/project_id/ip_version/type/public_ip_address/public_ipv6_address/network_type/status/description/created_at/updated_at/vnic/bandwidth/associate_instance_type/associate_instance_id/lock_status/billing_info/tags/enterprise_project_id/allow_share_bandwidth_types/public_border_group/alias/publicip_pool_name/publicip_pool_id
     * @return fields
     */
    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public ListPublicipsRequest withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序，形式为\"sort_key=id\"  支持字段：id/public_ip_address/public_ipv6_address/ip_version/created_at/updated_at/public_border_group
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    public ListPublicipsRequest withSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序方向  取值范围：asc、desc
     * @return sortDir
     */
    public SortDirEnum getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
    }

    public ListPublicipsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListPublicipsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListPublicipsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 根据id过滤
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListPublicipsRequest withIpVersion(List<IpVersionEnum> ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public ListPublicipsRequest addIpVersionItem(IpVersionEnum ipVersionItem) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        this.ipVersion.add(ipVersionItem);
        return this;
    }

    public ListPublicipsRequest withIpVersion(Consumer<List<IpVersionEnum>> ipVersionSetter) {
        if (this.ipVersion == null) {
            this.ipVersion = new ArrayList<>();
        }
        ipVersionSetter.accept(this.ipVersion);
        return this;
    }

    /**
     * 根据ip_version过滤  取值范围：4、6
     * @return ipVersion
     */
    public List<IpVersionEnum> getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(List<IpVersionEnum> ipVersion) {
        this.ipVersion = ipVersion;
    }

    public ListPublicipsRequest withPublicIpAddress(List<String> publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    public ListPublicipsRequest addPublicIpAddressItem(String publicIpAddressItem) {
        if (this.publicIpAddress == null) {
            this.publicIpAddress = new ArrayList<>();
        }
        this.publicIpAddress.add(publicIpAddressItem);
        return this;
    }

    public ListPublicipsRequest withPublicIpAddress(Consumer<List<String>> publicIpAddressSetter) {
        if (this.publicIpAddress == null) {
            this.publicIpAddress = new ArrayList<>();
        }
        publicIpAddressSetter.accept(this.publicIpAddress);
        return this;
    }

    /**
     * 根据public_ip_address过滤
     * @return publicIpAddress
     */
    public List<String> getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(List<String> publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public ListPublicipsRequest withPublicIpAddressLike(String publicIpAddressLike) {
        this.publicIpAddressLike = publicIpAddressLike;
        return this;
    }

    /**
     * 根据public_ip_address过滤，模糊搜索
     * @return publicIpAddressLike
     */
    public String getPublicIpAddressLike() {
        return publicIpAddressLike;
    }

    public void setPublicIpAddressLike(String publicIpAddressLike) {
        this.publicIpAddressLike = publicIpAddressLike;
    }

    public ListPublicipsRequest withPublicIpv6Address(List<String> publicIpv6Address) {
        this.publicIpv6Address = publicIpv6Address;
        return this;
    }

    public ListPublicipsRequest addPublicIpv6AddressItem(String publicIpv6AddressItem) {
        if (this.publicIpv6Address == null) {
            this.publicIpv6Address = new ArrayList<>();
        }
        this.publicIpv6Address.add(publicIpv6AddressItem);
        return this;
    }

    public ListPublicipsRequest withPublicIpv6Address(Consumer<List<String>> publicIpv6AddressSetter) {
        if (this.publicIpv6Address == null) {
            this.publicIpv6Address = new ArrayList<>();
        }
        publicIpv6AddressSetter.accept(this.publicIpv6Address);
        return this;
    }

    /**
     * 根据public_ipv6_address过滤
     * @return publicIpv6Address
     */
    public List<String> getPublicIpv6Address() {
        return publicIpv6Address;
    }

    public void setPublicIpv6Address(List<String> publicIpv6Address) {
        this.publicIpv6Address = publicIpv6Address;
    }

    public ListPublicipsRequest withPublicIpv6AddressLike(String publicIpv6AddressLike) {
        this.publicIpv6AddressLike = publicIpv6AddressLike;
        return this;
    }

    /**
     * 根据public_ipv6_address过滤，模糊搜索
     * @return publicIpv6AddressLike
     */
    public String getPublicIpv6AddressLike() {
        return publicIpv6AddressLike;
    }

    public void setPublicIpv6AddressLike(String publicIpv6AddressLike) {
        this.publicIpv6AddressLike = publicIpv6AddressLike;
    }

    public ListPublicipsRequest withType(List<TypeEnum> type) {
        this.type = type;
        return this;
    }

    public ListPublicipsRequest addTypeItem(TypeEnum typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListPublicipsRequest withType(Consumer<List<TypeEnum>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * 根据type过滤  取值范围：EIP、DUALSTACK、DUALSTACK_SUBNET  EIP: 弹性公网IP   DUALSTACK: 双栈IPV6   DUALSTACK_SUBNET: 双栈子网
     * @return type
     */
    public List<TypeEnum> getType() {
        return type;
    }

    public void setType(List<TypeEnum> type) {
        this.type = type;
    }

    public ListPublicipsRequest withNetworkType(List<NetworkTypeEnum> networkType) {
        this.networkType = networkType;
        return this;
    }

    public ListPublicipsRequest addNetworkTypeItem(NetworkTypeEnum networkTypeItem) {
        if (this.networkType == null) {
            this.networkType = new ArrayList<>();
        }
        this.networkType.add(networkTypeItem);
        return this;
    }

    public ListPublicipsRequest withNetworkType(Consumer<List<NetworkTypeEnum>> networkTypeSetter) {
        if (this.networkType == null) {
            this.networkType = new ArrayList<>();
        }
        networkTypeSetter.accept(this.networkType);
        return this;
    }

    /**
     * 根据network_type过滤  取值范围：5_telcom、5_union、5_bgp、5_sbgp、5_ipv6、5_graybgp
     * @return networkType
     */
    public List<NetworkTypeEnum> getNetworkType() {
        return networkType;
    }

    public void setNetworkType(List<NetworkTypeEnum> networkType) {
        this.networkType = networkType;
    }

    public ListPublicipsRequest withPublicipPoolName(List<String> publicipPoolName) {
        this.publicipPoolName = publicipPoolName;
        return this;
    }

    public ListPublicipsRequest addPublicipPoolNameItem(String publicipPoolNameItem) {
        if (this.publicipPoolName == null) {
            this.publicipPoolName = new ArrayList<>();
        }
        this.publicipPoolName.add(publicipPoolNameItem);
        return this;
    }

    public ListPublicipsRequest withPublicipPoolName(Consumer<List<String>> publicipPoolNameSetter) {
        if (this.publicipPoolName == null) {
            this.publicipPoolName = new ArrayList<>();
        }
        publicipPoolNameSetter.accept(this.publicipPoolName);
        return this;
    }

    /**
     * 根据publicip_pool_name过滤  取值范围：5_telcom、5_union、5_bgp、5_sbgp、5_ipv6、5_graybgp、专属池名称等
     * @return publicipPoolName
     */
    public List<String> getPublicipPoolName() {
        return publicipPoolName;
    }

    public void setPublicipPoolName(List<String> publicipPoolName) {
        this.publicipPoolName = publicipPoolName;
    }

    public ListPublicipsRequest withStatus(List<StatusEnum> status) {
        this.status = status;
        return this;
    }

    public ListPublicipsRequest addStatusItem(StatusEnum statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListPublicipsRequest withStatus(Consumer<List<StatusEnum>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * 根据status过滤  取值范围：FREEZED、DOWN、ACTIVE、ERROR
     * @return status
     */
    public List<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(List<StatusEnum> status) {
        this.status = status;
    }

    public ListPublicipsRequest withAliasLike(String aliasLike) {
        this.aliasLike = aliasLike;
        return this;
    }

    /**
     * 根据alias模糊搜索
     * @return aliasLike
     */
    public String getAliasLike() {
        return aliasLike;
    }

    public void setAliasLike(String aliasLike) {
        this.aliasLike = aliasLike;
    }

    public ListPublicipsRequest withAlias(List<String> alias) {
        this.alias = alias;
        return this;
    }

    public ListPublicipsRequest addAliasItem(String aliasItem) {
        if (this.alias == null) {
            this.alias = new ArrayList<>();
        }
        this.alias.add(aliasItem);
        return this;
    }

    public ListPublicipsRequest withAlias(Consumer<List<String>> aliasSetter) {
        if (this.alias == null) {
            this.alias = new ArrayList<>();
        }
        aliasSetter.accept(this.alias);
        return this;
    }

    /**
     * 根据alias过滤
     * @return alias
     */
    public List<String> getAlias() {
        return alias;
    }

    public void setAlias(List<String> alias) {
        this.alias = alias;
    }

    public ListPublicipsRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListPublicipsRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListPublicipsRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * 根据description过滤
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListPublicipsRequest withVnicPrivateIpAddress(List<String> vnicPrivateIpAddress) {
        this.vnicPrivateIpAddress = vnicPrivateIpAddress;
        return this;
    }

    public ListPublicipsRequest addVnicPrivateIpAddressItem(String vnicPrivateIpAddressItem) {
        if (this.vnicPrivateIpAddress == null) {
            this.vnicPrivateIpAddress = new ArrayList<>();
        }
        this.vnicPrivateIpAddress.add(vnicPrivateIpAddressItem);
        return this;
    }

    public ListPublicipsRequest withVnicPrivateIpAddress(Consumer<List<String>> vnicPrivateIpAddressSetter) {
        if (this.vnicPrivateIpAddress == null) {
            this.vnicPrivateIpAddress = new ArrayList<>();
        }
        vnicPrivateIpAddressSetter.accept(this.vnicPrivateIpAddress);
        return this;
    }

    /**
     * 根据private_ip_address过滤
     * @return vnicPrivateIpAddress
     */
    public List<String> getVnicPrivateIpAddress() {
        return vnicPrivateIpAddress;
    }

    public void setVnicPrivateIpAddress(List<String> vnicPrivateIpAddress) {
        this.vnicPrivateIpAddress = vnicPrivateIpAddress;
    }

    public ListPublicipsRequest withVnicPrivateIpAddressLike(String vnicPrivateIpAddressLike) {
        this.vnicPrivateIpAddressLike = vnicPrivateIpAddressLike;
        return this;
    }

    /**
     * 根据private_ip_address模糊搜索
     * @return vnicPrivateIpAddressLike
     */
    public String getVnicPrivateIpAddressLike() {
        return vnicPrivateIpAddressLike;
    }

    public void setVnicPrivateIpAddressLike(String vnicPrivateIpAddressLike) {
        this.vnicPrivateIpAddressLike = vnicPrivateIpAddressLike;
    }

    public ListPublicipsRequest withVnicDeviceId(List<String> vnicDeviceId) {
        this.vnicDeviceId = vnicDeviceId;
        return this;
    }

    public ListPublicipsRequest addVnicDeviceIdItem(String vnicDeviceIdItem) {
        if (this.vnicDeviceId == null) {
            this.vnicDeviceId = new ArrayList<>();
        }
        this.vnicDeviceId.add(vnicDeviceIdItem);
        return this;
    }

    public ListPublicipsRequest withVnicDeviceId(Consumer<List<String>> vnicDeviceIdSetter) {
        if (this.vnicDeviceId == null) {
            this.vnicDeviceId = new ArrayList<>();
        }
        vnicDeviceIdSetter.accept(this.vnicDeviceId);
        return this;
    }

    /**
     * 根据device_id过滤
     * @return vnicDeviceId
     */
    public List<String> getVnicDeviceId() {
        return vnicDeviceId;
    }

    public void setVnicDeviceId(List<String> vnicDeviceId) {
        this.vnicDeviceId = vnicDeviceId;
    }

    public ListPublicipsRequest withVnicDeviceOwner(List<String> vnicDeviceOwner) {
        this.vnicDeviceOwner = vnicDeviceOwner;
        return this;
    }

    public ListPublicipsRequest addVnicDeviceOwnerItem(String vnicDeviceOwnerItem) {
        if (this.vnicDeviceOwner == null) {
            this.vnicDeviceOwner = new ArrayList<>();
        }
        this.vnicDeviceOwner.add(vnicDeviceOwnerItem);
        return this;
    }

    public ListPublicipsRequest withVnicDeviceOwner(Consumer<List<String>> vnicDeviceOwnerSetter) {
        if (this.vnicDeviceOwner == null) {
            this.vnicDeviceOwner = new ArrayList<>();
        }
        vnicDeviceOwnerSetter.accept(this.vnicDeviceOwner);
        return this;
    }

    /**
     * 根据device_owner过滤
     * @return vnicDeviceOwner
     */
    public List<String> getVnicDeviceOwner() {
        return vnicDeviceOwner;
    }

    public void setVnicDeviceOwner(List<String> vnicDeviceOwner) {
        this.vnicDeviceOwner = vnicDeviceOwner;
    }

    public ListPublicipsRequest withVnicVpcId(List<String> vnicVpcId) {
        this.vnicVpcId = vnicVpcId;
        return this;
    }

    public ListPublicipsRequest addVnicVpcIdItem(String vnicVpcIdItem) {
        if (this.vnicVpcId == null) {
            this.vnicVpcId = new ArrayList<>();
        }
        this.vnicVpcId.add(vnicVpcIdItem);
        return this;
    }

    public ListPublicipsRequest withVnicVpcId(Consumer<List<String>> vnicVpcIdSetter) {
        if (this.vnicVpcId == null) {
            this.vnicVpcId = new ArrayList<>();
        }
        vnicVpcIdSetter.accept(this.vnicVpcId);
        return this;
    }

    /**
     * 根据vpc_id过滤
     * @return vnicVpcId
     */
    public List<String> getVnicVpcId() {
        return vnicVpcId;
    }

    public void setVnicVpcId(List<String> vnicVpcId) {
        this.vnicVpcId = vnicVpcId;
    }

    public ListPublicipsRequest withVnicPortId(List<String> vnicPortId) {
        this.vnicPortId = vnicPortId;
        return this;
    }

    public ListPublicipsRequest addVnicPortIdItem(String vnicPortIdItem) {
        if (this.vnicPortId == null) {
            this.vnicPortId = new ArrayList<>();
        }
        this.vnicPortId.add(vnicPortIdItem);
        return this;
    }

    public ListPublicipsRequest withVnicPortId(Consumer<List<String>> vnicPortIdSetter) {
        if (this.vnicPortId == null) {
            this.vnicPortId = new ArrayList<>();
        }
        vnicPortIdSetter.accept(this.vnicPortId);
        return this;
    }

    /**
     * 根据port_id过滤
     * @return vnicPortId
     */
    public List<String> getVnicPortId() {
        return vnicPortId;
    }

    public void setVnicPortId(List<String> vnicPortId) {
        this.vnicPortId = vnicPortId;
    }

    public ListPublicipsRequest withVnicDeviceOwnerPrefixlike(String vnicDeviceOwnerPrefixlike) {
        this.vnicDeviceOwnerPrefixlike = vnicDeviceOwnerPrefixlike;
        return this;
    }

    /**
     * 根据device_owner_prefixlike模糊搜索
     * @return vnicDeviceOwnerPrefixlike
     */
    public String getVnicDeviceOwnerPrefixlike() {
        return vnicDeviceOwnerPrefixlike;
    }

    public void setVnicDeviceOwnerPrefixlike(String vnicDeviceOwnerPrefixlike) {
        this.vnicDeviceOwnerPrefixlike = vnicDeviceOwnerPrefixlike;
    }

    public ListPublicipsRequest withVnicInstanceType(List<String> vnicInstanceType) {
        this.vnicInstanceType = vnicInstanceType;
        return this;
    }

    public ListPublicipsRequest addVnicInstanceTypeItem(String vnicInstanceTypeItem) {
        if (this.vnicInstanceType == null) {
            this.vnicInstanceType = new ArrayList<>();
        }
        this.vnicInstanceType.add(vnicInstanceTypeItem);
        return this;
    }

    public ListPublicipsRequest withVnicInstanceType(Consumer<List<String>> vnicInstanceTypeSetter) {
        if (this.vnicInstanceType == null) {
            this.vnicInstanceType = new ArrayList<>();
        }
        vnicInstanceTypeSetter.accept(this.vnicInstanceType);
        return this;
    }

    /**
     * 根据instance_type过滤
     * @return vnicInstanceType
     */
    public List<String> getVnicInstanceType() {
        return vnicInstanceType;
    }

    public void setVnicInstanceType(List<String> vnicInstanceType) {
        this.vnicInstanceType = vnicInstanceType;
    }

    public ListPublicipsRequest withVnicInstanceId(List<String> vnicInstanceId) {
        this.vnicInstanceId = vnicInstanceId;
        return this;
    }

    public ListPublicipsRequest addVnicInstanceIdItem(String vnicInstanceIdItem) {
        if (this.vnicInstanceId == null) {
            this.vnicInstanceId = new ArrayList<>();
        }
        this.vnicInstanceId.add(vnicInstanceIdItem);
        return this;
    }

    public ListPublicipsRequest withVnicInstanceId(Consumer<List<String>> vnicInstanceIdSetter) {
        if (this.vnicInstanceId == null) {
            this.vnicInstanceId = new ArrayList<>();
        }
        vnicInstanceIdSetter.accept(this.vnicInstanceId);
        return this;
    }

    /**
     * 根据instance_id过滤
     * @return vnicInstanceId
     */
    public List<String> getVnicInstanceId() {
        return vnicInstanceId;
    }

    public void setVnicInstanceId(List<String> vnicInstanceId) {
        this.vnicInstanceId = vnicInstanceId;
    }

    public ListPublicipsRequest withBandwidthId(List<String> bandwidthId) {
        this.bandwidthId = bandwidthId;
        return this;
    }

    public ListPublicipsRequest addBandwidthIdItem(String bandwidthIdItem) {
        if (this.bandwidthId == null) {
            this.bandwidthId = new ArrayList<>();
        }
        this.bandwidthId.add(bandwidthIdItem);
        return this;
    }

    public ListPublicipsRequest withBandwidthId(Consumer<List<String>> bandwidthIdSetter) {
        if (this.bandwidthId == null) {
            this.bandwidthId = new ArrayList<>();
        }
        bandwidthIdSetter.accept(this.bandwidthId);
        return this;
    }

    /**
     * 根据id过滤
     * @return bandwidthId
     */
    public List<String> getBandwidthId() {
        return bandwidthId;
    }

    public void setBandwidthId(List<String> bandwidthId) {
        this.bandwidthId = bandwidthId;
    }

    public ListPublicipsRequest withBandwidthName(List<String> bandwidthName) {
        this.bandwidthName = bandwidthName;
        return this;
    }

    public ListPublicipsRequest addBandwidthNameItem(String bandwidthNameItem) {
        if (this.bandwidthName == null) {
            this.bandwidthName = new ArrayList<>();
        }
        this.bandwidthName.add(bandwidthNameItem);
        return this;
    }

    public ListPublicipsRequest withBandwidthName(Consumer<List<String>> bandwidthNameSetter) {
        if (this.bandwidthName == null) {
            this.bandwidthName = new ArrayList<>();
        }
        bandwidthNameSetter.accept(this.bandwidthName);
        return this;
    }

    /**
     * 根据name过滤
     * @return bandwidthName
     */
    public List<String> getBandwidthName() {
        return bandwidthName;
    }

    public void setBandwidthName(List<String> bandwidthName) {
        this.bandwidthName = bandwidthName;
    }

    public ListPublicipsRequest withBandwidthNameLike(List<String> bandwidthNameLike) {
        this.bandwidthNameLike = bandwidthNameLike;
        return this;
    }

    public ListPublicipsRequest addBandwidthNameLikeItem(String bandwidthNameLikeItem) {
        if (this.bandwidthNameLike == null) {
            this.bandwidthNameLike = new ArrayList<>();
        }
        this.bandwidthNameLike.add(bandwidthNameLikeItem);
        return this;
    }

    public ListPublicipsRequest withBandwidthNameLike(Consumer<List<String>> bandwidthNameLikeSetter) {
        if (this.bandwidthNameLike == null) {
            this.bandwidthNameLike = new ArrayList<>();
        }
        bandwidthNameLikeSetter.accept(this.bandwidthNameLike);
        return this;
    }

    /**
     * 根据name模糊过滤
     * @return bandwidthNameLike
     */
    public List<String> getBandwidthNameLike() {
        return bandwidthNameLike;
    }

    public void setBandwidthNameLike(List<String> bandwidthNameLike) {
        this.bandwidthNameLike = bandwidthNameLike;
    }

    public ListPublicipsRequest withBandwidthSize(List<Integer> bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    public ListPublicipsRequest addBandwidthSizeItem(Integer bandwidthSizeItem) {
        if (this.bandwidthSize == null) {
            this.bandwidthSize = new ArrayList<>();
        }
        this.bandwidthSize.add(bandwidthSizeItem);
        return this;
    }

    public ListPublicipsRequest withBandwidthSize(Consumer<List<Integer>> bandwidthSizeSetter) {
        if (this.bandwidthSize == null) {
            this.bandwidthSize = new ArrayList<>();
        }
        bandwidthSizeSetter.accept(this.bandwidthSize);
        return this;
    }

    /**
     * 根据size过滤
     * @return bandwidthSize
     */
    public List<Integer> getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(List<Integer> bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public ListPublicipsRequest withBandwidthShareType(List<BandwidthShareTypeEnum> bandwidthShareType) {
        this.bandwidthShareType = bandwidthShareType;
        return this;
    }

    public ListPublicipsRequest addBandwidthShareTypeItem(BandwidthShareTypeEnum bandwidthShareTypeItem) {
        if (this.bandwidthShareType == null) {
            this.bandwidthShareType = new ArrayList<>();
        }
        this.bandwidthShareType.add(bandwidthShareTypeItem);
        return this;
    }

    public ListPublicipsRequest withBandwidthShareType(
        Consumer<List<BandwidthShareTypeEnum>> bandwidthShareTypeSetter) {
        if (this.bandwidthShareType == null) {
            this.bandwidthShareType = new ArrayList<>();
        }
        bandwidthShareTypeSetter.accept(this.bandwidthShareType);
        return this;
    }

    /**
     * 根据share_type过滤
     * @return bandwidthShareType
     */
    public List<BandwidthShareTypeEnum> getBandwidthShareType() {
        return bandwidthShareType;
    }

    public void setBandwidthShareType(List<BandwidthShareTypeEnum> bandwidthShareType) {
        this.bandwidthShareType = bandwidthShareType;
    }

    public ListPublicipsRequest withBandwidthChargeMode(List<BandwidthChargeModeEnum> bandwidthChargeMode) {
        this.bandwidthChargeMode = bandwidthChargeMode;
        return this;
    }

    public ListPublicipsRequest addBandwidthChargeModeItem(BandwidthChargeModeEnum bandwidthChargeModeItem) {
        if (this.bandwidthChargeMode == null) {
            this.bandwidthChargeMode = new ArrayList<>();
        }
        this.bandwidthChargeMode.add(bandwidthChargeModeItem);
        return this;
    }

    public ListPublicipsRequest withBandwidthChargeMode(
        Consumer<List<BandwidthChargeModeEnum>> bandwidthChargeModeSetter) {
        if (this.bandwidthChargeMode == null) {
            this.bandwidthChargeMode = new ArrayList<>();
        }
        bandwidthChargeModeSetter.accept(this.bandwidthChargeMode);
        return this;
    }

    /**
     * 根据charge_mode过滤
     * @return bandwidthChargeMode
     */
    public List<BandwidthChargeModeEnum> getBandwidthChargeMode() {
        return bandwidthChargeMode;
    }

    public void setBandwidthChargeMode(List<BandwidthChargeModeEnum> bandwidthChargeMode) {
        this.bandwidthChargeMode = bandwidthChargeMode;
    }

    public ListPublicipsRequest withBillingInfo(List<String> billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    public ListPublicipsRequest addBillingInfoItem(String billingInfoItem) {
        if (this.billingInfo == null) {
            this.billingInfo = new ArrayList<>();
        }
        this.billingInfo.add(billingInfoItem);
        return this;
    }

    public ListPublicipsRequest withBillingInfo(Consumer<List<String>> billingInfoSetter) {
        if (this.billingInfo == null) {
            this.billingInfo = new ArrayList<>();
        }
        billingInfoSetter.accept(this.billingInfo);
        return this;
    }

    /**
     * 根据billing_info过滤
     * @return billingInfo
     */
    public List<String> getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(List<String> billingInfo) {
        this.billingInfo = billingInfo;
    }

    public ListPublicipsRequest withBillingMode(BillingModeEnum billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    /**
     * 根据订单模式过滤,   取值范围：YEARLY_MONTHLY、PAY_PER_USE
     * @return billingMode
     */
    public BillingModeEnum getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(BillingModeEnum billingMode) {
        this.billingMode = billingMode;
    }

    public ListPublicipsRequest withAssociateInstanceType(List<AssociateInstanceTypeEnum> associateInstanceType) {
        this.associateInstanceType = associateInstanceType;
        return this;
    }

    public ListPublicipsRequest addAssociateInstanceTypeItem(AssociateInstanceTypeEnum associateInstanceTypeItem) {
        if (this.associateInstanceType == null) {
            this.associateInstanceType = new ArrayList<>();
        }
        this.associateInstanceType.add(associateInstanceTypeItem);
        return this;
    }

    public ListPublicipsRequest withAssociateInstanceType(
        Consumer<List<AssociateInstanceTypeEnum>> associateInstanceTypeSetter) {
        if (this.associateInstanceType == null) {
            this.associateInstanceType = new ArrayList<>();
        }
        associateInstanceTypeSetter.accept(this.associateInstanceType);
        return this;
    }

    /**
     * 根据associate_instance_type过滤  取值范围：PORT、NATGW、ELB、VPN、ELBV1
     * @return associateInstanceType
     */
    public List<AssociateInstanceTypeEnum> getAssociateInstanceType() {
        return associateInstanceType;
    }

    public void setAssociateInstanceType(List<AssociateInstanceTypeEnum> associateInstanceType) {
        this.associateInstanceType = associateInstanceType;
    }

    public ListPublicipsRequest withAssociateInstanceId(List<String> associateInstanceId) {
        this.associateInstanceId = associateInstanceId;
        return this;
    }

    public ListPublicipsRequest addAssociateInstanceIdItem(String associateInstanceIdItem) {
        if (this.associateInstanceId == null) {
            this.associateInstanceId = new ArrayList<>();
        }
        this.associateInstanceId.add(associateInstanceIdItem);
        return this;
    }

    public ListPublicipsRequest withAssociateInstanceId(Consumer<List<String>> associateInstanceIdSetter) {
        if (this.associateInstanceId == null) {
            this.associateInstanceId = new ArrayList<>();
        }
        associateInstanceIdSetter.accept(this.associateInstanceId);
        return this;
    }

    /**
     * 根据associate_instance_id过滤
     * @return associateInstanceId
     */
    public List<String> getAssociateInstanceId() {
        return associateInstanceId;
    }

    public void setAssociateInstanceId(List<String> associateInstanceId) {
        this.associateInstanceId = associateInstanceId;
    }

    public ListPublicipsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListPublicipsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListPublicipsRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 根据enterprise_project_id过滤
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListPublicipsRequest withPublicBorderGroup(List<String> publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    public ListPublicipsRequest addPublicBorderGroupItem(String publicBorderGroupItem) {
        if (this.publicBorderGroup == null) {
            this.publicBorderGroup = new ArrayList<>();
        }
        this.publicBorderGroup.add(publicBorderGroupItem);
        return this;
    }

    public ListPublicipsRequest withPublicBorderGroup(Consumer<List<String>> publicBorderGroupSetter) {
        if (this.publicBorderGroup == null) {
            this.publicBorderGroup = new ArrayList<>();
        }
        publicBorderGroupSetter.accept(this.publicBorderGroup);
        return this;
    }

    /**
     * 根据public_border_group过滤
     * @return publicBorderGroup
     */
    public List<String> getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(List<String> publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public ListPublicipsRequest withAllowShareBandwidthTypeAny(List<String> allowShareBandwidthTypeAny) {
        this.allowShareBandwidthTypeAny = allowShareBandwidthTypeAny;
        return this;
    }

    public ListPublicipsRequest addAllowShareBandwidthTypeAnyItem(String allowShareBandwidthTypeAnyItem) {
        if (this.allowShareBandwidthTypeAny == null) {
            this.allowShareBandwidthTypeAny = new ArrayList<>();
        }
        this.allowShareBandwidthTypeAny.add(allowShareBandwidthTypeAnyItem);
        return this;
    }

    public ListPublicipsRequest withAllowShareBandwidthTypeAny(
        Consumer<List<String>> allowShareBandwidthTypeAnySetter) {
        if (this.allowShareBandwidthTypeAny == null) {
            this.allowShareBandwidthTypeAny = new ArrayList<>();
        }
        allowShareBandwidthTypeAnySetter.accept(this.allowShareBandwidthTypeAny);
        return this;
    }

    /**
     * 共享带宽类型，根据任一共享带宽类型过滤EIP列表。 可以指定多个带宽类型，不同的带宽类型间用逗号分隔。
     * @return allowShareBandwidthTypeAny
     */
    public List<String> getAllowShareBandwidthTypeAny() {
        return allowShareBandwidthTypeAny;
    }

    public void setAllowShareBandwidthTypeAny(List<String> allowShareBandwidthTypeAny) {
        this.allowShareBandwidthTypeAny = allowShareBandwidthTypeAny;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPublicipsRequest listPublicipsRequest = (ListPublicipsRequest) o;
        return Objects.equals(this.marker, listPublicipsRequest.marker)
            && Objects.equals(this.offset, listPublicipsRequest.offset)
            && Objects.equals(this.limit, listPublicipsRequest.limit)
            && Objects.equals(this.fields, listPublicipsRequest.fields)
            && Objects.equals(this.sortKey, listPublicipsRequest.sortKey)
            && Objects.equals(this.sortDir, listPublicipsRequest.sortDir)
            && Objects.equals(this.id, listPublicipsRequest.id)
            && Objects.equals(this.ipVersion, listPublicipsRequest.ipVersion)
            && Objects.equals(this.publicIpAddress, listPublicipsRequest.publicIpAddress)
            && Objects.equals(this.publicIpAddressLike, listPublicipsRequest.publicIpAddressLike)
            && Objects.equals(this.publicIpv6Address, listPublicipsRequest.publicIpv6Address)
            && Objects.equals(this.publicIpv6AddressLike, listPublicipsRequest.publicIpv6AddressLike)
            && Objects.equals(this.type, listPublicipsRequest.type)
            && Objects.equals(this.networkType, listPublicipsRequest.networkType)
            && Objects.equals(this.publicipPoolName, listPublicipsRequest.publicipPoolName)
            && Objects.equals(this.status, listPublicipsRequest.status)
            && Objects.equals(this.aliasLike, listPublicipsRequest.aliasLike)
            && Objects.equals(this.alias, listPublicipsRequest.alias)
            && Objects.equals(this.description, listPublicipsRequest.description)
            && Objects.equals(this.vnicPrivateIpAddress, listPublicipsRequest.vnicPrivateIpAddress)
            && Objects.equals(this.vnicPrivateIpAddressLike, listPublicipsRequest.vnicPrivateIpAddressLike)
            && Objects.equals(this.vnicDeviceId, listPublicipsRequest.vnicDeviceId)
            && Objects.equals(this.vnicDeviceOwner, listPublicipsRequest.vnicDeviceOwner)
            && Objects.equals(this.vnicVpcId, listPublicipsRequest.vnicVpcId)
            && Objects.equals(this.vnicPortId, listPublicipsRequest.vnicPortId)
            && Objects.equals(this.vnicDeviceOwnerPrefixlike, listPublicipsRequest.vnicDeviceOwnerPrefixlike)
            && Objects.equals(this.vnicInstanceType, listPublicipsRequest.vnicInstanceType)
            && Objects.equals(this.vnicInstanceId, listPublicipsRequest.vnicInstanceId)
            && Objects.equals(this.bandwidthId, listPublicipsRequest.bandwidthId)
            && Objects.equals(this.bandwidthName, listPublicipsRequest.bandwidthName)
            && Objects.equals(this.bandwidthNameLike, listPublicipsRequest.bandwidthNameLike)
            && Objects.equals(this.bandwidthSize, listPublicipsRequest.bandwidthSize)
            && Objects.equals(this.bandwidthShareType, listPublicipsRequest.bandwidthShareType)
            && Objects.equals(this.bandwidthChargeMode, listPublicipsRequest.bandwidthChargeMode)
            && Objects.equals(this.billingInfo, listPublicipsRequest.billingInfo)
            && Objects.equals(this.billingMode, listPublicipsRequest.billingMode)
            && Objects.equals(this.associateInstanceType, listPublicipsRequest.associateInstanceType)
            && Objects.equals(this.associateInstanceId, listPublicipsRequest.associateInstanceId)
            && Objects.equals(this.enterpriseProjectId, listPublicipsRequest.enterpriseProjectId)
            && Objects.equals(this.publicBorderGroup, listPublicipsRequest.publicBorderGroup)
            && Objects.equals(this.allowShareBandwidthTypeAny, listPublicipsRequest.allowShareBandwidthTypeAny);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker,
            offset,
            limit,
            fields,
            sortKey,
            sortDir,
            id,
            ipVersion,
            publicIpAddress,
            publicIpAddressLike,
            publicIpv6Address,
            publicIpv6AddressLike,
            type,
            networkType,
            publicipPoolName,
            status,
            aliasLike,
            alias,
            description,
            vnicPrivateIpAddress,
            vnicPrivateIpAddressLike,
            vnicDeviceId,
            vnicDeviceOwner,
            vnicVpcId,
            vnicPortId,
            vnicDeviceOwnerPrefixlike,
            vnicInstanceType,
            vnicInstanceId,
            bandwidthId,
            bandwidthName,
            bandwidthNameLike,
            bandwidthSize,
            bandwidthShareType,
            bandwidthChargeMode,
            billingInfo,
            billingMode,
            associateInstanceType,
            associateInstanceId,
            enterpriseProjectId,
            publicBorderGroup,
            allowShareBandwidthTypeAny);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicipsRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
        sb.append("    publicIpAddressLike: ").append(toIndentedString(publicIpAddressLike)).append("\n");
        sb.append("    publicIpv6Address: ").append(toIndentedString(publicIpv6Address)).append("\n");
        sb.append("    publicIpv6AddressLike: ").append(toIndentedString(publicIpv6AddressLike)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    publicipPoolName: ").append(toIndentedString(publicipPoolName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    aliasLike: ").append(toIndentedString(aliasLike)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    vnicPrivateIpAddress: ").append(toIndentedString(vnicPrivateIpAddress)).append("\n");
        sb.append("    vnicPrivateIpAddressLike: ").append(toIndentedString(vnicPrivateIpAddressLike)).append("\n");
        sb.append("    vnicDeviceId: ").append(toIndentedString(vnicDeviceId)).append("\n");
        sb.append("    vnicDeviceOwner: ").append(toIndentedString(vnicDeviceOwner)).append("\n");
        sb.append("    vnicVpcId: ").append(toIndentedString(vnicVpcId)).append("\n");
        sb.append("    vnicPortId: ").append(toIndentedString(vnicPortId)).append("\n");
        sb.append("    vnicDeviceOwnerPrefixlike: ").append(toIndentedString(vnicDeviceOwnerPrefixlike)).append("\n");
        sb.append("    vnicInstanceType: ").append(toIndentedString(vnicInstanceType)).append("\n");
        sb.append("    vnicInstanceId: ").append(toIndentedString(vnicInstanceId)).append("\n");
        sb.append("    bandwidthId: ").append(toIndentedString(bandwidthId)).append("\n");
        sb.append("    bandwidthName: ").append(toIndentedString(bandwidthName)).append("\n");
        sb.append("    bandwidthNameLike: ").append(toIndentedString(bandwidthNameLike)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    bandwidthShareType: ").append(toIndentedString(bandwidthShareType)).append("\n");
        sb.append("    bandwidthChargeMode: ").append(toIndentedString(bandwidthChargeMode)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    associateInstanceType: ").append(toIndentedString(associateInstanceType)).append("\n");
        sb.append("    associateInstanceId: ").append(toIndentedString(associateInstanceId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    allowShareBandwidthTypeAny: ").append(toIndentedString(allowShareBandwidthTypeAny)).append("\n");
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
