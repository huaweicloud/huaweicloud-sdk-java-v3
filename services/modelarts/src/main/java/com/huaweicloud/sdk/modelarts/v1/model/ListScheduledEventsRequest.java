package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListScheduledEventsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspaceId")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private List<String> state = null;

    public ListScheduledEventsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID，默认值为0，取值于查询workspaces列表的接口的id字段。 **约束限制**：系统自动生成，只能以小写字母开头，数字、中划线组成，不能以中划线结尾，且长小于63个字符。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListScheduledEventsRequest withState(List<String> state) {
        this.state = state;
        return this;
    }

    public ListScheduledEventsRequest addStateItem(String stateItem) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(stateItem);
        return this;
    }

    public ListScheduledEventsRequest withState(Consumer<List<String>> stateSetter) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        stateSetter.accept(this.state);
        return this;
    }

    /**
     * **参数解释**：事件状态。 **约束限制**：不涉及。 **取值范围**：可选择值如下： - inquiring: 待授权, - scheduled: 待执行 - executing: 执行中 - completed: 执行成功 - failed: 执行失败 - canceled: 取消 **默认取值**：不涉及。
     * @return state
     */
    public List<String> getState() {
        return state;
    }

    public void setState(List<String> state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScheduledEventsRequest that = (ListScheduledEventsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledEventsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
