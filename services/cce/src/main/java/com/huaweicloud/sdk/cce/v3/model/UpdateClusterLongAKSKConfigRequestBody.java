package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateClusterLongAKSKConfigRequestBody
 */
public class UpdateClusterLongAKSKConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableLongAKSK")

    private Boolean enableLongAKSK;

    public UpdateClusterLongAKSKConfigRequestBody withEnableLongAKSK(Boolean enableLongAKSK) {
        this.enableLongAKSK = enableLongAKSK;
        return this;
    }

    /**
     * **参数解释：** 是否启用LongAKSK，启用后在集群kube-system命名空间下会创建名称为paas.longaksk的密钥，关闭则会删除该密钥。 **约束限制：** 不涉及 **取值范围：** - false: 禁用LongAKSK - true: 启用LongAKSK  **默认取值：** 不涉及
     * @return enableLongAKSK
     */
    public Boolean getEnableLongAKSK() {
        return enableLongAKSK;
    }

    public void setEnableLongAKSK(Boolean enableLongAKSK) {
        this.enableLongAKSK = enableLongAKSK;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateClusterLongAKSKConfigRequestBody that = (UpdateClusterLongAKSKConfigRequestBody) obj;
        return Objects.equals(this.enableLongAKSK, that.enableLongAKSK);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableLongAKSK);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClusterLongAKSKConfigRequestBody {\n");
        sb.append("    enableLongAKSK: ").append(toIndentedString(enableLongAKSK)).append("\n");
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
