package com.huaweicloud.sdk.rabbitmq.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListPluginsRespPlugins;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListPluginsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="plugins")
    
    private List<ListPluginsRespPlugins> plugins = null;
    
    public ListPluginsResponse withPlugins(List<ListPluginsRespPlugins> plugins) {
        this.plugins = plugins;
        return this;
    }

    
    public ListPluginsResponse addPluginsItem(ListPluginsRespPlugins pluginsItem) {
        this.plugins.add(pluginsItem);
        return this;
    }

    public ListPluginsResponse withPlugins(Consumer<List<ListPluginsRespPlugins>> pluginsSetter) {
        if(this.plugins == null ){
            this.plugins = new ArrayList<>();
        }
        pluginsSetter.accept(this.plugins);
        return this;
    }

    /**
     * 插件信息列表。
     * @return plugins
     */
    public List<ListPluginsRespPlugins> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<ListPluginsRespPlugins> plugins) {
        this.plugins = plugins;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPluginsResponse listPluginsResponse = (ListPluginsResponse) o;
        return Objects.equals(this.plugins, listPluginsResponse.plugins);
    }
    @Override
    public int hashCode() {
        return Objects.hash(plugins);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPluginsResponse {\n");
        sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
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

