package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HyperClusterNetworkInfo
 */
public class HyperClusterNetworkInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyper_cluster_subnet_id")

    private String hyperClusterSubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    public HyperClusterNetworkInfo withHyperClusterSubnetId(String hyperClusterSubnetId) {
        this.hyperClusterSubnetId = hyperClusterSubnetId;
        return this;
    }

    /**
     * **参数解释**：hyper cluster的子网名称。 **取值范围**：^[-_.a-zA-Z0-9]{1,64}$。
     * @return hyperClusterSubnetId
     */
    public String getHyperClusterSubnetId() {
        return hyperClusterSubnetId;
    }

    public void setHyperClusterSubnetId(String hyperClusterSubnetId) {
        this.hyperClusterSubnetId = hyperClusterSubnetId;
    }

    public HyperClusterNetworkInfo withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * **参数解释**：是否默认。 **约束限制**：不涉及。 **取值范围**： - true：默认网络 - false：非默认网络
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HyperClusterNetworkInfo that = (HyperClusterNetworkInfo) obj;
        return Objects.equals(this.hyperClusterSubnetId, that.hyperClusterSubnetId)
            && Objects.equals(this.isDefault, that.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hyperClusterSubnetId, isDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HyperClusterNetworkInfo {\n");
        sb.append("    hyperClusterSubnetId: ").append(toIndentedString(hyperClusterSubnetId)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
