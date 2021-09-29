package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ShowServerAutoRecoveryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_auto_recovery")

    private String supportAutoRecovery;

    public ShowServerAutoRecoveryResponse withSupportAutoRecovery(String supportAutoRecovery) {
        this.supportAutoRecovery = supportAutoRecovery;
        return this;
    }

    /** 云服务器是否配置了自动恢复动作。 - true：表示配置了自动恢复。 - false：表示没有配置自动恢复。
     * 
     * @return supportAutoRecovery */
    public String getSupportAutoRecovery() {
        return supportAutoRecovery;
    }

    public void setSupportAutoRecovery(String supportAutoRecovery) {
        this.supportAutoRecovery = supportAutoRecovery;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowServerAutoRecoveryResponse showServerAutoRecoveryResponse = (ShowServerAutoRecoveryResponse) o;
        return Objects.equals(this.supportAutoRecovery, showServerAutoRecoveryResponse.supportAutoRecovery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportAutoRecovery);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerAutoRecoveryResponse {\n");
        sb.append("    supportAutoRecovery: ").append(toIndentedString(supportAutoRecovery)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
