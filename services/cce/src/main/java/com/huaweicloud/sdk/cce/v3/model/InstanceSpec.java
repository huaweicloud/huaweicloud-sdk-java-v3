package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * spec是集合类的元素类型，内容为插件实例具体信息
 */
public class InstanceSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterID")

    private String clusterID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonTemplateName")

    private String addonTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonTemplateType")

    private String addonTemplateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonTemplateLogo")

    private String addonTemplateLogo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonTemplateLabels")

    private List<String> addonTemplateLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private Map<String, Object> values = null;

    public InstanceSpec withClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    /**
     * 集群id
     * @return clusterID
     */
    public String getClusterID() {
        return clusterID;
    }

    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    public InstanceSpec withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 插件模板版本号，如1.0.0
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public InstanceSpec withAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
        return this;
    }

    /**
     * 插件模板名称，如coredns
     * @return addonTemplateName
     */
    public String getAddonTemplateName() {
        return addonTemplateName;
    }

    public void setAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
    }

    public InstanceSpec withAddonTemplateType(String addonTemplateType) {
        this.addonTemplateType = addonTemplateType;
        return this;
    }

    /**
     * 插件模板类型
     * @return addonTemplateType
     */
    public String getAddonTemplateType() {
        return addonTemplateType;
    }

    public void setAddonTemplateType(String addonTemplateType) {
        this.addonTemplateType = addonTemplateType;
    }

    public InstanceSpec withAddonTemplateLogo(String addonTemplateLogo) {
        this.addonTemplateLogo = addonTemplateLogo;
        return this;
    }

    /**
     * 插件模板logo图片的地址
     * @return addonTemplateLogo
     */
    public String getAddonTemplateLogo() {
        return addonTemplateLogo;
    }

    public void setAddonTemplateLogo(String addonTemplateLogo) {
        this.addonTemplateLogo = addonTemplateLogo;
    }

    public InstanceSpec withAddonTemplateLabels(List<String> addonTemplateLabels) {
        this.addonTemplateLabels = addonTemplateLabels;
        return this;
    }

    public InstanceSpec addAddonTemplateLabelsItem(String addonTemplateLabelsItem) {
        if (this.addonTemplateLabels == null) {
            this.addonTemplateLabels = new ArrayList<>();
        }
        this.addonTemplateLabels.add(addonTemplateLabelsItem);
        return this;
    }

    public InstanceSpec withAddonTemplateLabels(Consumer<List<String>> addonTemplateLabelsSetter) {
        if (this.addonTemplateLabels == null) {
            this.addonTemplateLabels = new ArrayList<>();
        }
        addonTemplateLabelsSetter.accept(this.addonTemplateLabels);
        return this;
    }

    /**
     * 插件模板所属类型
     * @return addonTemplateLabels
     */
    public List<String> getAddonTemplateLabels() {
        return addonTemplateLabels;
    }

    public void setAddonTemplateLabels(List<String> addonTemplateLabels) {
        this.addonTemplateLabels = addonTemplateLabels;
    }

    public InstanceSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 插件模板描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InstanceSpec withValues(Map<String, Object> values) {
        this.values = values;
        return this;
    }

    public InstanceSpec putValuesItem(String key, Object valuesItem) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        this.values.put(key, valuesItem);
        return this;
    }

    public InstanceSpec withValues(Consumer<Map<String, Object>> valuesSetter) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 插件模板安装参数（各插件不同），请根据具体插件模板信息填写安装参数。
     * @return values
     */
    public Map<String, Object> getValues() {
        return values;
    }

    public void setValues(Map<String, Object> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceSpec that = (InstanceSpec) obj;
        return Objects.equals(this.clusterID, that.clusterID) && Objects.equals(this.version, that.version)
            && Objects.equals(this.addonTemplateName, that.addonTemplateName)
            && Objects.equals(this.addonTemplateType, that.addonTemplateType)
            && Objects.equals(this.addonTemplateLogo, that.addonTemplateLogo)
            && Objects.equals(this.addonTemplateLabels, that.addonTemplateLabels)
            && Objects.equals(this.description, that.description) && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterID,
            version,
            addonTemplateName,
            addonTemplateType,
            addonTemplateLogo,
            addonTemplateLabels,
            description,
            values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceSpec {\n");
        sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    addonTemplateName: ").append(toIndentedString(addonTemplateName)).append("\n");
        sb.append("    addonTemplateType: ").append(toIndentedString(addonTemplateType)).append("\n");
        sb.append("    addonTemplateLogo: ").append(toIndentedString(addonTemplateLogo)).append("\n");
        sb.append("    addonTemplateLabels: ").append(toIndentedString(addonTemplateLabels)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
