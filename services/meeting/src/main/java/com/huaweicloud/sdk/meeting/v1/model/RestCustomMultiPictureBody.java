package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 切换会议显示策略请求体 */
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

    /** 是否为手工设置多画面： 0： 系统自动多画面 1： 手工设置多画面 minimum: 0 maximum: 1
     * 
     * @return manualSet */
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

    /** Get picLayoutInfo
     * 
     * @return picLayoutInfo */
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

    /** 画面类型
     * 
     * @return imageType */
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

    /** 子画面列表
     * 
     * @return subscriberInPics */
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

    /** 表示轮询间隔，单位：秒。 当同一个子画面中包含有多个视频源时，此参数有效 minimum: 10 maximum: 120
     * 
     * @return switchTime */
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

    /** 多画面仅保存
     * 
     * @return multiPicSaveOnly */
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
