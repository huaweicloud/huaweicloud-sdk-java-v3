package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * change_security_group对象
 */
public class ChangeSecurityGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_security_group")

    private ChangeSecurityGroup changeSecurityGroup;

    public ChangeSecurityGroupRequestBody withChangeSecurityGroup(ChangeSecurityGroup changeSecurityGroup) {
        this.changeSecurityGroup = changeSecurityGroup;
        return this;
    }

    public ChangeSecurityGroupRequestBody withChangeSecurityGroup(
        Consumer<ChangeSecurityGroup> changeSecurityGroupSetter) {
        if (this.changeSecurityGroup == null) {
            this.changeSecurityGroup = new ChangeSecurityGroup();
            changeSecurityGroupSetter.accept(this.changeSecurityGroup);
        }

        return this;
    }

    /**
     * Get changeSecurityGroup
     * @return changeSecurityGroup
     */
    public ChangeSecurityGroup getChangeSecurityGroup() {
        return changeSecurityGroup;
    }

    public void setChangeSecurityGroup(ChangeSecurityGroup changeSecurityGroup) {
        this.changeSecurityGroup = changeSecurityGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeSecurityGroupRequestBody changeSecurityGroupRequestBody = (ChangeSecurityGroupRequestBody) o;
        return Objects.equals(this.changeSecurityGroup, changeSecurityGroupRequestBody.changeSecurityGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changeSecurityGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeSecurityGroupRequestBody {\n");
        sb.append("    changeSecurityGroup: ").append(toIndentedString(changeSecurityGroup)).append("\n");
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
