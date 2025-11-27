package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 分组的关联配置信息，比如对应的APM的配置信息。 **取值范围：** 不涉及。
 */
public class GroupRmsResourceRelationCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmdb_resource_id_list")

    private List<String> cmdbResourceIdList = null;

    public GroupRmsResourceRelationCreateRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** CloudCMDB分配的分组uuid。 **取值范围：** 不涉及。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public GroupRmsResourceRelationCreateRequest withCmdbResourceIdList(List<String> cmdbResourceIdList) {
        this.cmdbResourceIdList = cmdbResourceIdList;
        return this;
    }

    public GroupRmsResourceRelationCreateRequest addCmdbResourceIdListItem(String cmdbResourceIdListItem) {
        if (this.cmdbResourceIdList == null) {
            this.cmdbResourceIdList = new ArrayList<>();
        }
        this.cmdbResourceIdList.add(cmdbResourceIdListItem);
        return this;
    }

    public GroupRmsResourceRelationCreateRequest withCmdbResourceIdList(
        Consumer<List<String>> cmdbResourceIdListSetter) {
        if (this.cmdbResourceIdList == null) {
            this.cmdbResourceIdList = new ArrayList<>();
        }
        cmdbResourceIdListSetter.accept(this.cmdbResourceIdList);
        return this;
    }

    /**
     * **参数解释：** CloudCMDB分配的RMS资源uuid列表。 **取值范围：** 不涉及。
     * @return cmdbResourceIdList
     */
    public List<String> getCmdbResourceIdList() {
        return cmdbResourceIdList;
    }

    public void setCmdbResourceIdList(List<String> cmdbResourceIdList) {
        this.cmdbResourceIdList = cmdbResourceIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupRmsResourceRelationCreateRequest that = (GroupRmsResourceRelationCreateRequest) obj;
        return Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.cmdbResourceIdList, that.cmdbResourceIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, cmdbResourceIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupRmsResourceRelationCreateRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    cmdbResourceIdList: ").append(toIndentedString(cmdbResourceIdList)).append("\n");
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
