package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSqlSampleTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sqls")

    private List<SqlsSampleResp> sqls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sqlCount")

    private Integer sqlCount;

    public ShowSqlSampleTemplatesResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 请求执行是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowSqlSampleTemplatesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowSqlSampleTemplatesResponse withSqls(List<SqlsSampleResp> sqls) {
        this.sqls = sqls;
        return this;
    }

    public ShowSqlSampleTemplatesResponse addSqlsItem(SqlsSampleResp sqlsItem) {
        if (this.sqls == null) {
            this.sqls = new ArrayList<>();
        }
        this.sqls.add(sqlsItem);
        return this;
    }

    public ShowSqlSampleTemplatesResponse withSqls(Consumer<List<SqlsSampleResp>> sqlsSetter) {
        if (this.sqls == null) {
            this.sqls = new ArrayList<>();
        }
        sqlsSetter.accept(this.sqls);
        return this;
    }

    /**
     * 样例模板信息。
     * @return sqls
     */
    public List<SqlsSampleResp> getSqls() {
        return sqls;
    }

    public void setSqls(List<SqlsSampleResp> sqls) {
        this.sqls = sqls;
    }

    public ShowSqlSampleTemplatesResponse withSqlCount(Integer sqlCount) {
        this.sqlCount = sqlCount;
        return this;
    }

    /**
     * 样例模板个数。
     * @return sqlCount
     */
    public Integer getSqlCount() {
        return sqlCount;
    }

    public void setSqlCount(Integer sqlCount) {
        this.sqlCount = sqlCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSqlSampleTemplatesResponse that = (ShowSqlSampleTemplatesResponse) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.sqls, that.sqls) && Objects.equals(this.sqlCount, that.sqlCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, sqls, sqlCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlSampleTemplatesResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    sqls: ").append(toIndentedString(sqls)).append("\n");
        sb.append("    sqlCount: ").append(toIndentedString(sqlCount)).append("\n");
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
