package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreatePeriodElasticResourcePoolSpecChangeOrderRequestBody
 */
public class CreatePeriodElasticResourcePoolSpecChangeOrderRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_resource_pool_name")

    private String elasticResourcePoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_cu")

    private Integer targetCu;

    public CreatePeriodElasticResourcePoolSpecChangeOrderRequestBody withElasticResourcePoolName(
        String elasticResourcePoolName) {
        this.elasticResourcePoolName = elasticResourcePoolName;
        return this;
    }

    /**
     * 弹性资源池名称，名称只能包含数字、小写英文字母和下划线，但不能是纯数字，且不能以下划线开头。长度限制：1~128个字符。
     * @return elasticResourcePoolName
     */
    public String getElasticResourcePoolName() {
        return elasticResourcePoolName;
    }

    public void setElasticResourcePoolName(String elasticResourcePoolName) {
        this.elasticResourcePoolName = elasticResourcePoolName;
    }

    public CreatePeriodElasticResourcePoolSpecChangeOrderRequestBody withTargetCu(Integer targetCu) {
        this.targetCu = targetCu;
        return this;
    }

    /**
     * 包周期目标CU大小
     * @return targetCu
     */
    public Integer getTargetCu() {
        return targetCu;
    }

    public void setTargetCu(Integer targetCu) {
        this.targetCu = targetCu;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePeriodElasticResourcePoolSpecChangeOrderRequestBody that =
            (CreatePeriodElasticResourcePoolSpecChangeOrderRequestBody) obj;
        return Objects.equals(this.elasticResourcePoolName, that.elasticResourcePoolName)
            && Objects.equals(this.targetCu, that.targetCu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elasticResourcePoolName, targetCu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePeriodElasticResourcePoolSpecChangeOrderRequestBody {\n");
        sb.append("    elasticResourcePoolName: ").append(toIndentedString(elasticResourcePoolName)).append("\n");
        sb.append("    targetCu: ").append(toIndentedString(targetCu)).append("\n");
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
