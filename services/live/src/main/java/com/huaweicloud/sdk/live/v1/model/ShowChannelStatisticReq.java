package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询OTT频道统计信息消息体。
 */
public class ShowChannelStatisticReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 统计信息的类型，scte35。
     */
    public static final class TypeEnum {

        /**
         * Enum SCTE35 for value: "scte35"
         */
        public static final TypeEnum SCTE35 = new TypeEnum("scte35");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("scte35", SCTE35);
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
    @JsonProperty(value = "scte35")

    private SCTE35StatisticReq scte35;

    /**
     * **参数解释**： 频道对应的region类型，是主region，还是备region **约束限制**： 如果region_type不填，或是没有该字段，则按照主region处理 **取值范围**： - master: 主region - slave: 备region - all: 所有region 
     */
    public static final class RegionTypeEnum {

        /**
         * Enum MASTER for value: "master"
         */
        public static final RegionTypeEnum MASTER = new RegionTypeEnum("master");

        /**
         * Enum SLAVE for value: "slave"
         */
        public static final RegionTypeEnum SLAVE = new RegionTypeEnum("slave");

        /**
         * Enum ALL for value: "all"
         */
        public static final RegionTypeEnum ALL = new RegionTypeEnum("all");

        private static final Map<String, RegionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RegionTypeEnum> createStaticFields() {
            Map<String, RegionTypeEnum> map = new HashMap<>();
            map.put("master", MASTER);
            map.put("slave", SLAVE);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RegionTypeEnum(String value) {
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
        public static RegionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RegionTypeEnum(value));
        }

        public static RegionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RegionTypeEnum) {
                return this.value.equals(((RegionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_type")

    private RegionTypeEnum regionType;

    public ShowChannelStatisticReq withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 频道推流域名。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ShowChannelStatisticReq withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 组名或应用名。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ShowChannelStatisticReq withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 频道ID。频道唯一标识，为必填项。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowChannelStatisticReq withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 统计信息的类型，scte35。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowChannelStatisticReq withScte35(SCTE35StatisticReq scte35) {
        this.scte35 = scte35;
        return this;
    }

    public ShowChannelStatisticReq withScte35(Consumer<SCTE35StatisticReq> scte35Setter) {
        if (this.scte35 == null) {
            this.scte35 = new SCTE35StatisticReq();
            scte35Setter.accept(this.scte35);
        }

        return this;
    }

    /**
     * Get scte35
     * @return scte35
     */
    public SCTE35StatisticReq getScte35() {
        return scte35;
    }

    public void setScte35(SCTE35StatisticReq scte35) {
        this.scte35 = scte35;
    }

    public ShowChannelStatisticReq withRegionType(RegionTypeEnum regionType) {
        this.regionType = regionType;
        return this;
    }

    /**
     * **参数解释**： 频道对应的region类型，是主region，还是备region **约束限制**： 如果region_type不填，或是没有该字段，则按照主region处理 **取值范围**： - master: 主region - slave: 备region - all: 所有region 
     * @return regionType
     */
    public RegionTypeEnum getRegionType() {
        return regionType;
    }

    public void setRegionType(RegionTypeEnum regionType) {
        this.regionType = regionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowChannelStatisticReq that = (ShowChannelStatisticReq) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.scte35, that.scte35) && Objects.equals(this.regionType, that.regionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, appName, id, type, scte35, regionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowChannelStatisticReq {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    scte35: ").append(toIndentedString(scte35)).append("\n");
        sb.append("    regionType: ").append(toIndentedString(regionType)).append("\n");
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
