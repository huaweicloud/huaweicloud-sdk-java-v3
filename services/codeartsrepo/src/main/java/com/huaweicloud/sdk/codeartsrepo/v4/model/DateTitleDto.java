package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DateTitleDto
 */
public class DateTitleDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day")

    private String day;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commits_count")

    private Integer commitsCount;

    public DateTitleDto withDay(String day) {
        this.day = day;
        return this;
    }

    /**
     * 时间（天）
     * @return day
     */
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public DateTitleDto withCommitsCount(Integer commitsCount) {
        this.commitsCount = commitsCount;
        return this;
    }

    /**
     * 提交数量
     * minimum: 0
     * maximum: 100000
     * @return commitsCount
     */
    public Integer getCommitsCount() {
        return commitsCount;
    }

    public void setCommitsCount(Integer commitsCount) {
        this.commitsCount = commitsCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DateTitleDto that = (DateTitleDto) obj;
        return Objects.equals(this.day, that.day) && Objects.equals(this.commitsCount, that.commitsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, commitsCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DateTitleDto {\n");
        sb.append("    day: ").append(toIndentedString(day)).append("\n");
        sb.append("    commitsCount: ").append(toIndentedString(commitsCount)).append("\n");
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
