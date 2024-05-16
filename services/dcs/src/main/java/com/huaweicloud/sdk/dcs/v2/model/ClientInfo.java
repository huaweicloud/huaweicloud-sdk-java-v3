package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ClientInfo
 */
public class ClientInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd")

    private String fd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd")

    private String cmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "age")

    private Integer age;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle")

    private Integer idle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db")

    private String db;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flags")

    private String flags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub")

    private Integer sub;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "psub")

    private Integer psub;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi")

    private Integer multi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qbuf")

    private Integer qbuf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qbuf_free")

    private Integer qbufFree;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obl")

    private Integer obl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oll")

    private Integer oll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "omem")

    private Integer omem;

    /**
     * 文件描述符事件
     */
    public static final class EventsEnum {

        /**
         * Enum R for value: "r"
         */
        public static final EventsEnum R = new EventsEnum("r");

        /**
         * Enum W for value: "w"
         */
        public static final EventsEnum W = new EventsEnum("w");

        private static final Map<String, EventsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventsEnum> createStaticFields() {
            Map<String, EventsEnum> map = new HashMap<>();
            map.put("r", R);
            map.put("w", W);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventsEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EventsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventsEnum(value));
        }

        public static EventsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventsEnum) {
                return this.value.equals(((EventsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private EventsEnum events;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private String network;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer")

    private String peer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    public ClientInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 客户端ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClientInfo withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * 客户端的地址和端口
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public ClientInfo withFd(String fd) {
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

    public ClientInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 客户端的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientInfo withCmd(String cmd) {
        this.cmd = cmd;
        return this;
    }

    /**
     * 最近一次执行的命令
     * @return cmd
     */
    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public ClientInfo withAge(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * 已连接时长（单位：秒）
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ClientInfo withIdle(Integer idle) {
        this.idle = idle;
        return this;
    }

    /**
     * 空闲时长（单位：秒）
     * @return idle
     */
    public Integer getIdle() {
        return idle;
    }

    public void setIdle(Integer idle) {
        this.idle = idle;
    }

    public ClientInfo withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * 该客户端正在使用的数据库 ID
     * @return db
     */
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public ClientInfo withFlags(String flags) {
        this.flags = flags;
        return this;
    }

    /**
     * 客户端标志
     * @return flags
     */
    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public ClientInfo withSub(Integer sub) {
        this.sub = sub;
        return this;
    }

    /**
     * 已订阅频道的数量
     * @return sub
     */
    public Integer getSub() {
        return sub;
    }

    public void setSub(Integer sub) {
        this.sub = sub;
    }

    public ClientInfo withPsub(Integer psub) {
        this.psub = psub;
        return this;
    }

    /**
     * 已订阅模式的数量
     * @return psub
     */
    public Integer getPsub() {
        return psub;
    }

    public void setPsub(Integer psub) {
        this.psub = psub;
    }

    public ClientInfo withMulti(Integer multi) {
        this.multi = multi;
        return this;
    }

    /**
     * 在事务中被执行的命令数量
     * @return multi
     */
    public Integer getMulti() {
        return multi;
    }

    public void setMulti(Integer multi) {
        this.multi = multi;
    }

    public ClientInfo withQbuf(Integer qbuf) {
        this.qbuf = qbuf;
        return this;
    }

    /**
     * 查询缓冲区的长度（单位为字节， 0 表示没有分配查询缓冲区）
     * @return qbuf
     */
    public Integer getQbuf() {
        return qbuf;
    }

    public void setQbuf(Integer qbuf) {
        this.qbuf = qbuf;
    }

    public ClientInfo withQbufFree(Integer qbufFree) {
        this.qbufFree = qbufFree;
        return this;
    }

    /**
     * 查询缓冲区剩余空间的长度（单位为字节， 0 表示没有剩余空间）
     * @return qbufFree
     */
    public Integer getQbufFree() {
        return qbufFree;
    }

    public void setQbufFree(Integer qbufFree) {
        this.qbufFree = qbufFree;
    }

    public ClientInfo withObl(Integer obl) {
        this.obl = obl;
        return this;
    }

    /**
     * 输出缓冲区的长度（单位为字节， 0 表示没有分配输出缓冲区）
     * @return obl
     */
    public Integer getObl() {
        return obl;
    }

    public void setObl(Integer obl) {
        this.obl = obl;
    }

    public ClientInfo withOll(Integer oll) {
        this.oll = oll;
        return this;
    }

    /**
     * 输出列表包含的对象数量（当输出缓冲区没有剩余空间时，命令回复会以字符串对象的形式被入队到这个队列里）
     * @return oll
     */
    public Integer getOll() {
        return oll;
    }

    public void setOll(Integer oll) {
        this.oll = oll;
    }

    public ClientInfo withOmem(Integer omem) {
        this.omem = omem;
        return this;
    }

    /**
     * 输出缓冲区和输出列表占用的内存总量
     * @return omem
     */
    public Integer getOmem() {
        return omem;
    }

    public void setOmem(Integer omem) {
        this.omem = omem;
    }

    public ClientInfo withEvents(EventsEnum events) {
        this.events = events;
        return this;
    }

    /**
     * 文件描述符事件
     * @return events
     */
    public EventsEnum getEvents() {
        return events;
    }

    public void setEvents(EventsEnum events) {
        this.events = events;
    }

    public ClientInfo withNetwork(String network) {
        this.network = network;
        return this;
    }

    /**
     * 客户端所使用的网络类型。
     * @return network
     */
    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public ClientInfo withPeer(String peer) {
        this.peer = peer;
        return this;
    }

    /**
     * 单机，主备和cluster实例地址和端口。
     * @return peer
     */
    public String getPeer() {
        return peer;
    }

    public void setPeer(String peer) {
        this.peer = peer;
    }

    public ClientInfo withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 客户端用户。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClientInfo that = (ClientInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.addr, that.addr)
            && Objects.equals(this.fd, that.fd) && Objects.equals(this.name, that.name)
            && Objects.equals(this.cmd, that.cmd) && Objects.equals(this.age, that.age)
            && Objects.equals(this.idle, that.idle) && Objects.equals(this.db, that.db)
            && Objects.equals(this.flags, that.flags) && Objects.equals(this.sub, that.sub)
            && Objects.equals(this.psub, that.psub) && Objects.equals(this.multi, that.multi)
            && Objects.equals(this.qbuf, that.qbuf) && Objects.equals(this.qbufFree, that.qbufFree)
            && Objects.equals(this.obl, that.obl) && Objects.equals(this.oll, that.oll)
            && Objects.equals(this.omem, that.omem) && Objects.equals(this.events, that.events)
            && Objects.equals(this.network, that.network) && Objects.equals(this.peer, that.peer)
            && Objects.equals(this.user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            addr,
            fd,
            name,
            cmd,
            age,
            idle,
            db,
            flags,
            sub,
            psub,
            multi,
            qbuf,
            qbufFree,
            obl,
            oll,
            omem,
            events,
            network,
            peer,
            user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClientInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    fd: ").append(toIndentedString(fd)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
        sb.append("    age: ").append(toIndentedString(age)).append("\n");
        sb.append("    idle: ").append(toIndentedString(idle)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
        sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
        sb.append("    psub: ").append(toIndentedString(psub)).append("\n");
        sb.append("    multi: ").append(toIndentedString(multi)).append("\n");
        sb.append("    qbuf: ").append(toIndentedString(qbuf)).append("\n");
        sb.append("    qbufFree: ").append(toIndentedString(qbufFree)).append("\n");
        sb.append("    obl: ").append(toIndentedString(obl)).append("\n");
        sb.append("    oll: ").append(toIndentedString(oll)).append("\n");
        sb.append("    omem: ").append(toIndentedString(omem)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    peer: ").append(toIndentedString(peer)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
