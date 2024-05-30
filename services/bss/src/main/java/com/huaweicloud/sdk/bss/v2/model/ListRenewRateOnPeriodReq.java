package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListRenewRateOnPeriodReq
 */
public class ListRenewRateOnPeriodReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private List<String> resourceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_relative_resources")

    private Boolean includeRelativeResources;

    public ListRenewRateOnPeriodReq withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public ListRenewRateOnPeriodReq addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public ListRenewRateOnPeriodReq withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * |参数名称：资源ID列表。只支持传入主资源ID，最多10个资源ID。| |参数约束以及描述：资源ID列表。只支持传入主资源ID，最多10个资源ID。|
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public ListRenewRateOnPeriodReq withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * |参数名称：周期类型：2：月3：年| |参数的约束及描述：周期类型：2：月3：年|
     * minimum: 2
     * maximum: 3
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public ListRenewRateOnPeriodReq withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * |参数名称：周期数目：如果是月，目前支持1-11如果是年，目前支持1-3| |参数的约束及描述：周期数目：如果是月，目前支持1-11如果是年，目前支持1-3|
     * minimum: 1
     * maximum: 11
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public ListRenewRateOnPeriodReq withIncludeRelativeResources(Boolean includeRelativeResources) {
        this.includeRelativeResources = includeRelativeResources;
        return this;
    }

    /**
     * 是否包含关联资源一起续费询价。 false：不包含true：包含 此参数不携带或携带值为空串时，默认值为“false\"。
     * @return includeRelativeResources
     */
    public Boolean getIncludeRelativeResources() {
        return includeRelativeResources;
    }

    public void setIncludeRelativeResources(Boolean includeRelativeResources) {
        this.includeRelativeResources = includeRelativeResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRenewRateOnPeriodReq that = (ListRenewRateOnPeriodReq) obj;
        return Objects.equals(this.resourceIds, that.resourceIds) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.includeRelativeResources, that.includeRelativeResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceIds, periodType, periodNum, includeRelativeResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRenewRateOnPeriodReq {\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    includeRelativeResources: ").append(toIndentedString(includeRelativeResources)).append("\n");
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
