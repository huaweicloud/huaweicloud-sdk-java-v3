package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowTaskDefectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defects")

    private List<DefectInfoV2> defects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ShowTaskDefectsResponse withDefects(List<DefectInfoV2> defects) {
        this.defects = defects;
        return this;
    }

    public ShowTaskDefectsResponse addDefectsItem(DefectInfoV2 defectsItem) {
        if (this.defects == null) {
            this.defects = new ArrayList<>();
        }
        this.defects.add(defectsItem);
        return this;
    }

    public ShowTaskDefectsResponse withDefects(Consumer<List<DefectInfoV2>> defectsSetter) {
        if (this.defects == null) {
            this.defects = new ArrayList<>();
        }
        defectsSetter.accept(this.defects);
        return this;
    }

    /** 缺陷详情信息
     * 
     * @return defects */
    public List<DefectInfoV2> getDefects() {
        return defects;
    }

    public void setDefects(List<DefectInfoV2> defects) {
        this.defects = defects;
    }

    public ShowTaskDefectsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 总数
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTaskDefectsResponse showTaskDefectsResponse = (ShowTaskDefectsResponse) o;
        return Objects.equals(this.defects, showTaskDefectsResponse.defects)
            && Objects.equals(this.total, showTaskDefectsResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defects, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskDefectsResponse {\n");
        sb.append("    defects: ").append(toIndentedString(defects)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
