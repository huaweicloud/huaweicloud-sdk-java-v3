package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteAuraSqlStatementResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    public ExecuteAuraSqlStatementResponse withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * **参数解释**：执行SQL的响应信息。 **取值范围**： 异步或同步执行超时执行结果： ## StatementResponse - **status**（Integer）：请求整体执行状态。   - 0：成功。   - -1：失败。   - 1： 执行中。   - 2：执行完成但无结果集。   - 3：排队等待中。   - 4：语句未正常执行。 - **session_id**（String，UUID）：当前执行会话唯一标识。 - **statement_id**（String，UUID）：本次语句执行唯一标识。 同步执行正常返回结果： ## StatementResponse - **status**（Integer）：请求整体执行状态   - 0：成功。   - -1：失败。   - 1： 执行中。   - 2：执行完成但无结果集。   - 3：排队等待中。   - 4：语句未正常执行。 - **session_id**（String，UUID）：当前执行会话唯一标识。 - **statement_id**（String，UUID）：本次语句执行唯一标识。 - **results**（Array of StatementResult objects）：每条SQL执行结果。 --- ## StatementResult - **status**（String）：SQL执行状态。   - PGRES_TUPLES_OK：查询成功并含结果集。   - PGRES_COMMAND_OK：执行成功无结果。   - PGRES_FATAL_ERROR：执行失败。 - **statement_id**（String）：语句ID。 - **num_rows**（Integer）：查询结果总行数。 - **row_count**（Integer）：当前页实际返回行数。 - **page_no**（Integer）：当前页码。 - **page_count**（Integer）： 总页数。 - **err_code**（String）：错误码，0表示无错误，其他数值参见错误信息。 - **sql_state**（String）：SQL状态码。 - **message**（String）：执行信息或错误详情。 - **result_set**（Object，type: StatementResultSet）：仅查询成功时含有效数据，否则为空结构。 --- ## StatementResultSet - **columns**（Array of RowType objects）：列元数据列表。 - **rows**（Array of String arrays）：实际数据行，每行顺序与columns对应。 --- ## RowType - **name**（String）：列名。 - **table_id**（Integer）：表的ID。 - **column_id**（Integer）：列的ID。 - **format**（Integer）：格式。 - **type**（Integer）：PG类型OID。 - **size**（Integer）：大小。 - **type_mod**（Integer）：typemod。
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteAuraSqlStatementResponse that = (ExecuteAuraSqlStatementResponse) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteAuraSqlStatementResponse {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
