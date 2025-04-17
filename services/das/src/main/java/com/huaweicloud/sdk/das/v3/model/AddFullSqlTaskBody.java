package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddFullSqlTaskBody
 */
public class AddFullSqlTaskBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_list")

    private List<String> userList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword_list")

    private List<String> keywordList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_list")

    private List<String> dbList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_list")

    private List<String> operationList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id_list")

    private List<String> threadIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_list")

    private List<String> statusList = null;

    public AddFullSqlTaskBody withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库引擎
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public AddFullSqlTaskBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID，有值时创建节点维度任务
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public AddFullSqlTaskBody withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 开始时间（Unix timestamp），单位：毫秒
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public AddFullSqlTaskBody withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 结束时间（Unix timestamp），单位：毫秒
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public AddFullSqlTaskBody withUserList(List<String> userList) {
        this.userList = userList;
        return this;
    }

    public AddFullSqlTaskBody addUserListItem(String userListItem) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        this.userList.add(userListItem);
        return this;
    }

    public AddFullSqlTaskBody withUserList(Consumer<List<String>> userListSetter) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        userListSetter.accept(this.userList);
        return this;
    }

    /**
     * 用户名列表，最大长度20
     * @return userList
     */
    public List<String> getUserList() {
        return userList;
    }

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }

    public AddFullSqlTaskBody withKeywordList(List<String> keywordList) {
        this.keywordList = keywordList;
        return this;
    }

    public AddFullSqlTaskBody addKeywordListItem(String keywordListItem) {
        if (this.keywordList == null) {
            this.keywordList = new ArrayList<>();
        }
        this.keywordList.add(keywordListItem);
        return this;
    }

    public AddFullSqlTaskBody withKeywordList(Consumer<List<String>> keywordListSetter) {
        if (this.keywordList == null) {
            this.keywordList = new ArrayList<>();
        }
        keywordListSetter.accept(this.keywordList);
        return this;
    }

    /**
     * 关键字列表，最大长度20
     * @return keywordList
     */
    public List<String> getKeywordList() {
        return keywordList;
    }

    public void setKeywordList(List<String> keywordList) {
        this.keywordList = keywordList;
    }

    public AddFullSqlTaskBody withDbList(List<String> dbList) {
        this.dbList = dbList;
        return this;
    }

    public AddFullSqlTaskBody addDbListItem(String dbListItem) {
        if (this.dbList == null) {
            this.dbList = new ArrayList<>();
        }
        this.dbList.add(dbListItem);
        return this;
    }

    public AddFullSqlTaskBody withDbList(Consumer<List<String>> dbListSetter) {
        if (this.dbList == null) {
            this.dbList = new ArrayList<>();
        }
        dbListSetter.accept(this.dbList);
        return this;
    }

    /**
     * 数据库列表，最大长度20
     * @return dbList
     */
    public List<String> getDbList() {
        return dbList;
    }

    public void setDbList(List<String> dbList) {
        this.dbList = dbList;
    }

    public AddFullSqlTaskBody withOperationList(List<String> operationList) {
        this.operationList = operationList;
        return this;
    }

    public AddFullSqlTaskBody addOperationListItem(String operationListItem) {
        if (this.operationList == null) {
            this.operationList = new ArrayList<>();
        }
        this.operationList.add(operationListItem);
        return this;
    }

    public AddFullSqlTaskBody withOperationList(Consumer<List<String>> operationListSetter) {
        if (this.operationList == null) {
            this.operationList = new ArrayList<>();
        }
        operationListSetter.accept(this.operationList);
        return this;
    }

    /**
     * 操作类型列表，最大长度20
     * @return operationList
     */
    public List<String> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<String> operationList) {
        this.operationList = operationList;
    }

    public AddFullSqlTaskBody withThreadIdList(List<String> threadIdList) {
        this.threadIdList = threadIdList;
        return this;
    }

    public AddFullSqlTaskBody addThreadIdListItem(String threadIdListItem) {
        if (this.threadIdList == null) {
            this.threadIdList = new ArrayList<>();
        }
        this.threadIdList.add(threadIdListItem);
        return this;
    }

    public AddFullSqlTaskBody withThreadIdList(Consumer<List<String>> threadIdListSetter) {
        if (this.threadIdList == null) {
            this.threadIdList = new ArrayList<>();
        }
        threadIdListSetter.accept(this.threadIdList);
        return this;
    }

    /**
     * 线程id列表，最大长度20
     * @return threadIdList
     */
    public List<String> getThreadIdList() {
        return threadIdList;
    }

    public void setThreadIdList(List<String> threadIdList) {
        this.threadIdList = threadIdList;
    }

    public AddFullSqlTaskBody withStatusList(List<String> statusList) {
        this.statusList = statusList;
        return this;
    }

    public AddFullSqlTaskBody addStatusListItem(String statusListItem) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        this.statusList.add(statusListItem);
        return this;
    }

    public AddFullSqlTaskBody withStatusList(Consumer<List<String>> statusListSetter) {
        if (this.statusList == null) {
            this.statusList = new ArrayList<>();
        }
        statusListSetter.accept(this.statusList);
        return this;
    }

    /**
     * 执行状态列表，\"0\"为成功，\"1\"为失败，最大长度20
     * @return statusList
     */
    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddFullSqlTaskBody that = (AddFullSqlTaskBody) obj;
        return Objects.equals(this.datastoreType, that.datastoreType) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.startAt, that.startAt) && Objects.equals(this.endAt, that.endAt)
            && Objects.equals(this.userList, that.userList) && Objects.equals(this.keywordList, that.keywordList)
            && Objects.equals(this.dbList, that.dbList) && Objects.equals(this.operationList, that.operationList)
            && Objects.equals(this.threadIdList, that.threadIdList) && Objects.equals(this.statusList, that.statusList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreType,
            nodeId,
            startAt,
            endAt,
            userList,
            keywordList,
            dbList,
            operationList,
            threadIdList,
            statusList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddFullSqlTaskBody {\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
        sb.append("    keywordList: ").append(toIndentedString(keywordList)).append("\n");
        sb.append("    dbList: ").append(toIndentedString(dbList)).append("\n");
        sb.append("    operationList: ").append(toIndentedString(operationList)).append("\n");
        sb.append("    threadIdList: ").append(toIndentedString(threadIdList)).append("\n");
        sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
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
