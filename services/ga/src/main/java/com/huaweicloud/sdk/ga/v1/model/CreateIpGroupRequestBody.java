package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * create ip group request
 */
public class CreateIpGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_group")

    private CreateIpGroupOption ipGroup;

    public CreateIpGroupRequestBody withIpGroup(CreateIpGroupOption ipGroup) {
        this.ipGroup = ipGroup;
        return this;
    }

    public CreateIpGroupRequestBody withIpGroup(Consumer<CreateIpGroupOption> ipGroupSetter) {
        if (this.ipGroup == null) {
            this.ipGroup = new CreateIpGroupOption();
            ipGroupSetter.accept(this.ipGroup);
        }

        return this;
    }

    /**
     * Get ipGroup
     * @return ipGroup
     */
    public CreateIpGroupOption getIpGroup() {
        return ipGroup;
    }

    public void setIpGroup(CreateIpGroupOption ipGroup) {
        this.ipGroup = ipGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateIpGroupRequestBody that = (CreateIpGroupRequestBody) obj;
        return Objects.equals(this.ipGroup, that.ipGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIpGroupRequestBody {\n");
        sb.append("    ipGroup: ").append(toIndentedString(ipGroup)).append("\n");
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
