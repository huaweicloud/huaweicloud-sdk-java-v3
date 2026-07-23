package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 单个分数区间的统计信息。 **取值范围：** 不涉及。 
 */
public class OpsScoreCountItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private String score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public OpsScoreCountItem withScore(String score) {
        this.score = score;
        return this;
    }

    /**
     * **参数解释：** 评估得分值，保留两位小数。 **取值范围：** 0.00-1.00之间的字符串。 
     * @return score
     */
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public OpsScoreCountItem withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释：** 该得分对应的样本数量。 **取值范围：** 大于等于0的整数。 
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsScoreCountItem that = (OpsScoreCountItem) obj;
        return Objects.equals(this.score, that.score) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsScoreCountItem {\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
