package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** TempContentInfo */
public class TempContentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_id")

    private Integer contentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private List<Content> content = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private Integer index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private Integer dataType;

    public TempContentInfo withContentId(Integer contentId) {
        this.contentId = contentId;
        return this;
    }

    /** content_id minimum: 0 maximum: 2147483647
     * 
     * @return contentId */
    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public TempContentInfo withContent(List<Content> content) {
        this.content = content;
        return this;
    }

    public TempContentInfo addContentItem(Content contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    public TempContentInfo withContent(Consumer<List<Content>> contentSetter) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /** content
     * 
     * @return content */
    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public TempContentInfo withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /** index minimum: 0 maximum: 2147483647
     * 
     * @return index */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public TempContentInfo withData(String data) {
        this.data = data;
        return this;
    }

    /** data
     * 
     * @return data */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TempContentInfo withDataType(Integer dataType) {
        this.dataType = dataType;
        return this;
    }

    /** data_type minimum: 0 maximum: 2147483647
     * 
     * @return dataType */
    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TempContentInfo tempContentInfo = (TempContentInfo) o;
        return Objects.equals(this.contentId, tempContentInfo.contentId)
            && Objects.equals(this.content, tempContentInfo.content)
            && Objects.equals(this.index, tempContentInfo.index) && Objects.equals(this.data, tempContentInfo.data)
            && Objects.equals(this.dataType, tempContentInfo.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, content, index, data, dataType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TempContentInfo {\n");
        sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
