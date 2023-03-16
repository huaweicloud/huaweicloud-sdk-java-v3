package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * StandardRespDataByVideoAndNameAndId
 */
public class StandardRespDataByVideoAndNameAndId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_result")

    private String verificationResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_message")

    private String verificationMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_code")

    private Integer verificationCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "similarity")

    private String similarity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_result")

    private VideoResult videoResult;

    public StandardRespDataByVideoAndNameAndId withVerificationResult(String verificationResult) {
        this.verificationResult = verificationResult;
        return this;
    }

    /**
     * 审核校验结果： \"valid\"表示身份审核通过； \"invalid\"表示身份审核不通过； \"nonexistent\"表示数据源没有该身份证号码，这种情况一般是被验证人正在办理户籍迁移，或者被验证人是军人或政要。
     * @return verificationResult
     */
    public String getVerificationResult() {
        return verificationResult;
    }

    public void setVerificationResult(String verificationResult) {
        this.verificationResult = verificationResult;
    }

    public StandardRespDataByVideoAndNameAndId withVerificationMessage(String verificationMessage) {
        this.verificationMessage = verificationMessage;
        return this;
    }

    /**
     * 审核校验信息，具体参考[校验信息说明](https://support.huaweicloud.com/api-ivs/ivs_02_0017.html)
     * @return verificationMessage
     */
    public String getVerificationMessage() {
        return verificationMessage;
    }

    public void setVerificationMessage(String verificationMessage) {
        this.verificationMessage = verificationMessage;
    }

    public StandardRespDataByVideoAndNameAndId withVerificationCode(Integer verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    /**
     * 审核校验代码，具体参考[校验信息说明](https://support.huaweicloud.com/api-ivs/ivs_02_0017.html)
     * @return verificationCode
     */
    public Integer getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(Integer verificationCode) {
        this.verificationCode = verificationCode;
    }

    public StandardRespDataByVideoAndNameAndId withSimilarity(String similarity) {
        this.similarity = similarity;
        return this;
    }

    /**
     * 人像相识度。取值范围[0,100]
     * @return similarity
     */
    public String getSimilarity() {
        return similarity;
    }

    public void setSimilarity(String similarity) {
        this.similarity = similarity;
    }

    public StandardRespDataByVideoAndNameAndId withVideoResult(VideoResult videoResult) {
        this.videoResult = videoResult;
        return this;
    }

    public StandardRespDataByVideoAndNameAndId withVideoResult(Consumer<VideoResult> videoResultSetter) {
        if (this.videoResult == null) {
            this.videoResult = new VideoResult();
            videoResultSetter.accept(this.videoResult);
        }

        return this;
    }

    /**
     * Get videoResult
     * @return videoResult
     */
    public VideoResult getVideoResult() {
        return videoResult;
    }

    public void setVideoResult(VideoResult videoResult) {
        this.videoResult = videoResult;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardRespDataByVideoAndNameAndId standardRespDataByVideoAndNameAndId =
            (StandardRespDataByVideoAndNameAndId) o;
        return Objects.equals(this.verificationResult, standardRespDataByVideoAndNameAndId.verificationResult)
            && Objects.equals(this.verificationMessage, standardRespDataByVideoAndNameAndId.verificationMessage)
            && Objects.equals(this.verificationCode, standardRespDataByVideoAndNameAndId.verificationCode)
            && Objects.equals(this.similarity, standardRespDataByVideoAndNameAndId.similarity)
            && Objects.equals(this.videoResult, standardRespDataByVideoAndNameAndId.videoResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verificationResult, verificationMessage, verificationCode, similarity, videoResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardRespDataByVideoAndNameAndId {\n");
        sb.append("    verificationResult: ").append(toIndentedString(verificationResult)).append("\n");
        sb.append("    verificationMessage: ").append(toIndentedString(verificationMessage)).append("\n");
        sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
        sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
        sb.append("    videoResult: ").append(toIndentedString(videoResult)).append("\n");
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
