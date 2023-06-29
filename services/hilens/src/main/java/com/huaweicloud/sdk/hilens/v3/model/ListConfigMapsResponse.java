package com.huaweicloud.sdk.hilens.v3.model;

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
public class ListConfigMapsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configmaps")

    private List<ConfigMap> configmaps = null;

    public ListConfigMapsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 配置项数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListConfigMapsResponse withConfigmaps(List<ConfigMap> configmaps) {
        this.configmaps = configmaps;
        return this;
    }

    public ListConfigMapsResponse addConfigmapsItem(ConfigMap configmapsItem) {
        if (this.configmaps == null) {
            this.configmaps = new ArrayList<>();
        }
        this.configmaps.add(configmapsItem);
        return this;
    }

    public ListConfigMapsResponse withConfigmaps(Consumer<List<ConfigMap>> configmapsSetter) {
        if (this.configmaps == null) {
            this.configmaps = new ArrayList<>();
        }
        configmapsSetter.accept(this.configmaps);
        return this;
    }

    /**
     * 配置项详情
     * @return configmaps
     */
    public List<ConfigMap> getConfigmaps() {
        return configmaps;
    }

    public void setConfigmaps(List<ConfigMap> configmaps) {
        this.configmaps = configmaps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConfigMapsResponse that = (ListConfigMapsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.configmaps, that.configmaps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, configmaps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigMapsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    configmaps: ").append(toIndentedString(configmaps)).append("\n");
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
