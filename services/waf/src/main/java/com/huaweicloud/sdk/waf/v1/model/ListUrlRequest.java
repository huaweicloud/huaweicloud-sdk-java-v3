package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListUrlRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private Integer top;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent")

    private String recent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Integer from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Integer to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<String> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<String> instances = null;

    public ListUrlRequest withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * 受攻击次数最多的几条url
     * @return top
     */
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public ListUrlRequest withRecent(String recent) {
        this.recent = recent;
        return this;
    }

    /**
     * **参数解释：** 查询日志的时间范围，如1week（1周）、1month（1个月） **约束限制：** 不涉及 **取值范围：** - yesterday - today - 3days - 1week - 1month  **默认取值：** 不涉及
     * @return recent
     */
    public String getRecent() {
        return recent;
    }

    public void setRecent(String recent) {
        this.recent = recent;
    }

    public ListUrlRequest withFrom(Integer from) {
        this.from = from;
        return this;
    }

    /**
     * **参数解释：** 开始时间，统计周期的起始时间戳（毫秒级）。不使用recent参数时需要填写 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return from
     */
    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public ListUrlRequest withTo(Integer to) {
        this.to = to;
        return this;
    }

    /**
     * **参数解释：** 结束时间，统计周期的终止时间戳（毫秒级）。不使用recent参数时需要填写 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return to
     */
    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public ListUrlRequest withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ListUrlRequest addHostsItem(String hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ListUrlRequest withHosts(Consumer<List<String>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 要查询事件的域名id列表
     * @return hosts
     */
    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public ListUrlRequest withInstances(List<String> instances) {
        this.instances = instances;
        return this;
    }

    public ListUrlRequest addInstancesItem(String instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListUrlRequest withInstances(Consumer<List<String>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 要查询事件的独享域名id列表
     * @return instances
     */
    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUrlRequest that = (ListUrlRequest) obj;
        return Objects.equals(this.top, that.top) && Objects.equals(this.recent, that.recent)
            && Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.hosts, that.hosts) && Objects.equals(this.instances, that.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(top, recent, from, to, hosts, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUrlRequest {\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    recent: ").append(toIndentedString(recent)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
