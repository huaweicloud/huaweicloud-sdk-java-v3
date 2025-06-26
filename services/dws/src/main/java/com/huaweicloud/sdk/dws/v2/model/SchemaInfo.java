package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 集群模式空间信息。 **取值范围**： 不涉及。
 */
public class SchemaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_value")

    private Integer totalValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "perm_space")

    private Integer permSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skew_percent")

    private Double skewPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_value")

    private Integer minValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_value")

    private Integer maxValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_dn")

    private String minDn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_dn")

    private String maxDn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dn_num")

    private Integer dnNum;

    public SchemaInfo withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * **参数解释**： 集群模式名称。 **取值范围**： 不涉及。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public SchemaInfo withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * **参数解释**： 数据库名称。 **取值范围**： 不涉及。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public SchemaInfo withTotalValue(Integer totalValue) {
        this.totalValue = totalValue;
        return this;
    }

    /**
     * **参数解释**： 集群模式使用空间总值。 **取值范围**： 不涉及。
     * @return totalValue
     */
    public Integer getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Integer totalValue) {
        this.totalValue = totalValue;
    }

    public SchemaInfo withPermSpace(Integer permSpace) {
        this.permSpace = permSpace;
        return this;
    }

    /**
     * **参数解释**： 集群模式空间阈值。 **取值范围**： 不涉及。
     * @return permSpace
     */
    public Integer getPermSpace() {
        return permSpace;
    }

    public void setPermSpace(Integer permSpace) {
        this.permSpace = permSpace;
    }

    public SchemaInfo withSkewPercent(Double skewPercent) {
        this.skewPercent = skewPercent;
        return this;
    }

    /**
     * **参数解释**： 倾斜率。 **取值范围**： 不涉及。
     * @return skewPercent
     */
    public Double getSkewPercent() {
        return skewPercent;
    }

    public void setSkewPercent(Double skewPercent) {
        this.skewPercent = skewPercent;
    }

    public SchemaInfo withMinValue(Integer minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * **参数解释**： 最小值。 **取值范围**： 不涉及。
     * @return minValue
     */
    public Integer getMinValue() {
        return minValue;
    }

    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    public SchemaInfo withMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * **参数解释**： 最大值。 **取值范围**： 不涉及。
     * @return maxValue
     */
    public Integer getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    public SchemaInfo withMinDn(String minDn) {
        this.minDn = minDn;
        return this;
    }

    /**
     * **参数解释**： 最小dn节点。 **取值范围**： 不涉及。
     * @return minDn
     */
    public String getMinDn() {
        return minDn;
    }

    public void setMinDn(String minDn) {
        this.minDn = minDn;
    }

    public SchemaInfo withMaxDn(String maxDn) {
        this.maxDn = maxDn;
        return this;
    }

    /**
     * **参数解释**： 最大cn节点。 **取值范围**： 不涉及。
     * @return maxDn
     */
    public String getMaxDn() {
        return maxDn;
    }

    public void setMaxDn(String maxDn) {
        this.maxDn = maxDn;
    }

    public SchemaInfo withDnNum(Integer dnNum) {
        this.dnNum = dnNum;
        return this;
    }

    /**
     * **参数解释**： dn节点数量。 **取值范围**： 不涉及。
     * @return dnNum
     */
    public Integer getDnNum() {
        return dnNum;
    }

    public void setDnNum(Integer dnNum) {
        this.dnNum = dnNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SchemaInfo that = (SchemaInfo) obj;
        return Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.totalValue, that.totalValue) && Objects.equals(this.permSpace, that.permSpace)
            && Objects.equals(this.skewPercent, that.skewPercent) && Objects.equals(this.minValue, that.minValue)
            && Objects.equals(this.maxValue, that.maxValue) && Objects.equals(this.minDn, that.minDn)
            && Objects.equals(this.maxDn, that.maxDn) && Objects.equals(this.dnNum, that.dnNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaName,
            databaseName,
            totalValue,
            permSpace,
            skewPercent,
            minValue,
            maxValue,
            minDn,
            maxDn,
            dnNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchemaInfo {\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
        sb.append("    permSpace: ").append(toIndentedString(permSpace)).append("\n");
        sb.append("    skewPercent: ").append(toIndentedString(skewPercent)).append("\n");
        sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("    minDn: ").append(toIndentedString(minDn)).append("\n");
        sb.append("    maxDn: ").append(toIndentedString(maxDn)).append("\n");
        sb.append("    dnNum: ").append(toIndentedString(dnNum)).append("\n");
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
