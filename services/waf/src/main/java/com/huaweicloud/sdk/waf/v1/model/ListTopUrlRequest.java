package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTopUrlRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="from")
    
    private Long from;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="to")
    
    private Long to;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="top")
    
    private Integer top;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hosts")
    
    private String hosts;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instances")
    
    private String instances;

    public ListTopUrlRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    


    /**
     * 起始时间
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    

    public ListTopUrlRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    


    /**
     * 结束时间
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    

    public ListTopUrlRequest withTop(Integer top) {
        this.top = top;
        return this;
    }

    


    /**
     * 要查询的前几的结果
     * @return top
     */
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    

    public ListTopUrlRequest withHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }

    


    /**
     * 要查询域名列表
     * @return hosts
     */
    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    

    public ListTopUrlRequest withInstances(String instances) {
        this.instances = instances;
        return this;
    }

    


    /**
     * 要查询实例列表
     * @return instances
     */
    public String getInstances() {
        return instances;
    }

    public void setInstances(String instances) {
        this.instances = instances;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTopUrlRequest listTopUrlRequest = (ListTopUrlRequest) o;
        return Objects.equals(this.from, listTopUrlRequest.from) &&
            Objects.equals(this.to, listTopUrlRequest.to) &&
            Objects.equals(this.top, listTopUrlRequest.top) &&
            Objects.equals(this.hosts, listTopUrlRequest.hosts) &&
            Objects.equals(this.instances, listTopUrlRequest.instances);
    }
    @Override
    public int hashCode() {
        return Objects.hash(from, to, top, hosts, instances);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopUrlRequest {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

