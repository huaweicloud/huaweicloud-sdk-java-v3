package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 部署版本概要信息
 */
public class InferDeploymentVersionItemResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infer_name")

    private String inferName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_status")

    private String versionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private OffsetDateTime createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private OffsetDateTime updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private String deployType;

    public InferDeploymentVersionItemResp withInferName(String inferName) {
        this.inferName = inferName;
        return this;
    }

    /**
     * **参数解释：** 部署id。 **取值范围：** 不涉及。
     * @return inferName
     */
    public String getInferName() {
        return inferName;
    }

    public void setInferName(String inferName) {
        this.inferName = inferName;
    }

    public InferDeploymentVersionItemResp withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 部署版本 **取值范围：** 不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public InferDeploymentVersionItemResp withVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }

    /**
     * **参数解释：** 版本状态 **取值范围：** 不涉及。
     * @return versionStatus
     */
    public String getVersionStatus() {
        return versionStatus;
    }

    public void setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
    }

    public InferDeploymentVersionItemResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 版本描述 **取值范围：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InferDeploymentVersionItemResp withCreateAt(OffsetDateTime createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间 **取值范围：** 不涉及。
     * @return createAt
     */
    public OffsetDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(OffsetDateTime createAt) {
        this.createAt = createAt;
    }

    public InferDeploymentVersionItemResp withUpdateAt(OffsetDateTime updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间 **取值范围：** 不涉及。
     * @return updateAt
     */
    public OffsetDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(OffsetDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public InferDeploymentVersionItemResp withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * **参数解释：** 部署类型。 **取值范围：** - SINGLE：单机单卡。 - MULTI：多机多卡。
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InferDeploymentVersionItemResp that = (InferDeploymentVersionItemResp) obj;
        return Objects.equals(this.inferName, that.inferName) && Objects.equals(this.version, that.version)
            && Objects.equals(this.versionStatus, that.versionStatus)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.deployType, that.deployType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inferName, version, versionStatus, description, createAt, updateAt, deployType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InferDeploymentVersionItemResp {\n");
        sb.append("    inferName: ").append(toIndentedString(inferName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionStatus: ").append(toIndentedString(versionStatus)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
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
