package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SCTE35信号信息的item结构。
 */
public class SCTE35InfoItem {

    /**
     * 信号类型，splice_insert/time_signal。
     */
    public static final class TypeEnum {

        /**
         * Enum SPLICE_INSERT for value: "splice_insert"
         */
        public static final TypeEnum SPLICE_INSERT = new TypeEnum("splice_insert");

        /**
         * Enum TIME_SIGNAL for value: "time_signal"
         */
        public static final TypeEnum TIME_SIGNAL = new TypeEnum("time_signal");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("splice_insert", SPLICE_INSERT);
            map.put("time_signal", TIME_SIGNAL);
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
    @JsonProperty(value = "event_id")

    private Integer eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private Long startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    /**
     * // Splice Insert填空\"-\"； // Time Signal，支持0x30，0x31，0x32，0x33，0x34，0x35，0x36，0x37 // 0x30: ProviderAdvertisementStart // 0x31: ProviderAdvertisementEnd // 0x32: DistributorAdvertisementStart // 0x33: DistributorAdvertisementEnd // 0x34: ProviderPlacementOpportunityStart // 0x35: ProviderPlacementOpportunityEnd // 0x36: DistributorPlacementOpportunityStart // 0x37: DistributorPlacementOpportunityEnd
     */
    public static final class SegmentationTypeEnum {

        /**
         * Enum MINUS for value: "-"
         */
        public static final SegmentationTypeEnum MINUS = new SegmentationTypeEnum("-");

        /**
         * Enum PROVIDERADVERTISEMENTSTART for value: "ProviderAdvertisementStart"
         */
        public static final SegmentationTypeEnum PROVIDERADVERTISEMENTSTART =
            new SegmentationTypeEnum("ProviderAdvertisementStart");

        /**
         * Enum PROVIDERADVERTISEMENTEND for value: "ProviderAdvertisementEnd"
         */
        public static final SegmentationTypeEnum PROVIDERADVERTISEMENTEND =
            new SegmentationTypeEnum("ProviderAdvertisementEnd");

        /**
         * Enum DISTRIBUTORADVERTISEMENTSTART for value: "DistributorAdvertisementStart"
         */
        public static final SegmentationTypeEnum DISTRIBUTORADVERTISEMENTSTART =
            new SegmentationTypeEnum("DistributorAdvertisementStart");

        /**
         * Enum DISTRIBUTORADVERTISEMENTEND for value: "DistributorAdvertisementEnd"
         */
        public static final SegmentationTypeEnum DISTRIBUTORADVERTISEMENTEND =
            new SegmentationTypeEnum("DistributorAdvertisementEnd");

        /**
         * Enum PROVIDERPLACEMENTOPPORTUNITYSTART for value: "ProviderPlacementOpportunityStart"
         */
        public static final SegmentationTypeEnum PROVIDERPLACEMENTOPPORTUNITYSTART =
            new SegmentationTypeEnum("ProviderPlacementOpportunityStart");

        /**
         * Enum PROVIDERPLACEMENTOPPORTUNITYEND for value: "ProviderPlacementOpportunityEnd"
         */
        public static final SegmentationTypeEnum PROVIDERPLACEMENTOPPORTUNITYEND =
            new SegmentationTypeEnum("ProviderPlacementOpportunityEnd");

        /**
         * Enum DISTRIBUTORPLACEMENTOPPORTUNITYSTART for value: "DistributorPlacementOpportunityStart"
         */
        public static final SegmentationTypeEnum DISTRIBUTORPLACEMENTOPPORTUNITYSTART =
            new SegmentationTypeEnum("DistributorPlacementOpportunityStart");

        /**
         * Enum DISTRIBUTORPLACEMENTOPPORTUNITYEND for value: "DistributorPlacementOpportunityEnd"
         */
        public static final SegmentationTypeEnum DISTRIBUTORPLACEMENTOPPORTUNITYEND =
            new SegmentationTypeEnum("DistributorPlacementOpportunityEnd");

        private static final Map<String, SegmentationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SegmentationTypeEnum> createStaticFields() {
            Map<String, SegmentationTypeEnum> map = new HashMap<>();
            map.put("-", MINUS);
            map.put("ProviderAdvertisementStart", PROVIDERADVERTISEMENTSTART);
            map.put("ProviderAdvertisementEnd", PROVIDERADVERTISEMENTEND);
            map.put("DistributorAdvertisementStart", DISTRIBUTORADVERTISEMENTSTART);
            map.put("DistributorAdvertisementEnd", DISTRIBUTORADVERTISEMENTEND);
            map.put("ProviderPlacementOpportunityStart", PROVIDERPLACEMENTOPPORTUNITYSTART);
            map.put("ProviderPlacementOpportunityEnd", PROVIDERPLACEMENTOPPORTUNITYEND);
            map.put("DistributorPlacementOpportunityStart", DISTRIBUTORPLACEMENTOPPORTUNITYSTART);
            map.put("DistributorPlacementOpportunityEnd", DISTRIBUTORPLACEMENTOPPORTUNITYEND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SegmentationTypeEnum(String value) {
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
        public static SegmentationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SegmentationTypeEnum(value));
        }

        public static SegmentationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SegmentationTypeEnum) {
                return this.value.equals(((SegmentationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segmentation_type")

    private SegmentationTypeEnum segmentationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base64_data")

    private String base64Data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raw_splice")

    private String rawSplice;

    public SCTE35InfoItem withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 信号类型，splice_insert/time_signal。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SCTE35InfoItem withEventId(Integer eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 广告信号的Event ID，Time Signal打印数组第一个。
     * minimum: 1
     * maximum: 2147483648
     * @return eventId
     */
    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public SCTE35InfoItem withStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 广告信号的执行时间，unix time，单位：秒。
     * minimum: 1
     * maximum: 4294967295
     * @return startDate
     */
    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public SCTE35InfoItem withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 广告信号时长，-1表示没有携带,单位：秒。
     * minimum: -1
     * maximum: 2147483648
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public SCTE35InfoItem withSegmentationType(SegmentationTypeEnum segmentationType) {
        this.segmentationType = segmentationType;
        return this;
    }

    /**
     * // Splice Insert填空\"-\"； // Time Signal，支持0x30，0x31，0x32，0x33，0x34，0x35，0x36，0x37 // 0x30: ProviderAdvertisementStart // 0x31: ProviderAdvertisementEnd // 0x32: DistributorAdvertisementStart // 0x33: DistributorAdvertisementEnd // 0x34: ProviderPlacementOpportunityStart // 0x35: ProviderPlacementOpportunityEnd // 0x36: DistributorPlacementOpportunityStart // 0x37: DistributorPlacementOpportunityEnd
     * @return segmentationType
     */
    public SegmentationTypeEnum getSegmentationType() {
        return segmentationType;
    }

    public void setSegmentationType(SegmentationTypeEnum segmentationType) {
        this.segmentationType = segmentationType;
    }

    public SCTE35InfoItem withBase64Data(String base64Data) {
        this.base64Data = base64Data;
        return this;
    }

    /**
     * 广告信号原始数据的base64值。
     * @return base64Data
     */
    public String getBase64Data() {
        return base64Data;
    }

    public void setBase64Data(String base64Data) {
        this.base64Data = base64Data;
    }

    public SCTE35InfoItem withRawSplice(String rawSplice) {
        this.rawSplice = rawSplice;
        return this;
    }

    /**
     * 广告信号全量信息。
     * @return rawSplice
     */
    public String getRawSplice() {
        return rawSplice;
    }

    public void setRawSplice(String rawSplice) {
        this.rawSplice = rawSplice;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SCTE35InfoItem that = (SCTE35InfoItem) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.eventId, that.eventId)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.segmentationType, that.segmentationType)
            && Objects.equals(this.base64Data, that.base64Data) && Objects.equals(this.rawSplice, that.rawSplice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, eventId, startDate, duration, segmentationType, base64Data, rawSplice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SCTE35InfoItem {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    segmentationType: ").append(toIndentedString(segmentationType)).append("\n");
        sb.append("    base64Data: ").append(toIndentedString(base64Data)).append("\n");
        sb.append("    rawSplice: ").append(toIndentedString(rawSplice)).append("\n");
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
