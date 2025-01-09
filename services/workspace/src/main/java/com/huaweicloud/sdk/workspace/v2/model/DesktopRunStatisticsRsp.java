package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 桌面运行状态。
 */
public class DesktopRunStatisticsRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_num")

    private Integer stopNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_num")

    private Integer activeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_num")

    private Integer errorNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hibernated_num")

    private Integer hibernatedNum;

    public DesktopRunStatisticsRsp withStopNum(Integer stopNum) {
        this.stopNum = stopNum;
        return this;
    }

    /**
     * 停止个数。
     * minimum: 0
     * maximum: 2147483647
     * @return stopNum
     */
    public Integer getStopNum() {
        return stopNum;
    }

    public void setStopNum(Integer stopNum) {
        this.stopNum = stopNum;
    }

    public DesktopRunStatisticsRsp withActiveNum(Integer activeNum) {
        this.activeNum = activeNum;
        return this;
    }

    /**
     * 运行中个数。
     * minimum: 0
     * maximum: 2147483647
     * @return activeNum
     */
    public Integer getActiveNum() {
        return activeNum;
    }

    public void setActiveNum(Integer activeNum) {
        this.activeNum = activeNum;
    }

    public DesktopRunStatisticsRsp withErrorNum(Integer errorNum) {
        this.errorNum = errorNum;
        return this;
    }

    /**
     * 故障个数。
     * minimum: 0
     * maximum: 2147483647
     * @return errorNum
     */
    public Integer getErrorNum() {
        return errorNum;
    }

    public void setErrorNum(Integer errorNum) {
        this.errorNum = errorNum;
    }

    public DesktopRunStatisticsRsp withHibernatedNum(Integer hibernatedNum) {
        this.hibernatedNum = hibernatedNum;
        return this;
    }

    /**
     * 休眠个数。
     * minimum: 0
     * maximum: 2147483647
     * @return hibernatedNum
     */
    public Integer getHibernatedNum() {
        return hibernatedNum;
    }

    public void setHibernatedNum(Integer hibernatedNum) {
        this.hibernatedNum = hibernatedNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopRunStatisticsRsp that = (DesktopRunStatisticsRsp) obj;
        return Objects.equals(this.stopNum, that.stopNum) && Objects.equals(this.activeNum, that.activeNum)
            && Objects.equals(this.errorNum, that.errorNum) && Objects.equals(this.hibernatedNum, that.hibernatedNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stopNum, activeNum, errorNum, hibernatedNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopRunStatisticsRsp {\n");
        sb.append("    stopNum: ").append(toIndentedString(stopNum)).append("\n");
        sb.append("    activeNum: ").append(toIndentedString(activeNum)).append("\n");
        sb.append("    errorNum: ").append(toIndentedString(errorNum)).append("\n");
        sb.append("    hibernatedNum: ").append(toIndentedString(hibernatedNum)).append("\n");
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
