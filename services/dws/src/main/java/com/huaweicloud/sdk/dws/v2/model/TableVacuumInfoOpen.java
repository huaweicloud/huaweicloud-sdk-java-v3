package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TableVacuumInfoOpen
 */
public class TableVacuumInfoOpen {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_running_info")

    private List<TableInfoOpen> vacuumRunningInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_waiting_info")

    private List<TableInfoOpen> vacuumWaitingInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_finished_info")

    private List<TableInfoOpen> vacuumFinishedInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_canceled_info")

    private List<TableInfoOpen> vacuumCanceledInfo = null;

    public TableVacuumInfoOpen withVacuumRunningInfo(List<TableInfoOpen> vacuumRunningInfo) {
        this.vacuumRunningInfo = vacuumRunningInfo;
        return this;
    }

    public TableVacuumInfoOpen addVacuumRunningInfoItem(TableInfoOpen vacuumRunningInfoItem) {
        if (this.vacuumRunningInfo == null) {
            this.vacuumRunningInfo = new ArrayList<>();
        }
        this.vacuumRunningInfo.add(vacuumRunningInfoItem);
        return this;
    }

    public TableVacuumInfoOpen withVacuumRunningInfo(Consumer<List<TableInfoOpen>> vacuumRunningInfoSetter) {
        if (this.vacuumRunningInfo == null) {
            this.vacuumRunningInfo = new ArrayList<>();
        }
        vacuumRunningInfoSetter.accept(this.vacuumRunningInfo);
        return this;
    }

    /**
     * **参数解释**： 运行中的表信息。 **默认取值**： 不涉及
     * @return vacuumRunningInfo
     */
    public List<TableInfoOpen> getVacuumRunningInfo() {
        return vacuumRunningInfo;
    }

    public void setVacuumRunningInfo(List<TableInfoOpen> vacuumRunningInfo) {
        this.vacuumRunningInfo = vacuumRunningInfo;
    }

    public TableVacuumInfoOpen withVacuumWaitingInfo(List<TableInfoOpen> vacuumWaitingInfo) {
        this.vacuumWaitingInfo = vacuumWaitingInfo;
        return this;
    }

    public TableVacuumInfoOpen addVacuumWaitingInfoItem(TableInfoOpen vacuumWaitingInfoItem) {
        if (this.vacuumWaitingInfo == null) {
            this.vacuumWaitingInfo = new ArrayList<>();
        }
        this.vacuumWaitingInfo.add(vacuumWaitingInfoItem);
        return this;
    }

    public TableVacuumInfoOpen withVacuumWaitingInfo(Consumer<List<TableInfoOpen>> vacuumWaitingInfoSetter) {
        if (this.vacuumWaitingInfo == null) {
            this.vacuumWaitingInfo = new ArrayList<>();
        }
        vacuumWaitingInfoSetter.accept(this.vacuumWaitingInfo);
        return this;
    }

    /**
     * **参数解释**： 等待中的表信息。 **默认取值**： 不涉及
     * @return vacuumWaitingInfo
     */
    public List<TableInfoOpen> getVacuumWaitingInfo() {
        return vacuumWaitingInfo;
    }

    public void setVacuumWaitingInfo(List<TableInfoOpen> vacuumWaitingInfo) {
        this.vacuumWaitingInfo = vacuumWaitingInfo;
    }

    public TableVacuumInfoOpen withVacuumFinishedInfo(List<TableInfoOpen> vacuumFinishedInfo) {
        this.vacuumFinishedInfo = vacuumFinishedInfo;
        return this;
    }

    public TableVacuumInfoOpen addVacuumFinishedInfoItem(TableInfoOpen vacuumFinishedInfoItem) {
        if (this.vacuumFinishedInfo == null) {
            this.vacuumFinishedInfo = new ArrayList<>();
        }
        this.vacuumFinishedInfo.add(vacuumFinishedInfoItem);
        return this;
    }

    public TableVacuumInfoOpen withVacuumFinishedInfo(Consumer<List<TableInfoOpen>> vacuumFinishedInfoSetter) {
        if (this.vacuumFinishedInfo == null) {
            this.vacuumFinishedInfo = new ArrayList<>();
        }
        vacuumFinishedInfoSetter.accept(this.vacuumFinishedInfo);
        return this;
    }

    /**
     * **参数解释**： 已结束的表信息。 **默认取值**： 不涉及
     * @return vacuumFinishedInfo
     */
    public List<TableInfoOpen> getVacuumFinishedInfo() {
        return vacuumFinishedInfo;
    }

    public void setVacuumFinishedInfo(List<TableInfoOpen> vacuumFinishedInfo) {
        this.vacuumFinishedInfo = vacuumFinishedInfo;
    }

    public TableVacuumInfoOpen withVacuumCanceledInfo(List<TableInfoOpen> vacuumCanceledInfo) {
        this.vacuumCanceledInfo = vacuumCanceledInfo;
        return this;
    }

    public TableVacuumInfoOpen addVacuumCanceledInfoItem(TableInfoOpen vacuumCanceledInfoItem) {
        if (this.vacuumCanceledInfo == null) {
            this.vacuumCanceledInfo = new ArrayList<>();
        }
        this.vacuumCanceledInfo.add(vacuumCanceledInfoItem);
        return this;
    }

    public TableVacuumInfoOpen withVacuumCanceledInfo(Consumer<List<TableInfoOpen>> vacuumCanceledInfoSetter) {
        if (this.vacuumCanceledInfo == null) {
            this.vacuumCanceledInfo = new ArrayList<>();
        }
        vacuumCanceledInfoSetter.accept(this.vacuumCanceledInfo);
        return this;
    }

    /**
     * **参数解释**： 取消的表信息。 **默认取值**： 不涉及
     * @return vacuumCanceledInfo
     */
    public List<TableInfoOpen> getVacuumCanceledInfo() {
        return vacuumCanceledInfo;
    }

    public void setVacuumCanceledInfo(List<TableInfoOpen> vacuumCanceledInfo) {
        this.vacuumCanceledInfo = vacuumCanceledInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableVacuumInfoOpen that = (TableVacuumInfoOpen) obj;
        return Objects.equals(this.vacuumRunningInfo, that.vacuumRunningInfo)
            && Objects.equals(this.vacuumWaitingInfo, that.vacuumWaitingInfo)
            && Objects.equals(this.vacuumFinishedInfo, that.vacuumFinishedInfo)
            && Objects.equals(this.vacuumCanceledInfo, that.vacuumCanceledInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vacuumRunningInfo, vacuumWaitingInfo, vacuumFinishedInfo, vacuumCanceledInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableVacuumInfoOpen {\n");
        sb.append("    vacuumRunningInfo: ").append(toIndentedString(vacuumRunningInfo)).append("\n");
        sb.append("    vacuumWaitingInfo: ").append(toIndentedString(vacuumWaitingInfo)).append("\n");
        sb.append("    vacuumFinishedInfo: ").append(toIndentedString(vacuumFinishedInfo)).append("\n");
        sb.append("    vacuumCanceledInfo: ").append(toIndentedString(vacuumCanceledInfo)).append("\n");
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
