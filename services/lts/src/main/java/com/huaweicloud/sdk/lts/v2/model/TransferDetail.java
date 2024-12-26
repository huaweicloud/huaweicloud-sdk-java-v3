package com.huaweicloud.sdk.lts.v2.model;

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
 * 日志转储详细信息
 */
public class TransferDetail {

    /**
     * OBS转储时间
     */
    public static final class ObsPeriodEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ObsPeriodEnum NUMBER_1 = new ObsPeriodEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final ObsPeriodEnum NUMBER_2 = new ObsPeriodEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final ObsPeriodEnum NUMBER_3 = new ObsPeriodEnum(3);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final ObsPeriodEnum NUMBER_5 = new ObsPeriodEnum(5);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final ObsPeriodEnum NUMBER_6 = new ObsPeriodEnum(6);

        /**
         * Enum NUMBER_12 for value: 12
         */
        public static final ObsPeriodEnum NUMBER_12 = new ObsPeriodEnum(12);

        /**
         * Enum NUMBER_30 for value: 30
         */
        public static final ObsPeriodEnum NUMBER_30 = new ObsPeriodEnum(30);

        private static final Map<Integer, ObsPeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ObsPeriodEnum> createStaticFields() {
            Map<Integer, ObsPeriodEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(5, NUMBER_5);
            map.put(6, NUMBER_6);
            map.put(12, NUMBER_12);
            map.put(30, NUMBER_30);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ObsPeriodEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ObsPeriodEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ObsPeriodEnum(value));
        }

        public static ObsPeriodEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ObsPeriodEnum) {
                return this.value.equals(((ObsPeriodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_period")

    private ObsPeriodEnum obsPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_encrypted_id")

    private String obsEncryptedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_prefix_name")

    private String obsPrefixName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_period_unit")

    private String obsPeriodUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_transfer_path")

    private String obsTransferPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_eps_id")

    private String obsEpsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_encrypted_enable")

    private Boolean obsEncryptedEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_dir_pre_fix_name")

    private String obsDirPreFixName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis_id")

    private String disId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis_name")

    private String disName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_id")

    private String kafkaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_topic")

    private String kafkaTopic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_time_zone")

    private String obsTimeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_time_zone_id")

    private String obsTimeZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_tags")

    private List<String> ltsTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_tags")

    private List<String> streamTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "struct_fields")

    private List<String> structFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invalid_field_value")

    private String invalidFieldValue;

    public TransferDetail withObsPeriod(ObsPeriodEnum obsPeriod) {
        this.obsPeriod = obsPeriod;
        return this;
    }

    /**
     * OBS转储时间
     * @return obsPeriod
     */
    public ObsPeriodEnum getObsPeriod() {
        return obsPeriod;
    }

    public void setObsPeriod(ObsPeriodEnum obsPeriod) {
        this.obsPeriod = obsPeriod;
    }

    public TransferDetail withObsEncryptedId(String obsEncryptedId) {
        this.obsEncryptedId = obsEncryptedId;
        return this;
    }

    /**
     * OBS转储KMS秘钥ID。若OBS转储未加密则不返回此字段
     * @return obsEncryptedId
     */
    public String getObsEncryptedId() {
        return obsEncryptedId;
    }

    public void setObsEncryptedId(String obsEncryptedId) {
        this.obsEncryptedId = obsEncryptedId;
    }

    public TransferDetail withObsPrefixName(String obsPrefixName) {
        this.obsPrefixName = obsPrefixName;
        return this;
    }

    /**
     * OBS转储日志文件前缀
     * @return obsPrefixName
     */
    public String getObsPrefixName() {
        return obsPrefixName;
    }

    public void setObsPrefixName(String obsPrefixName) {
        this.obsPrefixName = obsPrefixName;
    }

    public TransferDetail withObsPeriodUnit(String obsPeriodUnit) {
        this.obsPeriodUnit = obsPeriodUnit;
        return this;
    }

    /**
     * OBS转储单位
     * @return obsPeriodUnit
     */
    public String getObsPeriodUnit() {
        return obsPeriodUnit;
    }

    public void setObsPeriodUnit(String obsPeriodUnit) {
        this.obsPeriodUnit = obsPeriodUnit;
    }

    public TransferDetail withObsTransferPath(String obsTransferPath) {
        this.obsTransferPath = obsTransferPath;
        return this;
    }

    /**
     * OBS转储路径，指OBS日志桶中的路径
     * @return obsTransferPath
     */
    public String getObsTransferPath() {
        return obsTransferPath;
    }

    public void setObsTransferPath(String obsTransferPath) {
        this.obsTransferPath = obsTransferPath;
    }

    public TransferDetail withObsEpsId(String obsEpsId) {
        this.obsEpsId = obsEpsId;
        return this;
    }

    /**
     * OBS企业项目ID
     * @return obsEpsId
     */
    public String getObsEpsId() {
        return obsEpsId;
    }

    public void setObsEpsId(String obsEpsId) {
        this.obsEpsId = obsEpsId;
    }

    public TransferDetail withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * OBS日志桶名称
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public TransferDetail withObsEncryptedEnable(Boolean obsEncryptedEnable) {
        this.obsEncryptedEnable = obsEncryptedEnable;
        return this;
    }

    /**
     * OBS是否开启加密。
     * @return obsEncryptedEnable
     */
    public Boolean getObsEncryptedEnable() {
        return obsEncryptedEnable;
    }

    public void setObsEncryptedEnable(Boolean obsEncryptedEnable) {
        this.obsEncryptedEnable = obsEncryptedEnable;
    }

    public TransferDetail withObsDirPreFixName(String obsDirPreFixName) {
        this.obsDirPreFixName = obsDirPreFixName;
        return this;
    }

    /**
     * OBS转储自定义转储路径
     * @return obsDirPreFixName
     */
    public String getObsDirPreFixName() {
        return obsDirPreFixName;
    }

    public void setObsDirPreFixName(String obsDirPreFixName) {
        this.obsDirPreFixName = obsDirPreFixName;
    }

    public TransferDetail withDisId(String disId) {
        this.disId = disId;
        return this;
    }

    /**
     * DIS转储通道ID
     * @return disId
     */
    public String getDisId() {
        return disId;
    }

    public void setDisId(String disId) {
        this.disId = disId;
    }

    public TransferDetail withDisName(String disName) {
        this.disName = disName;
        return this;
    }

    /**
     * DIS转储通道名称
     * @return disName
     */
    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName;
    }

    public TransferDetail withKafkaId(String kafkaId) {
        this.kafkaId = kafkaId;
        return this;
    }

    /**
     * DMS转储kafka ID
     * @return kafkaId
     */
    public String getKafkaId() {
        return kafkaId;
    }

    public void setKafkaId(String kafkaId) {
        this.kafkaId = kafkaId;
    }

    public TransferDetail withKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
        return this;
    }

    /**
     * DMS转储kafka topic
     * @return kafkaTopic
     */
    public String getKafkaTopic() {
        return kafkaTopic;
    }

    public void setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
    }

    public TransferDetail withObsTimeZone(String obsTimeZone) {
        this.obsTimeZone = obsTimeZone;
        return this;
    }

    /**
     * OBS转储时区。如果选择该参数，则必须选择obs_time_zone_id。
     * @return obsTimeZone
     */
    public String getObsTimeZone() {
        return obsTimeZone;
    }

    public void setObsTimeZone(String obsTimeZone) {
        this.obsTimeZone = obsTimeZone;
    }

    public TransferDetail withObsTimeZoneId(String obsTimeZoneId) {
        this.obsTimeZoneId = obsTimeZoneId;
        return this;
    }

    /**
     * OBS转储时区ID。参数选择参考OBS转储时区表。如果选择该参数，则必须选择obs_time_zone。
     * @return obsTimeZoneId
     */
    public String getObsTimeZoneId() {
        return obsTimeZoneId;
    }

    public void setObsTimeZoneId(String obsTimeZoneId) {
        this.obsTimeZoneId = obsTimeZoneId;
    }

    public TransferDetail withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public TransferDetail addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TransferDetail withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 若开启tag投递，该字段必须包含主机信息：hostIP、hostId、hostName、pathFile、collectTime；  公共字段有：logStreamName、regionName、logGroupName、projectId，为可选填；  开启转储标签：streamTag，可选填
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public TransferDetail withLtsTags(List<String> ltsTags) {
        this.ltsTags = ltsTags;
        return this;
    }

    public TransferDetail addLtsTagsItem(String ltsTagsItem) {
        if (this.ltsTags == null) {
            this.ltsTags = new ArrayList<>();
        }
        this.ltsTags.add(ltsTagsItem);
        return this;
    }

    public TransferDetail withLtsTags(Consumer<List<String>> ltsTagsSetter) {
        if (this.ltsTags == null) {
            this.ltsTags = new ArrayList<>();
        }
        ltsTagsSetter.accept(this.ltsTags);
        return this;
    }

    /**
     * dms转储JSON格式选填，可以转储tag字段
     * @return ltsTags
     */
    public List<String> getLtsTags() {
        return ltsTags;
    }

    public void setLtsTags(List<String> ltsTags) {
        this.ltsTags = ltsTags;
    }

    public TransferDetail withStreamTags(List<String> streamTags) {
        this.streamTags = streamTags;
        return this;
    }

    public TransferDetail addStreamTagsItem(String streamTagsItem) {
        if (this.streamTags == null) {
            this.streamTags = new ArrayList<>();
        }
        this.streamTags.add(streamTagsItem);
        return this;
    }

    public TransferDetail withStreamTags(Consumer<List<String>> streamTagsSetter) {
        if (this.streamTags == null) {
            this.streamTags = new ArrayList<>();
        }
        streamTagsSetter.accept(this.streamTags);
        return this;
    }

    /**
     * dms转储JSON格式选填，可以转储日志流标签字段
     * @return streamTags
     */
    public List<String> getStreamTags() {
        return streamTags;
    }

    public void setStreamTags(List<String> streamTags) {
        this.streamTags = streamTags;
    }

    public TransferDetail withStructFields(List<String> structFields) {
        this.structFields = structFields;
        return this;
    }

    public TransferDetail addStructFieldsItem(String structFieldsItem) {
        if (this.structFields == null) {
            this.structFields = new ArrayList<>();
        }
        this.structFields.add(structFieldsItem);
        return this;
    }

    public TransferDetail withStructFields(Consumer<List<String>> structFieldsSetter) {
        if (this.structFields == null) {
            this.structFields = new ArrayList<>();
        }
        structFieldsSetter.accept(this.structFields);
        return this;
    }

    /**
     * dms转储JSON格式选填，可以转储结构化字段
     * @return structFields
     */
    public List<String> getStructFields() {
        return structFields;
    }

    public void setStructFields(List<String> structFields) {
        this.structFields = structFields;
    }

    public TransferDetail withInvalidFieldValue(String invalidFieldValue) {
        this.invalidFieldValue = invalidFieldValue;
        return this;
    }

    /**
     * dms转储JSON格式选填，无效字段填充
     * @return invalidFieldValue
     */
    public String getInvalidFieldValue() {
        return invalidFieldValue;
    }

    public void setInvalidFieldValue(String invalidFieldValue) {
        this.invalidFieldValue = invalidFieldValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransferDetail that = (TransferDetail) obj;
        return Objects.equals(this.obsPeriod, that.obsPeriod)
            && Objects.equals(this.obsEncryptedId, that.obsEncryptedId)
            && Objects.equals(this.obsPrefixName, that.obsPrefixName)
            && Objects.equals(this.obsPeriodUnit, that.obsPeriodUnit)
            && Objects.equals(this.obsTransferPath, that.obsTransferPath)
            && Objects.equals(this.obsEpsId, that.obsEpsId) && Objects.equals(this.obsBucketName, that.obsBucketName)
            && Objects.equals(this.obsEncryptedEnable, that.obsEncryptedEnable)
            && Objects.equals(this.obsDirPreFixName, that.obsDirPreFixName) && Objects.equals(this.disId, that.disId)
            && Objects.equals(this.disName, that.disName) && Objects.equals(this.kafkaId, that.kafkaId)
            && Objects.equals(this.kafkaTopic, that.kafkaTopic) && Objects.equals(this.obsTimeZone, that.obsTimeZone)
            && Objects.equals(this.obsTimeZoneId, that.obsTimeZoneId) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.ltsTags, that.ltsTags) && Objects.equals(this.streamTags, that.streamTags)
            && Objects.equals(this.structFields, that.structFields)
            && Objects.equals(this.invalidFieldValue, that.invalidFieldValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsPeriod,
            obsEncryptedId,
            obsPrefixName,
            obsPeriodUnit,
            obsTransferPath,
            obsEpsId,
            obsBucketName,
            obsEncryptedEnable,
            obsDirPreFixName,
            disId,
            disName,
            kafkaId,
            kafkaTopic,
            obsTimeZone,
            obsTimeZoneId,
            tags,
            ltsTags,
            streamTags,
            structFields,
            invalidFieldValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferDetail {\n");
        sb.append("    obsPeriod: ").append(toIndentedString(obsPeriod)).append("\n");
        sb.append("    obsEncryptedId: ").append(toIndentedString(obsEncryptedId)).append("\n");
        sb.append("    obsPrefixName: ").append(toIndentedString(obsPrefixName)).append("\n");
        sb.append("    obsPeriodUnit: ").append(toIndentedString(obsPeriodUnit)).append("\n");
        sb.append("    obsTransferPath: ").append(toIndentedString(obsTransferPath)).append("\n");
        sb.append("    obsEpsId: ").append(toIndentedString(obsEpsId)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    obsEncryptedEnable: ").append(toIndentedString(obsEncryptedEnable)).append("\n");
        sb.append("    obsDirPreFixName: ").append(toIndentedString(obsDirPreFixName)).append("\n");
        sb.append("    disId: ").append(toIndentedString(disId)).append("\n");
        sb.append("    disName: ").append(toIndentedString(disName)).append("\n");
        sb.append("    kafkaId: ").append(toIndentedString(kafkaId)).append("\n");
        sb.append("    kafkaTopic: ").append(toIndentedString(kafkaTopic)).append("\n");
        sb.append("    obsTimeZone: ").append(toIndentedString(obsTimeZone)).append("\n");
        sb.append("    obsTimeZoneId: ").append(toIndentedString(obsTimeZoneId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    ltsTags: ").append(toIndentedString(ltsTags)).append("\n");
        sb.append("    streamTags: ").append(toIndentedString(streamTags)).append("\n");
        sb.append("    structFields: ").append(toIndentedString(structFields)).append("\n");
        sb.append("    invalidFieldValue: ").append(toIndentedString(invalidFieldValue)).append("\n");
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
