package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListInstancesSessionRespondBodySessions
 */
public class ListInstancesSessionRespondBodySessions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd")

    private String cmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "age")

    private String age;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle")

    private String idle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db")

    private String db;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd")

    private String fd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub")

    private String sub;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "psub")

    private String psub;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi")

    private String multi;

    public ListInstancesSessionRespondBodySessions withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * 客户端的地址和端口。
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public ListInstancesSessionRespondBodySessions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 会话id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListInstancesSessionRespondBodySessions withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 连接名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInstancesSessionRespondBodySessions withCmd(String cmd) {
        this.cmd = cmd;
        return this;
    }

    /**
     * 最近一次执行的命令。
     * @return cmd
     */
    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public ListInstancesSessionRespondBodySessions withAge(String age) {
        this.age = age;
        return this;
    }

    /**
     * 以秒计算的已连接时长。
     * @return age
     */
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public ListInstancesSessionRespondBodySessions withIdle(String idle) {
        this.idle = idle;
        return this;
    }

    /**
     * 以秒计算的空闲时长。
     * @return idle
     */
    public String getIdle() {
        return idle;
    }

    public void setIdle(String idle) {
        this.idle = idle;
    }

    public ListInstancesSessionRespondBodySessions withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * 该客户端正在使用的数据库 ID。
     * @return db
     */
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public ListInstancesSessionRespondBodySessions withFd(String fd) {
        this.fd = fd;
        return this;
    }

    /**
     * 套接字所使用的文件描述符。
     * @return fd
     */
    public String getFd() {
        return fd;
    }

    public void setFd(String fd) {
        this.fd = fd;
    }

    public ListInstancesSessionRespondBodySessions withSub(String sub) {
        this.sub = sub;
        return this;
    }

    /**
     * 已订阅频道的数量。
     * @return sub
     */
    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public ListInstancesSessionRespondBodySessions withPsub(String psub) {
        this.psub = psub;
        return this;
    }

    /**
     * 已订阅模式的数量。
     * @return psub
     */
    public String getPsub() {
        return psub;
    }

    public void setPsub(String psub) {
        this.psub = psub;
    }

    public ListInstancesSessionRespondBodySessions withMulti(String multi) {
        this.multi = multi;
        return this;
    }

    /**
     * 在事务中被执行的命令数量。
     * @return multi
     */
    public String getMulti() {
        return multi;
    }

    public void setMulti(String multi) {
        this.multi = multi;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesSessionRespondBodySessions that = (ListInstancesSessionRespondBodySessions) obj;
        return Objects.equals(this.addr, that.addr) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.cmd, that.cmd)
            && Objects.equals(this.age, that.age) && Objects.equals(this.idle, that.idle)
            && Objects.equals(this.db, that.db) && Objects.equals(this.fd, that.fd)
            && Objects.equals(this.sub, that.sub) && Objects.equals(this.psub, that.psub)
            && Objects.equals(this.multi, that.multi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addr, id, name, cmd, age, idle, db, fd, sub, psub, multi);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesSessionRespondBodySessions {\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
        sb.append("    age: ").append(toIndentedString(age)).append("\n");
        sb.append("    idle: ").append(toIndentedString(idle)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    fd: ").append(toIndentedString(fd)).append("\n");
        sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
        sb.append("    psub: ").append(toIndentedString(psub)).append("\n");
        sb.append("    multi: ").append(toIndentedString(multi)).append("\n");
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
