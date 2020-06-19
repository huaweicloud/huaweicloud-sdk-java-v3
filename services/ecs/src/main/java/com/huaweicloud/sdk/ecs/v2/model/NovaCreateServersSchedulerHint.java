package com.huaweicloud.sdk.ecs.v2.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 *  弹性云服务器调度信息。  裸金属服务器场景不支持。
 */
public class NovaCreateServersSchedulerHint  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group")
    
    private String group;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="different_host")
    
    private List<String> differentHost = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="same_host")
    
    private List<String> sameHost = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr")
    
    private String cidr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="build_near_host_ip")
    
    private String buildNearHostIp;

    public NovaCreateServersSchedulerHint withGroup(String group) {
        this.group = group;
        return this;
    }

    


    /**
     * 反亲和性组信息。  UUID格式。
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public NovaCreateServersSchedulerHint withDifferentHost(List<String> differentHost) {
        this.differentHost = differentHost;
        return this;
    }

    
    public NovaCreateServersSchedulerHint addDifferentHostItem(String differentHostItem) {
        if (this.differentHost == null) {
            this.differentHost = new ArrayList<>();
        }
        this.differentHost.add(differentHostItem);
        return this;
    }

    public NovaCreateServersSchedulerHint withDifferentHost(Consumer<List<String>> differentHostSetter) {
        if(this.differentHost == null ){
            this.differentHost = new ArrayList<>();
        }
        differentHostSetter.accept(this.differentHost);
        return this;
    }

    /**
     * 与指定弹性云服务器满足反亲和性。   当前不支持该功能。
     * @return differentHost
     */
    public List<String> getDifferentHost() {
        return differentHost;
    }

    public void setDifferentHost(List<String> differentHost) {
        this.differentHost = differentHost;
    }

    public NovaCreateServersSchedulerHint withSameHost(List<String> sameHost) {
        this.sameHost = sameHost;
        return this;
    }

    
    public NovaCreateServersSchedulerHint addSameHostItem(String sameHostItem) {
        if (this.sameHost == null) {
            this.sameHost = new ArrayList<>();
        }
        this.sameHost.add(sameHostItem);
        return this;
    }

    public NovaCreateServersSchedulerHint withSameHost(Consumer<List<String>> sameHostSetter) {
        if(this.sameHost == null ){
            this.sameHost = new ArrayList<>();
        }
        sameHostSetter.accept(this.sameHost);
        return this;
    }

    /**
     * 与指定的弹性云服务器满足亲和性。   当前不支持该功能。
     * @return sameHost
     */
    public List<String> getSameHost() {
        return sameHost;
    }

    public void setSameHost(List<String> sameHost) {
        this.sameHost = sameHost;
    }

    public NovaCreateServersSchedulerHint withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    


    /**
     * 将弹性云服务器scheduler到指定网段的host上，host网段的cidr。   当前不支持该功能。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public NovaCreateServersSchedulerHint withBuildNearHostIp(String buildNearHostIp) {
        this.buildNearHostIp = buildNearHostIp;
        return this;
    }

    


    /**
     * 将弹性云服务器scheduler到指定网段的host上，host IP地址。   当前不支持该功能。
     * @return buildNearHostIp
     */
    public String getBuildNearHostIp() {
        return buildNearHostIp;
    }

    public void setBuildNearHostIp(String buildNearHostIp) {
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
        NovaCreateServersSchedulerHint novaCreateServersSchedulerHint = (NovaCreateServersSchedulerHint) o;
        return Objects.equals(this.group, novaCreateServersSchedulerHint.group) &&
            Objects.equals(this.differentHost, novaCreateServersSchedulerHint.differentHost) &&
            Objects.equals(this.sameHost, novaCreateServersSchedulerHint.sameHost) &&
            Objects.equals(this.cidr, novaCreateServersSchedulerHint.cidr) &&
            Objects.equals(this.buildNearHostIp, novaCreateServersSchedulerHint.buildNearHostIp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(group, differentHost, sameHost, cidr, buildNearHostIp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaCreateServersSchedulerHint {\n");
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

