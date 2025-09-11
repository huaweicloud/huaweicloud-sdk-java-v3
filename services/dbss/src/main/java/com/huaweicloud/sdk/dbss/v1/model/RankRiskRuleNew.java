package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RankRiskRuleNew
 */
public class RankRiskRuleNew {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_rank")

    private Integer newRank;

    public RankRiskRuleNew withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RankRiskRuleNew withNewRank(Integer newRank) {
        this.newRank = newRank;
        return this;
    }

    /**
     * 优先级序号，从1开始越小优先级越高
     * @return newRank
     */
    public Integer getNewRank() {
        return newRank;
    }

    public void setNewRank(Integer newRank) {
        this.newRank = newRank;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RankRiskRuleNew that = (RankRiskRuleNew) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.newRank, that.newRank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, newRank);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RankRiskRuleNew {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    newRank: ").append(toIndentedString(newRank)).append("\n");
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
