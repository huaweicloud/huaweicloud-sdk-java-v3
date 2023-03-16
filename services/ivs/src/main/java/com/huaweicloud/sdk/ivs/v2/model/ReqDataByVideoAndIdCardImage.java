package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ReqDataByVideoAndIdCardImage
 */
public class ReqDataByVideoAndIdCardImage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idcard_image1")

    private String idcardImage1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idcard_image2")

    private String idcardImage2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video")

    private String video;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private String actions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nod_threshold")

    private Double nodThreshold;

    public ReqDataByVideoAndIdCardImage withIdcardImage1(String idcardImage1) {
        this.idcardImage1 = idcardImage1;
        return this;
    }

    /**
     * 身份证人像面图像数据，使用base64编码，要求base64编码后大小不超过4M。图像各边的像素大小在300到4000之间，支持JPG格式。
     * @return idcardImage1
     */
    public String getIdcardImage1() {
        return idcardImage1;
    }

    public void setIdcardImage1(String idcardImage1) {
        this.idcardImage1 = idcardImage1;
    }

    public ReqDataByVideoAndIdCardImage withIdcardImage2(String idcardImage2) {
        this.idcardImage2 = idcardImage2;
        return this;
    }

    /**
     * 身份证国徽面图像数据，使用base64编码，要求base64编码后大小不超过4M。图像各边的像素大小在300到4000之间，支持JPG格式。
     * @return idcardImage2
     */
    public String getIdcardImage2() {
        return idcardImage2;
    }

    public void setIdcardImage2(String idcardImage2) {
        this.idcardImage2 = idcardImage2;
    }

    public ReqDataByVideoAndIdCardImage withVideo(String video) {
        this.video = video;
        return this;
    }

    /**
     * 现场拍摄人像视频数据，使用base64编码，要求base64编码后大小不超过10M。
     * @return video
     */
    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public ReqDataByVideoAndIdCardImage withActions(String actions) {
        this.actions = actions;
        return this;
    }

    /**
     * 动作代码顺序列表，英文逗号（,）分隔。建议单动作，目前支持的动作有： • 1：左摇头 • 2：右摇头 • 3：点头 • 4：嘴部动作
     * @return actions
     */
    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public ReqDataByVideoAndIdCardImage withNodThreshold(Double nodThreshold) {
        this.nodThreshold = nodThreshold;
        return this;
    }

    /**
     * 该参数为点头动作幅度的判断门限，取值范围：[1,90]，默认为10，单位为度。该值设置越大，则越难判断为点头。
     * @return nodThreshold
     */
    public Double getNodThreshold() {
        return nodThreshold;
    }

    public void setNodThreshold(Double nodThreshold) {
        this.nodThreshold = nodThreshold;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReqDataByVideoAndIdCardImage reqDataByVideoAndIdCardImage = (ReqDataByVideoAndIdCardImage) o;
        return Objects.equals(this.idcardImage1, reqDataByVideoAndIdCardImage.idcardImage1)
            && Objects.equals(this.idcardImage2, reqDataByVideoAndIdCardImage.idcardImage2)
            && Objects.equals(this.video, reqDataByVideoAndIdCardImage.video)
            && Objects.equals(this.actions, reqDataByVideoAndIdCardImage.actions)
            && Objects.equals(this.nodThreshold, reqDataByVideoAndIdCardImage.nodThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcardImage1, idcardImage2, video, actions, nodThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqDataByVideoAndIdCardImage {\n");
        sb.append("    idcardImage1: ").append(toIndentedString(idcardImage1)).append("\n");
        sb.append("    idcardImage2: ").append(toIndentedString(idcardImage2)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    nodThreshold: ").append(toIndentedString(nodThreshold)).append("\n");
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
