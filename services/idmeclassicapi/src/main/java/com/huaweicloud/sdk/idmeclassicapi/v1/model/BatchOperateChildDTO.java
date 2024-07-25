package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchOperateChildDTO
 */
public class BatchOperateChildDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "childList")

    private List<String> childList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parentId")

    private String parentId;

    public BatchOperateChildDTO withChildList(List<String> childList) {
        this.childList = childList;
        return this;
    }

    public BatchOperateChildDTO addChildListItem(String childListItem) {
        if (this.childList == null) {
            this.childList = new ArrayList<>();
        }
        this.childList.add(childListItem);
        return this;
    }

    public BatchOperateChildDTO withChildList(Consumer<List<String>> childListSetter) {
        if (this.childList == null) {
            this.childList = new ArrayList<>();
        }
        childListSetter.accept(this.childList);
        return this;
    }

    /**
     * **参数解释：**  子节点实例ID列表。  **约束限制：**  不涉及。  **取值范围：**  -9223372036854775808到9223372036854775807的整数。  **默认取值：**  不涉及。 
     * @return childList
     */
    public List<String> getChildList() {
        return childList;
    }

    public void setChildList(List<String> childList) {
        this.childList = childList;
    }

    public BatchOperateChildDTO withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释：**  父节点实例ID。  **约束限制：**  不涉及。  **取值范围：**  -9223372036854775808到9223372036854775807的整数。  **默认取值：**  不涉及。 
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchOperateChildDTO that = (BatchOperateChildDTO) obj;
        return Objects.equals(this.childList, that.childList) && Objects.equals(this.parentId, that.parentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(childList, parentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchOperateChildDTO {\n");
        sb.append("    childList: ").append(toIndentedString(childList)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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
