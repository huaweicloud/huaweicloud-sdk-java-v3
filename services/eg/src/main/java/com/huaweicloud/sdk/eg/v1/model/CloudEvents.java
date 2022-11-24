package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CloudEvent事件格式定义，参考https://github.com/cloudevents/spec/blob/v1.0.1/spec.md
 */
public class CloudEvents {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specversion")

    private String specversion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datacontenttype")

    private String datacontenttype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataschema")

    private String dataschema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Object data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    public CloudEvents withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 事件唯一标识串，同一个事件来源里必须唯一
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CloudEvents withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 事件来源上下文标识串，source+id可以唯一确定一个事件。采用URI-Reference格式，参考https://tools.ietf.org/html/rfc3986#section-4.1
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CloudEvents withSpecversion(String specversion) {
        this.specversion = specversion;
        return this;
    }

    /**
     * CloudEvents协议版本，格式为major.minor
     * @return specversion
     */
    public String getSpecversion() {
        return specversion;
    }

    public void setSpecversion(String specversion) {
        this.specversion = specversion;
    }

    public CloudEvents withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 事件类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CloudEvents withDatacontenttype(String datacontenttype) {
        this.datacontenttype = datacontenttype;
        return this;
    }

    /**
     * 事件内容格式，采用MIME格式，遵循RFC2046，参考https://tools.ietf.org/html/rfc2046
     * @return datacontenttype
     */
    public String getDatacontenttype() {
        return datacontenttype;
    }

    public void setDatacontenttype(String datacontenttype) {
        this.datacontenttype = datacontenttype;
    }

    public CloudEvents withDataschema(String dataschema) {
        this.dataschema = dataschema;
        return this;
    }

    /**
     * 件内容模型定义的URI，遵循RFC3986，参考https://tools.ietf.org/html/rfc3986#section-4.3
     * @return dataschema
     */
    public String getDataschema() {
        return dataschema;
    }

    public void setDataschema(String dataschema) {
        this.dataschema = dataschema;
    }

    public CloudEvents withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * 事件的负载内容，采用datacontenttype字段指定的格式，内容字段遵循dataschema字段的描述
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public CloudEvents withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 事件发生UTC日期时间，相同来源的事件格式相同，遵循RFC3339，格式需满足2018-04-05T17:31:00Z，参考https://tools.ietf.org/html/rfc3339
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public CloudEvents withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 事件发生的主题或对象，用以标识哪个具体对象发生了当前事件
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloudEvents cloudEvents = (CloudEvents) o;
        return Objects.equals(this.id, cloudEvents.id) && Objects.equals(this.source, cloudEvents.source)
            && Objects.equals(this.specversion, cloudEvents.specversion) && Objects.equals(this.type, cloudEvents.type)
            && Objects.equals(this.datacontenttype, cloudEvents.datacontenttype)
            && Objects.equals(this.dataschema, cloudEvents.dataschema) && Objects.equals(this.data, cloudEvents.data)
            && Objects.equals(this.time, cloudEvents.time) && Objects.equals(this.subject, cloudEvents.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, source, specversion, type, datacontenttype, dataschema, data, time, subject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudEvents {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    specversion: ").append(toIndentedString(specversion)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    datacontenttype: ").append(toIndentedString(datacontenttype)).append("\n");
        sb.append("    dataschema: ").append(toIndentedString(dataschema)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
