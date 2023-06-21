package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TableModelAttributeVO
 */
public class TableModelAttributeVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_ch")

    private String nameCh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_location")

    private String obsLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_type")

    private DataTypeDomainEnum domainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type_extend")

    private String dataTypeExtend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_primary_key")

    private Boolean isPrimaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_partition_key")

    private Boolean isPartitionKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_foreign_key")

    private Boolean isForeignKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_field")

    private Boolean extendField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_null")

    private Boolean notNull;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ordinal")

    private Integer ordinal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_model_id")

    private Long tableModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagVO> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stand_row_id")

    private Long standRowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stand_row_name")

    private String standRowName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_infos")

    private List<QualityInfoVO> qualityInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_defined_fields")

    private List<SelfDefinedFieldVO> selfDefinedFields = null;

    public TableModelAttributeVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 编码
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TableModelAttributeVO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 字段名
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public TableModelAttributeVO withNameCh(String nameCh) {
        this.nameCh = nameCh;
        return this;
    }

    /**
     * 业务属性
     * @return nameCh
     */
    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public TableModelAttributeVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TableModelAttributeVO withObsLocation(String obsLocation) {
        this.obsLocation = obsLocation;
        return this;
    }

    /**
     * obs路径，子路径
     * @return obsLocation
     */
    public String getObsLocation() {
        return obsLocation;
    }

    public void setObsLocation(String obsLocation) {
        this.obsLocation = obsLocation;
    }

    public TableModelAttributeVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public TableModelAttributeVO withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public TableModelAttributeVO withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 字段类型
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public TableModelAttributeVO withDomainType(DataTypeDomainEnum domainType) {
        this.domainType = domainType;
        return this;
    }

    /**
     * Get domainType
     * @return domainType
     */
    public DataTypeDomainEnum getDomainType() {
        return domainType;
    }

    public void setDomainType(DataTypeDomainEnum domainType) {
        this.domainType = domainType;
    }

    public TableModelAttributeVO withDataTypeExtend(String dataTypeExtend) {
        this.dataTypeExtend = dataTypeExtend;
        return this;
    }

    /**
     * 数据类型扩展字段
     * @return dataTypeExtend
     */
    public String getDataTypeExtend() {
        return dataTypeExtend;
    }

    public void setDataTypeExtend(String dataTypeExtend) {
        this.dataTypeExtend = dataTypeExtend;
    }

    public TableModelAttributeVO withIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
        return this;
    }

    /**
     * 是否主键
     * @return isPrimaryKey
     */
    public Boolean getIsPrimaryKey() {
        return isPrimaryKey;
    }

    public void setIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
    }

    public TableModelAttributeVO withIsPartitionKey(Boolean isPartitionKey) {
        this.isPartitionKey = isPartitionKey;
        return this;
    }

    /**
     * 是否分区键
     * @return isPartitionKey
     */
    public Boolean getIsPartitionKey() {
        return isPartitionKey;
    }

    public void setIsPartitionKey(Boolean isPartitionKey) {
        this.isPartitionKey = isPartitionKey;
    }

    public TableModelAttributeVO withIsForeignKey(Boolean isForeignKey) {
        this.isForeignKey = isForeignKey;
        return this;
    }

    /**
     * 是否外键
     * @return isForeignKey
     */
    public Boolean getIsForeignKey() {
        return isForeignKey;
    }

    public void setIsForeignKey(Boolean isForeignKey) {
        this.isForeignKey = isForeignKey;
    }

    public TableModelAttributeVO withExtendField(Boolean extendField) {
        this.extendField = extendField;
        return this;
    }

    /**
     * 是否继承的属性
     * @return extendField
     */
    public Boolean getExtendField() {
        return extendField;
    }

    public void setExtendField(Boolean extendField) {
        this.extendField = extendField;
    }

    public TableModelAttributeVO withNotNull(Boolean notNull) {
        this.notNull = notNull;
        return this;
    }

    /**
     * 是否不为空
     * @return notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    public TableModelAttributeVO withOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    /**
     * 序号
     * @return ordinal
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public TableModelAttributeVO withTableModelId(Long tableModelId) {
        this.tableModelId = tableModelId;
        return this;
    }

    /**
     * 所属表模型id
     * @return tableModelId
     */
    public Long getTableModelId() {
        return tableModelId;
    }

    public void setTableModelId(Long tableModelId) {
        this.tableModelId = tableModelId;
    }

    public TableModelAttributeVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public TableModelAttributeVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public TableModelAttributeVO withTags(List<TagVO> tags) {
        this.tags = tags;
        return this;
    }

    public TableModelAttributeVO addTagsItem(TagVO tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TableModelAttributeVO withTags(Consumer<List<TagVO>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 表标签
     * @return tags
     */
    public List<TagVO> getTags() {
        return tags;
    }

    public void setTags(List<TagVO> tags) {
        this.tags = tags;
    }

    public TableModelAttributeVO withStandRowId(Long standRowId) {
        this.standRowId = standRowId;
        return this;
    }

    /**
     * 关联的数据标准的id
     * @return standRowId
     */
    public Long getStandRowId() {
        return standRowId;
    }

    public void setStandRowId(Long standRowId) {
        this.standRowId = standRowId;
    }

    public TableModelAttributeVO withStandRowName(String standRowName) {
        this.standRowName = standRowName;
        return this;
    }

    /**
     * Get standRowName
     * @return standRowName
     */
    public String getStandRowName() {
        return standRowName;
    }

    public void setStandRowName(String standRowName) {
        this.standRowName = standRowName;
    }

    public TableModelAttributeVO withQualityInfos(List<QualityInfoVO> qualityInfos) {
        this.qualityInfos = qualityInfos;
        return this;
    }

    public TableModelAttributeVO addQualityInfosItem(QualityInfoVO qualityInfosItem) {
        if (this.qualityInfos == null) {
            this.qualityInfos = new ArrayList<>();
        }
        this.qualityInfos.add(qualityInfosItem);
        return this;
    }

    public TableModelAttributeVO withQualityInfos(Consumer<List<QualityInfoVO>> qualityInfosSetter) {
        if (this.qualityInfos == null) {
            this.qualityInfos = new ArrayList<>();
        }
        qualityInfosSetter.accept(this.qualityInfos);
        return this;
    }

    /**
     * 质量信息
     * @return qualityInfos
     */
    public List<QualityInfoVO> getQualityInfos() {
        return qualityInfos;
    }

    public void setQualityInfos(List<QualityInfoVO> qualityInfos) {
        this.qualityInfos = qualityInfos;
    }

    public TableModelAttributeVO withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 别名
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public TableModelAttributeVO withSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
        return this;
    }

    public TableModelAttributeVO addSelfDefinedFieldsItem(SelfDefinedFieldVO selfDefinedFieldsItem) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        this.selfDefinedFields.add(selfDefinedFieldsItem);
        return this;
    }

    public TableModelAttributeVO withSelfDefinedFields(Consumer<List<SelfDefinedFieldVO>> selfDefinedFieldsSetter) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        selfDefinedFieldsSetter.accept(this.selfDefinedFields);
        return this;
    }

    /**
     * 自定义项
     * @return selfDefinedFields
     */
    public List<SelfDefinedFieldVO> getSelfDefinedFields() {
        return selfDefinedFields;
    }

    public void setSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TableModelAttributeVO tableModelAttributeVO = (TableModelAttributeVO) o;
        return Objects.equals(this.id, tableModelAttributeVO.id)
            && Objects.equals(this.nameEn, tableModelAttributeVO.nameEn)
            && Objects.equals(this.nameCh, tableModelAttributeVO.nameCh)
            && Objects.equals(this.description, tableModelAttributeVO.description)
            && Objects.equals(this.obsLocation, tableModelAttributeVO.obsLocation)
            && Objects.equals(this.createBy, tableModelAttributeVO.createBy)
            && Objects.equals(this.updateBy, tableModelAttributeVO.updateBy)
            && Objects.equals(this.dataType, tableModelAttributeVO.dataType)
            && Objects.equals(this.domainType, tableModelAttributeVO.domainType)
            && Objects.equals(this.dataTypeExtend, tableModelAttributeVO.dataTypeExtend)
            && Objects.equals(this.isPrimaryKey, tableModelAttributeVO.isPrimaryKey)
            && Objects.equals(this.isPartitionKey, tableModelAttributeVO.isPartitionKey)
            && Objects.equals(this.isForeignKey, tableModelAttributeVO.isForeignKey)
            && Objects.equals(this.extendField, tableModelAttributeVO.extendField)
            && Objects.equals(this.notNull, tableModelAttributeVO.notNull)
            && Objects.equals(this.ordinal, tableModelAttributeVO.ordinal)
            && Objects.equals(this.tableModelId, tableModelAttributeVO.tableModelId)
            && Objects.equals(this.createTime, tableModelAttributeVO.createTime)
            && Objects.equals(this.updateTime, tableModelAttributeVO.updateTime)
            && Objects.equals(this.tags, tableModelAttributeVO.tags)
            && Objects.equals(this.standRowId, tableModelAttributeVO.standRowId)
            && Objects.equals(this.standRowName, tableModelAttributeVO.standRowName)
            && Objects.equals(this.qualityInfos, tableModelAttributeVO.qualityInfos)
            && Objects.equals(this.alias, tableModelAttributeVO.alias)
            && Objects.equals(this.selfDefinedFields, tableModelAttributeVO.selfDefinedFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            nameEn,
            nameCh,
            description,
            obsLocation,
            createBy,
            updateBy,
            dataType,
            domainType,
            dataTypeExtend,
            isPrimaryKey,
            isPartitionKey,
            isForeignKey,
            extendField,
            notNull,
            ordinal,
            tableModelId,
            createTime,
            updateTime,
            tags,
            standRowId,
            standRowName,
            qualityInfos,
            alias,
            selfDefinedFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableModelAttributeVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    obsLocation: ").append(toIndentedString(obsLocation)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    dataTypeExtend: ").append(toIndentedString(dataTypeExtend)).append("\n");
        sb.append("    isPrimaryKey: ").append(toIndentedString(isPrimaryKey)).append("\n");
        sb.append("    isPartitionKey: ").append(toIndentedString(isPartitionKey)).append("\n");
        sb.append("    isForeignKey: ").append(toIndentedString(isForeignKey)).append("\n");
        sb.append("    extendField: ").append(toIndentedString(extendField)).append("\n");
        sb.append("    notNull: ").append(toIndentedString(notNull)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    tableModelId: ").append(toIndentedString(tableModelId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    standRowId: ").append(toIndentedString(standRowId)).append("\n");
        sb.append("    standRowName: ").append(toIndentedString(standRowName)).append("\n");
        sb.append("    qualityInfos: ").append(toIndentedString(qualityInfos)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    selfDefinedFields: ").append(toIndentedString(selfDefinedFields)).append("\n");
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
