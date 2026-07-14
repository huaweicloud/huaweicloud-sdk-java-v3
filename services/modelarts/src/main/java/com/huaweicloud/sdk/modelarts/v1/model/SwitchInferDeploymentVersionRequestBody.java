package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SwitchInferDeploymentVersionRequestBody
 */
public class SwitchInferDeploymentVersionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_deployment_version")

    private String targetDeploymentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infer_name")

    private String inferName;

    public SwitchInferDeploymentVersionRequestBody withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * **参数解释：** 服务ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public SwitchInferDeploymentVersionRequestBody withTargetDeploymentVersion(String targetDeploymentVersion) {
        this.targetDeploymentVersion = targetDeploymentVersion;
        return this;
    }

    /**
     * **参数解释：** 待切换的目标版本。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return targetDeploymentVersion
     */
    public String getTargetDeploymentVersion() {
        return targetDeploymentVersion;
    }

    public void setTargetDeploymentVersion(String targetDeploymentVersion) {
        this.targetDeploymentVersion = targetDeploymentVersion;
    }

    public SwitchInferDeploymentVersionRequestBody withInferName(String inferName) {
        this.inferName = inferName;
        return this;
    }

    /**
     * **参数解释：** 部署ID。
     * @return inferName
     */
    public String getInferName() {
        return inferName;
    }

    public void setInferName(String inferName) {
        this.inferName = inferName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchInferDeploymentVersionRequestBody that = (SwitchInferDeploymentVersionRequestBody) obj;
        return Objects.equals(this.serviceId, that.serviceId)
            && Objects.equals(this.targetDeploymentVersion, that.targetDeploymentVersion)
            && Objects.equals(this.inferName, that.inferName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, targetDeploymentVersion, inferName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchInferDeploymentVersionRequestBody {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    targetDeploymentVersion: ").append(toIndentedString(targetDeploymentVersion)).append("\n");
        sb.append("    inferName: ").append(toIndentedString(inferName)).append("\n");
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
