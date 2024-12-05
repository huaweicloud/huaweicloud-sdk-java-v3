package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DimensionLogicTableAttributeVO
 */
public class DimensionLogicTableAttributeVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_logic_table_id")

    private String dimensionLogicTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ordinal")

    private Integer ordinal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_attribute_id")

    private String dimensionAttributeId;

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
    @JsonProperty(value = "not_null")

    private Boolean notNull;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_levels")

    private List<SecrecyLevelVO> secrecyLevels = null;

    public DimensionLogicTableAttributeVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 维度表ID，ID字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DimensionLogicTableAttributeVO withDimensionLogicTableId(String dimensionLogicTableId) {
        this.dimensionLogicTableId = dimensionLogicTableId;
        return this;
    }

    /**
     * 所属维表ID。
     * @return dimensionLogicTableId
     */
    public String getDimensionLogicTableId() {
        return dimensionLogicTableId;
    }

    public void setDimensionLogicTableId(String dimensionLogicTableId) {
        this.dimensionLogicTableId = dimensionLogicTableId;
    }

    public DimensionLogicTableAttributeVO withOrdinal(Integer ordinal) {
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

    public DimensionLogicTableAttributeVO withDimensionAttributeId(String dimensionAttributeId) {
        this.dimensionAttributeId = dimensionAttributeId;
        return this;
    }

    /**
     * 维度属性ID，ID字符串。
     * @return dimensionAttributeId
     */
    public String getDimensionAttributeId() {
        return dimensionAttributeId;
    }

    public void setDimensionAttributeId(String dimensionAttributeId) {
        this.dimensionAttributeId = dimensionAttributeId;
    }

    public DimensionLogicTableAttributeVO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 字段名，只读。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public DimensionLogicTableAttributeVO withNameCh(String nameCh) {
        this.nameCh = nameCh;
        return this;
    }

    /**
     * 业务属性，只读。
     * @return nameCh
     */
    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public DimensionLogicTableAttributeVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述，只读。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DimensionLogicTableAttributeVO withDataType(String dataType) {
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

    public DimensionLogicTableAttributeVO withDomainType(DataTypeDomainEnum domainType) {
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

    public DimensionLogicTableAttributeVO withDataTypeExtend(String dataTypeExtend) {
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

    public DimensionLogicTableAttributeVO withIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
        return this;
    }

    /**
     * 是否主键，只读。
     * @return isPrimaryKey
     */
    public Boolean getIsPrimaryKey() {
        return isPrimaryKey;
    }

    public void setIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
    }

    public DimensionLogicTableAttributeVO withIsBizPrimary(Boolean isBizPrimary) {
        this.isBizPrimary = isBizPrimary;
        return this;
    }

    /**
     * 是否业务主键。
     * @return isBizPrimary
     */
    public Boolean getIsBizPrimary() {
        return isBizPrimary;
    }

    public void setIsBizPrimary(Boolean isBizPrimary) {
        this.isBizPrimary = isBizPrimary;
    }

    public DimensionLogicTableAttributeVO withIsPartitionKey(Boolean isPartitionKey) {
        this.isPartitionKey = isPartitionKey;
        return this;
    }

    /**
     * 是否主键分区，只读。
     * @return isPartitionKey
     */
    public Boolean getIsPartitionKey() {
        return isPartitionKey;
    }

    public void setIsPartitionKey(Boolean isPartitionKey) {
        this.isPartitionKey = isPartitionKey;
    }

    public DimensionLogicTableAttributeVO withNotNull(Boolean notNull) {
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

    public DimensionLogicTableAttributeVO withStandRowId(String standRowId) {
        this.standRowId = standRowId;
        return this;
    }

    /**
     * 关联的数据标准的ID，ID字符串。
     * @return standRowId
     */
    public String getStandRowId() {
        return standRowId;
    }

    public void setStandRowId(String standRowId) {
        this.standRowId = standRowId;
    }

    public DimensionLogicTableAttributeVO withStandRowName(String standRowName) {
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

    public DimensionLogicTableAttributeVO withQualityInfos(List<QualityInfoVO> qualityInfos) {
        this.qualityInfos = qualityInfos;
        return this;
    }

    public DimensionLogicTableAttributeVO addQualityInfosItem(QualityInfoVO qualityInfosItem) {
        if (this.qualityInfos == null) {
            this.qualityInfos = new ArrayList<>();
        }
        this.qualityInfos.add(qualityInfosItem);
        return this;
    }

    public DimensionLogicTableAttributeVO withQualityInfos(Consumer<List<QualityInfoVO>> qualityInfosSetter) {
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

    public DimensionLogicTableAttributeVO withAlias(String alias) {
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

    public DimensionLogicTableAttributeVO withSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
        return this;
    }

    public DimensionLogicTableAttributeVO addSelfDefinedFieldsItem(SelfDefinedFieldVO selfDefinedFieldsItem) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        this.selfDefinedFields.add(selfDefinedFieldsItem);
        return this;
    }

    public DimensionLogicTableAttributeVO withSelfDefinedFields(
        Consumer<List<SelfDefinedFieldVO>> selfDefinedFieldsSetter) {
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

    public DimensionLogicTableAttributeVO withSecrecyLevels(List<SecrecyLevelVO> secrecyLevels) {
        this.secrecyLevels = secrecyLevels;
        return this;
    }

    public DimensionLogicTableAttributeVO addSecrecyLevelsItem(SecrecyLevelVO secrecyLevelsItem) {
        if (this.secrecyLevels == null) {
            this.secrecyLevels = new ArrayList<>();
        }
        this.secrecyLevels.add(secrecyLevelsItem);
        return this;
    }

    public DimensionLogicTableAttributeVO withSecrecyLevels(Consumer<List<SecrecyLevelVO>> secrecyLevelsSetter) {
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
    public List<SecrecyLevelVO> getSecrecyLevels() {
        return secrecyLevels;
    }

    public void setSecrecyLevels(List<SecrecyLevelVO> secrecyLevels) {
        this.secrecyLevels = secrecyLevels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DimensionLogicTableAttributeVO that = (DimensionLogicTableAttributeVO) obj;
        return Objects.equals(this.id, that.id)
            && Objects.equals(this.dimensionLogicTableId, that.dimensionLogicTableId)
            && Objects.equals(this.ordinal, that.ordinal)
            && Objects.equals(this.dimensionAttributeId, that.dimensionAttributeId)
            && Objects.equals(this.nameEn, that.nameEn) && Objects.equals(this.nameCh, that.nameCh)
            && Objects.equals(this.description, that.description) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.domainType, that.domainType)
            && Objects.equals(this.dataTypeExtend, that.dataTypeExtend)
            && Objects.equals(this.isPrimaryKey, that.isPrimaryKey)
            && Objects.equals(this.isBizPrimary, that.isBizPrimary)
            && Objects.equals(this.isPartitionKey, that.isPartitionKey) && Objects.equals(this.notNull, that.notNull)
            && Objects.equals(this.standRowId, that.standRowId) && Objects.equals(this.standRowName, that.standRowName)
            && Objects.equals(this.qualityInfos, that.qualityInfos) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.selfDefinedFields, that.selfDefinedFields)
            && Objects.equals(this.secrecyLevels, that.secrecyLevels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            dimensionLogicTableId,
            ordinal,
            dimensionAttributeId,
            nameEn,
            nameCh,
            description,
            dataType,
            domainType,
            dataTypeExtend,
            isPrimaryKey,
            isBizPrimary,
            isPartitionKey,
            notNull,
            standRowId,
            standRowName,
            qualityInfos,
            alias,
            selfDefinedFields,
            secrecyLevels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DimensionLogicTableAttributeVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dimensionLogicTableId: ").append(toIndentedString(dimensionLogicTableId)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    dimensionAttributeId: ").append(toIndentedString(dimensionAttributeId)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    dataTypeExtend: ").append(toIndentedString(dataTypeExtend)).append("\n");
        sb.append("    isPrimaryKey: ").append(toIndentedString(isPrimaryKey)).append("\n");
        sb.append("    isBizPrimary: ").append(toIndentedString(isBizPrimary)).append("\n");
        sb.append("    isPartitionKey: ").append(toIndentedString(isPartitionKey)).append("\n");
        sb.append("    notNull: ").append(toIndentedString(notNull)).append("\n");
        sb.append("    standRowId: ").append(toIndentedString(standRowId)).append("\n");
        sb.append("    standRowName: ").append(toIndentedString(standRowName)).append("\n");
        sb.append("    qualityInfos: ").append(toIndentedString(qualityInfos)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    selfDefinedFields: ").append(toIndentedString(selfDefinedFields)).append("\n");
        sb.append("    secrecyLevels: ").append(toIndentedString(secrecyLevels)).append("\n");
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
