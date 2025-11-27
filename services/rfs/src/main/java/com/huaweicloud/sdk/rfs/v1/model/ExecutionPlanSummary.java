package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExecutionPlanSummary
 */
public class ExecutionPlanSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_add")

    private Integer resourceAdd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_update")

    private Integer resourceUpdate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_delete")

    private Integer resourceDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_import")

    private Integer resourceImport;

    public ExecutionPlanSummary withResourceAdd(Integer resourceAdd) {
        this.resourceAdd = resourceAdd;
        return this;
    }

    /**
     * 新增资源数
     * @return resourceAdd
     */
    public Integer getResourceAdd() {
        return resourceAdd;
    }

    public void setResourceAdd(Integer resourceAdd) {
        this.resourceAdd = resourceAdd;
    }

    public ExecutionPlanSummary withResourceUpdate(Integer resourceUpdate) {
        this.resourceUpdate = resourceUpdate;
        return this;
    }

    /**
     * 更新资源数
     * @return resourceUpdate
     */
    public Integer getResourceUpdate() {
        return resourceUpdate;
    }

    public void setResourceUpdate(Integer resourceUpdate) {
        this.resourceUpdate = resourceUpdate;
    }

    public ExecutionPlanSummary withResourceDelete(Integer resourceDelete) {
        this.resourceDelete = resourceDelete;
        return this;
    }

    /**
     * 删除资源数
     * @return resourceDelete
     */
    public Integer getResourceDelete() {
        return resourceDelete;
    }

    public void setResourceDelete(Integer resourceDelete) {
        this.resourceDelete = resourceDelete;
    }

    public ExecutionPlanSummary withResourceImport(Integer resourceImport) {
        this.resourceImport = resourceImport;
        return this;
    }

    /**
     * 导入资源数
     * @return resourceImport
     */
    public Integer getResourceImport() {
        return resourceImport;
    }

    public void setResourceImport(Integer resourceImport) {
        this.resourceImport = resourceImport;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecutionPlanSummary that = (ExecutionPlanSummary) obj;
        return Objects.equals(this.resourceAdd, that.resourceAdd)
            && Objects.equals(this.resourceUpdate, that.resourceUpdate)
            && Objects.equals(this.resourceDelete, that.resourceDelete)
            && Objects.equals(this.resourceImport, that.resourceImport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceAdd, resourceUpdate, resourceDelete, resourceImport);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionPlanSummary {\n");
        sb.append("    resourceAdd: ").append(toIndentedString(resourceAdd)).append("\n");
        sb.append("    resourceUpdate: ").append(toIndentedString(resourceUpdate)).append("\n");
        sb.append("    resourceDelete: ").append(toIndentedString(resourceDelete)).append("\n");
        sb.append("    resourceImport: ").append(toIndentedString(resourceImport)).append("\n");
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
