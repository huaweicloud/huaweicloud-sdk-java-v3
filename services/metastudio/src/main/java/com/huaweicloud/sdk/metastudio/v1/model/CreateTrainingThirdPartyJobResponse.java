package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateTrainingThirdPartyJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "training_data_uploading_url")

    private String trainingDataUploadingUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segment_uploading_url")

    private CreateTrainingJobRspSegmentUploadingUrl segmentUploadingUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_letter_uploading_url")

    private String authorizationLetterUploadingUrl;

    public CreateTrainingThirdPartyJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateTrainingThirdPartyJobResponse withTrainingDataUploadingUrl(String trainingDataUploadingUrl) {
        this.trainingDataUploadingUrl = trainingDataUploadingUrl;
        return this;
    }

    /**
     * 上传训练数据的地址。训练数据需打包成zip文件后，上传至该url。  create_type取值为package时设置。 > 通过该obs地址上传时，需设置content-type为application/zip。
     * @return trainingDataUploadingUrl
     */
    public String getTrainingDataUploadingUrl() {
        return trainingDataUploadingUrl;
    }

    public void setTrainingDataUploadingUrl(String trainingDataUploadingUrl) {
        this.trainingDataUploadingUrl = trainingDataUploadingUrl;
    }

    public CreateTrainingThirdPartyJobResponse withSegmentUploadingUrl(
        CreateTrainingJobRspSegmentUploadingUrl segmentUploadingUrl) {
        this.segmentUploadingUrl = segmentUploadingUrl;
        return this;
    }

    public CreateTrainingThirdPartyJobResponse withSegmentUploadingUrl(
        Consumer<CreateTrainingJobRspSegmentUploadingUrl> segmentUploadingUrlSetter) {
        if (this.segmentUploadingUrl == null) {
            this.segmentUploadingUrl = new CreateTrainingJobRspSegmentUploadingUrl();
            segmentUploadingUrlSetter.accept(this.segmentUploadingUrl);
        }

        return this;
    }

    /**
     * Get segmentUploadingUrl
     * @return segmentUploadingUrl
     */
    public CreateTrainingJobRspSegmentUploadingUrl getSegmentUploadingUrl() {
        return segmentUploadingUrl;
    }

    public void setSegmentUploadingUrl(CreateTrainingJobRspSegmentUploadingUrl segmentUploadingUrl) {
        this.segmentUploadingUrl = segmentUploadingUrl;
    }

    public CreateTrainingThirdPartyJobResponse withAuthorizationLetterUploadingUrl(
        String authorizationLetterUploadingUrl) {
        this.authorizationLetterUploadingUrl = authorizationLetterUploadingUrl;
        return this;
    }

    /**
     * 授权书的上传地址。
     * @return authorizationLetterUploadingUrl
     */
    public String getAuthorizationLetterUploadingUrl() {
        return authorizationLetterUploadingUrl;
    }

    public void setAuthorizationLetterUploadingUrl(String authorizationLetterUploadingUrl) {
        this.authorizationLetterUploadingUrl = authorizationLetterUploadingUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTrainingThirdPartyJobResponse that = (CreateTrainingThirdPartyJobResponse) obj;
        return Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.trainingDataUploadingUrl, that.trainingDataUploadingUrl)
            && Objects.equals(this.segmentUploadingUrl, that.segmentUploadingUrl)
            && Objects.equals(this.authorizationLetterUploadingUrl, that.authorizationLetterUploadingUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, trainingDataUploadingUrl, segmentUploadingUrl, authorizationLetterUploadingUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrainingThirdPartyJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    trainingDataUploadingUrl: ").append(toIndentedString(trainingDataUploadingUrl)).append("\n");
        sb.append("    segmentUploadingUrl: ").append(toIndentedString(segmentUploadingUrl)).append("\n");
        sb.append("    authorizationLetterUploadingUrl: ")
            .append(toIndentedString(authorizationLetterUploadingUrl))
            .append("\n");
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
