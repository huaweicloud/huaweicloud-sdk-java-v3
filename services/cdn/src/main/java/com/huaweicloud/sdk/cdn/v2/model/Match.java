package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 规则匹配条件 **约束限制：** 不涉及
 */
public class Match {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic")

    private String logic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criteria")

    private List<CriteriaItem> criteria = null;

    public Match withLogic(String logic) {
        this.logic = logic;
        return this;
    }

    /**
     * **参数解释：** 逻辑运算符 **约束限制：** 不涉及 **取值范围：** - and: 与关系 - or: 或关系 **默认取值：** 不涉及
     * @return logic
     */
    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }

    public Match withCriteria(List<CriteriaItem> criteria) {
        this.criteria = criteria;
        return this;
    }

    public Match addCriteriaItem(CriteriaItem criteriaItem) {
        if (this.criteria == null) {
            this.criteria = new ArrayList<>();
        }
        this.criteria.add(criteriaItem);
        return this;
    }

    public Match withCriteria(Consumer<List<CriteriaItem>> criteriaSetter) {
        if (this.criteria == null) {
            this.criteria = new ArrayList<>();
        }
        criteriaSetter.accept(this.criteria);
        return this;
    }

    /**
     * **参数解释：** 匹配条件列表 **约束限制：** 不涉及
     * @return criteria
     */
    public List<CriteriaItem> getCriteria() {
        return criteria;
    }

    public void setCriteria(List<CriteriaItem> criteria) {
        this.criteria = criteria;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Match that = (Match) obj;
        return Objects.equals(this.logic, that.logic) && Objects.equals(this.criteria, that.criteria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logic, criteria);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Match {\n");
        sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
        sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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
