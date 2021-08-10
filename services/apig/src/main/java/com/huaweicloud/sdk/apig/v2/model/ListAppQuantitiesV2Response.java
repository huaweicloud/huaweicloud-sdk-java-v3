package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ListAppQuantitiesV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authed_nums")

    private Integer authedNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unauthed_nums")

    private Integer unauthedNums;

    public ListAppQuantitiesV2Response withAuthedNums(Integer authedNums) {
        this.authedNums = authedNums;
        return this;
    }

    /** 已进行API访问授权的APP个数
     * 
     * @return authedNums */
    public Integer getAuthedNums() {
        return authedNums;
    }

    public void setAuthedNums(Integer authedNums) {
        this.authedNums = authedNums;
    }

    public ListAppQuantitiesV2Response withUnauthedNums(Integer unauthedNums) {
        this.unauthedNums = unauthedNums;
        return this;
    }

    /** 未进行API访问授权的APP个数
     * 
     * @return unauthedNums */
    public Integer getUnauthedNums() {
        return unauthedNums;
    }

    public void setUnauthedNums(Integer unauthedNums) {
        this.unauthedNums = unauthedNums;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAppQuantitiesV2Response listAppQuantitiesV2Response = (ListAppQuantitiesV2Response) o;
        return Objects.equals(this.authedNums, listAppQuantitiesV2Response.authedNums)
            && Objects.equals(this.unauthedNums, listAppQuantitiesV2Response.unauthedNums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authedNums, unauthedNums);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppQuantitiesV2Response {\n");
        sb.append("    authedNums: ").append(toIndentedString(authedNums)).append("\n");
        sb.append("    unauthedNums: ").append(toIndentedString(unauthedNums)).append("\n");
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
