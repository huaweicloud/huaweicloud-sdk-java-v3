package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPublicationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_name")

    private String publicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_db_name")

    private String publicationDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriber_instance_id")

    private String subscriberInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListPublicationsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言。默认en-us。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListPublicationsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListPublicationsRequest withPublicationName(String publicationName) {
        this.publicationName = publicationName;
        return this;
    }

    /**
     * 发布名（模糊匹配）
     * @return publicationName
     */
    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public ListPublicationsRequest withPublicationDbName(String publicationDbName) {
        this.publicationDbName = publicationDbName;
        return this;
    }

    /**
     * 发布数据库名（模糊匹配）
     * @return publicationDbName
     */
    public String getPublicationDbName() {
        return publicationDbName;
    }

    public void setPublicationDbName(String publicationDbName) {
        this.publicationDbName = publicationDbName;
    }

    public ListPublicationsRequest withSubscriberInstanceId(String subscriberInstanceId) {
        this.subscriberInstanceId = subscriberInstanceId;
        return this;
    }

    /**
     * 订阅实例id
     * @return subscriberInstanceId
     */
    public String getSubscriberInstanceId() {
        return subscriberInstanceId;
    }

    public void setSubscriberInstanceId(String subscriberInstanceId) {
        this.subscriberInstanceId = subscriberInstanceId;
    }

    public ListPublicationsRequest withOffset(Integer offset) {
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

    public ListPublicationsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数。默认为10，不能为负数，最小值为1，最大值为100。
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
        ListPublicationsRequest that = (ListPublicationsRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.publicationName, that.publicationName)
            && Objects.equals(this.publicationDbName, that.publicationDbName)
            && Objects.equals(this.subscriberInstanceId, that.subscriberInstanceId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(xLanguage, instanceId, publicationName, publicationDbName, subscriberInstanceId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicationsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    publicationName: ").append(toIndentedString(publicationName)).append("\n");
        sb.append("    publicationDbName: ").append(toIndentedString(publicationDbName)).append("\n");
        sb.append("    subscriberInstanceId: ").append(toIndentedString(subscriberInstanceId)).append("\n");
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
