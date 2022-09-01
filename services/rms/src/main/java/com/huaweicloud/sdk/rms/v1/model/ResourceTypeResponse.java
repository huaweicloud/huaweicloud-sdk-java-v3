package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源类型详情
 */
public class ResourceTypeResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    @JacksonXmlProperty(localName = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global")

    @JacksonXmlProperty(localName = "global")

    private Boolean global;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    @JacksonXmlProperty(localName = "regions")

    private List<String> regions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "console_endpoint_id")

    @JacksonXmlProperty(localName = "console_endpoint_id")

    private String consoleEndpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "console_list_url")

    @JacksonXmlProperty(localName = "console_list_url")

    private String consoleListUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "console_detail_url")

    @JacksonXmlProperty(localName = "console_detail_url")

    private String consoleDetailUrl;

    public ResourceTypeResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源类型名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceTypeResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 资源类型显示名称，可以通过请求中 'X-Language'设置语言
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ResourceTypeResponse withGlobal(Boolean global) {
        this.global = global;
        return this;
    }

    /**
     * 是否是全局类型的资源
     * @return global
     */
    public Boolean getGlobal() {
        return global;
    }

    public void setGlobal(Boolean global) {
        this.global = global;
    }

    public ResourceTypeResponse withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    public ResourceTypeResponse addRegionsItem(String regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public ResourceTypeResponse withRegions(Consumer<List<String>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 支持的region列表
     * @return regions
     */
    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    public ResourceTypeResponse withConsoleEndpointId(String consoleEndpointId) {
        this.consoleEndpointId = consoleEndpointId;
        return this;
    }

    /**
     * console终端id
     * @return consoleEndpointId
     */
    public String getConsoleEndpointId() {
        return consoleEndpointId;
    }

    public void setConsoleEndpointId(String consoleEndpointId) {
        this.consoleEndpointId = consoleEndpointId;
    }

    public ResourceTypeResponse withConsoleListUrl(String consoleListUrl) {
        this.consoleListUrl = consoleListUrl;
        return this;
    }

    /**
     * console列表页地址
     * @return consoleListUrl
     */
    public String getConsoleListUrl() {
        return consoleListUrl;
    }

    public void setConsoleListUrl(String consoleListUrl) {
        this.consoleListUrl = consoleListUrl;
    }

    public ResourceTypeResponse withConsoleDetailUrl(String consoleDetailUrl) {
        this.consoleDetailUrl = consoleDetailUrl;
        return this;
    }

    /**
     * console详情页地址
     * @return consoleDetailUrl
     */
    public String getConsoleDetailUrl() {
        return consoleDetailUrl;
    }

    public void setConsoleDetailUrl(String consoleDetailUrl) {
        this.consoleDetailUrl = consoleDetailUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceTypeResponse resourceTypeResponse = (ResourceTypeResponse) o;
        return Objects.equals(this.name, resourceTypeResponse.name)
            && Objects.equals(this.displayName, resourceTypeResponse.displayName)
            && Objects.equals(this.global, resourceTypeResponse.global)
            && Objects.equals(this.regions, resourceTypeResponse.regions)
            && Objects.equals(this.consoleEndpointId, resourceTypeResponse.consoleEndpointId)
            && Objects.equals(this.consoleListUrl, resourceTypeResponse.consoleListUrl)
            && Objects.equals(this.consoleDetailUrl, resourceTypeResponse.consoleDetailUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, displayName, global, regions, consoleEndpointId, consoleListUrl, consoleDetailUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceTypeResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    global: ").append(toIndentedString(global)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    consoleEndpointId: ").append(toIndentedString(consoleEndpointId)).append("\n");
        sb.append("    consoleListUrl: ").append(toIndentedString(consoleListUrl)).append("\n");
        sb.append("    consoleDetailUrl: ").append(toIndentedString(consoleDetailUrl)).append("\n");
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
