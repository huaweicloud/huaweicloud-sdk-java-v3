package com.huaweicloud.sdk.cloudide.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * StartInstanceParam
 */
public class StartInstanceParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="plugin_enable_list")
    
    private List<String> pluginEnableList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="plugin_vars")
    
    private Map<String, String> pluginVars = null;
    
    public StartInstanceParam withPluginEnableList(List<String> pluginEnableList) {
        this.pluginEnableList = pluginEnableList;
        return this;
    }

    
    public StartInstanceParam addPluginEnableListItem(String pluginEnableListItem) {
        this.pluginEnableList.add(pluginEnableListItem);
        return this;
    }

    public StartInstanceParam withPluginEnableList(Consumer<List<String>> pluginEnableListSetter) {
        if(this.pluginEnableList == null ){
            this.pluginEnableList = new ArrayList<>();
        }
        pluginEnableListSetter.accept(this.pluginEnableList);
        return this;
    }

    /**
     * 插件列表
     * @return pluginEnableList
     */
    public List<String> getPluginEnableList() {
        return pluginEnableList;
    }

    public void setPluginEnableList(List<String> pluginEnableList) {
        this.pluginEnableList = pluginEnableList;
    }

    

    public StartInstanceParam withPluginVars(Map<String, String> pluginVars) {
        this.pluginVars = pluginVars;
        return this;
    }

    

    public StartInstanceParam putPluginVarsItem(String key, String pluginVarsItem) {
        this.pluginVars.put(key, pluginVarsItem);
        return this;
    }

    public StartInstanceParam withPluginVars(Consumer<Map<String, String>> pluginVarsSetter) {
        if(this.pluginVars == null ){
            this.pluginVars = new HashMap<>();
        }
        pluginVarsSetter.accept(this.pluginVars);
        return this;
    }
    /**
     * 插件参数
     * @return pluginVars
     */
    public Map<String, String> getPluginVars() {
        return pluginVars;
    }

    public void setPluginVars(Map<String, String> pluginVars) {
        this.pluginVars = pluginVars;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartInstanceParam startInstanceParam = (StartInstanceParam) o;
        return Objects.equals(this.pluginEnableList, startInstanceParam.pluginEnableList) &&
            Objects.equals(this.pluginVars, startInstanceParam.pluginVars);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pluginEnableList, pluginVars);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartInstanceParam {\n");
        sb.append("    pluginEnableList: ").append(toIndentedString(pluginEnableList)).append("\n");
        sb.append("    pluginVars: ").append(toIndentedString(pluginVars)).append("\n");
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

