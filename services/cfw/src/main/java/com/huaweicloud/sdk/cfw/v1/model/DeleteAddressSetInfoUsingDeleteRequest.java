package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAddressSetInfoUsingDeleteRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_id")

    private String setId;

    public DeleteAddressSetInfoUsingDeleteRequest withSetId(String setId) {
        this.setId = setId;
        return this;
    }

    /**
     * 地址组id
     * @return setId
     */
    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAddressSetInfoUsingDeleteRequest deleteAddressSetInfoUsingDeleteRequest =
            (DeleteAddressSetInfoUsingDeleteRequest) o;
        return Objects.equals(this.setId, deleteAddressSetInfoUsingDeleteRequest.setId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAddressSetInfoUsingDeleteRequest {\n");
        sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
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
