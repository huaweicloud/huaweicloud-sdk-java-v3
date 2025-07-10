package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDesktopsStatisticsResponse extends SdkResponse {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_statistics")

    private List<DesktopPoolStatistics> desktopPoolStatistics = null;

    public ListDesktopsStatisticsResponse withTotalNum(Integer totalNum) {
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

    public ListDesktopsStatisticsResponse withAttachStatistics(AttachStatistics attachStatistics) {
        this.attachStatistics = attachStatistics;
        return this;
    }

    public ListDesktopsStatisticsResponse withAttachStatistics(Consumer<AttachStatistics> attachStatisticsSetter) {
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

    public ListDesktopsStatisticsResponse withRunStateStatistics(DesktopRunStatisticsRsp runStateStatistics) {
        this.runStateStatistics = runStateStatistics;
        return this;
    }

    public ListDesktopsStatisticsResponse withRunStateStatistics(
        Consumer<DesktopRunStatisticsRsp> runStateStatisticsSetter) {
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

    public ListDesktopsStatisticsResponse withLoginStateStatistics(DesktopLoginStatisticsRsp loginStateStatistics) {
        this.loginStateStatistics = loginStateStatistics;
        return this;
    }

    public ListDesktopsStatisticsResponse withLoginStateStatistics(
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

    public ListDesktopsStatisticsResponse withDesktopPoolStatistics(List<DesktopPoolStatistics> desktopPoolStatistics) {
        this.desktopPoolStatistics = desktopPoolStatistics;
        return this;
    }

    public ListDesktopsStatisticsResponse addDesktopPoolStatisticsItem(
        DesktopPoolStatistics desktopPoolStatisticsItem) {
        if (this.desktopPoolStatistics == null) {
            this.desktopPoolStatistics = new ArrayList<>();
        }
        this.desktopPoolStatistics.add(desktopPoolStatisticsItem);
        return this;
    }

    public ListDesktopsStatisticsResponse withDesktopPoolStatistics(
        Consumer<List<DesktopPoolStatistics>> desktopPoolStatisticsSetter) {
        if (this.desktopPoolStatistics == null) {
            this.desktopPoolStatistics = new ArrayList<>();
        }
        desktopPoolStatisticsSetter.accept(this.desktopPoolStatistics);
        return this;
    }

    /**
     * 每个桌面池的情况统计，当desktop_type指定为POOL时返回。
     * @return desktopPoolStatistics
     */
    public List<DesktopPoolStatistics> getDesktopPoolStatistics() {
        return desktopPoolStatistics;
    }

    public void setDesktopPoolStatistics(List<DesktopPoolStatistics> desktopPoolStatistics) {
        this.desktopPoolStatistics = desktopPoolStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDesktopsStatisticsResponse that = (ListDesktopsStatisticsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum)
            && Objects.equals(this.attachStatistics, that.attachStatistics)
            && Objects.equals(this.runStateStatistics, that.runStateStatistics)
            && Objects.equals(this.loginStateStatistics, that.loginStateStatistics)
            && Objects.equals(this.desktopPoolStatistics, that.desktopPoolStatistics);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(totalNum, attachStatistics, runStateStatistics, loginStateStatistics, desktopPoolStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopsStatisticsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    attachStatistics: ").append(toIndentedString(attachStatistics)).append("\n");
        sb.append("    runStateStatistics: ").append(toIndentedString(runStateStatistics)).append("\n");
        sb.append("    loginStateStatistics: ").append(toIndentedString(loginStateStatistics)).append("\n");
        sb.append("    desktopPoolStatistics: ").append(toIndentedString(desktopPoolStatistics)).append("\n");
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
