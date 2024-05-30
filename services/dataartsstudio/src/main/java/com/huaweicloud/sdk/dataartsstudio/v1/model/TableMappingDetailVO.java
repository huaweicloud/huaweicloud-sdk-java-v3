package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TableMappingDetailVO
 */
public class TableMappingDetailVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping_id")

    private String mappingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_attr_id")

    private String targetAttrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_attr_name")

    private String targetAttrName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_table_ids")

    private String srcTableIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_table_names")

    private List<String> srcTableNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_table_db_names")

    private List<String> srcTableDbNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_table_model_ids")

    private List<String> srcTableModelIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_table_id_list")

    private List<String> srcTableIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_attr_ids")

    private String srcAttrIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_attr_names")

    private List<String> srcAttrNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_attr_id_list")

    private List<String> srcAttrIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_attr")

    private Object targetAttr;

    public TableMappingDetailVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编码，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TableMappingDetailVO withMappingId(String mappingId) {
        this.mappingId = mappingId;
        return this;
    }

    /**
     * 名称。
     * @return mappingId
     */
    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }

    public TableMappingDetailVO withTargetAttrId(String targetAttrId) {
        this.targetAttrId = targetAttrId;
        return this;
    }

    /**
     * 目的字段ID，填写String类型替代Long类型。
     * @return targetAttrId
     */
    public String getTargetAttrId() {
        return targetAttrId;
    }

    public void setTargetAttrId(String targetAttrId) {
        this.targetAttrId = targetAttrId;
    }

    public TableMappingDetailVO withTargetAttrName(String targetAttrName) {
        this.targetAttrName = targetAttrName;
        return this;
    }

    /**
     * 目的字段排序。
     * @return targetAttrName
     */
    public String getTargetAttrName() {
        return targetAttrName;
    }

    public void setTargetAttrName(String targetAttrName) {
        this.targetAttrName = targetAttrName;
    }

    public TableMappingDetailVO withSrcTableIds(String srcTableIds) {
        this.srcTableIds = srcTableIds;
        return this;
    }

    /**
     * 源表ID。
     * @return srcTableIds
     */
    public String getSrcTableIds() {
        return srcTableIds;
    }

    public void setSrcTableIds(String srcTableIds) {
        this.srcTableIds = srcTableIds;
    }

    public TableMappingDetailVO withSrcTableNames(List<String> srcTableNames) {
        this.srcTableNames = srcTableNames;
        return this;
    }

    public TableMappingDetailVO addSrcTableNamesItem(String srcTableNamesItem) {
        if (this.srcTableNames == null) {
            this.srcTableNames = new ArrayList<>();
        }
        this.srcTableNames.add(srcTableNamesItem);
        return this;
    }

    public TableMappingDetailVO withSrcTableNames(Consumer<List<String>> srcTableNamesSetter) {
        if (this.srcTableNames == null) {
            this.srcTableNames = new ArrayList<>();
        }
        srcTableNamesSetter.accept(this.srcTableNames);
        return this;
    }

    /**
     * 源表名称数组，只读。
     * @return srcTableNames
     */
    public List<String> getSrcTableNames() {
        return srcTableNames;
    }

    public void setSrcTableNames(List<String> srcTableNames) {
        this.srcTableNames = srcTableNames;
    }

    public TableMappingDetailVO withSrcTableDbNames(List<String> srcTableDbNames) {
        this.srcTableDbNames = srcTableDbNames;
        return this;
    }

    public TableMappingDetailVO addSrcTableDbNamesItem(String srcTableDbNamesItem) {
        if (this.srcTableDbNames == null) {
            this.srcTableDbNames = new ArrayList<>();
        }
        this.srcTableDbNames.add(srcTableDbNamesItem);
        return this;
    }

    public TableMappingDetailVO withSrcTableDbNames(Consumer<List<String>> srcTableDbNamesSetter) {
        if (this.srcTableDbNames == null) {
            this.srcTableDbNames = new ArrayList<>();
        }
        srcTableDbNamesSetter.accept(this.srcTableDbNames);
        return this;
    }

    /**
     * 源表db名称数组，只读。
     * @return srcTableDbNames
     */
    public List<String> getSrcTableDbNames() {
        return srcTableDbNames;
    }

    public void setSrcTableDbNames(List<String> srcTableDbNames) {
        this.srcTableDbNames = srcTableDbNames;
    }

    public TableMappingDetailVO withSrcTableModelIds(List<String> srcTableModelIds) {
        this.srcTableModelIds = srcTableModelIds;
        return this;
    }

    public TableMappingDetailVO addSrcTableModelIdsItem(String srcTableModelIdsItem) {
        if (this.srcTableModelIds == null) {
            this.srcTableModelIds = new ArrayList<>();
        }
        this.srcTableModelIds.add(srcTableModelIdsItem);
        return this;
    }

    public TableMappingDetailVO withSrcTableModelIds(Consumer<List<String>> srcTableModelIdsSetter) {
        if (this.srcTableModelIds == null) {
            this.srcTableModelIds = new ArrayList<>();
        }
        srcTableModelIdsSetter.accept(this.srcTableModelIds);
        return this;
    }

    /**
     * 源表在关系建模中的模型ID数组，只读，填写String类型替代Long类型。
     * @return srcTableModelIds
     */
    public List<String> getSrcTableModelIds() {
        return srcTableModelIds;
    }

    public void setSrcTableModelIds(List<String> srcTableModelIds) {
        this.srcTableModelIds = srcTableModelIds;
    }

    public TableMappingDetailVO withSrcTableIdList(List<String> srcTableIdList) {
        this.srcTableIdList = srcTableIdList;
        return this;
    }

    public TableMappingDetailVO addSrcTableIdListItem(String srcTableIdListItem) {
        if (this.srcTableIdList == null) {
            this.srcTableIdList = new ArrayList<>();
        }
        this.srcTableIdList.add(srcTableIdListItem);
        return this;
    }

    public TableMappingDetailVO withSrcTableIdList(Consumer<List<String>> srcTableIdListSetter) {
        if (this.srcTableIdList == null) {
            this.srcTableIdList = new ArrayList<>();
        }
        srcTableIdListSetter.accept(this.srcTableIdList);
        return this;
    }

    /**
     * 源表ID数组，只读，填写String类型替代Long类型。
     * @return srcTableIdList
     */
    public List<String> getSrcTableIdList() {
        return srcTableIdList;
    }

    public void setSrcTableIdList(List<String> srcTableIdList) {
        this.srcTableIdList = srcTableIdList;
    }

    public TableMappingDetailVO withSrcAttrIds(String srcAttrIds) {
        this.srcAttrIds = srcAttrIds;
        return this;
    }

    /**
     * 源表字段ID。
     * @return srcAttrIds
     */
    public String getSrcAttrIds() {
        return srcAttrIds;
    }

    public void setSrcAttrIds(String srcAttrIds) {
        this.srcAttrIds = srcAttrIds;
    }

    public TableMappingDetailVO withSrcAttrNames(List<String> srcAttrNames) {
        this.srcAttrNames = srcAttrNames;
        return this;
    }

    public TableMappingDetailVO addSrcAttrNamesItem(String srcAttrNamesItem) {
        if (this.srcAttrNames == null) {
            this.srcAttrNames = new ArrayList<>();
        }
        this.srcAttrNames.add(srcAttrNamesItem);
        return this;
    }

    public TableMappingDetailVO withSrcAttrNames(Consumer<List<String>> srcAttrNamesSetter) {
        if (this.srcAttrNames == null) {
            this.srcAttrNames = new ArrayList<>();
        }
        srcAttrNamesSetter.accept(this.srcAttrNames);
        return this;
    }

    /**
     * 源表字段名称数组，只读。
     * @return srcAttrNames
     */
    public List<String> getSrcAttrNames() {
        return srcAttrNames;
    }

    public void setSrcAttrNames(List<String> srcAttrNames) {
        this.srcAttrNames = srcAttrNames;
    }

    public TableMappingDetailVO withSrcAttrIdList(List<String> srcAttrIdList) {
        this.srcAttrIdList = srcAttrIdList;
        return this;
    }

    public TableMappingDetailVO addSrcAttrIdListItem(String srcAttrIdListItem) {
        if (this.srcAttrIdList == null) {
            this.srcAttrIdList = new ArrayList<>();
        }
        this.srcAttrIdList.add(srcAttrIdListItem);
        return this;
    }

    public TableMappingDetailVO withSrcAttrIdList(Consumer<List<String>> srcAttrIdListSetter) {
        if (this.srcAttrIdList == null) {
            this.srcAttrIdList = new ArrayList<>();
        }
        srcAttrIdListSetter.accept(this.srcAttrIdList);
        return this;
    }

    /**
     * 源表字段ID数组，只读，填写String类型替代Long类型。
     * @return srcAttrIdList
     */
    public List<String> getSrcAttrIdList() {
        return srcAttrIdList;
    }

    public void setSrcAttrIdList(List<String> srcAttrIdList) {
        this.srcAttrIdList = srcAttrIdList;
    }

    public TableMappingDetailVO withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备注。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public TableMappingDetailVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public TableMappingDetailVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public TableMappingDetailVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public TableMappingDetailVO withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public TableMappingDetailVO withTargetAttr(Object targetAttr) {
        this.targetAttr = targetAttr;
        return this;
    }

    /**
     * 目标属性。
     * @return targetAttr
     */
    public Object getTargetAttr() {
        return targetAttr;
    }

    public void setTargetAttr(Object targetAttr) {
        this.targetAttr = targetAttr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableMappingDetailVO that = (TableMappingDetailVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.mappingId, that.mappingId)
            && Objects.equals(this.targetAttrId, that.targetAttrId)
            && Objects.equals(this.targetAttrName, that.targetAttrName)
            && Objects.equals(this.srcTableIds, that.srcTableIds)
            && Objects.equals(this.srcTableNames, that.srcTableNames)
            && Objects.equals(this.srcTableDbNames, that.srcTableDbNames)
            && Objects.equals(this.srcTableModelIds, that.srcTableModelIds)
            && Objects.equals(this.srcTableIdList, that.srcTableIdList)
            && Objects.equals(this.srcAttrIds, that.srcAttrIds) && Objects.equals(this.srcAttrNames, that.srcAttrNames)
            && Objects.equals(this.srcAttrIdList, that.srcAttrIdList) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.updateBy, that.updateBy)
            && Objects.equals(this.targetAttr, that.targetAttr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            mappingId,
            targetAttrId,
            targetAttrName,
            srcTableIds,
            srcTableNames,
            srcTableDbNames,
            srcTableModelIds,
            srcTableIdList,
            srcAttrIds,
            srcAttrNames,
            srcAttrIdList,
            remark,
            createTime,
            updateTime,
            createBy,
            updateBy,
            targetAttr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableMappingDetailVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mappingId: ").append(toIndentedString(mappingId)).append("\n");
        sb.append("    targetAttrId: ").append(toIndentedString(targetAttrId)).append("\n");
        sb.append("    targetAttrName: ").append(toIndentedString(targetAttrName)).append("\n");
        sb.append("    srcTableIds: ").append(toIndentedString(srcTableIds)).append("\n");
        sb.append("    srcTableNames: ").append(toIndentedString(srcTableNames)).append("\n");
        sb.append("    srcTableDbNames: ").append(toIndentedString(srcTableDbNames)).append("\n");
        sb.append("    srcTableModelIds: ").append(toIndentedString(srcTableModelIds)).append("\n");
        sb.append("    srcTableIdList: ").append(toIndentedString(srcTableIdList)).append("\n");
        sb.append("    srcAttrIds: ").append(toIndentedString(srcAttrIds)).append("\n");
        sb.append("    srcAttrNames: ").append(toIndentedString(srcAttrNames)).append("\n");
        sb.append("    srcAttrIdList: ").append(toIndentedString(srcAttrIdList)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    targetAttr: ").append(toIndentedString(targetAttr)).append("\n");
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
