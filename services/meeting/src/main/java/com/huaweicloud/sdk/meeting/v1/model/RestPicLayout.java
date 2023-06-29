package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 多画面布局。
 */
public class RestPicLayout {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switchTime")

    private Integer switchTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picNum")

    private Integer picNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layOutName")

    private String layOutName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageType")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriberInPics")

    private List<PicInfoNotify> subscriberInPics = null;

    public RestPicLayout withSwitchTime(Integer switchTime) {
        this.switchTime = switchTime;
        return this;
    }

    /**
     * 多画面轮询时间，单位秒。
     * minimum: 10
     * @return switchTime
     */
    public Integer getSwitchTime() {
        return switchTime;
    }

    public void setSwitchTime(Integer switchTime) {
        this.switchTime = switchTime;
    }

    public RestPicLayout withPicNum(Integer picNum) {
        this.picNum = picNum;
        return this;
    }

    /**
     * 多画面画面数量。
     * minimum: 1
     * @return picNum
     */
    public Integer getPicNum() {
        return picNum;
    }

    public void setPicNum(Integer picNum) {
        this.picNum = picNum;
    }

    public RestPicLayout withLayOutName(String layOutName) {
        this.layOutName = layOutName;
        return this;
    }

    /**
     * 多画面布局名称。
     * @return layOutName
     */
    public String getLayOutName() {
        return layOutName;
    }

    public void setLayOutName(String layOutName) {
        this.layOutName = layOutName;
    }

    public RestPicLayout withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 画面类型。
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public RestPicLayout withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 布局UUID。
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public RestPicLayout withSubscriberInPics(List<PicInfoNotify> subscriberInPics) {
        this.subscriberInPics = subscriberInPics;
        return this;
    }

    public RestPicLayout addSubscriberInPicsItem(PicInfoNotify subscriberInPicsItem) {
        if (this.subscriberInPics == null) {
            this.subscriberInPics = new ArrayList<>();
        }
        this.subscriberInPics.add(subscriberInPicsItem);
        return this;
    }

    public RestPicLayout withSubscriberInPics(Consumer<List<PicInfoNotify>> subscriberInPicsSetter) {
        if (this.subscriberInPics == null) {
            this.subscriberInPics = new ArrayList<>();
        }
        subscriberInPicsSetter.accept(this.subscriberInPics);
        return this;
    }

    /**
     * 子画面列表。
     * @return subscriberInPics
     */
    public List<PicInfoNotify> getSubscriberInPics() {
        return subscriberInPics;
    }

    public void setSubscriberInPics(List<PicInfoNotify> subscriberInPics) {
        this.subscriberInPics = subscriberInPics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestPicLayout that = (RestPicLayout) obj;
        return Objects.equals(this.switchTime, that.switchTime) && Objects.equals(this.picNum, that.picNum)
            && Objects.equals(this.layOutName, that.layOutName) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.uuid, that.uuid) && Objects.equals(this.subscriberInPics, that.subscriberInPics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchTime, picNum, layOutName, imageType, uuid, subscriberInPics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestPicLayout {\n");
        sb.append("    switchTime: ").append(toIndentedString(switchTime)).append("\n");
        sb.append("    picNum: ").append(toIndentedString(picNum)).append("\n");
        sb.append("    layOutName: ").append(toIndentedString(layOutName)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    subscriberInPics: ").append(toIndentedString(subscriberInPics)).append("\n");
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
