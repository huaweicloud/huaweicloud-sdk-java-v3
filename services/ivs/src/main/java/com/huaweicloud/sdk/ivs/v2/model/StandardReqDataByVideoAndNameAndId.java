package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StandardReqDataByVideoAndNameAndId
 */
public class StandardReqDataByVideoAndNameAndId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_name")

    private String verificationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_id")

    private String verificationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video")

    private String video;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private String actions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nod_threshold")

    private Double nodThreshold;

    public StandardReqDataByVideoAndNameAndId withVerificationName(String verificationName) {
        this.verificationName = verificationName;
        return this;
    }

    /**
     * 被验证人的姓名。
     * @return verificationName
     */
    public String getVerificationName() {
        return verificationName;
    }

    public void setVerificationName(String verificationName) {
        this.verificationName = verificationName;
    }

    public StandardReqDataByVideoAndNameAndId withVerificationId(String verificationId) {
        this.verificationId = verificationId;
        return this;
    }

    /**
     * 被验证人的身份证号码。
     * @return verificationId
     */
    public String getVerificationId() {
        return verificationId;
    }

    public void setVerificationId(String verificationId) {
        this.verificationId = verificationId;
    }

    public StandardReqDataByVideoAndNameAndId withVideo(String video) {
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

    public StandardReqDataByVideoAndNameAndId withActions(String actions) {
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

    public StandardReqDataByVideoAndNameAndId withNodThreshold(Double nodThreshold) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StandardReqDataByVideoAndNameAndId that = (StandardReqDataByVideoAndNameAndId) obj;
        return Objects.equals(this.verificationName, that.verificationName)
            && Objects.equals(this.verificationId, that.verificationId) && Objects.equals(this.video, that.video)
            && Objects.equals(this.actions, that.actions) && Objects.equals(this.nodThreshold, that.nodThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verificationName, verificationId, video, actions, nodThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardReqDataByVideoAndNameAndId {\n");
        sb.append("    verificationName: ").append(toIndentedString(verificationName)).append("\n");
        sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
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
