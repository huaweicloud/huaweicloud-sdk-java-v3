package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CheckDeployKeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exists")

    private Boolean exists;

    public CheckDeployKeyResponse withExists(Boolean exists) {
        this.exists = exists;
        return this;
    }

    /**
     * **参数解释：** 部署秘钥在上层代码组或项目是否配置。 **取值范围：** - true，上层代码组或项目已配置该密钥。 - false，上层代码组或项目未配置该密钥。
     * @return exists
     */
    public Boolean getExists() {
        return exists;
    }

    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckDeployKeyResponse that = (CheckDeployKeyResponse) obj;
        return Objects.equals(this.exists, that.exists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exists);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckDeployKeyResponse {\n");
        sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
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
