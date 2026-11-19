package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowProtectionStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_protected_server")

    private Integer countProtectedServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_need_protected_server")

    private Integer countNeedProtectedServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_protection_event")

    private Integer countProtectionEvent;

    public ShowProtectionStatisticsResponse withCountProtectedServer(Integer countProtectedServer) {
        this.countProtectedServer = countProtectedServer;
        return this;
    }

    /**
     * **参数解释**： 已防护服务器数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return countProtectedServer
     */
    public Integer getCountProtectedServer() {
        return countProtectedServer;
    }

    public void setCountProtectedServer(Integer countProtectedServer) {
        this.countProtectedServer = countProtectedServer;
    }

    public ShowProtectionStatisticsResponse withCountNeedProtectedServer(Integer countNeedProtectedServer) {
        this.countNeedProtectedServer = countNeedProtectedServer;
        return this;
    }

    /**
     * **参数解释**： 未防护服务器数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return countNeedProtectedServer
     */
    public Integer getCountNeedProtectedServer() {
        return countNeedProtectedServer;
    }

    public void setCountNeedProtectedServer(Integer countNeedProtectedServer) {
        this.countNeedProtectedServer = countNeedProtectedServer;
    }

    public ShowProtectionStatisticsResponse withCountProtectionEvent(Integer countProtectionEvent) {
        this.countProtectionEvent = countProtectionEvent;
        return this;
    }

    /**
     * **参数解释**： 防护事件 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return countProtectionEvent
     */
    public Integer getCountProtectionEvent() {
        return countProtectionEvent;
    }

    public void setCountProtectionEvent(Integer countProtectionEvent) {
        this.countProtectionEvent = countProtectionEvent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProtectionStatisticsResponse that = (ShowProtectionStatisticsResponse) obj;
        return Objects.equals(this.countProtectedServer, that.countProtectedServer)
            && Objects.equals(this.countNeedProtectedServer, that.countNeedProtectedServer)
            && Objects.equals(this.countProtectionEvent, that.countProtectionEvent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countProtectedServer, countNeedProtectedServer, countProtectionEvent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProtectionStatisticsResponse {\n");
        sb.append("    countProtectedServer: ").append(toIndentedString(countProtectedServer)).append("\n");
        sb.append("    countNeedProtectedServer: ").append(toIndentedString(countNeedProtectedServer)).append("\n");
        sb.append("    countProtectionEvent: ").append(toIndentedString(countProtectionEvent)).append("\n");
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
