package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * spec是集合类的元素类型，内容为插件实例安装/升级的具体请求信息
 */
public class InstanceRequestSpec  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="addonTemplateName")
    
    private String addonTemplateName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clusterID")
    
    private String clusterID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    
    private Map<String, Object> values = new HashMap<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;

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
        this.values.put(key, valuesItem);
        return this;
    }

    public InstanceRequestSpec withValues(Consumer<Map<String, Object>> valuesSetter) {
        if(this.values == null ){
            this.values = new HashMap<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }
    /**
     * 插件模板安装参数（各插件不同）
     * @return values
     */
    public Map<String, Object> getValues() {
        return values;
    }

    public void setValues(Map<String, Object> values) {
        this.values = values;
    }

    public InstanceRequestSpec withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 待安装、升级插件的具体版本版本号，例如1.0.0
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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
        return Objects.equals(this.addonTemplateName, instanceRequestSpec.addonTemplateName) &&
            Objects.equals(this.clusterID, instanceRequestSpec.clusterID) &&
            Objects.equals(this.values, instanceRequestSpec.values) &&
            Objects.equals(this.version, instanceRequestSpec.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(addonTemplateName, clusterID, values, version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceRequestSpec {\n");
        sb.append("    addonTemplateName: ").append(toIndentedString(addonTemplateName)).append("\n");
        sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

