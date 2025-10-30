package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ds状态
 */
public class DaemonsetYamlResponseInfoDsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desired_num")

    private Integer desiredNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_num")

    private Integer currentNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ready_num")

    private Integer readyNum;

    public DaemonsetYamlResponseInfoDsInfo withDesiredNum(Integer desiredNum) {
        this.desiredNum = desiredNum;
        return this;
    }

    /**
     * 目标数量
     * minimum: 0
     * maximum: 65535
     * @return desiredNum
     */
    public Integer getDesiredNum() {
        return desiredNum;
    }

    public void setDesiredNum(Integer desiredNum) {
        this.desiredNum = desiredNum;
    }

    public DaemonsetYamlResponseInfoDsInfo withCurrentNum(Integer currentNum) {
        this.currentNum = currentNum;
        return this;
    }

    /**
     * 当前数量
     * minimum: 0
     * maximum: 65535
     * @return currentNum
     */
    public Integer getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Integer currentNum) {
        this.currentNum = currentNum;
    }

    public DaemonsetYamlResponseInfoDsInfo withReadyNum(Integer readyNum) {
        this.readyNum = readyNum;
        return this;
    }

    /**
     * 就绪数量
     * minimum: 0
     * maximum: 65535
     * @return readyNum
     */
    public Integer getReadyNum() {
        return readyNum;
    }

    public void setReadyNum(Integer readyNum) {
        this.readyNum = readyNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DaemonsetYamlResponseInfoDsInfo that = (DaemonsetYamlResponseInfoDsInfo) obj;
        return Objects.equals(this.desiredNum, that.desiredNum) && Objects.equals(this.currentNum, that.currentNum)
            && Objects.equals(this.readyNum, that.readyNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desiredNum, currentNum, readyNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DaemonsetYamlResponseInfoDsInfo {\n");
        sb.append("    desiredNum: ").append(toIndentedString(desiredNum)).append("\n");
        sb.append("    currentNum: ").append(toIndentedString(currentNum)).append("\n");
        sb.append("    readyNum: ").append(toIndentedString(readyNum)).append("\n");
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
