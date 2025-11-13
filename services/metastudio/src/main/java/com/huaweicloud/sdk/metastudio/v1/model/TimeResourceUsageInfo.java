package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TimeResourceUsageInfo
 */
public class TimeResourceUsageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources_usage")

    private List<ResourceUsageInfo> resourcesUsage = null;

    public TimeResourceUsageInfo withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 查询时间段开始时间,格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public TimeResourceUsageInfo withResourcesUsage(List<ResourceUsageInfo> resourcesUsage) {
        this.resourcesUsage = resourcesUsage;
        return this;
    }

    public TimeResourceUsageInfo addResourcesUsageItem(ResourceUsageInfo resourcesUsageItem) {
        if (this.resourcesUsage == null) {
            this.resourcesUsage = new ArrayList<>();
        }
        this.resourcesUsage.add(resourcesUsageItem);
        return this;
    }

    public TimeResourceUsageInfo withResourcesUsage(Consumer<List<ResourceUsageInfo>> resourcesUsageSetter) {
        if (this.resourcesUsage == null) {
            this.resourcesUsage = new ArrayList<>();
        }
        resourcesUsageSetter.accept(this.resourcesUsage);
        return this;
    }

    /**
     * 资源用量列表
     * @return resourcesUsage
     */
    public List<ResourceUsageInfo> getResourcesUsage() {
        return resourcesUsage;
    }

    public void setResourcesUsage(List<ResourceUsageInfo> resourcesUsage) {
        this.resourcesUsage = resourcesUsage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeResourceUsageInfo that = (TimeResourceUsageInfo) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.resourcesUsage, that.resourcesUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, resourcesUsage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeResourceUsageInfo {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    resourcesUsage: ").append(toIndentedString(resourcesUsage)).append("\n");
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
