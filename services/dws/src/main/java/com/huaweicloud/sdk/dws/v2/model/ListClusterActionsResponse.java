package com.huaweicloud.sdk.dws.v2.model;

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
public class ListClusterActionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name")

    private String actionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submit_time")

    private String submitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<ActionItemVo> items = null;

    public ListClusterActionsResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 任务详情响应体。 **取值范围**： 随机生成的UUID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListClusterActionsResponse withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * **参数解释**： 任务名称，同入参字段。 **取值范围**： 不涉及。
     * @return actionName
     */
    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public ListClusterActionsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 任务状态。 **取值范围**： - SUCCESS：成功。 - RUNNING：运行中。 - WAITING：等待中。 - FAILED：失败。 - ROLLBACK_RUNNING：回滚运行中。 - ROLLBACK_SUCCESS：回滚成功。 - ROLLBACK_FAIL：回滚失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListClusterActionsResponse withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**： 集群名称。 **取值范围**： 不涉及。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ListClusterActionsResponse withSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    /**
     * **参数解释**： 任务提交时间。 **取值范围**： 不涉及。
     * @return submitTime
     */
    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public ListClusterActionsResponse withItems(List<ActionItemVo> items) {
        this.items = items;
        return this;
    }

    public ListClusterActionsResponse addItemsItem(ActionItemVo itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListClusterActionsResponse withItems(Consumer<List<ActionItemVo>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * **参数解释**： 任务详情子项。 **取值范围**： 不涉及。
     * @return items
     */
    public List<ActionItemVo> getItems() {
        return items;
    }

    public void setItems(List<ActionItemVo> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterActionsResponse that = (ListClusterActionsResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.actionName, that.actionName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.submitTime, that.submitTime) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, actionName, status, clusterName, submitTime, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterActionsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
