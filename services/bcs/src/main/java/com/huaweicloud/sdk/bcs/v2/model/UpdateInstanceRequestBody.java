package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 添加节点和添加组织，添加组织是需要提供pvc_name */
public class UpdateInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_orgs")

    private List<NodeOrgs> nodeOrgs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicips")

    private List<IefNodeinfo> publicips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete_org")

    private Boolean isDeleteOrg;

    public UpdateInstanceRequestBody withNodeOrgs(List<NodeOrgs> nodeOrgs) {
        this.nodeOrgs = nodeOrgs;
        return this;
    }

    public UpdateInstanceRequestBody addNodeOrgsItem(NodeOrgs nodeOrgsItem) {
        if (this.nodeOrgs == null) {
            this.nodeOrgs = new ArrayList<>();
        }
        this.nodeOrgs.add(nodeOrgsItem);
        return this;
    }

    public UpdateInstanceRequestBody withNodeOrgs(Consumer<List<NodeOrgs>> nodeOrgsSetter) {
        if (this.nodeOrgs == null) {
            this.nodeOrgs = new ArrayList<>();
        }
        nodeOrgsSetter.accept(this.nodeOrgs);
        return this;
    }

    /** 添加节点的组织列表
     * 
     * @return nodeOrgs */
    public List<NodeOrgs> getNodeOrgs() {
        return nodeOrgs;
    }

    public void setNodeOrgs(List<NodeOrgs> nodeOrgs) {
        this.nodeOrgs = nodeOrgs;
    }

    public UpdateInstanceRequestBody withPublicips(List<IefNodeinfo> publicips) {
        this.publicips = publicips;
        return this;
    }

    public UpdateInstanceRequestBody addPublicipsItem(IefNodeinfo publicipsItem) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        this.publicips.add(publicipsItem);
        return this;
    }

    public UpdateInstanceRequestBody withPublicips(Consumer<List<IefNodeinfo>> publicipsSetter) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        publicipsSetter.accept(this.publicips);
        return this;
    }

    /** ief添加组织时，ief节点信息。绑定模式的IEF服务，新增组织时，该字段必填
     * 
     * @return publicips */
    public List<IefNodeinfo> getPublicips() {
        return publicips;
    }

    public void setPublicips(List<IefNodeinfo> publicips) {
        this.publicips = publicips;
    }

    public UpdateInstanceRequestBody withIsDeleteOrg(Boolean isDeleteOrg) {
        this.isDeleteOrg = isDeleteOrg;
        return this;
    }

    /** 是否是删除组织
     * 
     * @return isDeleteOrg */
    public Boolean getIsDeleteOrg() {
        return isDeleteOrg;
    }

    public void setIsDeleteOrg(Boolean isDeleteOrg) {
        this.isDeleteOrg = isDeleteOrg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceRequestBody updateInstanceRequestBody = (UpdateInstanceRequestBody) o;
        return Objects.equals(this.nodeOrgs, updateInstanceRequestBody.nodeOrgs)
            && Objects.equals(this.publicips, updateInstanceRequestBody.publicips)
            && Objects.equals(this.isDeleteOrg, updateInstanceRequestBody.isDeleteOrg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeOrgs, publicips, isDeleteOrg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceRequestBody {\n");
        sb.append("    nodeOrgs: ").append(toIndentedString(nodeOrgs)).append("\n");
        sb.append("    publicips: ").append(toIndentedString(publicips)).append("\n");
        sb.append("    isDeleteOrg: ").append(toIndentedString(isDeleteOrg)).append("\n");
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
