package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowHotClodSeparationStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opened")

    private Boolean opened;

    public ShowHotClodSeparationStatusResponse withOpened(Boolean opened) {
        this.opened = opened;
        return this;
    }

    /**
     * 功能是否开启
     * @return opened
     */
    public Boolean getOpened() {
        return opened;
    }

    public void setOpened(Boolean opened) {
        this.opened = opened;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHotClodSeparationStatusResponse that = (ShowHotClodSeparationStatusResponse) obj;
        return Objects.equals(this.opened, that.opened);
    }

    @Override
    public int hashCode() {
        return Objects.hash(opened);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHotClodSeparationStatusResponse {\n");
        sb.append("    opened: ").append(toIndentedString(opened)).append("\n");
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
