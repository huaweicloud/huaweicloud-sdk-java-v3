package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExtensionSearchUserInputParamCustomizeForDetail
 */
public class ExtensionSearchUserInputParamCustomizeForDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private String ids;

    public ExtensionSearchUserInputParamCustomizeForDetail withIds(String ids) {
        this.ids = ids;
        return this;
    }

    /**
     * 插件ID列表
     * @return ids
     */
    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtensionSearchUserInputParamCustomizeForDetail extensionSearchUserInputParamCustomizeForDetail =
            (ExtensionSearchUserInputParamCustomizeForDetail) o;
        return Objects.equals(this.ids, extensionSearchUserInputParamCustomizeForDetail.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionSearchUserInputParamCustomizeForDetail {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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
