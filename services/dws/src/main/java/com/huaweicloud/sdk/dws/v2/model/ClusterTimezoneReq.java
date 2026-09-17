package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 修改集群时区请求参数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class ClusterTimezoneReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_timezone")

    private String clusterTimezone;

    public ClusterTimezoneReq withClusterTimezone(String clusterTimezone) {
        this.clusterTimezone = clusterTimezone;
        return this;
    }

    /**
     * **参数解释**： 时区。示例值：UTC。 **约束限制**： 不涉及。 **取值范围**： ^(Etc/GMT\\+11|US/Hawaii|Etc/GMT\\+9|US/Alaska|US/Pacific|Etc/GMT\\+8|Canada/Mountain|US/Arizona|Canada/Saskatchewan|Etc/GMT\\+6|US/Central|EST|America/Bogota|Etc/GMT\\+5|Canada/Atlantic|America/Cuiaba|America/Buenos_Aires|Etc/GMT\\+3|Canada/Newfoundland|America/Santiago|Etc/GMT\\+2|Atlantic/Cape_Verde|Europe/London|Africa/Monrovia|UTC|Europe/Belgrade|CET|MET|Europe/Amsterdam|EET|Europe/Athens|Asia/Amman|Asia/Beirut|Europe/Minsk|Africa/Nairobi|Europe/Moscow|Etc/GMT-4|Asia/Tbilisi|Asia/Kabul|Etc/GMT-5|Asia/Calcutta|Etc/GMT-6|Etc/GMT-7|PRC|Asia/Shanghai|Etc/GMT-8|Australia/Perth|Asia/Seoul|Asia/Tokyo|Australia/Darwin|Australia/Adelaide|Australia/Sydney|Australia/Brisbane|Etc/GMT-11|Pacific/Auckland|Etc/GMT-12)$ **默认取值**： 不涉及。
     * @return clusterTimezone
     */
    public String getClusterTimezone() {
        return clusterTimezone;
    }

    public void setClusterTimezone(String clusterTimezone) {
        this.clusterTimezone = clusterTimezone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterTimezoneReq that = (ClusterTimezoneReq) obj;
        return Objects.equals(this.clusterTimezone, that.clusterTimezone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterTimezone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterTimezoneReq {\n");
        sb.append("    clusterTimezone: ").append(toIndentedString(clusterTimezone)).append("\n");
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
