package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ViewRow
 */
public class ViewRow {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_list")

    private List<ViewBase> viewList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    public ViewRow withViewList(List<ViewBase> viewList) {
        this.viewList = viewList;
        return this;
    }

    public ViewRow addViewListItem(ViewBase viewListItem) {
        if (this.viewList == null) {
            this.viewList = new ArrayList<>();
        }
        this.viewList.add(viewListItem);
        return this;
    }

    public ViewRow withViewList(Consumer<List<ViewBase>> viewListSetter) {
        if (this.viewList == null) {
            this.viewList = new ArrayList<>();
        }
        viewListSetter.accept(this.viewList);
        return this;
    }

    /**
     * 视图行，包含多个视图，展示的时候根据实际的长度适配。
     * @return viewList
     */
    public List<ViewBase> getViewList() {
        return viewList;
    }

    public void setViewList(List<ViewBase> viewList) {
        this.viewList = viewList;
    }

    public ViewRow withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标题。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ViewRow that = (ViewRow) obj;
        return Objects.equals(this.viewList, that.viewList) && Objects.equals(this.title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(viewList, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ViewRow {\n");
        sb.append("    viewList: ").append(toIndentedString(viewList)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
