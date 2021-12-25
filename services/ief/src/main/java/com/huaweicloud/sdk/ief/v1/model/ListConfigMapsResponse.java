package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListConfigMapsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configmaps")

    private List<ConfigMapResp> configmaps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListConfigMapsResponse withConfigmaps(List<ConfigMapResp> configmaps) {
        this.configmaps = configmaps;
        return this;
    }

    public ListConfigMapsResponse addConfigmapsItem(ConfigMapResp configmapsItem) {
        if (this.configmaps == null) {
            this.configmaps = new ArrayList<>();
        }
        this.configmaps.add(configmapsItem);
        return this;
    }

    public ListConfigMapsResponse withConfigmaps(Consumer<List<ConfigMapResp>> configmapsSetter) {
        if (this.configmaps == null) {
            this.configmaps = new ArrayList<>();
        }
        configmapsSetter.accept(this.configmaps);
        return this;
    }

    /** 配置项
     * 
     * @return configmaps */
    public List<ConfigMapResp> getConfigmaps() {
        return configmaps;
    }

    public void setConfigmaps(List<ConfigMapResp> configmaps) {
        this.configmaps = configmaps;
    }

    public ListConfigMapsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 满足条件的个数
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListConfigMapsResponse listConfigMapsResponse = (ListConfigMapsResponse) o;
        return Objects.equals(this.configmaps, listConfigMapsResponse.configmaps)
            && Objects.equals(this.count, listConfigMapsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configmaps, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigMapsResponse {\n");
        sb.append("    configmaps: ").append(toIndentedString(configmaps)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
