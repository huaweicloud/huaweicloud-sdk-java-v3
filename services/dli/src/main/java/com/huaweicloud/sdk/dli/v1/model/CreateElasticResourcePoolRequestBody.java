package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建弹性资源池消息
 */
public class CreateElasticResourcePoolRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_resource_pool_name")

    private String elasticResourcePoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr_in_vpc")

    private String cidrInVpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cu")

    private Integer maxCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_cu")

    private Integer minCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsTag> tags = null;

    public CreateElasticResourcePoolRequestBody withElasticResourcePoolName(String elasticResourcePoolName) {
        this.elasticResourcePoolName = elasticResourcePoolName;
        return this;
    }

    /**
     * 新建的弹性资源池名称，名称只能包含数字、小写英文字母和下划线，但不能是纯数字，且不能以下划线开头。长度限制：1~128个字符。
     * @return elasticResourcePoolName
     */
    public String getElasticResourcePoolName() {
        return elasticResourcePoolName;
    }

    public void setElasticResourcePoolName(String elasticResourcePoolName) {
        this.elasticResourcePoolName = elasticResourcePoolName;
    }

    public CreateElasticResourcePoolRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息。长度限制：256个字符以内。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateElasticResourcePoolRequestBody withCidrInVpc(String cidrInVpc) {
        this.cidrInVpc = cidrInVpc;
        return this;
    }

    /**
     * 虚拟集群关联的vpc cidr.如果不填，默认值为172.16.0.0//12
     * @return cidrInVpc
     */
    public String getCidrInVpc() {
        return cidrInVpc;
    }

    public void setCidrInVpc(String cidrInVpc) {
        this.cidrInVpc = cidrInVpc;
    }

    public CreateElasticResourcePoolRequestBody withMaxCu(Integer maxCu) {
        this.maxCu = maxCu;
        return this;
    }

    /**
     * 最大CU大于等于该资源池下任意一个队列的最大CU之和且大于min_cu。最小值为64
     * minimum: 64
     * maximum: 32000
     * @return maxCu
     */
    public Integer getMaxCu() {
        return maxCu;
    }

    public void setMaxCu(Integer maxCu) {
        this.maxCu = maxCu;
    }

    public CreateElasticResourcePoolRequestBody withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费类型 1、按需计费
     * minimum: 1
     * maximum: 1
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public CreateElasticResourcePoolRequestBody withMinCu(Integer minCu) {
        this.minCu = minCu;
        return this;
    }

    /**
     * 最小CU大于等于该资源池下所有队列最小CU之和,最小值为64
     * minimum: 64
     * maximum: 32000
     * @return minCu
     */
    public Integer getMinCu() {
        return minCu;
    }

    public void setMinCu(Integer minCu) {
        this.minCu = minCu;
    }

    public CreateElasticResourcePoolRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业ID，不填默认为“0”
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateElasticResourcePoolRequestBody withTags(List<TmsTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateElasticResourcePoolRequestBody addTagsItem(TmsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateElasticResourcePoolRequestBody withTags(Consumer<List<TmsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<TmsTag> getTags() {
        return tags;
    }

    public void setTags(List<TmsTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateElasticResourcePoolRequestBody createElasticResourcePoolRequestBody =
            (CreateElasticResourcePoolRequestBody) o;
        return Objects.equals(this.elasticResourcePoolName,
            createElasticResourcePoolRequestBody.elasticResourcePoolName)
            && Objects.equals(this.description, createElasticResourcePoolRequestBody.description)
            && Objects.equals(this.cidrInVpc, createElasticResourcePoolRequestBody.cidrInVpc)
            && Objects.equals(this.maxCu, createElasticResourcePoolRequestBody.maxCu)
            && Objects.equals(this.chargingMode, createElasticResourcePoolRequestBody.chargingMode)
            && Objects.equals(this.minCu, createElasticResourcePoolRequestBody.minCu)
            && Objects.equals(this.enterpriseProjectId, createElasticResourcePoolRequestBody.enterpriseProjectId)
            && Objects.equals(this.tags, createElasticResourcePoolRequestBody.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elasticResourcePoolName,
            description,
            cidrInVpc,
            maxCu,
            chargingMode,
            minCu,
            enterpriseProjectId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateElasticResourcePoolRequestBody {\n");
        sb.append("    elasticResourcePoolName: ").append(toIndentedString(elasticResourcePoolName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cidrInVpc: ").append(toIndentedString(cidrInVpc)).append("\n");
        sb.append("    maxCu: ").append(toIndentedString(maxCu)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    minCu: ").append(toIndentedString(minCu)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
