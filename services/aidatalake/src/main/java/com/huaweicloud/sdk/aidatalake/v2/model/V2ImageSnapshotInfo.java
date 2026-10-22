package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**：镜像快照信息。 
 */
public class V2ImageSnapshotInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version_id")

    private String imageVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_address")

    private String imageAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ImageSnapshotStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_snapshot_size")

    private Integer imageSnapshotSize;

    /**
     * **参数解释**：创建方式。 **约束限制**：不涉及。 **取值范围**：   - Created：直接创建。   - Associated：关联CCI已有快照。 **默认取值**：不涉及。 
     */
    public static final class CreationModeEnum {

        /**
         * Enum CREATED for value: "Created"
         */
        public static final CreationModeEnum CREATED = new CreationModeEnum("Created");

        /**
         * Enum ASSOCIATED for value: "Associated"
         */
        public static final CreationModeEnum ASSOCIATED = new CreationModeEnum("Associated");

        private static final Map<String, CreationModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CreationModeEnum> createStaticFields() {
            Map<String, CreationModeEnum> map = new HashMap<>();
            map.put("Created", CREATED);
            map.put("Associated", ASSOCIATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CreationModeEnum(String value) {
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
        public static CreationModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CreationModeEnum(value));
        }

        public static CreationModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CreationModeEnum) {
                return this.value.equals(((CreationModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_mode")

    private CreationModeEnum creationMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserved_days")

    private Integer reservedDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private OffsetDateTime expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_message")

    private String failedMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public V2ImageSnapshotInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：镜像快照记录ID。 **约束限制**：不涉及。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public V2ImageSnapshotInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：镜像ID。 **约束限制**：不涉及。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public V2ImageSnapshotInfo withImageVersionId(String imageVersionId) {
        this.imageVersionId = imageVersionId;
        return this;
    }

    /**
     * **参数解释**：镜像版本ID。 **约束限制**：不涉及。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return imageVersionId
     */
    public String getImageVersionId() {
        return imageVersionId;
    }

    public void setImageVersionId(String imageVersionId) {
        this.imageVersionId = imageVersionId;
    }

    public V2ImageSnapshotInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：镜像快照名称（用户指定）。 **约束限制**：不涉及。 **取值范围**：以小写字母开头，小写字母、数字、中划线（-）组成，小写字母或数字结尾的1到190字符的字符串。 **默认取值**：不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public V2ImageSnapshotInfo withImageAddress(String imageAddress) {
        this.imageAddress = imageAddress;
        return this;
    }

    /**
     * **参数解释**：镜像完整地址（含registry/namespace/name:version）。 **约束限制**：不涉及。 **取值范围**：支持英文字母、数字、小数点、冒号、斜杠及连字符，长度为0~1024个字符。 **默认取值**：不涉及。 
     * @return imageAddress
     */
    public String getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress;
    }

    public V2ImageSnapshotInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**：镜像名称。 **约束限制**：不涉及。 **取值范围**：支持英文字母、数字、小数点、斜杠、冒号、下划线和连字符，长度为0~128个字符。 **默认取值**：不涉及。 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public V2ImageSnapshotInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**：镜像版本。 **约束限制**：不涉及。 **取值范围**：支持英文字母、数字、小数点、冒号、下划线和连字符，长度为0~1024个字符。 **默认取值**：不涉及。 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public V2ImageSnapshotInfo withStatus(ImageSnapshotStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ImageSnapshotStatus getStatus() {
        return status;
    }

    public void setStatus(ImageSnapshotStatus status) {
        this.status = status;
    }

    public V2ImageSnapshotInfo withImageSnapshotSize(Integer imageSnapshotSize) {
        this.imageSnapshotSize = imageSnapshotSize;
        return this;
    }

    /**
     * **参数解释**：快照大小，单位GiB。 **约束限制**：不涉及。 **取值范围**：20~400。 **默认取值**：不涉及。 
     * @return imageSnapshotSize
     */
    public Integer getImageSnapshotSize() {
        return imageSnapshotSize;
    }

    public void setImageSnapshotSize(Integer imageSnapshotSize) {
        this.imageSnapshotSize = imageSnapshotSize;
    }

    public V2ImageSnapshotInfo withCreationMode(CreationModeEnum creationMode) {
        this.creationMode = creationMode;
        return this;
    }

    /**
     * **参数解释**：创建方式。 **约束限制**：不涉及。 **取值范围**：   - Created：直接创建。   - Associated：关联CCI已有快照。 **默认取值**：不涉及。 
     * @return creationMode
     */
    public CreationModeEnum getCreationMode() {
        return creationMode;
    }

    public void setCreationMode(CreationModeEnum creationMode) {
        this.creationMode = creationMode;
    }

    public V2ImageSnapshotInfo withReservedDays(Integer reservedDays) {
        this.reservedDays = reservedDays;
        return this;
    }

    /**
     * **参数解释**：镜像快照保留天数。超过保留天数自动失效，0表示永久保留。 **约束限制**：不涉及。 **取值范围**：0~65536。 **默认取值**：不涉及。 
     * @return reservedDays
     */
    public Integer getReservedDays() {
        return reservedDays;
    }

    public void setReservedDays(Integer reservedDays) {
        this.reservedDays = reservedDays;
    }

    public V2ImageSnapshotInfo withExpireTime(OffsetDateTime expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * **参数解释**：超期时间，null表示永久有效。使用UTC时间，ISO 8601格式，例如：2025-01-10T03:37:12.000+00:00。 **取值范围**：不涉及。 
     * @return expireTime
     */
    public OffsetDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(OffsetDateTime expireTime) {
        this.expireTime = expireTime;
    }

    public V2ImageSnapshotInfo withFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
        return this;
    }

    /**
     * **参数解释**：镜像快照失效的提示信息。 **约束限制**：不涉及。 **取值范围**：支持中文字符、英文字母、数字及常用符号，长度为0~65535个字符。 **默认取值**：不涉及。 
     * @return failedMessage
     */
    public String getFailedMessage() {
        return failedMessage;
    }

    public void setFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
    }

    public V2ImageSnapshotInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：资源创建时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public V2ImageSnapshotInfo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**：资源更新时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V2ImageSnapshotInfo that = (V2ImageSnapshotInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageVersionId, that.imageVersionId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.imageAddress, that.imageAddress) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.imageVersion, that.imageVersion) && Objects.equals(this.status, that.status)
            && Objects.equals(this.imageSnapshotSize, that.imageSnapshotSize)
            && Objects.equals(this.creationMode, that.creationMode)
            && Objects.equals(this.reservedDays, that.reservedDays) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.failedMessage, that.failedMessage)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            imageId,
            imageVersionId,
            name,
            imageAddress,
            imageName,
            imageVersion,
            status,
            imageSnapshotSize,
            creationMode,
            reservedDays,
            expireTime,
            failedMessage,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2ImageSnapshotInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageVersionId: ").append(toIndentedString(imageVersionId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    imageAddress: ").append(toIndentedString(imageAddress)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    imageSnapshotSize: ").append(toIndentedString(imageSnapshotSize)).append("\n");
        sb.append("    creationMode: ").append(toIndentedString(creationMode)).append("\n");
        sb.append("    reservedDays: ").append(toIndentedString(reservedDays)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    failedMessage: ").append(toIndentedString(failedMessage)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
