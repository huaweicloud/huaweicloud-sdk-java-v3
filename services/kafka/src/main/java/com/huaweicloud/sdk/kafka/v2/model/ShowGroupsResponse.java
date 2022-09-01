package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    @JacksonXmlProperty(localName = "group")

    private ShowGroupsRespGroup group;

    public ShowGroupsResponse withGroup(ShowGroupsRespGroup group) {
        this.group = group;
        return this;
    }

    public ShowGroupsResponse withGroup(Consumer<ShowGroupsRespGroup> groupSetter) {
        if (this.group == null) {
            this.group = new ShowGroupsRespGroup();
            groupSetter.accept(this.group);
        }

        return this;
    }

    /**
     * Get group
     * @return group
     */
    public ShowGroupsRespGroup getGroup() {
        return group;
    }

    public void setGroup(ShowGroupsRespGroup group) {
        this.group = group;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGroupsResponse showGroupsResponse = (ShowGroupsResponse) o;
        return Objects.equals(this.group, showGroupsResponse.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGroupsResponse {\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
