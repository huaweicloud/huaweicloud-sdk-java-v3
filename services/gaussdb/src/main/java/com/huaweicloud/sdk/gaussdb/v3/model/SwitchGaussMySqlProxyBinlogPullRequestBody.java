package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SwitchGaussMySqlProxyBinlogPullRequestBody
 */
public class SwitchGaussMySqlProxyBinlogPullRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_binlog_pull")

    private Boolean supportBinlogPull;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binlog_route_master")

    private Boolean binlogRouteMaster;

    public SwitchGaussMySqlProxyBinlogPullRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：  数据库代理模式。  **约束限制**：  不涉及。  **取值范围**： - readwrite：读写模式。 - readonly：TP只读模式。  **默认取值**：  不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SwitchGaussMySqlProxyBinlogPullRequestBody withSupportBinlogPull(Boolean supportBinlogPull) {
        this.supportBinlogPull = supportBinlogPull;
        return this;
    }

    /**
     * **参数解释**：  数据库代理拉取Binlog开关。  **约束限制**：  不涉及。  **取值范围**： - true：开启。 - false：关闭。  **默认取值**：  不涉及。
     * @return supportBinlogPull
     */
    public Boolean getSupportBinlogPull() {
        return supportBinlogPull;
    }

    public void setSupportBinlogPull(Boolean supportBinlogPull) {
        this.supportBinlogPull = supportBinlogPull;
    }

    public SwitchGaussMySqlProxyBinlogPullRequestBody withBinlogRouteMaster(Boolean binlogRouteMaster) {
        this.binlogRouteMaster = binlogRouteMaster;
        return this;
    }

    /**
     * **参数解释**： 数据库代理是否从数据库主节点拉取Binlog。  **约束限制**：  - 读写代理可以设置从数据库主节点或者只读节点拉取Binlog，TP只读代理只支持从只读节点拉取Binlog。 - binlog_route_master参数仅在support_binlog_pull为true时生效。  **取值范围**： - true：从主节点拉取。 - false：从只读节点拉取。  **默认取值**：  false。
     * @return binlogRouteMaster
     */
    public Boolean getBinlogRouteMaster() {
        return binlogRouteMaster;
    }

    public void setBinlogRouteMaster(Boolean binlogRouteMaster) {
        this.binlogRouteMaster = binlogRouteMaster;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchGaussMySqlProxyBinlogPullRequestBody that = (SwitchGaussMySqlProxyBinlogPullRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.supportBinlogPull, that.supportBinlogPull)
            && Objects.equals(this.binlogRouteMaster, that.binlogRouteMaster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, supportBinlogPull, binlogRouteMaster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchGaussMySqlProxyBinlogPullRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    supportBinlogPull: ").append(toIndentedString(supportBinlogPull)).append("\n");
        sb.append("    binlogRouteMaster: ").append(toIndentedString(binlogRouteMaster)).append("\n");
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
