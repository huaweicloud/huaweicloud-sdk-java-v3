package com.huaweicloud.sdk.workspace.v2.model;

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
 * 重建系统盘的请求。
 */
public class RebuildDesktopPoolReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_time")

    private Integer delayTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_fix")

    private Boolean isFix;

    /**
     * 处理类型 - ONLY_FOR_EXPAND：仅对新扩容桌面生效 - FOR_EXPAND_AND_IDLE：对新扩容桌面与空闲桌面生效 - FOR_EXPAND_AND_ALL：对新扩容桌面与已有全部桌面生效
     */
    public static final class HandleTypeEnum {

        /**
         * Enum ONLY_FOR_EXPAND for value: "ONLY_FOR_EXPAND"
         */
        public static final HandleTypeEnum ONLY_FOR_EXPAND = new HandleTypeEnum("ONLY_FOR_EXPAND");

        /**
         * Enum FOR_EXPAND_AND_IDLE for value: "FOR_EXPAND_AND_IDLE"
         */
        public static final HandleTypeEnum FOR_EXPAND_AND_IDLE = new HandleTypeEnum("FOR_EXPAND_AND_IDLE");

        /**
         * Enum FOR_EXPAND_AND_ALL for value: "FOR_EXPAND_AND_ALL"
         */
        public static final HandleTypeEnum FOR_EXPAND_AND_ALL = new HandleTypeEnum("FOR_EXPAND_AND_ALL");

        private static final Map<String, HandleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HandleTypeEnum> createStaticFields() {
            Map<String, HandleTypeEnum> map = new HashMap<>();
            map.put("ONLY_FOR_EXPAND", ONLY_FOR_EXPAND);
            map.put("FOR_EXPAND_AND_IDLE", FOR_EXPAND_AND_IDLE);
            map.put("FOR_EXPAND_AND_ALL", FOR_EXPAND_AND_ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HandleTypeEnum(String value) {
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
        public static HandleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HandleTypeEnum(value));
        }

        public static HandleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HandleTypeEnum) {
                return this.value.equals(((HandleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_type")

    private HandleTypeEnum handleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt_type")

    private EncryptType encryptType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_id")

    private String kmsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_ids")

    private List<String> desktopIds = null;

    public RebuildDesktopPoolReq withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型。
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public RebuildDesktopPoolReq withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 模板ID。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public RebuildDesktopPoolReq withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * os类型。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public RebuildDesktopPoolReq withDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }

    /**
     * 立即重建时给用户预留的保存数据的时间（单位：分钟）。
     * minimum: 0
     * maximum: 15
     * @return delayTime
     */
    public Integer getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    public RebuildDesktopPoolReq withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 下发重建系统盘任务时，给用户发送的提示信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RebuildDesktopPoolReq withIsFix(Boolean isFix) {
        this.isFix = isFix;
        return this;
    }

    /**
     * 是否是修复行为，修复行为只修复镜像ID与桌面池镜像ID不一致的桌面，用于桌面池切换镜像失败场景的修复。
     * @return isFix
     */
    public Boolean getIsFix() {
        return isFix;
    }

    public void setIsFix(Boolean isFix) {
        this.isFix = isFix;
    }

    public RebuildDesktopPoolReq withHandleType(HandleTypeEnum handleType) {
        this.handleType = handleType;
        return this;
    }

    /**
     * 处理类型 - ONLY_FOR_EXPAND：仅对新扩容桌面生效 - FOR_EXPAND_AND_IDLE：对新扩容桌面与空闲桌面生效 - FOR_EXPAND_AND_ALL：对新扩容桌面与已有全部桌面生效
     * @return handleType
     */
    public HandleTypeEnum getHandleType() {
        return handleType;
    }

    public void setHandleType(HandleTypeEnum handleType) {
        this.handleType = handleType;
    }

    public RebuildDesktopPoolReq withEncryptType(EncryptType encryptType) {
        this.encryptType = encryptType;
        return this;
    }

    /**
     * Get encryptType
     * @return encryptType
     */
    public EncryptType getEncryptType() {
        return encryptType;
    }

    public void setEncryptType(EncryptType encryptType) {
        this.encryptType = encryptType;
    }

    public RebuildDesktopPoolReq withKmsId(String kmsId) {
        this.kmsId = kmsId;
        return this;
    }

    /**
     * 密钥ID，encrypt_type为ENCRYPTED时必传。
     * @return kmsId
     */
    public String getKmsId() {
        return kmsId;
    }

    public void setKmsId(String kmsId) {
        this.kmsId = kmsId;
    }

    public RebuildDesktopPoolReq withDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }

    public RebuildDesktopPoolReq addDesktopIdsItem(String desktopIdsItem) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        this.desktopIds.add(desktopIdsItem);
        return this;
    }

    public RebuildDesktopPoolReq withDesktopIds(Consumer<List<String>> desktopIdsSetter) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        desktopIdsSetter.accept(this.desktopIds);
        return this;
    }

    /**
     * 桌面id
     * @return desktopIds
     */
    public List<String> getDesktopIds() {
        return desktopIds;
    }

    public void setDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RebuildDesktopPoolReq that = (RebuildDesktopPoolReq) obj;
        return Objects.equals(this.imageType, that.imageType) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.delayTime, that.delayTime)
            && Objects.equals(this.message, that.message) && Objects.equals(this.isFix, that.isFix)
            && Objects.equals(this.handleType, that.handleType) && Objects.equals(this.encryptType, that.encryptType)
            && Objects.equals(this.kmsId, that.kmsId) && Objects.equals(this.desktopIds, that.desktopIds);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(imageType, imageId, osType, delayTime, message, isFix, handleType, encryptType, kmsId, desktopIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RebuildDesktopPoolReq {\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    delayTime: ").append(toIndentedString(delayTime)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    isFix: ").append(toIndentedString(isFix)).append("\n");
        sb.append("    handleType: ").append(toIndentedString(handleType)).append("\n");
        sb.append("    encryptType: ").append(toIndentedString(encryptType)).append("\n");
        sb.append("    kmsId: ").append(toIndentedString(kmsId)).append("\n");
        sb.append("    desktopIds: ").append(toIndentedString(desktopIds)).append("\n");
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
