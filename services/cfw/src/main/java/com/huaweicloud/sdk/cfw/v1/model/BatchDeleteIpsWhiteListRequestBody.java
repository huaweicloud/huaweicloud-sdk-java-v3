package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteIpsWhiteListRequestBody
 */
public class BatchDeleteIpsWhiteListRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_ids")

    private List<String> listIds = null;

    public BatchDeleteIpsWhiteListRequestBody withListIds(List<String> listIds) {
        this.listIds = listIds;
        return this;
    }

    public BatchDeleteIpsWhiteListRequestBody addListIdsItem(String listIdsItem) {
        if (this.listIds == null) {
            this.listIds = new ArrayList<>();
        }
        this.listIds.add(listIdsItem);
        return this;
    }

    public BatchDeleteIpsWhiteListRequestBody withListIds(Consumer<List<String>> listIdsSetter) {
        if (this.listIds == null) {
            this.listIds = new ArrayList<>();
        }
        listIdsSetter.accept(this.listIds);
        return this;
    }

    /**
     * **参数解释**：  要删除的白名单ID列表  **约束限制**：  不涉及  **取值范围**：  不涉及  **默认取值**：  不涉及
     * @return listIds
     */
    public List<String> getListIds() {
        return listIds;
    }

    public void setListIds(List<String> listIds) {
        this.listIds = listIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteIpsWhiteListRequestBody that = (BatchDeleteIpsWhiteListRequestBody) obj;
        return Objects.equals(this.listIds, that.listIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteIpsWhiteListRequestBody {\n");
        sb.append("    listIds: ").append(toIndentedString(listIds)).append("\n");
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
