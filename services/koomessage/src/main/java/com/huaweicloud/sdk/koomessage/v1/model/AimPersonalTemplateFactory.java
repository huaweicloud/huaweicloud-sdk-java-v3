package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 厂商。
 */
public class AimPersonalTemplateFactory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "factory_type")

    private String factoryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Integer state;

    public AimPersonalTemplateFactory withFactoryType(String factoryType) {
        this.factoryType = factoryType;
        return this;
    }

    /**
     * 厂商类型。  - HUAWEI：华为 - XIAOMI：小米 - OPPO：OPPO - VIVO：VIVO - MEIZU：魅族  > 各厂商支持的布局类型，布局类型与card_id字段相对应。 > - HUAWEI：多图文类（MultipleImageAndText）、图文类（StandardImageAndText）、长文本类（PureText）、横滑类1（Carousel）、横滑类2（CarouselTitle）、视频图文类（VideoImageAndText）、视频类（Video）、电商类（ECImageAndText）、红包类（RedPacket）、个性化红包类（RedPacketPersonal）、增强通知类（Notification2）、图片轮播类1:1（CarouselSquareImage）、图片轮播类16:9（CarouselImageSixteenToNine）、图片轮播类48:65（CarouselVerticalImage）、图文视频类（ImageTextAndVideo）、一般通知类（Notification1）、单卡券（CardVoucher）、多卡券（CardVouchers）、电商多商品类（Ecommerce）、机票类（Trip1）、火车票类（Trip2）、汽车票类（Trip3）、增强机票类（PlaneTrip）、海报类（SimplePoster）、超文本普通类（NativePureText）、超文本增强类（NativeImageAndText）、短剧视频类（ShortVideo） > - XIAOMI：多图文类（MultipleImageAndText）、图文类（StandardImageAndText）、红包类（RedPacket）、增强通知类（Notification2）、一般通知类（Notification1） > - OPPO：多图文类（MultipleImageAndText）、图文类（StandardImageAndText）、长文本类（PureText）、横滑类（Carousel）、视频类（Video）、电商类（ECImageAndText）、红包类（RedPacket）、图片轮播类1:1（CarouselSquareImage）、图片轮播类16:9（CarouselImageSixteenToNine）、图片轮播类48:65（CarouselVerticalImage） > - MEIZU：多图文类（MultipleImageAndText）、图文类（StandardImageAndText）、横滑类1（Carousel）、横滑类2（CarouselTitle） > -  VIVO：多图文类（MultipleImageAndText）、图文类（StandardImageAndText）、图片轮播类1:1（CarouselSquareImage）、图片轮播类16:9（CarouselImageSixteenToNine）、图片轮播类48:65（CarouselVerticalImage）、视频类（Video）、电商类（ECImageAndText）、红包类（RedPacket）、增强通知类（Notification2）、一般通知类（Notification1） 
     * @return factoryType
     */
    public String getFactoryType() {
        return factoryType;
    }

    public void setFactoryType(String factoryType) {
        this.factoryType = factoryType;
    }

    public AimPersonalTemplateFactory withState(Integer state) {
        this.state = state;
        return this;
    }

    /**
     * 支持状态。 - 1：支持 - 0：不支持 
     * minimum: 0
     * maximum: 1
     * @return state
     */
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AimPersonalTemplateFactory that = (AimPersonalTemplateFactory) obj;
        return Objects.equals(this.factoryType, that.factoryType) && Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factoryType, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AimPersonalTemplateFactory {\n");
        sb.append("    factoryType: ").append(toIndentedString(factoryType)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
