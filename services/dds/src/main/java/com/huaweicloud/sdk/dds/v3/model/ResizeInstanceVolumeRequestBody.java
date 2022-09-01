package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResizeInstanceVolumeRequestBody
 */
public class ResizeInstanceVolumeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    @JacksonXmlProperty(localName = "volume")

    private ResizeInstanceVolumeOption volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    @JacksonXmlProperty(localName = "is_auto_pay")

    private Boolean isAutoPay;

    public ResizeInstanceVolumeRequestBody withVolume(ResizeInstanceVolumeOption volume) {
        this.volume = volume;
        return this;
    }

    public ResizeInstanceVolumeRequestBody withVolume(Consumer<ResizeInstanceVolumeOption> volumeSetter) {
        if (this.volume == null) {
            this.volume = new ResizeInstanceVolumeOption();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public ResizeInstanceVolumeOption getVolume() {
        return volume;
    }

    public void setVolume(ResizeInstanceVolumeOption volume) {
        this.volume = volume;
    }

    public ResizeInstanceVolumeRequestBody withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 扩容包年包月实例的存储容量时可指定，表示是否自动从账户中支付，此字段不影响自动续订的支付方式。 - true，表示自动从账户中支付。 - false，表示手动从账户中支付，默认为该方式。
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeInstanceVolumeRequestBody resizeInstanceVolumeRequestBody = (ResizeInstanceVolumeRequestBody) o;
        return Objects.equals(this.volume, resizeInstanceVolumeRequestBody.volume)
            && Objects.equals(this.isAutoPay, resizeInstanceVolumeRequestBody.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeInstanceVolumeRequestBody {\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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
