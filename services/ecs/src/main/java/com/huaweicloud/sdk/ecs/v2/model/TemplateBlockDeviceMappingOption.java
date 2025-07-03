package com.huaweicloud.sdk.ecs.v2.model;

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
 * TemplateBlockDeviceMappingOption
 */
public class TemplateBlockDeviceMappingOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    /**
     * 卷设备源头类型
     */
    public static final class SourceTypeEnum {

        /**
         * Enum BLANK for value: "blank"
         */
        public static final SourceTypeEnum BLANK = new SourceTypeEnum("blank");

        /**
         * Enum IMAGE for value: "image"
         */
        public static final SourceTypeEnum IMAGE = new SourceTypeEnum("image");

        private static final Map<String, SourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceTypeEnum> createStaticFields() {
            Map<String, SourceTypeEnum> map = new HashMap<>();
            map.put("blank", BLANK);
            map.put("image", IMAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceTypeEnum(value));
        }

        public static SourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceTypeEnum) {
                return this.value.equals(((SourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private SourceTypeEnum sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypted")

    private Boolean encrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmk_id")

    private String cmkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_size")

    private Integer volumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment")

    private TemplateBlockDeviceMappingAttachmentOption attachment;

    public TemplateBlockDeviceMappingOption withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 虚拟机卷数据源类型：blank, image_id
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public TemplateBlockDeviceMappingOption withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 卷设备源头类型
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public TemplateBlockDeviceMappingOption withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * 是否加密
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public TemplateBlockDeviceMappingOption withCmkId(String cmkId) {
        this.cmkId = cmkId;
        return this;
    }

    /**
     * 秘钥ID
     * @return cmkId
     */
    public String getCmkId() {
        return cmkId;
    }

    public void setCmkId(String cmkId) {
        this.cmkId = cmkId;
    }

    public TemplateBlockDeviceMappingOption withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 卷类型
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public TemplateBlockDeviceMappingOption withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * 卷大小
     * @return volumeSize
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    public TemplateBlockDeviceMappingOption withAttachment(TemplateBlockDeviceMappingAttachmentOption attachment) {
        this.attachment = attachment;
        return this;
    }

    public TemplateBlockDeviceMappingOption withAttachment(
        Consumer<TemplateBlockDeviceMappingAttachmentOption> attachmentSetter) {
        if (this.attachment == null) {
            this.attachment = new TemplateBlockDeviceMappingAttachmentOption();
            attachmentSetter.accept(this.attachment);
        }

        return this;
    }

    /**
     * Get attachment
     * @return attachment
     */
    public TemplateBlockDeviceMappingAttachmentOption getAttachment() {
        return attachment;
    }

    public void setAttachment(TemplateBlockDeviceMappingAttachmentOption attachment) {
        this.attachment = attachment;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateBlockDeviceMappingOption that = (TemplateBlockDeviceMappingOption) obj;
        return Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.encrypted, that.encrypted) && Objects.equals(this.cmkId, that.cmkId)
            && Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.volumeSize, that.volumeSize)
            && Objects.equals(this.attachment, that.attachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, sourceType, encrypted, cmkId, volumeType, volumeSize, attachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateBlockDeviceMappingOption {\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
        sb.append("    cmkId: ").append(toIndentedString(cmkId)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
        sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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
