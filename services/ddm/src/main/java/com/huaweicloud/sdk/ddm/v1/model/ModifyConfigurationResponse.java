package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ModifyConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_restart")

    private Boolean needRestart;

    public ModifyConfigurationResponse withNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
        return this;
    }

    /**
     * 是否需要重启。
     * @return needRestart
     */
    public Boolean getNeedRestart() {
        return needRestart;
    }

    public void setNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyConfigurationResponse that = (ModifyConfigurationResponse) obj;
        return Objects.equals(this.needRestart, that.needRestart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(needRestart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyConfigurationResponse {\n");
        sb.append("    needRestart: ").append(toIndentedString(needRestart)).append("\n");
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
