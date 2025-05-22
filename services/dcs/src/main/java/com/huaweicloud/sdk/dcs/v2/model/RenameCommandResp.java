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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hscan")

    private String hscan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan")

    private String scan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sscan")

    private String sscan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zscan")

    private String zscan;

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

    public RenameCommandResp withHscan(String hscan) {
        this.hscan = hscan;
        return this;
    }

    /**
     * 命令hscan
     * @return hscan
     */
    public String getHscan() {
        return hscan;
    }

    public void setHscan(String hscan) {
        this.hscan = hscan;
    }

    public RenameCommandResp withScan(String scan) {
        this.scan = scan;
        return this;
    }

    /**
     * 命令scan
     * @return scan
     */
    public String getScan() {
        return scan;
    }

    public void setScan(String scan) {
        this.scan = scan;
    }

    public RenameCommandResp withSscan(String sscan) {
        this.sscan = sscan;
        return this;
    }

    /**
     * 命令sscan
     * @return sscan
     */
    public String getSscan() {
        return sscan;
    }

    public void setSscan(String sscan) {
        this.sscan = sscan;
    }

    public RenameCommandResp withZscan(String zscan) {
        this.zscan = zscan;
        return this;
    }

    /**
     * 命令zscan
     * @return zscan
     */
    public String getZscan() {
        return zscan;
    }

    public void setZscan(String zscan) {
        this.zscan = zscan;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RenameCommandResp that = (RenameCommandResp) obj;
        return Objects.equals(this.command, that.command) && Objects.equals(this.flushall, that.flushall)
            && Objects.equals(this.flushdb, that.flushdb) && Objects.equals(this.hgetall, that.hgetall)
            && Objects.equals(this.keys, that.keys) && Objects.equals(this.hscan, that.hscan)
            && Objects.equals(this.scan, that.scan) && Objects.equals(this.sscan, that.sscan)
            && Objects.equals(this.zscan, that.zscan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(command, flushall, flushdb, hgetall, keys, hscan, scan, sscan, zscan);
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
        sb.append("    hscan: ").append(toIndentedString(hscan)).append("\n");
        sb.append("    scan: ").append(toIndentedString(scan)).append("\n");
        sb.append("    sscan: ").append(toIndentedString(sscan)).append("\n");
        sb.append("    zscan: ").append(toIndentedString(zscan)).append("\n");
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
