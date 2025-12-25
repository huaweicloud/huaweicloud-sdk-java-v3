package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量关联数据对象请求body体
 */
public class BatchCreateDataobjectRelationsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataobject_ids")

    private List<String> dataobjectIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_dataobject_ids")

    private List<String> relatedDataobjectIds = null;

    public BatchCreateDataobjectRelationsRequestBody withDataobjectIds(List<String> dataobjectIds) {
        this.dataobjectIds = dataobjectIds;
        return this;
    }

    public BatchCreateDataobjectRelationsRequestBody addDataobjectIdsItem(String dataobjectIdsItem) {
        if (this.dataobjectIds == null) {
            this.dataobjectIds = new ArrayList<>();
        }
        this.dataobjectIds.add(dataobjectIdsItem);
        return this;
    }

    public BatchCreateDataobjectRelationsRequestBody withDataobjectIds(Consumer<List<String>> dataobjectIdsSetter) {
        if (this.dataobjectIds == null) {
            this.dataobjectIds = new ArrayList<>();
        }
        dataobjectIdsSetter.accept(this.dataobjectIds);
        return this;
    }

    /**
     * 关联数据对象的ID列表
     * @return dataobjectIds
     */
    public List<String> getDataobjectIds() {
        return dataobjectIds;
    }

    public void setDataobjectIds(List<String> dataobjectIds) {
        this.dataobjectIds = dataobjectIds;
    }

    public BatchCreateDataobjectRelationsRequestBody withRelatedDataobjectIds(List<String> relatedDataobjectIds) {
        this.relatedDataobjectIds = relatedDataobjectIds;
        return this;
    }

    public BatchCreateDataobjectRelationsRequestBody addRelatedDataobjectIdsItem(String relatedDataobjectIdsItem) {
        if (this.relatedDataobjectIds == null) {
            this.relatedDataobjectIds = new ArrayList<>();
        }
        this.relatedDataobjectIds.add(relatedDataobjectIdsItem);
        return this;
    }

    public BatchCreateDataobjectRelationsRequestBody withRelatedDataobjectIds(
        Consumer<List<String>> relatedDataobjectIdsSetter) {
        if (this.relatedDataobjectIds == null) {
            this.relatedDataobjectIds = new ArrayList<>();
        }
        relatedDataobjectIdsSetter.accept(this.relatedDataobjectIds);
        return this;
    }

    /**
     * 被关联数据对象的ID列表
     * @return relatedDataobjectIds
     */
    public List<String> getRelatedDataobjectIds() {
        return relatedDataobjectIds;
    }

    public void setRelatedDataobjectIds(List<String> relatedDataobjectIds) {
        this.relatedDataobjectIds = relatedDataobjectIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateDataobjectRelationsRequestBody that = (BatchCreateDataobjectRelationsRequestBody) obj;
        return Objects.equals(this.dataobjectIds, that.dataobjectIds)
            && Objects.equals(this.relatedDataobjectIds, that.relatedDataobjectIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataobjectIds, relatedDataobjectIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateDataobjectRelationsRequestBody {\n");
        sb.append("    dataobjectIds: ").append(toIndentedString(dataobjectIds)).append("\n");
        sb.append("    relatedDataobjectIds: ").append(toIndentedString(relatedDataobjectIds)).append("\n");
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
