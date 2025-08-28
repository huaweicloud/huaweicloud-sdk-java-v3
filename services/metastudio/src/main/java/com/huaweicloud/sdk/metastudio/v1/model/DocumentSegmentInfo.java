package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文档分段信息
 */
public class DocumentSegmentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_index")

    private Integer textIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    public DocumentSegmentInfo withTextIndex(Integer textIndex) {
        this.textIndex = textIndex;
        return this;
    }

    /**
     * 分段序号
     * minimum: 0
     * maximum: 65536
     * @return textIndex
     */
    public Integer getTextIndex() {
        return textIndex;
    }

    public void setTextIndex(Integer textIndex) {
        this.textIndex = textIndex;
    }

    public DocumentSegmentInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 分段文本ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DocumentSegmentInfo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 分段文本标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DocumentSegmentInfo withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 分段文本内容
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentSegmentInfo that = (DocumentSegmentInfo) obj;
        return Objects.equals(this.textIndex, that.textIndex) && Objects.equals(this.id, that.id)
            && Objects.equals(this.title, that.title) && Objects.equals(this.text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textIndex, id, title, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentSegmentInfo {\n");
        sb.append("    textIndex: ").append(toIndentedString(textIndex)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
