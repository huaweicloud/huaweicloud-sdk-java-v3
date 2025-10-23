package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新报告配置请求参数
 */
public class UpdateReportSettingBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting_name")

    private String settingName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_ids")

    private List<String> regionIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_types")

    private List<ResourceTypeEnum> resourceTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private Integer timeRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_name_prefix")

    private String reportNamePrefix;

    public UpdateReportSettingBody withSettingName(String settingName) {
        this.settingName = settingName;
        return this;
    }

    /**
     * 配置名称，取值长度为2到32个字符
     * @return settingName
     */
    public String getSettingName() {
        return settingName;
    }

    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

    public UpdateReportSettingBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用,取值范围：true,false
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public UpdateReportSettingBody withRegionIds(List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }

    public UpdateReportSettingBody addRegionIdsItem(String regionIdsItem) {
        if (this.regionIds == null) {
            this.regionIds = new ArrayList<>();
        }
        this.regionIds.add(regionIdsItem);
        return this;
    }

    public UpdateReportSettingBody withRegionIds(Consumer<List<String>> regionIdsSetter) {
        if (this.regionIds == null) {
            this.regionIds = new ArrayList<>();
        }
        regionIdsSetter.accept(this.regionIds);
        return this;
    }

    /**
     * 参与统计的资源归属的区域列表，不设置表示全部区域，默认不设置
     * @return regionIds
     */
    public List<String> getRegionIds() {
        return regionIds;
    }

    public void setRegionIds(List<String> regionIds) {
        this.regionIds = regionIds;
    }

    public UpdateReportSettingBody withResourceTypes(List<ResourceTypeEnum> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    public UpdateReportSettingBody addResourceTypesItem(ResourceTypeEnum resourceTypesItem) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        this.resourceTypes.add(resourceTypesItem);
        return this;
    }

    public UpdateReportSettingBody withResourceTypes(Consumer<List<ResourceTypeEnum>> resourceTypesSetter) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        resourceTypesSetter.accept(this.resourceTypes);
        return this;
    }

    /**
     * 参与统计的资源类型列表，不设置表示全部资源类型，默认不设置
     * @return resourceTypes
     */
    public List<ResourceTypeEnum> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<ResourceTypeEnum> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public UpdateReportSettingBody withTimeRange(Integer timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    /**
     * 参与统计的数据范围（生成报告时刻往前多少天内的数据参与统计，滚动计算），默认7天，取值范围：7到30天，详情类数据报告不受此项配置约束
     * minimum: 7
     * maximum: 30
     * @return timeRange
     */
    public Integer getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(Integer timeRange) {
        this.timeRange = timeRange;
    }

    public UpdateReportSettingBody withReportNamePrefix(String reportNamePrefix) {
        this.reportNamePrefix = reportNamePrefix;
        return this;
    }

    /**
     * 报告名称的前缀，取值长度为3到128个字符
     * @return reportNamePrefix
     */
    public String getReportNamePrefix() {
        return reportNamePrefix;
    }

    public void setReportNamePrefix(String reportNamePrefix) {
        this.reportNamePrefix = reportNamePrefix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateReportSettingBody that = (UpdateReportSettingBody) obj;
        return Objects.equals(this.settingName, that.settingName) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.regionIds, that.regionIds) && Objects.equals(this.resourceTypes, that.resourceTypes)
            && Objects.equals(this.timeRange, that.timeRange)
            && Objects.equals(this.reportNamePrefix, that.reportNamePrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(settingName, enabled, regionIds, resourceTypes, timeRange, reportNamePrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateReportSettingBody {\n");
        sb.append("    settingName: ").append(toIndentedString(settingName)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    regionIds: ").append(toIndentedString(regionIds)).append("\n");
        sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
        sb.append("    reportNamePrefix: ").append(toIndentedString(reportNamePrefix)).append("\n");
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
