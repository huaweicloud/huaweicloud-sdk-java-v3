package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 桌面池状态统计。
 */
public class DesktopPoolStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_id")

    private String desktopPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_name")

    private String desktopPoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_statistics")

    private AttachStatistics attachStatistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_state_statistics")

    private DesktopRunStatisticsRsp runStateStatistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_state_statistics")

    private DesktopLoginStatisticsRsp loginStateStatistics;

    public DesktopPoolStatistics withDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
        return this;
    }

    /**
     * 桌面池id。
     * @return desktopPoolId
     */
    public String getDesktopPoolId() {
        return desktopPoolId;
    }

    public void setDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
    }

    public DesktopPoolStatistics withDesktopPoolName(String desktopPoolName) {
        this.desktopPoolName = desktopPoolName;
        return this;
    }

    /**
     * 桌面池名称。
     * @return desktopPoolName
     */
    public String getDesktopPoolName() {
        return desktopPoolName;
    }

    public void setDesktopPoolName(String desktopPoolName) {
        this.desktopPoolName = desktopPoolName;
    }

    public DesktopPoolStatistics withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 桌面总数。
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public DesktopPoolStatistics withAttachStatistics(AttachStatistics attachStatistics) {
        this.attachStatistics = attachStatistics;
        return this;
    }

    public DesktopPoolStatistics withAttachStatistics(Consumer<AttachStatistics> attachStatisticsSetter) {
        if (this.attachStatistics == null) {
            this.attachStatistics = new AttachStatistics();
            attachStatisticsSetter.accept(this.attachStatistics);
        }

        return this;
    }

    /**
     * Get attachStatistics
     * @return attachStatistics
     */
    public AttachStatistics getAttachStatistics() {
        return attachStatistics;
    }

    public void setAttachStatistics(AttachStatistics attachStatistics) {
        this.attachStatistics = attachStatistics;
    }

    public DesktopPoolStatistics withRunStateStatistics(DesktopRunStatisticsRsp runStateStatistics) {
        this.runStateStatistics = runStateStatistics;
        return this;
    }

    public DesktopPoolStatistics withRunStateStatistics(Consumer<DesktopRunStatisticsRsp> runStateStatisticsSetter) {
        if (this.runStateStatistics == null) {
            this.runStateStatistics = new DesktopRunStatisticsRsp();
            runStateStatisticsSetter.accept(this.runStateStatistics);
        }

        return this;
    }

    /**
     * Get runStateStatistics
     * @return runStateStatistics
     */
    public DesktopRunStatisticsRsp getRunStateStatistics() {
        return runStateStatistics;
    }

    public void setRunStateStatistics(DesktopRunStatisticsRsp runStateStatistics) {
        this.runStateStatistics = runStateStatistics;
    }

    public DesktopPoolStatistics withLoginStateStatistics(DesktopLoginStatisticsRsp loginStateStatistics) {
        this.loginStateStatistics = loginStateStatistics;
        return this;
    }

    public DesktopPoolStatistics withLoginStateStatistics(
        Consumer<DesktopLoginStatisticsRsp> loginStateStatisticsSetter) {
        if (this.loginStateStatistics == null) {
            this.loginStateStatistics = new DesktopLoginStatisticsRsp();
            loginStateStatisticsSetter.accept(this.loginStateStatistics);
        }

        return this;
    }

    /**
     * Get loginStateStatistics
     * @return loginStateStatistics
     */
    public DesktopLoginStatisticsRsp getLoginStateStatistics() {
        return loginStateStatistics;
    }

    public void setLoginStateStatistics(DesktopLoginStatisticsRsp loginStateStatistics) {
        this.loginStateStatistics = loginStateStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopPoolStatistics that = (DesktopPoolStatistics) obj;
        return Objects.equals(this.desktopPoolId, that.desktopPoolId)
            && Objects.equals(this.desktopPoolName, that.desktopPoolName)
            && Objects.equals(this.totalNum, that.totalNum)
            && Objects.equals(this.attachStatistics, that.attachStatistics)
            && Objects.equals(this.runStateStatistics, that.runStateStatistics)
            && Objects.equals(this.loginStateStatistics, that.loginStateStatistics);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(desktopPoolId, desktopPoolName, totalNum, attachStatistics, runStateStatistics, loginStateStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopPoolStatistics {\n");
        sb.append("    desktopPoolId: ").append(toIndentedString(desktopPoolId)).append("\n");
        sb.append("    desktopPoolName: ").append(toIndentedString(desktopPoolName)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    attachStatistics: ").append(toIndentedString(attachStatistics)).append("\n");
        sb.append("    runStateStatistics: ").append(toIndentedString(runStateStatistics)).append("\n");
        sb.append("    loginStateStatistics: ").append(toIndentedString(loginStateStatistics)).append("\n");
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
