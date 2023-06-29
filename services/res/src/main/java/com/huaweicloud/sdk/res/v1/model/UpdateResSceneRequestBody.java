package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateResSceneRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_id")

    private String datasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ds_config")

    private DsConfig dsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_name")

    private String sceneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specs_config")

    private SpecsConfig specsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    public UpdateResSceneRequestBody withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 场景类型： - customize，自定义推荐 - popularity，热门推荐 - relation，关联推荐 - personalization，猜你喜欢
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public UpdateResSceneRequestBody withDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }

    /**
     * 数据源id，字母、数字、下划线、减号组合32位。
     * @return datasourceId
     */
    public String getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

    public UpdateResSceneRequestBody withDsConfig(DsConfig dsConfig) {
        this.dsConfig = dsConfig;
        return this;
    }

    public UpdateResSceneRequestBody withDsConfig(Consumer<DsConfig> dsConfigSetter) {
        if (this.dsConfig == null) {
            this.dsConfig = new DsConfig();
            dsConfigSetter.accept(this.dsConfig);
        }

        return this;
    }

    /**
     * Get dsConfig
     * @return dsConfig
     */
    public DsConfig getDsConfig() {
        return dsConfig;
    }

    public void setDsConfig(DsConfig dsConfig) {
        this.dsConfig = dsConfig;
    }

    public UpdateResSceneRequestBody withSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }

    /**
     * 场景名称，1-64位的字母、数字、下划线、中划线组合。
     * @return sceneName
     */
    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public UpdateResSceneRequestBody withSpecsConfig(SpecsConfig specsConfig) {
        this.specsConfig = specsConfig;
        return this;
    }

    public UpdateResSceneRequestBody withSpecsConfig(Consumer<SpecsConfig> specsConfigSetter) {
        if (this.specsConfig == null) {
            this.specsConfig = new SpecsConfig();
            specsConfigSetter.accept(this.specsConfig);
        }

        return this;
    }

    /**
     * Get specsConfig
     * @return specsConfig
     */
    public SpecsConfig getSpecsConfig() {
        return specsConfig;
    }

    public void setSpecsConfig(SpecsConfig specsConfig) {
        this.specsConfig = specsConfig;
    }

    public UpdateResSceneRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 场景类型： - UI，基于用户推荐物品 - UU，基于用户推荐用户 - II，基于物品推荐物品 - IU，基于物品推荐用户
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UpdateResSceneRequestBody withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 服务类型： - rank，排序服务 - rec，推荐服务
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateResSceneRequestBody that = (UpdateResSceneRequestBody) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.datasourceId, that.datasourceId)
            && Objects.equals(this.dsConfig, that.dsConfig) && Objects.equals(this.sceneName, that.sceneName)
            && Objects.equals(this.specsConfig, that.specsConfig) && Objects.equals(this.type, that.type)
            && Objects.equals(this.serviceType, that.serviceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, datasourceId, dsConfig, sceneName, specsConfig, type, serviceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResSceneRequestBody {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
        sb.append("    dsConfig: ").append(toIndentedString(dsConfig)).append("\n");
        sb.append("    sceneName: ").append(toIndentedString(sceneName)).append("\n");
        sb.append("    specsConfig: ").append(toIndentedString(specsConfig)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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
