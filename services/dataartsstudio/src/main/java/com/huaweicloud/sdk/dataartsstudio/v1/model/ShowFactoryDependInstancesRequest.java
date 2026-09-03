package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowFactoryDependInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private Long instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation")

    private String relation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depth")

    private Integer depth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest")

    private Boolean latest;

    public ShowFactoryDependInstancesRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ShowFactoryDependInstancesRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 项目ID，获取方法请参见[项目ID和账号ID](projectid_accountid.xml)。  多project场景采用AK/SK认证的接口请求，则该字段必选。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public ShowFactoryDependInstancesRequest withInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 作业实例id，可通过作业实例列表接口获取。
     * @return instanceId
     */
    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public ShowFactoryDependInstancesRequest withRelation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * 支持选择查询实例的直接上游、直接下游或者是直接上下游，取值为 parent、child、both，默认为both。 - parent：直接上游实例 - child：直接下游实例 - both：直接上下游实例
     * @return relation
     */
    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public ShowFactoryDependInstancesRequest withDepth(Integer depth) {
        this.depth = depth;
        return this;
    }

    /**
     * 默认值为1, depth是上下游依赖查询的层级深度，例如 depth=1 只查直接依赖，depth=2 查到依赖的依赖。单次查询可返回的最大深度为50层。
     * @return depth
     */
    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public ShowFactoryDependInstancesRequest withLatest(Boolean latest) {
        this.latest = latest;
        return this;
    }

    /**
     * 默认值为true, 当latest=true的时候，控制是否只返回每个依赖任务的最新实例，true 时只返回endTime 最晚的执行记录，false 时返回所有历史实例。
     * @return latest
     */
    public Boolean getLatest() {
        return latest;
    }

    public void setLatest(Boolean latest) {
        this.latest = latest;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFactoryDependInstancesRequest that = (ShowFactoryDependInstancesRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.xProjectId, that.xProjectId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.relation, that.relation)
            && Objects.equals(this.depth, that.depth) && Objects.equals(this.latest, that.latest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, xProjectId, instanceId, relation, depth, latest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFactoryDependInstancesRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
        sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
        sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
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
