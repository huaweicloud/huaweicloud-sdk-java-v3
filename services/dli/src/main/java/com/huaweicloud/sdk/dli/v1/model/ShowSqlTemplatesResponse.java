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
public class ShowSqlTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_count")

    private Integer sqlCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sqls")

    private List<SqlsResp> sqls = null;

    public ShowSqlTemplatesResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 是否成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowSqlTemplatesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。执行失败时，用于显示执行失败的原因。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowSqlTemplatesResponse withSqlCount(Integer sqlCount) {
        this.sqlCount = sqlCount;
        return this;
    }

    /**
     * SQL模板总数。
     * @return sqlCount
     */
    public Integer getSqlCount() {
        return sqlCount;
    }

    public void setSqlCount(Integer sqlCount) {
        this.sqlCount = sqlCount;
    }

    public ShowSqlTemplatesResponse withSqls(List<SqlsResp> sqls) {
        this.sqls = sqls;
        return this;
    }

    public ShowSqlTemplatesResponse addSqlsItem(SqlsResp sqlsItem) {
        if (this.sqls == null) {
            this.sqls = new ArrayList<>();
        }
        this.sqls.add(sqlsItem);
        return this;
    }

    public ShowSqlTemplatesResponse withSqls(Consumer<List<SqlsResp>> sqlsSetter) {
        if (this.sqls == null) {
            this.sqls = new ArrayList<>();
        }
        sqlsSetter.accept(this.sqls);
        return this;
    }

    /**
     * Get sqls
     * @return sqls
     */
    public List<SqlsResp> getSqls() {
        return sqls;
    }

    public void setSqls(List<SqlsResp> sqls) {
        this.sqls = sqls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSqlTemplatesResponse that = (ShowSqlTemplatesResponse) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.sqlCount, that.sqlCount) && Objects.equals(this.sqls, that.sqls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, sqlCount, sqls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlTemplatesResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    sqlCount: ").append(toIndentedString(sqlCount)).append("\n");
        sb.append("    sqls: ").append(toIndentedString(sqls)).append("\n");
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
