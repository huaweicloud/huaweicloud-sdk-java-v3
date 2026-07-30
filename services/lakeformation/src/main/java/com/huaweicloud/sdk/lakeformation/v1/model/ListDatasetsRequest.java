package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDatasetsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverse_page")

    private Boolean reversePage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_partern")

    private String namePartern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    public ListDatasetsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释:** LakeFormation实例ID。创建实例时自动生成。例如：2180518f-42b8-4947-b20b-adfc53981a25。 **约束限制:** 不涉及 **取值范围:** 不涉及 **默认取值:** 不涉及
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListDatasetsRequest withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * **参数解释:** catalog名称。 **约束限制:** 只能包含字母、数字和下划线，且长度为1~256个字符。 **取值范围:** 长度为1~256个字符 **默认取值:** 不涉及
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public ListDatasetsRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * **参数解释:** 数据库名称。 **约束限制:** 只能包含中文、字母、数字、下划线、中划线，且长度为1~128个字符。 **取值范围:** 长度为1~128个字符 **默认取值:** 不涉及 
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ListDatasetsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释:** 查询返回条数。 **约束限制:** 取值为0~1000 **取值范围:** 取值为0~1000 **默认取值:** 1000
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDatasetsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * **参数解释:** 查询的起始记录ID。 **约束限制:** 长度为0~256个字符 **取值范围:** 长度为0~256个字符 **默认取值:** 不涉及
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListDatasetsRequest withReversePage(Boolean reversePage) {
        this.reversePage = reversePage;
        return this;
    }

    /**
     * **参数解释:** 是否查询上一页。 **约束限制:** 不涉及 **取值范围:** 不涉及 **默认取值:** false
     * @return reversePage
     */
    public Boolean getReversePage() {
        return reversePage;
    }

    public void setReversePage(Boolean reversePage) {
        this.reversePage = reversePage;
    }

    public ListDatasetsRequest withNamePartern(String namePartern) {
        this.namePartern = namePartern;
        return this;
    }

    /**
     * **参数解释:** 数据集名称通配符，用于模糊查询。 **约束限制:** 只能包含中文、字母、数字和_|*.-特殊字符，且长度为1~256个字符。 **取值范围:** 长度为1~256个字符
     * @return namePartern
     */
    public String getNamePartern() {
        return namePartern;
    }

    public void setNamePartern(String namePartern) {
        this.namePartern = namePartern;
    }

    public ListDatasetsRequest withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 数据格式 描述文件的组织方式：行存储/文本/图片/音频/视频/自定义
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDatasetsRequest that = (ListDatasetsRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.catalogName, that.catalogName)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.reversePage, that.reversePage)
            && Objects.equals(this.namePartern, that.namePartern) && Objects.equals(this.format, that.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, catalogName, databaseName, limit, marker, reversePage, namePartern, format);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatasetsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    reversePage: ").append(toIndentedString(reversePage)).append("\n");
        sb.append("    namePartern: ").append(toIndentedString(namePartern)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
