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
 * 包周期重建系统盘询价请求体。
 */
public class CreateChangeImageOrderRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_id")

    private String desktopPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_ids")

    private List<String> desktopIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_plan_id")

    private String promotionPlanId;

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
    @JsonProperty(value = "image_spec_code")

    private String imageSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_time")

    private Integer delayTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt_type")

    private EncryptType encryptType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_id")

    private String kmsId;

    public CreateChangeImageOrderRequestBody withDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
        return this;
    }

    /**
     * 桌面池ID。当desktop_pool_id与desktop_ids同时存在时，取desktop_ids的值，两者不可同时为空。
     * @return desktopPoolId
     */
    public String getDesktopPoolId() {
        return desktopPoolId;
    }

    public void setDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
    }

    public CreateChangeImageOrderRequestBody withDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }

    public CreateChangeImageOrderRequestBody addDesktopIdsItem(String desktopIdsItem) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        this.desktopIds.add(desktopIdsItem);
        return this;
    }

    public CreateChangeImageOrderRequestBody withDesktopIds(Consumer<List<String>> desktopIdsSetter) {
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

    public CreateChangeImageOrderRequestBody withPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
        return this;
    }

    /**
     * 促销计划ID。
     * @return promotionPlanId
     */
    public String getPromotionPlanId() {
        return promotionPlanId;
    }

    public void setPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
    }

    public CreateChangeImageOrderRequestBody withHandleType(HandleTypeEnum handleType) {
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

    public CreateChangeImageOrderRequestBody withImageSpecCode(String imageSpecCode) {
        this.imageSpecCode = imageSpecCode;
        return this;
    }

    /**
     * 云市场镜像的specCode，即将停用。image_spec_code与image_id同时存在时取image_id的值，两者不可同时为空。
     * @return imageSpecCode
     */
    public String getImageSpecCode() {
        return imageSpecCode;
    }

    public void setImageSpecCode(String imageSpecCode) {
        this.imageSpecCode = imageSpecCode;
    }

    public CreateChangeImageOrderRequestBody withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 云市场镜像ID，建议使用image_id。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public CreateChangeImageOrderRequestBody withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型。仅重建系统盘/更换镜像使用  - private：私有镜像。 - gold：公共镜像。
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public CreateChangeImageOrderRequestBody withDelayTime(Integer delayTime) {
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

    public CreateChangeImageOrderRequestBody withMessage(String message) {
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

    public CreateChangeImageOrderRequestBody withEncryptType(EncryptType encryptType) {
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

    public CreateChangeImageOrderRequestBody withKmsId(String kmsId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateChangeImageOrderRequestBody that = (CreateChangeImageOrderRequestBody) obj;
        return Objects.equals(this.desktopPoolId, that.desktopPoolId)
            && Objects.equals(this.desktopIds, that.desktopIds)
            && Objects.equals(this.promotionPlanId, that.promotionPlanId)
            && Objects.equals(this.handleType, that.handleType)
            && Objects.equals(this.imageSpecCode, that.imageSpecCode) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.delayTime, that.delayTime)
            && Objects.equals(this.message, that.message) && Objects.equals(this.encryptType, that.encryptType)
            && Objects.equals(this.kmsId, that.kmsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopPoolId,
            desktopIds,
            promotionPlanId,
            handleType,
            imageSpecCode,
            imageId,
            imageType,
            delayTime,
            message,
            encryptType,
            kmsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChangeImageOrderRequestBody {\n");
        sb.append("    desktopPoolId: ").append(toIndentedString(desktopPoolId)).append("\n");
        sb.append("    desktopIds: ").append(toIndentedString(desktopIds)).append("\n");
        sb.append("    promotionPlanId: ").append(toIndentedString(promotionPlanId)).append("\n");
        sb.append("    handleType: ").append(toIndentedString(handleType)).append("\n");
        sb.append("    imageSpecCode: ").append(toIndentedString(imageSpecCode)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    delayTime: ").append(toIndentedString(delayTime)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    encryptType: ").append(toIndentedString(encryptType)).append("\n");
        sb.append("    kmsId: ").append(toIndentedString(kmsId)).append("\n");
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
