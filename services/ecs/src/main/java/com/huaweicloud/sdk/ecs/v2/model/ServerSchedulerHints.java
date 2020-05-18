package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 弹性云服务器调度信息。
 */
public class ServerSchedulerHints  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group")
    
    private List<String> group = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="different_host")
    
    private List<String> differentHost = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="same_host")
    
    private List<String> sameHost = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr")
    
    private List<String> cidr = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="build_near_host_ip")
    
    private List<String> buildNearHostIp = null;
    
    public ServerSchedulerHints withGroup(List<String> group) {
        this.group = group;
        return this;
    }

    
    public ServerSchedulerHints addGroupItem(String groupItem) {
        if (this.group == null) {
            this.group = new ArrayList<>();
        }
        this.group.add(groupItem);
        return this;
    }

    public ServerSchedulerHints withGroup(Consumer<List<String>> groupSetter) {
        if(this.group == null ){
            this.group = new ArrayList<>();
        }
        groupSetter.accept(this.group);
        return this;
    }

    /**
     * 反亲和性组信息。  UUID格式。
     * @return group
     */
    public List<String> getGroup() {
        return group;
    }

    public void setGroup(List<String> group) {
        this.group = group;
    }

    public ServerSchedulerHints withDifferentHost(List<String> differentHost) {
        this.differentHost = differentHost;
        return this;
    }

    
    public ServerSchedulerHints addDifferentHostItem(String differentHostItem) {
        if (this.differentHost == null) {
            this.differentHost = new ArrayList<>();
        }
        this.differentHost.add(differentHostItem);
        return this;
    }

    public ServerSchedulerHints withDifferentHost(Consumer<List<String>> differentHostSetter) {
        if(this.differentHost == null ){
            this.differentHost = new ArrayList<>();
        }
        differentHostSetter.accept(this.differentHost);
        return this;
    }

    /**
     * 与指定弹性云服务器满足反亲和性。当前不支持该功能。
     * @return differentHost
     */
    public List<String> getDifferentHost() {
        return differentHost;
    }

    public void setDifferentHost(List<String> differentHost) {
        this.differentHost = differentHost;
    }

    public ServerSchedulerHints withSameHost(List<String> sameHost) {
        this.sameHost = sameHost;
        return this;
    }

    
    public ServerSchedulerHints addSameHostItem(String sameHostItem) {
        if (this.sameHost == null) {
            this.sameHost = new ArrayList<>();
        }
        this.sameHost.add(sameHostItem);
        return this;
    }

    public ServerSchedulerHints withSameHost(Consumer<List<String>> sameHostSetter) {
        if(this.sameHost == null ){
            this.sameHost = new ArrayList<>();
        }
        sameHostSetter.accept(this.sameHost);
        return this;
    }

    /**
     * 与指定的弹性云服务器满足亲和性。当前不支持该功能。
     * @return sameHost
     */
    public List<String> getSameHost() {
        return sameHost;
    }

    public void setSameHost(List<String> sameHost) {
        this.sameHost = sameHost;
    }

    public ServerSchedulerHints withCidr(List<String> cidr) {
        this.cidr = cidr;
        return this;
    }

    
    public ServerSchedulerHints addCidrItem(String cidrItem) {
        if (this.cidr == null) {
            this.cidr = new ArrayList<>();
        }
        this.cidr.add(cidrItem);
        return this;
    }

    public ServerSchedulerHints withCidr(Consumer<List<String>> cidrSetter) {
        if(this.cidr == null ){
            this.cidr = new ArrayList<>();
        }
        cidrSetter.accept(this.cidr);
        return this;
    }

    /**
     * 将弹性云服务器scheduler到指定网段的host上，host网段的cidr。当前不支持该功能。
     * @return cidr
     */
    public List<String> getCidr() {
        return cidr;
    }

    public void setCidr(List<String> cidr) {
        this.cidr = cidr;
    }

    public ServerSchedulerHints withBuildNearHostIp(List<String> buildNearHostIp) {
        this.buildNearHostIp = buildNearHostIp;
        return this;
    }

    
    public ServerSchedulerHints addBuildNearHostIpItem(String buildNearHostIpItem) {
        if (this.buildNearHostIp == null) {
            this.buildNearHostIp = new ArrayList<>();
        }
        this.buildNearHostIp.add(buildNearHostIpItem);
        return this;
    }

    public ServerSchedulerHints withBuildNearHostIp(Consumer<List<String>> buildNearHostIpSetter) {
        if(this.buildNearHostIp == null ){
            this.buildNearHostIp = new ArrayList<>();
        }
        buildNearHostIpSetter.accept(this.buildNearHostIp);
        return this;
    }

    /**
     * 预留字段，当前不支持该功能。
     * @return buildNearHostIp
     */
    public List<String> getBuildNearHostIp() {
        return buildNearHostIp;
    }

    public void setBuildNearHostIp(List<String> buildNearHostIp) {
        this.buildNearHostIp = buildNearHostIp;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServerSchedulerHints serverSchedulerHints = (ServerSchedulerHints) o;
        return Objects.equals(this.group, serverSchedulerHints.group) &&
            Objects.equals(this.differentHost, serverSchedulerHints.differentHost) &&
            Objects.equals(this.sameHost, serverSchedulerHints.sameHost) &&
            Objects.equals(this.cidr, serverSchedulerHints.cidr) &&
            Objects.equals(this.buildNearHostIp, serverSchedulerHints.buildNearHostIp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(group, differentHost, sameHost, cidr, buildNearHostIp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerSchedulerHints {\n");
            sb.append("    group: ").append(toIndentedString(group)).append("\n");
            sb.append("    differentHost: ").append(toIndentedString(differentHost)).append("\n");
            sb.append("    sameHost: ").append(toIndentedString(sameHost)).append("\n");
            sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
            sb.append("    buildNearHostIp: ").append(toIndentedString(buildNearHostIp)).append("\n");
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

