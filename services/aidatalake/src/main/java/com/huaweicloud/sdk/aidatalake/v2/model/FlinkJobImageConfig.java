package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：Flink镜像配置，用于指定Flink作业运行所需的镜像信息。 **约束限制**：不涉及。
 */
public class FlinkJobImageConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version_id")

    private String imageVersionId;

    public FlinkJobImageConfig withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：镜像ID，用于指定Flink作业运行所需的镜像。须为平台镜像管理中已存在的镜像，传入不存在的镜像时接口返回错误，可通过平台镜像管理功能获取。 **约束限制**：须与image_version_id配合使用，二者对应的镜像版本须已存在。 **取值范围**：长度为2~64个字符，字符组成不限制。 **默认取值**：不涉及。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public FlinkJobImageConfig withImageVersionId(String imageVersionId) {
        this.imageVersionId = imageVersionId;
        return this;
    }

    /**
     * **参数解释**：镜像版本ID，用于指定Flink作业运行所需的镜像版本。须为平台镜像管理中已存在的镜像版本，传入不存在的镜像版本时接口返回错误，可通过平台镜像管理功能获取。 **约束限制**：须与image_id配合使用，二者对应的镜像版本须已存在。 **取值范围**：长度为2~64个字符，字符组成不限制。 **默认取值**：不涉及。
     * @return imageVersionId
     */
    public String getImageVersionId() {
        return imageVersionId;
    }

    public void setImageVersionId(String imageVersionId) {
        this.imageVersionId = imageVersionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkJobImageConfig that = (FlinkJobImageConfig) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageVersionId, that.imageVersionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, imageVersionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkJobImageConfig {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageVersionId: ").append(toIndentedString(imageVersionId)).append("\n");
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
