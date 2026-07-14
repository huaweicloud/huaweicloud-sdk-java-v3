package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 服务密钥挂载。
 */
public class ServiceSecretResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_enable")

    private Boolean secretEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_type")

    private String secretType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_volumes")

    private List<SecretVolumeResponse> secretVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_enable")

    private Boolean groupEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Long groupId;

    public ServiceSecretResponse withSecretEnable(Boolean secretEnable) {
        this.secretEnable = secretEnable;
        return this;
    }

    /**
     * **参数解释：** 是否启用密钥。 **取值范围：** - true：启用密钥。 - false：不启用密钥。
     * @return secretEnable
     */
    public Boolean getSecretEnable() {
        return secretEnable;
    }

    public void setSecretEnable(Boolean secretEnable) {
        this.secretEnable = secretEnable;
    }

    public ServiceSecretResponse withSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }

    /**
     * **参数解释：** 密钥类型。 **取值范围：** - custom：自定义密钥。 - [dew：DEW密钥。](tag:hws,hws_hk,fcs)
     * @return secretType
     */
    public String getSecretType() {
        return secretType;
    }

    public void setSecretType(String secretType) {
        this.secretType = secretType;
    }

    public ServiceSecretResponse withSecretVolumes(List<SecretVolumeResponse> secretVolumes) {
        this.secretVolumes = secretVolumes;
        return this;
    }

    public ServiceSecretResponse addSecretVolumesItem(SecretVolumeResponse secretVolumesItem) {
        if (this.secretVolumes == null) {
            this.secretVolumes = new ArrayList<>();
        }
        this.secretVolumes.add(secretVolumesItem);
        return this;
    }

    public ServiceSecretResponse withSecretVolumes(Consumer<List<SecretVolumeResponse>> secretVolumesSetter) {
        if (this.secretVolumes == null) {
            this.secretVolumes = new ArrayList<>();
        }
        secretVolumesSetter.accept(this.secretVolumes);
        return this;
    }

    /**
     * **参数解释：** 密钥挂载。 **约束限制：** 上限30个。
     * @return secretVolumes
     */
    public List<SecretVolumeResponse> getSecretVolumes() {
        return secretVolumes;
    }

    public void setSecretVolumes(List<SecretVolumeResponse> secretVolumes) {
        this.secretVolumes = secretVolumes;
    }

    public ServiceSecretResponse withGroupEnable(Boolean groupEnable) {
        this.groupEnable = groupEnable;
        return this;
    }

    /**
     * **参数解释：** 是否启用镜像的用户组。 **取值范围：** - true：启用镜像的用户组。 - false：不启用镜像的用户组。
     * @return groupEnable
     */
    public Boolean getGroupEnable() {
        return groupEnable;
    }

    public void setGroupEnable(Boolean groupEnable) {
        this.groupEnable = groupEnable;
    }

    public ServiceSecretResponse withGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 镜像的用户组ID。 **取值范围：** 1000~4294967294。
     * @return groupId
     */
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceSecretResponse that = (ServiceSecretResponse) obj;
        return Objects.equals(this.secretEnable, that.secretEnable) && Objects.equals(this.secretType, that.secretType)
            && Objects.equals(this.secretVolumes, that.secretVolumes)
            && Objects.equals(this.groupEnable, that.groupEnable) && Objects.equals(this.groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretEnable, secretType, secretVolumes, groupEnable, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceSecretResponse {\n");
        sb.append("    secretEnable: ").append(toIndentedString(secretEnable)).append("\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
        sb.append("    secretVolumes: ").append(toIndentedString(secretVolumes)).append("\n");
        sb.append("    groupEnable: ").append(toIndentedString(groupEnable)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
