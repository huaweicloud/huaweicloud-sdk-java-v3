package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：RayService类型端点的配置。 **约束限制**：不涉及。 
 */
public class RayServiceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ray_serve_config")

    private RayServeConfig rayServeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ray_cluster_config")

    private RayClusterConfig rayClusterConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_config")

    private RayServiceLogConfig logConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oidc_config")

    private OidcConfig oidcConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_config")

    private ApiConfig apiConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_config")

    private AgencyConfig agencyConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_infos")

    private List<DataBriefInfo> dataInfos = null;

    public RayServiceConfig withRayServeConfig(RayServeConfig rayServeConfig) {
        this.rayServeConfig = rayServeConfig;
        return this;
    }

    public RayServiceConfig withRayServeConfig(Consumer<RayServeConfig> rayServeConfigSetter) {
        if (this.rayServeConfig == null) {
            this.rayServeConfig = new RayServeConfig();
            rayServeConfigSetter.accept(this.rayServeConfig);
        }

        return this;
    }

    /**
     * Get rayServeConfig
     * @return rayServeConfig
     */
    public RayServeConfig getRayServeConfig() {
        return rayServeConfig;
    }

    public void setRayServeConfig(RayServeConfig rayServeConfig) {
        this.rayServeConfig = rayServeConfig;
    }

    public RayServiceConfig withRayClusterConfig(RayClusterConfig rayClusterConfig) {
        this.rayClusterConfig = rayClusterConfig;
        return this;
    }

    public RayServiceConfig withRayClusterConfig(Consumer<RayClusterConfig> rayClusterConfigSetter) {
        if (this.rayClusterConfig == null) {
            this.rayClusterConfig = new RayClusterConfig();
            rayClusterConfigSetter.accept(this.rayClusterConfig);
        }

        return this;
    }

    /**
     * Get rayClusterConfig
     * @return rayClusterConfig
     */
    public RayClusterConfig getRayClusterConfig() {
        return rayClusterConfig;
    }

    public void setRayClusterConfig(RayClusterConfig rayClusterConfig) {
        this.rayClusterConfig = rayClusterConfig;
    }

    public RayServiceConfig withLogConfig(RayServiceLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }

    public RayServiceConfig withLogConfig(Consumer<RayServiceLogConfig> logConfigSetter) {
        if (this.logConfig == null) {
            this.logConfig = new RayServiceLogConfig();
            logConfigSetter.accept(this.logConfig);
        }

        return this;
    }

    /**
     * Get logConfig
     * @return logConfig
     */
    public RayServiceLogConfig getLogConfig() {
        return logConfig;
    }

    public void setLogConfig(RayServiceLogConfig logConfig) {
        this.logConfig = logConfig;
    }

    public RayServiceConfig withOidcConfig(OidcConfig oidcConfig) {
        this.oidcConfig = oidcConfig;
        return this;
    }

    public RayServiceConfig withOidcConfig(Consumer<OidcConfig> oidcConfigSetter) {
        if (this.oidcConfig == null) {
            this.oidcConfig = new OidcConfig();
            oidcConfigSetter.accept(this.oidcConfig);
        }

        return this;
    }

    /**
     * Get oidcConfig
     * @return oidcConfig
     */
    public OidcConfig getOidcConfig() {
        return oidcConfig;
    }

    public void setOidcConfig(OidcConfig oidcConfig) {
        this.oidcConfig = oidcConfig;
    }

    public RayServiceConfig withApiConfig(ApiConfig apiConfig) {
        this.apiConfig = apiConfig;
        return this;
    }

    public RayServiceConfig withApiConfig(Consumer<ApiConfig> apiConfigSetter) {
        if (this.apiConfig == null) {
            this.apiConfig = new ApiConfig();
            apiConfigSetter.accept(this.apiConfig);
        }

        return this;
    }

    /**
     * Get apiConfig
     * @return apiConfig
     */
    public ApiConfig getApiConfig() {
        return apiConfig;
    }

    public void setApiConfig(ApiConfig apiConfig) {
        this.apiConfig = apiConfig;
    }

    public RayServiceConfig withAgencyConfig(AgencyConfig agencyConfig) {
        this.agencyConfig = agencyConfig;
        return this;
    }

    public RayServiceConfig withAgencyConfig(Consumer<AgencyConfig> agencyConfigSetter) {
        if (this.agencyConfig == null) {
            this.agencyConfig = new AgencyConfig();
            agencyConfigSetter.accept(this.agencyConfig);
        }

        return this;
    }

    /**
     * Get agencyConfig
     * @return agencyConfig
     */
    public AgencyConfig getAgencyConfig() {
        return agencyConfig;
    }

    public void setAgencyConfig(AgencyConfig agencyConfig) {
        this.agencyConfig = agencyConfig;
    }

    public RayServiceConfig withDataInfos(List<DataBriefInfo> dataInfos) {
        this.dataInfos = dataInfos;
        return this;
    }

    public RayServiceConfig addDataInfosItem(DataBriefInfo dataInfosItem) {
        if (this.dataInfos == null) {
            this.dataInfos = new ArrayList<>();
        }
        this.dataInfos.add(dataInfosItem);
        return this;
    }

    public RayServiceConfig withDataInfos(Consumer<List<DataBriefInfo>> dataInfosSetter) {
        if (this.dataInfos == null) {
            this.dataInfos = new ArrayList<>();
        }
        dataInfosSetter.accept(this.dataInfos);
        return this;
    }

    /**
     * **参数解释**：数据信息。 **约束限制**：不涉及。 **取值范围**：[0,1]。 **默认取值**：不涉及。 
     * @return dataInfos
     */
    public List<DataBriefInfo> getDataInfos() {
        return dataInfos;
    }

    public void setDataInfos(List<DataBriefInfo> dataInfos) {
        this.dataInfos = dataInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RayServiceConfig that = (RayServiceConfig) obj;
        return Objects.equals(this.rayServeConfig, that.rayServeConfig)
            && Objects.equals(this.rayClusterConfig, that.rayClusterConfig)
            && Objects.equals(this.logConfig, that.logConfig) && Objects.equals(this.oidcConfig, that.oidcConfig)
            && Objects.equals(this.apiConfig, that.apiConfig) && Objects.equals(this.agencyConfig, that.agencyConfig)
            && Objects.equals(this.dataInfos, that.dataInfos);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(rayServeConfig, rayClusterConfig, logConfig, oidcConfig, apiConfig, agencyConfig, dataInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayServiceConfig {\n");
        sb.append("    rayServeConfig: ").append(toIndentedString(rayServeConfig)).append("\n");
        sb.append("    rayClusterConfig: ").append(toIndentedString(rayClusterConfig)).append("\n");
        sb.append("    logConfig: ").append(toIndentedString(logConfig)).append("\n");
        sb.append("    oidcConfig: ").append(toIndentedString(oidcConfig)).append("\n");
        sb.append("    apiConfig: ").append(toIndentedString(apiConfig)).append("\n");
        sb.append("    agencyConfig: ").append(toIndentedString(agencyConfig)).append("\n");
        sb.append("    dataInfos: ").append(toIndentedString(dataInfos)).append("\n");
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
