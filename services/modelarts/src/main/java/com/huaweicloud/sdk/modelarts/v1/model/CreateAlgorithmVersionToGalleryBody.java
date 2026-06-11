package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建发布算法资产请求
 */
public class CreateAlgorithmVersionToGalleryBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_id")

    private String contentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_info")

    private ContentInfo contentInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private AlgorithmInfo algorithm;

    public CreateAlgorithmVersionToGalleryBody withContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * **参数解释**：资产id。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return contentId
     */
    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public CreateAlgorithmVersionToGalleryBody withContentInfo(ContentInfo contentInfo) {
        this.contentInfo = contentInfo;
        return this;
    }

    public CreateAlgorithmVersionToGalleryBody withContentInfo(Consumer<ContentInfo> contentInfoSetter) {
        if (this.contentInfo == null) {
            this.contentInfo = new ContentInfo();
            contentInfoSetter.accept(this.contentInfo);
        }

        return this;
    }

    /**
     * Get contentInfo
     * @return contentInfo
     */
    public ContentInfo getContentInfo() {
        return contentInfo;
    }

    public void setContentInfo(ContentInfo contentInfo) {
        this.contentInfo = contentInfo;
    }

    public CreateAlgorithmVersionToGalleryBody withAlgorithm(AlgorithmInfo algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    public CreateAlgorithmVersionToGalleryBody withAlgorithm(Consumer<AlgorithmInfo> algorithmSetter) {
        if (this.algorithm == null) {
            this.algorithm = new AlgorithmInfo();
            algorithmSetter.accept(this.algorithm);
        }

        return this;
    }

    /**
     * Get algorithm
     * @return algorithm
     */
    public AlgorithmInfo getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(AlgorithmInfo algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAlgorithmVersionToGalleryBody that = (CreateAlgorithmVersionToGalleryBody) obj;
        return Objects.equals(this.contentId, that.contentId) && Objects.equals(this.contentInfo, that.contentInfo)
            && Objects.equals(this.algorithm, that.algorithm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, contentInfo, algorithm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAlgorithmVersionToGalleryBody {\n");
        sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
        sb.append("    contentInfo: ").append(toIndentedString(contentInfo)).append("\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
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
