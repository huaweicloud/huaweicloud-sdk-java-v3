package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分类信息描述。
 */
public class Catalog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_zh")

    private String catalogZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_en")

    private String catalogEn;

    public Catalog withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Catalog withCatalogZh(String catalogZh) {
        this.catalogZh = catalogZh;
        return this;
    }

    /**
     * 分类描述(中文)。
     * @return catalogZh
     */
    public String getCatalogZh() {
        return catalogZh;
    }

    public void setCatalogZh(String catalogZh) {
        this.catalogZh = catalogZh;
    }

    public Catalog withCatalogEn(String catalogEn) {
        this.catalogEn = catalogEn;
        return this;
    }

    /**
     * 分类描述(英文)。
     * @return catalogEn
     */
    public String getCatalogEn() {
        return catalogEn;
    }

    public void setCatalogEn(String catalogEn) {
        this.catalogEn = catalogEn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Catalog that = (Catalog) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.catalogZh, that.catalogZh)
            && Objects.equals(this.catalogEn, that.catalogEn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, catalogZh, catalogEn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Catalog {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    catalogZh: ").append(toIndentedString(catalogZh)).append("\n");
        sb.append("    catalogEn: ").append(toIndentedString(catalogEn)).append("\n");
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
