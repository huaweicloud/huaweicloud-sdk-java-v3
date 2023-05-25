package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DnsConfig
 */
public class DnsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nameservers")

    private List<String> nameservers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searches")

    private List<String> searches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private List<ComponentConfigEnvs> options = null;

    public DnsConfig withNameservers(List<String> nameservers) {
        this.nameservers = nameservers;
        return this;
    }

    public DnsConfig addNameserversItem(String nameserversItem) {
        if (this.nameservers == null) {
            this.nameservers = new ArrayList<>();
        }
        this.nameservers.add(nameserversItem);
        return this;
    }

    public DnsConfig withNameservers(Consumer<List<String>> nameserversSetter) {
        if (this.nameservers == null) {
            this.nameservers = new ArrayList<>();
        }
        nameserversSetter.accept(this.nameservers);
        return this;
    }

    /**
     * 将用作于 Pod 的 DNS 服务器的 IP 地址列表
     * @return nameservers
     */
    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public DnsConfig withSearches(List<String> searches) {
        this.searches = searches;
        return this;
    }

    public DnsConfig addSearchesItem(String searchesItem) {
        if (this.searches == null) {
            this.searches = new ArrayList<>();
        }
        this.searches.add(searchesItem);
        return this;
    }

    public DnsConfig withSearches(Consumer<List<String>> searchesSetter) {
        if (this.searches == null) {
            this.searches = new ArrayList<>();
        }
        searchesSetter.accept(this.searches);
        return this;
    }

    /**
     * 用于在 Pod 中查找主机名的 DNS 搜索域的列表。此属性是可选的
     * @return searches
     */
    public List<String> getSearches() {
        return searches;
    }

    public void setSearches(List<String> searches) {
        this.searches = searches;
    }

    public DnsConfig withOptions(List<ComponentConfigEnvs> options) {
        this.options = options;
        return this;
    }

    public DnsConfig addOptionsItem(ComponentConfigEnvs optionsItem) {
        if (this.options == null) {
            this.options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    public DnsConfig withOptions(Consumer<List<ComponentConfigEnvs>> optionsSetter) {
        if (this.options == null) {
            this.options = new ArrayList<>();
        }
        optionsSetter.accept(this.options);
        return this;
    }

    /**
     * 可选的对象列表，其中每个对象可能具有 name 属性（必需）和 value 属性（可选）。 此属性中的内容将合并到从指定的 DNS 策略生成的选项。 重复的条目将被删除。
     * @return options
     */
    public List<ComponentConfigEnvs> getOptions() {
        return options;
    }

    public void setOptions(List<ComponentConfigEnvs> options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DnsConfig dnsConfig = (DnsConfig) o;
        return Objects.equals(this.nameservers, dnsConfig.nameservers)
            && Objects.equals(this.searches, dnsConfig.searches) && Objects.equals(this.options, dnsConfig.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameservers, searches, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DnsConfig {\n");
        sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
        sb.append("    searches: ").append(toIndentedString(searches)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
