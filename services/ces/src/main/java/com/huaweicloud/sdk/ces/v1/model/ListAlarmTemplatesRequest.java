package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAlarmTemplatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarmTemplateId")

    @JacksonXmlProperty(localName = "alarmTemplateId")

    private String alarmTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    @JacksonXmlProperty(localName = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dname")

    @JacksonXmlProperty(localName = "dname")

    private String dname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    @JacksonXmlProperty(localName = "start")

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private String limit;

    public ListAlarmTemplatesRequest withAlarmTemplateId(String alarmTemplateId) {
        this.alarmTemplateId = alarmTemplateId;
        return this;
    }

    /**
     * 自定义告警模的ID，如：at1603330892378wkDm77y6B。
     * @return alarmTemplateId
     */
    public String getAlarmTemplateId() {
        return alarmTemplateId;
    }

    public void setAlarmTemplateId(String alarmTemplateId) {
        this.alarmTemplateId = alarmTemplateId;
    }

    public ListAlarmTemplatesRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 自定义告警模板选择的资源类型。即命名空间，如弹性云服务器的资源命名空间为：SYS.ECS；各服务命名空间可查看：“[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListAlarmTemplatesRequest withDname(String dname) {
        this.dname = dname;
        return this;
    }

    /**
     * 自定义告警模板选择的资源维度，如：弹性云服务器，则维度为instance_id，各资源的指标维度名称可查看：“[服务指标维度](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return dname
     */
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public ListAlarmTemplatesRequest withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * 分页起始值，类型为integer，默认值为0。
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public ListAlarmTemplatesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次查询的条数限制，取值范围(0,100]，默认值为100， 用于限制结果数据条数。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlarmTemplatesRequest listAlarmTemplatesRequest = (ListAlarmTemplatesRequest) o;
        return Objects.equals(this.alarmTemplateId, listAlarmTemplatesRequest.alarmTemplateId)
            && Objects.equals(this.namespace, listAlarmTemplatesRequest.namespace)
            && Objects.equals(this.dname, listAlarmTemplatesRequest.dname)
            && Objects.equals(this.start, listAlarmTemplatesRequest.start)
            && Objects.equals(this.limit, listAlarmTemplatesRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmTemplateId, namespace, dname, start, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmTemplatesRequest {\n");
        sb.append("    alarmTemplateId: ").append(toIndentedString(alarmTemplateId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dname: ").append(toIndentedString(dname)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
