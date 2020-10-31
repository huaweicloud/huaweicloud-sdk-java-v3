package com.huaweicloud.sdk.ces.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListAlarmTemplatesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarmTemplateId")
    
    private String alarmTemplateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dname")
    
    private String dname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start")
    
    private String start;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private String limit;

    public ListAlarmTemplatesRequest withAlarmTemplateId(String alarmTemplateId) {
        this.alarmTemplateId = alarmTemplateId;
        return this;
    }

    


    /**
     * Get alarmTemplateId
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
     * Get namespace
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
     * Get dname
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
     * Get start
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
     * Get limit
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
        return Objects.equals(this.alarmTemplateId, listAlarmTemplatesRequest.alarmTemplateId) &&
            Objects.equals(this.namespace, listAlarmTemplatesRequest.namespace) &&
            Objects.equals(this.dname, listAlarmTemplatesRequest.dname) &&
            Objects.equals(this.start, listAlarmTemplatesRequest.start) &&
            Objects.equals(this.limit, listAlarmTemplatesRequest.limit);
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

