package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListApiGroupsQuantitiesV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offsell_nums")

    private Integer offsellNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "onsell_nums")

    private Integer onsellNums;

    public ListApiGroupsQuantitiesV2Response withOffsellNums(Integer offsellNums) {
        this.offsellNums = offsellNums;
        return this;
    }

    /**
     * 未上架的API分组个数  暂不支持
     * @return offsellNums
     */
    public Integer getOffsellNums() {
        return offsellNums;
    }

    public void setOffsellNums(Integer offsellNums) {
        this.offsellNums = offsellNums;
    }

    public ListApiGroupsQuantitiesV2Response withOnsellNums(Integer onsellNums) {
        this.onsellNums = onsellNums;
        return this;
    }

    /**
     * 已上架的API分组个数
     * @return onsellNums
     */
    public Integer getOnsellNums() {
        return onsellNums;
    }

    public void setOnsellNums(Integer onsellNums) {
        this.onsellNums = onsellNums;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApiGroupsQuantitiesV2Response that = (ListApiGroupsQuantitiesV2Response) obj;
        return Objects.equals(this.offsellNums, that.offsellNums) && Objects.equals(this.onsellNums, that.onsellNums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offsellNums, onsellNums);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApiGroupsQuantitiesV2Response {\n");
        sb.append("    offsellNums: ").append(toIndentedString(offsellNums)).append("\n");
        sb.append("    onsellNums: ").append(toIndentedString(onsellNums)).append("\n");
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
