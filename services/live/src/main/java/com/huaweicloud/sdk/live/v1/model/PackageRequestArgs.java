package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PackageRequestArgs
 */
public class PackageRequestArgs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record")

    private List<RecordRequestArgs> record = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeshift")

    private List<TimeshiftRequestArgs> timeshift = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live")

    private List<LiveRequestArgs> live = null;

    public PackageRequestArgs withRecord(List<RecordRequestArgs> record) {
        this.record = record;
        return this;
    }

    public PackageRequestArgs addRecordItem(RecordRequestArgs recordItem) {
        if (this.record == null) {
            this.record = new ArrayList<>();
        }
        this.record.add(recordItem);
        return this;
    }

    public PackageRequestArgs withRecord(Consumer<List<RecordRequestArgs>> recordSetter) {
        if (this.record == null) {
            this.record = new ArrayList<>();
        }
        recordSetter.accept(this.record);
        return this;
    }

    /**
     * 录制播放相关配置
     * @return record
     */
    public List<RecordRequestArgs> getRecord() {
        return record;
    }

    public void setRecord(List<RecordRequestArgs> record) {
        this.record = record;
    }

    public PackageRequestArgs withTimeshift(List<TimeshiftRequestArgs> timeshift) {
        this.timeshift = timeshift;
        return this;
    }

    public PackageRequestArgs addTimeshiftItem(TimeshiftRequestArgs timeshiftItem) {
        if (this.timeshift == null) {
            this.timeshift = new ArrayList<>();
        }
        this.timeshift.add(timeshiftItem);
        return this;
    }

    public PackageRequestArgs withTimeshift(Consumer<List<TimeshiftRequestArgs>> timeshiftSetter) {
        if (this.timeshift == null) {
            this.timeshift = new ArrayList<>();
        }
        timeshiftSetter.accept(this.timeshift);
        return this;
    }

    /**
     * 时移播放相关配置
     * @return timeshift
     */
    public List<TimeshiftRequestArgs> getTimeshift() {
        return timeshift;
    }

    public void setTimeshift(List<TimeshiftRequestArgs> timeshift) {
        this.timeshift = timeshift;
    }

    public PackageRequestArgs withLive(List<LiveRequestArgs> live) {
        this.live = live;
        return this;
    }

    public PackageRequestArgs addLiveItem(LiveRequestArgs liveItem) {
        if (this.live == null) {
            this.live = new ArrayList<>();
        }
        this.live.add(liveItem);
        return this;
    }

    public PackageRequestArgs withLive(Consumer<List<LiveRequestArgs>> liveSetter) {
        if (this.live == null) {
            this.live = new ArrayList<>();
        }
        liveSetter.accept(this.live);
        return this;
    }

    /**
     * 直播播放相关配置
     * @return live
     */
    public List<LiveRequestArgs> getLive() {
        return live;
    }

    public void setLive(List<LiveRequestArgs> live) {
        this.live = live;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PackageRequestArgs that = (PackageRequestArgs) obj;
        return Objects.equals(this.record, that.record) && Objects.equals(this.timeshift, that.timeshift)
            && Objects.equals(this.live, that.live);
    }

    @Override
    public int hashCode() {
        return Objects.hash(record, timeshift, live);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageRequestArgs {\n");
        sb.append("    record: ").append(toIndentedString(record)).append("\n");
        sb.append("    timeshift: ").append(toIndentedString(timeshift)).append("\n");
        sb.append("    live: ").append(toIndentedString(live)).append("\n");
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
