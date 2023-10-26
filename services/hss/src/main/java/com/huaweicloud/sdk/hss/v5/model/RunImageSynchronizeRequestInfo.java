package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RunImageSynchronizeRequestInfo
 */
public class RunImageSynchronizeRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    public RunImageSynchronizeRequestInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型，包含如下:   - private_image : 私有镜像仓库   - shared_image : 共享镜像仓库
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunImageSynchronizeRequestInfo that = (RunImageSynchronizeRequestInfo) obj;
        return Objects.equals(this.imageType, that.imageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunImageSynchronizeRequestInfo {\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
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
