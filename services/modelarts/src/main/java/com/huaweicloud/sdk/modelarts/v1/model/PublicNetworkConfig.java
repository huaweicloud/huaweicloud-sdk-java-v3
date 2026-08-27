package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：NoteBook网关类型 **约束限制**：不涉及。
 */
public class PublicNetworkConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_network_type")

    private String publicNetworkType;

    public PublicNetworkConfig withPublicNetworkType(String publicNetworkType) {
        this.publicNetworkType = publicNetworkType;
        return this;
    }

    /**
     * **参数解释**：NoteBook网络类型 **约束限制**： - SHARED：公共网络 - EXCLUSIVE：专属网络 - FORBIDDEN：禁用网络
     * @return publicNetworkType
     */
    public String getPublicNetworkType() {
        return publicNetworkType;
    }

    public void setPublicNetworkType(String publicNetworkType) {
        this.publicNetworkType = publicNetworkType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicNetworkConfig that = (PublicNetworkConfig) obj;
        return Objects.equals(this.publicNetworkType, that.publicNetworkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicNetworkType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicNetworkConfig {\n");
        sb.append("    publicNetworkType: ").append(toIndentedString(publicNetworkType)).append("\n");
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
