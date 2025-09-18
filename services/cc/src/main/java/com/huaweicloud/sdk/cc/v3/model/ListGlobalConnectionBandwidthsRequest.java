package com.huaweicloud.sdk.cc.v3.model;

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
public class ListGlobalConnectionBandwidthsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private List<String> instanceId = null;

    /**
     * Gets or Sets instanceType
     */
    public static final class InstanceTypeEnum {

        /**
         * Enum CC for value: "CC"
         */
        public static final InstanceTypeEnum CC = new InstanceTypeEnum("CC");

        /**
         * Enum GEIP for value: "GEIP"
         */
        public static final InstanceTypeEnum GEIP = new InstanceTypeEnum("GEIP");

        /**
         * Enum GCN for value: "GCN"
         */
        public static final InstanceTypeEnum GCN = new InstanceTypeEnum("GCN");

        /**
         * Enum GSN for value: "GSN"
         */
        public static final InstanceTypeEnum GSN = new InstanceTypeEnum("GSN");

        private static final Map<String, InstanceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceTypeEnum> createStaticFields() {
            Map<String, InstanceTypeEnum> map = new HashMap<>();
            map.put("CC", CC);
            map.put("GEIP", GEIP);
            map.put("GCN", GCN);
            map.put("GSN", GSN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceTypeEnum(String value) {
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
        public static InstanceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceTypeEnum(value));
        }

        public static InstanceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceTypeEnum) {
                return this.value.equals(((InstanceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private List<InstanceTypeEnum> instanceType = null;

    /**
     * Gets or Sets bindingService
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

        private static final Map<String, BindingServiceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BindingServiceEnum> createStaticFields() {
            Map<String, BindingServiceEnum> map = new HashMap<>();
            map.put("CC", CC);
            map.put("GEIP", GEIP);
            map.put("GCN", GCN);
            map.put("GSN", GSN);
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

    private List<BindingServiceEnum> bindingService = null;

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum TRSAREA for value: "TrsArea"
         */
        public static final TypeEnum TRSAREA = new TypeEnum("TrsArea");

        /**
         * Enum AREA for value: "Area"
         */
        public static final TypeEnum AREA = new TypeEnum("Area");

        /**
         * Enum SUBAREA for value: "SubArea"
         */
        public static final TypeEnum SUBAREA = new TypeEnum("SubArea");

        /**
         * Enum REGION for value: "Region"
         */
        public static final TypeEnum REGION = new TypeEnum("Region");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("TrsArea", TRSAREA);
            map.put("Area", AREA);
            map.put("SubArea", SUBAREA);
            map.put("Region", REGION);
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

    private List<TypeEnum> type = null;

    /**
     * Gets or Sets adminState
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

    private List<AdminStateEnum> adminState = null;

    /**
     * Gets or Sets chargeMode
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

    private List<ChargeModeEnum> chargeMode = null;

    public ListGlobalConnectionBandwidthsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。 取值范围：1~2000。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListGlobalConnectionBandwidthsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 翻页信息，从上次API调用返回的翻页数据中获取，可填写前一页marker或者后一页marker，填入前一页previous_marker就向前翻页，后一页next_marker就向后翻页。 翻页过程中，查询条件不能修改，包括过滤条件、排序条件、limit。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListGlobalConnectionBandwidthsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 根据ID查询，可查询多个ID。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListGlobalConnectionBandwidthsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 根据名称查询，可查询多个名称。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListGlobalConnectionBandwidthsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest withEnterpriseProjectId(
        Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 根据企业项目ID过滤列表。
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListGlobalConnectionBandwidthsRequest withInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest addInstanceIdItem(String instanceIdItem) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        this.instanceId.add(instanceIdItem);
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest withInstanceId(Consumer<List<String>> instanceIdSetter) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        instanceIdSetter.accept(this.instanceId);
        return this;
    }

    /**
     * 根据绑定实例id过滤全域互联带宽列表。
     * @return instanceId
     */
    public List<String> getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
    }

    public ListGlobalConnectionBandwidthsRequest withInstanceType(List<InstanceTypeEnum> instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest addInstanceTypeItem(InstanceTypeEnum instanceTypeItem) {
        if (this.instanceType == null) {
            this.instanceType = new ArrayList<>();
        }
        this.instanceType.add(instanceTypeItem);
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest withInstanceType(Consumer<List<InstanceTypeEnum>> instanceTypeSetter) {
        if (this.instanceType == null) {
            this.instanceType = new ArrayList<>();
        }
        instanceTypeSetter.accept(this.instanceType);
        return this;
    }

    /**
     * 根据绑定实例类型过滤全域互联带宽列表。实例类型： - CC: 云连接 - GEIP: 全域弹性公网IP - GCN: 中心网络 - GSN: 分支网络
     * @return instanceType
     */
    public List<InstanceTypeEnum> getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(List<InstanceTypeEnum> instanceType) {
        this.instanceType = instanceType;
    }

    public ListGlobalConnectionBandwidthsRequest withBindingService(List<BindingServiceEnum> bindingService) {
        this.bindingService = bindingService;
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest addBindingServiceItem(BindingServiceEnum bindingServiceItem) {
        if (this.bindingService == null) {
            this.bindingService = new ArrayList<>();
        }
        this.bindingService.add(bindingServiceItem);
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest withBindingService(
        Consumer<List<BindingServiceEnum>> bindingServiceSetter) {
        if (this.bindingService == null) {
            this.bindingService = new ArrayList<>();
        }
        bindingServiceSetter.accept(this.bindingService);
        return this;
    }

    /**
     * 根据支持绑定实例类型过滤全域互联带宽列表。实例类型： - CC: 云连接 - GEIP: 全域弹性公网IP - GCN: 中心网络 - GSN: 分支网络
     * @return bindingService
     */
    public List<BindingServiceEnum> getBindingService() {
        return bindingService;
    }

    public void setBindingService(List<BindingServiceEnum> bindingService) {
        this.bindingService = bindingService;
    }

    public ListGlobalConnectionBandwidthsRequest withType(List<TypeEnum> type) {
        this.type = type;
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest addTypeItem(TypeEnum typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest withType(Consumer<List<TypeEnum>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * 根据带宽类型过滤全域互联带宽列表。带宽类型： - TrsArea: 跨区带宽 - Area: 大区带宽 - SubArea: 区域带宽 - Region: 城域带宽
     * @return type
     */
    public List<TypeEnum> getType() {
        return type;
    }

    public void setType(List<TypeEnum> type) {
        this.type = type;
    }

    public ListGlobalConnectionBandwidthsRequest withAdminState(List<AdminStateEnum> adminState) {
        this.adminState = adminState;
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest addAdminStateItem(AdminStateEnum adminStateItem) {
        if (this.adminState == null) {
            this.adminState = new ArrayList<>();
        }
        this.adminState.add(adminStateItem);
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest withAdminState(Consumer<List<AdminStateEnum>> adminStateSetter) {
        if (this.adminState == null) {
            this.adminState = new ArrayList<>();
        }
        adminStateSetter.accept(this.adminState);
        return this;
    }

    /**
     * 根据带宽状态过滤全域互联带宽列表： - NORMAL: 正常 - FREEZED: 冻结
     * @return adminState
     */
    public List<AdminStateEnum> getAdminState() {
        return adminState;
    }

    public void setAdminState(List<AdminStateEnum> adminState) {
        this.adminState = adminState;
    }

    public ListGlobalConnectionBandwidthsRequest withChargeMode(List<ChargeModeEnum> chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest addChargeModeItem(ChargeModeEnum chargeModeItem) {
        if (this.chargeMode == null) {
            this.chargeMode = new ArrayList<>();
        }
        this.chargeMode.add(chargeModeItem);
        return this;
    }

    public ListGlobalConnectionBandwidthsRequest withChargeMode(Consumer<List<ChargeModeEnum>> chargeModeSetter) {
        if (this.chargeMode == null) {
            this.chargeMode = new ArrayList<>();
        }
        chargeModeSetter.accept(this.chargeMode);
        return this;
    }

    /**
     * 根据计费方式过滤全域互联带宽列表： - bwd: 按带宽计费 - '95': 按传统型95计费 - 95avr (日95计费)
     * @return chargeMode
     */
    public List<ChargeModeEnum> getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(List<ChargeModeEnum> chargeMode) {
        this.chargeMode = chargeMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGlobalConnectionBandwidthsRequest that = (ListGlobalConnectionBandwidthsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.bindingService, that.bindingService) && Objects.equals(this.type, that.type)
            && Objects.equals(this.adminState, that.adminState) && Objects.equals(this.chargeMode, that.chargeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            marker,
            id,
            name,
            enterpriseProjectId,
            instanceId,
            instanceType,
            bindingService,
            type,
            adminState,
            chargeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalConnectionBandwidthsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    bindingService: ").append(toIndentedString(bindingService)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    adminState: ").append(toIndentedString(adminState)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
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
