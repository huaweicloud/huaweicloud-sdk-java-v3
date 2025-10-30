package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LogTransferDetail
 */
public class LogTransferDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_period")

    private Integer obsPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_period_unit")

    private String obsPeriodUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_encrypted_id")

    private String obsEncryptedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_dir_pre_fix_name")

    private String obsDirPreFixName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_prefix_name")

    private String obsPrefixName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_time_zone")

    private String obsTimeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_time_zone_id")

    private String obsTimeZoneId;

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
    @JsonProperty(value = "obs_eps_id")

    private String obsEpsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_encrypted_enable")

    private Boolean obsEncryptedEnable;

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

    public LogTransferDetail withObsPeriod(Integer obsPeriod) {
        this.obsPeriod = obsPeriod;
        return this;
    }

    /**
     * **参数解释：**  OBS转储时间。当创建OBS转储时，必填此参数。与obs_period_unit组合，即\"obs_period\"+\"obs_period_unit\"，必须是\"2min\", \"5min\", \"30min\", \"1hour\", \"3hour\", \"6hour\",\"12hour\"。 **约束限制：**  不涉及。  **取值范围：**  1,2,3,5,6,12,30
     * @return obsPeriod
     */
    public Integer getObsPeriod() {
        return obsPeriod;
    }

    public void setObsPeriod(Integer obsPeriod) {
        this.obsPeriod = obsPeriod;
    }

    public LogTransferDetail withObsPeriodUnit(String obsPeriodUnit) {
        this.obsPeriodUnit = obsPeriodUnit;
        return this;
    }

    /**
     * **参数解释：**  OBS转储单位。当创建OBS转储时，必填此参数。与obs_period组合，即\"obs_period\"+\"obs_period_unit\"，必须是\"2min\", \"5min\", \"30min\", \"1hour\", \"3hour\", \"6hour\",\"12hour\"。 **约束限制：**  不涉及。  **取值范围：**  min,hour
     * @return obsPeriodUnit
     */
    public String getObsPeriodUnit() {
        return obsPeriodUnit;
    }

    public void setObsPeriodUnit(String obsPeriodUnit) {
        this.obsPeriodUnit = obsPeriodUnit;
    }

    public LogTransferDetail withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * **参数解释：**  OBS转储日志桶名称。当创建OBS转储时，必填此参数。 **约束限制：**  不涉及
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public LogTransferDetail withObsEncryptedId(String obsEncryptedId) {
        this.obsEncryptedId = obsEncryptedId;
        return this;
    }

    /**
     * **参数解释：**  OBS转储KMS密钥ID。根据OBS转储日志桶是否加密判断，若OBS转储日志加密桶则必须填写该参数，若OBS转储日志桶则不需要此参数 **约束限制：**  不涉及
     * @return obsEncryptedId
     */
    public String getObsEncryptedId() {
        return obsEncryptedId;
    }

    public void setObsEncryptedId(String obsEncryptedId) {
        this.obsEncryptedId = obsEncryptedId;
    }

    public LogTransferDetail withObsDirPreFixName(String obsDirPreFixName) {
        this.obsDirPreFixName = obsDirPreFixName;
        return this;
    }

    /**
     * **参数解释：**  OBS转储自定义转储路径。当创建OBS转储时，根据需要选填此参数。 **约束限制：**  不涉及
     * @return obsDirPreFixName
     */
    public String getObsDirPreFixName() {
        return obsDirPreFixName;
    }

    public void setObsDirPreFixName(String obsDirPreFixName) {
        this.obsDirPreFixName = obsDirPreFixName;
    }

    public LogTransferDetail withObsPrefixName(String obsPrefixName) {
        this.obsPrefixName = obsPrefixName;
        return this;
    }

    /**
     * **参数解释：**  OBS转储日志文件前缀。当创建OBS转储时，根据需要选填此参数。 **约束限制：**  不涉及
     * @return obsPrefixName
     */
    public String getObsPrefixName() {
        return obsPrefixName;
    }

    public void setObsPrefixName(String obsPrefixName) {
        this.obsPrefixName = obsPrefixName;
    }

    public LogTransferDetail withObsTimeZone(String obsTimeZone) {
        this.obsTimeZone = obsTimeZone;
        return this;
    }

    /**
     * **参数解释：**  OBS转储时区。参数选择参考OBS转储时区表。如果选择该参数，则必须选择obs_time_zone_id。 **约束限制：**  不涉及
     * @return obsTimeZone
     */
    public String getObsTimeZone() {
        return obsTimeZone;
    }

    public void setObsTimeZone(String obsTimeZone) {
        this.obsTimeZone = obsTimeZone;
    }

    public LogTransferDetail withObsTimeZoneId(String obsTimeZoneId) {
        this.obsTimeZoneId = obsTimeZoneId;
        return this;
    }

    /**
     * **参数解释：**  OBS转储时区ID。参数选择参考OBS转储时区表。如果选择该参数，则必须选择obs_time_zone。 **约束限制：**  不涉及
     * @return obsTimeZoneId
     */
    public String getObsTimeZoneId() {
        return obsTimeZoneId;
    }

    public void setObsTimeZoneId(String obsTimeZoneId) {
        this.obsTimeZoneId = obsTimeZoneId;
    }

    public LogTransferDetail withDisId(String disId) {
        this.disId = disId;
        return this;
    }

    /**
     * **参数解释：**  DIS转储通道ID。当创建DIS转储时，必填此参数。 **约束限制：**  不涉及
     * @return disId
     */
    public String getDisId() {
        return disId;
    }

    public void setDisId(String disId) {
        this.disId = disId;
    }

    public LogTransferDetail withDisName(String disName) {
        this.disName = disName;
        return this;
    }

    /**
     * **参数解释：**  DIS转储通道名称。当创建DIS转储时，必填此参数。 **约束限制：**  不涉及
     * @return disName
     */
    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName;
    }

    public LogTransferDetail withKafkaId(String kafkaId) {
        this.kafkaId = kafkaId;
        return this;
    }

    /**
     * **参数解释：**  DMS转储kafka ID。当创建DMS转储时，必填此参数。创建DMS转储前，需要使用kafka ID以及kafka Topic进行实例注册。详情见接口注册DMSkafka实例 **约束限制：**  不涉及
     * @return kafkaId
     */
    public String getKafkaId() {
        return kafkaId;
    }

    public void setKafkaId(String kafkaId) {
        this.kafkaId = kafkaId;
    }

    public LogTransferDetail withKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
        return this;
    }

    /**
     * **参数解释：**  DMS转储kafka topic。当创建DMS转储时，必填此参数。创建DMS转储前，需要使用kafka ID以及kafka Topic进行实例注册。详情见接口注册DMSkafka实例 **约束限制：**  不涉及
     * @return kafkaTopic
     */
    public String getKafkaTopic() {
        return kafkaTopic;
    }

    public void setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
    }

    public LogTransferDetail withObsEpsId(String obsEpsId) {
        this.obsEpsId = obsEpsId;
        return this;
    }

    /**
     * **参数解释：**  OBS企业项目ID。 **约束限制：**  不涉及
     * @return obsEpsId
     */
    public String getObsEpsId() {
        return obsEpsId;
    }

    public void setObsEpsId(String obsEpsId) {
        this.obsEpsId = obsEpsId;
    }

    public LogTransferDetail withObsEncryptedEnable(Boolean obsEncryptedEnable) {
        this.obsEncryptedEnable = obsEncryptedEnable;
        return this;
    }

    /**
     * **参数解释：**  OBS是否开启加密。 **约束限制：**  不涉及
     * @return obsEncryptedEnable
     */
    public Boolean getObsEncryptedEnable() {
        return obsEncryptedEnable;
    }

    public void setObsEncryptedEnable(Boolean obsEncryptedEnable) {
        this.obsEncryptedEnable = obsEncryptedEnable;
    }

    public LogTransferDetail withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public LogTransferDetail addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public LogTransferDetail withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：**  若开启tag投递，该字段必须包含主机信息：hostIP、hostId、hostName、pathFile、collectTime； 公共字段有：logStreamName、regionName、logGroupName、projectId，为可选填；开启转储标签：streamTag，可选填 **约束限制：**  不涉及
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public LogTransferDetail withLtsTags(List<String> ltsTags) {
        this.ltsTags = ltsTags;
        return this;
    }

    public LogTransferDetail addLtsTagsItem(String ltsTagsItem) {
        if (this.ltsTags == null) {
            this.ltsTags = new ArrayList<>();
        }
        this.ltsTags.add(ltsTagsItem);
        return this;
    }

    public LogTransferDetail withLtsTags(Consumer<List<String>> ltsTagsSetter) {
        if (this.ltsTags == null) {
            this.ltsTags = new ArrayList<>();
        }
        ltsTagsSetter.accept(this.ltsTags);
        return this;
    }

    /**
     * **参数解释：**  dms转储JSON格式选填，可以转储tag字段 **约束限制：**  不涉及
     * @return ltsTags
     */
    public List<String> getLtsTags() {
        return ltsTags;
    }

    public void setLtsTags(List<String> ltsTags) {
        this.ltsTags = ltsTags;
    }

    public LogTransferDetail withStreamTags(List<String> streamTags) {
        this.streamTags = streamTags;
        return this;
    }

    public LogTransferDetail addStreamTagsItem(String streamTagsItem) {
        if (this.streamTags == null) {
            this.streamTags = new ArrayList<>();
        }
        this.streamTags.add(streamTagsItem);
        return this;
    }

    public LogTransferDetail withStreamTags(Consumer<List<String>> streamTagsSetter) {
        if (this.streamTags == null) {
            this.streamTags = new ArrayList<>();
        }
        streamTagsSetter.accept(this.streamTags);
        return this;
    }

    /**
     * **参数解释：**  dms转储JSON格式选填，可以转储日志流标签字段 **约束限制：**  不涉及
     * @return streamTags
     */
    public List<String> getStreamTags() {
        return streamTags;
    }

    public void setStreamTags(List<String> streamTags) {
        this.streamTags = streamTags;
    }

    public LogTransferDetail withStructFields(List<String> structFields) {
        this.structFields = structFields;
        return this;
    }

    public LogTransferDetail addStructFieldsItem(String structFieldsItem) {
        if (this.structFields == null) {
            this.structFields = new ArrayList<>();
        }
        this.structFields.add(structFieldsItem);
        return this;
    }

    public LogTransferDetail withStructFields(Consumer<List<String>> structFieldsSetter) {
        if (this.structFields == null) {
            this.structFields = new ArrayList<>();
        }
        structFieldsSetter.accept(this.structFields);
        return this;
    }

    /**
     * **参数解释：**  dms转储JSON格式选填，可以转储结构化字段 **约束限制：**  不涉及
     * @return structFields
     */
    public List<String> getStructFields() {
        return structFields;
    }

    public void setStructFields(List<String> structFields) {
        this.structFields = structFields;
    }

    public LogTransferDetail withInvalidFieldValue(String invalidFieldValue) {
        this.invalidFieldValue = invalidFieldValue;
        return this;
    }

    /**
     * **参数解释：**  dms转储JSON格式选填，无效字段填充 **约束限制：**  不涉及
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
        LogTransferDetail that = (LogTransferDetail) obj;
        return Objects.equals(this.obsPeriod, that.obsPeriod) && Objects.equals(this.obsPeriodUnit, that.obsPeriodUnit)
            && Objects.equals(this.obsBucketName, that.obsBucketName)
            && Objects.equals(this.obsEncryptedId, that.obsEncryptedId)
            && Objects.equals(this.obsDirPreFixName, that.obsDirPreFixName)
            && Objects.equals(this.obsPrefixName, that.obsPrefixName)
            && Objects.equals(this.obsTimeZone, that.obsTimeZone)
            && Objects.equals(this.obsTimeZoneId, that.obsTimeZoneId) && Objects.equals(this.disId, that.disId)
            && Objects.equals(this.disName, that.disName) && Objects.equals(this.kafkaId, that.kafkaId)
            && Objects.equals(this.kafkaTopic, that.kafkaTopic) && Objects.equals(this.obsEpsId, that.obsEpsId)
            && Objects.equals(this.obsEncryptedEnable, that.obsEncryptedEnable) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.ltsTags, that.ltsTags) && Objects.equals(this.streamTags, that.streamTags)
            && Objects.equals(this.structFields, that.structFields)
            && Objects.equals(this.invalidFieldValue, that.invalidFieldValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsPeriod,
            obsPeriodUnit,
            obsBucketName,
            obsEncryptedId,
            obsDirPreFixName,
            obsPrefixName,
            obsTimeZone,
            obsTimeZoneId,
            disId,
            disName,
            kafkaId,
            kafkaTopic,
            obsEpsId,
            obsEncryptedEnable,
            tags,
            ltsTags,
            streamTags,
            structFields,
            invalidFieldValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogTransferDetail {\n");
        sb.append("    obsPeriod: ").append(toIndentedString(obsPeriod)).append("\n");
        sb.append("    obsPeriodUnit: ").append(toIndentedString(obsPeriodUnit)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    obsEncryptedId: ").append(toIndentedString(obsEncryptedId)).append("\n");
        sb.append("    obsDirPreFixName: ").append(toIndentedString(obsDirPreFixName)).append("\n");
        sb.append("    obsPrefixName: ").append(toIndentedString(obsPrefixName)).append("\n");
        sb.append("    obsTimeZone: ").append(toIndentedString(obsTimeZone)).append("\n");
        sb.append("    obsTimeZoneId: ").append(toIndentedString(obsTimeZoneId)).append("\n");
        sb.append("    disId: ").append(toIndentedString(disId)).append("\n");
        sb.append("    disName: ").append(toIndentedString(disName)).append("\n");
        sb.append("    kafkaId: ").append(toIndentedString(kafkaId)).append("\n");
        sb.append("    kafkaTopic: ").append(toIndentedString(kafkaTopic)).append("\n");
        sb.append("    obsEpsId: ").append(toIndentedString(obsEpsId)).append("\n");
        sb.append("    obsEncryptedEnable: ").append(toIndentedString(obsEncryptedEnable)).append("\n");
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
