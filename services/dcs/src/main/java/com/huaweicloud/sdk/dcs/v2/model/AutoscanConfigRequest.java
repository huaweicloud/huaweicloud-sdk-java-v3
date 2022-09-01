package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置自动分析配置返回体
 */
public class AutoscanConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_auto_scan")

    @JacksonXmlProperty(localName = "enable_auto_scan")

    private Boolean enableAutoScan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_at")

    @JacksonXmlProperty(localName = "schedule_at")

    private List<String> scheduleAt = null;

    public AutoscanConfigRequest withEnableAutoScan(Boolean enableAutoScan) {
        this.enableAutoScan = enableAutoScan;
        return this;
    }

    /**
     * 是否开启自动分析
     * @return enableAutoScan
     */
    public Boolean getEnableAutoScan() {
        return enableAutoScan;
    }

    public void setEnableAutoScan(Boolean enableAutoScan) {
        this.enableAutoScan = enableAutoScan;
    }

    public AutoscanConfigRequest withScheduleAt(List<String> scheduleAt) {
        this.scheduleAt = scheduleAt;
        return this;
    }

    public AutoscanConfigRequest addScheduleAtItem(String scheduleAtItem) {
        if (this.scheduleAt == null) {
            this.scheduleAt = new ArrayList<>();
        }
        this.scheduleAt.add(scheduleAtItem);
        return this;
    }

    public AutoscanConfigRequest withScheduleAt(Consumer<List<String>> scheduleAtSetter) {
        if (this.scheduleAt == null) {
            this.scheduleAt = new ArrayList<>();
        }
        scheduleAtSetter.accept(this.scheduleAt);
        return this;
    }

    /**
     * 每日分析时间，时间格式为21:00，时间为UTC时间
     * @return scheduleAt
     */
    public List<String> getScheduleAt() {
        return scheduleAt;
    }

    public void setScheduleAt(List<String> scheduleAt) {
        this.scheduleAt = scheduleAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoscanConfigRequest autoscanConfigRequest = (AutoscanConfigRequest) o;
        return Objects.equals(this.enableAutoScan, autoscanConfigRequest.enableAutoScan)
            && Objects.equals(this.scheduleAt, autoscanConfigRequest.scheduleAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableAutoScan, scheduleAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoscanConfigRequest {\n");
        sb.append("    enableAutoScan: ").append(toIndentedString(enableAutoScan)).append("\n");
        sb.append("    scheduleAt: ").append(toIndentedString(scheduleAt)).append("\n");
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
