package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApplyConfigurationRequestBody
 */
public class ApplyConfigurationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_update_param_group_version")

    private Boolean isUpdateParamGroupVersion;

    public ApplyConfigurationRequestBody withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public ApplyConfigurationRequestBody addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public ApplyConfigurationRequestBody withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * 实例ID列表。列表长度限制在10以内。
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public ApplyConfigurationRequestBody withIsUpdateParamGroupVersion(Boolean isUpdateParamGroupVersion) {
        this.isUpdateParamGroupVersion = isUpdateParamGroupVersion;
        return this;
    }

    /**
     * **参数解释**：  是否更新实例参数组版本，更新后实例规格变更时默认的规格参数值会以最新版本的为准。  **约束限制**：  不涉及。  **取值范围**：  - true：是。 - false：否。  **默认取值**：    false。
     * @return isUpdateParamGroupVersion
     */
    public Boolean getIsUpdateParamGroupVersion() {
        return isUpdateParamGroupVersion;
    }

    public void setIsUpdateParamGroupVersion(Boolean isUpdateParamGroupVersion) {
        this.isUpdateParamGroupVersion = isUpdateParamGroupVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyConfigurationRequestBody that = (ApplyConfigurationRequestBody) obj;
        return Objects.equals(this.instanceIds, that.instanceIds)
            && Objects.equals(this.isUpdateParamGroupVersion, that.isUpdateParamGroupVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIds, isUpdateParamGroupVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyConfigurationRequestBody {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    isUpdateParamGroupVersion: ").append(toIndentedString(isUpdateParamGroupVersion)).append("\n");
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
