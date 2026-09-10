package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 桶对象查询请求参数。
 */
public class CreateOpsModelDeploymentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ma_pool_type")

    private String maPoolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ma_pool_id")

    private String maPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ma_instance_flavor")

    private String maInstanceFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ma_instance_count")

    private Integer maInstanceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_name")

    private String modelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_service_name")

    private String modelServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name")

    private String secretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    public CreateOpsModelDeploymentRequestBody withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数解释：** 模型优化任务产物ID，获取方法请参见查询模型优化任务产物列表。  **约束限制：** 不涉及  **取值范围：** 真实存在的产物ID字符串。  **默认取值：** 无
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CreateOpsModelDeploymentRequestBody withMaPoolType(String maPoolType) {
        this.maPoolType = maPoolType;
        return this;
    }

    /**
     * **参数解释：** ModelArts资源池类型。  **约束限制：** 不涉及  **取值范围：** public（公共资源池）或 dedicated（专属资源池）等支持的类型字符串。  **默认取值：** 无
     * @return maPoolType
     */
    public String getMaPoolType() {
        return maPoolType;
    }

    public void setMaPoolType(String maPoolType) {
        this.maPoolType = maPoolType;
    }

    public CreateOpsModelDeploymentRequestBody withMaPoolId(String maPoolId) {
        this.maPoolId = maPoolId;
        return this;
    }

    /**
     * **参数解释：** ModelArts资源池ID。在AgentArts平台智能体优化功能中，在部署并接入模型页面，按F12通过开发者工具可查看资源池的规格信息。  **约束限制：** ma_pool_type为专属资源池时必填。  **取值范围：** 真实存在的资源池ID字符串。  **默认取值：** 无
     * @return maPoolId
     */
    public String getMaPoolId() {
        return maPoolId;
    }

    public void setMaPoolId(String maPoolId) {
        this.maPoolId = maPoolId;
    }

    public CreateOpsModelDeploymentRequestBody withMaInstanceFlavor(String maInstanceFlavor) {
        this.maInstanceFlavor = maInstanceFlavor;
        return this;
    }

    /**
     * **参数解释：** AgentArts平台智能体优化功能中，在部署并接入模型页面，按F12通过开发者工具可查看资源池的规格信息。  **约束限制：** 不涉及  **取值范围：** ModelArts支持的计算实例规格字符串。  **默认取值：** 无
     * @return maInstanceFlavor
     */
    public String getMaInstanceFlavor() {
        return maInstanceFlavor;
    }

    public void setMaInstanceFlavor(String maInstanceFlavor) {
        this.maInstanceFlavor = maInstanceFlavor;
    }

    public CreateOpsModelDeploymentRequestBody withMaInstanceCount(Integer maInstanceCount) {
        this.maInstanceCount = maInstanceCount;
        return this;
    }

    /**
     * **参数解释：** ModelArts实例数，单位：个。  **约束限制：** 不涉及  **取值范围：** 大于等于1的正整数。  **默认取值：** 无
     * minimum: 1
     * maximum: 20
     * @return maInstanceCount
     */
    public Integer getMaInstanceCount() {
        return maInstanceCount;
    }

    public void setMaInstanceCount(Integer maInstanceCount) {
        this.maInstanceCount = maInstanceCount;
    }

    public CreateOpsModelDeploymentRequestBody withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * **参数解释：** 模型名称。  **约束限制：** 不涉及  **取值范围：** 部署模型的名称字符串，默认与模型优化任务训练完成后，产出的模型快照名称一致。  **默认取值：** 无
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public CreateOpsModelDeploymentRequestBody withModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
        return this;
    }

    /**
     * **参数解释：** 模型服务名称。  **约束限制：** 不涉及  **取值范围：** 可自定义，长度1-64个字符的字符串。  **默认取值：** 无
     * @return modelServiceName
     */
    public String getModelServiceName() {
        return modelServiceName;
    }

    public void setModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
    }

    public CreateOpsModelDeploymentRequestBody withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * **参数解释：** 认证凭据名称，在AgentArts平台智能体优化功能中，部署并接入模型时所填写的认证凭据名称。  **约束限制：** 不涉及  **取值范围：** 真实存在的凭据名称字符串。  **默认取值：** 无
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public CreateOpsModelDeploymentRequestBody withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释：** 委托名称，赋予服务访问用户资源的权限，在AgentArts平台智能体优化功能中，部署并接入模型时所填写的委托名称。  **约束限制：** 不涉及  **取值范围：** 具有ModelArts部署权限的IAM委托名称。  **默认取值：** 无
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOpsModelDeploymentRequestBody that = (CreateOpsModelDeploymentRequestBody) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.maPoolType, that.maPoolType)
            && Objects.equals(this.maPoolId, that.maPoolId)
            && Objects.equals(this.maInstanceFlavor, that.maInstanceFlavor)
            && Objects.equals(this.maInstanceCount, that.maInstanceCount)
            && Objects.equals(this.modelName, that.modelName)
            && Objects.equals(this.modelServiceName, that.modelServiceName)
            && Objects.equals(this.secretName, that.secretName) && Objects.equals(this.agencyName, that.agencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId,
            maPoolType,
            maPoolId,
            maInstanceFlavor,
            maInstanceCount,
            modelName,
            modelServiceName,
            secretName,
            agencyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOpsModelDeploymentRequestBody {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    maPoolType: ").append(toIndentedString(maPoolType)).append("\n");
        sb.append("    maPoolId: ").append(toIndentedString(maPoolId)).append("\n");
        sb.append("    maInstanceFlavor: ").append(toIndentedString(maInstanceFlavor)).append("\n");
        sb.append("    maInstanceCount: ").append(toIndentedString(maInstanceCount)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    modelServiceName: ").append(toIndentedString(modelServiceName)).append("\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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
