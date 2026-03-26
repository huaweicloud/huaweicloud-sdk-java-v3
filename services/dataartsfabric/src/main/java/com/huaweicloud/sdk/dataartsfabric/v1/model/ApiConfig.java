package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * - **参数解释**：Ray Service独立Api配置信息。 - **约束限制**：不涉及。 - **取值范围**：不涉及。 - **默认取值**：不涉及。
 */
public class ApiConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_independent_api")

    private Boolean enableIndependentApi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_timeout")

    private Integer backendTimeout;

    public ApiConfig withEnableIndependentApi(Boolean enableIndependentApi) {
        this.enableIndependentApi = enableIndependentApi;
        return this;
    }

    /**
     * - **参数解释**：是否开启Ray Service独立Api功能。 - **约束限制**：不涉及。 - **取值范围**：开启true，关闭false。 - **默认取值**：false。 
     * @return enableIndependentApi
     */
    public Boolean getEnableIndependentApi() {
        return enableIndependentApi;
    }

    public void setEnableIndependentApi(Boolean enableIndependentApi) {
        this.enableIndependentApi = enableIndependentApi;
    }

    public ApiConfig withBackendTimeout(Integer backendTimeout) {
        this.backendTimeout = backendTimeout;
        return this;
    }

    /**
     * - **参数解释**：Ray Service独立Api设置的接口超时时间。 - **约束限制**：不涉及。 - **取值范围**：[0,600000]。 - **默认取值**：60000。
     * minimum: 0
     * maximum: 600000
     * @return backendTimeout
     */
    public Integer getBackendTimeout() {
        return backendTimeout;
    }

    public void setBackendTimeout(Integer backendTimeout) {
        this.backendTimeout = backendTimeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiConfig that = (ApiConfig) obj;
        return Objects.equals(this.enableIndependentApi, that.enableIndependentApi)
            && Objects.equals(this.backendTimeout, that.backendTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableIndependentApi, backendTimeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiConfig {\n");
        sb.append("    enableIndependentApi: ").append(toIndentedString(enableIndependentApi)).append("\n");
        sb.append("    backendTimeout: ").append(toIndentedString(backendTimeout)).append("\n");
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
