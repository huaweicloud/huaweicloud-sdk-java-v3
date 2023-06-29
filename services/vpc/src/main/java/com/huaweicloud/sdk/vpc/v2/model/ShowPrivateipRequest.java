package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPrivateipRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privateip_id")

    private String privateipId;

    public ShowPrivateipRequest withPrivateipId(String privateipId) {
        this.privateipId = privateipId;
        return this;
    }

    /**
     * 私有IP ID
     * @return privateipId
     */
    public String getPrivateipId() {
        return privateipId;
    }

    public void setPrivateipId(String privateipId) {
        this.privateipId = privateipId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPrivateipRequest that = (ShowPrivateipRequest) obj;
        return Objects.equals(this.privateipId, that.privateipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateipId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPrivateipRequest {\n");
        sb.append("    privateipId: ").append(toIndentedString(privateipId)).append("\n");
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
