package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpsertEntitiesData
 */
public class UpsertEntitiesData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upsert_count")

    private Integer upsertCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upsert_ids")

    private List<Object> upsertIds = null;

    public UpsertEntitiesData withUpsertCount(Integer upsertCount) {
        this.upsertCount = upsertCount;
        return this;
    }

    /**
     * **参数解释：** 更新的entity数量。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return upsertCount
     */
    public Integer getUpsertCount() {
        return upsertCount;
    }

    public void setUpsertCount(Integer upsertCount) {
        this.upsertCount = upsertCount;
    }

    public UpsertEntitiesData withUpsertIds(List<Object> upsertIds) {
        this.upsertIds = upsertIds;
        return this;
    }

    public UpsertEntitiesData addUpsertIdsItem(Object upsertIdsItem) {
        if (this.upsertIds == null) {
            this.upsertIds = new ArrayList<>();
        }
        this.upsertIds.add(upsertIdsItem);
        return this;
    }

    public UpsertEntitiesData withUpsertIds(Consumer<List<Object>> upsertIdsSetter) {
        if (this.upsertIds == null) {
            this.upsertIds = new ArrayList<>();
        }
        upsertIdsSetter.accept(this.upsertIds);
        return this;
    }

    /**
     * **参数解释：** 更新的entity数量。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return upsertIds
     */
    public List<Object> getUpsertIds() {
        return upsertIds;
    }

    public void setUpsertIds(List<Object> upsertIds) {
        this.upsertIds = upsertIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpsertEntitiesData that = (UpsertEntitiesData) obj;
        return Objects.equals(this.upsertCount, that.upsertCount) && Objects.equals(this.upsertIds, that.upsertIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upsertCount, upsertIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpsertEntitiesData {\n");
        sb.append("    upsertCount: ").append(toIndentedString(upsertCount)).append("\n");
        sb.append("    upsertIds: ").append(toIndentedString(upsertIds)).append("\n");
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
