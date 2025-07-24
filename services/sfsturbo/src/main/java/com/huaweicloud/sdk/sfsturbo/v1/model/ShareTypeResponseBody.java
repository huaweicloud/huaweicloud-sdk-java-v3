package com.huaweicloud.sdk.sfsturbo.v1.model;

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
 * ShareTypeResponseBody
 */
public class ShareTypeResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_type")

    private String shareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenario")

    private String scenario;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribution")

    private ShareTypesAttribution attribution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_id")

    private String specId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_type_usage")

    private ShareTypeUsage shareTypeUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_period")

    private Boolean supportPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<ShareTypeAvailableZone> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    /**
     * 存储类型
     */
    public static final class StorageMediaEnum {

        /**
         * Enum HDD for value: "HDD"
         */
        public static final StorageMediaEnum HDD = new StorageMediaEnum("HDD");

        /**
         * Enum SSD for value: "SSD"
         */
        public static final StorageMediaEnum SSD = new StorageMediaEnum("SSD");

        /**
         * Enum ESSD for value: "ESSD"
         */
        public static final StorageMediaEnum ESSD = new StorageMediaEnum("ESSD");

        private static final Map<String, StorageMediaEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageMediaEnum> createStaticFields() {
            Map<String, StorageMediaEnum> map = new HashMap<>();
            map.put("HDD", HDD);
            map.put("SSD", SSD);
            map.put("ESSD", ESSD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageMediaEnum(String value) {
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
        public static StorageMediaEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StorageMediaEnum(value));
        }

        public static StorageMediaEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StorageMediaEnum) {
                return this.value.equals(((StorageMediaEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_media")

    private StorageMediaEnum storageMedia;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "features")

    private List<String> features = null;

    public ShareTypeResponseBody withShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }

    /**
     * 文件系统类型
     * @return shareType
     */
    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public ShareTypeResponseBody withScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }

    /**
     * 文件系统场景
     * @return scenario
     */
    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public ShareTypeResponseBody withAttribution(ShareTypesAttribution attribution) {
        this.attribution = attribution;
        return this;
    }

    public ShareTypeResponseBody withAttribution(Consumer<ShareTypesAttribution> attributionSetter) {
        if (this.attribution == null) {
            this.attribution = new ShareTypesAttribution();
            attributionSetter.accept(this.attribution);
        }

        return this;
    }

    /**
     * Get attribution
     * @return attribution
     */
    public ShareTypesAttribution getAttribution() {
        return attribution;
    }

    public void setAttribution(ShareTypesAttribution attribution) {
        this.attribution = attribution;
    }

    public ShareTypeResponseBody withSpecId(String specId) {
        this.specId = specId;
        return this;
    }

    /**
     * 文件系统规格ID
     * @return specId
     */
    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public ShareTypeResponseBody withShareTypeUsage(ShareTypeUsage shareTypeUsage) {
        this.shareTypeUsage = shareTypeUsage;
        return this;
    }

    public ShareTypeResponseBody withShareTypeUsage(Consumer<ShareTypeUsage> shareTypeUsageSetter) {
        if (this.shareTypeUsage == null) {
            this.shareTypeUsage = new ShareTypeUsage();
            shareTypeUsageSetter.accept(this.shareTypeUsage);
        }

        return this;
    }

    /**
     * Get shareTypeUsage
     * @return shareTypeUsage
     */
    public ShareTypeUsage getShareTypeUsage() {
        return shareTypeUsage;
    }

    public void setShareTypeUsage(ShareTypeUsage shareTypeUsage) {
        this.shareTypeUsage = shareTypeUsage;
    }

    public ShareTypeResponseBody withSupportPeriod(Boolean supportPeriod) {
        this.supportPeriod = supportPeriod;
        return this;
    }

    /**
     * 是否支持包周期
     * @return supportPeriod
     */
    public Boolean getSupportPeriod() {
        return supportPeriod;
    }

    public void setSupportPeriod(Boolean supportPeriod) {
        this.supportPeriod = supportPeriod;
    }

    public ShareTypeResponseBody withAvailableZones(List<ShareTypeAvailableZone> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ShareTypeResponseBody addAvailableZonesItem(ShareTypeAvailableZone availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ShareTypeResponseBody withAvailableZones(Consumer<List<ShareTypeAvailableZone>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 可用区
     * @return availableZones
     */
    public List<ShareTypeAvailableZone> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<ShareTypeAvailableZone> availableZones) {
        this.availableZones = availableZones;
    }

    public ShareTypeResponseBody withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 文件系统规格编码
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ShareTypeResponseBody withStorageMedia(StorageMediaEnum storageMedia) {
        this.storageMedia = storageMedia;
        return this;
    }

    /**
     * 存储类型
     * @return storageMedia
     */
    public StorageMediaEnum getStorageMedia() {
        return storageMedia;
    }

    public void setStorageMedia(StorageMediaEnum storageMedia) {
        this.storageMedia = storageMedia;
    }

    public ShareTypeResponseBody withFeatures(List<String> features) {
        this.features = features;
        return this;
    }

    public ShareTypeResponseBody addFeaturesItem(String featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        this.features.add(featuresItem);
        return this;
    }

    public ShareTypeResponseBody withFeatures(Consumer<List<String>> featuresSetter) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        featuresSetter.accept(this.features);
        return this;
    }

    /**
     * 实例支持的特性列表
     * @return features
     */
    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShareTypeResponseBody that = (ShareTypeResponseBody) obj;
        return Objects.equals(this.shareType, that.shareType) && Objects.equals(this.scenario, that.scenario)
            && Objects.equals(this.attribution, that.attribution) && Objects.equals(this.specId, that.specId)
            && Objects.equals(this.shareTypeUsage, that.shareTypeUsage)
            && Objects.equals(this.supportPeriod, that.supportPeriod)
            && Objects.equals(this.availableZones, that.availableZones) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.storageMedia, that.storageMedia) && Objects.equals(this.features, that.features);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareType,
            scenario,
            attribution,
            specId,
            shareTypeUsage,
            supportPeriod,
            availableZones,
            specCode,
            storageMedia,
            features);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShareTypeResponseBody {\n");
        sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
        sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
        sb.append("    attribution: ").append(toIndentedString(attribution)).append("\n");
        sb.append("    specId: ").append(toIndentedString(specId)).append("\n");
        sb.append("    shareTypeUsage: ").append(toIndentedString(shareTypeUsage)).append("\n");
        sb.append("    supportPeriod: ").append(toIndentedString(supportPeriod)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    storageMedia: ").append(toIndentedString(storageMedia)).append("\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
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
