package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 节点数据源请求内容 */
public class NodeContentReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sqllist")

    private List<String> sqllist = null;

    public NodeContentReq withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 节点实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public NodeContentReq withSqllist(List<String> sqllist) {
        this.sqllist = sqllist;
        return this;
    }

    public NodeContentReq addSqllistItem(String sqllistItem) {
        if (this.sqllist == null) {
            this.sqllist = new ArrayList<>();
        }
        this.sqllist.add(sqllistItem);
        return this;
    }

    public NodeContentReq withSqllist(Consumer<List<String>> sqllistSetter) {
        if (this.sqllist == null) {
            this.sqllist = new ArrayList<>();
        }
        sqllistSetter.accept(this.sqllist);
        return this;
    }

    /** SQL列表，将指定边缘平台节点的数字孪生模型实例数据转发到中心平台节点。
     * 
     * @return sqllist */
    public List<String> getSqllist() {
        return sqllist;
    }

    public void setSqllist(List<String> sqllist) {
        this.sqllist = sqllist;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeContentReq nodeContentReq = (NodeContentReq) o;
        return Objects.equals(this.instanceId, nodeContentReq.instanceId)
            && Objects.equals(this.sqllist, nodeContentReq.sqllist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, sqllist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeContentReq {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    sqllist: ").append(toIndentedString(sqllist)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
