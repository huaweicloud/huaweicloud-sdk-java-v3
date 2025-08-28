package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 需要删除的策略组ID列表信息
 */
public class DeletePolicyGroupRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_list")

    private List<String> idList = null;

    public DeletePolicyGroupRequestInfo withIdList(List<String> idList) {
        this.idList = idList;
        return this;
    }

    public DeletePolicyGroupRequestInfo addIdListItem(String idListItem) {
        if (this.idList == null) {
            this.idList = new ArrayList<>();
        }
        this.idList.add(idListItem);
        return this;
    }

    public DeletePolicyGroupRequestInfo withIdList(Consumer<List<String>> idListSetter) {
        if (this.idList == null) {
            this.idList = new ArrayList<>();
        }
        idListSetter.accept(this.idList);
        return this;
    }

    /**
     * **参数解释**: 需要被删除的策略组的策略组ID列表，仅支持删除非默认并且未关联服务器的策略组 **约束限制**: 需要使用 ListPolicyGroup 接口查询旗舰版和容器版策略组，在 ListPolicyGroup 接口的响应体中，deletable 等于 true 的 group_id 是可以被删除的策略组ID **取值范围**: 最少1条，最多50条 **默认取值**: 不涉及
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
        DeletePolicyGroupRequestInfo that = (DeletePolicyGroupRequestInfo) obj;
        return Objects.equals(this.idList, that.idList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePolicyGroupRequestInfo {\n");
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
