package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：Spark镜像配置，用于指定Spark作业运行所需的镜像信息。 **约束限制**：不涉及。
 */
public class SparkJobImageConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version_id")

    private String imageVersionId;

    public SparkJobImageConfig withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：镜像ID，用于指定Spark作业运行所需的镜像。 **约束限制**：不涉及。 **取值范围**：长度为2~64个字符。 **默认取值**：不涉及。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public SparkJobImageConfig withImageVersionId(String imageVersionId) {
        this.imageVersionId = imageVersionId;
        return this;
    }

    /**
     * **参数解释**：镜像版本，用于指定Spark作业运行所需的镜像版本。 **约束限制**：不涉及。 **取值范围**：长度为2~64个字符。 **默认取值**：不涉及。
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
        SparkJobImageConfig that = (SparkJobImageConfig) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageVersionId, that.imageVersionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, imageVersionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkJobImageConfig {\n");
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
