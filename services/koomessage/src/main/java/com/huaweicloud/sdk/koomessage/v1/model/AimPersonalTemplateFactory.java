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
     * 厂商类型。暂不支持VIVO。  - HUAWEI：华为 - XIAOMI：小米 - OPPO：OPPO - VIVO：VIVO - MEIZU：魅族  > 各厂商支持的布局类型，布局类型与card_id字段相对应。 > - HUAWEI：多图文类（MultipleImageAndText）、图文类（StandardImageAndText）、长文本类（PureText）、横滑类1（Carousel）、横滑类2（CarouselTitle）、视频图文类（VideoImageAndText）、视频类（Video）、电商类（ECImageAndText）、红包类（RedPacket）、个性化红包类（RedPacketPersonal）、增强通知类（Notification2）、图片轮播类1:1（CarouselSquareImage）、图片轮播类16:9（CarouselImageSixteenToNine）、图片轮播类48:65（CarouselVerticalImage）、图文视频类（ImageTextAndVideo）、一般通知类（Notification1）、单卡券（CardVoucher）、多卡券（CardVouchers） > - XIAOMI：多图文类（MultipleImageAndText）、图文类（StandardImageAndText）、红包类（RedPacket）、增强通知类（Notification2）、一般通知类（Notification1） > - OPPO：多图文类（MultipleImageAndText）、图文类（StandardImageAndText）、长文本类（PureText）、横滑类（Carousel）、视频类（Video）、电商类（ECImageAndText）、红包类（RedPacket）、图片轮播类1:1（CarouselSquareImage）、图片轮播类16:9（CarouselImageSixteenToNine）、图片轮播类48:65（CarouselVerticalImage） > - MEIZU：多图文类（MultipleImageAndText）、图文类（StandardImageAndText）、横滑类1（Carousel）、横滑类2（CarouselTitle） 
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AimPersonalTemplateFactory aimPersonalTemplateFactory = (AimPersonalTemplateFactory) o;
        return Objects.equals(this.factoryType, aimPersonalTemplateFactory.factoryType)
            && Objects.equals(this.state, aimPersonalTemplateFactory.state);
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
