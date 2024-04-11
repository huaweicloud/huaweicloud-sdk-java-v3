package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExportParam
 */
public class ExportParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<Long> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asyn")

    private Boolean asyn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_id")

    private Long directoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_catalog_id")

    private Long bizCatalogId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_catalog_id_list")

    private List<Long> bizCatalogIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private Long modelId;

    public ExportParam withIds(List<Long> ids) {
        this.ids = ids;
        return this;
    }

    public ExportParam addIdsItem(Long idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public ExportParam withIds(Consumer<List<Long>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 导出对象ID的列表，如：某几个逻辑模型的ID。
     * @return ids
     */
    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public ExportParam withAsyn(Boolean asyn) {
        this.asyn = asyn;
        return this;
    }

    /**
     * 是否是异步操作导出，true:异步，false:同步。
     * @return asyn
     */
    public Boolean getAsyn() {
        return asyn;
    }

    public void setAsyn(Boolean asyn) {
        this.asyn = asyn;
    }

    public ExportParam withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 导出的业务类型：ER(关系建模)，Directory_CodeTable(码表目录)，Directory_Standard(标准目录)，DIM(维度建模)，codeTable(码表);dataStandard 数据标准;directory_id导出指定目录下的码表/数据标准;model_id，biz_catalog_id导出指定模型，目录下的业务表，import_bizcatalog导出流程架构，import_bizmetric导出业务指标。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ExportParam withDirectoryId(Long directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * 所属目录ID。
     * @return directoryId
     */
    public Long getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(Long directoryId) {
        this.directoryId = directoryId;
    }

    public ExportParam withBizCatalogId(Long bizCatalogId) {
        this.bizCatalogId = bizCatalogId;
        return this;
    }

    /**
     * 所属业务分层的ID。
     * @return bizCatalogId
     */
    public Long getBizCatalogId() {
        return bizCatalogId;
    }

    public void setBizCatalogId(Long bizCatalogId) {
        this.bizCatalogId = bizCatalogId;
    }

    public ExportParam withBizCatalogIdList(List<Long> bizCatalogIdList) {
        this.bizCatalogIdList = bizCatalogIdList;
        return this;
    }

    public ExportParam addBizCatalogIdListItem(Long bizCatalogIdListItem) {
        if (this.bizCatalogIdList == null) {
            this.bizCatalogIdList = new ArrayList<>();
        }
        this.bizCatalogIdList.add(bizCatalogIdListItem);
        return this;
    }

    public ExportParam withBizCatalogIdList(Consumer<List<Long>> bizCatalogIdListSetter) {
        if (this.bizCatalogIdList == null) {
            this.bizCatalogIdList = new ArrayList<>();
        }
        bizCatalogIdListSetter.accept(this.bizCatalogIdList);
        return this;
    }

    /**
     * 所属的业务分层的ID列表。
     * @return bizCatalogIdList
     */
    public List<Long> getBizCatalogIdList() {
        return bizCatalogIdList;
    }

    public void setBizCatalogIdList(List<Long> bizCatalogIdList) {
        this.bizCatalogIdList = bizCatalogIdList;
    }

    public ExportParam withModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * 所属关系建模的模型ID，导出关系模型需要此参数。
     * @return modelId
     */
    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportParam that = (ExportParam) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.asyn, that.asyn)
            && Objects.equals(this.type, that.type) && Objects.equals(this.directoryId, that.directoryId)
            && Objects.equals(this.bizCatalogId, that.bizCatalogId)
            && Objects.equals(this.bizCatalogIdList, that.bizCatalogIdList)
            && Objects.equals(this.modelId, that.modelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, asyn, type, directoryId, bizCatalogId, bizCatalogIdList, modelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportParam {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    asyn: ").append(toIndentedString(asyn)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
        sb.append("    bizCatalogId: ").append(toIndentedString(bizCatalogId)).append("\n");
        sb.append("    bizCatalogIdList: ").append(toIndentedString(bizCatalogIdList)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
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
