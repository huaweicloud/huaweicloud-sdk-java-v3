package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class Create2dModelTrainingJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "training_video_upload_url")

    private List<String> trainingVideoUploadUrl = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_video_upload_url")

    private List<String> actionVideoUploadUrl = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_upload_url")

    private String audioUploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover_upload_url")

    private String coverUploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_card_image1_upload_url")

    private String idCardImage1UploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_card_image2_upload_url")

    private String idCardImage2UploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_file_upload_url")

    private String grantFileUploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_beauty_image_upload_url")

    private String preBeautyImageUploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "post_beauty_image_upload_url")

    private String postBeautyImageUploadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public Create2dModelTrainingJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Create2dModelTrainingJobResponse withTrainingVideoUploadUrl(List<String> trainingVideoUploadUrl) {
        this.trainingVideoUploadUrl = trainingVideoUploadUrl;
        return this;
    }

    public Create2dModelTrainingJobResponse addTrainingVideoUploadUrlItem(String trainingVideoUploadUrlItem) {
        if (this.trainingVideoUploadUrl == null) {
            this.trainingVideoUploadUrl = new ArrayList<>();
        }
        this.trainingVideoUploadUrl.add(trainingVideoUploadUrlItem);
        return this;
    }

    public Create2dModelTrainingJobResponse withTrainingVideoUploadUrl(
        Consumer<List<String>> trainingVideoUploadUrlSetter) {
        if (this.trainingVideoUploadUrl == null) {
            this.trainingVideoUploadUrl = new ArrayList<>();
        }
        trainingVideoUploadUrlSetter.accept(this.trainingVideoUploadUrl);
        return this;
    }

    /**
     * 分身数字人训练视频上传URL。该url在文件上传成功后失效，只能上传一次。注意：视频必须是1080p或者4K分辨率（横、竖屏皆可）的mp4格式，视频长度须大于等于3分钟且小于等于10分钟，否则审核会不通过。 > 通过该地址上传时，需设置content-type为application/octet-stream
     * @return trainingVideoUploadUrl
     */
    public List<String> getTrainingVideoUploadUrl() {
        return trainingVideoUploadUrl;
    }

    public void setTrainingVideoUploadUrl(List<String> trainingVideoUploadUrl) {
        this.trainingVideoUploadUrl = trainingVideoUploadUrl;
    }

    public Create2dModelTrainingJobResponse withActionVideoUploadUrl(List<String> actionVideoUploadUrl) {
        this.actionVideoUploadUrl = actionVideoUploadUrl;
        return this;
    }

    public Create2dModelTrainingJobResponse addActionVideoUploadUrlItem(String actionVideoUploadUrlItem) {
        if (this.actionVideoUploadUrl == null) {
            this.actionVideoUploadUrl = new ArrayList<>();
        }
        this.actionVideoUploadUrl.add(actionVideoUploadUrlItem);
        return this;
    }

    public Create2dModelTrainingJobResponse withActionVideoUploadUrl(
        Consumer<List<String>> actionVideoUploadUrlSetter) {
        if (this.actionVideoUploadUrl == null) {
            this.actionVideoUploadUrl = new ArrayList<>();
        }
        actionVideoUploadUrlSetter.accept(this.actionVideoUploadUrl);
        return this;
    }

    /**
     * 分身数字人训练视频上传URL。该url在文件上传成功后失效，只能上传一次。注意：视频必须是1080p或者4K分辨率（横、竖屏皆可）的mp4格式，视频长度须大于等于3分钟且小于等于10分钟，否则审核会不通过。 > 通过该地址上传时，需设置content-type为application/octet-stream
     * @return actionVideoUploadUrl
     */
    public List<String> getActionVideoUploadUrl() {
        return actionVideoUploadUrl;
    }

    public void setActionVideoUploadUrl(List<String> actionVideoUploadUrl) {
        this.actionVideoUploadUrl = actionVideoUploadUrl;
    }

    public Create2dModelTrainingJobResponse withAudioUploadUrl(String audioUploadUrl) {
        this.audioUploadUrl = audioUploadUrl;
        return this;
    }

    /**
     * 音频数据训练上传URL。该url在文件上传成功后失效，只能上传一次 > 通过该地址上传时，需设置content-type为application/zip。
     * @return audioUploadUrl
     */
    public String getAudioUploadUrl() {
        return audioUploadUrl;
    }

    public void setAudioUploadUrl(String audioUploadUrl) {
        this.audioUploadUrl = audioUploadUrl;
    }

    public Create2dModelTrainingJobResponse withCoverUploadUrl(String coverUploadUrl) {
        this.coverUploadUrl = coverUploadUrl;
        return this;
    }

    /**
     * 模型封面上传URL。该URL在文件上传成功后失效，只能上传一次。 > 通过该地址上传时，需设置content-type为application/octet-stream
     * @return coverUploadUrl
     */
    public String getCoverUploadUrl() {
        return coverUploadUrl;
    }

    public void setCoverUploadUrl(String coverUploadUrl) {
        this.coverUploadUrl = coverUploadUrl;
    }

    public Create2dModelTrainingJobResponse withIdCardImage1UploadUrl(String idCardImage1UploadUrl) {
        this.idCardImage1UploadUrl = idCardImage1UploadUrl;
        return this;
    }

    /**
     * 身份证正面照片上传URL。该URL在文件上传成功后失效，只能上传一次。注意：非NA用户必须上传，否则审核会不通过。 > 通过该地址上传时，需设置content-type为application/octet-stream
     * @return idCardImage1UploadUrl
     */
    public String getIdCardImage1UploadUrl() {
        return idCardImage1UploadUrl;
    }

    public void setIdCardImage1UploadUrl(String idCardImage1UploadUrl) {
        this.idCardImage1UploadUrl = idCardImage1UploadUrl;
    }

    public Create2dModelTrainingJobResponse withIdCardImage2UploadUrl(String idCardImage2UploadUrl) {
        this.idCardImage2UploadUrl = idCardImage2UploadUrl;
        return this;
    }

    /**
     * 身份证反面照片上传URL。该URL在文件上传成功后失效，只能上传一次。注意：非NA用户必须上传，否则审核会不通过。 > 通过该地址上传时，需设置content-type为application/octet-stream
     * @return idCardImage2UploadUrl
     */
    public String getIdCardImage2UploadUrl() {
        return idCardImage2UploadUrl;
    }

    public void setIdCardImage2UploadUrl(String idCardImage2UploadUrl) {
        this.idCardImage2UploadUrl = idCardImage2UploadUrl;
    }

    public Create2dModelTrainingJobResponse withGrantFileUploadUrl(String grantFileUploadUrl) {
        this.grantFileUploadUrl = grantFileUploadUrl;
        return this;
    }

    /**
     * 授权书上传URL。该URL在文件上传成功后失效，只能上传一次。注意：非NA用户必须上传，否则审核会不通过。 > 通过该地址上传时，需设置content-type为application/octet-stream
     * @return grantFileUploadUrl
     */
    public String getGrantFileUploadUrl() {
        return grantFileUploadUrl;
    }

    public void setGrantFileUploadUrl(String grantFileUploadUrl) {
        this.grantFileUploadUrl = grantFileUploadUrl;
    }

    public Create2dModelTrainingJobResponse withPreBeautyImageUploadUrl(String preBeautyImageUploadUrl) {
        this.preBeautyImageUploadUrl = preBeautyImageUploadUrl;
        return this;
    }

    /**
     * 美白前图片上传url。 > 通过该地址上传时，需设置content-type为application/octet-stream
     * @return preBeautyImageUploadUrl
     */
    public String getPreBeautyImageUploadUrl() {
        return preBeautyImageUploadUrl;
    }

    public void setPreBeautyImageUploadUrl(String preBeautyImageUploadUrl) {
        this.preBeautyImageUploadUrl = preBeautyImageUploadUrl;
    }

    public Create2dModelTrainingJobResponse withPostBeautyImageUploadUrl(String postBeautyImageUploadUrl) {
        this.postBeautyImageUploadUrl = postBeautyImageUploadUrl;
        return this;
    }

    /**
     * 美白后图片上传url。 > 通过该地址上传时，需设置content-type为application/octet-stream
     * @return postBeautyImageUploadUrl
     */
    public String getPostBeautyImageUploadUrl() {
        return postBeautyImageUploadUrl;
    }

    public void setPostBeautyImageUploadUrl(String postBeautyImageUploadUrl) {
        this.postBeautyImageUploadUrl = postBeautyImageUploadUrl;
    }

    public Create2dModelTrainingJobResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Create2dModelTrainingJobResponse that = (Create2dModelTrainingJobResponse) obj;
        return Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.trainingVideoUploadUrl, that.trainingVideoUploadUrl)
            && Objects.equals(this.actionVideoUploadUrl, that.actionVideoUploadUrl)
            && Objects.equals(this.audioUploadUrl, that.audioUploadUrl)
            && Objects.equals(this.coverUploadUrl, that.coverUploadUrl)
            && Objects.equals(this.idCardImage1UploadUrl, that.idCardImage1UploadUrl)
            && Objects.equals(this.idCardImage2UploadUrl, that.idCardImage2UploadUrl)
            && Objects.equals(this.grantFileUploadUrl, that.grantFileUploadUrl)
            && Objects.equals(this.preBeautyImageUploadUrl, that.preBeautyImageUploadUrl)
            && Objects.equals(this.postBeautyImageUploadUrl, that.postBeautyImageUploadUrl)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            trainingVideoUploadUrl,
            actionVideoUploadUrl,
            audioUploadUrl,
            coverUploadUrl,
            idCardImage1UploadUrl,
            idCardImage2UploadUrl,
            grantFileUploadUrl,
            preBeautyImageUploadUrl,
            postBeautyImageUploadUrl,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Create2dModelTrainingJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    trainingVideoUploadUrl: ").append(toIndentedString(trainingVideoUploadUrl)).append("\n");
        sb.append("    actionVideoUploadUrl: ").append(toIndentedString(actionVideoUploadUrl)).append("\n");
        sb.append("    audioUploadUrl: ").append(toIndentedString(audioUploadUrl)).append("\n");
        sb.append("    coverUploadUrl: ").append(toIndentedString(coverUploadUrl)).append("\n");
        sb.append("    idCardImage1UploadUrl: ").append(toIndentedString(idCardImage1UploadUrl)).append("\n");
        sb.append("    idCardImage2UploadUrl: ").append(toIndentedString(idCardImage2UploadUrl)).append("\n");
        sb.append("    grantFileUploadUrl: ").append(toIndentedString(grantFileUploadUrl)).append("\n");
        sb.append("    preBeautyImageUploadUrl: ").append(toIndentedString(preBeautyImageUploadUrl)).append("\n");
        sb.append("    postBeautyImageUploadUrl: ").append(toIndentedString(postBeautyImageUploadUrl)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
