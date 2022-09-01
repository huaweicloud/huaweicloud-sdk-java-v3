package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 当前多画面显示信息
 */
public class MultiPicDisplayDO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manualSet")

    @JacksonXmlProperty(localName = "manualSet")

    private Integer manualSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageType")

    @JacksonXmlProperty(localName = "imageType")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriberInPics")

    @JacksonXmlProperty(localName = "subscriberInPics")

    private List<PicInfoNotify> subscriberInPics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switchTime")

    @JacksonXmlProperty(localName = "switchTime")

    private String switchTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picLayoutInfo")

    @JacksonXmlProperty(localName = "picLayoutInfo")

    private PicLayoutInfo picLayoutInfo;

    public MultiPicDisplayDO withManualSet(Integer manualSet) {
        this.manualSet = manualSet;
        return this;
    }

    /**
     * 是否为手工设置多画面 0： 系统自动多画面 1： 手工设置多画面
     * @return manualSet
     */
    public Integer getManualSet() {
        return manualSet;
    }

    public void setManualSet(Integer manualSet) {
        this.manualSet = manualSet;
    }

    public MultiPicDisplayDO withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 画面类型
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public MultiPicDisplayDO withSubscriberInPics(List<PicInfoNotify> subscriberInPics) {
        this.subscriberInPics = subscriberInPics;
        return this;
    }

    public MultiPicDisplayDO addSubscriberInPicsItem(PicInfoNotify subscriberInPicsItem) {
        if (this.subscriberInPics == null) {
            this.subscriberInPics = new ArrayList<>();
        }
        this.subscriberInPics.add(subscriberInPicsItem);
        return this;
    }

    public MultiPicDisplayDO withSubscriberInPics(Consumer<List<PicInfoNotify>> subscriberInPicsSetter) {
        if (this.subscriberInPics == null) {
            this.subscriberInPics = new ArrayList<>();
        }
        subscriberInPicsSetter.accept(this.subscriberInPics);
        return this;
    }

    /**
     * 子画面列表
     * @return subscriberInPics
     */
    public List<PicInfoNotify> getSubscriberInPics() {
        return subscriberInPics;
    }

    public void setSubscriberInPics(List<PicInfoNotify> subscriberInPics) {
        this.subscriberInPics = subscriberInPics;
    }

    public MultiPicDisplayDO withSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }

    /**
     * 表示轮询间隔，单位：秒。当同一个子画面中包含有多个视频源时，此参数有效
     * @return switchTime
     */
    public String getSwitchTime() {
        return switchTime;
    }

    public void setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
    }

    public MultiPicDisplayDO withPicLayoutInfo(PicLayoutInfo picLayoutInfo) {
        this.picLayoutInfo = picLayoutInfo;
        return this;
    }

    public MultiPicDisplayDO withPicLayoutInfo(Consumer<PicLayoutInfo> picLayoutInfoSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiPicDisplayDO multiPicDisplayDO = (MultiPicDisplayDO) o;
        return Objects.equals(this.manualSet, multiPicDisplayDO.manualSet)
            && Objects.equals(this.imageType, multiPicDisplayDO.imageType)
            && Objects.equals(this.subscriberInPics, multiPicDisplayDO.subscriberInPics)
            && Objects.equals(this.switchTime, multiPicDisplayDO.switchTime)
            && Objects.equals(this.picLayoutInfo, multiPicDisplayDO.picLayoutInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manualSet, imageType, subscriberInPics, switchTime, picLayoutInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiPicDisplayDO {\n");
        sb.append("    manualSet: ").append(toIndentedString(manualSet)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    subscriberInPics: ").append(toIndentedString(subscriberInPics)).append("\n");
        sb.append("    switchTime: ").append(toIndentedString(switchTime)).append("\n");
        sb.append("    picLayoutInfo: ").append(toIndentedString(picLayoutInfo)).append("\n");
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
