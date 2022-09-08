package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepoDailyCodeline
 */
public class RepoDailyCodeline {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additions")

    private Integer additions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletions")

    private Integer deletions;

    public RepoDailyCodeline withAdditions(Integer additions) {
        this.additions = additions;
        return this;
    }

    /**
     * 每日增加代码行
     * @return additions
     */
    public Integer getAdditions() {
        return additions;
    }

    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    public RepoDailyCodeline withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 日期
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public RepoDailyCodeline withDeletions(Integer deletions) {
        this.deletions = deletions;
        return this;
    }

    /**
     * 每日删除代码行
     * @return deletions
     */
    public Integer getDeletions() {
        return deletions;
    }

    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepoDailyCodeline repoDailyCodeline = (RepoDailyCodeline) o;
        return Objects.equals(this.additions, repoDailyCodeline.additions)
            && Objects.equals(this.date, repoDailyCodeline.date)
            && Objects.equals(this.deletions, repoDailyCodeline.deletions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additions, date, deletions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoDailyCodeline {\n");
        sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
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
