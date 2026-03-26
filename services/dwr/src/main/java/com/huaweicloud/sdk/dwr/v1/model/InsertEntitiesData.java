package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InsertEntitiesData
 */
public class InsertEntitiesData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_count")

    private Integer insertCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_ids")

    private List<Object> insertIds = null;

    public InsertEntitiesData withInsertCount(Integer insertCount) {
        this.insertCount = insertCount;
        return this;
    }

    /**
     * **参数解释：** 插入的entity数量。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return insertCount
     */
    public Integer getInsertCount() {
        return insertCount;
    }

    public void setInsertCount(Integer insertCount) {
        this.insertCount = insertCount;
    }

    public InsertEntitiesData withInsertIds(List<Object> insertIds) {
        this.insertIds = insertIds;
        return this;
    }

    public InsertEntitiesData addInsertIdsItem(Object insertIdsItem) {
        if (this.insertIds == null) {
            this.insertIds = new ArrayList<>();
        }
        this.insertIds.add(insertIdsItem);
        return this;
    }

    public InsertEntitiesData withInsertIds(Consumer<List<Object>> insertIdsSetter) {
        if (this.insertIds == null) {
            this.insertIds = new ArrayList<>();
        }
        insertIdsSetter.accept(this.insertIds);
        return this;
    }

    /**
     * **参数解释：** 插入成功的entity的primary_key。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return insertIds
     */
    public List<Object> getInsertIds() {
        return insertIds;
    }

    public void setInsertIds(List<Object> insertIds) {
        this.insertIds = insertIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InsertEntitiesData that = (InsertEntitiesData) obj;
        return Objects.equals(this.insertCount, that.insertCount) && Objects.equals(this.insertIds, that.insertIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(insertCount, insertIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InsertEntitiesData {\n");
        sb.append("    insertCount: ").append(toIndentedString(insertCount)).append("\n");
        sb.append("    insertIds: ").append(toIndentedString(insertIds)).append("\n");
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
