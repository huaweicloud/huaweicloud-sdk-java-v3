package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RenameCommandResp
 */
public class RenameCommandResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flushall")

    private String flushall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flushdb")

    private String flushdb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hgetall")

    private String hgetall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keys")

    private String keys;

    public RenameCommandResp withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 命令command
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public RenameCommandResp withFlushall(String flushall) {
        this.flushall = flushall;
        return this;
    }

    /**
     * 命令flushall
     * @return flushall
     */
    public String getFlushall() {
        return flushall;
    }

    public void setFlushall(String flushall) {
        this.flushall = flushall;
    }

    public RenameCommandResp withFlushdb(String flushdb) {
        this.flushdb = flushdb;
        return this;
    }

    /**
     * 命令flushdb
     * @return flushdb
     */
    public String getFlushdb() {
        return flushdb;
    }

    public void setFlushdb(String flushdb) {
        this.flushdb = flushdb;
    }

    public RenameCommandResp withHgetall(String hgetall) {
        this.hgetall = hgetall;
        return this;
    }

    /**
     * 命令hgetall
     * @return hgetall
     */
    public String getHgetall() {
        return hgetall;
    }

    public void setHgetall(String hgetall) {
        this.hgetall = hgetall;
    }

    public RenameCommandResp withKeys(String keys) {
        this.keys = keys;
        return this;
    }

    /**
     * 命令keys
     * @return keys
     */
    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RenameCommandResp renameCommandResp = (RenameCommandResp) o;
        return Objects.equals(this.command, renameCommandResp.command)
            && Objects.equals(this.flushall, renameCommandResp.flushall)
            && Objects.equals(this.flushdb, renameCommandResp.flushdb)
            && Objects.equals(this.hgetall, renameCommandResp.hgetall)
            && Objects.equals(this.keys, renameCommandResp.keys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(command, flushall, flushdb, hgetall, keys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenameCommandResp {\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    flushall: ").append(toIndentedString(flushall)).append("\n");
        sb.append("    flushdb: ").append(toIndentedString(flushdb)).append("\n");
        sb.append("    hgetall: ").append(toIndentedString(hgetall)).append("\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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
