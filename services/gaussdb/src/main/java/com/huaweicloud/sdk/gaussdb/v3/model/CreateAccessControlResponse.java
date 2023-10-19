package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateAccessControlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_access_control")

    private Boolean openAccessControl;

    public CreateAccessControlResponse withOpenAccessControl(Boolean openAccessControl) {
        this.openAccessControl = openAccessControl;
        return this;
    }

    /**
     * 是否已开启访问控制。 取值： - true：开启。 - false：关闭。
     * @return openAccessControl
     */
    public Boolean getOpenAccessControl() {
        return openAccessControl;
    }

    public void setOpenAccessControl(Boolean openAccessControl) {
        this.openAccessControl = openAccessControl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAccessControlResponse that = (CreateAccessControlResponse) obj;
        return Objects.equals(this.openAccessControl, that.openAccessControl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openAccessControl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccessControlResponse {\n");
        sb.append("    openAccessControl: ").append(toIndentedString(openAccessControl)).append("\n");
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
