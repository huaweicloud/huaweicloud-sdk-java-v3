package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HttpListAlarmWhiteListResponseData
 */
public class HttpListAlarmWhiteListResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<EipInfo> list = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pages")

    private Integer pages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public HttpListAlarmWhiteListResponseData withList(List<EipInfo> list) {
        this.list = list;
        return this;
    }

    public HttpListAlarmWhiteListResponseData addListItem(EipInfo listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public HttpListAlarmWhiteListResponseData withList(Consumer<List<EipInfo>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 查询告警白名单返回值数据
     * @return list
     */
    public List<EipInfo> getList() {
        return list;
    }

    public void setList(List<EipInfo> list) {
        this.list = list;
    }

    public HttpListAlarmWhiteListResponseData withPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    /**
     * 目前页数
     * @return pages
     */
    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public HttpListAlarmWhiteListResponseData withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 每页个数
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpListAlarmWhiteListResponseData that = (HttpListAlarmWhiteListResponseData) obj;
        return Objects.equals(this.list, that.list) && Objects.equals(this.pages, that.pages)
            && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list, pages, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpListAlarmWhiteListResponseData {\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
