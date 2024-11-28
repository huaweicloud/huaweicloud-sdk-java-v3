package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建训练任务请求。
 */
public class CreateTrainingJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private JobTag tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 语音性别,是男性声音还是女性声音。 * FEMALE: 女性 * MALE: 男性
     */
    public static final class SexEnum {

        /**
         * Enum FEMALE for value: "FEMALE"
         */
        public static final SexEnum FEMALE = new SexEnum("FEMALE");

        /**
         * Enum MALE for value: "MALE"
         */
        public static final SexEnum MALE = new SexEnum("MALE");

        private static final Map<String, SexEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SexEnum> createStaticFields() {
            Map<String, SexEnum> map = new HashMap<>();
            map.put("FEMALE", FEMALE);
            map.put("MALE", MALE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SexEnum(String value) {
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
        public static SexEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SexEnum(value));
        }

        public static SexEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SexEnum) {
                return this.value.equals(((SexEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private SexEnum sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_name")

    private String voiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_type")

    private CreateType createType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dhtms_job_id")

    private String dhtmsJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_name")

    private String batchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_language")

    private String outputLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_text")

    private String customText;

    public CreateTrainingJobReq withTag(JobTag tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get tag
     * @return tag
     */
    public JobTag getTag() {
        return tag;
    }

    public void setTag(JobTag tag) {
        this.tag = tag;
    }

    public CreateTrainingJobReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 一段描述信息,会呈现在资产库中。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateTrainingJobReq withSex(SexEnum sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 语音性别,是男性声音还是女性声音。 * FEMALE: 女性 * MALE: 男性
     * @return sex
     */
    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public CreateTrainingJobReq withVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }

    /**
     * 音色名称。该名称会作为资产库中音色模型资产名称。
     * @return voiceName
     */
    public String getVoiceName() {
        return voiceName;
    }

    public void setVoiceName(String voiceName) {
        this.voiceName = voiceName;
    }

    public CreateTrainingJobReq withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 训练语言,当前仅支持中文。 * CN: 中文 * EN: 英文
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public CreateTrainingJobReq withCreateType(CreateType createType) {
        this.createType = createType;
        return this;
    }

    /**
     * Get createType
     * @return createType
     */
    public CreateType getCreateType() {
        return createType;
    }

    public void setCreateType(CreateType createType) {
        this.createType = createType;
    }

    public CreateTrainingJobReq withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 手机号
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CreateTrainingJobReq withDhtmsJobId(String dhtmsJobId) {
        this.dhtmsJobId = dhtmsJobId;
        return this;
    }

    /**
     * 形象制作任务id
     * @return dhtmsJobId
     */
    public String getDhtmsJobId() {
        return dhtmsJobId;
    }

    public void setDhtmsJobId(String dhtmsJobId) {
        this.dhtmsJobId = dhtmsJobId;
    }

    public CreateTrainingJobReq withBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }

    /**
     * 批次名称
     * @return batchName
     */
    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public CreateTrainingJobReq withOutputLanguage(String outputLanguage) {
        this.outputLanguage = outputLanguage;
        return this;
    }

    /**
     * 模型输出语言类型
     * @return outputLanguage
     */
    public String getOutputLanguage() {
        return outputLanguage;
    }

    public void setOutputLanguage(String outputLanguage) {
        this.outputLanguage = outputLanguage;
    }

    public CreateTrainingJobReq withCustomText(String customText) {
        this.customText = customText;
        return this;
    }

    /**
     * 自定义试听文本
     * @return customText
     */
    public String getCustomText() {
        return customText;
    }

    public void setCustomText(String customText) {
        this.customText = customText;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTrainingJobReq that = (CreateTrainingJobReq) obj;
        return Objects.equals(this.tag, that.tag) && Objects.equals(this.description, that.description)
            && Objects.equals(this.sex, that.sex) && Objects.equals(this.voiceName, that.voiceName)
            && Objects.equals(this.language, that.language) && Objects.equals(this.createType, that.createType)
            && Objects.equals(this.phone, that.phone) && Objects.equals(this.dhtmsJobId, that.dhtmsJobId)
            && Objects.equals(this.batchName, that.batchName)
            && Objects.equals(this.outputLanguage, that.outputLanguage)
            && Objects.equals(this.customText, that.customText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag,
            description,
            sex,
            voiceName,
            language,
            createType,
            phone,
            dhtmsJobId,
            batchName,
            outputLanguage,
            customText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrainingJobReq {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    voiceName: ").append(toIndentedString(voiceName)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    createType: ").append(toIndentedString(createType)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    dhtmsJobId: ").append(toIndentedString(dhtmsJobId)).append("\n");
        sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
        sb.append("    outputLanguage: ").append(toIndentedString(outputLanguage)).append("\n");
        sb.append("    customText: ").append(toIndentedString(customText)).append("\n");
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
