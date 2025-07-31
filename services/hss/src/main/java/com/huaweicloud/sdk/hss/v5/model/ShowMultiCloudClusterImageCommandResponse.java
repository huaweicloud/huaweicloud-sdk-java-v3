package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMultiCloudClusterImageCommandResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_command")

    private String imageCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_command")

    private String secretCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "images_download_url")

    private String imagesDownloadUrl;

    public ShowMultiCloudClusterImageCommandResponse withImageCommand(String imageCommand) {
        this.imageCommand = imageCommand;
        return this;
    }

    /**
     * 上传镜像指令
     * @return imageCommand
     */
    public String getImageCommand() {
        return imageCommand;
    }

    public void setImageCommand(String imageCommand) {
        this.imageCommand = imageCommand;
    }

    public ShowMultiCloudClusterImageCommandResponse withSecretCommand(String secretCommand) {
        this.secretCommand = secretCommand;
        return this;
    }

    /**
     * 安装凭证指令
     * @return secretCommand
     */
    public String getSecretCommand() {
        return secretCommand;
    }

    public void setSecretCommand(String secretCommand) {
        this.secretCommand = secretCommand;
    }

    public ShowMultiCloudClusterImageCommandResponse withImagesDownloadUrl(String imagesDownloadUrl) {
        this.imagesDownloadUrl = imagesDownloadUrl;
        return this;
    }

    /**
     * 镜像下载链接
     * @return imagesDownloadUrl
     */
    public String getImagesDownloadUrl() {
        return imagesDownloadUrl;
    }

    public void setImagesDownloadUrl(String imagesDownloadUrl) {
        this.imagesDownloadUrl = imagesDownloadUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMultiCloudClusterImageCommandResponse that = (ShowMultiCloudClusterImageCommandResponse) obj;
        return Objects.equals(this.imageCommand, that.imageCommand)
            && Objects.equals(this.secretCommand, that.secretCommand)
            && Objects.equals(this.imagesDownloadUrl, that.imagesDownloadUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageCommand, secretCommand, imagesDownloadUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMultiCloudClusterImageCommandResponse {\n");
        sb.append("    imageCommand: ").append(toIndentedString(imageCommand)).append("\n");
        sb.append("    secretCommand: ").append(toIndentedString(secretCommand)).append("\n");
        sb.append("    imagesDownloadUrl: ").append(toIndentedString(imagesDownloadUrl)).append("\n");
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
