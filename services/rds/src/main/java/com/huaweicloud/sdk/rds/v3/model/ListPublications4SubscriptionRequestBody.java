package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 可选的rds实例列表及其发布。
 */
public class ListPublications4SubscriptionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_instance_id")

    private String publicationInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_instance_name")

    private String publicationInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_name")

    private String publicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListPublications4SubscriptionRequestBody withPublicationInstanceId(String publicationInstanceId) {
        this.publicationInstanceId = publicationInstanceId;
        return this;
    }

    /**
     * 发布实例id。若不为空，优先查该实例下的发布。
     * @return publicationInstanceId
     */
    public String getPublicationInstanceId() {
        return publicationInstanceId;
    }

    public void setPublicationInstanceId(String publicationInstanceId) {
        this.publicationInstanceId = publicationInstanceId;
    }

    public ListPublications4SubscriptionRequestBody withPublicationInstanceName(String publicationInstanceName) {
        this.publicationInstanceName = publicationInstanceName;
        return this;
    }

    /**
     * 发布实例名称（模糊匹配）。
     * @return publicationInstanceName
     */
    public String getPublicationInstanceName() {
        return publicationInstanceName;
    }

    public void setPublicationInstanceName(String publicationInstanceName) {
        this.publicationInstanceName = publicationInstanceName;
    }

    public ListPublications4SubscriptionRequestBody withPublicationName(String publicationName) {
        this.publicationName = publicationName;
        return this;
    }

    /**
     * 发布名称（模糊匹配）。
     * @return publicationName
     */
    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public ListPublications4SubscriptionRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量。从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询），必须为数字，不能为负数。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPublications4SubscriptionRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数。默认为10，不能为负数，最小值为1，最大值为1000。
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
        ListPublications4SubscriptionRequestBody that = (ListPublications4SubscriptionRequestBody) obj;
        return Objects.equals(this.publicationInstanceId, that.publicationInstanceId)
            && Objects.equals(this.publicationInstanceName, that.publicationInstanceName)
            && Objects.equals(this.publicationName, that.publicationName) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicationInstanceId, publicationInstanceName, publicationName, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublications4SubscriptionRequestBody {\n");
        sb.append("    publicationInstanceId: ").append(toIndentedString(publicationInstanceId)).append("\n");
        sb.append("    publicationInstanceName: ").append(toIndentedString(publicationInstanceName)).append("\n");
        sb.append("    publicationName: ").append(toIndentedString(publicationName)).append("\n");
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
