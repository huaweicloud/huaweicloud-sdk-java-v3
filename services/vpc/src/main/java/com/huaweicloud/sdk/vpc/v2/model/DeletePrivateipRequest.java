package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class DeletePrivateipRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="privateip_id")
    
    private String privateipId;

    public DeletePrivateipRequest withPrivateipId(String privateipId) {
        this.privateipId = privateipId;
        return this;
    }

    


    /**
     * Get privateipId
     * @return privateipId
     */
    public String getPrivateipId() {
        return privateipId;
    }

    public void setPrivateipId(String privateipId) {
        this.privateipId = privateipId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeletePrivateipRequest deletePrivateipRequest = (DeletePrivateipRequest) o;
        return Objects.equals(this.privateipId, deletePrivateipRequest.privateipId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(privateipId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePrivateipRequest {\n");
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

