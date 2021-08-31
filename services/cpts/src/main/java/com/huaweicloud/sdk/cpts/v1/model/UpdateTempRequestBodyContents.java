package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** UpdateTempRequestBodyContents */
public class UpdateTempRequestBodyContents {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private List<UpdateTempRequestBodyContent1> content = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_id")

    private Integer contentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private Integer dataType;

    public UpdateTempRequestBodyContents withContent(List<UpdateTempRequestBodyContent1> content) {
        this.content = content;
        return this;
    }

    public UpdateTempRequestBodyContents addContentItem(UpdateTempRequestBodyContent1 contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    public UpdateTempRequestBodyContents withContent(Consumer<List<UpdateTempRequestBodyContent1>> contentSetter) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /** content
     * 
     * @return content */
    public List<UpdateTempRequestBodyContent1> getContent() {
        return content;
    }

    public void setContent(List<UpdateTempRequestBodyContent1> content) {
        this.content = content;
    }

    public UpdateTempRequestBodyContents withContentId(Integer contentId) {
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

    public UpdateTempRequestBodyContents withDataType(Integer dataType) {
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
        UpdateTempRequestBodyContents updateTempRequestBodyContents = (UpdateTempRequestBodyContents) o;
        return Objects.equals(this.content, updateTempRequestBodyContents.content)
            && Objects.equals(this.contentId, updateTempRequestBodyContents.contentId)
            && Objects.equals(this.dataType, updateTempRequestBodyContents.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, contentId, dataType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTempRequestBodyContents {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
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
