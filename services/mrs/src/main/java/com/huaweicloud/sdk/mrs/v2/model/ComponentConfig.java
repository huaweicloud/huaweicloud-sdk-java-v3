package com.huaweicloud.sdk.mrs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v2.model.Config;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ComponentConfig
 */
public class ComponentConfig  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="component_name")
    

    private String componentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configs")
    
    private List<Config> configs = null;
    
    public ComponentConfig withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    


    /**
     * 组件名称
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    

    public ComponentConfig withConfigs(List<Config> configs) {
        this.configs = configs;
        return this;
    }

    
    public ComponentConfig addConfigsItem(Config configsItem) {
        if(this.configs == null) {
            this.configs = new ArrayList<>();
        }
        this.configs.add(configsItem);
        return this;
    }

    public ComponentConfig withConfigs(Consumer<List<Config>> configsSetter) {
        if(this.configs == null) {
            this.configs = new ArrayList<>();
        }
        configsSetter.accept(this.configs);
        return this;
    }

    /**
     * 组件配置项列表
     * @return configs
     */
    public List<Config> getConfigs() {
        return configs;
    }

    public void setConfigs(List<Config> configs) {
        this.configs = configs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentConfig componentConfig = (ComponentConfig) o;
        return Objects.equals(this.componentName, componentConfig.componentName) &&
            Objects.equals(this.configs, componentConfig.configs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(componentName, configs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentConfig {\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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

