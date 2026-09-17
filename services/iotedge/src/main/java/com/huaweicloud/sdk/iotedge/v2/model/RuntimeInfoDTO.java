package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 边缘软件运行时信息
 */
public class RuntimeInfoDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_tpm")

    private Boolean enableTpm;

    public RuntimeInfoDTO withEnableTpm(Boolean enableTpm) {
        this.enableTpm = enableTpm;
        return this;
    }

    /**
     * 是否启用TPM
     * @return enableTpm
     */
    public Boolean getEnableTpm() {
        return enableTpm;
    }

    public void setEnableTpm(Boolean enableTpm) {
        this.enableTpm = enableTpm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuntimeInfoDTO that = (RuntimeInfoDTO) obj;
        return Objects.equals(this.enableTpm, that.enableTpm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableTpm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeInfoDTO {\n");
        sb.append("    enableTpm: ").append(toIndentedString(enableTpm)).append("\n");
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
