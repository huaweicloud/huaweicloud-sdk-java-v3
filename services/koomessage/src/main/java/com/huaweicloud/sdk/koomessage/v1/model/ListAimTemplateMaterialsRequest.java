package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAimTemplateMaterialsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "material_id")

    private String materialId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aim_resource_id")

    private String aimResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListAimTemplateMaterialsRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。 - image：表示图片 - video：表示视频 
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ListAimTemplateMaterialsRequest withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ListAimTemplateMaterialsRequest withMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }

    /**
     * 素材ID。
     * @return materialId
     */
    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public ListAimTemplateMaterialsRequest withAimResourceId(String aimResourceId) {
        this.aimResourceId = aimResourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return aimResourceId
     */
    public String getAimResourceId() {
        return aimResourceId;
    }

    public void setAimResourceId(String aimResourceId) {
        this.aimResourceId = aimResourceId;
    }

    public ListAimTemplateMaterialsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 翻页页数，从1开始。
     * minimum: 1
     * maximum: 1000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAimTemplateMaterialsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页展示的条数。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAimTemplateMaterialsRequest that = (ListAimTemplateMaterialsRequest) obj;
        return Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.materialId, that.materialId)
            && Objects.equals(this.aimResourceId, that.aimResourceId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, fileName, materialId, aimResourceId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAimTemplateMaterialsRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
        sb.append("    aimResourceId: ").append(toIndentedString(aimResourceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
