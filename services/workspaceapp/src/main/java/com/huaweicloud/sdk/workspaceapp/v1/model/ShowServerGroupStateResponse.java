package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowServerGroupStateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aps_status")

    private Map<String, Integer> apsStatus = null;

    public ShowServerGroupStateResponse withApsStatus(Map<String, Integer> apsStatus) {
        this.apsStatus = apsStatus;
        return this;
    }

    public ShowServerGroupStateResponse putApsStatusItem(String key, Integer apsStatusItem) {
        if (this.apsStatus == null) {
            this.apsStatus = new HashMap<>();
        }
        this.apsStatus.put(key, apsStatusItem);
        return this;
    }

    public ShowServerGroupStateResponse withApsStatus(Consumer<Map<String, Integer>> apsStatusSetter) {
        if (this.apsStatus == null) {
            this.apsStatus = new HashMap<>();
        }
        apsStatusSetter.accept(this.apsStatus);
        return this;
    }

    /**
     * 对应状态的服务器数量，参考ServerStatus。
     * @return apsStatus
     */
    public Map<String, Integer> getApsStatus() {
        return apsStatus;
    }

    public void setApsStatus(Map<String, Integer> apsStatus) {
        this.apsStatus = apsStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerGroupStateResponse that = (ShowServerGroupStateResponse) obj;
        return Objects.equals(this.apsStatus, that.apsStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apsStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerGroupStateResponse {\n");
        sb.append("    apsStatus: ").append(toIndentedString(apsStatus)).append("\n");
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
