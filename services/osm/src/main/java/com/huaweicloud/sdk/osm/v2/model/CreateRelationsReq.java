package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** CreateRelationsReq */
public class CreateRelationsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_id_list")

    private List<String> relatedIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    public CreateRelationsReq withRelatedIdList(List<String> relatedIdList) {
        this.relatedIdList = relatedIdList;
        return this;
    }

    public CreateRelationsReq addRelatedIdListItem(String relatedIdListItem) {
        if (this.relatedIdList == null) {
            this.relatedIdList = new ArrayList<>();
        }
        this.relatedIdList.add(relatedIdListItem);
        return this;
    }

    public CreateRelationsReq withRelatedIdList(Consumer<List<String>> relatedIdListSetter) {
        if (this.relatedIdList == null) {
            this.relatedIdList = new ArrayList<>();
        }
        relatedIdListSetter.accept(this.relatedIdList);
        return this;
    }

    /** 要关联的工单id列表，最多3个
     * 
     * @return relatedIdList */
    public List<String> getRelatedIdList() {
        return relatedIdList;
    }

    public void setRelatedIdList(List<String> relatedIdList) {
        this.relatedIdList = relatedIdList;
    }

    public CreateRelationsReq withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 组id
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRelationsReq createRelationsReq = (CreateRelationsReq) o;
        return Objects.equals(this.relatedIdList, createRelationsReq.relatedIdList)
            && Objects.equals(this.groupId, createRelationsReq.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relatedIdList, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRelationsReq {\n");
        sb.append("    relatedIdList: ").append(toIndentedString(relatedIdList)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
