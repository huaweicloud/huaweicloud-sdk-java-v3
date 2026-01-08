package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListFullSqlSwitchesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_sql_switches")

    private List<FullSqlSwitchResult> fullSqlSwitches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_sql_types")

    private List<SqlTypeRangeConfigResult> allowedSqlTypes = null;

    public ListFullSqlSwitchesResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 总记录数量。 **取值范围**: 不涉及。
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ListFullSqlSwitchesResponse withFullSqlSwitches(List<FullSqlSwitchResult> fullSqlSwitches) {
        this.fullSqlSwitches = fullSqlSwitches;
        return this;
    }

    public ListFullSqlSwitchesResponse addFullSqlSwitchesItem(FullSqlSwitchResult fullSqlSwitchesItem) {
        if (this.fullSqlSwitches == null) {
            this.fullSqlSwitches = new ArrayList<>();
        }
        this.fullSqlSwitches.add(fullSqlSwitchesItem);
        return this;
    }

    public ListFullSqlSwitchesResponse withFullSqlSwitches(Consumer<List<FullSqlSwitchResult>> fullSqlSwitchesSetter) {
        if (this.fullSqlSwitches == null) {
            this.fullSqlSwitches = new ArrayList<>();
        }
        fullSqlSwitchesSetter.accept(this.fullSqlSwitches);
        return this;
    }

    /**
     * **参数解释**: 开关记录列表。
     * @return fullSqlSwitches
     */
    public List<FullSqlSwitchResult> getFullSqlSwitches() {
        return fullSqlSwitches;
    }

    public void setFullSqlSwitches(List<FullSqlSwitchResult> fullSqlSwitches) {
        this.fullSqlSwitches = fullSqlSwitches;
    }

    public ListFullSqlSwitchesResponse withAllowedSqlTypes(List<SqlTypeRangeConfigResult> allowedSqlTypes) {
        this.allowedSqlTypes = allowedSqlTypes;
        return this;
    }

    public ListFullSqlSwitchesResponse addAllowedSqlTypesItem(SqlTypeRangeConfigResult allowedSqlTypesItem) {
        if (this.allowedSqlTypes == null) {
            this.allowedSqlTypes = new ArrayList<>();
        }
        this.allowedSqlTypes.add(allowedSqlTypesItem);
        return this;
    }

    public ListFullSqlSwitchesResponse withAllowedSqlTypes(
        Consumer<List<SqlTypeRangeConfigResult>> allowedSqlTypesSetter) {
        if (this.allowedSqlTypes == null) {
            this.allowedSqlTypes = new ArrayList<>();
        }
        allowedSqlTypesSetter.accept(this.allowedSqlTypes);
        return this;
    }

    /**
     * **参数解释**: 可选择的SQL采集类别清单列表。供开启全量SQL时做配置下发参考。
     * @return allowedSqlTypes
     */
    public List<SqlTypeRangeConfigResult> getAllowedSqlTypes() {
        return allowedSqlTypes;
    }

    public void setAllowedSqlTypes(List<SqlTypeRangeConfigResult> allowedSqlTypes) {
        this.allowedSqlTypes = allowedSqlTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFullSqlSwitchesResponse that = (ListFullSqlSwitchesResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.fullSqlSwitches, that.fullSqlSwitches)
            && Objects.equals(this.allowedSqlTypes, that.allowedSqlTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, fullSqlSwitches, allowedSqlTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFullSqlSwitchesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    fullSqlSwitches: ").append(toIndentedString(fullSqlSwitches)).append("\n");
        sb.append("    allowedSqlTypes: ").append(toIndentedString(allowedSqlTypes)).append("\n");
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
