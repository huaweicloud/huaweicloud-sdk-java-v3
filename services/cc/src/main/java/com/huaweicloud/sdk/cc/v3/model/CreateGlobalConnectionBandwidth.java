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
 * 创建全域互联带宽实例的详细信息。
 */
public class CreateGlobalConnectionBandwidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

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
    @JsonProperty(value = "spec_code_id")

    private String specCodeId;

    public CreateGlobalConnectionBandwidth withName(String name) {
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

    public CreateGlobalConnectionBandwidth withDescription(String description) {
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

    public CreateGlobalConnectionBandwidth withBordercross(Boolean bordercross) {
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

    public CreateGlobalConnectionBandwidth withType(TypeEnum type) {
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

    public CreateGlobalConnectionBandwidth withEnterpriseProjectId(String enterpriseProjectId) {
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

    public CreateGlobalConnectionBandwidth withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateGlobalConnectionBandwidth addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateGlobalConnectionBandwidth withTags(Consumer<List<Tag>> tagsSetter) {
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

    public CreateGlobalConnectionBandwidth withChargeMode(ChargeModeEnum chargeMode) {
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

    public CreateGlobalConnectionBandwidth withSize(Integer size) {
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

    public CreateGlobalConnectionBandwidth withSlaLevel(SlaLevelEnum slaLevel) {
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

    public CreateGlobalConnectionBandwidth withLocalArea(String localArea) {
        this.localArea = localArea;
        return this;
    }

    /**
     * 功能说明：本端接入点，配合remote_area信息描述带宽实例应用的范围。 取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点），站点编码通过接口获取，带宽类型为Region可不传，其他类型必传 
     * @return localArea
     */
    public String getLocalArea() {
        return localArea;
    }

    public void setLocalArea(String localArea) {
        this.localArea = localArea;
    }

    public CreateGlobalConnectionBandwidth withRemoteArea(String remoteArea) {
        this.remoteArea = remoteArea;
        return this;
    }

    /**
     * 功能说明：远端接入点，配合local_area信息描述带宽实例应用的范围。 取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点），站点编码通过接口获取，带宽类型为Region可不传，其他类型必传 
     * @return remoteArea
     */
    public String getRemoteArea() {
        return remoteArea;
    }

    public void setRemoteArea(String remoteArea) {
        this.remoteArea = remoteArea;
    }

    public CreateGlobalConnectionBandwidth withSpecCodeId(String specCodeId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateGlobalConnectionBandwidth that = (CreateGlobalConnectionBandwidth) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.bordercross, that.bordercross) && Objects.equals(this.type, that.type)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.size, that.size) && Objects.equals(this.slaLevel, that.slaLevel)
            && Objects.equals(this.localArea, that.localArea) && Objects.equals(this.remoteArea, that.remoteArea)
            && Objects.equals(this.specCodeId, that.specCodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            bordercross,
            type,
            enterpriseProjectId,
            tags,
            chargeMode,
            size,
            slaLevel,
            localArea,
            remoteArea,
            specCodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGlobalConnectionBandwidth {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bordercross: ").append(toIndentedString(bordercross)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    slaLevel: ").append(toIndentedString(slaLevel)).append("\n");
        sb.append("    localArea: ").append(toIndentedString(localArea)).append("\n");
        sb.append("    remoteArea: ").append(toIndentedString(remoteArea)).append("\n");
        sb.append("    specCodeId: ").append(toIndentedString(specCodeId)).append("\n");
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
