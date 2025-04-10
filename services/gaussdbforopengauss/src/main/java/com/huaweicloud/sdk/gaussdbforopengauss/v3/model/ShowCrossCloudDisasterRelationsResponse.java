package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCrossCloudDisasterRelationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relations")

    private List<DisasterRelations> relations = null;

    public ShowCrossCloudDisasterRelationsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询结果总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowCrossCloudDisasterRelationsResponse withRelations(List<DisasterRelations> relations) {
        this.relations = relations;
        return this;
    }

    public ShowCrossCloudDisasterRelationsResponse addRelationsItem(DisasterRelations relationsItem) {
        if (this.relations == null) {
            this.relations = new ArrayList<>();
        }
        this.relations.add(relationsItem);
        return this;
    }

    public ShowCrossCloudDisasterRelationsResponse withRelations(Consumer<List<DisasterRelations>> relationsSetter) {
        if (this.relations == null) {
            this.relations = new ArrayList<>();
        }
        relationsSetter.accept(this.relations);
        return this;
    }

    /**
     * 容灾关系详情。
     * @return relations
     */
    public List<DisasterRelations> getRelations() {
        return relations;
    }

    public void setRelations(List<DisasterRelations> relations) {
        this.relations = relations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCrossCloudDisasterRelationsResponse that = (ShowCrossCloudDisasterRelationsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.relations, that.relations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, relations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCrossCloudDisasterRelationsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
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
