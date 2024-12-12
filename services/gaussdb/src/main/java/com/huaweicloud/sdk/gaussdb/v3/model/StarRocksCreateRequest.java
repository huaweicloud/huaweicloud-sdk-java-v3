package com.huaweicloud.sdk.gaussdb.v3.model;

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
 * StarRocksCreateRequest
 */
public class StarRocksCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private StarRocksCreateRequestEngine engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha")

    private StarRocksCreateRequestHa ha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fe_flavor_id")

    private String feFlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "be_flavor_id")

    private String beFlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_root_pwd")

    private String dbRootPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fe_count")

    private Integer feCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "be_count")

    private Integer beCount;

    /**
     * 可用区类型。 当前仅支持single。
     */
    public static final class AzModeEnum {

        /**
         * Enum SINGLE for value: "single"
         */
        public static final AzModeEnum SINGLE = new AzModeEnum("single");

        private static final Map<String, AzModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AzModeEnum> createStaticFields() {
            Map<String, AzModeEnum> map = new HashMap<>();
            map.put("single", SINGLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AzModeEnum(String value) {
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
        public static AzModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AzModeEnum(value));
        }

        public static AzModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AzModeEnum) {
                return this.value.equals(((AzModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_mode")

    private AzModeEnum azMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fe_volume")

    private StarRocksCreateRequestFeVolume feVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "be_volume")

    private StarRocksCreateRequestBeVolume beVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_info")

    private StarRocksCreateRequestTagsInfo tagsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_info")

    private StarRocksCreateRequestPayInfo payInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    public StarRocksCreateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。同一租户下，同类型的实例名可重名。  取值范围：最小为4个字符，最大为64个字符且不超过64个字节，必须以字母开头，区分大小写，可以包含字母、数字、中划线、下划线，不能包含其他特殊字符。不支持中文名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StarRocksCreateRequest withEngine(StarRocksCreateRequestEngine engine) {
        this.engine = engine;
        return this;
    }

    public StarRocksCreateRequest withEngine(Consumer<StarRocksCreateRequestEngine> engineSetter) {
        if (this.engine == null) {
            this.engine = new StarRocksCreateRequestEngine();
            engineSetter.accept(this.engine);
        }

        return this;
    }

    /**
     * Get engine
     * @return engine
     */
    public StarRocksCreateRequestEngine getEngine() {
        return engine;
    }

    public void setEngine(StarRocksCreateRequestEngine engine) {
        this.engine = engine;
    }

    public StarRocksCreateRequest withHa(StarRocksCreateRequestHa ha) {
        this.ha = ha;
        return this;
    }

    public StarRocksCreateRequest withHa(Consumer<StarRocksCreateRequestHa> haSetter) {
        if (this.ha == null) {
            this.ha = new StarRocksCreateRequestHa();
            haSetter.accept(this.ha);
        }

        return this;
    }

    /**
     * Get ha
     * @return ha
     */
    public StarRocksCreateRequestHa getHa() {
        return ha;
    }

    public void setHa(StarRocksCreateRequestHa ha) {
        this.ha = ha;
    }

    public StarRocksCreateRequest withFeFlavorId(String feFlavorId) {
        this.feFlavorId = feFlavorId;
        return this;
    }

    /**
     * FE节点规格ID。使用可通过查询HTAP规格响应消息中的“id”。
     * @return feFlavorId
     */
    public String getFeFlavorId() {
        return feFlavorId;
    }

    public void setFeFlavorId(String feFlavorId) {
        this.feFlavorId = feFlavorId;
    }

    public StarRocksCreateRequest withBeFlavorId(String beFlavorId) {
        this.beFlavorId = beFlavorId;
        return this;
    }

    /**
     * BE节点规格ID。使用可通过查询HTAP规格响应消息中的“id”。
     * @return beFlavorId
     */
    public String getBeFlavorId() {
        return beFlavorId;
    }

    public void setBeFlavorId(String beFlavorId) {
        this.beFlavorId = beFlavorId;
    }

    public StarRocksCreateRequest withDbRootPwd(String dbRootPwd) {
        this.dbRootPwd = dbRootPwd;
        return this;
    }

    /**
     * 数据库密码。  取值范围：至少包含以下字符的三种：大小写字母、数字和特殊符号~!@#$%^*-_=+?,()&|.，长度8~32个字符。 建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险。如果您输入弱密码，系统会自动判定密码非法。
     * @return dbRootPwd
     */
    public String getDbRootPwd() {
        return dbRootPwd;
    }

    public void setDbRootPwd(String dbRootPwd) {
        this.dbRootPwd = dbRootPwd;
    }

    public StarRocksCreateRequest withFeCount(Integer feCount) {
        this.feCount = feCount;
        return this;
    }

    /**
     * FE节点数。 - 单机时固定为1 - 集群时取值[3, 10]
     * @return feCount
     */
    public Integer getFeCount() {
        return feCount;
    }

    public void setFeCount(Integer feCount) {
        this.feCount = feCount;
    }

    public StarRocksCreateRequest withBeCount(Integer beCount) {
        this.beCount = beCount;
        return this;
    }

    /**
     * BE节点数。 - 单机时固定为1 - 集群时取值[3, 10]
     * @return beCount
     */
    public Integer getBeCount() {
        return beCount;
    }

    public void setBeCount(Integer beCount) {
        this.beCount = beCount;
    }

    public StarRocksCreateRequest withAzMode(AzModeEnum azMode) {
        this.azMode = azMode;
        return this;
    }

    /**
     * 可用区类型。 当前仅支持single。
     * @return azMode
     */
    public AzModeEnum getAzMode() {
        return azMode;
    }

    public void setAzMode(AzModeEnum azMode) {
        this.azMode = azMode;
    }

    public StarRocksCreateRequest withFeVolume(StarRocksCreateRequestFeVolume feVolume) {
        this.feVolume = feVolume;
        return this;
    }

    public StarRocksCreateRequest withFeVolume(Consumer<StarRocksCreateRequestFeVolume> feVolumeSetter) {
        if (this.feVolume == null) {
            this.feVolume = new StarRocksCreateRequestFeVolume();
            feVolumeSetter.accept(this.feVolume);
        }

        return this;
    }

    /**
     * Get feVolume
     * @return feVolume
     */
    public StarRocksCreateRequestFeVolume getFeVolume() {
        return feVolume;
    }

    public void setFeVolume(StarRocksCreateRequestFeVolume feVolume) {
        this.feVolume = feVolume;
    }

    public StarRocksCreateRequest withBeVolume(StarRocksCreateRequestBeVolume beVolume) {
        this.beVolume = beVolume;
        return this;
    }

    public StarRocksCreateRequest withBeVolume(Consumer<StarRocksCreateRequestBeVolume> beVolumeSetter) {
        if (this.beVolume == null) {
            this.beVolume = new StarRocksCreateRequestBeVolume();
            beVolumeSetter.accept(this.beVolume);
        }

        return this;
    }

    /**
     * Get beVolume
     * @return beVolume
     */
    public StarRocksCreateRequestBeVolume getBeVolume() {
        return beVolume;
    }

    public void setBeVolume(StarRocksCreateRequestBeVolume beVolume) {
        this.beVolume = beVolume;
    }

    public StarRocksCreateRequest withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 可用区代码。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public StarRocksCreateRequest withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区。默认时区为UTC+08:00。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public StarRocksCreateRequest withTagsInfo(StarRocksCreateRequestTagsInfo tagsInfo) {
        this.tagsInfo = tagsInfo;
        return this;
    }

    public StarRocksCreateRequest withTagsInfo(Consumer<StarRocksCreateRequestTagsInfo> tagsInfoSetter) {
        if (this.tagsInfo == null) {
            this.tagsInfo = new StarRocksCreateRequestTagsInfo();
            tagsInfoSetter.accept(this.tagsInfo);
        }

        return this;
    }

    /**
     * Get tagsInfo
     * @return tagsInfo
     */
    public StarRocksCreateRequestTagsInfo getTagsInfo() {
        return tagsInfo;
    }

    public void setTagsInfo(StarRocksCreateRequestTagsInfo tagsInfo) {
        this.tagsInfo = tagsInfo;
    }

    public StarRocksCreateRequest withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 实例安全组ID。默认与Taurus安全组ID一致。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public StarRocksCreateRequest withPayInfo(StarRocksCreateRequestPayInfo payInfo) {
        this.payInfo = payInfo;
        return this;
    }

    public StarRocksCreateRequest withPayInfo(Consumer<StarRocksCreateRequestPayInfo> payInfoSetter) {
        if (this.payInfo == null) {
            this.payInfo = new StarRocksCreateRequestPayInfo();
            payInfoSetter.accept(this.payInfo);
        }

        return this;
    }

    /**
     * Get payInfo
     * @return payInfo
     */
    public StarRocksCreateRequestPayInfo getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(StarRocksCreateRequestPayInfo payInfo) {
        this.payInfo = payInfo;
    }

    public StarRocksCreateRequest withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * 可用区。包周期场景必填。
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StarRocksCreateRequest that = (StarRocksCreateRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.engine, that.engine)
            && Objects.equals(this.ha, that.ha) && Objects.equals(this.feFlavorId, that.feFlavorId)
            && Objects.equals(this.beFlavorId, that.beFlavorId) && Objects.equals(this.dbRootPwd, that.dbRootPwd)
            && Objects.equals(this.feCount, that.feCount) && Objects.equals(this.beCount, that.beCount)
            && Objects.equals(this.azMode, that.azMode) && Objects.equals(this.feVolume, that.feVolume)
            && Objects.equals(this.beVolume, that.beVolume) && Objects.equals(this.azCode, that.azCode)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.tagsInfo, that.tagsInfo)
            && Objects.equals(this.securityGroupId, that.securityGroupId) && Objects.equals(this.payInfo, that.payInfo)
            && Objects.equals(this.regionCode, that.regionCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            engine,
            ha,
            feFlavorId,
            beFlavorId,
            dbRootPwd,
            feCount,
            beCount,
            azMode,
            feVolume,
            beVolume,
            azCode,
            timeZone,
            tagsInfo,
            securityGroupId,
            payInfo,
            regionCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StarRocksCreateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    feFlavorId: ").append(toIndentedString(feFlavorId)).append("\n");
        sb.append("    beFlavorId: ").append(toIndentedString(beFlavorId)).append("\n");
        sb.append("    dbRootPwd: ").append(toIndentedString(dbRootPwd)).append("\n");
        sb.append("    feCount: ").append(toIndentedString(feCount)).append("\n");
        sb.append("    beCount: ").append(toIndentedString(beCount)).append("\n");
        sb.append("    azMode: ").append(toIndentedString(azMode)).append("\n");
        sb.append("    feVolume: ").append(toIndentedString(feVolume)).append("\n");
        sb.append("    beVolume: ").append(toIndentedString(beVolume)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    tagsInfo: ").append(toIndentedString(tagsInfo)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    payInfo: ").append(toIndentedString(payInfo)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
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
