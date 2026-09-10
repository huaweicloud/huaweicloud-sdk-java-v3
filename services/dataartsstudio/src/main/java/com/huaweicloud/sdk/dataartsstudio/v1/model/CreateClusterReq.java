package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建集群的请求参数。
 */
public class CreateClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private Integer chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr_in_vpc")

    private String cidrInVpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspaces")

    private List<String> workspaces = null;

    public CreateClusterReq withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 新建的集群名称，名称只能包含数字、英文字母和下划线，但不能是纯数字，且不能以下划线开头。长度限制：1~128个字符。 说明：集群名称不区分大小写，系统会自动转换为小写。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CreateClusterReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 集群的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateClusterReq withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 集群规格。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public CreateClusterReq withChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 集群的收费模式。只能设置为“1”，表示按照CU时收费。
     * @return chargeMode
     */
    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    public CreateClusterReq withCidrInVpc(String cidrInVpc) {
        this.cidrInVpc = cidrInVpc;
        return this;
    }

    /**
     * 队列的虚拟私有云（VPC）的网段。建议使用网段：10.0.0.0/8~28，172.16.0.0/12~28，192.168.0.0/16~28。
     * @return cidrInVpc
     */
    public String getCidrInVpc() {
        return cidrInVpc;
    }

    public void setCidrInVpc(String cidrInVpc) {
        this.cidrInVpc = cidrInVpc;
    }

    public CreateClusterReq withWorkspaces(List<String> workspaces) {
        this.workspaces = workspaces;
        return this;
    }

    public CreateClusterReq addWorkspacesItem(String workspacesItem) {
        if (this.workspaces == null) {
            this.workspaces = new ArrayList<>();
        }
        this.workspaces.add(workspacesItem);
        return this;
    }

    public CreateClusterReq withWorkspaces(Consumer<List<String>> workspacesSetter) {
        if (this.workspaces == null) {
            this.workspaces = new ArrayList<>();
        }
        workspacesSetter.accept(this.workspaces);
        return this;
    }

    /**
     * 集群需要绑定的工作空间ID。
     * @return workspaces
     */
    public List<String> getWorkspaces() {
        return workspaces;
    }

    public void setWorkspaces(List<String> workspaces) {
        this.workspaces = workspaces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClusterReq that = (CreateClusterReq) obj;
        return Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.flavorId, that.flavorId) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.cidrInVpc, that.cidrInVpc) && Objects.equals(this.workspaces, that.workspaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterName, description, flavorId, chargeMode, cidrInVpc, workspaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterReq {\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    cidrInVpc: ").append(toIndentedString(cidrInVpc)).append("\n");
        sb.append("    workspaces: ").append(toIndentedString(workspaces)).append("\n");
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
