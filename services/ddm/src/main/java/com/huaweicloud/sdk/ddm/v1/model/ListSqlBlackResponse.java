package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListSqlBlackResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_black_list_full_check")

    private String sqlBlackListFullCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_black_list_prefix_check")

    private String sqlBlackListPrefixCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_black_list_regex_check")

    private String sqlBlackListRegexCheck;

    public ListSqlBlackResponse withSqlBlackListFullCheck(String sqlBlackListFullCheck) {
        this.sqlBlackListFullCheck = sqlBlackListFullCheck;
        return this;
    }

    /**
     * **参数解释**：  全量匹配sql黑名单。  **参数范围**：  不涉及。
     * @return sqlBlackListFullCheck
     */
    public String getSqlBlackListFullCheck() {
        return sqlBlackListFullCheck;
    }

    public void setSqlBlackListFullCheck(String sqlBlackListFullCheck) {
        this.sqlBlackListFullCheck = sqlBlackListFullCheck;
    }

    public ListSqlBlackResponse withSqlBlackListPrefixCheck(String sqlBlackListPrefixCheck) {
        this.sqlBlackListPrefixCheck = sqlBlackListPrefixCheck;
        return this;
    }

    /**
     * **参数解释**：  前缀匹配sql黑名单。  **参数范围**：  不涉及。
     * @return sqlBlackListPrefixCheck
     */
    public String getSqlBlackListPrefixCheck() {
        return sqlBlackListPrefixCheck;
    }

    public void setSqlBlackListPrefixCheck(String sqlBlackListPrefixCheck) {
        this.sqlBlackListPrefixCheck = sqlBlackListPrefixCheck;
    }

    public ListSqlBlackResponse withSqlBlackListRegexCheck(String sqlBlackListRegexCheck) {
        this.sqlBlackListRegexCheck = sqlBlackListRegexCheck;
        return this;
    }

    /**
     * **参数解释**：  正则匹配sql黑名单。  **参数范围**：  不涉及。
     * @return sqlBlackListRegexCheck
     */
    public String getSqlBlackListRegexCheck() {
        return sqlBlackListRegexCheck;
    }

    public void setSqlBlackListRegexCheck(String sqlBlackListRegexCheck) {
        this.sqlBlackListRegexCheck = sqlBlackListRegexCheck;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlBlackResponse that = (ListSqlBlackResponse) obj;
        return Objects.equals(this.sqlBlackListFullCheck, that.sqlBlackListFullCheck)
            && Objects.equals(this.sqlBlackListPrefixCheck, that.sqlBlackListPrefixCheck)
            && Objects.equals(this.sqlBlackListRegexCheck, that.sqlBlackListRegexCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlBlackListFullCheck, sqlBlackListPrefixCheck, sqlBlackListRegexCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlBlackResponse {\n");
        sb.append("    sqlBlackListFullCheck: ").append(toIndentedString(sqlBlackListFullCheck)).append("\n");
        sb.append("    sqlBlackListPrefixCheck: ").append(toIndentedString(sqlBlackListPrefixCheck)).append("\n");
        sb.append("    sqlBlackListRegexCheck: ").append(toIndentedString(sqlBlackListRegexCheck)).append("\n");
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
