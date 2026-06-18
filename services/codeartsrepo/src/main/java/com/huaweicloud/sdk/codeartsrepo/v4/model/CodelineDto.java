package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 仓库近15日每日代码提交行数增减信息
 */
public class CodelineDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additions")

    private Integer additions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletions")

    private Integer deletions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    public CodelineDto withAdditions(Integer additions) {
        this.additions = additions;
        return this;
    }

    /**
     * **参数解释：** 增加行数。 **取值范围：** 最小0 **默认取值：** 0
     * minimum: 0
     * maximum: 2147483647
     * @return additions
     */
    public Integer getAdditions() {
        return additions;
    }

    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    public CodelineDto withDeletions(Integer deletions) {
        this.deletions = deletions;
        return this;
    }

    /**
     * **参数解释：** 删除行数。 **取值范围：** 最小0 **默认取值：** 0
     * minimum: 0
     * maximum: 2147483647
     * @return deletions
     */
    public Integer getDeletions() {
        return deletions;
    }

    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    public CodelineDto withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * **参数解释：** 日期，格式'yyyyMMdd',举例：20251030。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CodelineDto that = (CodelineDto) obj;
        return Objects.equals(this.additions, that.additions) && Objects.equals(this.deletions, that.deletions)
            && Objects.equals(this.date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additions, deletions, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodelineDto {\n");
        sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
