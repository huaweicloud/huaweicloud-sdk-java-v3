package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SQL限流规则和最大并发数
 */
public class SqlFilterRulePattern {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private String pattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_concurrency")

    private Integer maxConcurrency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_concurrency")

    private Integer curConcurrency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_reject")

    private Integer curReject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_at")

    private Long expireAt;

    public SqlFilterRulePattern withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * **参数解释**：  SQL限流规则。  **取值范围**：  由一个或多个关键字（最多为128个关键字）组成，关键字之间通过\"~\"分隔符分开，如select~from~t1。规则中不能包含‘\\’、中英文逗号、‘~~’，不能以‘~’结尾。
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public SqlFilterRulePattern withMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * **参数解释**：  最大并发数。  **取值范围**：  不涉及。
     * @return maxConcurrency
     */
    public Integer getMaxConcurrency() {
        return maxConcurrency;
    }

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    public SqlFilterRulePattern withCurConcurrency(Integer curConcurrency) {
        this.curConcurrency = curConcurrency;
        return this;
    }

    /**
     * **参数解释**：  当前并发数。  **取值范围**：  0 - 4294967296。
     * minimum: 0
     * maximum: 4294967296
     * @return curConcurrency
     */
    public Integer getCurConcurrency() {
        return curConcurrency;
    }

    public void setCurConcurrency(Integer curConcurrency) {
        this.curConcurrency = curConcurrency;
    }

    public SqlFilterRulePattern withCurReject(Integer curReject) {
        this.curReject = curReject;
        return this;
    }

    /**
     * **参数解释**：  当前拦截次数。  **取值范围**：  0 - 4294967296。
     * minimum: 0
     * maximum: 4294967296
     * @return curReject
     */
    public Integer getCurReject() {
        return curReject;
    }

    public void setCurReject(Integer curReject) {
        this.curReject = curReject;
    }

    public SqlFilterRulePattern withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释**：  SQL限流规则创建时间。  **取值范围**：  0 - 9223372036854775807。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public SqlFilterRulePattern withExpireAt(Long expireAt) {
        this.expireAt = expireAt;
        return this;
    }

    /**
     * **参数解释**：  SQL限流规则失效时间。  **取值范围**：  0 - 9223372036854775807。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return expireAt
     */
    public Long getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(Long expireAt) {
        this.expireAt = expireAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlFilterRulePattern that = (SqlFilterRulePattern) obj;
        return Objects.equals(this.pattern, that.pattern) && Objects.equals(this.maxConcurrency, that.maxConcurrency)
            && Objects.equals(this.curConcurrency, that.curConcurrency)
            && Objects.equals(this.curReject, that.curReject) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.expireAt, that.expireAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern, maxConcurrency, curConcurrency, curReject, createAt, expireAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlFilterRulePattern {\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
        sb.append("    curConcurrency: ").append(toIndentedString(curConcurrency)).append("\n");
        sb.append("    curReject: ").append(toIndentedString(curReject)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
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
