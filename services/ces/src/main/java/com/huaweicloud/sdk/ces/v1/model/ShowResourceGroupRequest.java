package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowResourceGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dname")

    private String dname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    public ShowResourceGroupRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 资源分组ID。
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowResourceGroupRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 资源健康状态，值可为health、unhealth、no_alarm_rule；health表示健康，
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowResourceGroupRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /** 资源类型，即命名空间，如弹性云服务器的资源命名空间为：SYS.ECS；各服务命名空间可查看：“[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * 
     * @return namespace */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ShowResourceGroupRequest withDname(String dname) {
        this.dname = dname;
        return this;
    }

    /** 资源维度，如：弹性云服务器，则维度为instance_id，各资源的监控维度名称可查看：“[服务指标维度](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * 
     * @return dname */
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public ShowResourceGroupRequest withStart(String start) {
        this.start = start;
        return this;
    }

    /** 分页起始值，类型为integer，默认值为0。
     * 
     * @return start */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public ShowResourceGroupRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /** 单次查询的条数限制，取值范围(0,100]，默认值为100， 用于限制结果数据条数。
     * 
     * @return limit */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResourceGroupRequest showResourceGroupRequest = (ShowResourceGroupRequest) o;
        return Objects.equals(this.groupId, showResourceGroupRequest.groupId)
            && Objects.equals(this.status, showResourceGroupRequest.status)
            && Objects.equals(this.namespace, showResourceGroupRequest.namespace)
            && Objects.equals(this.dname, showResourceGroupRequest.dname)
            && Objects.equals(this.start, showResourceGroupRequest.start)
            && Objects.equals(this.limit, showResourceGroupRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, status, namespace, dname, start, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceGroupRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dname: ").append(toIndentedString(dname)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
