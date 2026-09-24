package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListOpsEvaluationTaskCustomLabelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<OpsTaskCustomLabel> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListOpsEvaluationTaskCustomLabelsResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * **参数解释：** 提示信息。 **约束限制：** 不涉及。 **取值范围：** 固定为 query succeed。 **默认取值：** 不涉及。 
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ListOpsEvaluationTaskCustomLabelsResponse withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释：** 业务状态码。 **约束限制：** 不涉及。 **取值范围：** 固定为 200。 **默认取值：** 不涉及。 
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ListOpsEvaluationTaskCustomLabelsResponse withData(List<OpsTaskCustomLabel> data) {
        this.data = data;
        return this;
    }

    public ListOpsEvaluationTaskCustomLabelsResponse addDataItem(OpsTaskCustomLabel dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListOpsEvaluationTaskCustomLabelsResponse withData(Consumer<List<OpsTaskCustomLabel>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释：** 自定义标签记录列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return data
     */
    public List<OpsTaskCustomLabel> getData() {
        return data;
    }

    public void setData(List<OpsTaskCustomLabel> data) {
        this.data = data;
    }

    public ListOpsEvaluationTaskCustomLabelsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 满足查询条件的记录总数。 **约束限制：** 不涉及。 **取值范围：** 非负整数。 **默认取值：** 不涉及。 
     * minimum: 0
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluationTaskCustomLabelsResponse that = (ListOpsEvaluationTaskCustomLabelsResponse) obj;
        return Objects.equals(this.msg, that.msg) && Objects.equals(this.code, that.code)
            && Objects.equals(this.data, that.data) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msg, code, data, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluationTaskCustomLabelsResponse {\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
