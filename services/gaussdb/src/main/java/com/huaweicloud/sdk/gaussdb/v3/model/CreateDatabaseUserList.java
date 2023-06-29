package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库用户列表，列表最大长度为50。
 */
public class CreateDatabaseUserList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<String> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<CreateDatabaseList> databases = null;

    public CreateDatabaseUserList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库用户名称，数据库用户名称在1到32个字符之间，由字母、数字、下划线组成，不能包含其他特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDatabaseUserList withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 数据库备注,长度不能超过512个字符，不能包含回车和特殊字符!<\"='>&。  该字段只针对新版本的实例生效，必须大于等于指定的内核版本-2.0.13.0，如果不符合内核版本要求，参考升级内核版本升级至最新。
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public CreateDatabaseUserList withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 数据库用户密码，不能同用户名称相同，非空，至少包含以下字符中的三种：大写字母、小写字母、数字和特殊符号~!@#$%^*-_=+?,()&组成，长度8~32个字符。  建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateDatabaseUserList withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public CreateDatabaseUserList addHostsItem(String hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public CreateDatabaseUserList withHosts(Consumer<List<String>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * 主机IP地址，即允许数据库用户在当前主机连接数据库，默认IP地址为%，表示允许所有地址访问GaussDB(for MySQL)实例。若IP地址为“10.10.10.%”，则表示10.10.10.X的IP地址都可以访问该GaussDB(for MySQL)实例。若您需要添加多个IP地址，请用英文逗号隔开（逗号前后都不能加空格），例如192.168.0.1,172.16.213.9，一次最多创建50个。
     * @return hosts
     */
    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public CreateDatabaseUserList withDatabases(List<CreateDatabaseList> databases) {
        this.databases = databases;
        return this;
    }

    public CreateDatabaseUserList addDatabasesItem(CreateDatabaseList databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public CreateDatabaseUserList withDatabases(Consumer<List<CreateDatabaseList>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * Get databases
     * @return databases
     */
    public List<CreateDatabaseList> getDatabases() {
        return databases;
    }

    public void setDatabases(List<CreateDatabaseList> databases) {
        this.databases = databases;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDatabaseUserList that = (CreateDatabaseUserList) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.password, that.password) && Objects.equals(this.hosts, that.hosts)
            && Objects.equals(this.databases, that.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, comment, password, hosts, databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseUserList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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
