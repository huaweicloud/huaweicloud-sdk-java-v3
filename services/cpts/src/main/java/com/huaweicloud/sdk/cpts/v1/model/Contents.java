package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Contents
 */
public class Contents {

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
    @JsonProperty(value = "selected_temp_name")

    private String selectedTempName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Object data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private Integer dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private Object conditions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_disabled")

    private Boolean isDisabled;

    public Contents withContentId(Integer contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * 事务id，若不为0表示此卡片为事务；为0表示非事务
     * minimum: 0
     * maximum: 2147483647
     * @return contentId
     */
    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Contents withContent(List<Content> content) {
        this.content = content;
        return this;
    }

    public Contents addContentItem(Content contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    public Contents withContent(Consumer<List<Content>> contentSetter) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /**
     * 内容
     * @return content
     */
    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public Contents withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 排序索引标识
     * minimum: 0
     * maximum: 2147483647
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Contents withSelectedTempName(String selectedTempName) {
        this.selectedTempName = selectedTempName;
        return this;
    }

    /**
     * 选择的事务或者用例名称
     * @return selectedTempName
     */
    public String getSelectedTempName() {
        return selectedTempName;
    }

    public void setSelectedTempName(String selectedTempName) {
        this.selectedTempName = selectedTempName;
    }

    public Contents withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * 数据（循环、条件控制器作用的数据）
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Contents withDataType(Integer dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 类型，0:默认请求；1:数据指令；201:循环指令； 202:条件指令；301:集合点
     * minimum: 0
     * maximum: 2147483647
     * @return dataType
     */
    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Contents withConditions(Object conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * 若类型为202:条件指令，该字段为条件配置
     * @return conditions
     */
    public Object getConditions() {
        return conditions;
    }

    public void setConditions(Object conditions) {
        this.conditions = conditions;
    }

    public Contents withIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
        return this;
    }

    /**
     * 是否禁用
     * @return isDisabled
     */
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Contents that = (Contents) obj;
        return Objects.equals(this.contentId, that.contentId) && Objects.equals(this.content, that.content)
            && Objects.equals(this.index, that.index) && Objects.equals(this.selectedTempName, that.selectedTempName)
            && Objects.equals(this.data, that.data) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.conditions, that.conditions) && Objects.equals(this.isDisabled, that.isDisabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, content, index, selectedTempName, data, dataType, conditions, isDisabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Contents {\n");
        sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    selectedTempName: ").append(toIndentedString(selectedTempName)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
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
