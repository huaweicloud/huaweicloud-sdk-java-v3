package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RunQueueActionReq
 */
public class RunQueueActionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force")

    private Boolean force;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_count")

    private Integer cuCount;

    public RunQueueActionReq withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 执行动作：restart：重启scale_out：扩容scale_in：缩容，目前只支持restart、scale_out、scale_in。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public RunQueueActionReq withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * 是否强制重启，action为restart时可选择配置，默认为false。
     * @return force
     */
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    public RunQueueActionReq withCuCount(Integer cuCount) {
        this.cuCount = cuCount;
        return this;
    }

    /**
     * 队列的实际CU。
     * @return cuCount
     */
    public Integer getCuCount() {
        return cuCount;
    }

    public void setCuCount(Integer cuCount) {
        this.cuCount = cuCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunQueueActionReq that = (RunQueueActionReq) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.force, that.force)
            && Objects.equals(this.cuCount, that.cuCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, force, cuCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunQueueActionReq {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
        sb.append("    cuCount: ").append(toIndentedString(cuCount)).append("\n");
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
