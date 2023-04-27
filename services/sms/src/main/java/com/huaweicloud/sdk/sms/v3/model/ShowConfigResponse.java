package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private Map<String, String> config = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<Map<String, String>> regions = null;

    public ShowConfigResponse withConfig(Map<String, String> config) {
        this.config = config;
        return this;
    }

    public ShowConfigResponse putConfigItem(String key, String configItem) {
        if (this.config == null) {
            this.config = new HashMap<>();
        }
        this.config.put(key, configItem);
        return this;
    }

    public ShowConfigResponse withConfig(Consumer<Map<String, String>> configSetter) {
        if (this.config == null) {
            this.config = new HashMap<>();
        }
        configSetter.accept(this.config);
        return this;
    }

    /**
     * mainRegion,obs_domain,disktype,process_and_it及以后增加的信息
     * @return config
     */
    public Map<String, String> getConfig() {
        return config;
    }

    public void setConfig(Map<String, String> config) {
        this.config = config;
    }

    public ShowConfigResponse withRegions(List<Map<String, String>> regions) {
        this.regions = regions;
        return this;
    }

    public ShowConfigResponse addRegionsItem(Map<String, String> regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public ShowConfigResponse withRegions(Consumer<List<Map<String, String>>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * region数组
     * @return regions
     */
    public List<Map<String, String>> getRegions() {
        return regions;
    }

    public void setRegions(List<Map<String, String>> regions) {
        this.regions = regions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowConfigResponse showConfigResponse = (ShowConfigResponse) o;
        return Objects.equals(this.config, showConfigResponse.config)
            && Objects.equals(this.regions, showConfigResponse.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(config, regions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConfigResponse {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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
