package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 事实表维度信息。
 */
public class FactTableAttributeVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fact_logic_table_id")

    private String factLogicTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ordinal")

    private Integer ordinal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_id")

    private String dimensionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension")

    private DimensionVO dimension;

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
    @JsonProperty(value = "secrecy_levels")

    private List<SecrecyLevelRecordVO> secrecyLevels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_ch")

    private String nameCh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_null")

    private Boolean notNull;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute_type")

    private BizTypeEnum attributeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stand_row_id")

    private String standRowId;

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

    public FactTableAttributeVO withId(String id) {
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

    public FactTableAttributeVO withFactLogicTableId(String factLogicTableId) {
        this.factLogicTableId = factLogicTableId;
        return this;
    }

    /**
     * 所属事实表ID，只读，填写String类型替代Long类型。
     * @return factLogicTableId
     */
    public String getFactLogicTableId() {
        return factLogicTableId;
    }

    public void setFactLogicTableId(String factLogicTableId) {
        this.factLogicTableId = factLogicTableId;
    }

    public FactTableAttributeVO withOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    /**
     * 序号。
     * @return ordinal
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public FactTableAttributeVO withDimensionId(String dimensionId) {
        this.dimensionId = dimensionId;
        return this;
    }

    /**
     * 维度ID，填写String类型替代Long类型。
     * @return dimensionId
     */
    public String getDimensionId() {
        return dimensionId;
    }

    public void setDimensionId(String dimensionId) {
        this.dimensionId = dimensionId;
    }

    public FactTableAttributeVO withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 维度角色。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public FactTableAttributeVO withDimension(DimensionVO dimension) {
        this.dimension = dimension;
        return this;
    }

    public FactTableAttributeVO withDimension(Consumer<DimensionVO> dimensionSetter) {
        if (this.dimension == null) {
            this.dimension = new DimensionVO();
            dimensionSetter.accept(this.dimension);
        }

        return this;
    }

    /**
     * Get dimension
     * @return dimension
     */
    public DimensionVO getDimension() {
        return dimension;
    }

    public void setDimension(DimensionVO dimension) {
        this.dimension = dimension;
    }

    public FactTableAttributeVO withIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
        return this;
    }

    /**
     * 是否主键。
     * @return isPrimaryKey
     */
    public Boolean getIsPrimaryKey() {
        return isPrimaryKey;
    }

    public void setIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
    }

    public FactTableAttributeVO withIsPartitionKey(Boolean isPartitionKey) {
        this.isPartitionKey = isPartitionKey;
        return this;
    }

    /**
     * 是否分区键。
     * @return isPartitionKey
     */
    public Boolean getIsPartitionKey() {
        return isPartitionKey;
    }

    public void setIsPartitionKey(Boolean isPartitionKey) {
        this.isPartitionKey = isPartitionKey;
    }

    public FactTableAttributeVO withIsForeignKey(Boolean isForeignKey) {
        this.isForeignKey = isForeignKey;
        return this;
    }

    /**
     * 是否外键，只读。
     * @return isForeignKey
     */
    public Boolean getIsForeignKey() {
        return isForeignKey;
    }

    public void setIsForeignKey(Boolean isForeignKey) {
        this.isForeignKey = isForeignKey;
    }

    public FactTableAttributeVO withSecrecyLevels(List<SecrecyLevelRecordVO> secrecyLevels) {
        this.secrecyLevels = secrecyLevels;
        return this;
    }

    public FactTableAttributeVO addSecrecyLevelsItem(SecrecyLevelRecordVO secrecyLevelsItem) {
        if (this.secrecyLevels == null) {
            this.secrecyLevels = new ArrayList<>();
        }
        this.secrecyLevels.add(secrecyLevelsItem);
        return this;
    }

    public FactTableAttributeVO withSecrecyLevels(Consumer<List<SecrecyLevelRecordVO>> secrecyLevelsSetter) {
        if (this.secrecyLevels == null) {
            this.secrecyLevels = new ArrayList<>();
        }
        secrecyLevelsSetter.accept(this.secrecyLevels);
        return this;
    }

    /**
     * 密级
     * @return secrecyLevels
     */
    public List<SecrecyLevelRecordVO> getSecrecyLevels() {
        return secrecyLevels;
    }

    public void setSecrecyLevels(List<SecrecyLevelRecordVO> secrecyLevels) {
        this.secrecyLevels = secrecyLevels;
    }

    public FactTableAttributeVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FactTableAttributeVO withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 字段类型。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public FactTableAttributeVO withDomainType(DataTypeDomainEnum domainType) {
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

    public FactTableAttributeVO withDataTypeExtend(String dataTypeExtend) {
        this.dataTypeExtend = dataTypeExtend;
        return this;
    }

    /**
     * 数据类型扩展字段。
     * @return dataTypeExtend
     */
    public String getDataTypeExtend() {
        return dataTypeExtend;
    }

    public void setDataTypeExtend(String dataTypeExtend) {
        this.dataTypeExtend = dataTypeExtend;
    }

    public FactTableAttributeVO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 英文名。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public FactTableAttributeVO withNameCh(String nameCh) {
        this.nameCh = nameCh;
        return this;
    }

    /**
     * 中文名。
     * @return nameCh
     */
    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public FactTableAttributeVO withNotNull(Boolean notNull) {
        this.notNull = notNull;
        return this;
    }

    /**
     * 是否不为空。
     * @return notNull
     */
    public Boolean getNotNull() {
        return notNull;
    }

    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    public FactTableAttributeVO withAttributeType(BizTypeEnum attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * Get attributeType
     * @return attributeType
     */
    public BizTypeEnum getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(BizTypeEnum attributeType) {
        this.attributeType = attributeType;
    }

    public FactTableAttributeVO withStandRowId(String standRowId) {
        this.standRowId = standRowId;
        return this;
    }

    /**
     * 关联的数据标准的ID，填写String类型替代Long类型。
     * @return standRowId
     */
    public String getStandRowId() {
        return standRowId;
    }

    public void setStandRowId(String standRowId) {
        this.standRowId = standRowId;
    }

    public FactTableAttributeVO withStandRowName(String standRowName) {
        this.standRowName = standRowName;
        return this;
    }

    /**
     * 关联的数据标准名称，只读。
     * @return standRowName
     */
    public String getStandRowName() {
        return standRowName;
    }

    public void setStandRowName(String standRowName) {
        this.standRowName = standRowName;
    }

    public FactTableAttributeVO withQualityInfos(List<QualityInfoVO> qualityInfos) {
        this.qualityInfos = qualityInfos;
        return this;
    }

    public FactTableAttributeVO addQualityInfosItem(QualityInfoVO qualityInfosItem) {
        if (this.qualityInfos == null) {
            this.qualityInfos = new ArrayList<>();
        }
        this.qualityInfos.add(qualityInfosItem);
        return this;
    }

    public FactTableAttributeVO withQualityInfos(Consumer<List<QualityInfoVO>> qualityInfosSetter) {
        if (this.qualityInfos == null) {
            this.qualityInfos = new ArrayList<>();
        }
        qualityInfosSetter.accept(this.qualityInfos);
        return this;
    }

    /**
     * 质量信息，只读。
     * @return qualityInfos
     */
    public List<QualityInfoVO> getQualityInfos() {
        return qualityInfos;
    }

    public void setQualityInfos(List<QualityInfoVO> qualityInfos) {
        this.qualityInfos = qualityInfos;
    }

    public FactTableAttributeVO withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 别名。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public FactTableAttributeVO withSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
        return this;
    }

    public FactTableAttributeVO addSelfDefinedFieldsItem(SelfDefinedFieldVO selfDefinedFieldsItem) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        this.selfDefinedFields.add(selfDefinedFieldsItem);
        return this;
    }

    public FactTableAttributeVO withSelfDefinedFields(Consumer<List<SelfDefinedFieldVO>> selfDefinedFieldsSetter) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        selfDefinedFieldsSetter.accept(this.selfDefinedFields);
        return this;
    }

    /**
     * 自定义项。
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
        FactTableAttributeVO that = (FactTableAttributeVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.factLogicTableId, that.factLogicTableId)
            && Objects.equals(this.ordinal, that.ordinal) && Objects.equals(this.dimensionId, that.dimensionId)
            && Objects.equals(this.role, that.role) && Objects.equals(this.dimension, that.dimension)
            && Objects.equals(this.isPrimaryKey, that.isPrimaryKey)
            && Objects.equals(this.isPartitionKey, that.isPartitionKey)
            && Objects.equals(this.isForeignKey, that.isForeignKey)
            && Objects.equals(this.secrecyLevels, that.secrecyLevels)
            && Objects.equals(this.description, that.description) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.domainType, that.domainType)
            && Objects.equals(this.dataTypeExtend, that.dataTypeExtend) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.nameCh, that.nameCh) && Objects.equals(this.notNull, that.notNull)
            && Objects.equals(this.attributeType, that.attributeType)
            && Objects.equals(this.standRowId, that.standRowId) && Objects.equals(this.standRowName, that.standRowName)
            && Objects.equals(this.qualityInfos, that.qualityInfos) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.selfDefinedFields, that.selfDefinedFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            factLogicTableId,
            ordinal,
            dimensionId,
            role,
            dimension,
            isPrimaryKey,
            isPartitionKey,
            isForeignKey,
            secrecyLevels,
            description,
            dataType,
            domainType,
            dataTypeExtend,
            nameEn,
            nameCh,
            notNull,
            attributeType,
            standRowId,
            standRowName,
            qualityInfos,
            alias,
            selfDefinedFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactTableAttributeVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    factLogicTableId: ").append(toIndentedString(factLogicTableId)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    dimensionId: ").append(toIndentedString(dimensionId)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
        sb.append("    isPrimaryKey: ").append(toIndentedString(isPrimaryKey)).append("\n");
        sb.append("    isPartitionKey: ").append(toIndentedString(isPartitionKey)).append("\n");
        sb.append("    isForeignKey: ").append(toIndentedString(isForeignKey)).append("\n");
        sb.append("    secrecyLevels: ").append(toIndentedString(secrecyLevels)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    dataTypeExtend: ").append(toIndentedString(dataTypeExtend)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    notNull: ").append(toIndentedString(notNull)).append("\n");
        sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
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
