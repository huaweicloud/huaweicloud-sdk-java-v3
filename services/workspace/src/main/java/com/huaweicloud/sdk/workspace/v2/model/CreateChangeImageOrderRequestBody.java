package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_spec_code")

    private String imageSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_time")

    private Integer delayTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

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
     * 包周期桌面ID列表。 不可同时存在普通桌面和池桌面ID。
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
            && Objects.equals(this.imageSpecCode, that.imageSpecCode) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.delayTime, that.delayTime) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopPoolId, desktopIds, promotionPlanId, imageSpecCode, imageId, delayTime, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChangeImageOrderRequestBody {\n");
        sb.append("    desktopPoolId: ").append(toIndentedString(desktopPoolId)).append("\n");
        sb.append("    desktopIds: ").append(toIndentedString(desktopIds)).append("\n");
        sb.append("    promotionPlanId: ").append(toIndentedString(promotionPlanId)).append("\n");
        sb.append("    imageSpecCode: ").append(toIndentedString(imageSpecCode)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    delayTime: ").append(toIndentedString(delayTime)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
