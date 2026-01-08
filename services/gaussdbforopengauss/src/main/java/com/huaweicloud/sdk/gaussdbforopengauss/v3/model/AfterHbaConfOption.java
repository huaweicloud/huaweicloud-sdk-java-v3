package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**: 修改后的hba配置信息。 **约束限制**: 不涉及。
 */
public class AfterHbaConfOption {

    /**
     * **参数解释** 客户端连接类型。 **约束限制**: 不涉及。 **取值范围** - host：表示这条记录既接受一个普通的TCP/IP套接字连接，也接受一个经过SSL加密的TCP/IP套接字连接。 - hostssl：表示这条记录只接受一个经过SSL加密的TCP/IP套接字连接。 - hostnossl：表示这条记录只接受一个普通的TCP/IP套接字连接。  **默认取值**: 不涉及。 
     */
    public static final class TypeEnum {

        /**
         * Enum HOST for value: "host"
         */
        public static final TypeEnum HOST = new TypeEnum("host");

        /**
         * Enum HOSTNOSSL for value: "hostnossl"
         */
        public static final TypeEnum HOSTNOSSL = new TypeEnum("hostnossl");

        /**
         * Enum HOSTSSL for value: "hostssl"
         */
        public static final TypeEnum HOSTSSL = new TypeEnum("hostssl");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("host", HOST);
            map.put("hostnossl", HOSTNOSSL);
            map.put("hostssl", HOSTSSL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    /**
     * **参数解释** 声明连接时使用的认证方法。 **约束限制**: 不涉及。 **取值范围** - reject：无条件地拒绝连接。常用于过滤某些主机。 - md5：MD5加密算法安全性低，存在安全风险，不推荐使用，建议使用更安全的加密算法。默认不支持，可通过password_encryption_type参数配置。 - sha256：要求客户端提供一个sha256算法加密的口令进行认证，该口令在传送过程中结合salt（服务器发送给客户端的随机数）的单向sha256加密，增强了安全性。 - sm3：要求客户端提供一个sm3算法加密口令进行认证，该口令在传送过程中结合salt（服务器发送给客户端的随机数）的单向sm3加密，增加了安全性。 - cert：客户端证书认证模式，此模式需进行SSL连接配置且需要客户端提供有效的SSL证书，不需要提供用户密码。cert认证方式只支持hostssl类型的规则。  **默认取值**: 不涉及。 
     */
    public static final class MethodEnum {

        /**
         * Enum REJECT for value: "reject"
         */
        public static final MethodEnum REJECT = new MethodEnum("reject");

        /**
         * Enum MD5 for value: "md5"
         */
        public static final MethodEnum MD5 = new MethodEnum("md5");

        /**
         * Enum SHA256 for value: "sha256"
         */
        public static final MethodEnum SHA256 = new MethodEnum("sha256");

        /**
         * Enum SM3 for value: "sm3"
         */
        public static final MethodEnum SM3 = new MethodEnum("sm3");

        /**
         * Enum CERT for value: "cert"
         */
        public static final MethodEnum CERT = new MethodEnum("cert");

        private static final Map<String, MethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MethodEnum> createStaticFields() {
            Map<String, MethodEnum> map = new HashMap<>();
            map.put("reject", REJECT);
            map.put("md5", MD5);
            map.put("sha256", SHA256);
            map.put("sm3", SM3);
            map.put("cert", CERT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MethodEnum(String value) {
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
        public static MethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MethodEnum(value));
        }

        public static MethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MethodEnum) {
                return this.value.equals(((MethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private MethodEnum method;

    public AfterHbaConfOption withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释** 客户端连接类型。 **约束限制**: 不涉及。 **取值范围** - host：表示这条记录既接受一个普通的TCP/IP套接字连接，也接受一个经过SSL加密的TCP/IP套接字连接。 - hostssl：表示这条记录只接受一个经过SSL加密的TCP/IP套接字连接。 - hostnossl：表示这条记录只接受一个普通的TCP/IP套接字连接。  **默认取值**: 不涉及。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AfterHbaConfOption withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * **参数解释** 声明记录所匹配且允许访问的数据库，多租特性场景下该参数声明记录所匹配且允许访问的PDB。 - 值replication表示如果请求一个复制连接，则匹配，但复制连接不表示任何特定的数据库。如需使用名为replication的数据库，需在database列使用记录“replication”作为数据库名。 - 多租数据库下， 值replication_pdb1表示如果请求一个名为pdb1数据库的复制连接，则匹配成功。值replication方式只生效Non-PDB。 - PDB复制连接生效配置方式为replication_[pdbname]，pdbname为用户创建PDB数据库时候的名字。 - 如需使用名为replication_pdb1的数据库，需在database列使用记录“replication_pdb1”作为数据库名。  **约束限制**: 不涉及。 **取值范围** - all：表示该记录匹配所有数据库。 - 特定的数据库名称或者用逗号分隔的数据库列表。  **默认取值**: 不涉及。 
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public AfterHbaConfOption withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * **参数解释** 声明记录所匹配且允许访问的数据库用户。 **约束限制** 不支持系统用户。 **取值范围** - all：表明该记录匹配所有用户。 - 特定的数据库用户名或者用逗号分隔的用户列表。 **默认取值**: 不涉及。 
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public AfterHbaConfOption withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * **参数解释** 指定与记录匹配且允许访问的IP地址范围。 **约束限制** 当前仅支持IP地址/掩码长度格式。 数据库引擎版本为V2.0-8.1.0及以上支持address配置IPv6的IP。 **取值范围** 支持IPv4和IPv6，可以使用如下形式来表示： IP地址/掩码长度。例如，10.10.0.0/24、2001:250:250:250:250:250:250:175/128。 **默认取值**: 不涉及。 
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AfterHbaConfOption withMethod(MethodEnum method) {
        this.method = method;
        return this;
    }

    /**
     * **参数解释** 声明连接时使用的认证方法。 **约束限制**: 不涉及。 **取值范围** - reject：无条件地拒绝连接。常用于过滤某些主机。 - md5：MD5加密算法安全性低，存在安全风险，不推荐使用，建议使用更安全的加密算法。默认不支持，可通过password_encryption_type参数配置。 - sha256：要求客户端提供一个sha256算法加密的口令进行认证，该口令在传送过程中结合salt（服务器发送给客户端的随机数）的单向sha256加密，增强了安全性。 - sm3：要求客户端提供一个sm3算法加密口令进行认证，该口令在传送过程中结合salt（服务器发送给客户端的随机数）的单向sm3加密，增加了安全性。 - cert：客户端证书认证模式，此模式需进行SSL连接配置且需要客户端提供有效的SSL证书，不需要提供用户密码。cert认证方式只支持hostssl类型的规则。  **默认取值**: 不涉及。 
     * @return method
     */
    public MethodEnum getMethod() {
        return method;
    }

    public void setMethod(MethodEnum method) {
        this.method = method;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AfterHbaConfOption that = (AfterHbaConfOption) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.database, that.database)
            && Objects.equals(this.user, that.user) && Objects.equals(this.address, that.address)
            && Objects.equals(this.method, that.method);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, database, user, address, method);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AfterHbaConfOption {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
