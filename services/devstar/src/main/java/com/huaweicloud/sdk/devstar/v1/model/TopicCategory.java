package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TopicCategory
 */
public class TopicCategory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_id")

    private String topicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name")

    private String topicName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private String categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_name")

    private String categoryName;

    public TopicCategory withTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }

    /**
     * topic的id。
     * @return topicId
     */
    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public TopicCategory withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * topic的名称。
     * @return topicName
     */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public TopicCategory withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * topic对应的类别的id。
     * @return categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public TopicCategory withCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * topic对应的类别的名称。
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopicCategory topicCategory = (TopicCategory) o;
        return Objects.equals(this.topicId, topicCategory.topicId)
            && Objects.equals(this.topicName, topicCategory.topicName)
            && Objects.equals(this.categoryId, topicCategory.categoryId)
            && Objects.equals(this.categoryName, topicCategory.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicId, topicName, categoryId, categoryName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopicCategory {\n");
        sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
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
