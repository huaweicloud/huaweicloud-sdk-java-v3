package com.huaweicloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 管理类事件选择器。
 */
public class ManagementEventSelector {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_service")

    private List<String> excludeService = null;

    public ManagementEventSelector withExcludeService(List<String> excludeService) {
        this.excludeService = excludeService;
        return this;
    }

    public ManagementEventSelector addExcludeServiceItem(String excludeServiceItem) {
        if (this.excludeService == null) {
            this.excludeService = new ArrayList<>();
        }
        this.excludeService.add(excludeServiceItem);
        return this;
    }

    public ManagementEventSelector withExcludeService(Consumer<List<String>> excludeServiceSetter) {
        if (this.excludeService == null) {
            this.excludeService = new ArrayList<>();
        }
        excludeServiceSetter.accept(this.excludeService);
        return this;
    }

    /**
     * 标识不转储的云服务名称。 目前只支持设置为KMS，表示屏蔽KMS服务的createDatakey事件。
     * @return excludeService
     */
    public List<String> getExcludeService() {
        return excludeService;
    }

    public void setExcludeService(List<String> excludeService) {
        this.excludeService = excludeService;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ManagementEventSelector that = (ManagementEventSelector) obj;
        return Objects.equals(this.excludeService, that.excludeService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excludeService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManagementEventSelector {\n");
        sb.append("    excludeService: ").append(toIndentedString(excludeService)).append("\n");
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
