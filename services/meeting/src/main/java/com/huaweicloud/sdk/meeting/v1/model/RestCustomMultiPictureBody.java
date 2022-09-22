package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置自定义多画面请求。
 */
public class RestCustomMultiPictureBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manualSet")

    private Integer manualSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picLayoutInfo")

    private PicLayoutInfo picLayoutInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageType")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriberInPics")

    private List<RestSubscriberInPic> subscriberInPics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switchTime")

    private Integer switchTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multiPicSaveOnly")

    private Boolean multiPicSaveOnly;

    public RestCustomMultiPictureBody withManualSet(Integer manualSet) {
        this.manualSet = manualSet;
        return this;
    }

    /**
     * 是否为手工设置多画面。 * 0： 系统自动多画面 * 1： 手工设置多画面 
     * minimum: 0
     * maximum: 1
     * @return manualSet
     */
    public Integer getManualSet() {
        return manualSet;
    }

    public void setManualSet(Integer manualSet) {
        this.manualSet = manualSet;
    }

    public RestCustomMultiPictureBody withPicLayoutInfo(PicLayoutInfo picLayoutInfo) {
        this.picLayoutInfo = picLayoutInfo;
        return this;
    }

    public RestCustomMultiPictureBody withPicLayoutInfo(Consumer<PicLayoutInfo> picLayoutInfoSetter) {
        if (this.picLayoutInfo == null) {
            this.picLayoutInfo = new PicLayoutInfo();
            picLayoutInfoSetter.accept(this.picLayoutInfo);
        }

        return this;
    }

    /**
     * Get picLayoutInfo
     * @return picLayoutInfo
     */
    public PicLayoutInfo getPicLayoutInfo() {
        return picLayoutInfo;
    }

    public void setPicLayoutInfo(PicLayoutInfo picLayoutInfo) {
        this.picLayoutInfo = picLayoutInfo;
    }

    public RestCustomMultiPictureBody withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 画面类型。手工设置多画面时有效。 - Single: 单画面 - Two: 二画面 - Three: 三画面 - Three-2: 三画面 - Three-3: 三画面 - Three-4: 三画面 - Four: 四画面 - Four-2: 四画面 - Four-3: 四画面 - Five: 五画面 - Five-2: 五画面 - Six: 六画面 - Six-2: 六画面 - Six-3: 六画面 - Six-4: 六画面 - Six-5: 六画面 - Seven: 七画面 - Seven-2: 七画面 - Seven-3: 七画面 - Seven-4: 七画面 - Eight: 八画面 - Eight-2: 八画面 - Eight-3: 八画面 - Eight-4: 八画面 - Nine: 九画面 - Ten: 十画面 - Ten-2: 十画面 - Ten-3: 十画面 - Ten-4: 十画面 - Ten-5: 十画面 - Ten-6: 十画面 - Thirteen: 十三画面 - Thirteen-2: 十三画面 - Thirteen-3: 十三画面 - Thirteen-4: 十三画面 - Thirteen-5: 十三画面 - Sixteen: 十六画面 - Seventeen: 十七画面 - Twenty-Five: 二十五画面 
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public RestCustomMultiPictureBody withSubscriberInPics(List<RestSubscriberInPic> subscriberInPics) {
        this.subscriberInPics = subscriberInPics;
        return this;
    }

    public RestCustomMultiPictureBody addSubscriberInPicsItem(RestSubscriberInPic subscriberInPicsItem) {
        if (this.subscriberInPics == null) {
            this.subscriberInPics = new ArrayList<>();
        }
        this.subscriberInPics.add(subscriberInPicsItem);
        return this;
    }

    public RestCustomMultiPictureBody withSubscriberInPics(Consumer<List<RestSubscriberInPic>> subscriberInPicsSetter) {
        if (this.subscriberInPics == null) {
            this.subscriberInPics = new ArrayList<>();
        }
        subscriberInPicsSetter.accept(this.subscriberInPics);
        return this;
    }

    /**
     * 子画面列表（手工设置多画面时必填）。
     * @return subscriberInPics
     */
    public List<RestSubscriberInPic> getSubscriberInPics() {
        return subscriberInPics;
    }

    public void setSubscriberInPics(List<RestSubscriberInPic> subscriberInPics) {
        this.subscriberInPics = subscriberInPics;
    }

    public RestCustomMultiPictureBody withSwitchTime(Integer switchTime) {
        this.switchTime = switchTime;
        return this;
    }

    /**
     * 表示轮询间隔,取值范围：10-120，默认10。单位：秒。 当同一个子画面中包含有多个与会者时，此参数有效。 
     * minimum: 10
     * maximum: 120
     * @return switchTime
     */
    public Integer getSwitchTime() {
        return switchTime;
    }

    public void setSwitchTime(Integer switchTime) {
        this.switchTime = switchTime;
    }

    public RestCustomMultiPictureBody withMultiPicSaveOnly(Boolean multiPicSaveOnly) {
        this.multiPicSaveOnly = multiPicSaveOnly;
        return this;
    }

    /**
     * 多画面是否仅保存。 * true： 仅保存 * false： 保存并应用 > * ”仅保存“效果：仅保存当前画面布局，不进行广播等操作。 > * ”保存并应用“效果：1、当会议状态为广播多画面、声控单画面、声控多画面、主持人观看多画面时，保存并应用后，改变画面布局，不改变状态。2、当会议状态为非广播多画面、声控单画面、声控多画面、主持人观看多画面时，如自动多画面、广播与会者、点名与会者时，保存并应用后，变为广播多画面。 > * 当处于广播多画面、声控多画面、声控单画面状态下，无法设置主持人观看多画面。 
     * @return multiPicSaveOnly
     */
    public Boolean getMultiPicSaveOnly() {
        return multiPicSaveOnly;
    }

    public void setMultiPicSaveOnly(Boolean multiPicSaveOnly) {
        this.multiPicSaveOnly = multiPicSaveOnly;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestCustomMultiPictureBody restCustomMultiPictureBody = (RestCustomMultiPictureBody) o;
        return Objects.equals(this.manualSet, restCustomMultiPictureBody.manualSet)
            && Objects.equals(this.picLayoutInfo, restCustomMultiPictureBody.picLayoutInfo)
            && Objects.equals(this.imageType, restCustomMultiPictureBody.imageType)
            && Objects.equals(this.subscriberInPics, restCustomMultiPictureBody.subscriberInPics)
            && Objects.equals(this.switchTime, restCustomMultiPictureBody.switchTime)
            && Objects.equals(this.multiPicSaveOnly, restCustomMultiPictureBody.multiPicSaveOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manualSet, picLayoutInfo, imageType, subscriberInPics, switchTime, multiPicSaveOnly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestCustomMultiPictureBody {\n");
        sb.append("    manualSet: ").append(toIndentedString(manualSet)).append("\n");
        sb.append("    picLayoutInfo: ").append(toIndentedString(picLayoutInfo)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    subscriberInPics: ").append(toIndentedString(subscriberInPics)).append("\n");
        sb.append("    switchTime: ").append(toIndentedString(switchTime)).append("\n");
        sb.append("    multiPicSaveOnly: ").append(toIndentedString(multiPicSaveOnly)).append("\n");
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
