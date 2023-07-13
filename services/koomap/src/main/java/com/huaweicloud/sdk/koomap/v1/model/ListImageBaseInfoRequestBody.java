package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ListImageBaseInfoRequestBody
 */
public class ListImageBaseInfoRequestBody implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_date_from")

    private String imageDateFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_date_to")

    private String imageDateTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_status")

    private String imageStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raw_alias")

    private String rawAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_alias")

    private String imageAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_levels")

    private String imageLevels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_product")

    private String isProduct;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListImageBaseInfoRequestBody withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 卫星影像名称，支持模糊查询。 格式为中英文、数字、下划线、中划线、“.”，长度100个字符以内。
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ListImageBaseInfoRequestBody withImageDateFrom(String imageDateFrom) {
        this.imageDateFrom = imageDateFrom;
        return this;
    }

    /**
     * 卫星影像上传起始时间。 格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return imageDateFrom
     */
    public String getImageDateFrom() {
        return imageDateFrom;
    }

    public void setImageDateFrom(String imageDateFrom) {
        this.imageDateFrom = imageDateFrom;
    }

    public ListImageBaseInfoRequestBody withImageDateTo(String imageDateTo) {
        this.imageDateTo = imageDateTo;
        return this;
    }

    /**
     * 卫星影像上传截止时间。 格式为UTC标准时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return imageDateTo
     */
    public String getImageDateTo() {
        return imageDateTo;
    }

    public void setImageDateTo(String imageDateTo) {
        this.imageDateTo = imageDateTo;
    }

    public ListImageBaseInfoRequestBody withImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
        return this;
    }

    /**
     * 卫星影像迁移状态。 当前仅支持完成（0）、迁入中（1）、迁入失败（2）、迁出中（3）、迁出失败（4）。
     * @return imageStatus
     */
    public String getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
    }

    public ListImageBaseInfoRequestBody withRawAlias(String rawAlias) {
        this.rawAlias = rawAlias;
        return this;
    }

    /**
     * 卫星影像别名。 支持模糊查询，格式为中英文、数字、下划线、中划线、“.”，长度100个字符以内。
     * @return rawAlias
     */
    public String getRawAlias() {
        return rawAlias;
    }

    public void setRawAlias(String rawAlias) {
        this.rawAlias = rawAlias;
    }

    public ListImageBaseInfoRequestBody withImageAlias(String imageAlias) {
        this.imageAlias = imageAlias;
        return this;
    }

    /**
     * 卫星影像别名列表。 格式为中英文、数字、下划线、中划线、“.”。别名之间以“,”隔开。
     * @return imageAlias
     */
    public String getImageAlias() {
        return imageAlias;
    }

    public void setImageAlias(String imageAlias) {
        this.imageAlias = imageAlias;
    }

    public ListImageBaseInfoRequestBody withImageLevels(String imageLevels) {
        this.imageLevels = imageLevels;
        return this;
    }

    /**
     * 卫星影像等级列表。 当前仅支持L1、L1A、L1B、L2、L3、L4、L5、clip（矢量切割）、tile（金字塔切割）。等级之间以“,”隔开。
     * @return imageLevels
     */
    public String getImageLevels() {
        return imageLevels;
    }

    public void setImageLevels(String imageLevels) {
        this.imageLevels = imageLevels;
    }

    public ListImageBaseInfoRequestBody withIsProduct(String isProduct) {
        this.isProduct = isProduct;
        return this;
    }

    /**
     * 卫星影像是否为成果数据。 当前仅支持原始数据（0）、成果数据（1）。
     * @return isProduct
     */
    public String getIsProduct() {
        return isProduct;
    }

    public void setIsProduct(String isProduct) {
        this.isProduct = isProduct;
    }

    public ListImageBaseInfoRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示条数。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListImageBaseInfoRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从第几条记录开始查询。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                if (imageName != null) {
                    put("image_name", new FormDataPart<>(imageName));
                }
                if (imageDateFrom != null) {
                    put("image_date_from", new FormDataPart<>(imageDateFrom));
                }
                if (imageDateTo != null) {
                    put("image_date_to", new FormDataPart<>(imageDateTo));
                }
                if (imageStatus != null) {
                    put("image_status", new FormDataPart<>(imageStatus));
                }
                if (rawAlias != null) {
                    put("raw_alias", new FormDataPart<>(rawAlias));
                }
                if (imageAlias != null) {
                    put("image_alias", new FormDataPart<>(imageAlias));
                }
                if (imageLevels != null) {
                    put("image_levels", new FormDataPart<>(imageLevels));
                }
                if (isProduct != null) {
                    put("is_product", new FormDataPart<>(isProduct));
                }
                put("limit", new FormDataPart<>(limit));
                put("offset", new FormDataPart<>(offset));
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImageBaseInfoRequestBody that = (ListImageBaseInfoRequestBody) obj;
        return Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageDateFrom, that.imageDateFrom)
            && Objects.equals(this.imageDateTo, that.imageDateTo) && Objects.equals(this.imageStatus, that.imageStatus)
            && Objects.equals(this.rawAlias, that.rawAlias) && Objects.equals(this.imageAlias, that.imageAlias)
            && Objects.equals(this.imageLevels, that.imageLevels) && Objects.equals(this.isProduct, that.isProduct)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageName,
            imageDateFrom,
            imageDateTo,
            imageStatus,
            rawAlias,
            imageAlias,
            imageLevels,
            isProduct,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImageBaseInfoRequestBody {\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageDateFrom: ").append(toIndentedString(imageDateFrom)).append("\n");
        sb.append("    imageDateTo: ").append(toIndentedString(imageDateTo)).append("\n");
        sb.append("    imageStatus: ").append(toIndentedString(imageStatus)).append("\n");
        sb.append("    rawAlias: ").append(toIndentedString(rawAlias)).append("\n");
        sb.append("    imageAlias: ").append(toIndentedString(imageAlias)).append("\n");
        sb.append("    imageLevels: ").append(toIndentedString(imageLevels)).append("\n");
        sb.append("    isProduct: ").append(toIndentedString(isProduct)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
