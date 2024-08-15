package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 脚本工单属性
 */
public class JobScriptOrderListProp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_ids")

    private String regionIds;

    public JobScriptOrderListProp withRegionIds(String regionIds) {
        this.regionIds = regionIds;
        return this;
    }

    /**
     * CMDB服务实例区域id，可能有多个
     * @return regionIds
     */
    public String getRegionIds() {
        return regionIds;
    }

    public void setRegionIds(String regionIds) {
        this.regionIds = regionIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobScriptOrderListProp that = (JobScriptOrderListProp) obj;
        return Objects.equals(this.regionIds, that.regionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobScriptOrderListProp {\n");
        sb.append("    regionIds: ").append(toIndentedString(regionIds)).append("\n");
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
