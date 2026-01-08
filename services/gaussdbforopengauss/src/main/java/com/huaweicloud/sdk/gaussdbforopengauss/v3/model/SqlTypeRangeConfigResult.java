package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 全量SQL开关记录
 */
public class SqlTypeRangeConfigResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefixes")

    private String prefixes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_preset")

    private Boolean isPreset;

    public SqlTypeRangeConfigResult withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**: SQL类型的归类名称。 对常用SQL类型，简单归类为6个类别，每个类别对应一组固定的采集SQL语句类型列表，采用前缀进行匹配。 对于其他场景，可以使用自定义类别，允许按需自定义采集SQL的语句前缀。 **取值范围**: - all：不区分SQL类型，全部采集。 - ddl：只采集DDL语句类型。 - dml：只采集DML语句类型。 - dcl：只采集DCL语句类型。 - tcl：只采集TCL语句类型。 - dql：只采集DQL语句类型。 - custom：采集自定义语句类型。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public SqlTypeRangeConfigResult withPrefixes(String prefixes) {
        this.prefixes = prefixes;
        return this;
    }

    /**
     * **参数解释**: 对应SQL类别中，采集的SQL语句类型列表，采用前缀方式进行匹配。 **取值范围**: - all：不区分SQL类型，全部采集。对应取值为：[\".*\"]。 - ddl：只采集DDL语句类别，对于取值为：[\"create\", \"alter\", \"drop\", \"truncate\", \"reindex\", \"vacuum\", \"analyze\", \"declare\", \"move\", \"close\"]。 - dml：只采集DML语句类型，对于取值为：[\"insert\", \"update\", \"delete\", \"merge\", \"show\", \"explain\", \"prepare\", \"lock\", \"copy\", \"execute\", \"deallocate\"]。 - dcl：只采集DCL语句类型，对于取值为：[\"grant\", \"revoke\", \"reassign\", \"set\"]。 - tcl：只采集TCL语句类型，对于取值为：[\"begin\", \"commit\", \"rollback\", \"start\", \"savepoint\", \"checkpoint\", \"release savepoint\"]。 - dql：只采集DQL语句类型，对于取值为：[\"select\"]。 - custom：采集自定义语句类型。对应取值为：开启全量SQL时，用户填写的自定义SQL语句类型列表。
     * @return prefixes
     */
    public String getPrefixes() {
        return prefixes;
    }

    public void setPrefixes(String prefixes) {
        this.prefixes = prefixes;
    }

    public SqlTypeRangeConfigResult withIsPreset(Boolean isPreset) {
        this.isPreset = isPreset;
        return this;
    }

    /**
     * **参数解释**: 对应SQL类别是否为预置类别。 **取值范围**: - true：对应category取值all、ddl 、dml 、dcl 、tcl 、dql 。 - false：对应category取值custom。
     * @return isPreset
     */
    public Boolean getIsPreset() {
        return isPreset;
    }

    public void setIsPreset(Boolean isPreset) {
        this.isPreset = isPreset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlTypeRangeConfigResult that = (SqlTypeRangeConfigResult) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.prefixes, that.prefixes)
            && Objects.equals(this.isPreset, that.isPreset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, prefixes, isPreset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlTypeRangeConfigResult {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    prefixes: ").append(toIndentedString(prefixes)).append("\n");
        sb.append("    isPreset: ").append(toIndentedString(isPreset)).append("\n");
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
