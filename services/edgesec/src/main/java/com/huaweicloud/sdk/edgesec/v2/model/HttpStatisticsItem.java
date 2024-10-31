package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HttpStatisticsItem
 */
public class HttpStatisticsItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_category")

    private String attackCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_num")

    private Long statNum;

    public HttpStatisticsItem withAttackCategory(String attackCategory) {
        this.attackCategory = attackCategory;
        return this;
    }

    /**
     * 攻击类别
     * @return attackCategory
     */
    public String getAttackCategory() {
        return attackCategory;
    }

    public void setAttackCategory(String attackCategory) {
        this.attackCategory = attackCategory;
    }

    public HttpStatisticsItem withStatNum(Long statNum) {
        this.statNum = statNum;
        return this;
    }

    /**
     * 统计数量
     * @return statNum
     */
    public Long getStatNum() {
        return statNum;
    }

    public void setStatNum(Long statNum) {
        this.statNum = statNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpStatisticsItem that = (HttpStatisticsItem) obj;
        return Objects.equals(this.attackCategory, that.attackCategory) && Objects.equals(this.statNum, that.statNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackCategory, statNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpStatisticsItem {\n");
        sb.append("    attackCategory: ").append(toIndentedString(attackCategory)).append("\n");
        sb.append("    statNum: ").append(toIndentedString(statNum)).append("\n");
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
