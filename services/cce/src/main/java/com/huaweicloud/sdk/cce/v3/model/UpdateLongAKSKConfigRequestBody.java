package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateLongAKSKConfigRequestBody
 */
public class UpdateLongAKSKConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableLongAKSKInNewCluster")

    private Boolean enableLongAKSKInNewCluster;

    public UpdateLongAKSKConfigRequestBody withEnableLongAKSKInNewCluster(Boolean enableLongAKSKInNewCluster) {
        this.enableLongAKSKInNewCluster = enableLongAKSKInNewCluster;
        return this;
    }

    /**
     * **参数解释：** 新建集群是否启用LongAKSK。 **约束限制：** 不涉及 **取值范围：** - false: 新建集群不启用LongAKSK - true: 新建集群启用LongAKSK  **默认取值：** 不涉及 
     * @return enableLongAKSKInNewCluster
     */
    public Boolean getEnableLongAKSKInNewCluster() {
        return enableLongAKSKInNewCluster;
    }

    public void setEnableLongAKSKInNewCluster(Boolean enableLongAKSKInNewCluster) {
        this.enableLongAKSKInNewCluster = enableLongAKSKInNewCluster;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLongAKSKConfigRequestBody that = (UpdateLongAKSKConfigRequestBody) obj;
        return Objects.equals(this.enableLongAKSKInNewCluster, that.enableLongAKSKInNewCluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableLongAKSKInNewCluster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLongAKSKConfigRequestBody {\n");
        sb.append("    enableLongAKSKInNewCluster: ").append(toIndentedString(enableLongAKSKInNewCluster)).append("\n");
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
