package com.huaweicloud.sdk.rocketmq.v2.model;

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
 * 创建实例请求体。
 */
public class CreateInstanceByEngineReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 消息引擎。取值填写为：reliability。
     */
    public static final class EngineEnum {

        /**
         * Enum RELIABILITY for value: "reliability"
         */
        public static final EngineEnum RELIABILITY = new EngineEnum("reliability");

        private static final Map<String, EngineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineEnum> createStaticFields() {
            Map<String, EngineEnum> map = new HashMap<>();
            map.put("reliability", RELIABILITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineEnum(String value) {
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
        public static EngineEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineEnum(value));
        }

        public static EngineEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineEnum) {
                return this.value.equals(((EngineEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private EngineEnum engine;

    /**
     * 消息引擎的版本。取值填写为：[4.8.0](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[5.x](tag:hcs,fcs)。
     */
    public static final class EngineVersionEnum {

        /**
         * Enum _4_8_0_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_5_X_TAG_HCS_ for value: "[4.8.0](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[5.x](tag:hcs)"
         */
        public static final EngineVersionEnum _4_8_0_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_5_X_TAG_HCS_ =
            new EngineVersionEnum(
                "[4.8.0](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[5.x](tag:hcs)");

        private static final Map<String, EngineVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineVersionEnum> createStaticFields() {
            Map<String, EngineVersionEnum> map = new HashMap<>();
            map.put("[4.8.0](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[5.x](tag:hcs)",
                _4_8_0_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_5_X_TAG_HCS_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineVersionEnum(String value) {
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
        public static EngineVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineVersionEnum(value));
        }

        public static EngineVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineVersionEnum) {
                return this.value.equals(((EngineVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private EngineVersionEnum engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_space")

    private Integer storageSpace;

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
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    /**
     * RocketMQ实例规格。[x86环境后缀为.x86，arm环境后缀为.arm。](tag:hcs,fcs)   - [c6.2u8g.cluster.x86或c6.2u8g.cluster.arm：单个代理最大分区数50，单个代理最大消费组数100](tag:fcs)   - [c6.4u8g.cluster.small：单个代理最大Topic数2000，单个代理最大消费组数2000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.2u8g.single.x86或c6.2u8g.single.arm：单个代理最大Topic数50，单个代理最大消费组数100](tag:hcs)   - [c6.4u8g.cluster：单个代理最大Topic数4000，单个代理最大消费组数4000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.4u16g.cluster.x86或c6.4u16g.cluster.arm：单个代理最大Topic数100，单个代理最大消费组数200](tag:hcs,fcs)   - [c6.8u16g.cluster：单个代理最大Topic数8000，单个代理最大消费组数8000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.8u32g.cluster.x86或c6.8u32g.cluster.arm：单个代理最大Topic数200，单个代理最大消费组数400](tag:hcs,fcs)   - [c6.12u24g.cluster：单个代理最大Topic数12000，单个代理最大消费组数12000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.16u64g.cluster.x86或c6.16u64g.cluster.arm：单个代理最大Topic数300，单个代理最大消费组数600](tag:hcs,fcs)   - [c6.16u32g.cluster：单个代理最大Topic数16000，单个代理最大消费组数16000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.32u128g.cluster.x86或c6.32u128g.cluster.arm：单个代理最大Topic数400，单个代理最大消费组数800](tag:hcs,fcs)
     */
    public static final class ProductIdEnum {

        /**
         * Enum _C6_4U8G_CLUSTER_SMALL_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_2U8G_SINGLE_X86_TAG_HCS_ for value: "[c6.4u8g.cluster.small](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.2u8g.single.x86](tag:hcs)"
         */
        public static final ProductIdEnum _C6_4U8G_CLUSTER_SMALL_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_2U8G_SINGLE_X86_TAG_HCS_ =
            new ProductIdEnum(
                "[c6.4u8g.cluster.small](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.2u8g.single.x86](tag:hcs)");

        /**
         * Enum _C6_4U8G_CLUSTER_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_4U16G_CLUSTER_X86_TAG_HCS_FCS_ for value: "[c6.4u8g.cluster](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.4u16g.cluster.x86](tag:hcs,fcs)"
         */
        public static final ProductIdEnum _C6_4U8G_CLUSTER_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_4U16G_CLUSTER_X86_TAG_HCS_FCS_ =
            new ProductIdEnum(
                "[c6.4u8g.cluster](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.4u16g.cluster.x86](tag:hcs,fcs)");

        /**
         * Enum _C6_8U16G_CLUSTER_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_8U32G_CLUSTER_X86_TAG_HCS_FCS_ for value: "[c6.8u16g.cluster](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.8u32g.cluster.x86](tag:hcs,fcs)"
         */
        public static final ProductIdEnum _C6_8U16G_CLUSTER_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_8U32G_CLUSTER_X86_TAG_HCS_FCS_ =
            new ProductIdEnum(
                "[c6.8u16g.cluster](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.8u32g.cluster.x86](tag:hcs,fcs)");

        /**
         * Enum _C6_12U24G_CLUSTER_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_16U64G_CLUSTER_X86_TAG_HCS_FCS_ for value: "[c6.12u24g.cluster](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.16u64g.cluster.x86](tag:hcs,fcs)"
         */
        public static final ProductIdEnum _C6_12U24G_CLUSTER_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_16U64G_CLUSTER_X86_TAG_HCS_FCS_ =
            new ProductIdEnum(
                "[c6.12u24g.cluster](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.16u64g.cluster.x86](tag:hcs,fcs)");

        /**
         * Enum _C6_16U32G_CLUSTER_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_32U128G_CLUSTER_X86_TAG_HCS_FCS_ for value: "[c6.16u32g.cluster](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.32u128g.cluster.x86](tag:hcs,fcs)"
         */
        public static final ProductIdEnum _C6_16U32G_CLUSTER_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_32U128G_CLUSTER_X86_TAG_HCS_FCS_ =
            new ProductIdEnum(
                "[c6.16u32g.cluster](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.32u128g.cluster.x86](tag:hcs,fcs)");

        /**
         * Enum _C6_2U8G_CLUSTER_X86_TAG_FCS_ for value: "[c6.2u8g.cluster.x86](tag:fcs)"
         */
        public static final ProductIdEnum _C6_2U8G_CLUSTER_X86_TAG_FCS_ =
            new ProductIdEnum("[c6.2u8g.cluster.x86](tag:fcs)");

        /**
         * Enum _C6_2U8G_CLUSTER_ARM_TAG_FCS_ for value: "[c6.2u8g.cluster.arm](tag:fcs)"
         */
        public static final ProductIdEnum _C6_2U8G_CLUSTER_ARM_TAG_FCS_ =
            new ProductIdEnum("[c6.2u8g.cluster.arm](tag:fcs)");

        /**
         * Enum _C6_2U8G_SINGLE_ARM_TAG_HCS_ for value: "[c6.2u8g.single.arm](tag:hcs)"
         */
        public static final ProductIdEnum _C6_2U8G_SINGLE_ARM_TAG_HCS_ =
            new ProductIdEnum("[c6.2u8g.single.arm](tag:hcs)");

        /**
         * Enum _C6_4U16G_CLUSTER_ARM_TAG_HCS_FCS_ for value: "[c6.4u16g.cluster.arm](tag:hcs,fcs)"
         */
        public static final ProductIdEnum _C6_4U16G_CLUSTER_ARM_TAG_HCS_FCS_ =
            new ProductIdEnum("[c6.4u16g.cluster.arm](tag:hcs,fcs)");

        /**
         * Enum _C6_8U32G_CLUSTER_ARM_TAG_HCS_FCS_ for value: "[c6.8u32g.cluster.arm](tag:hcs,fcs)"
         */
        public static final ProductIdEnum _C6_8U32G_CLUSTER_ARM_TAG_HCS_FCS_ =
            new ProductIdEnum("[c6.8u32g.cluster.arm](tag:hcs,fcs)");

        /**
         * Enum _C6_16U64G_CLUSTER_ARM_TAG_HCS_FCS_ for value: "[c6.16u64g.cluster.arm](tag:hcs,fcs)"
         */
        public static final ProductIdEnum _C6_16U64G_CLUSTER_ARM_TAG_HCS_FCS_ =
            new ProductIdEnum("[c6.16u64g.cluster.arm](tag:hcs,fcs)");

        /**
         * Enum _C6_32U128G_CLUSTER_ARM_TAG_HCS_FCS_ for value: "[c6.32u128g.cluster.arm](tag:hcs,fcs)"
         */
        public static final ProductIdEnum _C6_32U128G_CLUSTER_ARM_TAG_HCS_FCS_ =
            new ProductIdEnum("[c6.32u128g.cluster.arm](tag:hcs,fcs)");

        private static final Map<String, ProductIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProductIdEnum> createStaticFields() {
            Map<String, ProductIdEnum> map = new HashMap<>();
            map.put(
                "[c6.4u8g.cluster.small](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.2u8g.single.x86](tag:hcs)",
                _C6_4U8G_CLUSTER_SMALL_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_2U8G_SINGLE_X86_TAG_HCS_);
            map.put(
                "[c6.4u8g.cluster](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.4u16g.cluster.x86](tag:hcs,fcs)",
                _C6_4U8G_CLUSTER_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_4U16G_CLUSTER_X86_TAG_HCS_FCS_);
            map.put(
                "[c6.8u16g.cluster](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.8u32g.cluster.x86](tag:hcs,fcs)",
                _C6_8U16G_CLUSTER_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_8U32G_CLUSTER_X86_TAG_HCS_FCS_);
            map.put(
                "[c6.12u24g.cluster](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.16u64g.cluster.x86](tag:hcs,fcs)",
                _C6_12U24G_CLUSTER_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_16U64G_CLUSTER_X86_TAG_HCS_FCS_);
            map.put(
                "[c6.16u32g.cluster](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.32u128g.cluster.x86](tag:hcs,fcs)",
                _C6_16U32G_CLUSTER_TAG_HWS_HWS_EU_HWS_HK_OCB_HWS_OCB_CTC_G42_HK_G42_TM_SBC_HK_SBC_HK_TM_DT_C6_32U128G_CLUSTER_X86_TAG_HCS_FCS_);
            map.put("[c6.2u8g.cluster.x86](tag:fcs)", _C6_2U8G_CLUSTER_X86_TAG_FCS_);
            map.put("[c6.2u8g.cluster.arm](tag:fcs)", _C6_2U8G_CLUSTER_ARM_TAG_FCS_);
            map.put("[c6.2u8g.single.arm](tag:hcs)", _C6_2U8G_SINGLE_ARM_TAG_HCS_);
            map.put("[c6.4u16g.cluster.arm](tag:hcs,fcs)", _C6_4U16G_CLUSTER_ARM_TAG_HCS_FCS_);
            map.put("[c6.8u32g.cluster.arm](tag:hcs,fcs)", _C6_8U32G_CLUSTER_ARM_TAG_HCS_FCS_);
            map.put("[c6.16u64g.cluster.arm](tag:hcs,fcs)", _C6_16U64G_CLUSTER_ARM_TAG_HCS_FCS_);
            map.put("[c6.32u128g.cluster.arm](tag:hcs,fcs)", _C6_32U128G_CLUSTER_ARM_TAG_HCS_FCS_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProductIdEnum(String value) {
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
        public static ProductIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProductIdEnum(value));
        }

        public static ProductIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProductIdEnum) {
                return this.value.equals(((ProductIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private ProductIdEnum productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_enable")

    private Boolean sslEnable;

    /**
     * 存储IO规格。   - dms.physical.storage.high.v2: 高IO类型磁盘   - dms.physical.storage.ultra.v2: 超高IO类型磁盘
     */
    public static final class StorageSpecCodeEnum {

        /**
         * Enum DMS_PHYSICAL_STORAGE_HIGH_V2 for value: "dms.physical.storage.high.v2"
         */
        public static final StorageSpecCodeEnum DMS_PHYSICAL_STORAGE_HIGH_V2 =
            new StorageSpecCodeEnum("dms.physical.storage.high.v2");

        /**
         * Enum DMS_PHYSICAL_STORAGE_ULTRA_V2 for value: "dms.physical.storage.ultra.v2"
         */
        public static final StorageSpecCodeEnum DMS_PHYSICAL_STORAGE_ULTRA_V2 =
            new StorageSpecCodeEnum("dms.physical.storage.ultra.v2");

        private static final Map<String, StorageSpecCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageSpecCodeEnum> createStaticFields() {
            Map<String, StorageSpecCodeEnum> map = new HashMap<>();
            map.put("dms.physical.storage.high.v2", DMS_PHYSICAL_STORAGE_HIGH_V2);
            map.put("dms.physical.storage.ultra.v2", DMS_PHYSICAL_STORAGE_ULTRA_V2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageSpecCodeEnum(String value) {
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
        public static StorageSpecCodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StorageSpecCodeEnum(value));
        }

        public static StorageSpecCodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StorageSpecCodeEnum) {
                return this.value.equals(((StorageSpecCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_spec_code")

    private StorageSpecCodeEnum storageSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_acl")

    private Boolean enableAcl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_enable")

    private Boolean proxyEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_publicip")

    private Boolean enablePublicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_num")

    private Integer brokerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch_type")

    private String archType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_mode")

    private String tlsMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bss_param")

    private BssParam bssParam;

    public CreateInstanceByEngineReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。  由英文字符开头，只能由英文字母、数字、中划线、下划线组成，长度为4~64的字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInstanceByEngineReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例的描述信息。  长度不超过1024的字符串。[且字符串不能包含\">\"与\"<\"，字符串首字符不能为\"=\",\"+\",\"-\",\"@\"的全角和半角字符。](tag:hcs)  > \\与\"在json报文中属于特殊字符，如果参数值中需要显示\\或者\"字符，请在字符前增加转义字符\\，比如\\\\或者\\\"。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateInstanceByEngineReq withEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 消息引擎。取值填写为：reliability。
     * @return engine
     */
    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    public CreateInstanceByEngineReq withEngineVersion(EngineVersionEnum engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 消息引擎的版本。取值填写为：[4.8.0](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[5.x](tag:hcs,fcs)。
     * @return engineVersion
     */
    public EngineVersionEnum getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(EngineVersionEnum engineVersion) {
        this.engineVersion = engineVersion;
    }

    public CreateInstanceByEngineReq withStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }

    /**
     * 存储空间。
     * @return storageSpace
     */
    public Integer getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
    }

    public CreateInstanceByEngineReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID。  获取方法如下：登录虚拟私有云服务的控制台界面，在虚拟私有云的详情页面查找VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateInstanceByEngineReq withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网信息。  获取方法如下：登录虚拟私有云服务的控制台界面，单击VPC下的子网，进入子网详情页面，查找网络ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateInstanceByEngineReq withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 指定实例所属的安全组。  获取方法如下：登录虚拟私有云服务的控制台界面，在安全组的详情页面查找安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateInstanceByEngineReq withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public CreateInstanceByEngineReq addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public CreateInstanceByEngineReq withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 创建节点到指定且有资源的可用区ID。请参考[查询可用区信息](ListAvailableZones.xml)获取可用区ID。  该参数不能为空数组或者数组的值为空， 请注意查看该可用区是否有资源。  创建RocketMQ实例，支持节点部署在1个或3个及3个以上的可用区。在为节点指定可用区时，用逗号分隔开。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public CreateInstanceByEngineReq withProductId(ProductIdEnum productId) {
        this.productId = productId;
        return this;
    }

    /**
     * RocketMQ实例规格。[x86环境后缀为.x86，arm环境后缀为.arm。](tag:hcs,fcs)   - [c6.2u8g.cluster.x86或c6.2u8g.cluster.arm：单个代理最大分区数50，单个代理最大消费组数100](tag:fcs)   - [c6.4u8g.cluster.small：单个代理最大Topic数2000，单个代理最大消费组数2000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.2u8g.single.x86或c6.2u8g.single.arm：单个代理最大Topic数50，单个代理最大消费组数100](tag:hcs)   - [c6.4u8g.cluster：单个代理最大Topic数4000，单个代理最大消费组数4000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.4u16g.cluster.x86或c6.4u16g.cluster.arm：单个代理最大Topic数100，单个代理最大消费组数200](tag:hcs,fcs)   - [c6.8u16g.cluster：单个代理最大Topic数8000，单个代理最大消费组数8000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.8u32g.cluster.x86或c6.8u32g.cluster.arm：单个代理最大Topic数200，单个代理最大消费组数400](tag:hcs,fcs)   - [c6.12u24g.cluster：单个代理最大Topic数12000，单个代理最大消费组数12000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.16u64g.cluster.x86或c6.16u64g.cluster.arm：单个代理最大Topic数300，单个代理最大消费组数600](tag:hcs,fcs)   - [c6.16u32g.cluster：单个代理最大Topic数16000，单个代理最大消费组数16000](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt)[c6.32u128g.cluster.x86或c6.32u128g.cluster.arm：单个代理最大Topic数400，单个代理最大消费组数800](tag:hcs,fcs)
     * @return productId
     */
    public ProductIdEnum getProductId() {
        return productId;
    }

    public void setProductId(ProductIdEnum productId) {
        this.productId = productId;
    }

    public CreateInstanceByEngineReq withSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
        return this;
    }

    /**
     * 是否打开SSL加密访问。 - true：打开SSL加密访问。 - false：不打开SSL加密访问。
     * @return sslEnable
     */
    public Boolean getSslEnable() {
        return sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    public CreateInstanceByEngineReq withStorageSpecCode(StorageSpecCodeEnum storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
        return this;
    }

    /**
     * 存储IO规格。   - dms.physical.storage.high.v2: 高IO类型磁盘   - dms.physical.storage.ultra.v2: 超高IO类型磁盘
     * @return storageSpecCode
     */
    public StorageSpecCodeEnum getStorageSpecCode() {
        return storageSpecCode;
    }

    public void setStorageSpecCode(StorageSpecCodeEnum storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
    }

    public CreateInstanceByEngineReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。若为企业项目账号，该参数必填。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateInstanceByEngineReq withEnableAcl(Boolean enableAcl) {
        this.enableAcl = enableAcl;
        return this;
    }

    /**
     * 是否开启访问控制列表。
     * @return enableAcl
     */
    public Boolean getEnableAcl() {
        return enableAcl;
    }

    public void setEnableAcl(Boolean enableAcl) {
        this.enableAcl = enableAcl;
    }

    public CreateInstanceByEngineReq withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 是否支持IPv6。   - true：支持   - false：不支持
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public CreateInstanceByEngineReq withProxyEnable(Boolean proxyEnable) {
        this.proxyEnable = proxyEnable;
        return this;
    }

    /**
     * 是否开启Proxy功能。   - true：支持   - false：不支持
     * @return proxyEnable
     */
    public Boolean getProxyEnable() {
        return proxyEnable;
    }

    public void setProxyEnable(Boolean proxyEnable) {
        this.proxyEnable = proxyEnable;
    }

    public CreateInstanceByEngineReq withEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
        return this;
    }

    /**
     * 是否开启公网访问功能。默认不开启公网。 - true：开启 - false：不开启
     * @return enablePublicip
     */
    public Boolean getEnablePublicip() {
        return enablePublicip;
    }

    public void setEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
    }

    public CreateInstanceByEngineReq withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * 实例绑定的弹性IP地址的ID。  以英文逗号隔开多个弹性IP地址的ID。  如果开启了公网访问功能（即enable_publicip为true），该字段为必选。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public CreateInstanceByEngineReq withBrokerNum(Integer brokerNum) {
        this.brokerNum = brokerNum;
        return this;
    }

    /**
     * 代理个数。
     * @return brokerNum
     */
    public Integer getBrokerNum() {
        return brokerNum;
    }

    public void setBrokerNum(Integer brokerNum) {
        this.brokerNum = brokerNum;
    }

    public CreateInstanceByEngineReq withArchType(String archType) {
        this.archType = archType;
        return this;
    }

    /**
     * 架构类型。
     * @return archType
     */
    public String getArchType() {
        return archType;
    }

    public void setArchType(String archType) {
        this.archType = archType;
    }

    public CreateInstanceByEngineReq withTlsMode(String tlsMode) {
        this.tlsMode = tlsMode;
        return this;
    }

    /**
     * 实例使用的安全协议。
     * @return tlsMode
     */
    public String getTlsMode() {
        return tlsMode;
    }

    public void setTlsMode(String tlsMode) {
        this.tlsMode = tlsMode;
    }

    public CreateInstanceByEngineReq withBssParam(BssParam bssParam) {
        this.bssParam = bssParam;
        return this;
    }

    public CreateInstanceByEngineReq withBssParam(Consumer<BssParam> bssParamSetter) {
        if (this.bssParam == null) {
            this.bssParam = new BssParam();
            bssParamSetter.accept(this.bssParam);
        }

        return this;
    }

    /**
     * Get bssParam
     * @return bssParam
     */
    public BssParam getBssParam() {
        return bssParam;
    }

    public void setBssParam(BssParam bssParam) {
        this.bssParam = bssParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstanceByEngineReq that = (CreateInstanceByEngineReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.engine, that.engine) && Objects.equals(this.engineVersion, that.engineVersion)
            && Objects.equals(this.storageSpace, that.storageSpace) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.availableZones, that.availableZones)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.sslEnable, that.sslEnable)
            && Objects.equals(this.storageSpecCode, that.storageSpecCode)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enableAcl, that.enableAcl) && Objects.equals(this.ipv6Enable, that.ipv6Enable)
            && Objects.equals(this.proxyEnable, that.proxyEnable)
            && Objects.equals(this.enablePublicip, that.enablePublicip)
            && Objects.equals(this.publicipId, that.publicipId) && Objects.equals(this.brokerNum, that.brokerNum)
            && Objects.equals(this.archType, that.archType) && Objects.equals(this.tlsMode, that.tlsMode)
            && Objects.equals(this.bssParam, that.bssParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            engine,
            engineVersion,
            storageSpace,
            vpcId,
            subnetId,
            securityGroupId,
            availableZones,
            productId,
            sslEnable,
            storageSpecCode,
            enterpriseProjectId,
            enableAcl,
            ipv6Enable,
            proxyEnable,
            enablePublicip,
            publicipId,
            brokerNum,
            archType,
            tlsMode,
            bssParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceByEngineReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
        sb.append("    storageSpecCode: ").append(toIndentedString(storageSpecCode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enableAcl: ").append(toIndentedString(enableAcl)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    proxyEnable: ").append(toIndentedString(proxyEnable)).append("\n");
        sb.append("    enablePublicip: ").append(toIndentedString(enablePublicip)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    brokerNum: ").append(toIndentedString(brokerNum)).append("\n");
        sb.append("    archType: ").append(toIndentedString(archType)).append("\n");
        sb.append("    tlsMode: ").append(toIndentedString(tlsMode)).append("\n");
        sb.append("    bssParam: ").append(toIndentedString(bssParam)).append("\n");
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
