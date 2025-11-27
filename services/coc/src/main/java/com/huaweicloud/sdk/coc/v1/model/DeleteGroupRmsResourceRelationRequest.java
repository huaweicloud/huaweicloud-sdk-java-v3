package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteGroupRmsResourceRelationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_list")

    private List<String> idList = null;

    public DeleteGroupRmsResourceRelationRequest withIdList(List<String> idList) {
        this.idList = idList;
        return this;
    }

    public DeleteGroupRmsResourceRelationRequest addIdListItem(String idListItem) {
        if (this.idList == null) {
            this.idList = new ArrayList<>();
        }
        this.idList.add(idListItem);
        return this;
    }

    public DeleteGroupRmsResourceRelationRequest withIdList(Consumer<List<String>> idListSetter) {
        if (this.idList == null) {
            this.idList = new ArrayList<>();
        }
        idListSetter.accept(this.idList);
        return this;
    }

    /**
     * **参数解释：** 分组id列表。 **约束限制：** 不涉及。 **取值范围：** 用户所选的资源所在的分组id组成的list。 **默认取值：** 不涉及。
     * @return idList
     */
    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteGroupRmsResourceRelationRequest that = (DeleteGroupRmsResourceRelationRequest) obj;
        return Objects.equals(this.idList, that.idList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteGroupRmsResourceRelationRequest {\n");
        sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
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
