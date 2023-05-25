package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * spec是集合类的元素类型，内容为插件实例安装/升级的具体请求信息
 */
public class InstanceRequestSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterID")

    private String clusterID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private Map<String, Object> values = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonTemplateName")

    private String addonTemplateName;

    public InstanceRequestSpec withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 待安装、升级插件的版本号，例如1.0.0 - 安装：该参数非必传，如果不传，匹配集群支持的最新版本 - 升级：该参数必传，需指定版本号 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public InstanceRequestSpec withClusterID(String clusterID) {
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

    public InstanceRequestSpec withValues(Map<String, Object> values) {
        this.values = values;
        return this;
    }

    public InstanceRequestSpec putValuesItem(String key, Object valuesItem) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        this.values.put(key, valuesItem);
        return this;
    }

    public InstanceRequestSpec withValues(Consumer<Map<String, Object>> valuesSetter) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 插件模板安装参数（各插件不同），升级插件时需要填写全量安装参数，未填写参数将使用插件模板中的默认值，当前插件安装参数可通过查询插件实例接口获取。 
     * @return values
     */
    public Map<String, Object> getValues() {
        return values;
    }

    public void setValues(Map<String, Object> values) {
        this.values = values;
    }

    public InstanceRequestSpec withAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
        return this;
    }

    /**
     * 待安装插件模板名称，如coredns
     * @return addonTemplateName
     */
    public String getAddonTemplateName() {
        return addonTemplateName;
    }

    public void setAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceRequestSpec instanceRequestSpec = (InstanceRequestSpec) o;
        return Objects.equals(this.version, instanceRequestSpec.version)
            && Objects.equals(this.clusterID, instanceRequestSpec.clusterID)
            && Objects.equals(this.values, instanceRequestSpec.values)
            && Objects.equals(this.addonTemplateName, instanceRequestSpec.addonTemplateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, clusterID, values, addonTemplateName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceRequestSpec {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    addonTemplateName: ").append(toIndentedString(addonTemplateName)).append("\n");
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
