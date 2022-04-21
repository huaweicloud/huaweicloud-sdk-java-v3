package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UploadFileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileId")

    private String fileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageModeration")

    private ImageModerationResult imageModeration;

    public UploadFileResponse withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * 文件Id
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public UploadFileResponse withImageModeration(ImageModerationResult imageModeration) {
        this.imageModeration = imageModeration;
        return this;
    }

    public UploadFileResponse withImageModeration(Consumer<ImageModerationResult> imageModerationSetter) {
        if (this.imageModeration == null) {
            this.imageModeration = new ImageModerationResult();
            imageModerationSetter.accept(this.imageModeration);
        }

        return this;
    }

    /**
     * Get imageModeration
     * @return imageModeration
     */
    public ImageModerationResult getImageModeration() {
        return imageModeration;
    }

    public void setImageModeration(ImageModerationResult imageModeration) {
        this.imageModeration = imageModeration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadFileResponse uploadFileResponse = (UploadFileResponse) o;
        return Objects.equals(this.fileId, uploadFileResponse.fileId)
            && Objects.equals(this.imageModeration, uploadFileResponse.imageModeration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId, imageModeration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadFileResponse {\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    imageModeration: ").append(toIndentedString(imageModeration)).append("\n");
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
