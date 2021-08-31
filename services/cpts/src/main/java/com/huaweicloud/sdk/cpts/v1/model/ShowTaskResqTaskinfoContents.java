package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ShowTaskResqTaskinfoContents */
public class ShowTaskResqTaskinfoContents {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_id")

    private Integer contentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private List<ShowTaskResqTaskinfoContent1> content = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private Integer index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selected_temp_name")

    private String selectedTempName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private Integer dataType;

    public ShowTaskResqTaskinfoContents withContentId(Integer contentId) {
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

    public ShowTaskResqTaskinfoContents withContent(List<ShowTaskResqTaskinfoContent1> content) {
        this.content = content;
        return this;
    }

    public ShowTaskResqTaskinfoContents addContentItem(ShowTaskResqTaskinfoContent1 contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    public ShowTaskResqTaskinfoContents withContent(Consumer<List<ShowTaskResqTaskinfoContent1>> contentSetter) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /** content
     * 
     * @return content */
    public List<ShowTaskResqTaskinfoContent1> getContent() {
        return content;
    }

    public void setContent(List<ShowTaskResqTaskinfoContent1> content) {
        this.content = content;
    }

    public ShowTaskResqTaskinfoContents withIndex(Integer index) {
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

    public ShowTaskResqTaskinfoContents withSelectedTempName(String selectedTempName) {
        this.selectedTempName = selectedTempName;
        return this;
    }

    /** selected_temp_name
     * 
     * @return selectedTempName */
    public String getSelectedTempName() {
        return selectedTempName;
    }

    public void setSelectedTempName(String selectedTempName) {
        this.selectedTempName = selectedTempName;
    }

    public ShowTaskResqTaskinfoContents withData(String data) {
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

    public ShowTaskResqTaskinfoContents withDataType(Integer dataType) {
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
        ShowTaskResqTaskinfoContents showTaskResqTaskinfoContents = (ShowTaskResqTaskinfoContents) o;
        return Objects.equals(this.contentId, showTaskResqTaskinfoContents.contentId)
            && Objects.equals(this.content, showTaskResqTaskinfoContents.content)
            && Objects.equals(this.index, showTaskResqTaskinfoContents.index)
            && Objects.equals(this.selectedTempName, showTaskResqTaskinfoContents.selectedTempName)
            && Objects.equals(this.data, showTaskResqTaskinfoContents.data)
            && Objects.equals(this.dataType, showTaskResqTaskinfoContents.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, content, index, selectedTempName, data, dataType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskResqTaskinfoContents {\n");
        sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    selectedTempName: ").append(toIndentedString(selectedTempName)).append("\n");
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
