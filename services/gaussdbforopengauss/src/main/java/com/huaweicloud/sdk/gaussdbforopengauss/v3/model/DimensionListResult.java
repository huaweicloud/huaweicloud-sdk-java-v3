package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DimensionListResult
 */
public class DimensionListResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_num")

    private String activeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private String totalNum;

    public DimensionListResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 统计数据名称。 **取值范围**: 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DimensionListResult withActiveNum(String activeNum) {
        this.activeNum = activeNum;
        return this;
    }

    /**
     * **参数解释**: 活跃会话数。 **取值范围**: 不涉及。
     * @return activeNum
     */
    public String getActiveNum() {
        return activeNum;
    }

    public void setActiveNum(String activeNum) {
        this.activeNum = activeNum;
    }

    public DimensionListResult withTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 总会话数。 **取值范围**: 不涉及。
     * @return totalNum
     */
    public String getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DimensionListResult that = (DimensionListResult) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.activeNum, that.activeNum)
            && Objects.equals(this.totalNum, that.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, activeNum, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DimensionListResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    activeNum: ").append(toIndentedString(activeNum)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
