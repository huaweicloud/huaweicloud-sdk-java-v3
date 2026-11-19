package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
 * VolumeFlavorItemDetail
 */
public class VolumeFlavorItemDetail {

    /**
     * **参数解释**: IO类型。 **取值范围**: - ULTRAHIGH：超高IO。 - ESSD：极速型SSD。
     */
    public static final class IoTypeEnum {

        /**
         * Enum ULTRAHIGH for value: "ULTRAHIGH"
         */
        public static final IoTypeEnum ULTRAHIGH = new IoTypeEnum("ULTRAHIGH");

        /**
         * Enum ESSD for value: "ESSD"
         */
        public static final IoTypeEnum ESSD = new IoTypeEnum("ESSD");

        private static final Map<String, IoTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IoTypeEnum> createStaticFields() {
            Map<String, IoTypeEnum> map = new HashMap<>();
            map.put("ULTRAHIGH", ULTRAHIGH);
            map.put("ESSD", ESSD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IoTypeEnum(String value) {
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
        public static IoTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IoTypeEnum(value));
        }

        public static IoTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IoTypeEnum) {
                return this.value.equals(((IoTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_type")

    private IoTypeEnum ioType;

    /**
     * **参数解释**: 存储介质类型。 **取值范围**: - SAS：高IO云硬盘。 - SSD：超高IO云硬盘。 - ESSD：极速型SSD云硬盘。
     */
    public static final class MediaTypeEnum {

        /**
         * Enum SAS for value: "SAS"
         */
        public static final MediaTypeEnum SAS = new MediaTypeEnum("SAS");

        /**
         * Enum SSD for value: "SSD"
         */
        public static final MediaTypeEnum SSD = new MediaTypeEnum("SSD");

        /**
         * Enum ESSD for value: "ESSD"
         */
        public static final MediaTypeEnum ESSD = new MediaTypeEnum("ESSD");

        private static final Map<String, MediaTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MediaTypeEnum> createStaticFields() {
            Map<String, MediaTypeEnum> map = new HashMap<>();
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            map.put("ESSD", ESSD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MediaTypeEnum(String value) {
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
        public static MediaTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MediaTypeEnum(value));
        }

        public static MediaTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MediaTypeEnum) {
                return this.value.equals(((MediaTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "media_type")

    private MediaTypeEnum mediaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_status")

    private Map<String, String> azStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_compute_group_type")

    private List<String> supportComputeGroupType = null;

    public VolumeFlavorItemDetail withIoType(IoTypeEnum ioType) {
        this.ioType = ioType;
        return this;
    }

    /**
     * **参数解释**: IO类型。 **取值范围**: - ULTRAHIGH：超高IO。 - ESSD：极速型SSD。
     * @return ioType
     */
    public IoTypeEnum getIoType() {
        return ioType;
    }

    public void setIoType(IoTypeEnum ioType) {
        this.ioType = ioType;
    }

    public VolumeFlavorItemDetail withMediaType(MediaTypeEnum mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * **参数解释**: 存储介质类型。 **取值范围**: - SAS：高IO云硬盘。 - SSD：超高IO云硬盘。 - ESSD：极速型SSD云硬盘。
     * @return mediaType
     */
    public MediaTypeEnum getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaTypeEnum mediaType) {
        this.mediaType = mediaType;
    }

    public VolumeFlavorItemDetail withAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    public VolumeFlavorItemDetail putAzStatusItem(String key, String azStatusItem) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        this.azStatus.put(key, azStatusItem);
        return this;
    }

    public VolumeFlavorItemDetail withAzStatus(Consumer<Map<String, String>> azStatusSetter) {
        if (this.azStatus == null) {
            this.azStatus = new HashMap<>();
        }
        azStatusSetter.accept(this.azStatus);
        return this;
    }

    /**
     * **参数解释**: 存储规格在各个可用区的状态。 **取值范围**: - normal：正常。 - sellout：已售罄。 - unknown：状态未知。 - unsupported：不支持。 - abandon：已废弃。
     * @return azStatus
     */
    public Map<String, String> getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Map<String, String> azStatus) {
        this.azStatus = azStatus;
    }

    public VolumeFlavorItemDetail withSupportComputeGroupType(List<String> supportComputeGroupType) {
        this.supportComputeGroupType = supportComputeGroupType;
        return this;
    }

    public VolumeFlavorItemDetail addSupportComputeGroupTypeItem(String supportComputeGroupTypeItem) {
        if (this.supportComputeGroupType == null) {
            this.supportComputeGroupType = new ArrayList<>();
        }
        this.supportComputeGroupType.add(supportComputeGroupTypeItem);
        return this;
    }

    public VolumeFlavorItemDetail withSupportComputeGroupType(Consumer<List<String>> supportComputeGroupTypeSetter) {
        if (this.supportComputeGroupType == null) {
            this.supportComputeGroupType = new ArrayList<>();
        }
        supportComputeGroupTypeSetter.accept(this.supportComputeGroupType);
        return this;
    }

    /**
     * **参数解释**: 该存储规格支持的计算规格组类型列表。 **取值范围**: 不涉及。
     * @return supportComputeGroupType
     */
    public List<String> getSupportComputeGroupType() {
        return supportComputeGroupType;
    }

    public void setSupportComputeGroupType(List<String> supportComputeGroupType) {
        this.supportComputeGroupType = supportComputeGroupType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeFlavorItemDetail that = (VolumeFlavorItemDetail) obj;
        return Objects.equals(this.ioType, that.ioType) && Objects.equals(this.mediaType, that.mediaType)
            && Objects.equals(this.azStatus, that.azStatus)
            && Objects.equals(this.supportComputeGroupType, that.supportComputeGroupType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ioType, mediaType, azStatus, supportComputeGroupType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeFlavorItemDetail {\n");
        sb.append("    ioType: ").append(toIndentedString(ioType)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
        sb.append("    supportComputeGroupType: ").append(toIndentedString(supportComputeGroupType)).append("\n");
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
