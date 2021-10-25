package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListCommonPoolsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private String fields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    public ListCommonPoolsRequest withFields(String fields) {
        this.fields = fields;
        return this;
    }

    /** 显示，形式为\"fields=id&fields=name&...\"
     * 支持字段：id/name/status/type/used/allow_share_bandwidth_types/public_border_group
     * 
     * @return fields */
    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public ListCommonPoolsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 公共池名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListCommonPoolsRequest withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /** 公共池位于中心还是边缘
     * 
     * @return publicBorderGroup */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCommonPoolsRequest listCommonPoolsRequest = (ListCommonPoolsRequest) o;
        return Objects.equals(this.fields, listCommonPoolsRequest.fields)
            && Objects.equals(this.name, listCommonPoolsRequest.name)
            && Objects.equals(this.publicBorderGroup, listCommonPoolsRequest.publicBorderGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, name, publicBorderGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCommonPoolsRequest {\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
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
