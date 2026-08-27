package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量操作策略应用对象请求
 */
public class UpdateStrategyApplyObjectsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private Integer operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_ids")

    private List<String> deleteIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_objects")

    private List<ApplyObjectInfo> addObjects = null;

    public UpdateStrategyApplyObjectsRequestBody withOperateType(Integer operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 操作类型：1-批量删除 2-批量新增
     * minimum: 1
     * maximum: 2
     * @return operateType
     */
    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public UpdateStrategyApplyObjectsRequestBody withDeleteIds(List<String> deleteIds) {
        this.deleteIds = deleteIds;
        return this;
    }

    public UpdateStrategyApplyObjectsRequestBody addDeleteIdsItem(String deleteIdsItem) {
        if (this.deleteIds == null) {
            this.deleteIds = new ArrayList<>();
        }
        this.deleteIds.add(deleteIdsItem);
        return this;
    }

    public UpdateStrategyApplyObjectsRequestBody withDeleteIds(Consumer<List<String>> deleteIdsSetter) {
        if (this.deleteIds == null) {
            this.deleteIds = new ArrayList<>();
        }
        deleteIdsSetter.accept(this.deleteIds);
        return this;
    }

    /**
     * 批量删除的应用对象ID列表（operate_type为1时必填）
     * @return deleteIds
     */
    public List<String> getDeleteIds() {
        return deleteIds;
    }

    public void setDeleteIds(List<String> deleteIds) {
        this.deleteIds = deleteIds;
    }

    public UpdateStrategyApplyObjectsRequestBody withAddObjects(List<ApplyObjectInfo> addObjects) {
        this.addObjects = addObjects;
        return this;
    }

    public UpdateStrategyApplyObjectsRequestBody addAddObjectsItem(ApplyObjectInfo addObjectsItem) {
        if (this.addObjects == null) {
            this.addObjects = new ArrayList<>();
        }
        this.addObjects.add(addObjectsItem);
        return this;
    }

    public UpdateStrategyApplyObjectsRequestBody withAddObjects(Consumer<List<ApplyObjectInfo>> addObjectsSetter) {
        if (this.addObjects == null) {
            this.addObjects = new ArrayList<>();
        }
        addObjectsSetter.accept(this.addObjects);
        return this;
    }

    /**
     * 批量新增的应用对象列表（operate_type为2时必填）
     * @return addObjects
     */
    public List<ApplyObjectInfo> getAddObjects() {
        return addObjects;
    }

    public void setAddObjects(List<ApplyObjectInfo> addObjects) {
        this.addObjects = addObjects;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateStrategyApplyObjectsRequestBody that = (UpdateStrategyApplyObjectsRequestBody) obj;
        return Objects.equals(this.operateType, that.operateType) && Objects.equals(this.deleteIds, that.deleteIds)
            && Objects.equals(this.addObjects, that.addObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateType, deleteIds, addObjects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStrategyApplyObjectsRequestBody {\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    deleteIds: ").append(toIndentedString(deleteIds)).append("\n");
        sb.append("    addObjects: ").append(toIndentedString(addObjects)).append("\n");
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
