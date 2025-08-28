package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowImageUploadCommandResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_command")

    private String imageCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "images_download_url")

    private String imagesDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swr_image_pull_command")

    private String swrImagePullCommand;

    public ShowImageUploadCommandResponse withImageCommand(String imageCommand) {
        this.imageCommand = imageCommand;
        return this;
    }

    /**
     * **参数解释**： 上传镜像指令 **取值范围**： 字符长度1-1024位 
     * @return imageCommand
     */
    public String getImageCommand() {
        return imageCommand;
    }

    public void setImageCommand(String imageCommand) {
        this.imageCommand = imageCommand;
    }

    public ShowImageUploadCommandResponse withImagesDownloadUrl(String imagesDownloadUrl) {
        this.imagesDownloadUrl = imagesDownloadUrl;
        return this;
    }

    /**
     * **参数解释**： 镜像下载链接 **取值范围**： 字符长度1-256位 
     * @return imagesDownloadUrl
     */
    public String getImagesDownloadUrl() {
        return imagesDownloadUrl;
    }

    public void setImagesDownloadUrl(String imagesDownloadUrl) {
        this.imagesDownloadUrl = imagesDownloadUrl;
    }

    public ShowImageUploadCommandResponse withSwrImagePullCommand(String swrImagePullCommand) {
        this.swrImagePullCommand = swrImagePullCommand;
        return this;
    }

    /**
     * **参数解释**： SWR镜像获取指令 **取值范围**： 字符长度1-1024位 
     * @return swrImagePullCommand
     */
    public String getSwrImagePullCommand() {
        return swrImagePullCommand;
    }

    public void setSwrImagePullCommand(String swrImagePullCommand) {
        this.swrImagePullCommand = swrImagePullCommand;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowImageUploadCommandResponse that = (ShowImageUploadCommandResponse) obj;
        return Objects.equals(this.imageCommand, that.imageCommand)
            && Objects.equals(this.imagesDownloadUrl, that.imagesDownloadUrl)
            && Objects.equals(this.swrImagePullCommand, that.swrImagePullCommand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageCommand, imagesDownloadUrl, swrImagePullCommand);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageUploadCommandResponse {\n");
        sb.append("    imageCommand: ").append(toIndentedString(imageCommand)).append("\n");
        sb.append("    imagesDownloadUrl: ").append(toIndentedString(imagesDownloadUrl)).append("\n");
        sb.append("    swrImagePullCommand: ").append(toIndentedString(swrImagePullCommand)).append("\n");
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
