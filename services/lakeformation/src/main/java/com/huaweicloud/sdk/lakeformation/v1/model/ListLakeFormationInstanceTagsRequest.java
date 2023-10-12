package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListLakeFormationInstanceTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_predefine_tags")

    private Boolean usePredefineTags;

    public ListLakeFormationInstanceTagsRequest withUsePredefineTags(Boolean usePredefineTags) {
        this.usePredefineTags = usePredefineTags;
        return this;
    }

    /**
     * 使用预定义标签，true表示使用
     * @return usePredefineTags
     */
    public Boolean getUsePredefineTags() {
        return usePredefineTags;
    }

    public void setUsePredefineTags(Boolean usePredefineTags) {
        this.usePredefineTags = usePredefineTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLakeFormationInstanceTagsRequest that = (ListLakeFormationInstanceTagsRequest) obj;
        return Objects.equals(this.usePredefineTags, that.usePredefineTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usePredefineTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLakeFormationInstanceTagsRequest {\n");
        sb.append("    usePredefineTags: ").append(toIndentedString(usePredefineTags)).append("\n");
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
