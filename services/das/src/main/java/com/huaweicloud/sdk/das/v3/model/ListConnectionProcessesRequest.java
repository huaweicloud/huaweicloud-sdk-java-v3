package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListConnectionProcessesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db")

    private String db;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords")

    private String keywords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_all")

    private Boolean showAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_no_pid")

    private Boolean showNoPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private String perPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_page")

    private String curPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_role")

    private String nodeRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hide_sys")

    private Boolean hideSys;

    public ListConnectionProcessesRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 连接ID
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public ListConnectionProcessesRequest withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 指定用户
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ListConnectionProcessesRequest withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 指定访问来源
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ListConnectionProcessesRequest withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * 指定数据库
     * @return db
     */
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public ListConnectionProcessesRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 指定状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ListConnectionProcessesRequest withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 指定命令
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public ListConnectionProcessesRequest withKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * 模糊搜索条件
     * @return keywords
     */
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public ListConnectionProcessesRequest withShowAll(Boolean showAll) {
        this.showAll = showAll;
        return this;
    }

    /**
     * 是否显示全部
     * @return showAll
     */
    public Boolean getShowAll() {
        return showAll;
    }

    public void setShowAll(Boolean showAll) {
        this.showAll = showAll;
    }

    public ListConnectionProcessesRequest withShowNoPid(Boolean showNoPid) {
        this.showNoPid = showNoPid;
        return this;
    }

    /**
     * 是否显示没有后台进程的会话
     * @return showNoPid
     */
    public Boolean getShowNoPid() {
        return showNoPid;
    }

    public void setShowNoPid(Boolean showNoPid) {
        this.showNoPid = showNoPid;
    }

    public ListConnectionProcessesRequest withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 指定慢sql阈值
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ListConnectionProcessesRequest withPerPage(String perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 每页记录数
     * @return perPage
     */
    public String getPerPage() {
        return perPage;
    }

    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    public ListConnectionProcessesRequest withCurPage(String curPage) {
        this.curPage = curPage;
        return this;
    }

    /**
     * 页码
     * @return curPage
     */
    public String getCurPage() {
        return curPage;
    }

    public void setCurPage(String curPage) {
        this.curPage = curPage;
    }

    public ListConnectionProcessesRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 选择排序列
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListConnectionProcessesRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 排序顺序
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ListConnectionProcessesRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListConnectionProcessesRequest withNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
        return this;
    }

    /**
     * 节点类型
     * @return nodeRole
     */
    public String getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    public ListConnectionProcessesRequest withHideSys(Boolean hideSys) {
        this.hideSys = hideSys;
        return this;
    }

    /**
     * 是否过滤系统会话
     * @return hideSys
     */
    public Boolean getHideSys() {
        return hideSys;
    }

    public void setHideSys(Boolean hideSys) {
        this.hideSys = hideSys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConnectionProcessesRequest that = (ListConnectionProcessesRequest) obj;
        return Objects.equals(this.connectionId, that.connectionId) && Objects.equals(this.user, that.user)
            && Objects.equals(this.host, that.host) && Objects.equals(this.db, that.db)
            && Objects.equals(this.state, that.state) && Objects.equals(this.command, that.command)
            && Objects.equals(this.keywords, that.keywords) && Objects.equals(this.showAll, that.showAll)
            && Objects.equals(this.showNoPid, that.showNoPid) && Objects.equals(this.time, that.time)
            && Objects.equals(this.perPage, that.perPage) && Objects.equals(this.curPage, that.curPage)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.order, that.order)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.nodeRole, that.nodeRole)
            && Objects.equals(this.hideSys, that.hideSys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionId,
            user,
            host,
            db,
            state,
            command,
            keywords,
            showAll,
            showNoPid,
            time,
            perPage,
            curPage,
            orderBy,
            order,
            nodeId,
            nodeRole,
            hideSys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConnectionProcessesRequest {\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    showAll: ").append(toIndentedString(showAll)).append("\n");
        sb.append("    showNoPid: ").append(toIndentedString(showNoPid)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeRole: ").append(toIndentedString(nodeRole)).append("\n");
        sb.append("    hideSys: ").append(toIndentedString(hideSys)).append("\n");
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
