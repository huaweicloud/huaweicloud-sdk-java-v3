package com.huaweicloud.sdk.versatile.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检索结果。
 */
public class RetrievalResultInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chunk_id")

    private String chunkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "similarity")

    private Float similarity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_base_id")

    private String knowledgeBaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_ids")

    private List<String> imageIds = null;

    public RetrievalResultInfo withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * **参数解释**： 文件ID（或FAQ ID）。  **取值范围**： 不涉及。
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public RetrievalResultInfo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释**： 文档标题（如果是FAQ，返回QUESTION）。  **取值范围**： 不涉及。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public RetrievalResultInfo withChunkId(String chunkId) {
        this.chunkId = chunkId;
        return this;
    }

    /**
     * **参数解释**： 分片ID。  **取值范围**： 不涉及。
     * @return chunkId
     */
    public String getChunkId() {
        return chunkId;
    }

    public void setChunkId(String chunkId) {
        this.chunkId = chunkId;
    }

    public RetrievalResultInfo withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释**： 文本内容（如果是FAQ，返回ANSWER）。  **取值范围**： 不涉及。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public RetrievalResultInfo withSimilarity(Float similarity) {
        this.similarity = similarity;
        return this;
    }

    /**
     * **参数解释**： 相似度。  **取值范围**： [0.0, 1.0]，包含两端。
     * @return similarity
     */
    public Float getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Float similarity) {
        this.similarity = similarity;
    }

    public RetrievalResultInfo withKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }

    /**
     * **参数解释**： 知识库ID。  **取值范围**： 不涉及。
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return knowledgeBaseId;
    }

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    public RetrievalResultInfo withImageIds(List<String> imageIds) {
        this.imageIds = imageIds;
        return this;
    }

    public RetrievalResultInfo addImageIdsItem(String imageIdsItem) {
        if (this.imageIds == null) {
            this.imageIds = new ArrayList<>();
        }
        this.imageIds.add(imageIdsItem);
        return this;
    }

    public RetrievalResultInfo withImageIds(Consumer<List<String>> imageIdsSetter) {
        if (this.imageIds == null) {
            this.imageIds = new ArrayList<>();
        }
        imageIdsSetter.accept(this.imageIds);
        return this;
    }

    /**
     * **参数解释**： 检索到的图片列表（需知识库支持），与content中的图片占位符{KI|N}保持一一对应关系，N为图片索引值，从0开始。  **取值范围**： 不涉及。
     * @return imageIds
     */
    public List<String> getImageIds() {
        return imageIds;
    }

    public void setImageIds(List<String> imageIds) {
        this.imageIds = imageIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetrievalResultInfo that = (RetrievalResultInfo) obj;
        return Objects.equals(this.fileId, that.fileId) && Objects.equals(this.title, that.title)
            && Objects.equals(this.chunkId, that.chunkId) && Objects.equals(this.content, that.content)
            && Objects.equals(this.similarity, that.similarity)
            && Objects.equals(this.knowledgeBaseId, that.knowledgeBaseId)
            && Objects.equals(this.imageIds, that.imageIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId, title, chunkId, content, similarity, knowledgeBaseId, imageIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetrievalResultInfo {\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    chunkId: ").append(toIndentedString(chunkId)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
        sb.append("    knowledgeBaseId: ").append(toIndentedString(knowledgeBaseId)).append("\n");
        sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
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
