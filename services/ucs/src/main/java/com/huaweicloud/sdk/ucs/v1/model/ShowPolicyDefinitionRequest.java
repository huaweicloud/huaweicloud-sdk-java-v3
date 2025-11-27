package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPolicyDefinitionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policydefinitionid")

    private String policydefinitionid;

    public ShowPolicyDefinitionRequest withPolicydefinitionid(String policydefinitionid) {
        this.policydefinitionid = policydefinitionid;
        return this;
    }

    /**
     * 策略定义id
     * @return policydefinitionid
     */
    public String getPolicydefinitionid() {
        return policydefinitionid;
    }

    public void setPolicydefinitionid(String policydefinitionid) {
        this.policydefinitionid = policydefinitionid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPolicyDefinitionRequest that = (ShowPolicyDefinitionRequest) obj;
        return Objects.equals(this.policydefinitionid, that.policydefinitionid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policydefinitionid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPolicyDefinitionRequest {\n");
        sb.append("    policydefinitionid: ").append(toIndentedString(policydefinitionid)).append("\n");
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
