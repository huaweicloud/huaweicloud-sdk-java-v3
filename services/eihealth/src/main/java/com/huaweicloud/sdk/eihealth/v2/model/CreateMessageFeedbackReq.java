package com.huaweicloud.sdk.eihealth.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateMessageFeedbackReq
 */
public class CreateMessageFeedbackReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private FeedbackType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<FeedbackLabel> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    public CreateMessageFeedbackReq withType(FeedbackType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public FeedbackType getType() {
        return type;
    }

    public void setType(FeedbackType type) {
        this.type = type;
    }

    public CreateMessageFeedbackReq withLabels(List<FeedbackLabel> labels) {
        this.labels = labels;
        return this;
    }

    public CreateMessageFeedbackReq addLabelsItem(FeedbackLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public CreateMessageFeedbackReq withLabels(Consumer<List<FeedbackLabel>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**： 反馈标签。 **约束限制**： 最多支持设置10个标签。 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return labels
     */
    public List<FeedbackLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<FeedbackLabel> labels) {
        this.labels = labels;
    }

    public CreateMessageFeedbackReq withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释**： 反馈内容。 **约束限制**： 不涉及 **取值范围**： 长度为[0-1000]个字符。 **默认取值**： 不涉及 
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMessageFeedbackReq that = (CreateMessageFeedbackReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, labels, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessageFeedbackReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
