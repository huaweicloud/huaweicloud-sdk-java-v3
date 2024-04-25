package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListSecuritySensitiveDataOverviewsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_level_statistics")

    private List<SensitiveDataSecrecyLevelOverviewQueryDTO> secrecyLevelStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_statistics")

    private List<SensitiveDataCategoryOverviewQueryDTO> categoryStatistics = null;

    public ListSecuritySensitiveDataOverviewsResponse withSecrecyLevelStatistics(
        List<SensitiveDataSecrecyLevelOverviewQueryDTO> secrecyLevelStatistics) {
        this.secrecyLevelStatistics = secrecyLevelStatistics;
        return this;
    }

    public ListSecuritySensitiveDataOverviewsResponse addSecrecyLevelStatisticsItem(
        SensitiveDataSecrecyLevelOverviewQueryDTO secrecyLevelStatisticsItem) {
        if (this.secrecyLevelStatistics == null) {
            this.secrecyLevelStatistics = new ArrayList<>();
        }
        this.secrecyLevelStatistics.add(secrecyLevelStatisticsItem);
        return this;
    }

    public ListSecuritySensitiveDataOverviewsResponse withSecrecyLevelStatistics(
        Consumer<List<SensitiveDataSecrecyLevelOverviewQueryDTO>> secrecyLevelStatisticsSetter) {
        if (this.secrecyLevelStatistics == null) {
            this.secrecyLevelStatistics = new ArrayList<>();
        }
        secrecyLevelStatisticsSetter.accept(this.secrecyLevelStatistics);
        return this;
    }

    /**
     * 基于密级的概览统计
     * @return secrecyLevelStatistics
     */
    public List<SensitiveDataSecrecyLevelOverviewQueryDTO> getSecrecyLevelStatistics() {
        return secrecyLevelStatistics;
    }

    public void setSecrecyLevelStatistics(List<SensitiveDataSecrecyLevelOverviewQueryDTO> secrecyLevelStatistics) {
        this.secrecyLevelStatistics = secrecyLevelStatistics;
    }

    public ListSecuritySensitiveDataOverviewsResponse withCategoryStatistics(
        List<SensitiveDataCategoryOverviewQueryDTO> categoryStatistics) {
        this.categoryStatistics = categoryStatistics;
        return this;
    }

    public ListSecuritySensitiveDataOverviewsResponse addCategoryStatisticsItem(
        SensitiveDataCategoryOverviewQueryDTO categoryStatisticsItem) {
        if (this.categoryStatistics == null) {
            this.categoryStatistics = new ArrayList<>();
        }
        this.categoryStatistics.add(categoryStatisticsItem);
        return this;
    }

    public ListSecuritySensitiveDataOverviewsResponse withCategoryStatistics(
        Consumer<List<SensitiveDataCategoryOverviewQueryDTO>> categoryStatisticsSetter) {
        if (this.categoryStatistics == null) {
            this.categoryStatistics = new ArrayList<>();
        }
        categoryStatisticsSetter.accept(this.categoryStatistics);
        return this;
    }

    /**
     * 基于分类的概览统计
     * @return categoryStatistics
     */
    public List<SensitiveDataCategoryOverviewQueryDTO> getCategoryStatistics() {
        return categoryStatistics;
    }

    public void setCategoryStatistics(List<SensitiveDataCategoryOverviewQueryDTO> categoryStatistics) {
        this.categoryStatistics = categoryStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecuritySensitiveDataOverviewsResponse that = (ListSecuritySensitiveDataOverviewsResponse) obj;
        return Objects.equals(this.secrecyLevelStatistics, that.secrecyLevelStatistics)
            && Objects.equals(this.categoryStatistics, that.categoryStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secrecyLevelStatistics, categoryStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecuritySensitiveDataOverviewsResponse {\n");
        sb.append("    secrecyLevelStatistics: ").append(toIndentedString(secrecyLevelStatistics)).append("\n");
        sb.append("    categoryStatistics: ").append(toIndentedString(categoryStatistics)).append("\n");
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
