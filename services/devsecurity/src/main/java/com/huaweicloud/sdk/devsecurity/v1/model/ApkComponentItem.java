package com.huaweicloud.sdk.devsecurity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApkComponentItem
 */
public class ApkComponentItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_list")

    private List<String> actionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_list")

    private List<String> categoryList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_main_activity")

    private Boolean isMainActivity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exported")

    private String exported;

    public ApkComponentItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApkComponentItem withActionList(List<String> actionList) {
        this.actionList = actionList;
        return this;
    }

    public ApkComponentItem addActionListItem(String actionListItem) {
        if (this.actionList == null) {
            this.actionList = new ArrayList<>();
        }
        this.actionList.add(actionListItem);
        return this;
    }

    public ApkComponentItem withActionList(Consumer<List<String>> actionListSetter) {
        if (this.actionList == null) {
            this.actionList = new ArrayList<>();
        }
        actionListSetter.accept(this.actionList);
        return this;
    }

    /**
     * 动作列表
     * @return actionList
     */
    public List<String> getActionList() {
        return actionList;
    }

    public void setActionList(List<String> actionList) {
        this.actionList = actionList;
    }

    public ApkComponentItem withCategoryList(List<String> categoryList) {
        this.categoryList = categoryList;
        return this;
    }

    public ApkComponentItem addCategoryListItem(String categoryListItem) {
        if (this.categoryList == null) {
            this.categoryList = new ArrayList<>();
        }
        this.categoryList.add(categoryListItem);
        return this;
    }

    public ApkComponentItem withCategoryList(Consumer<List<String>> categoryListSetter) {
        if (this.categoryList == null) {
            this.categoryList = new ArrayList<>();
        }
        categoryListSetter.accept(this.categoryList);
        return this;
    }

    /**
     * 类别列表
     * @return categoryList
     */
    public List<String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<String> categoryList) {
        this.categoryList = categoryList;
    }

    public ApkComponentItem withIsMainActivity(Boolean isMainActivity) {
        this.isMainActivity = isMainActivity;
        return this;
    }

    /**
     * 主要活动
     * @return isMainActivity
     */
    public Boolean getIsMainActivity() {
        return isMainActivity;
    }

    public void setIsMainActivity(Boolean isMainActivity) {
        this.isMainActivity = isMainActivity;
    }

    public ApkComponentItem withExported(String exported) {
        this.exported = exported;
        return this;
    }

    /**
     * 导出
     * @return exported
     */
    public String getExported() {
        return exported;
    }

    public void setExported(String exported) {
        this.exported = exported;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApkComponentItem that = (ApkComponentItem) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.actionList, that.actionList)
            && Objects.equals(this.categoryList, that.categoryList)
            && Objects.equals(this.isMainActivity, that.isMainActivity) && Objects.equals(this.exported, that.exported);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, actionList, categoryList, isMainActivity, exported);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApkComponentItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    actionList: ").append(toIndentedString(actionList)).append("\n");
        sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
        sb.append("    isMainActivity: ").append(toIndentedString(isMainActivity)).append("\n");
        sb.append("    exported: ").append(toIndentedString(exported)).append("\n");
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
