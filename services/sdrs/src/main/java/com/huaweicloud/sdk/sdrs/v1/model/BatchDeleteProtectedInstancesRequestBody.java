package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除请求体
 */
public class BatchDeleteProtectedInstancesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_instances")

    @JacksonXmlProperty(localName = "protected_instances")

    private List<ResourceId> protectedInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_target_server")

    @JacksonXmlProperty(localName = "delete_target_server")

    private Boolean deleteTargetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_target_eip")

    @JacksonXmlProperty(localName = "delete_target_eip")

    private Boolean deleteTargetEip;

    public BatchDeleteProtectedInstancesRequestBody withProtectedInstances(List<ResourceId> protectedInstances) {
        this.protectedInstances = protectedInstances;
        return this;
    }

    public BatchDeleteProtectedInstancesRequestBody addProtectedInstancesItem(ResourceId protectedInstancesItem) {
        if (this.protectedInstances == null) {
            this.protectedInstances = new ArrayList<>();
        }
        this.protectedInstances.add(protectedInstancesItem);
        return this;
    }

    public BatchDeleteProtectedInstancesRequestBody withProtectedInstances(
        Consumer<List<ResourceId>> protectedInstancesSetter) {
        if (this.protectedInstances == null) {
            this.protectedInstances = new ArrayList<>();
        }
        protectedInstancesSetter.accept(this.protectedInstances);
        return this;
    }

    /**
     * 所需要删除的保护实例列表。
     * @return protectedInstances
     */
    public List<ResourceId> getProtectedInstances() {
        return protectedInstances;
    }

    public void setProtectedInstances(List<ResourceId> protectedInstances) {
        this.protectedInstances = protectedInstances;
    }

    public BatchDeleteProtectedInstancesRequestBody withDeleteTargetServer(Boolean deleteTargetServer) {
        this.deleteTargetServer = deleteTargetServer;
        return this;
    }

    /**
     * 是否删除容灾站点服务器，默认值为false。
     * @return deleteTargetServer
     */
    public Boolean getDeleteTargetServer() {
        return deleteTargetServer;
    }

    public void setDeleteTargetServer(Boolean deleteTargetServer) {
        this.deleteTargetServer = deleteTargetServer;
    }

    public BatchDeleteProtectedInstancesRequestBody withDeleteTargetEip(Boolean deleteTargetEip) {
        this.deleteTargetEip = deleteTargetEip;
        return this;
    }

    /**
     * 是否删除容灾站点弹性IP，默认值为false。
     * @return deleteTargetEip
     */
    public Boolean getDeleteTargetEip() {
        return deleteTargetEip;
    }

    public void setDeleteTargetEip(Boolean deleteTargetEip) {
        this.deleteTargetEip = deleteTargetEip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteProtectedInstancesRequestBody batchDeleteProtectedInstancesRequestBody =
            (BatchDeleteProtectedInstancesRequestBody) o;
        return Objects.equals(this.protectedInstances, batchDeleteProtectedInstancesRequestBody.protectedInstances)
            && Objects.equals(this.deleteTargetServer, batchDeleteProtectedInstancesRequestBody.deleteTargetServer)
            && Objects.equals(this.deleteTargetEip, batchDeleteProtectedInstancesRequestBody.deleteTargetEip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectedInstances, deleteTargetServer, deleteTargetEip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteProtectedInstancesRequestBody {\n");
        sb.append("    protectedInstances: ").append(toIndentedString(protectedInstances)).append("\n");
        sb.append("    deleteTargetServer: ").append(toIndentedString(deleteTargetServer)).append("\n");
        sb.append("    deleteTargetEip: ").append(toIndentedString(deleteTargetEip)).append("\n");
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
