package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** UpdateCaseRequestBodyContents */
public class UpdateCaseRequestBodyContents {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private List<UpdateCaseRequestBodyContent1> content = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_id")

    private Integer contentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private Integer dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private Integer index;

    public UpdateCaseRequestBodyContents withContent(List<UpdateCaseRequestBodyContent1> content) {
        this.content = content;
        return this;
    }

    public UpdateCaseRequestBodyContents addContentItem(UpdateCaseRequestBodyContent1 contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    public UpdateCaseRequestBodyContents withContent(Consumer<List<UpdateCaseRequestBodyContent1>> contentSetter) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /** content
     * 
     * @return content */
    public List<UpdateCaseRequestBodyContent1> getContent() {
        return content;
    }

    public void setContent(List<UpdateCaseRequestBodyContent1> content) {
        this.content = content;
    }

    public UpdateCaseRequestBodyContents withContentId(Integer contentId) {
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

    public UpdateCaseRequestBodyContents withDataType(Integer dataType) {
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

    public UpdateCaseRequestBodyContents withIndex(Integer index) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCaseRequestBodyContents updateCaseRequestBodyContents = (UpdateCaseRequestBodyContents) o;
        return Objects.equals(this.content, updateCaseRequestBodyContents.content)
            && Objects.equals(this.contentId, updateCaseRequestBodyContents.contentId)
            && Objects.equals(this.dataType, updateCaseRequestBodyContents.dataType)
            && Objects.equals(this.index, updateCaseRequestBodyContents.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, contentId, dataType, index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCaseRequestBodyContents {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
