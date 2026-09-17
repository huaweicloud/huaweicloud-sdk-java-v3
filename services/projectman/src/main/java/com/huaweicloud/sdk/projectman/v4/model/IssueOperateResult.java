package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作项操作返回值
 */
public class IssueOperateResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_time")

    private String operateTime;

    public IssueOperateResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 变更的工作项ID。 **取值范围**： 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IssueOperateResult withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * **参数解释**： 工作项变更人ID。 **取值范围**： 不涉及
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public IssueOperateResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**： 工作项的作废标识，枚举类型。 **取值范围**： - 正在工作：可正常操作的工作项 - 作废：软删除后的工作项，可在回收站恢复 - 删除：彻底删除后的工作项，无法恢复
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public IssueOperateResult withOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    /**
     * **参数解释**： 工作项变更时间。 **取值范围**： 不涉及
     * @return operateTime
     */
    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueOperateResult that = (IssueOperateResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.state, that.state) && Objects.equals(this.operateTime, that.operateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, operator, state, operateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueOperateResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
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
