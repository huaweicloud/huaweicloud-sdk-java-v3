package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListEvolveTaskMetasRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_id")

    private String algorithmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_list")

    private List<String> statusList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListEvolveTaskMetasRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * **参数解释**： 排序规则，目前默认创建时间降序。 **约束限制**： 不涉及 **取值范围**： - DESC：降序 - ASC：升序 **默认取值**： DESC 
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListEvolveTaskMetasRequest withAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }

    /**
     * **参数解释**： 关联的算法设计项目。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return algorithmId;
    }

    public void setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
    }

    public ListEvolveTaskMetasRequest withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**： 任务名称。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ListEvolveTaskMetasRequest withStatusList(List<String> statusList) {
        this.statusList = statusList;
        return this;
    }

    public ListEvolveTaskMetasRequest addStatusListItem(String statusListItem) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        this.statusList.add(statusListItem);
        return this;
    }

    public ListEvolveTaskMetasRequest withStatusList(Consumer<List<String>> statusListSetter) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        statusListSetter.accept(this.statusList);
        return this;
    }

    /**
     * **参数解释**： 任务状态列表。 **约束限制**： 不涉及 **取值范围**： - DRAFT：草稿 - PENDING：初始化 - RUNNING：运行中 - FINISHED：已完成 - STOPPED：已停止 - FAILED：失败 **默认取值**： 不涉及 
     * @return statusList
     */
    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

    public ListEvolveTaskMetasRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**： 用户名。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListEvolveTaskMetasRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 限制量，单次查询总量，必须由数字组成，默认为100，取值范围[1,1000]。 **约束限制**： 不涉及 **取值范围**： [1,1000] **默认取值**： 100 
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEvolveTaskMetasRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 偏移量，查询起始偏移，必须由数字组成，默认为0，取值范围[0,100000000]。 **约束限制**： 不涉及 **取值范围**： [0,100000000] **默认取值**： 0 
     * minimum: 0
     * maximum: 100000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEvolveTaskMetasRequest that = (ListEvolveTaskMetasRequest) obj;
        return Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.algorithmId, that.algorithmId)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.statusList, that.statusList)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortDir, algorithmId, taskName, statusList, userName, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEvolveTaskMetasRequest {\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    algorithmId: ").append(toIndentedString(algorithmId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
