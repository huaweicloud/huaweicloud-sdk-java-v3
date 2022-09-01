package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListElasticResourcePoolQueuesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_resource_pool_name")

    @JacksonXmlProperty(localName = "elastic_resource_pool_name")

    private String elasticResourcePoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    @JacksonXmlProperty(localName = "queue_name")

    private String queueName;

    public ListElasticResourcePoolQueuesRequest withElasticResourcePoolName(String elasticResourcePoolName) {
        this.elasticResourcePoolName = elasticResourcePoolName;
        return this;
    }

    /**
     * 弹性资源池名称
     * @return elasticResourcePoolName
     */
    public String getElasticResourcePoolName() {
        return elasticResourcePoolName;
    }

    public void setElasticResourcePoolName(String elasticResourcePoolName) {
        this.elasticResourcePoolName = elasticResourcePoolName;
    }

    public ListElasticResourcePoolQueuesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 默认为100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListElasticResourcePoolQueuesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 默认为0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListElasticResourcePoolQueuesRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 可以根据queueName进行过滤
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListElasticResourcePoolQueuesRequest listElasticResourcePoolQueuesRequest =
            (ListElasticResourcePoolQueuesRequest) o;
        return Objects.equals(this.elasticResourcePoolName,
            listElasticResourcePoolQueuesRequest.elasticResourcePoolName)
            && Objects.equals(this.limit, listElasticResourcePoolQueuesRequest.limit)
            && Objects.equals(this.offset, listElasticResourcePoolQueuesRequest.offset)
            && Objects.equals(this.queueName, listElasticResourcePoolQueuesRequest.queueName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elasticResourcePoolName, limit, offset, queueName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListElasticResourcePoolQueuesRequest {\n");
        sb.append("    elasticResourcePoolName: ").append(toIndentedString(elasticResourcePoolName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
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
