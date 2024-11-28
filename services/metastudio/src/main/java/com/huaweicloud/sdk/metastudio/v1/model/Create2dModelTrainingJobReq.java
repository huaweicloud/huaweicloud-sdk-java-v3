package com.huaweicloud.sdk.metastudio.v1.model;

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
 * 创建或更新分身数字人模型训练任务请求。
 */
public class Create2dModelTrainingJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact")

    private String contact;

    /**
     * 命令类型： * UPDATE_VIDEO: 更新视频 * UPLOAD_VIDEO：上传视频 * CONFIRM_ACTION_VIDEO: 确认动作编排视频 * GET_ACTION_VIDEO_MULTIPART: 获取动作编排视频分片
     */
    public static final class CommandMessageEnum {

        /**
         * Enum UPDATE_VIDEO for value: "UPDATE_VIDEO"
         */
        public static final CommandMessageEnum UPDATE_VIDEO = new CommandMessageEnum("UPDATE_VIDEO");

        /**
         * Enum UPLOAD_VIDEO for value: "UPLOAD_VIDEO"
         */
        public static final CommandMessageEnum UPLOAD_VIDEO = new CommandMessageEnum("UPLOAD_VIDEO");

        /**
         * Enum CONFIRM_ACTION_VIDEO for value: "CONFIRM_ACTION_VIDEO"
         */
        public static final CommandMessageEnum CONFIRM_ACTION_VIDEO = new CommandMessageEnum("CONFIRM_ACTION_VIDEO");

        /**
         * Enum GET_ACTION_VIDEO_MULTIPART for value: "GET_ACTION_VIDEO_MULTIPART"
         */
        public static final CommandMessageEnum GET_ACTION_VIDEO_MULTIPART =
            new CommandMessageEnum("GET_ACTION_VIDEO_MULTIPART");

        private static final Map<String, CommandMessageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CommandMessageEnum> createStaticFields() {
            Map<String, CommandMessageEnum> map = new HashMap<>();
            map.put("UPDATE_VIDEO", UPDATE_VIDEO);
            map.put("UPLOAD_VIDEO", UPLOAD_VIDEO);
            map.put("CONFIRM_ACTION_VIDEO", CONFIRM_ACTION_VIDEO);
            map.put("GET_ACTION_VIDEO_MULTIPART", GET_ACTION_VIDEO_MULTIPART);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CommandMessageEnum(String value) {
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
        public static CommandMessageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CommandMessageEnum(value));
        }

        public static CommandMessageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CommandMessageEnum) {
                return this.value.equals(((CommandMessageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_message")

    private CommandMessageEnum commandMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_multipart_count")

    private Integer videoMultipartCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_video_multipart_count")

    private Integer actionVideoMultipartCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_background_replacement")

    private Boolean isBackgroundReplacement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_name")

    private String batchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    /**
     * 分身数字人模型版本。默认是V3.2版本模型。 * V3.2：V3.2版本模型 > * V3和V2版本已废弃不用
     */
    public static final class ModelVersionEnum {

        /**
         * Enum V2 for value: "V2"
         */
        public static final ModelVersionEnum V2 = new ModelVersionEnum("V2");

        /**
         * Enum V3 for value: "V3"
         */
        public static final ModelVersionEnum V3 = new ModelVersionEnum("V3");

        /**
         * Enum V3_2 for value: "V3.2"
         */
        public static final ModelVersionEnum V3_2 = new ModelVersionEnum("V3.2");

        private static final Map<String, ModelVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModelVersionEnum> createStaticFields() {
            Map<String, ModelVersionEnum> map = new HashMap<>();
            map.put("V2", V2);
            map.put("V3", V3);
            map.put("V3.2", V3_2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModelVersionEnum(String value) {
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
        public static ModelVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModelVersionEnum(value));
        }

        public static ModelVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModelVersionEnum) {
                return this.value.equals(((ModelVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_version")

    private ModelVersionEnum modelVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_flexus")

    private Boolean isFlexus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_only_human_model")

    private Boolean isOnlyHumanModel;

    /**
     * 声音来源类型 * VIDEO：视频中抽取音频 * AUDIO：单独上传的音频
     */
    public static final class AudioSourceTypeEnum {

        /**
         * Enum VIDEO for value: "VIDEO"
         */
        public static final AudioSourceTypeEnum VIDEO = new AudioSourceTypeEnum("VIDEO");

        /**
         * Enum AUDIO for value: "AUDIO"
         */
        public static final AudioSourceTypeEnum AUDIO = new AudioSourceTypeEnum("AUDIO");

        private static final Map<String, AudioSourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AudioSourceTypeEnum> createStaticFields() {
            Map<String, AudioSourceTypeEnum> map = new HashMap<>();
            map.put("VIDEO", VIDEO);
            map.put("AUDIO", AUDIO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AudioSourceTypeEnum(String value) {
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
        public static AudioSourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AudioSourceTypeEnum(value));
        }

        public static AudioSourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AudioSourceTypeEnum) {
                return this.value.equals(((AudioSourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_source_type")

    private AudioSourceTypeEnum audioSourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_properties")

    private VoiceProperties voiceProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_service")

    private List<SupportedServiceEnum> supportedService = null;

    public Create2dModelTrainingJobReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分身数字人模型名称。该名称会作为资产库中分身数字人模型资产名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Create2dModelTrainingJobReq withContact(String contact) {
        this.contact = contact;
        return this;
    }

    /**
     * 分身数字人训练任务创建者的手机号。
     * @return contact
     */
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Create2dModelTrainingJobReq withCommandMessage(CommandMessageEnum commandMessage) {
        this.commandMessage = commandMessage;
        return this;
    }

    /**
     * 命令类型： * UPDATE_VIDEO: 更新视频 * UPLOAD_VIDEO：上传视频 * CONFIRM_ACTION_VIDEO: 确认动作编排视频 * GET_ACTION_VIDEO_MULTIPART: 获取动作编排视频分片
     * @return commandMessage
     */
    public CommandMessageEnum getCommandMessage() {
        return commandMessage;
    }

    public void setCommandMessage(CommandMessageEnum commandMessage) {
        this.commandMessage = commandMessage;
    }

    public Create2dModelTrainingJobReq withVideoMultipartCount(Integer videoMultipartCount) {
        this.videoMultipartCount = videoMultipartCount;
        return this;
    }

    /**
     * 训练视频上传分片数（上传时对唯一训练视频文件的数据分片，用于对该文件的并发上传，不是分多个视频文件上传）。
     * minimum: 1
     * maximum: 1000
     * @return videoMultipartCount
     */
    public Integer getVideoMultipartCount() {
        return videoMultipartCount;
    }

    public void setVideoMultipartCount(Integer videoMultipartCount) {
        this.videoMultipartCount = videoMultipartCount;
    }

    public Create2dModelTrainingJobReq withActionVideoMultipartCount(Integer actionVideoMultipartCount) {
        this.actionVideoMultipartCount = actionVideoMultipartCount;
        return this;
    }

    /**
     * 动作视频上传分片数。
     * minimum: 1
     * maximum: 1000
     * @return actionVideoMultipartCount
     */
    public Integer getActionVideoMultipartCount() {
        return actionVideoMultipartCount;
    }

    public void setActionVideoMultipartCount(Integer actionVideoMultipartCount) {
        this.actionVideoMultipartCount = actionVideoMultipartCount;
    }

    public Create2dModelTrainingJobReq withIsBackgroundReplacement(Boolean isBackgroundReplacement) {
        this.isBackgroundReplacement = isBackgroundReplacement;
        return this;
    }

    /**
     * 分身数字人是否需要背景替换。需要背景替换的分身数字人训练视频需要绿幕拍摄。
     * @return isBackgroundReplacement
     */
    public Boolean getIsBackgroundReplacement() {
        return isBackgroundReplacement;
    }

    public void setIsBackgroundReplacement(Boolean isBackgroundReplacement) {
        this.isBackgroundReplacement = isBackgroundReplacement;
    }

    public Create2dModelTrainingJobReq withBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }

    /**
     * 分身数字人训练任务的批次名称。
     * @return batchName
     */
    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Create2dModelTrainingJobReq withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Create2dModelTrainingJobReq addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Create2dModelTrainingJobReq withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 分身数字人训练任务标签。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Create2dModelTrainingJobReq withModelVersion(ModelVersionEnum modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * 分身数字人模型版本。默认是V3.2版本模型。 * V3.2：V3.2版本模型 > * V3和V2版本已废弃不用
     * @return modelVersion
     */
    public ModelVersionEnum getModelVersion() {
        return modelVersion;
    }

    public void setModelVersion(ModelVersionEnum modelVersion) {
        this.modelVersion = modelVersion;
    }

    public Create2dModelTrainingJobReq withIsFlexus(Boolean isFlexus) {
        this.isFlexus = isFlexus;
        return this;
    }

    /**
     * 是否是基础版的形象训练
     * @return isFlexus
     */
    public Boolean getIsFlexus() {
        return isFlexus;
    }

    public void setIsFlexus(Boolean isFlexus) {
        this.isFlexus = isFlexus;
    }

    public Create2dModelTrainingJobReq withIsOnlyHumanModel(Boolean isOnlyHumanModel) {
        this.isOnlyHumanModel = isOnlyHumanModel;
        return this;
    }

    /**
     * 是否只训练形象模型，不训练声音模型。仅Flexus版本时有效，默认false。
     * @return isOnlyHumanModel
     */
    public Boolean getIsOnlyHumanModel() {
        return isOnlyHumanModel;
    }

    public void setIsOnlyHumanModel(Boolean isOnlyHumanModel) {
        this.isOnlyHumanModel = isOnlyHumanModel;
    }

    public Create2dModelTrainingJobReq withAudioSourceType(AudioSourceTypeEnum audioSourceType) {
        this.audioSourceType = audioSourceType;
        return this;
    }

    /**
     * 声音来源类型 * VIDEO：视频中抽取音频 * AUDIO：单独上传的音频
     * @return audioSourceType
     */
    public AudioSourceTypeEnum getAudioSourceType() {
        return audioSourceType;
    }

    public void setAudioSourceType(AudioSourceTypeEnum audioSourceType) {
        this.audioSourceType = audioSourceType;
    }

    public Create2dModelTrainingJobReq withVoiceProperties(VoiceProperties voiceProperties) {
        this.voiceProperties = voiceProperties;
        return this;
    }

    public Create2dModelTrainingJobReq withVoiceProperties(Consumer<VoiceProperties> voicePropertiesSetter) {
        if (this.voiceProperties == null) {
            this.voiceProperties = new VoiceProperties();
            voicePropertiesSetter.accept(this.voiceProperties);
        }

        return this;
    }

    /**
     * Get voiceProperties
     * @return voiceProperties
     */
    public VoiceProperties getVoiceProperties() {
        return voiceProperties;
    }

    public void setVoiceProperties(VoiceProperties voiceProperties) {
        this.voiceProperties = voiceProperties;
    }

    public Create2dModelTrainingJobReq withSupportedService(List<SupportedServiceEnum> supportedService) {
        this.supportedService = supportedService;
        return this;
    }

    public Create2dModelTrainingJobReq addSupportedServiceItem(SupportedServiceEnum supportedServiceItem) {
        if (this.supportedService == null) {
            this.supportedService = new ArrayList<>();
        }
        this.supportedService.add(supportedServiceItem);
        return this;
    }

    public Create2dModelTrainingJobReq withSupportedService(
        Consumer<List<SupportedServiceEnum>> supportedServiceSetter) {
        if (this.supportedService == null) {
            this.supportedService = new ArrayList<>();
        }
        supportedServiceSetter.accept(this.supportedService);
        return this;
    }

    /**
     * 该任务所生成的模型支持的业务类型，可多选
     * @return supportedService
     */
    public List<SupportedServiceEnum> getSupportedService() {
        return supportedService;
    }

    public void setSupportedService(List<SupportedServiceEnum> supportedService) {
        this.supportedService = supportedService;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Create2dModelTrainingJobReq that = (Create2dModelTrainingJobReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.contact, that.contact)
            && Objects.equals(this.commandMessage, that.commandMessage)
            && Objects.equals(this.videoMultipartCount, that.videoMultipartCount)
            && Objects.equals(this.actionVideoMultipartCount, that.actionVideoMultipartCount)
            && Objects.equals(this.isBackgroundReplacement, that.isBackgroundReplacement)
            && Objects.equals(this.batchName, that.batchName) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.modelVersion, that.modelVersion) && Objects.equals(this.isFlexus, that.isFlexus)
            && Objects.equals(this.isOnlyHumanModel, that.isOnlyHumanModel)
            && Objects.equals(this.audioSourceType, that.audioSourceType)
            && Objects.equals(this.voiceProperties, that.voiceProperties)
            && Objects.equals(this.supportedService, that.supportedService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            contact,
            commandMessage,
            videoMultipartCount,
            actionVideoMultipartCount,
            isBackgroundReplacement,
            batchName,
            tags,
            modelVersion,
            isFlexus,
            isOnlyHumanModel,
            audioSourceType,
            voiceProperties,
            supportedService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Create2dModelTrainingJobReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
        sb.append("    commandMessage: ").append(toIndentedString(commandMessage)).append("\n");
        sb.append("    videoMultipartCount: ").append(toIndentedString(videoMultipartCount)).append("\n");
        sb.append("    actionVideoMultipartCount: ").append(toIndentedString(actionVideoMultipartCount)).append("\n");
        sb.append("    isBackgroundReplacement: ").append(toIndentedString(isBackgroundReplacement)).append("\n");
        sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    modelVersion: ").append(toIndentedString(modelVersion)).append("\n");
        sb.append("    isFlexus: ").append(toIndentedString(isFlexus)).append("\n");
        sb.append("    isOnlyHumanModel: ").append(toIndentedString(isOnlyHumanModel)).append("\n");
        sb.append("    audioSourceType: ").append(toIndentedString(audioSourceType)).append("\n");
        sb.append("    voiceProperties: ").append(toIndentedString(voiceProperties)).append("\n");
        sb.append("    supportedService: ").append(toIndentedString(supportedService)).append("\n");
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
