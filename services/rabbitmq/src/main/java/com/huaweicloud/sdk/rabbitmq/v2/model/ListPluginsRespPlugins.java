package com.huaweicloud.sdk.rabbitmq.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 插件信息。
 */
public class ListPluginsRespPlugins  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="running")
    
    private Boolean running;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable")
    
    private Boolean enable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;

    public ListPluginsRespPlugins withRunning(Boolean running) {
        this.running = running;
        return this;
    }

    


    /**
     * 是否运行。
     * @return running
     */
    public Boolean getRunning() {
        return running;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }

    public ListPluginsRespPlugins withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    


    /**
     * 是否启用。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ListPluginsRespPlugins withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 插件名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListPluginsRespPlugins withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 插件版本。
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
        ListPluginsRespPlugins listPluginsRespPlugins = (ListPluginsRespPlugins) o;
        return Objects.equals(this.running, listPluginsRespPlugins.running) &&
            Objects.equals(this.enable, listPluginsRespPlugins.enable) &&
            Objects.equals(this.name, listPluginsRespPlugins.name) &&
            Objects.equals(this.version, listPluginsRespPlugins.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(running, enable, name, version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPluginsRespPlugins {\n");
        sb.append("    running: ").append(toIndentedString(running)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

