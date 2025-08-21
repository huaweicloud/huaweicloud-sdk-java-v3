package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchCreateApplicationViewRequestBody
 */
public class BatchCreateApplicationViewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_list")

    private List<BatchCreateApplicationViewRequestBodyApplicationList> applicationList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_list")

    private List<BatchCreateApplicationViewRequestBodyComponentList> componentList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_list")

    private List<BatchCreateApplicationViewRequestBodyGroupList> groupList = null;

    public BatchCreateApplicationViewRequestBody withApplicationList(
        List<BatchCreateApplicationViewRequestBodyApplicationList> applicationList) {
        this.applicationList = applicationList;
        return this;
    }

    public BatchCreateApplicationViewRequestBody addApplicationListItem(
        BatchCreateApplicationViewRequestBodyApplicationList applicationListItem) {
        if (this.applicationList == null) {
            this.applicationList = new ArrayList<>();
        }
        this.applicationList.add(applicationListItem);
        return this;
    }

    public BatchCreateApplicationViewRequestBody withApplicationList(
        Consumer<List<BatchCreateApplicationViewRequestBodyApplicationList>> applicationListSetter) {
        if (this.applicationList == null) {
            this.applicationList = new ArrayList<>();
        }
        applicationListSetter.accept(this.applicationList);
        return this;
    }

    /**
     * **参数解释：** 应用信息组成的列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return applicationList
     */
    public List<BatchCreateApplicationViewRequestBodyApplicationList> getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(List<BatchCreateApplicationViewRequestBodyApplicationList> applicationList) {
        this.applicationList = applicationList;
    }

    public BatchCreateApplicationViewRequestBody withComponentList(
        List<BatchCreateApplicationViewRequestBodyComponentList> componentList) {
        this.componentList = componentList;
        return this;
    }

    public BatchCreateApplicationViewRequestBody addComponentListItem(
        BatchCreateApplicationViewRequestBodyComponentList componentListItem) {
        if (this.componentList == null) {
            this.componentList = new ArrayList<>();
        }
        this.componentList.add(componentListItem);
        return this;
    }

    public BatchCreateApplicationViewRequestBody withComponentList(
        Consumer<List<BatchCreateApplicationViewRequestBodyComponentList>> componentListSetter) {
        if (this.componentList == null) {
            this.componentList = new ArrayList<>();
        }
        componentListSetter.accept(this.componentList);
        return this;
    }

    /**
     * **参数解释：** 组件信息组成的列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return componentList
     */
    public List<BatchCreateApplicationViewRequestBodyComponentList> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<BatchCreateApplicationViewRequestBodyComponentList> componentList) {
        this.componentList = componentList;
    }

    public BatchCreateApplicationViewRequestBody withGroupList(
        List<BatchCreateApplicationViewRequestBodyGroupList> groupList) {
        this.groupList = groupList;
        return this;
    }

    public BatchCreateApplicationViewRequestBody addGroupListItem(
        BatchCreateApplicationViewRequestBodyGroupList groupListItem) {
        if (this.groupList == null) {
            this.groupList = new ArrayList<>();
        }
        this.groupList.add(groupListItem);
        return this;
    }

    public BatchCreateApplicationViewRequestBody withGroupList(
        Consumer<List<BatchCreateApplicationViewRequestBodyGroupList>> groupListSetter) {
        if (this.groupList == null) {
            this.groupList = new ArrayList<>();
        }
        groupListSetter.accept(this.groupList);
        return this;
    }

    /**
     * **参数解释：** 分组信息组成的列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return groupList
     */
    public List<BatchCreateApplicationViewRequestBodyGroupList> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<BatchCreateApplicationViewRequestBodyGroupList> groupList) {
        this.groupList = groupList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateApplicationViewRequestBody that = (BatchCreateApplicationViewRequestBody) obj;
        return Objects.equals(this.applicationList, that.applicationList)
            && Objects.equals(this.componentList, that.componentList) && Objects.equals(this.groupList, that.groupList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationList, componentList, groupList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateApplicationViewRequestBody {\n");
        sb.append("    applicationList: ").append(toIndentedString(applicationList)).append("\n");
        sb.append("    componentList: ").append(toIndentedString(componentList)).append("\n");
        sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
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
