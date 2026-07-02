package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询任务存在性请求体
 */
public class CheckScheduleTaskExistRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_type")

    private String scheduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_id")

    private String proxyId;

    public CheckScheduleTaskExistRequestBody withScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }

    /**
     * **参数解释**： 定时任务类型。  **约束限制**： 不涉及。  **取值范围**：   - PROXY_VERSION_UPGRADE：表示升级数据库代理的内核小版本。   - VERSION_UPGRADE：表示升级实例的内核小版本。   - RESIZE_FLAVOR：表示实例规格变更。   - REBOOT_NODE：表示重启节点。   - REBOOT_INSTANCE：表示重启实例。  **默认取值**：   不涉及。
     * @return scheduleType
     */
    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public CheckScheduleTaskExistRequestBody withProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }

    /**
     * **参数解释**： 数据库代理ID。 获取方法请参见[查询数据库代理信息列表](https://support.huaweicloud.com/api-taurusdb/ShowGaussMySqlProxyList.html)。  **约束限制**： 不涉及。  **取值范围**： 不涉及。  **默认取值**： 不涉及。
     * @return proxyId
     */
    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckScheduleTaskExistRequestBody that = (CheckScheduleTaskExistRequestBody) obj;
        return Objects.equals(this.scheduleType, that.scheduleType) && Objects.equals(this.proxyId, that.proxyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleType, proxyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckScheduleTaskExistRequestBody {\n");
        sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
        sb.append("    proxyId: ").append(toIndentedString(proxyId)).append("\n");
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
