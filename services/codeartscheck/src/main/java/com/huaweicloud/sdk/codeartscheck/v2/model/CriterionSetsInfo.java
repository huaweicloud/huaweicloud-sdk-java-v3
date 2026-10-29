package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CriterionSetsInfo
 */
public class CriterionSetsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criterionSetList")

    private List<CriterionSetListV2Body> criterionSetList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public CriterionSetsInfo withCriterionSetList(List<CriterionSetListV2Body> criterionSetList) {
        this.criterionSetList = criterionSetList;
        return this;
    }

    public CriterionSetsInfo addCriterionSetListItem(CriterionSetListV2Body criterionSetListItem) {
        if (this.criterionSetList == null) {
            this.criterionSetList = new ArrayList<>();
        }
        this.criterionSetList.add(criterionSetListItem);
        return this;
    }

    public CriterionSetsInfo withCriterionSetList(Consumer<List<CriterionSetListV2Body>> criterionSetListSetter) {
        if (this.criterionSetList == null) {
            this.criterionSetList = new ArrayList<>();
        }
        criterionSetListSetter.accept(this.criterionSetList);
        return this;
    }

    /**
     * **参数解释：** 规则列表。 **取值范围：** 不涉及。
     * @return criterionSetList
     */
    public List<CriterionSetListV2Body> getCriterionSetList() {
        return criterionSetList;
    }

    public void setCriterionSetList(List<CriterionSetListV2Body> criterionSetList) {
        this.criterionSetList = criterionSetList;
    }

    public CriterionSetsInfo withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 规则总数。 **取值范围：** ≥0
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CriterionSetsInfo that = (CriterionSetsInfo) obj;
        return Objects.equals(this.criterionSetList, that.criterionSetList) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(criterionSetList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CriterionSetsInfo {\n");
        sb.append("    criterionSetList: ").append(toIndentedString(criterionSetList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
