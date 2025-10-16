package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListPluginInfoListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugins")

    private List<CustomerPluginInfoResult> plugins = null;

    public ListPluginInfoListResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 插件数量。 **取值范围**: 不涉及。 
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListPluginInfoListResponse withPlugins(List<CustomerPluginInfoResult> plugins) {
        this.plugins = plugins;
        return this;
    }

    public ListPluginInfoListResponse addPluginsItem(CustomerPluginInfoResult pluginsItem) {
        if (this.plugins == null) {
            this.plugins = new ArrayList<>();
        }
        this.plugins.add(pluginsItem);
        return this;
    }

    public ListPluginInfoListResponse withPlugins(Consumer<List<CustomerPluginInfoResult>> pluginsSetter) {
        if (this.plugins == null) {
            this.plugins = new ArrayList<>();
        }
        pluginsSetter.accept(this.plugins);
        return this;
    }

    /**
     * **参数解释**: 插件详细信息。 
     * @return plugins
     */
    public List<CustomerPluginInfoResult> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<CustomerPluginInfoResult> plugins) {
        this.plugins = plugins;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPluginInfoListResponse that = (ListPluginInfoListResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.plugins, that.plugins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, plugins);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPluginInfoListResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
