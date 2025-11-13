package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EventDump
 */
public class EventDump {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filename")

    private String filename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obsname")

    private String obsname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenantid")

    private String tenantid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Long start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end")

    private Long end;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urltimestamp")

    private Long urltimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    public EventDump withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 文件来源
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public EventDump withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 文件状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public EventDump withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 事件描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventDump withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 文件id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EventDump withFilename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * 文件名
     * @return filename
     */
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public EventDump withObsname(String obsname) {
        this.obsname = obsname;
        return this;
    }

    /**
     * 文件obs名
     * @return obsname
     */
    public String getObsname() {
        return obsname;
    }

    public void setObsname(String obsname) {
        this.obsname = obsname;
    }

    public EventDump withTenantid(String tenantid) {
        this.tenantid = tenantid;
        return this;
    }

    /**
     * 租户id
     * @return tenantid
     */
    public String getTenantid() {
        return tenantid;
    }

    public void setTenantid(String tenantid) {
        this.tenantid = tenantid;
    }

    public EventDump withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * 统计开始时间
     * @return start
     */
    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public EventDump withEnd(Long end) {
        this.end = end;
        return this;
    }

    /**
     * 统计截止时间
     * @return end
     */
    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public EventDump withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总计事件数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public EventDump withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 链接
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public EventDump withUrltimestamp(Long urltimestamp) {
        this.urltimestamp = urltimestamp;
        return this;
    }

    /**
     * 更新url时间戳
     * @return urltimestamp
     */
    public Long getUrltimestamp() {
        return urltimestamp;
    }

    public void setUrltimestamp(Long urltimestamp) {
        this.urltimestamp = urltimestamp;
    }

    public EventDump withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 文件生成时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventDump that = (EventDump) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.state, that.state)
            && Objects.equals(this.description, that.description) && Objects.equals(this.id, that.id)
            && Objects.equals(this.filename, that.filename) && Objects.equals(this.obsname, that.obsname)
            && Objects.equals(this.tenantid, that.tenantid) && Objects.equals(this.start, that.start)
            && Objects.equals(this.end, that.end) && Objects.equals(this.total, that.total)
            && Objects.equals(this.url, that.url) && Objects.equals(this.urltimestamp, that.urltimestamp)
            && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source,
            state,
            description,
            id,
            filename,
            obsname,
            tenantid,
            start,
            end,
            total,
            url,
            urltimestamp,
            timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventDump {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    obsname: ").append(toIndentedString(obsname)).append("\n");
        sb.append("    tenantid: ").append(toIndentedString(tenantid)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    urltimestamp: ").append(toIndentedString(urltimestamp)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
