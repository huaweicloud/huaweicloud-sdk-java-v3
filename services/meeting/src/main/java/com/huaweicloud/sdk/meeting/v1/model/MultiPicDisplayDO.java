package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 多画面显示信息。
 */
public class MultiPicDisplayDO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manualSet")

    private Integer manualSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageType")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriberInPics")

    private List<PicInfoNotify> subscriberInPics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switchTime")

    private String switchTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picLayoutInfo")

    private PicLayoutInfo picLayoutInfo;

    public MultiPicDisplayDO withManualSet(Integer manualSet) {
        this.manualSet = manualSet;
        return this;
    }

    /**
     * 是否为手工设置多画面。 * 0 ：系统自动多画面 * 1 ：手工设置多画面 
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
     * 画面类型。取值范围: * Single: 单画面 * Two: 二画面 * Three: 三画面， Three-2: 三画面-2， Three-3: 三画面-3， Three-4: 三画面-4 * Four: 四画面， Four-2: 四画面-2， Four-3: 四画面-3 * Five: 五画面， Five-2: 五画面-2 * Six: 六画面， Six-2: 六画面-2， Six-3: 六画面-3， Six-4: 六画面-4， Six-5: 六画面-5 * Seven: 七画面， Seven-2: 七画面-2， Seven-3: 七画面-3， Seven-4: 七画面-4 * Eight: 八画面， Eight-2: 八画面-2， Eight-3: 八画面-3， Eight-4: 八画面-4 * Nine: 九画面 * Ten: 十画面， Ten-2: 十画面-2， Ten-3: 十画面-3， Ten-4: 十画面-4， Ten-5: 十画面-5， Ten-6: 十画面-6 * Thirteen: 十三画面， Thirteen-2: 十三画面-2， Thirteen-3: 十三画面-3，Thirteen-4: 十三画面-4， Thirteen-5: 十三画面-5， ThirteenR: 十三画面R， ThirteenM: 十三画面M * Sixteen: 十六画面 * Seventeen: 十七画面 * Twenty-Five: 二十五画面 * Custom: 自定义多画面（当前不支持） 
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
     * 子画面列表。
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
     * 表示轮询间隔，单位：秒。当同一个子画面中包含有多个视频源时，此参数有效。
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
