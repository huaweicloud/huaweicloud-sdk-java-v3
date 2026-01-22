package com.huaweicloud.sdk.rocketmq.v2.model;

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
public class DeleteRocketMqMigrationTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_task_list")

    private List<String> successTaskList = null;

    public DeleteRocketMqMigrationTaskResponse withSuccessTaskList(List<String> successTaskList) {
        this.successTaskList = successTaskList;
        return this;
    }

    public DeleteRocketMqMigrationTaskResponse addSuccessTaskListItem(String successTaskListItem) {
        if (this.successTaskList == null) {
            this.successTaskList = new ArrayList<>();
        }
        this.successTaskList.add(successTaskListItem);
        return this;
    }

    public DeleteRocketMqMigrationTaskResponse withSuccessTaskList(Consumer<List<String>> successTaskListSetter) {
        if (this.successTaskList == null) {
            this.successTaskList = new ArrayList<>();
        }
        successTaskListSetter.accept(this.successTaskList);
        return this;
    }

    /**
     * **参数解释**： 删除成功的任务列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及 **默认取值**： 不涉及。
     * @return successTaskList
     */
    public List<String> getSuccessTaskList() {
        return successTaskList;
    }

    public void setSuccessTaskList(List<String> successTaskList) {
        this.successTaskList = successTaskList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteRocketMqMigrationTaskResponse that = (DeleteRocketMqMigrationTaskResponse) obj;
        return Objects.equals(this.successTaskList, that.successTaskList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successTaskList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteRocketMqMigrationTaskResponse {\n");
        sb.append("    successTaskList: ").append(toIndentedString(successTaskList)).append("\n");
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
