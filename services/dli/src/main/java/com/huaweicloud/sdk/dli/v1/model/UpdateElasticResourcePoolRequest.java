package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateElasticResourcePoolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_resource_pool_name")

    private String elasticResourcePoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateElasticResourcePoolInfo body;

    public UpdateElasticResourcePoolRequest withElasticResourcePoolName(String elasticResourcePoolName) {
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

    public UpdateElasticResourcePoolRequest withBody(UpdateElasticResourcePoolInfo body) {
        this.body = body;
        return this;
    }

    public UpdateElasticResourcePoolRequest withBody(Consumer<UpdateElasticResourcePoolInfo> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateElasticResourcePoolInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateElasticResourcePoolInfo getBody() {
        return body;
    }

    public void setBody(UpdateElasticResourcePoolInfo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateElasticResourcePoolRequest updateElasticResourcePoolRequest = (UpdateElasticResourcePoolRequest) o;
        return Objects.equals(this.elasticResourcePoolName, updateElasticResourcePoolRequest.elasticResourcePoolName)
            && Objects.equals(this.body, updateElasticResourcePoolRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elasticResourcePoolName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateElasticResourcePoolRequest {\n");
        sb.append("    elasticResourcePoolName: ").append(toIndentedString(elasticResourcePoolName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
