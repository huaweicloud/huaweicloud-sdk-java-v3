package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListTemplateGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    @JacksonXmlProperty(localName = "group_id")

    private List<String> groupId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    @JacksonXmlProperty(localName = "group_name")

    private List<String> groupName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    @JacksonXmlProperty(localName = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    public ListTemplateGroupRequest withGroupId(List<String> groupId) {
        this.groupId = groupId;
        return this;
    }

    public ListTemplateGroupRequest addGroupIdItem(String groupIdItem) {
        if (this.groupId == null) {
            this.groupId = new ArrayList<>();
        }
        this.groupId.add(groupIdItem);
        return this;
    }

    public ListTemplateGroupRequest withGroupId(Consumer<List<String>> groupIdSetter) {
        if (this.groupId == null) {
            this.groupId = new ArrayList<>();
        }
        groupIdSetter.accept(this.groupId);
        return this;
    }

    /**
     * 转码模板组ID，最多10个 
     * @return groupId
     */
    public List<String> getGroupId() {
        return groupId;
    }

    public void setGroupId(List<String> groupId) {
        this.groupId = groupId;
    }

    public ListTemplateGroupRequest withGroupName(List<String> groupName) {
        this.groupName = groupName;
        return this;
    }

    public ListTemplateGroupRequest addGroupNameItem(String groupNameItem) {
        if (this.groupName == null) {
            this.groupName = new ArrayList<>();
        }
        this.groupName.add(groupNameItem);
        return this;
    }

    public ListTemplateGroupRequest withGroupName(Consumer<List<String>> groupNameSetter) {
        if (this.groupName == null) {
            this.groupName = new ArrayList<>();
        }
        groupNameSetter.accept(this.groupName);
        return this;
    }

    /**
     * 转码模板组名，最多10个 
     * @return groupName
     */
    public List<String> getGroupName() {
        return groupName;
    }

    public void setGroupName(List<String> groupName) {
        this.groupName = groupName;
    }

    public ListTemplateGroupRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 分页编号。查询指定“group_id”时，该参数无效。  默认值：0。 
     * minimum: 0
     * maximum: 50000
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListTemplateGroupRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 每页记录数。取值范围：[1,100]，指定group_id时该参数无效。 
     * minimum: 1
     * maximum: 1000
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTemplateGroupRequest listTemplateGroupRequest = (ListTemplateGroupRequest) o;
        return Objects.equals(this.groupId, listTemplateGroupRequest.groupId)
            && Objects.equals(this.groupName, listTemplateGroupRequest.groupName)
            && Objects.equals(this.page, listTemplateGroupRequest.page)
            && Objects.equals(this.size, listTemplateGroupRequest.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, page, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplateGroupRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
