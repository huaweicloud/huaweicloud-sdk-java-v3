package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 查询事务筛选条件。 **约束限制**: 不涉及。
 */
public class ListTransactionRequestBodyTransactionQueryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_time")

    private String execTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xlog_quantity")

    private String xlogQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datnames")

    private List<String> datnames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usenames")

    private List<String> usenames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_addrs")

    private List<String> clientAddrs = null;

    public ListTransactionRequestBodyTransactionQueryInfo withExecTime(String execTime) {
        this.execTime = execTime;
        return this;
    }

    /**
     * **参数解释**: 事务执行时长，单位：秒。 **约束限制**: 不涉及。 **取值范围**: 非负整数。 **默认取值**: 0
     * @return execTime
     */
    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime;
    }

    public ListTransactionRequestBodyTransactionQueryInfo withXlogQuantity(String xlogQuantity) {
        this.xlogQuantity = xlogQuantity;
        return this;
    }

    /**
     * **参数解释**: 事务xlog日志大小：单位byte。 **约束限制**: 不涉及。 **取值范围**: 非负整数。 **默认取值**: 0
     * @return xlogQuantity
     */
    public String getXlogQuantity() {
        return xlogQuantity;
    }

    public void setXlogQuantity(String xlogQuantity) {
        this.xlogQuantity = xlogQuantity;
    }

    public ListTransactionRequestBodyTransactionQueryInfo withDatnames(List<String> datnames) {
        this.datnames = datnames;
        return this;
    }

    public ListTransactionRequestBodyTransactionQueryInfo addDatnamesItem(String datnamesItem) {
        if (this.datnames == null) {
            this.datnames = new ArrayList<>();
        }
        this.datnames.add(datnamesItem);
        return this;
    }

    public ListTransactionRequestBodyTransactionQueryInfo withDatnames(Consumer<List<String>> datnamesSetter) {
        if (this.datnames == null) {
            this.datnames = new ArrayList<>();
        }
        datnamesSetter.accept(this.datnames);
        return this;
    }

    /**
     * **参数解释**: 数据库名。 **约束限制**: 不涉及。
     * @return datnames
     */
    public List<String> getDatnames() {
        return datnames;
    }

    public void setDatnames(List<String> datnames) {
        this.datnames = datnames;
    }

    public ListTransactionRequestBodyTransactionQueryInfo withUsenames(List<String> usenames) {
        this.usenames = usenames;
        return this;
    }

    public ListTransactionRequestBodyTransactionQueryInfo addUsenamesItem(String usenamesItem) {
        if (this.usenames == null) {
            this.usenames = new ArrayList<>();
        }
        this.usenames.add(usenamesItem);
        return this;
    }

    public ListTransactionRequestBodyTransactionQueryInfo withUsenames(Consumer<List<String>> usenamesSetter) {
        if (this.usenames == null) {
            this.usenames = new ArrayList<>();
        }
        usenamesSetter.accept(this.usenames);
        return this;
    }

    /**
     * **参数解释**: 用户名。 **约束限制**: 不涉及。
     * @return usenames
     */
    public List<String> getUsenames() {
        return usenames;
    }

    public void setUsenames(List<String> usenames) {
        this.usenames = usenames;
    }

    public ListTransactionRequestBodyTransactionQueryInfo withClientAddrs(List<String> clientAddrs) {
        this.clientAddrs = clientAddrs;
        return this;
    }

    public ListTransactionRequestBodyTransactionQueryInfo addClientAddrsItem(String clientAddrsItem) {
        if (this.clientAddrs == null) {
            this.clientAddrs = new ArrayList<>();
        }
        this.clientAddrs.add(clientAddrsItem);
        return this;
    }

    public ListTransactionRequestBodyTransactionQueryInfo withClientAddrs(Consumer<List<String>> clientAddrsSetter) {
        if (this.clientAddrs == null) {
            this.clientAddrs = new ArrayList<>();
        }
        clientAddrsSetter.accept(this.clientAddrs);
        return this;
    }

    /**
     * **参数解释**: 用户发起事务请求的客户端地址。 **约束限制**: 不涉及。
     * @return clientAddrs
     */
    public List<String> getClientAddrs() {
        return clientAddrs;
    }

    public void setClientAddrs(List<String> clientAddrs) {
        this.clientAddrs = clientAddrs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTransactionRequestBodyTransactionQueryInfo that = (ListTransactionRequestBodyTransactionQueryInfo) obj;
        return Objects.equals(this.execTime, that.execTime) && Objects.equals(this.xlogQuantity, that.xlogQuantity)
            && Objects.equals(this.datnames, that.datnames) && Objects.equals(this.usenames, that.usenames)
            && Objects.equals(this.clientAddrs, that.clientAddrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(execTime, xlogQuantity, datnames, usenames, clientAddrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTransactionRequestBodyTransactionQueryInfo {\n");
        sb.append("    execTime: ").append(toIndentedString(execTime)).append("\n");
        sb.append("    xlogQuantity: ").append(toIndentedString(xlogQuantity)).append("\n");
        sb.append("    datnames: ").append(toIndentedString(datnames)).append("\n");
        sb.append("    usenames: ").append(toIndentedString(usenames)).append("\n");
        sb.append("    clientAddrs: ").append(toIndentedString(clientAddrs)).append("\n");
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
