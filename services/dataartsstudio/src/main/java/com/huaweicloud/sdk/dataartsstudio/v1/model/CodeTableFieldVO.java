package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 码表属性信息。
 */
public class CodeTableFieldVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_table_id")

    private String codeTableId;

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
    @JsonProperty(value = "is_unique_key")

    private Boolean isUniqueKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_table_field_values")

    private List<CodeTableFieldValueVO> codeTableFieldValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_field_values")

    private Integer countFieldValues;

    public CodeTableFieldVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 码表字段ID，ID字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CodeTableFieldVO withCodeTableId(String codeTableId) {
        this.codeTableId = codeTableId;
        return this;
    }

    /**
     * 所属码表ID，ID字符串。
     * @return codeTableId
     */
    public String getCodeTableId() {
        return codeTableId;
    }

    public void setCodeTableId(String codeTableId) {
        this.codeTableId = codeTableId;
    }

    public CodeTableFieldVO withOrdinal(Integer ordinal) {
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

    public CodeTableFieldVO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 字段名，英文。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public CodeTableFieldVO withNameCh(String nameCh) {
        this.nameCh = nameCh;
        return this;
    }

    /**
     * 字段名，中文。
     * @return nameCh
     */
    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public CodeTableFieldVO withDescription(String description) {
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

    public CodeTableFieldVO withDataType(String dataType) {
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

    public CodeTableFieldVO withDomainType(DataTypeDomainEnum domainType) {
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

    public CodeTableFieldVO withDataTypeExtend(String dataTypeExtend) {
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

    public CodeTableFieldVO withIsUniqueKey(Boolean isUniqueKey) {
        this.isUniqueKey = isUniqueKey;
        return this;
    }

    /**
     * 是否唯一。
     * @return isUniqueKey
     */
    public Boolean getIsUniqueKey() {
        return isUniqueKey;
    }

    public void setIsUniqueKey(Boolean isUniqueKey) {
        this.isUniqueKey = isUniqueKey;
    }

    public CodeTableFieldVO withCodeTableFieldValues(List<CodeTableFieldValueVO> codeTableFieldValues) {
        this.codeTableFieldValues = codeTableFieldValues;
        return this;
    }

    public CodeTableFieldVO addCodeTableFieldValuesItem(CodeTableFieldValueVO codeTableFieldValuesItem) {
        if (this.codeTableFieldValues == null) {
            this.codeTableFieldValues = new ArrayList<>();
        }
        this.codeTableFieldValues.add(codeTableFieldValuesItem);
        return this;
    }

    public CodeTableFieldVO withCodeTableFieldValues(Consumer<List<CodeTableFieldValueVO>> codeTableFieldValuesSetter) {
        if (this.codeTableFieldValues == null) {
            this.codeTableFieldValues = new ArrayList<>();
        }
        codeTableFieldValuesSetter.accept(this.codeTableFieldValues);
        return this;
    }

    /**
     * 码表属性值。
     * @return codeTableFieldValues
     */
    public List<CodeTableFieldValueVO> getCodeTableFieldValues() {
        return codeTableFieldValues;
    }

    public void setCodeTableFieldValues(List<CodeTableFieldValueVO> codeTableFieldValues) {
        this.codeTableFieldValues = codeTableFieldValues;
    }

    public CodeTableFieldVO withCountFieldValues(Integer countFieldValues) {
        this.countFieldValues = countFieldValues;
        return this;
    }

    /**
     * 码表属性值总数。
     * @return countFieldValues
     */
    public Integer getCountFieldValues() {
        return countFieldValues;
    }

    public void setCountFieldValues(Integer countFieldValues) {
        this.countFieldValues = countFieldValues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CodeTableFieldVO that = (CodeTableFieldVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.codeTableId, that.codeTableId)
            && Objects.equals(this.ordinal, that.ordinal) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.nameCh, that.nameCh) && Objects.equals(this.description, that.description)
            && Objects.equals(this.dataType, that.dataType) && Objects.equals(this.domainType, that.domainType)
            && Objects.equals(this.dataTypeExtend, that.dataTypeExtend)
            && Objects.equals(this.isUniqueKey, that.isUniqueKey)
            && Objects.equals(this.codeTableFieldValues, that.codeTableFieldValues)
            && Objects.equals(this.countFieldValues, that.countFieldValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            codeTableId,
            ordinal,
            nameEn,
            nameCh,
            description,
            dataType,
            domainType,
            dataTypeExtend,
            isUniqueKey,
            codeTableFieldValues,
            countFieldValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeTableFieldVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    codeTableId: ").append(toIndentedString(codeTableId)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    dataTypeExtend: ").append(toIndentedString(dataTypeExtend)).append("\n");
        sb.append("    isUniqueKey: ").append(toIndentedString(isUniqueKey)).append("\n");
        sb.append("    codeTableFieldValues: ").append(toIndentedString(codeTableFieldValues)).append("\n");
        sb.append("    countFieldValues: ").append(toIndentedString(countFieldValues)).append("\n");
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
