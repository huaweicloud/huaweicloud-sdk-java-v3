package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CheckWhetherHostGroupCanBeCreatedResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_created")

    private Boolean canCreated;

    public CheckWhetherHostGroupCanBeCreatedResponse withCanCreated(Boolean canCreated) {
        this.canCreated = canCreated;
        return this;
    }

    /**
     * 是否有创建主机集群权限，true 有权限 false 无权限
     * @return canCreated
     */
    public Boolean getCanCreated() {
        return canCreated;
    }

    public void setCanCreated(Boolean canCreated) {
        this.canCreated = canCreated;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckWhetherHostGroupCanBeCreatedResponse that = (CheckWhetherHostGroupCanBeCreatedResponse) obj;
        return Objects.equals(this.canCreated, that.canCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canCreated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckWhetherHostGroupCanBeCreatedResponse {\n");
        sb.append("    canCreated: ").append(toIndentedString(canCreated)).append("\n");
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
