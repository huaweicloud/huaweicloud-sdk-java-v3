package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListDesktopStatisticsByVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_statistics")

    private List<DesktopVersionStatistic> versionStatistics = null;

    public ListDesktopStatisticsByVersionResponse withVersionStatistics(
        List<DesktopVersionStatistic> versionStatistics) {
        this.versionStatistics = versionStatistics;
        return this;
    }

    public ListDesktopStatisticsByVersionResponse addVersionStatisticsItem(
        DesktopVersionStatistic versionStatisticsItem) {
        if (this.versionStatistics == null) {
            this.versionStatistics = new ArrayList<>();
        }
        this.versionStatistics.add(versionStatisticsItem);
        return this;
    }

    public ListDesktopStatisticsByVersionResponse withVersionStatistics(
        Consumer<List<DesktopVersionStatistic>> versionStatisticsSetter) {
        if (this.versionStatistics == null) {
            this.versionStatistics = new ArrayList<>();
        }
        versionStatisticsSetter.accept(this.versionStatistics);
        return this;
    }

    /**
     * 按版本分组的桌面统计信息列表。
     * @return versionStatistics
     */
    public List<DesktopVersionStatistic> getVersionStatistics() {
        return versionStatistics;
    }

    public void setVersionStatistics(List<DesktopVersionStatistic> versionStatistics) {
        this.versionStatistics = versionStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDesktopStatisticsByVersionResponse that = (ListDesktopStatisticsByVersionResponse) obj;
        return Objects.equals(this.versionStatistics, that.versionStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopStatisticsByVersionResponse {\n");
        sb.append("    versionStatistics: ").append(toIndentedString(versionStatistics)).append("\n");
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
