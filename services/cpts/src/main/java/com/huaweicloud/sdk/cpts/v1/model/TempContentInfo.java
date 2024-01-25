package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TempContentInfo
 */
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

    private Object data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private Integer dataType;

    public TempContentInfo withContentId(Integer contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * 报文id或者事务id或者插件id
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

    public TempContentInfo withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 索引
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

    public TempContentInfo withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * 数据指令内容
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public TempContentInfo withDataType(Integer dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据指令类型（0：默认请求卡片；1：数据指令；201：循环指令；202：条件指令；301：集合点[；203：vu百分比控制器；204：吞吐量控制器；302：插件请求](tag:hws,hws_hk)）
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TempContentInfo that = (TempContentInfo) obj;
        return Objects.equals(this.contentId, that.contentId) && Objects.equals(this.content, that.content)
            && Objects.equals(this.index, that.index) && Objects.equals(this.data, that.data)
            && Objects.equals(this.dataType, that.dataType);
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
