package com.huaweicloud.sdk.cc.v3.model;

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
 * 带宽包实例。
 */
public class BandwidthPackage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 带宽包实例的状态。ACTIVE表示状态
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
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

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    /**
     * 带宽包实例的规格编码。 bandwidth.aftoela：大陆站+国际站南非-拉美东 bandwidth.aftonla：大陆站+国际站南非-拉美北 bandwidth.aftowla：大陆站+国际站南非-拉美西 bandwidth.aptoaf：国际站亚太-南非 bandwidth.aptoap：国际站亚太-亚太 bandwidth.aptoela：大陆站+国际站亚太-拉美东 bandwidth.aptonla：大陆站+国际站亚太-拉美北 bandwidth.aptowla：大陆站+国际站亚太-拉美西 bandwidth.cmtoaf：国际站中国大陆-南非 bandwidth.cmtoap：国际站中国大陆-亚太 bandwidth.cmtocm：国际站中国大陆-中国大陆 bandwidth.cmtoela：大陆站+国际站中国大陆-拉美东 bandwidth.cmtonla：大陆站+国际站中国大陆-拉美北 bandwidth.cmtowla：大陆站+国际站中国大陆-拉美西 bandwidth.elatoela：大陆站+国际站拉美东-拉美东 bandwidth.elatonla：大陆站+国际站拉美东-拉美北 bandwidth.wlatoela：大陆站+国际站拉美西-拉美东 bandwidth.wlatonla：大陆站+国际站拉美西-拉美北 bandwidth.wlatowla：大陆站+国际站拉美西-拉美西
     */
    public static final class SpecCodeEnum {

        /**
         * Enum BANDWIDTH_AFTOELA for value: "bandwidth.aftoela"
         */
        public static final SpecCodeEnum BANDWIDTH_AFTOELA = new SpecCodeEnum("bandwidth.aftoela");

        /**
         * Enum BANDWIDTH_AFTONLA for value: "bandwidth.aftonla"
         */
        public static final SpecCodeEnum BANDWIDTH_AFTONLA = new SpecCodeEnum("bandwidth.aftonla");

        /**
         * Enum BANDWIDTH_AFTOWLA for value: "bandwidth.aftowla"
         */
        public static final SpecCodeEnum BANDWIDTH_AFTOWLA = new SpecCodeEnum("bandwidth.aftowla");

        /**
         * Enum BANDWIDTH_APTOAF for value: "bandwidth.aptoaf"
         */
        public static final SpecCodeEnum BANDWIDTH_APTOAF = new SpecCodeEnum("bandwidth.aptoaf");

        /**
         * Enum BANDWIDTH_APTOAP for value: "bandwidth.aptoap"
         */
        public static final SpecCodeEnum BANDWIDTH_APTOAP = new SpecCodeEnum("bandwidth.aptoap");

        /**
         * Enum BANDWIDTH_APTOELA for value: "bandwidth.aptoela"
         */
        public static final SpecCodeEnum BANDWIDTH_APTOELA = new SpecCodeEnum("bandwidth.aptoela");

        /**
         * Enum BANDWIDTH_APTONLA for value: "bandwidth.aptonla"
         */
        public static final SpecCodeEnum BANDWIDTH_APTONLA = new SpecCodeEnum("bandwidth.aptonla");

        /**
         * Enum BANDWIDTH_APTOWLA for value: "bandwidth.aptowla"
         */
        public static final SpecCodeEnum BANDWIDTH_APTOWLA = new SpecCodeEnum("bandwidth.aptowla");

        /**
         * Enum BANDWIDTH_CMTOAF for value: "bandwidth.cmtoaf"
         */
        public static final SpecCodeEnum BANDWIDTH_CMTOAF = new SpecCodeEnum("bandwidth.cmtoaf");

        /**
         * Enum BANDWIDTH_CMTOAP for value: "bandwidth.cmtoap"
         */
        public static final SpecCodeEnum BANDWIDTH_CMTOAP = new SpecCodeEnum("bandwidth.cmtoap");

        /**
         * Enum BANDWIDTH_CMTOCM for value: "bandwidth.cmtocm"
         */
        public static final SpecCodeEnum BANDWIDTH_CMTOCM = new SpecCodeEnum("bandwidth.cmtocm");

        /**
         * Enum BANDWIDTH_CMTOELA for value: "bandwidth.cmtoela"
         */
        public static final SpecCodeEnum BANDWIDTH_CMTOELA = new SpecCodeEnum("bandwidth.cmtoela");

        /**
         * Enum BANDWIDTH_CMTONLA for value: "bandwidth.cmtonla"
         */
        public static final SpecCodeEnum BANDWIDTH_CMTONLA = new SpecCodeEnum("bandwidth.cmtonla");

        /**
         * Enum BANDWIDTH_CMTOWLA for value: "bandwidth.cmtowla"
         */
        public static final SpecCodeEnum BANDWIDTH_CMTOWLA = new SpecCodeEnum("bandwidth.cmtowla");

        /**
         * Enum BANDWIDTH_ELATOELA for value: "bandwidth.elatoela"
         */
        public static final SpecCodeEnum BANDWIDTH_ELATOELA = new SpecCodeEnum("bandwidth.elatoela");

        /**
         * Enum BANDWIDTH_ELATONLA for value: "bandwidth.elatonla"
         */
        public static final SpecCodeEnum BANDWIDTH_ELATONLA = new SpecCodeEnum("bandwidth.elatonla");

        /**
         * Enum BANDWIDTH_WLATOELA for value: "bandwidth.wlatoela"
         */
        public static final SpecCodeEnum BANDWIDTH_WLATOELA = new SpecCodeEnum("bandwidth.wlatoela");

        /**
         * Enum BANDWIDTH_WLATONLA for value: "bandwidth.wlatonla"
         */
        public static final SpecCodeEnum BANDWIDTH_WLATONLA = new SpecCodeEnum("bandwidth.wlatonla");

        /**
         * Enum BANDWIDTH_WLATOWLA for value: "bandwidth.wlatowla"
         */
        public static final SpecCodeEnum BANDWIDTH_WLATOWLA = new SpecCodeEnum("bandwidth.wlatowla");

        private static final Map<String, SpecCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecCodeEnum> createStaticFields() {
            Map<String, SpecCodeEnum> map = new HashMap<>();
            map.put("bandwidth.aftoela", BANDWIDTH_AFTOELA);
            map.put("bandwidth.aftonla", BANDWIDTH_AFTONLA);
            map.put("bandwidth.aftowla", BANDWIDTH_AFTOWLA);
            map.put("bandwidth.aptoaf", BANDWIDTH_APTOAF);
            map.put("bandwidth.aptoap", BANDWIDTH_APTOAP);
            map.put("bandwidth.aptoela", BANDWIDTH_APTOELA);
            map.put("bandwidth.aptonla", BANDWIDTH_APTONLA);
            map.put("bandwidth.aptowla", BANDWIDTH_APTOWLA);
            map.put("bandwidth.cmtoaf", BANDWIDTH_CMTOAF);
            map.put("bandwidth.cmtoap", BANDWIDTH_CMTOAP);
            map.put("bandwidth.cmtocm", BANDWIDTH_CMTOCM);
            map.put("bandwidth.cmtoela", BANDWIDTH_CMTOELA);
            map.put("bandwidth.cmtonla", BANDWIDTH_CMTONLA);
            map.put("bandwidth.cmtowla", BANDWIDTH_CMTOWLA);
            map.put("bandwidth.elatoela", BANDWIDTH_ELATOELA);
            map.put("bandwidth.elatonla", BANDWIDTH_ELATONLA);
            map.put("bandwidth.wlatoela", BANDWIDTH_WLATOELA);
            map.put("bandwidth.wlatonla", BANDWIDTH_WLATONLA);
            map.put("bandwidth.wlatowla", BANDWIDTH_WLATOWLA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecCodeEnum(String value) {
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
        public static SpecCodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SpecCodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SpecCodeEnum(value);
            }
            return result;
        }

        public static SpecCodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SpecCodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SpecCodeEnum) {
                return this.value.equals(((SpecCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private SpecCodeEnum specCode;

    /**
     * 带宽包实例在大陆站或国际站的计费方式。 1：大陆站包周期 2：国际站包周期 3：大陆站按需计费 4：国际站按需计费 5：大陆站按95方式计费 6：国际站按95方式计费
     */
    public static final class BillingModeEnum {

        /**
         * Enum _1 for value: "1"
         */
        public static final BillingModeEnum _1 = new BillingModeEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final BillingModeEnum _2 = new BillingModeEnum("2");

        /**
         * Enum _3 for value: "3"
         */
        public static final BillingModeEnum _3 = new BillingModeEnum("3");

        /**
         * Enum _4 for value: "4"
         */
        public static final BillingModeEnum _4 = new BillingModeEnum("4");

        /**
         * Enum _5 for value: "5"
         */
        public static final BillingModeEnum _5 = new BillingModeEnum("5");

        /**
         * Enum _6 for value: "6"
         */
        public static final BillingModeEnum _6 = new BillingModeEnum("6");

        private static final Map<String, BillingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BillingModeEnum> createStaticFields() {
            Map<String, BillingModeEnum> map = new HashMap<>();
            map.put("1", _1);
            map.put("2", _2);
            map.put("3", _3);
            map.put("4", _4);
            map.put("5", _5);
            map.put("6", _6);
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
     * 带宽包实例的计费方式。 bandwidth是按带宽计费。
     */
    public static final class ChargeModeEnum {

        /**
         * Enum BANDWIDTH for value: "bandwidth"
         */
        public static final ChargeModeEnum BANDWIDTH = new ChargeModeEnum("bandwidth");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("bandwidth", BANDWIDTH);
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
            ChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargeModeEnum(value);
            }
            return result;
        }

        public static ChargeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    /**
     * 带宽包实例绑定的资源类型。 cloud_connection: 云连接实例。
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum CLOUD_CONNECTION for value: "cloud_connection"
         */
        public static final ResourceTypeEnum CLOUD_CONNECTION = new ResourceTypeEnum("cloud_connection");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("cloud_connection", CLOUD_CONNECTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceTypeEnum(value);
            }
            return result;
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    /**
     * 本端大区。 云连接支持的大区有： | Chinese-Mainland | 中国大陆 | | Asia-Pacific | 亚太 | | Africa | 非洲 | | Western-Latin-America | 拉美西 | | Eastern-Latin-America | 拉美东 | | Northern-Latin-America | 拉美北 |
     */
    public static final class LocalAreaIdEnum {

        /**
         * Enum CHINESE_MAINLAND for value: "Chinese-Mainland"
         */
        public static final LocalAreaIdEnum CHINESE_MAINLAND = new LocalAreaIdEnum("Chinese-Mainland");

        /**
         * Enum ASIA_PACIFIC for value: "Asia-Pacific"
         */
        public static final LocalAreaIdEnum ASIA_PACIFIC = new LocalAreaIdEnum("Asia-Pacific");

        /**
         * Enum AFRICA for value: "Africa"
         */
        public static final LocalAreaIdEnum AFRICA = new LocalAreaIdEnum("Africa");

        /**
         * Enum WESTERN_LATIN_AMERICA for value: "Western-Latin-America"
         */
        public static final LocalAreaIdEnum WESTERN_LATIN_AMERICA = new LocalAreaIdEnum("Western-Latin-America");

        /**
         * Enum EASTERN_LATIN_AMERICA for value: "Eastern-Latin-America"
         */
        public static final LocalAreaIdEnum EASTERN_LATIN_AMERICA = new LocalAreaIdEnum("Eastern-Latin-America");

        /**
         * Enum NORTHERN_LATIN_AMERICA for value: "Northern-Latin-America"
         */
        public static final LocalAreaIdEnum NORTHERN_LATIN_AMERICA = new LocalAreaIdEnum("Northern-Latin-America");

        private static final Map<String, LocalAreaIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LocalAreaIdEnum> createStaticFields() {
            Map<String, LocalAreaIdEnum> map = new HashMap<>();
            map.put("Chinese-Mainland", CHINESE_MAINLAND);
            map.put("Asia-Pacific", ASIA_PACIFIC);
            map.put("Africa", AFRICA);
            map.put("Western-Latin-America", WESTERN_LATIN_AMERICA);
            map.put("Eastern-Latin-America", EASTERN_LATIN_AMERICA);
            map.put("Northern-Latin-America", NORTHERN_LATIN_AMERICA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LocalAreaIdEnum(String value) {
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
        public static LocalAreaIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LocalAreaIdEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LocalAreaIdEnum(value);
            }
            return result;
        }

        public static LocalAreaIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LocalAreaIdEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LocalAreaIdEnum) {
                return this.value.equals(((LocalAreaIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_area_id")

    private LocalAreaIdEnum localAreaId;

    /**
     * 远端大区。 云连接支持的大区有： | Chinese-Mainland | 中国大陆 | | Asia-Pacific | 亚太 | | Africa | 非洲 | | Western-Latin-America | 拉美西 | | Eastern-Latin-America | 拉美东 | | Northern-Latin-America | 拉美北 |
     */
    public static final class RemoteAreaIdEnum {

        /**
         * Enum CHINESE_MAINLAND for value: "Chinese-Mainland"
         */
        public static final RemoteAreaIdEnum CHINESE_MAINLAND = new RemoteAreaIdEnum("Chinese-Mainland");

        /**
         * Enum ASIA_PACIFIC for value: "Asia-Pacific"
         */
        public static final RemoteAreaIdEnum ASIA_PACIFIC = new RemoteAreaIdEnum("Asia-Pacific");

        /**
         * Enum AFRICA for value: "Africa"
         */
        public static final RemoteAreaIdEnum AFRICA = new RemoteAreaIdEnum("Africa");

        /**
         * Enum WESTERN_LATIN_AMERICA for value: "Western-Latin-America"
         */
        public static final RemoteAreaIdEnum WESTERN_LATIN_AMERICA = new RemoteAreaIdEnum("Western-Latin-America");

        /**
         * Enum EASTERN_LATIN_AMERICA for value: "Eastern-Latin-America"
         */
        public static final RemoteAreaIdEnum EASTERN_LATIN_AMERICA = new RemoteAreaIdEnum("Eastern-Latin-America");

        /**
         * Enum NORTHERN_LATIN_AMERICA for value: "Northern-Latin-America"
         */
        public static final RemoteAreaIdEnum NORTHERN_LATIN_AMERICA = new RemoteAreaIdEnum("Northern-Latin-America");

        private static final Map<String, RemoteAreaIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RemoteAreaIdEnum> createStaticFields() {
            Map<String, RemoteAreaIdEnum> map = new HashMap<>();
            map.put("Chinese-Mainland", CHINESE_MAINLAND);
            map.put("Asia-Pacific", ASIA_PACIFIC);
            map.put("Africa", AFRICA);
            map.put("Western-Latin-America", WESTERN_LATIN_AMERICA);
            map.put("Eastern-Latin-America", EASTERN_LATIN_AMERICA);
            map.put("Northern-Latin-America", NORTHERN_LATIN_AMERICA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RemoteAreaIdEnum(String value) {
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
        public static RemoteAreaIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RemoteAreaIdEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RemoteAreaIdEnum(value);
            }
            return result;
        }

        public static RemoteAreaIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RemoteAreaIdEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RemoteAreaIdEnum) {
                return this.value.equals(((RemoteAreaIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_area_id")

    private RemoteAreaIdEnum remoteAreaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    /**
     * 互通类型: - Area: 大区互通 - Region: 城域互通
     */
    public static final class InterflowModeEnum {

        /**
         * Enum AREA for value: "Area"
         */
        public static final InterflowModeEnum AREA = new InterflowModeEnum("Area");

        /**
         * Enum REGION for value: "Region"
         */
        public static final InterflowModeEnum REGION = new InterflowModeEnum("Region");

        private static final Map<String, InterflowModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InterflowModeEnum> createStaticFields() {
            Map<String, InterflowModeEnum> map = new HashMap<>();
            map.put("Area", AREA);
            map.put("Region", REGION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InterflowModeEnum(String value) {
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
        public static InterflowModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            InterflowModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InterflowModeEnum(value);
            }
            return result;
        }

        public static InterflowModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            InterflowModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InterflowModeEnum) {
                return this.value.equals(((InterflowModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interflow_mode")

    private InterflowModeEnum interflowMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public BandwidthPackage withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 带宽包实例的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BandwidthPackage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 带宽包实例的名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BandwidthPackage withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 带宽包实例的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BandwidthPackage withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 帐号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public BandwidthPackage withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 带宽包实例的企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public BandwidthPackage withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 带宽包实例的状态。ACTIVE表示状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public BandwidthPackage withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 带宽包实例的创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public BandwidthPackage withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 带宽包实例的更新时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public BandwidthPackage withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 带宽包实例的管理状态。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public BandwidthPackage withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 带宽包实例的订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BandwidthPackage withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 带宽包实例的产品ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BandwidthPackage withSpecCode(SpecCodeEnum specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 带宽包实例的规格编码。 bandwidth.aftoela：大陆站+国际站南非-拉美东 bandwidth.aftonla：大陆站+国际站南非-拉美北 bandwidth.aftowla：大陆站+国际站南非-拉美西 bandwidth.aptoaf：国际站亚太-南非 bandwidth.aptoap：国际站亚太-亚太 bandwidth.aptoela：大陆站+国际站亚太-拉美东 bandwidth.aptonla：大陆站+国际站亚太-拉美北 bandwidth.aptowla：大陆站+国际站亚太-拉美西 bandwidth.cmtoaf：国际站中国大陆-南非 bandwidth.cmtoap：国际站中国大陆-亚太 bandwidth.cmtocm：国际站中国大陆-中国大陆 bandwidth.cmtoela：大陆站+国际站中国大陆-拉美东 bandwidth.cmtonla：大陆站+国际站中国大陆-拉美北 bandwidth.cmtowla：大陆站+国际站中国大陆-拉美西 bandwidth.elatoela：大陆站+国际站拉美东-拉美东 bandwidth.elatonla：大陆站+国际站拉美东-拉美北 bandwidth.wlatoela：大陆站+国际站拉美西-拉美东 bandwidth.wlatonla：大陆站+国际站拉美西-拉美北 bandwidth.wlatowla：大陆站+国际站拉美西-拉美西
     * @return specCode
     */
    public SpecCodeEnum getSpecCode() {
        return specCode;
    }

    public void setSpecCode(SpecCodeEnum specCode) {
        this.specCode = specCode;
    }

    public BandwidthPackage withBillingMode(BillingModeEnum billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    /**
     * 带宽包实例在大陆站或国际站的计费方式。 1：大陆站包周期 2：国际站包周期 3：大陆站按需计费 4：国际站按需计费 5：大陆站按95方式计费 6：国际站按95方式计费
     * @return billingMode
     */
    public BillingModeEnum getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(BillingModeEnum billingMode) {
        this.billingMode = billingMode;
    }

    public BandwidthPackage withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 带宽包实例的计费方式。 bandwidth是按带宽计费。
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public BandwidthPackage withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 带宽包实例中的带宽值。
     * minimum: 2
     * maximum: 999999
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public BandwidthPackage withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 带宽包实例绑定的资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public BandwidthPackage withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 带宽包实例绑定的资源类型。 cloud_connection: 云连接实例。
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public BandwidthPackage withLocalAreaId(LocalAreaIdEnum localAreaId) {
        this.localAreaId = localAreaId;
        return this;
    }

    /**
     * 本端大区。 云连接支持的大区有： | Chinese-Mainland | 中国大陆 | | Asia-Pacific | 亚太 | | Africa | 非洲 | | Western-Latin-America | 拉美西 | | Eastern-Latin-America | 拉美东 | | Northern-Latin-America | 拉美北 |
     * @return localAreaId
     */
    public LocalAreaIdEnum getLocalAreaId() {
        return localAreaId;
    }

    public void setLocalAreaId(LocalAreaIdEnum localAreaId) {
        this.localAreaId = localAreaId;
    }

    public BandwidthPackage withRemoteAreaId(RemoteAreaIdEnum remoteAreaId) {
        this.remoteAreaId = remoteAreaId;
        return this;
    }

    /**
     * 远端大区。 云连接支持的大区有： | Chinese-Mainland | 中国大陆 | | Asia-Pacific | 亚太 | | Africa | 非洲 | | Western-Latin-America | 拉美西 | | Eastern-Latin-America | 拉美东 | | Northern-Latin-America | 拉美北 |
     * @return remoteAreaId
     */
    public RemoteAreaIdEnum getRemoteAreaId() {
        return remoteAreaId;
    }

    public void setRemoteAreaId(RemoteAreaIdEnum remoteAreaId) {
        this.remoteAreaId = remoteAreaId;
    }

    public BandwidthPackage withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BandwidthPackage withInterflowMode(InterflowModeEnum interflowMode) {
        this.interflowMode = interflowMode;
        return this;
    }

    /**
     * 互通类型: - Area: 大区互通 - Region: 城域互通
     * @return interflowMode
     */
    public InterflowModeEnum getInterflowMode() {
        return interflowMode;
    }

    public void setInterflowMode(InterflowModeEnum interflowMode) {
        this.interflowMode = interflowMode;
    }

    public BandwidthPackage withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public BandwidthPackage addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BandwidthPackage withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BandwidthPackage bandwidthPackage = (BandwidthPackage) o;
        return Objects.equals(this.id, bandwidthPackage.id) && Objects.equals(this.name, bandwidthPackage.name)
            && Objects.equals(this.description, bandwidthPackage.description)
            && Objects.equals(this.domainId, bandwidthPackage.domainId)
            && Objects.equals(this.enterpriseProjectId, bandwidthPackage.enterpriseProjectId)
            && Objects.equals(this.status, bandwidthPackage.status)
            && Objects.equals(this.createdAt, bandwidthPackage.createdAt)
            && Objects.equals(this.updatedAt, bandwidthPackage.updatedAt)
            && Objects.equals(this.adminStateUp, bandwidthPackage.adminStateUp)
            && Objects.equals(this.orderId, bandwidthPackage.orderId)
            && Objects.equals(this.productId, bandwidthPackage.productId)
            && Objects.equals(this.specCode, bandwidthPackage.specCode)
            && Objects.equals(this.billingMode, bandwidthPackage.billingMode)
            && Objects.equals(this.chargeMode, bandwidthPackage.chargeMode)
            && Objects.equals(this.bandwidth, bandwidthPackage.bandwidth)
            && Objects.equals(this.resourceId, bandwidthPackage.resourceId)
            && Objects.equals(this.resourceType, bandwidthPackage.resourceType)
            && Objects.equals(this.localAreaId, bandwidthPackage.localAreaId)
            && Objects.equals(this.remoteAreaId, bandwidthPackage.remoteAreaId)
            && Objects.equals(this.projectId, bandwidthPackage.projectId)
            && Objects.equals(this.interflowMode, bandwidthPackage.interflowMode)
            && Objects.equals(this.tags, bandwidthPackage.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            domainId,
            enterpriseProjectId,
            status,
            createdAt,
            updatedAt,
            adminStateUp,
            orderId,
            productId,
            specCode,
            billingMode,
            chargeMode,
            bandwidth,
            resourceId,
            resourceType,
            localAreaId,
            remoteAreaId,
            projectId,
            interflowMode,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthPackage {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    localAreaId: ").append(toIndentedString(localAreaId)).append("\n");
        sb.append("    remoteAreaId: ").append(toIndentedString(remoteAreaId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    interflowMode: ").append(toIndentedString(interflowMode)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
