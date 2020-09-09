package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.SubscriberInPic;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 设置多画面消息体。
 */
public class RestMixedPictureBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="manualSet")
    
    private Integer manualSet;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="imageType")
    
    private String imageType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subscriberInPics")
    
    private List<SubscriberInPic> subscriberInPics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="switchTime")
    
    private Integer switchTime;

    public RestMixedPictureBody withManualSet(Integer manualSet) {
        this.manualSet = manualSet;
        return this;
    }

    


    /**
     * 是否为手工设置多画面。 - 0: 系统自动多画面。 - 1: 手工设置多画面。
     * @return manualSet
     */
    public Integer getManualSet() {
        return manualSet;
    }

    public void setManualSet(Integer manualSet) {
        this.manualSet = manualSet;
    }

    public RestMixedPictureBody withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    


    /**
     * 多画面数目。手工设置多画面时有效。 - Single: 单画面。 - Two: 二画面。 - Three: 三画面。 - Four: 四画面。 - Six: 六画面。 - Nine: 九画面。 - Sixteen: 十六画面。
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public RestMixedPictureBody withSubscriberInPics(List<SubscriberInPic> subscriberInPics) {
        this.subscriberInPics = subscriberInPics;
        return this;
    }

    
    public RestMixedPictureBody addSubscriberInPicsItem(SubscriberInPic subscriberInPicsItem) {
        if (this.subscriberInPics == null) {
            this.subscriberInPics = new ArrayList<>();
        }
        this.subscriberInPics.add(subscriberInPicsItem);
        return this;
    }

    public RestMixedPictureBody withSubscriberInPics(Consumer<List<SubscriberInPic>> subscriberInPicsSetter) {
        if(this.subscriberInPics == null ){
            this.subscriberInPics = new ArrayList<>();
        }
        subscriberInPicsSetter.accept(this.subscriberInPics);
        return this;
    }

    /**
     * 子画面列表（手工设置多画面时必填）。
     * @return subscriberInPics
     */
    public List<SubscriberInPic> getSubscriberInPics() {
        return subscriberInPics;
    }

    public void setSubscriberInPics(List<SubscriberInPic> subscriberInPics) {
        this.subscriberInPics = subscriberInPics;
    }

    public RestMixedPictureBody withSwitchTime(Integer switchTime) {
        this.switchTime = switchTime;
        return this;
    }

    


    /**
     * 表示轮询间隔。单位：秒。 当同一个子画面中包含有多个与会者时，此参数有效。
     * @return switchTime
     */
    public Integer getSwitchTime() {
        return switchTime;
    }

    public void setSwitchTime(Integer switchTime) {
        this.switchTime = switchTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestMixedPictureBody restMixedPictureBody = (RestMixedPictureBody) o;
        return Objects.equals(this.manualSet, restMixedPictureBody.manualSet) &&
            Objects.equals(this.imageType, restMixedPictureBody.imageType) &&
            Objects.equals(this.subscriberInPics, restMixedPictureBody.subscriberInPics) &&
            Objects.equals(this.switchTime, restMixedPictureBody.switchTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(manualSet, imageType, subscriberInPics, switchTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestMixedPictureBody {\n");
        sb.append("    manualSet: ").append(toIndentedString(manualSet)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    subscriberInPics: ").append(toIndentedString(subscriberInPics)).append("\n");
        sb.append("    switchTime: ").append(toIndentedString(switchTime)).append("\n");
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

