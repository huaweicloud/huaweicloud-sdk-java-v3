package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SetBucketDisPolicyRequestBodyRules
 */
@JacksonXmlRootElement(localName = "SetBucketDisPolicyRequestBodyRules")
public class SetBucketDisPolicyRequestBodyRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    @JacksonXmlProperty(localName = "stream")

    private String stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    @JacksonXmlProperty(localName = "project")

    private String project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    @JacksonXmlProperty(localName = "events")
    private List<String> events = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    @JacksonXmlProperty(localName = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suffix")

    @JacksonXmlProperty(localName = "suffix")

    private String suffix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    @JacksonXmlProperty(localName = "agency")

    private String agency;

    public SetBucketDisPolicyRequestBodyRules withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则ID。当前桶上配置的DIS策略规则的唯一标识。 类型：String 取值范围：[1, 256]，满足“^[a-zA-Z0-9_-]{1, 256}$”
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SetBucketDisPolicyRequestBodyRules withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * DIS服务通道名称。需要先在DIS服务创建此通道。 类型：String
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public SetBucketDisPolicyRequestBodyRules withProject(String project) {
        this.project = project;
        return this;
    }

    /**
     * DIS服务通道所属的项目ID。 类型：String
     * @return project
     */
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public SetBucketDisPolicyRequestBodyRules withEvents(List<String> events) {
        this.events = events;
        return this;
    }

    public SetBucketDisPolicyRequestBodyRules addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public SetBucketDisPolicyRequestBodyRules withEvents(Consumer<List<String>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * OBS事件列表。 有效值：长度[0, 1023]，值允许为任意字符，支持如下事件类型：ObjectCreated:* （所有上传操作）ObjectCreated:Put （上传对象）ObjectCreated:Post （使用浏览器上传对象）ObjectCreated:Copy （拷贝对象）ObjectCreated:CompleteMultipartUpload （合并段）ObjectRemoved:* （所有删除操作）ObjectRemoved:Delete （指定对象版本号删除对象）ObjectRemoved:DeleteMarkerCreated （不指定对象版本号删除对象）
     * @return events
     */
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public SetBucketDisPolicyRequestBodyRules withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 对象名前缀，用于指定的对象名关键字，根据定义的前缀，输入需要过滤的对象的关键字信息，字符越长匹配精度越高，最大可支持1024个字符，最小可为空。同时，prefix和suffix加起来长度最大为1024个字符。 类型：String 取值范围：[0, 1024]
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public SetBucketDisPolicyRequestBodyRules withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * 对象名后缀。用于指定的对象名关键字，根据定义的后缀，输入需要过滤的对象的关键字信息，字符越长匹配精度越高，最大可支持1024个字符，最小可为空。同时，prefix和suffix加起来长度最大为1024个字符。 类型：String 取值范围：[0, 1024]
     * @return suffix
     */
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public SetBucketDisPolicyRequestBodyRules withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * IAM委托名，被委托方必须包含OBS服务，赋予的权限必须是DIS服务的DIS Administrator或DIS User。 类型：String
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetBucketDisPolicyRequestBodyRules that = (SetBucketDisPolicyRequestBodyRules) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.stream, that.stream)
            && Objects.equals(this.project, that.project) && Objects.equals(this.events, that.events)
            && Objects.equals(this.prefix, that.prefix) && Objects.equals(this.suffix, that.suffix)
            && Objects.equals(this.agency, that.agency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stream, project, events, prefix, suffix, agency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBucketDisPolicyRequestBodyRules {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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
