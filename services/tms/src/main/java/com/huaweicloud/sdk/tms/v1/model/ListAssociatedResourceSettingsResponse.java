package com.huaweicloud.sdk.tms.v1.model;

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
public class ListAssociatedResourceSettingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "settings")

    private List<AssociatedResourceSetting> settings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAssociatedResourceSettingsResponse withSettings(List<AssociatedResourceSetting> settings) {
        this.settings = settings;
        return this;
    }

    public ListAssociatedResourceSettingsResponse addSettingsItem(AssociatedResourceSetting settingsItem) {
        if (this.settings == null) {
            this.settings = new ArrayList<>();
        }
        this.settings.add(settingsItem);
        return this;
    }

    public ListAssociatedResourceSettingsResponse withSettings(
        Consumer<List<AssociatedResourceSetting>> settingsSetter) {
        if (this.settings == null) {
            this.settings = new ArrayList<>();
        }
        settingsSetter.accept(this.settings);
        return this;
    }

    /**
     * 规则的配置信息
     * @return settings
     */
    public List<AssociatedResourceSetting> getSettings() {
        return settings;
    }

    public void setSettings(List<AssociatedResourceSetting> settings) {
        this.settings = settings;
    }

    public ListAssociatedResourceSettingsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 记录总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListAssociatedResourceSettingsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAssociatedResourceSettingsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAssociatedResourceSettingsResponse that = (ListAssociatedResourceSettingsResponse) obj;
        return Objects.equals(this.settings, that.settings) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(settings, totalCount, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssociatedResourceSettingsResponse {\n");
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
