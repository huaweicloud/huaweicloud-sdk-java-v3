package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListShareBandwidthTypesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private String fields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_type")

    private String bandwidthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_zh")

    private String nameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListShareBandwidthTypesRequest withFields(String fields) {
        this.fields = fields;
        return this;
    }

    /** 形式为\\\"fields=id&fields=bandwidth_type&...\\\"，支持字段：id/bandwidth_type/name_en/name_zh/created_at/update_at/public_border_group/description
     * 
     * @return fields */
    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public ListShareBandwidthTypesRequest withId(String id) {
        this.id = id;
        return this;
    }

    /** 支持带宽类型的id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListShareBandwidthTypesRequest withBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }

    /** 带宽支持类型
     * 
     * @return bandwidthType */
    public String getBandwidthType() {
        return bandwidthType;
    }

    public void setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
    }

    public ListShareBandwidthTypesRequest withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /** 带宽类型英文表述
     * 
     * @return nameEn */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public ListShareBandwidthTypesRequest withNameZh(String nameZh) {
        this.nameZh = nameZh;
        return this;
    }

    /** 带宽类型中文表述
     * 
     * @return nameZh */
    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public ListShareBandwidthTypesRequest withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /** 带宽类型所处位置，中心站点or边缘站点
     * 
     * @return publicBorderGroup */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public ListShareBandwidthTypesRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /** 排序，形式为\"sort_key=id&sort_dir=asc\" 支持字段：id/bandwidth_type/public_border_group
     * 
     * @return sortKey */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListShareBandwidthTypesRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /** 排序方向 取值范围：asc、desc
     * 
     * @return sortDir */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListShareBandwidthTypesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页返回的个数取值范围：0~[2000]，其中2000为局点差异项，具体取值由局点决定 minimum: 0 maximum: 2000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListShareBandwidthTypesRequest listShareBandwidthTypesRequest = (ListShareBandwidthTypesRequest) o;
        return Objects.equals(this.fields, listShareBandwidthTypesRequest.fields)
            && Objects.equals(this.id, listShareBandwidthTypesRequest.id)
            && Objects.equals(this.bandwidthType, listShareBandwidthTypesRequest.bandwidthType)
            && Objects.equals(this.nameEn, listShareBandwidthTypesRequest.nameEn)
            && Objects.equals(this.nameZh, listShareBandwidthTypesRequest.nameZh)
            && Objects.equals(this.publicBorderGroup, listShareBandwidthTypesRequest.publicBorderGroup)
            && Objects.equals(this.sortKey, listShareBandwidthTypesRequest.sortKey)
            && Objects.equals(this.sortDir, listShareBandwidthTypesRequest.sortDir)
            && Objects.equals(this.limit, listShareBandwidthTypesRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, id, bandwidthType, nameEn, nameZh, publicBorderGroup, sortKey, sortDir, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListShareBandwidthTypesRequest {\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    bandwidthType: ").append(toIndentedString(bandwidthType)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    nameZh: ").append(toIndentedString(nameZh)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
