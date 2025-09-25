package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowStarRocksSlowlogSensitiveStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_slow_log_switch")

    private String openSlowLogSwitch;

    public ShowStarRocksSlowlogSensitiveStatusResponse withOpenSlowLogSwitch(String openSlowLogSwitch) {
        this.openSlowLogSwitch = openSlowLogSwitch;
        return this;
    }

    /**
     * **参数解释**:  慢日志开关状态。  **取值范围**：  - true，开启。 - false，关闭。
     * @return openSlowLogSwitch
     */
    public String getOpenSlowLogSwitch() {
        return openSlowLogSwitch;
    }

    public void setOpenSlowLogSwitch(String openSlowLogSwitch) {
        this.openSlowLogSwitch = openSlowLogSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStarRocksSlowlogSensitiveStatusResponse that = (ShowStarRocksSlowlogSensitiveStatusResponse) obj;
        return Objects.equals(this.openSlowLogSwitch, that.openSlowLogSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openSlowLogSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStarRocksSlowlogSensitiveStatusResponse {\n");
        sb.append("    openSlowLogSwitch: ").append(toIndentedString(openSlowLogSwitch)).append("\n");
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
