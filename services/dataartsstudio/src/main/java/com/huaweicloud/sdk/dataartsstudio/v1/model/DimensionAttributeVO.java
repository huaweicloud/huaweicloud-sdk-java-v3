package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DimensionAttributeVO
 */
public class DimensionAttributeVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_id")

    private Long dimensionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_table_field_id")

    private Long codeTableFieldId;

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
    @JsonProperty(value = "create_by")

    private String createBy;

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
    @JsonProperty(value = "is_biz_primary")

    private Boolean isBizPrimary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_partition_key")

    private Boolean isPartitionKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ordinal")

    private Integer ordinal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_null")

    private Boolean notNull;

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
    @JsonProperty(value = "status")

    private BizStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_defined_fields")

    private List<SelfDefinedFieldVO> selfDefinedFields = null;

    public DimensionAttributeVO withId(Long id) {
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

    public DimensionAttributeVO withDimensionId(Long dimensionId) {
        this.dimensionId = dimensionId;
        return this;
    }

    /**
     * 维度id
     * @return dimensionId
     */
    public Long getDimensionId() {
        return dimensionId;
    }

    public void setDimensionId(Long dimensionId) {
        this.dimensionId = dimensionId;
    }

    public DimensionAttributeVO withCodeTableFieldId(Long codeTableFieldId) {
        this.codeTableFieldId = codeTableFieldId;
        return this;
    }

    /**
     * 码表属性id
     * @return codeTableFieldId
     */
    public Long getCodeTableFieldId() {
        return codeTableFieldId;
    }

    public void setCodeTableFieldId(Long codeTableFieldId) {
        this.codeTableFieldId = codeTableFieldId;
    }

    public DimensionAttributeVO withNameEn(String nameEn) {
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

    public DimensionAttributeVO withNameCh(String nameCh) {
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

    public DimensionAttributeVO withDescription(String description) {
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

    public DimensionAttributeVO withCreateBy(String createBy) {
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

    public DimensionAttributeVO withDataType(String dataType) {
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

    public DimensionAttributeVO withDomainType(DataTypeDomainEnum domainType) {
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

    public DimensionAttributeVO withDataTypeExtend(String dataTypeExtend) {
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

    public DimensionAttributeVO withIsPrimaryKey(Boolean isPrimaryKey) {
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

    public DimensionAttributeVO withIsBizPrimary(Boolean isBizPrimary) {
        this.isBizPrimary = isBizPrimary;
        return this;
    }

    /**
     * 是否业务主键
     * @return isBizPrimary
     */
    public Boolean getIsBizPrimary() {
        return isBizPrimary;
    }

    public void setIsBizPrimary(Boolean isBizPrimary) {
        this.isBizPrimary = isBizPrimary;
    }

    public DimensionAttributeVO withIsPartitionKey(Boolean isPartitionKey) {
        this.isPartitionKey = isPartitionKey;
        return this;
    }

    /**
     * 是否分区
     * @return isPartitionKey
     */
    public Boolean getIsPartitionKey() {
        return isPartitionKey;
    }

    public void setIsPartitionKey(Boolean isPartitionKey) {
        this.isPartitionKey = isPartitionKey;
    }

    public DimensionAttributeVO withOrdinal(Integer ordinal) {
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

    public DimensionAttributeVO withNotNull(Boolean notNull) {
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

    public DimensionAttributeVO withStandRowId(Long standRowId) {
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

    public DimensionAttributeVO withStandRowName(String standRowName) {
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

    public DimensionAttributeVO withQualityInfos(List<QualityInfoVO> qualityInfos) {
        this.qualityInfos = qualityInfos;
        return this;
    }

    public DimensionAttributeVO addQualityInfosItem(QualityInfoVO qualityInfosItem) {
        if (this.qualityInfos == null) {
            this.qualityInfos = new ArrayList<>();
        }
        this.qualityInfos.add(qualityInfosItem);
        return this;
    }

    public DimensionAttributeVO withQualityInfos(Consumer<List<QualityInfoVO>> qualityInfosSetter) {
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

    public DimensionAttributeVO withStatus(BizStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public BizStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BizStatusEnum status) {
        this.status = status;
    }

    public DimensionAttributeVO withCreateTime(OffsetDateTime createTime) {
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

    public DimensionAttributeVO withUpdateTime(OffsetDateTime updateTime) {
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

    public DimensionAttributeVO withAlias(String alias) {
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

    public DimensionAttributeVO withSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
        return this;
    }

    public DimensionAttributeVO addSelfDefinedFieldsItem(SelfDefinedFieldVO selfDefinedFieldsItem) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        this.selfDefinedFields.add(selfDefinedFieldsItem);
        return this;
    }

    public DimensionAttributeVO withSelfDefinedFields(Consumer<List<SelfDefinedFieldVO>> selfDefinedFieldsSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DimensionAttributeVO that = (DimensionAttributeVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.dimensionId, that.dimensionId)
            && Objects.equals(this.codeTableFieldId, that.codeTableFieldId) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.nameCh, that.nameCh) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.domainType, that.domainType)
            && Objects.equals(this.dataTypeExtend, that.dataTypeExtend)
            && Objects.equals(this.isPrimaryKey, that.isPrimaryKey)
            && Objects.equals(this.isBizPrimary, that.isBizPrimary)
            && Objects.equals(this.isPartitionKey, that.isPartitionKey) && Objects.equals(this.ordinal, that.ordinal)
            && Objects.equals(this.notNull, that.notNull) && Objects.equals(this.standRowId, that.standRowId)
            && Objects.equals(this.standRowName, that.standRowName)
            && Objects.equals(this.qualityInfos, that.qualityInfos) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.alias, that.alias) && Objects.equals(this.selfDefinedFields, that.selfDefinedFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            dimensionId,
            codeTableFieldId,
            nameEn,
            nameCh,
            description,
            createBy,
            dataType,
            domainType,
            dataTypeExtend,
            isPrimaryKey,
            isBizPrimary,
            isPartitionKey,
            ordinal,
            notNull,
            standRowId,
            standRowName,
            qualityInfos,
            status,
            createTime,
            updateTime,
            alias,
            selfDefinedFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DimensionAttributeVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dimensionId: ").append(toIndentedString(dimensionId)).append("\n");
        sb.append("    codeTableFieldId: ").append(toIndentedString(codeTableFieldId)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    dataTypeExtend: ").append(toIndentedString(dataTypeExtend)).append("\n");
        sb.append("    isPrimaryKey: ").append(toIndentedString(isPrimaryKey)).append("\n");
        sb.append("    isBizPrimary: ").append(toIndentedString(isBizPrimary)).append("\n");
        sb.append("    isPartitionKey: ").append(toIndentedString(isPartitionKey)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    notNull: ").append(toIndentedString(notNull)).append("\n");
        sb.append("    standRowId: ").append(toIndentedString(standRowId)).append("\n");
        sb.append("    standRowName: ").append(toIndentedString(standRowName)).append("\n");
        sb.append("    qualityInfos: ").append(toIndentedString(qualityInfos)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
