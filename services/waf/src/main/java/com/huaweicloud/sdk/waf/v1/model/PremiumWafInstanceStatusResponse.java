package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PremiumWafInstanceStatusResponse
 */
public class PremiumWafInstanceStatusResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_status")

    private Integer runStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private Integer accessStatus;

    public PremiumWafInstanceStatusResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PremiumWafInstanceStatusResponse withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public PremiumWafInstanceStatusResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 实例计费状态 **约束限制：** 不涉及 **取值范围：** - -1 退订 - 0 正常 - 1 冻结 - 2 终止 - 3 受限 **默认取值：** 不涉及
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public PremiumWafInstanceStatusResponse withRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    /**
     * **参数解释：** 实例运行状态 **约束限制：** 不涉及 **取值范围：** - 0 创建中 - 1 运行中 - 2 删除中 - 3 已删除 - 4 创建失败 - 5 已冻结 - 6 异常 - 7 更新中 - 8 更新失败 **默认取值：** 不涉及
     * minimum: 0
     * maximum: 8
     * @return runStatus
     */
    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public PremiumWafInstanceStatusResponse withAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /**
     * **参数解释：** 实例接入状态 **约束限制：** 不涉及 **取值范围：** - 0 未接入 - 1 已接入 - 2 DNS解析异常 **默认取值：** 不涉及
     * minimum: 0
     * maximum: 2
     * @return accessStatus
     */
    public Integer getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PremiumWafInstanceStatusResponse that = (PremiumWafInstanceStatusResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.runStatus, that.runStatus)
            && Objects.equals(this.accessStatus, that.accessStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, instanceName, status, runStatus, accessStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PremiumWafInstanceStatusResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
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
