package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 汇总表属性。
 */
public class AggregationLogicTableAttributeVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregation_logic_table_id")

    private String aggregationLogicTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ordinal")

    private Integer ordinal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_ch")

    private String nameCh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute_type")

    private BizTypeEnum attributeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_primary_key")

    private Boolean isPrimaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_partition_key")

    private Boolean isPartitionKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_null")

    private Boolean notNull;

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
    @JsonProperty(value = "ref_id")

    private String refId;

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

    public AggregationLogicTableAttributeVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编码。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AggregationLogicTableAttributeVO withAggregationLogicTableId(String aggregationLogicTableId) {
        this.aggregationLogicTableId = aggregationLogicTableId;
        return this;
    }

    /**
     * 所属汇总表ID。
     * @return aggregationLogicTableId
     */
    public String getAggregationLogicTableId() {
        return aggregationLogicTableId;
    }

    public void setAggregationLogicTableId(String aggregationLogicTableId) {
        this.aggregationLogicTableId = aggregationLogicTableId;
    }

    public AggregationLogicTableAttributeVO withOrdinal(Integer ordinal) {
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

    public AggregationLogicTableAttributeVO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 字段名。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public AggregationLogicTableAttributeVO withNameCh(String nameCh) {
        this.nameCh = nameCh;
        return this;
    }

    /**
     * 业务属性。
     * @return nameCh
     */
    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public AggregationLogicTableAttributeVO withAttributeType(BizTypeEnum attributeType) {
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

    public AggregationLogicTableAttributeVO withIsPrimaryKey(Boolean isPrimaryKey) {
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

    public AggregationLogicTableAttributeVO withIsPartitionKey(Boolean isPartitionKey) {
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

    public AggregationLogicTableAttributeVO withNotNull(Boolean notNull) {
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

    public AggregationLogicTableAttributeVO withDescription(String description) {
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

    public AggregationLogicTableAttributeVO withDataType(String dataType) {
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

    public AggregationLogicTableAttributeVO withDomainType(DataTypeDomainEnum domainType) {
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

    public AggregationLogicTableAttributeVO withDataTypeExtend(String dataTypeExtend) {
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

    public AggregationLogicTableAttributeVO withRefId(String refId) {
        this.refId = refId;
        return this;
    }

    /**
     * 关联ID。
     * @return refId
     */
    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public AggregationLogicTableAttributeVO withStandRowId(String standRowId) {
        this.standRowId = standRowId;
        return this;
    }

    /**
     * 关联的数据标准的ID。
     * @return standRowId
     */
    public String getStandRowId() {
        return standRowId;
    }

    public void setStandRowId(String standRowId) {
        this.standRowId = standRowId;
    }

    public AggregationLogicTableAttributeVO withStandRowName(String standRowName) {
        this.standRowName = standRowName;
        return this;
    }

    /**
     * 关联的数据标准名称。
     * @return standRowName
     */
    public String getStandRowName() {
        return standRowName;
    }

    public void setStandRowName(String standRowName) {
        this.standRowName = standRowName;
    }

    public AggregationLogicTableAttributeVO withQualityInfos(List<QualityInfoVO> qualityInfos) {
        this.qualityInfos = qualityInfos;
        return this;
    }

    public AggregationLogicTableAttributeVO addQualityInfosItem(QualityInfoVO qualityInfosItem) {
        if (this.qualityInfos == null) {
            this.qualityInfos = new ArrayList<>();
        }
        this.qualityInfos.add(qualityInfosItem);
        return this;
    }

    public AggregationLogicTableAttributeVO withQualityInfos(Consumer<List<QualityInfoVO>> qualityInfosSetter) {
        if (this.qualityInfos == null) {
            this.qualityInfos = new ArrayList<>();
        }
        qualityInfosSetter.accept(this.qualityInfos);
        return this;
    }

    /**
     * 质量信息。
     * @return qualityInfos
     */
    public List<QualityInfoVO> getQualityInfos() {
        return qualityInfos;
    }

    public void setQualityInfos(List<QualityInfoVO> qualityInfos) {
        this.qualityInfos = qualityInfos;
    }

    public AggregationLogicTableAttributeVO withAlias(String alias) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AggregationLogicTableAttributeVO that = (AggregationLogicTableAttributeVO) obj;
        return Objects.equals(this.id, that.id)
            && Objects.equals(this.aggregationLogicTableId, that.aggregationLogicTableId)
            && Objects.equals(this.ordinal, that.ordinal) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.nameCh, that.nameCh) && Objects.equals(this.attributeType, that.attributeType)
            && Objects.equals(this.isPrimaryKey, that.isPrimaryKey)
            && Objects.equals(this.isPartitionKey, that.isPartitionKey) && Objects.equals(this.notNull, that.notNull)
            && Objects.equals(this.description, that.description) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.domainType, that.domainType)
            && Objects.equals(this.dataTypeExtend, that.dataTypeExtend) && Objects.equals(this.refId, that.refId)
            && Objects.equals(this.standRowId, that.standRowId) && Objects.equals(this.standRowName, that.standRowName)
            && Objects.equals(this.qualityInfos, that.qualityInfos) && Objects.equals(this.alias, that.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            aggregationLogicTableId,
            ordinal,
            nameEn,
            nameCh,
            attributeType,
            isPrimaryKey,
            isPartitionKey,
            notNull,
            description,
            dataType,
            domainType,
            dataTypeExtend,
            refId,
            standRowId,
            standRowName,
            qualityInfos,
            alias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregationLogicTableAttributeVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    aggregationLogicTableId: ").append(toIndentedString(aggregationLogicTableId)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    attributeType: ").append(toIndentedString(attributeType)).append("\n");
        sb.append("    isPrimaryKey: ").append(toIndentedString(isPrimaryKey)).append("\n");
        sb.append("    isPartitionKey: ").append(toIndentedString(isPartitionKey)).append("\n");
        sb.append("    notNull: ").append(toIndentedString(notNull)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    dataTypeExtend: ").append(toIndentedString(dataTypeExtend)).append("\n");
        sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
        sb.append("    standRowId: ").append(toIndentedString(standRowId)).append("\n");
        sb.append("    standRowName: ").append(toIndentedString(standRowName)).append("\n");
        sb.append("    qualityInfos: ").append(toIndentedString(qualityInfos)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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
