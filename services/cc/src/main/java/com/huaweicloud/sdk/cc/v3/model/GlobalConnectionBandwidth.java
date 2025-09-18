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
 * 全域互联带宽实例的详细信息。
 */
public class GlobalConnectionBandwidth {

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
    @JsonProperty(value = "bordercross")

    private Boolean bordercross;

    /**
     * 功能说明：描述带宽类型，对应地理区间的城域、区域、大区、跨区四级： - TrsArea: 跨区带宽 - Area: 大区带宽 - SubArea: 区域带宽 - Region: 城域带宽
     */
    public static final class TypeEnum {

        /**
         * Enum REGION for value: "Region"
         */
        public static final TypeEnum REGION = new TypeEnum("Region");

        /**
         * Enum SUBAREA for value: "SubArea"
         */
        public static final TypeEnum SUBAREA = new TypeEnum("SubArea");

        /**
         * Enum AREA for value: "Area"
         */
        public static final TypeEnum AREA = new TypeEnum("Area");

        /**
         * Enum TRSAREA for value: "TrsArea"
         */
        public static final TypeEnum TRSAREA = new TypeEnum("TrsArea");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("Region", REGION);
            map.put("SubArea", SUBAREA);
            map.put("Area", AREA);
            map.put("TrsArea", TRSAREA);
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

    /**
     * 功能说明：绑定的服务类型。实例类型： - CC: 云连接 - GEIP: 全域弹性公网IP - GCN: 中心网络 - GSN: 分支网络 - ALL: 所有实例类型
     */
    public static final class BindingServiceEnum {

        /**
         * Enum CC for value: "CC"
         */
        public static final BindingServiceEnum CC = new BindingServiceEnum("CC");

        /**
         * Enum GEIP for value: "GEIP"
         */
        public static final BindingServiceEnum GEIP = new BindingServiceEnum("GEIP");

        /**
         * Enum GCN for value: "GCN"
         */
        public static final BindingServiceEnum GCN = new BindingServiceEnum("GCN");

        /**
         * Enum GSN for value: "GSN"
         */
        public static final BindingServiceEnum GSN = new BindingServiceEnum("GSN");

        /**
         * Enum ALL for value: "ALL"
         */
        public static final BindingServiceEnum ALL = new BindingServiceEnum("ALL");

        private static final Map<String, BindingServiceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BindingServiceEnum> createStaticFields() {
            Map<String, BindingServiceEnum> map = new HashMap<>();
            map.put("CC", CC);
            map.put("GEIP", GEIP);
            map.put("GCN", GCN);
            map.put("GSN", GSN);
            map.put("ALL", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BindingServiceEnum(String value) {
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
        public static BindingServiceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BindingServiceEnum(value));
        }

        public static BindingServiceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BindingServiceEnum) {
                return this.value.equals(((BindingServiceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_service")

    private BindingServiceEnum bindingService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 功能说明：描述计费类型，描述可选计费类型。默认开放按带宽计费，传统95计费租户白名单控制。 取值范围：     bwd: 按带宽计费     95: 按传统型95计费     95avr: 按传统型日95计费
     */
    public static final class ChargeModeEnum {

        /**
         * Enum BWD for value: "bwd"
         */
        public static final ChargeModeEnum BWD = new ChargeModeEnum("bwd");

        /**
         * Enum _95 for value: "95"
         */
        public static final ChargeModeEnum _95 = new ChargeModeEnum("95");

        /**
         * Enum _95AVR for value: "95avr"
         */
        public static final ChargeModeEnum _95AVR = new ChargeModeEnum("95avr");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("bwd", BWD);
            map.put("95", _95);
            map.put("95avr", _95AVR);
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
    @JsonProperty(value = "size")

    private Integer size;

    /**
     * 功能说明：描述网络等级，从高到低分为铂金、金、银。默认金，其余租户白名单控制。 - Pt: 铂金 - Au: 金 - Ag: 银
     */
    public static final class SlaLevelEnum {

        /**
         * Enum PT for value: "Pt"
         */
        public static final SlaLevelEnum PT = new SlaLevelEnum("Pt");

        /**
         * Enum AU for value: "Au"
         */
        public static final SlaLevelEnum AU = new SlaLevelEnum("Au");

        /**
         * Enum AG for value: "Ag"
         */
        public static final SlaLevelEnum AG = new SlaLevelEnum("Ag");

        private static final Map<String, SlaLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SlaLevelEnum> createStaticFields() {
            Map<String, SlaLevelEnum> map = new HashMap<>();
            map.put("Pt", PT);
            map.put("Au", AU);
            map.put("Ag", AG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SlaLevelEnum(String value) {
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
        public static SlaLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SlaLevelEnum(value));
        }

        public static SlaLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SlaLevelEnum) {
                return this.value.equals(((SlaLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_level")

    private SlaLevelEnum slaLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_area")

    private String localArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_area")

    private String remoteArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_site_code")

    private String localSiteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_site_code")

    private String remoteSiteCode;

    /**
     * 功能说明: 全域互联带宽状态。 取值范围：     NORMAL-正常     FREEZED-冻结状态
     */
    public static final class AdminStateEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final AdminStateEnum NORMAL = new AdminStateEnum("NORMAL");

        /**
         * Enum FREEZED for value: "FREEZED"
         */
        public static final AdminStateEnum FREEZED = new AdminStateEnum("FREEZED");

        private static final Map<String, AdminStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AdminStateEnum> createStaticFields() {
            Map<String, AdminStateEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("FREEZED", FREEZED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AdminStateEnum(String value) {
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
        public static AdminStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AdminStateEnum(value));
        }

        public static AdminStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AdminStateEnum) {
                return this.value.equals(((AdminStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state")

    private AdminStateEnum adminState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen")

    private Boolean frozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code_id")

    private String specCodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directional_connections")

    private List<DirectionalConnection> directionalConnections = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_share")

    private Boolean enableShare;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<GlobalConnectionBandwidthAssociatedInstance> instances = null;

    public GlobalConnectionBandwidth withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GlobalConnectionBandwidth withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GlobalConnectionBandwidth withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述。不支持 <>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GlobalConnectionBandwidth withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 实例所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public GlobalConnectionBandwidth withBordercross(Boolean bordercross) {
        this.bordercross = bordercross;
        return this;
    }

    /**
     * 全域互联带宽跨境属性。
     * @return bordercross
     */
    public Boolean getBordercross() {
        return bordercross;
    }

    public void setBordercross(Boolean bordercross) {
        this.bordercross = bordercross;
    }

    public GlobalConnectionBandwidth withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 功能说明：描述带宽类型，对应地理区间的城域、区域、大区、跨区四级： - TrsArea: 跨区带宽 - Area: 大区带宽 - SubArea: 区域带宽 - Region: 城域带宽
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public GlobalConnectionBandwidth withBindingService(BindingServiceEnum bindingService) {
        this.bindingService = bindingService;
        return this;
    }

    /**
     * 功能说明：绑定的服务类型。实例类型： - CC: 云连接 - GEIP: 全域弹性公网IP - GCN: 中心网络 - GSN: 分支网络 - ALL: 所有实例类型
     * @return bindingService
     */
    public BindingServiceEnum getBindingService() {
        return bindingService;
    }

    public void setBindingService(BindingServiceEnum bindingService) {
        this.bindingService = bindingService;
    }

    public GlobalConnectionBandwidth withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 实例所属企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public GlobalConnectionBandwidth withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 功能说明：描述计费类型，描述可选计费类型。默认开放按带宽计费，传统95计费租户白名单控制。 取值范围：     bwd: 按带宽计费     95: 按传统型95计费     95avr: 按传统型日95计费
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public GlobalConnectionBandwidth withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 功能说明：全域互联带宽实例中的带宽值大小，单位Mbit/s。 取值范围：2-300Mbit/s
     * minimum: 2
     * maximum: 300
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public GlobalConnectionBandwidth withSlaLevel(SlaLevelEnum slaLevel) {
        this.slaLevel = slaLevel;
        return this;
    }

    /**
     * 功能说明：描述网络等级，从高到低分为铂金、金、银。默认金，其余租户白名单控制。 - Pt: 铂金 - Au: 金 - Ag: 银
     * @return slaLevel
     */
    public SlaLevelEnum getSlaLevel() {
        return slaLevel;
    }

    public void setSlaLevel(SlaLevelEnum slaLevel) {
        this.slaLevel = slaLevel;
    }

    public GlobalConnectionBandwidth withLocalArea(String localArea) {
        this.localArea = localArea;
        return this;
    }

    /**
     * 功能说明：本端接入点的中英文名。通过HEADER里面的x-language控制，默认英文，zh-cn返回中文。
     * @return localArea
     */
    public String getLocalArea() {
        return localArea;
    }

    public void setLocalArea(String localArea) {
        this.localArea = localArea;
    }

    public GlobalConnectionBandwidth withRemoteArea(String remoteArea) {
        this.remoteArea = remoteArea;
        return this;
    }

    /**
     * 功能说明：远端接入点的中英文名。通过HEADER里面的x-language控制，默认英文，zh-cn返回中文。
     * @return remoteArea
     */
    public String getRemoteArea() {
        return remoteArea;
    }

    public void setRemoteArea(String remoteArea) {
        this.remoteArea = remoteArea;
    }

    public GlobalConnectionBandwidth withLocalSiteCode(String localSiteCode) {
        this.localSiteCode = localSiteCode;
        return this;
    }

    /**
     * 功能说明：本端接入点的编码。
     * @return localSiteCode
     */
    public String getLocalSiteCode() {
        return localSiteCode;
    }

    public void setLocalSiteCode(String localSiteCode) {
        this.localSiteCode = localSiteCode;
    }

    public GlobalConnectionBandwidth withRemoteSiteCode(String remoteSiteCode) {
        this.remoteSiteCode = remoteSiteCode;
        return this;
    }

    /**
     * 功能说明：远端接入点的编码。
     * @return remoteSiteCode
     */
    public String getRemoteSiteCode() {
        return remoteSiteCode;
    }

    public void setRemoteSiteCode(String remoteSiteCode) {
        this.remoteSiteCode = remoteSiteCode;
    }

    public GlobalConnectionBandwidth withAdminState(AdminStateEnum adminState) {
        this.adminState = adminState;
        return this;
    }

    /**
     * 功能说明: 全域互联带宽状态。 取值范围：     NORMAL-正常     FREEZED-冻结状态
     * @return adminState
     */
    public AdminStateEnum getAdminState() {
        return adminState;
    }

    public void setAdminState(AdminStateEnum adminState) {
        this.adminState = adminState;
    }

    public GlobalConnectionBandwidth withFrozen(Boolean frozen) {
        this.frozen = frozen;
        return this;
    }

    /**
     * 功能说明: 全域互联带宽是否冻结。 取值范围：     true-冻结     false-非冻结
     * @return frozen
     */
    public Boolean getFrozen() {
        return frozen;
    }

    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    public GlobalConnectionBandwidth withSpecCodeId(String specCodeId) {
        this.specCodeId = specCodeId;
        return this;
    }

    /**
     * 功能说明：线路规格编码UUID。
     * @return specCodeId
     */
    public String getSpecCodeId() {
        return specCodeId;
    }

    public void setSpecCodeId(String specCodeId) {
        this.specCodeId = specCodeId;
    }

    public GlobalConnectionBandwidth withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public GlobalConnectionBandwidth addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public GlobalConnectionBandwidth withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 实例标签。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public GlobalConnectionBandwidth withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 实例创建时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public GlobalConnectionBandwidth withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 实例更新时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GlobalConnectionBandwidth withDirectionalConnections(List<DirectionalConnection> directionalConnections) {
        this.directionalConnections = directionalConnections;
        return this;
    }

    public GlobalConnectionBandwidth addDirectionalConnectionsItem(DirectionalConnection directionalConnectionsItem) {
        if (this.directionalConnections == null) {
            this.directionalConnections = new ArrayList<>();
        }
        this.directionalConnections.add(directionalConnectionsItem);
        return this;
    }

    public GlobalConnectionBandwidth withDirectionalConnections(
        Consumer<List<DirectionalConnection>> directionalConnectionsSetter) {
        if (this.directionalConnections == null) {
            this.directionalConnections = new ArrayList<>();
        }
        directionalConnectionsSetter.accept(this.directionalConnections);
        return this;
    }

    /**
     * 有向连接列表。
     * @return directionalConnections
     */
    public List<DirectionalConnection> getDirectionalConnections() {
        return directionalConnections;
    }

    public void setDirectionalConnections(List<DirectionalConnection> directionalConnections) {
        this.directionalConnections = directionalConnections;
    }

    public GlobalConnectionBandwidth withEnableShare(Boolean enableShare) {
        this.enableShare = enableShare;
        return this;
    }

    /**
     * 功能说明: 全域互联带宽是否支持绑定多实例。 取值范围：     true-支持     false-不支持
     * @return enableShare
     */
    public Boolean getEnableShare() {
        return enableShare;
    }

    public void setEnableShare(Boolean enableShare) {
        this.enableShare = enableShare;
    }

    public GlobalConnectionBandwidth withInstances(List<GlobalConnectionBandwidthAssociatedInstance> instances) {
        this.instances = instances;
        return this;
    }

    public GlobalConnectionBandwidth addInstancesItem(GlobalConnectionBandwidthAssociatedInstance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public GlobalConnectionBandwidth withInstances(
        Consumer<List<GlobalConnectionBandwidthAssociatedInstance>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 功能说明: 全域互联带宽绑定实例列表。
     * @return instances
     */
    public List<GlobalConnectionBandwidthAssociatedInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<GlobalConnectionBandwidthAssociatedInstance> instances) {
        this.instances = instances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalConnectionBandwidth that = (GlobalConnectionBandwidth) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.bordercross, that.bordercross) && Objects.equals(this.type, that.type)
            && Objects.equals(this.bindingService, that.bindingService)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.size, that.size)
            && Objects.equals(this.slaLevel, that.slaLevel) && Objects.equals(this.localArea, that.localArea)
            && Objects.equals(this.remoteArea, that.remoteArea)
            && Objects.equals(this.localSiteCode, that.localSiteCode)
            && Objects.equals(this.remoteSiteCode, that.remoteSiteCode)
            && Objects.equals(this.adminState, that.adminState) && Objects.equals(this.frozen, that.frozen)
            && Objects.equals(this.specCodeId, that.specCodeId) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.directionalConnections, that.directionalConnections)
            && Objects.equals(this.enableShare, that.enableShare) && Objects.equals(this.instances, that.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            domainId,
            bordercross,
            type,
            bindingService,
            enterpriseProjectId,
            chargeMode,
            size,
            slaLevel,
            localArea,
            remoteArea,
            localSiteCode,
            remoteSiteCode,
            adminState,
            frozen,
            specCodeId,
            tags,
            createdAt,
            updatedAt,
            directionalConnections,
            enableShare,
            instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalConnectionBandwidth {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    bordercross: ").append(toIndentedString(bordercross)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    bindingService: ").append(toIndentedString(bindingService)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    slaLevel: ").append(toIndentedString(slaLevel)).append("\n");
        sb.append("    localArea: ").append(toIndentedString(localArea)).append("\n");
        sb.append("    remoteArea: ").append(toIndentedString(remoteArea)).append("\n");
        sb.append("    localSiteCode: ").append(toIndentedString(localSiteCode)).append("\n");
        sb.append("    remoteSiteCode: ").append(toIndentedString(remoteSiteCode)).append("\n");
        sb.append("    adminState: ").append(toIndentedString(adminState)).append("\n");
        sb.append("    frozen: ").append(toIndentedString(frozen)).append("\n");
        sb.append("    specCodeId: ").append(toIndentedString(specCodeId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    directionalConnections: ").append(toIndentedString(directionalConnections)).append("\n");
        sb.append("    enableShare: ").append(toIndentedString(enableShare)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
