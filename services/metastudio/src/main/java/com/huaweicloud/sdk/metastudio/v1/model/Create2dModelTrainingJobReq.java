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
     * 命令类型： * UPDATE_VIDEO: 更新视频 * UPLOAD_VIDEO：上传视频
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

        private static final Map<String, CommandMessageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CommandMessageEnum> createStaticFields() {
            Map<String, CommandMessageEnum> map = new HashMap<>();
            map.put("UPDATE_VIDEO", UPDATE_VIDEO);
            map.put("UPLOAD_VIDEO", UPLOAD_VIDEO);
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
    @JsonProperty(value = "is_background_replacement")

    private Boolean isBackgroundReplacement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_name")

    private String batchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    /**
     * 分身数字人模型版本。默认是V3版本模型。 * V2: V2版本模型 * V3：V3版本模型 * V3.2：V3.2版本模型 > * V2版本已废弃不用
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
     * 分身数字人训练任务创建者联系方式，如手机或邮箱等。
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
     * 命令类型： * UPDATE_VIDEO: 更新视频 * UPLOAD_VIDEO：上传视频
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
     * 训练视频上传分片数。
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
     * 分身数字人模型版本。默认是V3版本模型。 * V2: V2版本模型 * V3：V3版本模型 * V3.2：V3.2版本模型 > * V2版本已废弃不用
     * @return modelVersion
     */
    public ModelVersionEnum getModelVersion() {
        return modelVersion;
    }

    public void setModelVersion(ModelVersionEnum modelVersion) {
        this.modelVersion = modelVersion;
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
            && Objects.equals(this.isBackgroundReplacement, that.isBackgroundReplacement)
            && Objects.equals(this.batchName, that.batchName) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.modelVersion, that.modelVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            contact,
            commandMessage,
            videoMultipartCount,
            isBackgroundReplacement,
            batchName,
            tags,
            modelVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Create2dModelTrainingJobReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
        sb.append("    commandMessage: ").append(toIndentedString(commandMessage)).append("\n");
        sb.append("    videoMultipartCount: ").append(toIndentedString(videoMultipartCount)).append("\n");
        sb.append("    isBackgroundReplacement: ").append(toIndentedString(isBackgroundReplacement)).append("\n");
        sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    modelVersion: ").append(toIndentedString(modelVersion)).append("\n");
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
